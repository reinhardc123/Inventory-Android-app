package com.example.inventory;



import android.os.Bundle;
import android.os.Handler;
import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;

public class Splash extends Activity {
	private static int SPLASH_TIME_OUT = 3000;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_splash);
		ActionBar ab=getActionBar();
		ab.hide();
new Handler().postDelayed(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				Intent i=new Intent(Splash.this,Login.class);
				startActivity(i);
				finish();
			}
		},SPLASH_TIME_OUT);
	}

	
	
}
