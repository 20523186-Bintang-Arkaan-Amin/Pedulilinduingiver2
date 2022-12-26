package com.bintang.pedulilinduingiver2.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.bintang.pedulilinduingiver2.DetailActivity;
import com.bintang.pedulilinduingiver2.R;
import com.bintang.pedulilinduingiver2.data.DataVertical;
import com.bumptech.glide.Glide;

import java.util.List;

public class AdapterHorizontal extends RecyclerView.Adapter<AdapterHorizontal.viewHolder> {

    private List<DataVertical> dataVerticals;
    private Context context;

    public AdapterHorizontal(List<DataVertical> dataVerticals, Context context) {
        this.dataVerticals = dataVerticals;
        this.context = context;
    }


    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_horizontal,parent,false);
        final viewHolder viewHolder = new viewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {
        final DataVertical items= dataVerticals.get(position);

        holder.title.setText(items.getTitle());
        holder.desc.setText(items.getDesc());

        Glide.with(context)
                .load(items.getImg())
                .into(holder.img);

        holder.layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                context.startActivity(new Intent(context, DetailActivity.class)
                        //berfungsi untuk melempar data
                        .putExtra("title",items.getTitle())
                        .putExtra("desc", items.getDesc())
                        .putExtra("img", items.getImg())
                );
            }
        });

    }

    @Override
    public int getItemCount() {
        return dataVerticals.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder {

        private TextView title, desc;
        private ImageView img;
        private ConstraintLayout layout;

        public viewHolder(@NonNull View itemView) {
            super(itemView);
            title = (TextView) itemView.findViewById(R.id.title);
            desc = (TextView) itemView.findViewById(R.id.desc);
            img = (ImageView) itemView.findViewById(R.id.img);
            layout = (ConstraintLayout) itemView.findViewById(R.id.layout);


        }
    }
}
