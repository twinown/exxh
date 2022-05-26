package com.example.exhaustwear.forpager;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.bumptech.glide.Glide;
import com.example.exhaustwear.R;
import java.util.List;

public class VpAdapterStuff extends RecyclerView.Adapter<VpAdapterStuff.ViewHolder> {

    Context context;
    List<VpModelStuff> vpModelStuff;
    ViewPager2 viewPager2;




    public VpAdapterStuff(Context context, List<VpModelStuff> vpModelStuff, ViewPager2 viewPager2) {
        this.context = context;
        this.vpModelStuff = vpModelStuff;
        this.viewPager2 = viewPager2;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new VpAdapterStuff.ViewHolder(
                LayoutInflater.from(parent.getContext()).inflate(R.layout.vp_container_stuff, parent, false));

    }


    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Glide.with(context).load(vpModelStuff.get(position).getImg_url()).into(holder.imageView);
      /*  if (position == vpModelStuff.size() -2){
            viewPager2.post(runnable);
        }*/
    }

    @Override
    public int getItemCount() {
        return vpModelStuff.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;

        ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.container_vp_stuff);
        }

    }

    //for infinite slider
 /*   private final Runnable runnable = new Runnable() {
        @SuppressLint("NotifyDataSetChanged")
        @Override
        public void run() {
            vpModelStuff.addAll(vpModelStuff);
            notifyDataSetChanged();

        }
    };*/


}