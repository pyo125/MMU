package com.nhn.android.mapviewer;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class Splash extends Activity{
	public void onCreate(Bundle savedInstanceState) {
		   super.onCreate(savedInstanceState);
		   setContentView(R.layout.splash);
		   
		   Handler h = new Handler();
		   h.postDelayed(new splashhandler(), 3000);
	}
	class splashhandler implements Runnable{
		public void run(){
			startActivity(
				new Intent(getApplication(),MainActivity.class));
			Splash.this.finish();
			
		}
	}
}
