package com.example.a11week;

import androidx.appcompat.app.AppCompatActivity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.widget.GridLayout;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("C089038오현준");

        int width_count = 3;
        int height_count = 3;
        GridLayout gridLayout = findViewById(R.id.puzzle);
        Bitmap img = BitmapFactory.decodeResource(getResources(), R.drawable.download);

        int img_width = img.getWidth() / 3;
        int img_height = img.getHeight() / 3;

        for (int i = 0; i < height_count; i++){
            for (int j = 0; j < width_count; j++){
                if (i == height_count - 1 && j == width_count - 1) {
                    ImageView emptyView = new ImageView(this);
                    emptyView.setBackgroundColor(0xFFFFFFFF);
                    gridLayout.addView(emptyView);
                    continue;
                }

                Bitmap tile = Bitmap.createBitmap(
                        img, j * img_width, i * img_height,
                        img_width, img_height
                );
                ImageView img_View = new ImageView(this);
                GridLayout.LayoutParams params = new GridLayout.LayoutParams();
                params.setMargins(2, 2, 2, 2);
                img_View.setLayoutParams(params);

                img_View.setImageBitmap(tile);
                img_View.setScaleType(ImageView.ScaleType.CENTER_CROP);

                gridLayout.addView(img_View);
            }
        }
    }
}