package com.example.interviewquestions;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity implements OnClickListener {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		Button simple = (Button) findViewById(R.id.button1);
		Button tough = (Button) findViewById(R.id.button2);
		Button otherApps = (Button) findViewById(R.id.button3);
		Button rateUs = (Button) findViewById(R.id.button4);
		simple.setOnClickListener(this);
		tough.setOnClickListener(this);
		otherApps.setOnClickListener(this);
		rateUs.setOnClickListener(this);
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.button1:
			Intent simpleIntent = new Intent(MainActivity.this, simpleQues.class);
			startActivity(simpleIntent);
			break;
		case R.id.button2:
			Intent toughIntent = new Intent(MainActivity.this, toughQues.class);
			startActivity(toughIntent);
			break;
		case R.id.button3:
			Toast.makeText(getApplicationContext(), "Coming soon!", Toast.LENGTH_SHORT).show();
			break;
		case R.id.button4:
			Toast.makeText(getApplicationContext(), "Give me a pat on the back! :)", Toast.LENGTH_SHORT).show();
			break;
		default:
			break;
		}
		
	}
}
