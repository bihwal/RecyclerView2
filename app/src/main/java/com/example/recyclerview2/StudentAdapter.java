package com.example.recyclerview2;

import android.content.Context;
import android.provider.ContactsContract;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class StudentAdapter extends RecyclerView.Adapter<StudentAdapter.StudentViewHolder>{


    Context mContext;
    List<Students> studentsList;

    public StudentAdapter(Context mContext, List<Students> contactsList) {
        this.mContext = mContext;
        this.studentsList = contactsList;
    }

    @NonNull
    @Override
    public StudentViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.activity_main,parent,false);
        return new StudentViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull StudentViewHolder holder, int position) {
        Students students=studentsList.get(position);
        holder.imgProfile.setImageResource(students.getImgProfile());
        holder.tvName.setText(students.getName());
        holder.tvAddress.setText(students.getAddress());
        holder.tvAge.setText(students.getAge());
        holder.tvGender.setText(students.getGender());
    }

    @Override
    public int getItemCount() {
        return studentsList.size();
    }

    public class StudentViewHolder extends RecyclerView.ViewHolder{
        ImageView imgProfile;
        TextView tvName,tvGender,tvAddress,tvAge;

        public StudentViewHolder(@NonNull View itemView){
            super(itemView);
            imgProfile=itemView.findViewById(R.id.imgProfile);
            tvName=itemView.findViewById(R.id.tvName);
            tvAge=itemView.findViewById(R.id.tvAge);
            tvGender=itemView.findViewById(R.id.tvGender);
            tvAddress=itemView.findViewById(R.id.tvAddress);
        }
    }

}
