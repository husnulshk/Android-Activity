package com.unpam.activity7f;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

public class LoginSuccess extends Activity implements OnClickListener{

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_success);
        
        findViewById(R.id.logoutButton).setOnClickListener(this);
        
        TextView userTextView = (TextView) findViewById(R.id.userTextView);
        userTextView.setText(getIntent().getExtras().getString("username"));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_login_success, menu);
        return true;
    }

	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch (v.getId()){
		case R.id.logoutButton:
			finish();
		}
	}
}
