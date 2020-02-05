package org.yulio.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;


public class DetailActivity extends AppCompatActivity {

    public static final String EXTRA_TITLE = "extra_title";
    public static final String EXTRA_DESCRIPTION = "extra_description";
    public static final String EXTRA_PHOTO = "extra_photo";

    TextView title, description;
    ImageView photos;

    private ArrayList<DataClass> skincareList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        title = findViewById(R.id.tv_title);
        description = findViewById(R.id.tv_description);
        photos = findViewById(R.id.iv_photo);

        String park_title = getIntent().getStringExtra(EXTRA_TITLE);
        String park_description = getIntent().getStringExtra(EXTRA_DESCRIPTION);
        int park_photo = getIntent().getIntExtra(EXTRA_PHOTO, 0);

        String detail_title = park_title;
        String detail_description = park_description;
        int detail_photo = park_photo;

        title.setText(detail_title);
        description.setText(detail_description);
        photos.setImageResource(detail_photo);
    }
}
