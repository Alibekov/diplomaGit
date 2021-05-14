package com.example.myapplication.ui.user;

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

import java.util.ArrayList;

public class UserFragment extends Fragment {
    RecyclerView recyclerView;

    private ArrayList<String> mTime = new ArrayList<>();

    private ArrayList<String> mSubject = new ArrayList<>();

    private ArrayList<String> mTeacher = new ArrayList<>();

    private ArrayList<String> mTime_subject = new ArrayList<>();

    private UserViewModel userViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        userViewModel =
                new ViewModelProvider(this).get(UserViewModel.class);
        View root = inflater.inflate(R.layout.fragment_user, container, false);


        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity(),LinearLayoutManager.HORIZONTAL,false);
        recyclerView = root.findViewById(R.id.recycleview);
        recyclerView.setLayoutManager(layoutManager);
        RecycleViewAdapter adapter = new RecycleViewAdapter(getActivity(), mTime, mTime,mSubject,mTeacher,mTime_subject);
        recyclerView.setAdapter(adapter);


        getText();
        /*final TextView textView = root.findViewById(R.id.text_user);
        userViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });

         */
        return root;
    }

    private void getText(){
        mSubject.add("Math");
        mTeacher.add("By :  Kenzhe Zhaliyeva");
        mTime_subject.add("13 may | 9:00 AM");
        mTime.add("30min");


        mSubject.add("Math");
        mTeacher.add("By :  Kenzhe Zhaliyeva");
        mTime_subject.add("13 may | 9:00 AM");
        mTime.add("30min");

        mSubject.add("Math");
        mTeacher.add("By :  Kenzhe Zhaliyeva");
        mTime_subject.add("13 may | 9:00 AM");
        mTime.add("30min");
    }
}