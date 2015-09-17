package com.example.interviewquestions;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class simpleQues extends Activity {
	
	String []quesArray;
	String []answerArray;
	TextView simpleText;
	TextView answerText;
	int counter;
	String values;
	Button nextButn;
	Button backButn;
	Button answerButn;
	TextView simpleXX;
	TextView simpleYY;
	
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);
		setContentView(R.layout.simple_ques);
		
		counter = 0;
		quesArray = getResources().getStringArray(R.array.simpleQues);
		answerArray = getResources().getStringArray(R.array.answerQues);
		simpleText = (TextView) findViewById(R.id.questionSimple);
		answerText = (TextView) findViewById(R.id.answerSimple);
		simpleXX = (TextView) findViewById(R.id.txtXX);
	    simpleYY = (TextView) findViewById(R.id.txtYY);
		backButn = (Button) findViewById(R.id.backButn);
		answerButn = (Button) findViewById(R.id.answerButn);
		nextButn = (Button) findViewById(R.id.nextButn);
		
		values = String.valueOf(answerArray.length);
		simpleXX.setText(String.valueOf(counter+1) + "/");
		simpleYY.setText(values);
		simpleText.setText(quesArray[counter]);
		backButn.setVisibility(Button.GONE);
		
		answerButn.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				answerText.setText(answerArray[counter]);
			}
		});
		nextButn.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
					counter++;
					answerText.setText("Click the answer button for the answer");
					simpleXX.setText(String.valueOf(counter+1) + "/");
					simpleText.setText(quesArray[counter]);
					if ((counter + 1) == quesArray.length) {
						nextButn.setVisibility(Button.GONE);
					} else {
						backButn.setVisibility(Button.VISIBLE);
					}
			}
		});
		backButn.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				counter--;
				answerText.setText("Click the answer button for the answer");
				simpleXX.setText(String.valueOf(counter+1) + "/");
				simpleText.setText(quesArray[counter]);
				if (counter == 0) {
					backButn.setVisibility(Button.GONE);
				} else {
					nextButn.setVisibility(Button.VISIBLE);
				}
			}
		});
		
	}

}
