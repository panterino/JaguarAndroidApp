package com.angelflower.jaguar_app.fragmentos;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.angelflower.jaguar_app.MainActivity;
import com.angelflower.jaguar_app.R;
import com.angelflower.jaguar_app.clases.Publicacion;
import com.angelflower.jaguar_app.clases.PublicacionAdapter;
import com.angelflower.jaguar_app.pantallas.LeerMas;
import com.squareup.picasso.Picasso;

import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;


public class InicioFragmento extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private RecyclerView rvPublicaciones;
    private PublicacionAdapter adapter;

    private TextView leerMas;


    public InicioFragmento() {

    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment InicioFragmento.
     */
    // TODO: Rename and change types and number of parameters
    public static InicioFragmento newInstance(String param1, String param2) {
        InicioFragmento fragment = new InicioFragmento();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_inicio_fragmento, container, false);

        rvPublicaciones = (RecyclerView)rootView.findViewById(R.id.rv_publicacion);
        rvPublicaciones.setLayoutManager(new LinearLayoutManager(getActivity()));
        rvPublicaciones.setNestedScrollingEnabled(false);

        adapter = new PublicacionAdapter(dataSet());
        rvPublicaciones.setAdapter(adapter);
        // Inflate the layout for this fragment
        rvPublicaciones.setFocusable(false);

        return rootView;
    }

    private ArrayList<Publicacion> dataSet() {
        ArrayList<Publicacion> data = new ArrayList<>();
        data.add(new Publicacion("JavaScript en 2020", "Angel Flores", "https://3.bp.blogspot.com/-kKz4cAd504o/Xee-1Y4_VPI/AAAAAAAADNw/8Zs_2BTBYGgUJe14Nmloqw7-5jggPcA8wCLcBGAsYHQ/s1600/halo_reach_portada_imagen-004.jpg"));
        data.add(new Publicacion("Los videojuegos","Angel Flores","https://statics-uestudio.uecdn.es/buhomag/2019/09/minecraft-vuelve-a-estar-de-moda.jpg"));
        data.add(new Publicacion("Un Jaguar bebé","Fatima García","https://media.metrolatam.com/2019/05/12/jaguear3-da882e5d5922b6d90cdfed53366f4119-600x400.jpg"));
        return data;
    }


}
