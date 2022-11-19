package com.example.proyectofinalandroid.ui.dashboard.FragmentDashBoard;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.proyectofinalandroid.databinding.FragmentAddUserBinding;

public class AddUserFragment extends Fragment {

    private FragmentAddUserBinding binding;

    public AddUserFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentAddUserBinding.inflate(inflater);
        return binding.getRoot();
    }
}