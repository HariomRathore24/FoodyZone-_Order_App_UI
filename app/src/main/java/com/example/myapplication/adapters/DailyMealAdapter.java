package com.example.myapplication.adapters;

import static com.example.myapplication.R.layout.daily_meal_item;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.R;
import com.example.myapplication.activities.DetailedDailyMealActivity;
import com.example.myapplication.models.DailyMealModel;

import java.io.ByteArrayOutputStream;
import java.util.List;

public class DailyMealAdapter extends RecyclerView.Adapter<DailyMealAdapter.ViewHolder> {

  List<DailyMealModel> list;
  Context context;

  public DailyMealAdapter(Context context , List<DailyMealModel> list){
      this.context =context;
      this.list = list;
  }
    @NonNull
    @Override
    public DailyMealAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       return  new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(daily_meal_item ,parent ,false));

    }

    @Override
    public void onBindViewHolder(@NonNull DailyMealAdapter.ViewHolder holder, @SuppressLint("RecyclerView") int position) {

      holder.imageView.setImageResource(list.get(position).getImage());
        holder.name.setText(list.get(position).getName());
        holder.discount.setText(list.get(position).getDiscount());
        holder.description.setText(list.get(position).getDescription());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context , DetailedDailyMealActivity.class);
                intent.putExtra("type",list.get(position).getDescription());
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return list.size() ;
    }

    public void notifyDataSetChange() {
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
      ImageView imageView;
      TextView name, description , discount;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.imageview);
            name = itemView.findViewById(R.id.dinnertext);
            description = itemView.findViewById(R.id.textview10);
            discount = itemView.findViewById(R.id.discounttextview);

        }
    }
}
