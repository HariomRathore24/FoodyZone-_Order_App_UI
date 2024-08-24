package com.example.myapplication.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ImageView;

import com.example.myapplication.R;
import com.example.myapplication.adapters.DetailedDailyAdapter;
import com.example.myapplication.models.DetailedDailyModel;

import java.util.ArrayList;
import java.util.List;

public class DetailedDailyMealActivity extends AppCompatActivity {

RecyclerView recyclerView;
List<DetailedDailyModel> detailedDailyModellist;
DetailedDailyAdapter dailyAdapter ;
ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detailed_daily_meal);

        String type = getIntent().getStringExtra("type");

        recyclerView = findViewById(R.id.detailed_rec);

        imageView = findViewById(R.id.detailed_image);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        detailedDailyModellist = new ArrayList<>();
        dailyAdapter = new DetailedDailyAdapter(detailedDailyModellist);
        recyclerView.setAdapter(dailyAdapter);

        if(type != null && type.equalsIgnoreCase("breakfast")){

            detailedDailyModellist.add(new DetailedDailyModel(R.drawable.breakfast1,"Breakfast1","description","4.4","40","10am to 9pm"));
            detailedDailyModellist.add(new DetailedDailyModel(R.drawable.breakfast2,"Breakfast2","description","4.4","60","10am to 9pm"));
            detailedDailyModellist.add(new DetailedDailyModel(R.drawable.breakfast3,"Breakfast3","description","4.4","80","10am to 9pm"));

            dailyAdapter.notifyDataSetChanged();
        }
        if(type != null && type.equalsIgnoreCase("sweets")){

            imageView.setImageResource(R.drawable.sweets);
            detailedDailyModellist.add(new DetailedDailyModel(R.drawable.sweets1,"Sweets1","description","4.4","120","10am to 9pm"));
            detailedDailyModellist.add(new DetailedDailyModel(R.drawable.sweets2,"Sweets2","description","4.4","150","10am to 9pm"));
            detailedDailyModellist.add(new DetailedDailyModel(R.drawable.sweets3,"Sweets3","description","4.4","200","10am to 9pm"));

            dailyAdapter.notifyDataSetChanged();
        }
        if(type != null && type.equalsIgnoreCase("lunch")){

            imageView.setImageResource(R.drawable.lunch);
            detailedDailyModellist.add(new DetailedDailyModel(R.drawable.lunch1,"Lunch1","description","4.4","60","11am to 4pm"));
            detailedDailyModellist.add(new DetailedDailyModel(R.drawable.lunch2,"Lunch2","description","4.4","80","11am to 4pm"));
            detailedDailyModellist.add(new DetailedDailyModel(R.drawable.lunch3,"Lunch3","description","4.4","100","11am to 4pm"));
            detailedDailyModellist.add(new DetailedDailyModel(R.drawable.lunch4,"Lunch4","description","4.4","120","11am to 4pm"));

            dailyAdapter.notifyDataSetChanged();
        }
        if(type != null && type.equalsIgnoreCase("dinner")){

            imageView.setImageResource(R.drawable.dinner);
            detailedDailyModellist.add(new DetailedDailyModel(R.drawable.dinner1,"Dinner1","description","4.4","150","7pm to 11:30pm"));
            detailedDailyModellist.add(new DetailedDailyModel(R.drawable.dinner2,"Dinner2","description","4.4","200","7pm to 11:30pm"));
            detailedDailyModellist.add(new DetailedDailyModel(R.drawable.dinner3,"Dinner3","description","4.4","350","7pm to 11:30pm"));
            detailedDailyModellist.add(new DetailedDailyModel(R.drawable.dinner4,"Dinner4","description","4.4","400","7pm to 11:30pm"));

            dailyAdapter.notifyDataSetChanged();
        }
        if(type != null && type.equalsIgnoreCase("coffee")){

            imageView.setImageResource(R.drawable.coffee);
            detailedDailyModellist.add(new DetailedDailyModel(R.drawable.coffee1,"Coffee1","description","4.4","70","6am to 6am"));
            detailedDailyModellist.add(new DetailedDailyModel(R.drawable.coffee2,"Coffee2","description","4.4","50","6am to 6am"));
            detailedDailyModellist.add(new DetailedDailyModel(R.drawable.coffee3,"Coffee3","description","4.4","100","6am to 6am"));
            detailedDailyModellist.add(new DetailedDailyModel(R.drawable.coffee4,"Coffee4","description","4.4","150","6am to 6am"));
            dailyAdapter.notifyDataSetChanged();
        }
    }
}