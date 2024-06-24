package com.example.spacex_api.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.spacex_api.R;
import com.example.spacex_api.models.Launch;

import java.util.ArrayList;

public class LaunchAdapter extends RecyclerView.Adapter<LaunchAdapter.LaunchViewHolder>{

    private ArrayList<Launch> launches;

    @NonNull
    @Override
    public LaunchViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.recycleritem, parent, false);
        return new LaunchViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull LaunchViewHolder holder, int position) {
        holder.YEAR.setText(launches.get(position).getLaunchYear());
        holder.NUMBER.setText(launches.get(position).getFlightNumber());
    }

    @Override
    public int getItemCount() {
        return launches.size();
    }

    class LaunchViewHolder extends RecyclerView.ViewHolder{

        TextView YEAR;
        TextView NUMBER;

        public LaunchViewHolder(@NonNull View itemView) {
            super(itemView);

            YEAR = itemView.findViewById(R.id.Year);
            NUMBER = itemView.findViewById(R.id.Launch);
        }
    }

    public LaunchAdapter(ArrayList<Launch> launches) {
        this.launches = launches;
    }

}
