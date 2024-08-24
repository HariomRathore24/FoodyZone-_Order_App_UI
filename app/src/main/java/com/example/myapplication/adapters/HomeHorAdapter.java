package com.example.myapplication.adapters;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.R;
import com.example.myapplication.models.HomeHorModel;
import com.example.myapplication.models.HomeVerModel;
import com.example.myapplication.ui.home.HomeFragment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HomeHorAdapter extends RecyclerView.Adapter<HomeHorAdapter.ViewHolder> {

    UpdateVerticalRec updateVerticalRec ;
    Activity activity;
    ArrayList<HomeHorModel> list ;

    boolean check = true;
    boolean select = true;
    int row_index= -1;

    public  HomeHorAdapter(UpdateVerticalRec updateVerticalRec , Activity activity , ArrayList<HomeHorModel> list){
        this.updateVerticalRec = updateVerticalRec;
        this.activity = activity;
        this.list = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.home_horizontal_item,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, @SuppressLint("RecyclerView") int position) {
    holder.imageview.setImageResource(list.get(position).getImage());
    holder.name.setText(list.get(position).getName());

    if (check) {
        ArrayList<HomeVerModel> homeVerModels = new ArrayList<>();
        homeVerModels.add(new HomeVerModel(R.drawable.pizza1, "Pizza1", "10:30 - 23:00", "Min - $35"));
        homeVerModels.add(new HomeVerModel(R.drawable.pizza2, "Pizza2", "10:30 - 23:00", "Min - $25"));
        homeVerModels.add(new HomeVerModel(R.drawable.pizza3, "Pizza3", "10:30 - 23:00", "Min - $40"));
        homeVerModels.add(new HomeVerModel(R.drawable.pizza4, "Pizza4", "10:30 - 23:00", "Min - $30"));
        homeVerModels.add(new HomeVerModel(R.drawable.pizza5, "Pizza5", "10:30 - 23:00", "Min - $45"));

        updateVerticalRec.callback(position, homeVerModels);
        check = false;
    }
        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                row_index = position;
                notifyDataSetChanged();

                if (position ==0 ){

                    ArrayList<HomeVerModel> homeVerModels = new ArrayList<>();
                    homeVerModels.add(new HomeVerModel(R.drawable.pizza1,"Pizza1","10:30 - 23:00" ,"Min - $35"));
                    homeVerModels.add(new HomeVerModel(R.drawable.pizza2,"Pizza2","10:30 - 23:00" ,"Min - $25"));
                    homeVerModels.add(new HomeVerModel(R.drawable.pizza3,"Pizza3","10:30 - 23:00" ,"Min - $40"));
                    homeVerModels.add(new HomeVerModel(R.drawable.pizza4,"Pizza4","10:30 - 23:00" ,"Min - $30"));
                    homeVerModels.add(new HomeVerModel(R.drawable.pizza5,"Pizza5","10:30 - 23:00" ,"Min - $45"));

                    updateVerticalRec.callback(position,homeVerModels);
                }
                else if (position == 1){
                    ArrayList<HomeVerModel> homeVerModels = new ArrayList<>();
                    homeVerModels.add(new HomeVerModel(R.drawable.burger1,"Burger1","10:30 - 23:00" ,"Min - $10"));
                    homeVerModels.add(new HomeVerModel(R.drawable.burger2,"Burger2","10:30 - 23:00" ,"Min - $15"));
                    homeVerModels.add(new HomeVerModel(R.drawable.burger3,"Burger3","10:30 - 23:00" ,"Min - $20"));
                    homeVerModels.add(new HomeVerModel(R.drawable.burger4,"Burger4","10:30 - 23:00" ,"Min - $25"));
                    homeVerModels.add(new HomeVerModel(R.drawable.burger5,"Burger5","10:30 - 23:00" ,"Min - $30"));

                    updateVerticalRec.callback(position,homeVerModels);
                }
                else if (position == 2){
                    ArrayList<HomeVerModel> homeVerModels = new ArrayList<>();
                    homeVerModels.add(new HomeVerModel(R.drawable.friedpotatoes,"Fried Potato1","10:30 - 23:00" ,"Min - $10"));
                    homeVerModels.add(new HomeVerModel(R.drawable.fried2,"Fried Potato2","10:30 - 23:00" ,"Min - $15"));
                    homeVerModels.add(new HomeVerModel(R.drawable.fried3,"Fried Potato3","10:30 - 23:00" ,"Min - $17"));
                    homeVerModels.add(new HomeVerModel(R.drawable.fried4,"Fried Potato4","10:30 - 23:00" ,"Min - $20"));
                    homeVerModels.add(new HomeVerModel(R.drawable.fried5,"Fried Potato5","10:30 - 23:00" ,"Min - $30"));

                    updateVerticalRec.callback(position,homeVerModels);
                }
                else if (position == 3){
                    ArrayList<HomeVerModel> homeVerModels = new ArrayList<>();
                    homeVerModels.add(new HomeVerModel(R.drawable.ice1,"Ice Cream1","10:30 - 23:00" ,"Min - $15"));
                    homeVerModels.add(new HomeVerModel(R.drawable.ice2,"Ice Cream2","10:30 - 23:00" ,"Min - $25"));
                    homeVerModels.add(new HomeVerModel(R.drawable.ice3,"Ice Cream3","10:30 - 23:00" ,"Min - $35"));
                    homeVerModels.add(new HomeVerModel(R.drawable.ice4,"Ice Cream4","10:30 - 23:00" ,"Min - $40"));
                    homeVerModels.add(new HomeVerModel(R.drawable.ice5,"Ice Cream5","10:30 - 23:00" ,"Min - $50"));

                    updateVerticalRec.callback(position,homeVerModels);
                }
                else if (position == 4){
                    ArrayList<HomeVerModel> homeVerModels = new ArrayList<>();
                    homeVerModels.add(new HomeVerModel(R.drawable.sandwich1,"Sandwich1","10:30 - 23:00" ,"Min - $10"));
                    homeVerModels.add(new HomeVerModel(R.drawable.sandwich2,"Sandwich2","10:30 - 23:00" ,"Min - $15"));
                    homeVerModels.add(new HomeVerModel(R.drawable.sandwich3,"Sandwich3","10:30 - 23:00" ,"Min - $20"));
                    homeVerModels.add(new HomeVerModel(R.drawable.sandwich4,"Sandwich4","10:30 - 23:00" ,"Min - $25"));
                    homeVerModels.add(new HomeVerModel(R.drawable.sandwich5,"Sandwich5","10:30 - 23:00" ,"Min - $30"));

                    updateVerticalRec.callback(position,homeVerModels);
                }

            }
        });

        if(select){
            if(position == 0){
                holder.cardView.setBackgroundResource(R.drawable.change_bg);
                select  = false;
            }
        }
        else {
            if(row_index == position){
                holder.cardView.setBackgroundResource(R.drawable.change_bg);
            }
            else {
                holder.cardView.setBackgroundResource(R.drawable.default_bg);
            }
        }
    }


    @Override
    public  int getItemCount() {
        return list.size();
    }

    private int getName() {
        return 0;
    }

    private int getImage() {
        return 0;
    }



    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView imageview ;
        TextView name;
        CardView cardView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageview = itemView.findViewById(R.id.hor_img);
            name = itemView.findViewById(R.id.hor_text);
            cardView = itemView.findViewById(R.id.cardview);

        }
    }
}
