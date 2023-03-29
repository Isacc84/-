package com.example.retu;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.List;
import java.util.Random;

public class MemoAdapter1 extends RecyclerView.Adapter<MemoAdapter1.ViewHolder> {
    private Context mcontext;
    private List<MemoBean1> arr1;
    private MyDatabaseHelper mhelper1;
    private SQLiteDatabase db;
    private Context Context1;
    public  MemoAdapter1(Context mcontext,List<MemoBean1>arr1) {
        this.mcontext = mcontext;
        this.arr1 = arr1;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        View view= LayoutInflater.from(mcontext).inflate(R.layout.activiay_item,parent,false);
        MemoAdapter1.ViewHolder mholder=new MemoAdapter1.ViewHolder(view);
        return mholder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder mholder, final int i) {
        final MemoBean1 memoBean = arr1.get(i);
        String caobi,ribi;
        ribi = "申请人：" + memoBean.getName();
        caobi = "银川能源学院-信息传媒学院-数据科学与大数据技术-" + memoBean.getBanj();
        mholder.item_time.setText(memoBean.getTime());
        mholder.item_name.setText(ribi);
        mholder.item_banj.setText(caobi);
        mholder.item_leix.setText(memoBean.getLeix());
        mholder.item_cash.setText(memoBean.getCash());
        mholder.item_kais.setText(memoBean.getKais());
        mholder.item_jies.setText(memoBean.getJies());
        mholder.item_liyo.setText(memoBean.getLiyo());
        mholder.item_qinx.setText(memoBean.getTime());
        Glide.with(mcontext).load(memoBean.getFuji()).into(mholder.item_fuji);
        Random random = new Random();
        int color = Color.argb(255,255,255,255);
        GradientDrawable gradientDrawable = new  GradientDrawable();
        gradientDrawable.setShape(GradientDrawable.RECTANGLE);
        gradientDrawable.setCornerRadius(20);
        gradientDrawable.setStroke(4,Color.argb(160,228,229,233));
        gradientDrawable.setColor(color);
        mholder.item_layout.setBackground(gradientDrawable);


    }

    @Override
    public int getItemCount() {
        return 1;
    }
    public static class ViewHolder extends RecyclerView.ViewHolder{
        TextView item_name,item_banj,item_time,item_leix,item_cash,item_kais,item_jies,item_liyo,item_tony,item_qinx;
        ImageView item_fuji,item_cnss;
        LinearLayout item_layout;
        public ViewHolder(@NonNull View itemView){
            super(itemView);
            item_qinx = itemView.findViewById(R.id.textView30);
            item_tony = itemView.findViewById(R.id.textView31);
            item_fuji = itemView.findViewById(R.id.ImaeView24);
            item_cnss = itemView.findViewById(R.id.imageView11);
            item_fuji = itemView.findViewById(R.id.ImaeView24);
            item_liyo = itemView.findViewById(R.id.textView24);
            item_jies = itemView.findViewById(R.id.textView22);
            item_kais = itemView.findViewById(R.id.textView21);
            item_cash = itemView.findViewById(R.id.textView20);
            item_leix = itemView.findViewById(R.id.textView19);
            item_time = itemView.findViewById(R.id.textView17);
            item_banj = itemView.findViewById(R.id.textView16);
            item_name = itemView.findViewById(R.id.textView9);
            item_layout=itemView.findViewById(R.id.layout_item1);
        }
    }
}
