package com.example.myapplication.ui.dashboard;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.example.myapplication.R;
import com.example.myapplication.ui.home.HomeFragment;

public class DashboardFragment extends Fragment {

    private DashboardViewModel dashboardViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        dashboardViewModel =
                new ViewModelProvider(this).get(DashboardViewModel.class);
        View root = inflater.inflate(R.layout.fragment_dashboard, container, false);



        ListView listView = root.findViewById(R.id.listView);

        CustomAdapter customAdapter = new CustomAdapter();

        listView.setAdapter(customAdapter);
        /*final TextView textView = root.findViewById(R.id.text_dashboard);
        dashboardViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;

         */
        return root;
    }

    class CustomAdapter extends BaseAdapter {

        private final int[] IMAGES = {R.drawable.us,R.drawable.use,R.drawable.use,R.drawable.use};

        String [] kabinet = {"class 112","class 302","class 415","SportHAll"};

        String [] subject = {"Mathematic","Russian","Biology","Physical education"};

        String [] time = {"9:00-10:00","10:00 AM — 11:00 AM","11:00 AM — 01:00 PM","01:00 PM — 02:00 PM"};

        String [] name = {"Kenzhe Zhaliyeva","Asiya Akhmetovna","Zhanna Arkadiyevna","Anna Petrovna"};
        int [] photo = {R.drawable.per,R.drawable.vtoraya,R.drawable.tretya,R.drawable.chet};

        @Override
        public int getCount() {
            return IMAGES.length;
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            view= getLayoutInflater().inflate(R.layout.custom_dashboard,null);

            ImageView imageView = view.findViewById(R.id.image_student);
            ImageView imageView2 = view.findViewById(R.id.image_of_subject);
            TextView textView_kabinet = view.findViewById(R.id.text_class);
            TextView textView_time = view.findViewById(R.id.text_time);
            TextView textView_subject = view.findViewById(R.id.text_subject);
            TextView textView_name = view.findViewById(R.id.text_name);


            imageView.setImageResource(IMAGES[i]);
            imageView2.setImageResource(photo[i]);
            textView_kabinet.setText(kabinet[i]);
            textView_subject.setText(subject[i]);
            textView_time.setText(time[i]);
            textView_name.setText(name[i]);



            return view;
        }
    }
}