package com.example.mymail;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class SpamFragment extends Fragment {

    public SpamFragment() {
        // Constructor vacío requerido
    }

    public static SpamFragment newInstance() {
        return new SpamFragment();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflar el diseño del fragmento
        return inflater.inflate(R.layout.fragment_spam, container, false);
    }
}
