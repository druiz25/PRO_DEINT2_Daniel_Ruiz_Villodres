package com.example.proyectofinalandroid.ui.dashboard.FragmentDashBoard;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Toast;

import com.example.proyectofinalandroid.R;
import com.example.proyectofinalandroid.adapter.TipoChatAdapter;
import com.example.proyectofinalandroid.data.model.TipoChat;
import com.example.proyectofinalandroid.databinding.FragmentCrearChatBinding;


public class CreateChatFragment extends Fragment {
    private ArrayAdapter<TipoChat> adapter;
    FragmentCrearChatBinding binding;
    public CreateChatFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentCrearChatBinding.inflate(inflater);
        adapter = new TipoChatAdapter(getActivity(), R.layout.item_tipo_chat);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_item);
        binding.spinner.setAdapter(adapter);
        binding.spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
        return binding.getRoot();
    }
}