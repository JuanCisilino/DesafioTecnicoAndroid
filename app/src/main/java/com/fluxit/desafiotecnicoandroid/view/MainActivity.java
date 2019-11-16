package com.fluxit.desafiotecnicoandroid.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Constraints;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.fluxit.desafiotecnicoandroid.R;
import com.fluxit.desafiotecnicoandroid.controller.ControllerPersona;
import com.fluxit.desafiotecnicoandroid.model.Persona;
import com.fluxit.desafiotecnicoandroid.model.PersonaDao;
import com.fluxit.desafiotecnicoandroid.utils.ResultListener;

import java.util.List;

public class MainActivity extends AppCompatActivity implements AdapterPersona.ListenerDeAdapter{

    private RecyclerView contenedorRecyclerview;
    private AdapterPersona adapterPersona;
    private ControllerPersona controllerPersona;
    Bundle bundle = new Bundle();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        contenedorRecyclerview = findViewById(R.id.activity_main_recyclerview);
        adapterPersona = new AdapterPersona(this);
        controllerPersona = new ControllerPersona();

        llamarLista();

        contenedorRecyclerview.setLayoutManager(new LinearLayoutManager(this, contenedorRecyclerview.VERTICAL,false));
        contenedorRecyclerview.setAdapter(adapterPersona);
    }

    @Override
    public void informarConsulta(Persona persona) {

    }

    public void llamarLista(){
        controllerPersona.traerListaDePersonas(new ResultListener<List<Persona>>() {
            @Override
            public void finish(List<Persona> result) {
                adapterPersona.setPersonaList(result);
            }
        });
    }
}
