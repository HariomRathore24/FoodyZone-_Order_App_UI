package com.example.myapplication.ui.dailymeal;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.R;
import com.example.myapplication.adapters.DailyMealAdapter;
import com.example.myapplication.models.DailyMealModel;

import java.util.ArrayList;
import java.util.List;


public class DailyMealFragment extends Fragment {

    RecyclerView recyclerView;
    List<DailyMealModel> dailyMealModels;
    DailyMealAdapter dailyMealAdapter;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
       View root = inflater.inflate(R.layout.daily_meal_fragment,container,false);

       recyclerView = root.findViewById(R.id.daily_meal_rec);
       recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
       dailyMealModels = new ArrayList<>();

       dailyMealModels.add(new DailyMealModel(R.drawable.brealfast,"Breakfast","30% OFF","Description Description","breakfast"));
        dailyMealModels.add(new DailyMealModel(R.drawable.lunch,"Lunch","25% OFF","Description Description","lunch"));
        dailyMealModels.add(new DailyMealModel(R.drawable.dinner,"Dinner","35% OFF","Description Description", "dinner"));
        dailyMealModels.add(new DailyMealModel(R.drawable.sweets,"Sweets","30% OFF","Description Description","sweets"));
        dailyMealModels.add(new DailyMealModel(R.drawable.coffee,"Coffee","20% OFF","Description Description","coffee"));

        dailyMealAdapter = new DailyMealAdapter(getContext(),dailyMealModels);
        recyclerView.setAdapter(dailyMealAdapter);
        dailyMealAdapter.notifyDataSetChange();
        return root;
    }


}