package com.example.proyectofinalandroid.ui.aboutus;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.proyectofinalandroid.R;
import com.vansuita.materialabout.builder.AboutBuilder;
import com.vansuita.materialabout.views.AboutView;

public class AboutUsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_us);
        AboutView view = AboutBuilder.with(this)
                .setName(R.string.AboutUsName)
                .setSubTitle(R.string.AboutUsSubTiTle)
                .setBrief(R.string.AboutUsBrief)
                .setAppName(R.string.app_name)

                .setVersionNameAsAppSubTitle()
                .setWrapScrollView(true)
                .setLinksAnimated(true)
                .setShowAsCard(true)
                .build();
        setContentView(view);
    }
}