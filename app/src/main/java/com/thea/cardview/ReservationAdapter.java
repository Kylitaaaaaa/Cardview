package com.thea.cardview;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


import java.util.ArrayList;
import java.util.List;


/**
 * Created by Thea on 01/07/2017.
 */

public class ReservationAdapter extends RecyclerView.Adapter<ReservationAdapter.MyViewHolder> {

    private List<Reservation> reservationList = new ArrayList<>();

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView sectionMain, sectionSub;

        public MyViewHolder(View view) {
            super(view);
            sectionMain = (TextView) view.findViewById(R.id.nameRequester);
            sectionSub = (TextView) view.findViewById(R.id.duration);

        }
    }


    public ReservationAdapter(List<Reservation> reservationList) {
        this.reservationList = reservationList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.card_layout, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Reservation res = reservationList.get(position);
        //will change once user info is clear
        holder.sectionMain.setText(res.getRequester());
        holder.sectionSub.setText(res.getDuration() + " hours");
    }

    @Override
    public int getItemCount() {
        return reservationList.size();
    }
}