package com.fluxit.desafiotecnicoandroid.view;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.fluxit.desafiotecnicoandroid.R;
import com.fluxit.desafiotecnicoandroid.model.Persona;

import java.util.ArrayList;
import java.util.List;

public class AdapterPersona extends RecyclerView.Adapter<AdapterPersona.ViewHolderPersona> {

    private List<Persona> personaList;
    private ListenerDeAdapter listenerDeAdapter;

    public AdapterPersona(List<Persona> personaList) {
        this.personaList = personaList;
    }

    public AdapterPersona(ListenerDeAdapter listenerDeAdapter) {
        this.listenerDeAdapter = listenerDeAdapter;
        personaList = new ArrayList<>();
    }

    @NonNull
    @Override
    public ViewHolderPersona onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View vistaDeLaCelda = layoutInflater.inflate(R.layout.celda_persona,parent,false);
        return new ViewHolderPersona(vistaDeLaCelda);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderPersona holder, int position) {
        Persona personaAMostrar = personaList.get(position);
        holder.cargarPersona(personaAMostrar);
    }

    @Override
    public int getItemCount() {
        return personaList.size();
    }

    public void setPersonaList(List<Persona> personaList){
        this.personaList = personaList;
        notifyDataSetChanged();
    }

    public class ViewHolderPersona extends RecyclerView.ViewHolder{

        private TextView textViewNombre, textViewApellido;
        private ImageView imagenDePersona;

        public ViewHolderPersona(@NonNull View itemView) {
            super(itemView);
            encontrarVariables();

        }

        public void encontrarVariables(){
            imagenDePersona = itemView.findViewById(R.id.celda_persona_imageview);
            textViewNombre = itemView.findViewById(R.id.celda_persona_textviewNombre);
            textViewApellido = itemView.findViewById(R.id.celda_persona_textviewApellido);

        }

        public void cargarPersona(Persona persona){
            Glide.with(imagenDePersona.getContext()).load(persona.getPicture().get(10).getThumbnail()).into(imagenDePersona);
            textViewNombre.setText(persona.getName().get(0).getFirst());
            textViewApellido.setText("Prueba");
        }

    }

    public void agregarPersona(Persona persona){
        personaList.add(persona);
        notifyDataSetChanged();
    }

    public interface ListenerDeAdapter{
        public void informarConsulta(Persona persona);
    }

}
