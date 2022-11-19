package com.example.proyectofinalandroid.data.model;

import com.example.proyectofinalandroid.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TipoChatRepository {

    private ArrayList<TipoChat> list;
    private static TipoChatRepository tipoChatRepository;

    private TipoChatRepository() {
        initialice();
    }

    public static TipoChatRepository getInstance() {
        if (tipoChatRepository == null){
            tipoChatRepository =  new TipoChatRepository();
        }
        return tipoChatRepository;
    }

    public List<TipoChat> getList(){
        return list;
    }

    private void initialice(){
        list = new ArrayList<>();
        list.add(new TipoChat(R.drawable.ic_private,"Privado"));
        list.add(new TipoChat(R.drawable.ic_public, "Public"));
        Collections.sort(list);
    }
}
