package com.nhn.android.mapviewer;


import java.io.File;

import android.app.Activity;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.provider.MediaStore;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;

public class GpsMenuActivity extends Activity{
	ImageView btn1;
	ImageView btn2;
	public static String filename = "capture.jpg";
	public static final int CAMERA_CAPTURE = 1001;
	public static String sdcardPath = "";

	public void onCreate(Bundle savedInstanceState) {
		   super.onCreate(savedInstanceState);
		   setContentView(R.layout.gps_menu);
		   
		   sdcardPath = Environment.getExternalStorageDirectory().getAbsolutePath();
		   btn1=(ImageView)findViewById(R.id.imageView3);
		   btn1.setOnClickListener(new OnClickListener(){
			   public void onClick(View v){
				   showCameraCapture();
			   }
		   });
		   
		   btn2=(ImageView)findViewById(R.id.imageView2);
		   btn2.setOnClickListener(new OnClickListener(){
			   public void onClick(View v){
				   Intent intent = new Intent(getApplicationContext(),GpsAlbum.class);
				   startActivity(intent);
			   }
			   
		   });
   
	}
	
    protected void showCameraCapture() {
    	String filePath = sdcardPath + "/" + "DCIM" + "/" + "Gpscamera" + "/" + filename;

        File file = new File(filePath);
        Uri fileUri = Uri.fromFile(file);

        Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        intent.putExtra(MediaStore.EXTRA_OUTPUT, fileUri);

        startActivityForResult(intent, CAMERA_CAPTURE);
    }


    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        switch(requestCode) {
        	case CAMERA_CAPTURE:
        		onPhotoTaken();
        		break;

        }
    }


    private void onPhotoTaken() {
    	String filePath = sdcardPath + "/" + "DCIM" + "/" + "Gpscamera" + "/" + filename;

        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inSampleSize = 4;

    }

}
