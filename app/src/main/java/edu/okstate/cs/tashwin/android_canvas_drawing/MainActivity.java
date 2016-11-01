package edu.okstate.cs.tashwin.android_canvas_drawing;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Create a paint object to fill the shape with
        Paint paint = new Paint();
        paint.setColor(Color.RED);
        //Create a bit map object
        Bitmap bm = Bitmap.createBitmap(300,300, Bitmap.Config.ARGB_8888);
        //Create canvas from bitmap
        Canvas myCanvas = new Canvas(bm);
        //Draw a shape on the canvas & write a text
        myCanvas.drawCircle(100, 100, 20, paint);
        paint.setColor(Color.BLACK);
        myCanvas.drawText("Hello World !", 100, 200, paint);
        //Add the bitmap to main view
        RelativeLayout rl = (RelativeLayout) findViewById(R.id.activity_main);
        rl.setBackground(new BitmapDrawable(bm));

    }


}
