package com.bawei.demo0107;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

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
public class XRVAdapter extends XRecyclerView.Adapter<XRVAdapter.VH> {


    private final Context context;
    private final List<Entity.ResultBean> result;
    private boolean checked;


    public XRVAdapter(Context context, List<Entity.ResultBean> result, boolean checked) {

        this.context = context;
        this.result = result;
        this.checked = checked;
    }

    @NonNull
    @Override
    public VH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new VH(View.inflate(context, R.layout.xrv_item, null));
    }

    @Override
    public void onBindViewHolder(@NonNull VH holder, int position) {
        Entity.ResultBean list = result.get(position);

        String categoryName = list.getCategoryName();
        holder.tvName.setText(categoryName);
        holder.rv.setLayoutManager(new LinearLayoutManager(context));

        RVAdapter rvAdapter = new RVAdapter(context, list.getShoppingCartList(), holder.cbChecked.isChecked());

        holder.rv.setAdapter(rvAdapter);

        if (checked) {
            holder.cbChecked.setChecked(checked);
        }

    }

    @Override
    public int getItemCount() {
        return result.size();
    }

    static class VH extends XRecyclerView.ViewHolder {
        @BindView(R.id.cb_checked)
        CheckBox cbChecked;
        @BindView(R.id.tv_name)
        TextView tvName;
        @BindView(R.id.rv)
        RecyclerView rv;

        public VH(@NonNull View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }

 


}
