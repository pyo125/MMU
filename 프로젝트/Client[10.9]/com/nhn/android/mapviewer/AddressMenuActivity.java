package com.nhn.android.mapviewer;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;

public class AddressMenuActivity extends Activity{
	ImageView btn1;
	ImageView btn2;
	ImageView btn3;
	public void onCreate(Bundle savedInstanceState) {
		   super.onCreate(savedInstanceState);
		   setContentView(R.layout.address_menu);
		   
		   btn1=(ImageView)findViewById(R.id.imageView3);
		   btn1.setOnClickListener(new OnClickListener(){
			   public void onClick(View v){
				   Intent intent = new Intent(getApplicationContext(),Address.class);
				   startActivity(intent);
			   }
			   
		   });
		   
		   /*btn2=(ImageView)findViewById(R.id.imageView2);
		   btn2.setOnClickListener(new OnClickListener(){
			   public void onClick(View v){
				   Intent intent = new Intent(getApplicationContext(),NMapViewer.class);
				   startActivity(intent);
			   }
			   
		   });*/
   
	}

}