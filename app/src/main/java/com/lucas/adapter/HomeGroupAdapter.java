package com.lucas.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.lucas.R;
import com.lucas.model.domain.Group;

import java.util.List;

public class HomeGroupAdapter extends RecyclerView.Adapter<HomeGroupAdapter.GroupHolder> {

    private List<Group> groups;

    public HomeGroupAdapter(List<Group> groups) {
        this.groups = groups;
    }

    @NonNull
    @Override
    public GroupHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new GroupHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_group, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull GroupHolder holder, int position) {
      holder.bindView(groups.get(position));
    }

    @Override
    public int getItemCount() {
        return groups.size();
    }

    public class GroupHolder extends RecyclerView.ViewHolder {

        TextView text;
        ImageView img;

        public GroupHolder(@NonNull View itemView) {
            super(itemView);

            text = itemView.findViewById(R.id.txt_namegrupo);
            img = itemView.findViewById(R.id.img_direction);
        }

        public void bindView(Group group){
            Integer acount = group.getUsers().size();
            text.setText(group.getName() + "( "+ acount + " )");
        }

    }

}
