package com.angelflower.jaguar_app.clases;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;

import com.angelflower.jaguar_app.MainActivity;
import com.angelflower.jaguar_app.R;
import com.angelflower.jaguar_app.fragmentos.InicioFragmento;
import com.angelflower.jaguar_app.pantallas.LeerMas;
import com.squareup.picasso.Picasso;
import java.util.ArrayList;

public class PublicacionAdapter extends RecyclerView.Adapter<PublicacionAdapter.PublicacionViewHolder>{

    private ArrayList<Publicacion> data;


    public PublicacionAdapter(ArrayList<Publicacion> data) {
        this.data = data;
    }

    @Override
    public PublicacionViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new PublicacionViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.publicacion_item, parent, false));
    }

    @Override
    public void onBindViewHolder(final PublicacionViewHolder holder, int position) {
        Publicacion publicacion = data.get(position);
        Picasso.get().load(publicacion.getImagen()).resize(562, 315).into(holder.imgPublicacion);
        holder.tvTitulo.setText(publicacion.getTitulo());
        holder.tvUsuario.setText(publicacion.getUsuario());

        holder.tvLeerMas.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), LeerMas.class);
                v.getContext().startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    class PublicacionViewHolder extends RecyclerView.ViewHolder{

        ImageView imgPublicacion;
        TextView tvTitulo;
        TextView tvUsuario;
        Button tvLeerMas;

        public PublicacionViewHolder(View itemView) {
            super(itemView);
            imgPublicacion = (ImageView) itemView.findViewById(R.id.img_publicacion);
            tvTitulo = (TextView) itemView.findViewById(R.id.tv_titulo);
            tvUsuario = (TextView) itemView.findViewById(R.id.tv_usuario);
            tvLeerMas = (Button) itemView.findViewById(R.id.tvLeerMas);
        }


    }

}