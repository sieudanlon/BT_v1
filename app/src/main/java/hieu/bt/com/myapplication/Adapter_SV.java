package hieu.bt.com.myapplication;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class Adapter_SV extends RecyclerView.Adapter<Adapter_SV.ViewHolder> {
    ArrayList<Data> data;
    Context context;

    public Adapter_SV(ArrayList<Data> data, Context context) {
        this.data = data;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View itemView = layoutInflater.inflate(R.layout.item_row,parent,false);
        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.txtTen.setText(data.get(position).getTen());
        holder.txtNamSinh.setText(data.get(position).getNamsinh());
        holder.txtTinhThanh.setText(data.get(position).getTinhthanh());

    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView txtTen,txtNamSinh,txtTinhThanh;
        //        Button btn_detail;
//        ImageView img_delete,img_edit;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            txtTen = itemView.findViewById(R.id.tv_ten);
            txtNamSinh = itemView.findViewById(R.id.tv_namsinh);
            txtTinhThanh = itemView.findViewById(R.id.tv_tinhthanh);
//            btn_detail = itemView.findViewById(R.id.btn_detail);
//            img_delete = itemView.findViewById(R.id.iv_delete);
//            img_edit = itemView.findViewById(R.id.iv_edit);
        }
    }

}
