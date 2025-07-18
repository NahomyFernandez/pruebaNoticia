package com.example.pruebanoticia;


import static java.security.AccessController.getContext;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class AdaptadorNoticias extends ArrayAdapter<com.example.prueba Noticia> {
    public AdaptadorNoticias(Context context, ArrayList<com.example.pruebarevistasuteq.Noticia> noticias) {
        super(context, 0, noticias);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        com.example.pruebarevistasuteq.Noticia noticia = getItem(position);

        if (convertView == null) {
            convertView = LayoutInflater.from(getContext())
                    .inflate(R.layout.activity_lynoticia, parent, false);
        }

        TextView tvCategoria = convertView.findViewById(R.id.tvCategoria);
        TextView tvTitulo = convertView.findViewById(R.id.tvTitulo);
        TextView tvFecha = convertView.findViewById(R.id.tvFecha);
        TextView tvLink = convertView.findViewById(R.id.tvLink);
        ImageView imgLogo = convertView.findViewById(R.id.imgPortada);
        ImageView imgPortada = convertView.findViewById(R.id.imgPortada);



        return convertView;
    }
}