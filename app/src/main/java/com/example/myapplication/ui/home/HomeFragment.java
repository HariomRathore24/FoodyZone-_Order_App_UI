package com.example.myapplication.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.R;
import com.example.myapplication.adapters.HomeHorAdapter;
import com.example.myapplication.adapters.HomeVerAdapter;
import com.example.myapplication.adapters.UpdateVerticalRec;
import com.example.myapplication.models.HomeHorModel;
import com.example.myapplication.models.HomeVerModel;

import java.util.ArrayList;
import java.util.List;


public class HomeFragment extends Fragment implements UpdateVerticalRec {
    RecyclerView homeHorizontalRec , homeVerticalRec ;
    ArrayList<HomeHorModel> homeHorModelList ;
    HomeHorAdapter homeHorAdapter ;

////////////////////////////Vertical
    ArrayList<HomeVerModel> homeVerModelList;
    HomeVerAdapter homeVerAdapter ;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.home_fragment,container,false);

        homeHorizontalRec = root.findViewById(R.id.home_hor_rec);

        homeVerticalRec = root.findViewById(R.id.home_ver_rec);

        //////////////////////////////////////Horizontal Recycle
        homeHorModelList = new ArrayList<>();


        homeHorModelList.add(new HomeHorModel(R.drawable.pizzaimg ,"Pizza"));
        homeHorModelList.add(new HomeHorModel(R.drawable.hamburger ,"Burger"));
        homeHorModelList.add(new HomeHorModel(R.drawable.friedpotatoes ,"Fries"));
        homeHorModelList.add(new HomeHorModel(R.drawable.icecream ,"Ice Cream"));
        homeHorModelList.add(new HomeHorModel(R.drawable.sandwich ,"Sandwich"));

        homeHorAdapter = new HomeHorAdapter(this, getActivity() , homeHorModelList);
        homeHorizontalRec.setAdapter(homeHorAdapter);
        homeHorizontalRec.setLayoutManager(new LinearLayoutManager(getActivity(),RecyclerView.HORIZONTAL,false));
        homeHorizontalRec.setHasFixedSize(true);
        homeHorizontalRec.setNestedScrollingEnabled(true);

/////////////////////////////////////Vertical Recycle
        homeVerModelList = new ArrayList<>();

        homeVerAdapter = new HomeVerAdapter(getActivity(),homeVerModelList);
        homeVerticalRec.setAdapter(homeVerAdapter);
        homeVerticalRec.setLayoutManager(new LinearLayoutManager(getActivity(),RecyclerView.VERTICAL,false));
        return root;
    }


    @Override
    public void callback(int position, ArrayList<HomeVerModel> list) {

        homeVerAdapter = new HomeVerAdapter(getContext(),list);
        homeVerAdapter.notifyDataSetChanged();
        homeVerticalRec.setAdapter(homeVerAdapter);
    }
}