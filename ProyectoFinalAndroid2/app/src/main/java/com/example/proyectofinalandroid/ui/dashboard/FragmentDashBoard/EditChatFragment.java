package com.example.proyectofinalandroid.ui.dashboard.FragmentDashBoard;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;

import com.example.proyectofinalandroid.R;
import com.example.proyectofinalandroid.adapter.TipoChatAdapter;
import com.example.proyectofinalandroid.data.model.TipoChat;
import com.example.proyectofinalandroid.databinding.FragmentEditChatBinding;

import java.util.ArrayList;

public class EditChatFragment extends Fragment {

private FragmentEditChatBinding binding;
private ArrayList<String> listChats = new ArrayList<>();
private ArrayAdapter<String> adapterListChats;
    private ArrayAdapter<TipoChat> adapter;
    private ArrayAdapter<String> adapterTipoChat;

    public EditChatFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        iniciateList();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentEditChatBinding.inflate(inflater);
        adapterListChats = new ArrayAdapter<String>(getActivity(),android.R.layout.simple_list_item_1,listChats);
        binding.lChats.setAdapter(adapterListChats);
        adapter = new TipoChatAdapter(getActivity(), R.layout.item_tipo_chat);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_item);
        binding.spinner.setSelection(0,false);
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

    public void iniciateList() {
        listChats.add("Chat 1");
        listChats.add("Chat 2");
        listChats.add("Chat 3");
        listChats.add("Chat 4");
        listChats.add("Chat 5");
        listChats.add("Chat 6");
        listChats.add("Chat 7");
        listChats.add("Chat 8");
        listChats.add("Chat 9");
        listChats.add("Chat 10");
    }
}