package com.example.mymail;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class OutboxFragment extends Fragment {

    public OutboxFragment() {
        // Constructor vacío requerido
    }

    public static OutboxFragment newInstance() {
        return new OutboxFragment();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflar el diseño del fragmento
        return inflater.inflate(R.layout.fragment_outbox, container, false);
    }
}
