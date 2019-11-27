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

    public StudentAdapter(Context mContext, List<Students> studentsList) {
        this.mContext = mContext;
        this.studentsList = studentsList;
    }

    @NonNull
    @Override
    public StudentViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.student_layout,parent,false);
        return new StudentViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull StudentViewHolder holder, int position) {
        Students students=studentsList.get(position);

        holder.tvName.setText(students.getName());
        holder.tvAge.setText(students.getAge());
        holder.tvAddress.setText(students.getAddress());
        holder.tvGender.setText(students.getGender());
        holder.imgProfile.setImageResource(students.getImgProfile());
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

            tvName=itemView.findViewById(R.id.tvName);
            tvAge=itemView.findViewById(R.id.tvAge);
            tvAddress=itemView.findViewById(R.id.tvAddress);
            tvGender=itemView.findViewById(R.id.tvGender);
            imgProfile=itemView.findViewById(R.id.imgProfile);
        }
    }

}
