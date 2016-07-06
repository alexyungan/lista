package com.example.aes.lista.clases;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.aes.lista.R;

import java.util.ArrayList;

/**
 * Created by Aes on 6/7/2016.
 */
public class ArrayAdapterPersona extends ArrayAdapter<Persona> {


    public ArrayAdapterPersona(Context context, ArrayList<Persona> personas) {
        super(context, 0,personas);

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        //Persona persona = getItem(position);
        Persona persona= getItem(position);

        if(convertView==null){

             convertView= LayoutInflater.from(getContext()).inflate(R.layout.mi_row,parent,false);
    }
        TextView nombre =(TextView)convertView.findViewById(R.id.textView_nombre);
        TextView apellido =(TextView)convertView.findViewById(R.id.textView_nombre);
        View view =(View)convertView.findViewById(R.id.View_estado);
        nombre.setText(persona.getNombre());
        apellido.setText(persona.getApellido());

        if(persona.getEstado()==true){

            view.setBackgroundColor(Color.RED);
        }else{
            view.setBackgroundColor(Color.BLUE);

        }

          return convertView;
    }
}
