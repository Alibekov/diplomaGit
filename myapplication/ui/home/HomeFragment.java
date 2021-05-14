package com.example.myapplication.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.R;
import com.example.myapplication.ui.user.RecycleViewAdapter;

import java.util.ArrayList;

public class HomeFragment extends Fragment {

    private HomeViewModel homeViewModel;
    RecyclerView recyclerView;

    private ArrayList<String> mTime = new ArrayList<>();

    private ArrayList<String> mSubject = new ArrayList<>();

    private ArrayList<String> mInfo = new ArrayList<>();

    private ArrayList<String> mStatus = new ArrayList<>();

    private ArrayList<String> mName = new ArrayList<>();

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        homeViewModel =
                new ViewModelProvider(this).get(HomeViewModel.class);
        View root = inflater.inflate(R.layout.fragment_home, container, false);


        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity(),LinearLayoutManager.VERTICAL,false);
        recyclerView = root.findViewById(R.id.recycleview2);
        recyclerView.setLayoutManager(layoutManager);
        RecycleViewAdapter adapter = new RecycleViewAdapter(getActivity(),mTime,mSubject,mInfo,mStatus,mSubject);
        recyclerView.setAdapter(adapter);

        //LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity(),LinearLayoutManager.HORIZONTAL,false);
/*
        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity(),LinearLayoutManager.HORIZONTAL,false);
        recyclerView = root.findViewById(R.id.recycleview2);
        recyclerView.setLayoutManager(layoutManager);
        RecycleViewAdapter adapter = new RecycleViewAdapter(getActivity(),mTime,mSubject,mInfo,mName,mStatus);
        recyclerView.setAdapter(adapter);
*/
        getText();
        return root;
    }

    private void getText() {
        mName.add("New assignment: Lecture 12- \n" +
                "Human Physic ");
        mSubject.add("Mathematic");
        mTime.add("12 march , 2021");
        mInfo.add("Lorem ipsum dolor sit amet, consectetur ad");
        mStatus.add("Submitted");


        mName.add("New assignment: Lecture 12- \n" +
                "Human Physic ");
        mSubject.add("Mathematic");
        mTime.add("12 march , 2021");
        mInfo.add("Lorem ipsum dolor sit amet, consectetur ad");
        mStatus.add("Submitte");

        mName.add("New assignment: Lecture 12- \n" +
                "Human Physic ");
        mSubject.add("Mathematic");
        mTime.add("12 march , 2021");
        mInfo.add("Lorem ipsum dolor sit amet, consectetur ad");
        mStatus.add("Submitted");

    }

    public void selectedUser(){

    }


}