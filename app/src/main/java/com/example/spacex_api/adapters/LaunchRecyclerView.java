package com.example.spacex_api.adapters;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;

import com.example.spacex_api.R;
import com.example.spacex_api.databinding.LaunchListItemBinding;
import com.example.spacex_api.models.main.Launch;
import com.example.spacex_api.view.LaunchActivity;

import java.util.ArrayList;

public class LaunchRecyclerView extends RecyclerView.Adapter<LaunchRecyclerView.LaunchViewHolder> {

    private Context context;
    private OnItemClickListener listener;
    private ArrayList<Launch> launches;

    public LaunchRecyclerView(Context context, ArrayList<Launch> launches) {
        this.context = context;
        this.launches = launches;
    }

    @NonNull
    @Override
    public LaunchViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LaunchListItemBinding launchListItemBinding = DataBindingUtil.inflate
                (LayoutInflater.from(
                                parent.getContext()),
                        R.layout.launch_list_item,
                        parent,
                        false);

        return new LaunchViewHolder(launchListItemBinding);
    }

    @Override
    public void onBindViewHolder(@NonNull LaunchViewHolder holder, int position) {

        Launch launch = launches.get(position);
        holder.launchListItemBinding.setLaunch(launch);

    }

    @Override
    public int getItemCount() {
        return launches.size();
    }

    public Launch getSelectedID(int position) {
        if (launches != null) {
            if (launches.size() > 0) {
                return launches.get(position);
            }
        }
        return null;
    }

    // View Holder Class
    public class LaunchViewHolder extends RecyclerView.ViewHolder {

        private LaunchListItemBinding launchListItemBinding;

        public LaunchViewHolder(LaunchListItemBinding launchListItemBinding) {
            super(launchListItemBinding.getRoot());
            this.launchListItemBinding = launchListItemBinding;

            launchListItemBinding.getRoot().setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int position = getAdapterPosition();

                    if (position != RecyclerView.NO_POSITION) {
                        Launch selectedLaunch = launches.get(position);

                        Intent intent = new Intent(context, LaunchActivity.class);

                        intent.putExtra("img", selectedLaunch.links.mission_patch);
                        intent.putExtra("launch", selectedLaunch);
                        intent.putExtra("num", selectedLaunch.flight_number);
                        intent.putExtra("name", selectedLaunch.mission_name);
                        intent.putExtra("details", selectedLaunch.details);

                        context.startActivity(intent);
                    }
                }
            });
        }
    }

    public interface OnItemClickListener{
        void onItemClick(Launch launch);
    }

    public void  setListener(OnItemClickListener listener){
        this.listener = listener;
    }
}
