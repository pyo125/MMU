package com.nhn.android.mapviewer;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MenuActivity extends Activity{
	Button btn1;
	Button btn2;
	Button btn3;
	public void onCreate(Bundle savedInstanceState) {
		   super.onCreate(savedInstanceState);
		   setContentView(R.layout.menu);
		   
		   btn1=(Button)findViewById(R.id.menu1);
		   btn1.setOnClickListener(new OnClickListener(){
			   public void onClick(View v){
				   Intent intent = new Intent(getApplicationContext(),Address.class);
				   startActivity(intent);
			   }
			   
		   });
		   
		   btn2=(Button)findViewById(R.id.menu2);
		   btn2.setOnClickListener(new OnClickListener(){
			   public void onClick(View v){
				   Intent intent = new Intent(getApplicationContext(),NMapViewer.class);
				   startActivity(intent);
			   }
			   
		   });
		   
		   btn3=(Button)findViewById(R.id.menu3);
		   btn3.setOnClickListener(new OnClickListener(){
			   public void onClick(View v){
				   Intent intent = new Intent(getApplicationContext(),GpsCamera.class);
				   startActivity(intent);
			   }
			   
		   });
		   
	}
	

}