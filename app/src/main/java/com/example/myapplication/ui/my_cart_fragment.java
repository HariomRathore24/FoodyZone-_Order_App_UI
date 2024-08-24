package com.example.myapplication.ui;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.myapplication.R;
import com.example.myapplication.adapters.CartAdapter;
import com.example.myapplication.models.CartModel;

import java.util.ArrayList;
import java.util.List;


public class my_cart_fragment extends Fragment {

List<CartModel> list;
CartAdapter cartAdapter;
RecyclerView recyclerView;


    public my_cart_fragment() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
         View view = inflater.inflate(R.layout.fragment_my_cart_fragment, container, false);

         recyclerView = view.findViewById(R.id.cart_rec);
         recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
         list = new ArrayList<>();

         list.add(new CartModel(R.drawable.pizza1,"Order1","60","4.5","Pizza"));
        list.add(new CartModel(R.drawable.sandwich3,"Order2","70","4.7","Sandwich"));
        list.add(new CartModel(R.drawable.ice2,"Order3","90","4.4","Ice Cream"));
        list.add(new CartModel(R.drawable.burger3,"Order4","100","4.3","Burger"));
        list.add(new CartModel(R.drawable.coffee2,"Order5","120","4.8","Coffee"));
        list.add(new CartModel(R.drawable.sweets1,"Order6","160","4.6","Sweets"));
        list.add(new CartModel(R.drawable.breakfast1,"order7","80","4.4","BreakFast"));
        list.add(new CartModel(R.drawable.lunch3,"Order8","120","4.5","Lunch"));
        list.add(new CartModel(R.drawable.dinner4,"Order9","300","5.0","Dinner"));

        cartAdapter = new CartAdapter(list);
        recyclerView.setAdapter(cartAdapter);
        return view;
    }
}