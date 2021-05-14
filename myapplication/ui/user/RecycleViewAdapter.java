package com.example.myapplication.ui.user;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.util.Log;

import com.example.myapplication.R;
import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class RecycleViewAdapter extends RecyclerView.Adapter<RecycleViewAdapter.ViewHolder> {


    private static final String TAG = "RecyclerViewAdapter";


    private ArrayList<String> mTime = new ArrayList<>();

    private ArrayList<String> mSubject = new ArrayList<>();

    private ArrayList<String> mTeacher = new ArrayList<>();

    private ArrayList<String> mTime_subject = new ArrayList<>();

    private Context mContext;
    private SelectedUser selectedUser;
    TextView more;



    public RecycleViewAdapter(Context mContext, ArrayList<String> time, ArrayList<String> mTeacher, ArrayList<String> mSubject, ArrayList<String> mTime_subject, ArrayList<String> mTime) {
        this.mTime = mTime;
        this.mSubject = mSubject;
        this.mTeacher = mTeacher;
        this.mTime_subject = mTime_subject;
        this.mContext = mContext;
        this.selectedUser = selectedUser;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_list,parent,false);
        Log.d(TAG,"called");
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        holder.subject.setText(mSubject.get(position));

        holder.time.setText(mTime.get(position));

        holder.teacher.setText(mTeacher.get(position));

        holder.time_subject.setText(mTime_subject.get(position));

    }

    @Override
    public int getItemCount() {
        return mTime.size();
    }


    public interface SelectedUser{
        void selectedUser();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{


        TextView time;
        TextView subject;
        TextView teacher;
        TextView time_subject;

        public ViewHolder(View itemView) {
            super(itemView);
            time = itemView.findViewById(R.id.time);
            subject = itemView.findViewById(R.id.subject);
            teacher = itemView.findViewById(R.id.teacher);
            time_subject = itemView.findViewById(R.id.time_subject);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Context context = view.getContext();
                    Intent intent = new Intent(context, StudentAll.class);
                    context.startActivity(intent);
                }
            });




        }
    }

}
