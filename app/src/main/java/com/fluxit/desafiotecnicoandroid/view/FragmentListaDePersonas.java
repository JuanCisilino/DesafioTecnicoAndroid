package com.fluxit.desafiotecnicoandroid.view;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.fluxit.desafiotecnicoandroid.R;
import com.fluxit.desafiotecnicoandroid.controller.ControllerPersona;
import com.fluxit.desafiotecnicoandroid.model.Persona;
import com.fluxit.desafiotecnicoandroid.utils.ResultListener;

import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentListaDePersonas extends Fragment implements AdapterPersona.ListenerDeAdapter {

    private ListenerDeFragment listenerDeFragment;
    private RecyclerView contenedorRecyclerview;
    private AdapterPersona adapterPersona;
    private ControllerPersona controllerPersona;
    private View view;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_lista_de_personas, container, false);
        contenedorRecyclerview = view.findViewById(R.id.contenedor_recycler_fragmentLista);
        adapterPersona = new AdapterPersona(this);
        controllerPersona = new ControllerPersona();
        llamarLista();
        contenedorRecyclerview.setLayoutManager(new LinearLayoutManager(getContext(),
                RecyclerView.VERTICAL,false));
        contenedorRecyclerview.setAdapter(adapterPersona);
        return view;
    }


    public void llamarLista(){
        controllerPersona.traerListaDePersonas(new ResultListener<List<Persona>>() {
            @Override
            public void finish(List<Persona> result) {
                adapterPersona.setPersonaList(result);
            }
        });
    }

    @Override
    public void informarConsulta(Persona persona) {

    }

    public interface ListenerDeFragment {
        public void recibirConsulta(Persona persona);

    }
}
