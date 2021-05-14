package com.example.myapplication.ui.user;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.util.Log;

import com.example.myapplication.R;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {


    private static final String TAG = "RecyclerViewAdapter";
    private ArrayList<String> aTema = new ArrayList<>();

    private ArrayList<String> aUrok = new ArrayList<>();

    private ArrayList<String> aInfo = new ArrayList<>();

    private Context aContext;

    public Adapter(ArrayList<String> aTema, ArrayList<String> aUrok, ArrayList<String> aInfo, Context aContext) {
        this.aTema = aTema;
        this.aUrok = aUrok;
        this.aInfo = aInfo;
        this.aContext = aContext;
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

        holder.tema.setText(aTema.get(position));

        holder.urok.setText(aUrok.get(position));

        holder.info.setText(aInfo.get(position));


    }

    @Override
    public int getItemCount() {
        return aInfo.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{


        TextView tema;
        TextView urok;
        TextView info;

        public ViewHolder(View itemView) {
            super(itemView);
            tema = itemView.findViewById(R.id.tema);
            urok = itemView.findViewById(R.id.urok);
            info = itemView.findViewById(R.id.info);
        }
    }
    }
