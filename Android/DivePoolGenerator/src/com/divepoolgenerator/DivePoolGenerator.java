package com.divepoolgenerator;


import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;


public class DivePoolGenerator extends Activity implements OnClickListener {
    
    @Override
    public void onCreate(Bundle savedInstanceState) {        
    	super.onCreate(savedInstanceState);    
    	setContentView(R.layout.main);
    	initialize();
    }

	private void initialize() {
		Button button = (Button)findViewById(R.id.button);
		button.setOnClickListener(this);
	}

	public void onClick(View v) {
		
		TextView textview = (TextView)findViewById(R.id.textview);		
						
		String stringEn= "SuperJukk";
		String stringTo = "Polsen";
		
		String currentTest = textview.getText().toString();
		String newString = currentTest == stringEn ? stringTo : stringEn;
		textview.setText(newString);
	}
	
	
}