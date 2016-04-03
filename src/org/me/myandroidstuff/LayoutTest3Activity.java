package org.me.myandroidstuff;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class LayoutTest3Activity extends Activity implements OnClickListener
{
	private Button continueButton;
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) 
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);        
        continueButton = (Button)findViewById(R.id.continueButton);
        
        continueButton.setOnClickListener(this);
        
    }
	@Override
	public void onClick(View arg0) 
	{
		// TODO Auto-generated method stub
		finish();
	}
}