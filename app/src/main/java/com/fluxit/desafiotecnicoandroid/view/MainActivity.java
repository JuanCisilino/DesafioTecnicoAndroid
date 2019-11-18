package com.fluxit.desafiotecnicoandroid.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Constraints;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.fluxit.desafiotecnicoandroid.R;
import com.fluxit.desafiotecnicoandroid.controller.ControllerPersona;
import com.fluxit.desafiotecnicoandroid.model.Persona;
import com.fluxit.desafiotecnicoandroid.model.PersonaDao;
import com.fluxit.desafiotecnicoandroid.utils.ResultListener;

import java.util.List;

public class MainActivity extends AppCompatActivity{


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pegarFragment(new FragmentListaDePersonas());

    }

    private void pegarFragment(Fragment fragment) {
        getSupportFragmentManager()
                .beginTransaction()
                .add(R.id.mainActivity_contenedorFragment, fragment)
                .addToBackStack(null)
                .commit();
    }

}
