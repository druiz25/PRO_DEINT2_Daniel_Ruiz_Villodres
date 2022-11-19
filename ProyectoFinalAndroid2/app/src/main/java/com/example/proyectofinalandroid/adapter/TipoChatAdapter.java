package com.example.proyectofinalandroid.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.proyectofinalandroid.R;
import com.example.proyectofinalandroid.data.model.TipoChat;
import com.example.proyectofinalandroid.data.model.TipoChatRepository;

public class TipoChatAdapter extends ArrayAdapter<TipoChat> {

    public TipoChatAdapter(@NonNull Context context, int resource) {
        super(context, resource, TipoChatRepository.getInstance().getList());
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View view = convertView;
        ViewHolder viewHolder;

        if(view == null){
            view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_tipo_chat, parent, false);
            viewHolder = new ViewHolder();
            viewHolder.imgIcon = view.findViewById(R.id.imgIcon);
            viewHolder.tvName = view.findViewById(R.id.tvName);
            view.setTag(viewHolder);
        } else
            viewHolder = (ViewHolder) view.getTag();
        viewHolder.imgIcon.setImageResource(getItem(position).getIcon());
        viewHolder.tvName.setText(getItem(position).getName());
        return view;
    }

    private static class ViewHolder{
        private ImageView imgIcon;
        private TextView tvName;
    }
}
