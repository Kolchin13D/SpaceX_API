package com.example.spacex_api.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.spacex_api.R;
import com.example.spacex_api.models.main.Launch;

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
        holder.flight_number.setText(launches.get(position).getFlight_number());
        holder.mission_name.setText(launches.get(position).getMission_name());
    }

    @Override
    public int getItemCount() {
        return launches.size();
    }

    class LaunchViewHolder extends RecyclerView.ViewHolder{

        TextView flight_number;
        TextView mission_name;

        public LaunchViewHolder(@NonNull View itemView) {
            super(itemView);

            flight_number = itemView.findViewById(R.id.flight_number);
            mission_name = itemView.findViewById(R.id.mission_name);
        }
    }

    public LaunchAdapter(ArrayList<Launch> launches) {
        this.launches = launches;
    }

}
