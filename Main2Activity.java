package com.example.andro.qr;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.QRCodeWriter;

public class Main2Activity extends AppCompatActivity {
    ImageView QR;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        QR=findViewById(R.id.imageView);
        QRCodeWriter v =new QRCodeWriter();
        try {
BitMatrix n= v.encode(MainActivity.s, BarcodeFormat.QR_CODE,300,300);
Bitmap o= Bitmap.createBitmap(300,300, Bitmap.Config.RGB_565);
for(int x=0;x<300;x++){
    for(int y=0;y<300;y++){
      o.setPixel(x,y,n.get(x, y) ? Color.BLACK:Color.WHITE);
    }
}            Toast.makeText(this, "Done", Toast.LENGTH_SHORT).show();

            QR.setImageBitmap(o);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
