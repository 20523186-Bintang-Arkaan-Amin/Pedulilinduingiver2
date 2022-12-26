package com.bintang.pedulilinduingiver2.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.bintang.pedulilinduingiver2.R;
import com.bintang.pedulilinduingiver2.data.DataHorizontal;
import com.bintang.pedulilinduingiver2.data.DataVertical;
import com.bintang.pedulilinduingiver2.data.DataHorizontal;
import com.bumptech.glide.Glide;

import java.util.List;

public class AdapterHorizontalNoScroll extends RecyclerView.Adapter<AdapterHorizontalNoScroll.viewHolder>{

    private List<DataHorizontal> dataHorizontals;
    private Context context;

    public AdapterHorizontalNoScroll(List<DataHorizontal> dataHorizontals, Context context) {
        this.dataHorizontals = dataHorizontals;
        this.context = context;
    }



    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_horizontal_no_scroll,parent,false);
        final viewHolder viewHolder = new viewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {
        final DataHorizontal items= dataHorizontals.get(position);

        holder.title.setText(items.getTitle());

        Glide.with(context)
                .load(items.getImg())
                .into(holder.img);

        holder.layout.setOnClickListener(view -> {
            Toast.makeText(context, items.getTitle(), Toast.LENGTH_SHORT).show();
        });
    }

    @Override
    public int getItemCount() {
        return dataHorizontals.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder {

        private TextView title;
        private ImageView img;
        private ConstraintLayout layout;

        public viewHolder(@NonNull View itemView) {
            super(itemView);
            title = (TextView) itemView.findViewById(R.id.title);
            img = (ImageView) itemView.findViewById(R.id.img);
            layout = (ConstraintLayout) itemView.findViewById(R.id.layout);


        }
    }
}