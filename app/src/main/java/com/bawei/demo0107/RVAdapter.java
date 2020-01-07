package com.bawei.demo0107;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.jcodecraeer.xrecyclerview.XRecyclerView;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * ProjectName: Demo0107
 * PackageName: com.bawei.demo0107
 * ClassName:   XRVAdapter
 * Description: Java类的作用
 * Author: Lazy
 * CreateDate: 2020/1/7_8:50
 */
public class RVAdapter extends XRecyclerView.Adapter<RVAdapter.VH> {


    private final Context context;
    private final List<Entity.ResultBean.ShoppingCartListBean> shoppingCartList;
    private boolean checked;


    public RVAdapter(Context context, List<Entity.ResultBean.ShoppingCartListBean> shoppingCartList, boolean checked) {

        this.context = context;
        this.shoppingCartList = shoppingCartList;
        this.checked = checked;
    }

    @NonNull
    @Override
    public VH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new VH(View.inflate(context, R.layout.rv_item, null));
    }

    @Override
    public void onBindViewHolder(@NonNull VH holder, int position) {
        Entity.ResultBean.ShoppingCartListBean list = shoppingCartList.get(position);

        String categoryName = list.getCommodityName();
        holder.tvName.setText(categoryName);
        Glide.with(context).load(list.getPic()).into(holder.ivPic);
        holder.tvPic.setText("￥:"+list.getPrice());
        if (checked){
            holder.checked.setChecked(checked);
        }

    }

    @Override
    public int getItemCount() {
        return shoppingCartList.size();
    }

    static class VH extends XRecyclerView.ViewHolder {
        @BindView(R.id.checked)
        CheckBox checked;
        @BindView(R.id.iv_pic)
        ImageView ivPic;
        @BindView(R.id.tv_name)
        TextView tvName;
        @BindView(R.id.tv_pic)
        TextView tvPic;
        public VH(@NonNull View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }

}
