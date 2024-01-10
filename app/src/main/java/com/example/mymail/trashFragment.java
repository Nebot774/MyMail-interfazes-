package com.example.mymail;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class trashFragment extends Fragment {

    public trashFragment() {
        // Constructor vacío requerido
    }

    public static trashFragment newInstance() {
        return new trashFragment();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflar el diseño del fragmento
        return inflater.inflate(R.layout.fragment_trash, container, false);
    }
}
