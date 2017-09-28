package com.i012215.taller2.Adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.i012215.taller2.Models.Country;
import com.i012215.taller2.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Luis Eduardo on 27/09/2017.
 */



    public class AdapterCountry extends RecyclerView.Adapter<com.i012215.taller2.Adapters.AdapterCountry.ViewHolder> {

    List<Country> countryList = new ArrayList<>();
    Context context;

    public AdapterCountry(List<Country> countryList, Context context) {
        this.countryList = countryList;
        this.context = context;
    }

    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        // Configuracion del ViewAdapter

        // Obtener la vista (item.xml)
        View item = LayoutInflater.from(parent.getContext()).inflate(R.layout.item, parent, false);

        // Pasar la vista (item.xml) al ViewHolder
        ViewHolder viewHolder = new ViewHolder(item);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.textViewName.setText(countryList.get(position).getName());
        holder.textViewCapital.setText(countryList.get(position).getCapital());
        holder.textViewAlphs.setText(countryList.get(position).getAlphacode());
        holder.textViewRegion.setText(countryList.get(position).getRegion());
        holder.textViewSubRegion.setText(countryList.get(position).getSubregion());
    }

    @Override
    public int getItemCount() {
        return countryList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView textViewName;
        TextView textViewCapital;
        TextView textViewAlphs;
        TextView textViewRegion;
        TextView textViewSubRegion;

        public ViewHolder(View item) {
            super(item);
            textViewName = (TextView) item.findViewById(R.id.id_tv_item_namecountry);
            textViewCapital = (TextView) item.findViewById(R.id.id_tv_item_namecapital);
            textViewAlphs = (TextView) item.findViewById(R.id.id_tv_item_nameabbreviation);
            textViewRegion = (TextView) item.findViewById(R.id.id_reg_2);
            textViewSubRegion = (TextView) item.findViewById(R.id.id_subr_2);
        }
    }
}
