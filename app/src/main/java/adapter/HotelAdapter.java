package adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import id.sch.smktelkom_mlg.learn.project.R;
import model.Hotel;

/**
 * Created by Smktelkom on 10/29/2016.
 */
public class HotelAdapter extends RecyclerView.Adapter<HotelAdapter.ViewHolder>
{
    ArrayList<Hotel> hotelList;

    public HotelAdapter
            (ArrayList<Hotel> hotelList)
    {
        this.hotelList = hotelList;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType)
    {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list,parent,false);
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position)
    {
        Hotel hotel = hotelList.get(position);
        holder.tvJudul.setText(hotel.judul);
        holder.tvDeskripsi.setText(hotel.deskripsi);
        holder.tvFoto.setImageDrawable(hotel.foto);
    }

    @Override
    public int getItemCount()
    {
        if (hotelList!=null)
            return hotelList.size();
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder
    {
        ImageView tvFoto;
        TextView tvJudul;
        TextView tvDeskripsi;

        public ViewHolder(View itemView)
        {
            super(itemView);
            tvFoto = (ImageView) itemView.findViewById(R.id.imageView);
            tvJudul = (TextView) itemView.findViewById(R.id.textViewJudul);
            tvDeskripsi = (TextView) itemView.findViewById(R.id.textViewDeskripsi);
        }
    }
}
