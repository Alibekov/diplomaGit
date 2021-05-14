package com.example.myapplication.ui.home;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.TextView;

import com.example.myapplication.R;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {

    private static final String TAG = "RecyclerViewAdapter";


    private ArrayList<String> mTime = new ArrayList<>();

    private ArrayList<String> mSubject = new ArrayList<>();

    private ArrayList<String> mName = new ArrayList<>();

    private ArrayList<String> mInfo = new ArrayList<>();
    private ArrayList<String> mStatus = new ArrayList<>();

    private Context mContext;

    public RecyclerViewAdapter( Context mContext,ArrayList<String> mTime, ArrayList<String> mSubject, ArrayList<String> mName, ArrayList<String> mInfo, ArrayList<String> mStatus) {
        this.mTime = mTime;
        this.mSubject = mSubject;
        this.mName = mName;
        this.mInfo = mInfo;
        this.mStatus = mStatus;
        this.mContext = mContext;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.custom_layout ,parent,false);
        //Log.d(TAG,"called");
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.subject.setText(mSubject.get(position));

        holder.time.setText(mTime.get(position));

        holder.name.setText(mName.get(position));

        holder.info.setText(mInfo.get(position));
        holder.status.setText(mStatus.get(position));
    }

    @Override
    public int getItemCount() {
        return mInfo.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView time;
        TextView subject;
        TextView name;
        TextView info;
        TextView status;

        public ViewHolder(View itemView) {
            super(itemView);
            time = itemView.findViewById(R.id.time);
            subject = itemView.findViewById(R.id.subject);
            name = itemView.findViewById(R.id.name);
            info = itemView.findViewById(R.id.info);
            status = itemView.findViewById(R.id.status);
        }
    }
}
