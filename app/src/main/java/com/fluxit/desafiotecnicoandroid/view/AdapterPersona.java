package com.fluxit.desafiotecnicoandroid.view;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.fluxit.desafiotecnicoandroid.R;
import com.fluxit.desafiotecnicoandroid.model.Persona;

public class AdapterPersona {

    public class ViewHolderPersona extends RecyclerView.ViewHolder{

        private TextView textViewNombre;
        private ImageView imagenDePersona;

        public ViewHolderPersona(@NonNull View itemView) {
            super(itemView);
            encontrarVariables();

        }

        public void encontrarVariables(){
            imagenDePersona = itemView.findViewById(R.id.celda_persona_imageview);
            textViewNombre = itemView.findViewById(R.id.celda_persona_textview);

        }

        public void cargarPersona(Persona persona){
            Glide.with(imagenDePersona.getContext()).load(persona.getPicture().get(2)).into(imagenDePersona);
            textViewNombre.setText((CharSequence) persona.getName().get(1));
        }

    }
}
