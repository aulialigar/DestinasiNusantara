package id.sch.smktelkom_mlg.project.xirpl4091827.destinasinusantara.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import id.sch.smktelkom_mlg.learn.project.R;
import id.sch.smktelkom_mlg.project.xirpl4091827.destinasinusantara.twisata.twis;

/**
 * Created by ACER on 18/11/2016.
 */
public class twisadapter extends RecyclerView.Adapter<twisadapter.ViewHolder>
{
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list,parent,false);
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    public twisadapter(ArrayList<twis> twislist)
    {
        this.twislist = twislist;
    }

    ArrayList<twis> twislist = new ArrayList<>();
    twisadapter mAdapter;

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        twis Twis =  twislist.get(position);
        holder.tvJudul.setText(Twis.judul);
        holder.tvDeskripsi.setText(Twis.deskripsi);
        holder.ivfoto.setImageDrawable(Twis.foto);
    }

    @Override
    public int getItemCount() {
        if (twislist != null)
            return twislist.size();
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder
    {
        ImageView ivfoto;
        TextView tvJudul;
        TextView tvDeskripsi;

        public ViewHolder(View itemView) {
            super(itemView);
            ivfoto = (ImageView) itemView.findViewById(R.id.imageView);
            tvJudul = (TextView) itemView.findViewById(R.id.textViewJudul);
            tvDeskripsi = (TextView) itemView.findViewById(R.id.textViewDeskripsi);
        }
    }
}
