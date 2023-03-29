package com.example.retu;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;


import java.util.List;
import java.util.Random;

public class MemoAdapter extends RecyclerView.Adapter<MemoAdapter.ViewHolder>{
    private Context mcontext;
    private List<MemoBean>arr1;
    private MyDatabaseHelper mhelper1;
    private SQLiteDatabase db;
    private Context Context1;
    public  MemoAdapter(Context mcontext, List<MemoBean> arr1) {
        this.mcontext = mcontext;
        this.arr1 = arr1;
    }
    @NonNull
    @Override
    public  ViewHolder onCreateViewHolder(@NonNull ViewGroup parent,int i){
        View view= LayoutInflater.from(mcontext).inflate(R.layout.activity_item,parent,false);
        ViewHolder mholder=new ViewHolder(view);
        return mholder;
    }
    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    @Override
    public  void  onBindViewHolder(@NonNull MemoAdapter.ViewHolder mholder, final int i ){
        final MemoBean memoBean = arr1.get(i);
        String caobi,ribi;
        caobi = "班            级:   " + memoBean.getContent();
        ribi =  "申请时间:   " + memoBean.getTime();
        mholder.item_title.setText(memoBean.getTitle());
        mholder.item_content.setText(caobi);
        mholder.item_time.setText(ribi);
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
    public int getItemCount(){
        return arr1.size();
    }
    public static class ViewHolder extends RecyclerView.ViewHolder{
        TextView item_title,item_content,item_time;
        ImageView item_img;
        LinearLayout item_layout;
        public ViewHolder(@NonNull View itemView){
            super(itemView);
            item_title=itemView.findViewById(R.id.textView6);
            item_content=itemView.findViewById(R.id.textView7);
            item_time=itemView.findViewById(R.id.textView8);
            item_layout=itemView.findViewById(R.id.item_layout);
        }
    }
}
