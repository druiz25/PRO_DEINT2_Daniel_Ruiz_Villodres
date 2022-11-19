package com.example.proyectofinalandroid.ui.dashboard;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.proyectofinalandroid.R;
import com.example.proyectofinalandroid.databinding.FragmentDashBoardBinding;

public class DashBoardFragment extends Fragment {

    private FragmentDashBoardBinding binding;

    public DashBoardFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding =  FragmentDashBoardBinding.inflate(inflater);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        binding.btnAdd.setOnClickListener(view1 -> {
            NavHostFragment.findNavController(this).navigate(R.id.action_dashBoardFragment_to_addUserFragment);
        });
        binding.btnCreateChat.setOnClickListener(view1 -> {
            NavHostFragment.findNavController(this).navigate(R.id.action_dashBoardFragment_to_crearChatFragment);
        });
        binding.btnEditChat.setOnClickListener(view1 -> {
            NavHostFragment.findNavController(this).navigate(R.id.action_dashBoardFragment_to_editChatFragment);
        });
        binding.btnCreateImage.setOnClickListener(view1 -> {
            NavHostFragment.findNavController(this).navigate(R.id.action_dashBoardFragment_to_createImageFragment);
        });
        binding.btnEditImage.setOnClickListener(view1 -> {
            NavHostFragment.findNavController(this).navigate(R.id.action_dashBoardFragment_to_editImageFragment);
        });
    }
}