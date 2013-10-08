package com.nhn.android.mapviewer;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity{
	Button btn;
	public void onCreate(Bundle savedInstanceState) {
		   super.onCreate(savedInstanceState);
		   setContentView(R.layout.activity_main);
		   
		   btn=(Button)findViewById(R.id.LoginButton);
		   btn.setOnClickListener(new OnClickListener(){
			   public void onClick(View v){
				   Intent intent = new Intent(getApplicationContext(),MenuActivity.class);
				   startActivity(intent);
			   }
			   
		   });
		   
	}

}
