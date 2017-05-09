package com.example.start_another_app;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		Button OP = (Button)findViewById(R.id.BT);
		
		OP.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub			
				Intent i = new Intent();
				i.setClassName("com.tct.gallery3d", "com.tct.gallery3d.app.GalleryActivity");
				//com.tencent.mm:微信的包名
				//com.tct.gallery3d.app.GalleryActivity 启动activit名
				i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);//必须添加
				getApplicationContext().startActivity(i);
				
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);

		return true;
	}

}
