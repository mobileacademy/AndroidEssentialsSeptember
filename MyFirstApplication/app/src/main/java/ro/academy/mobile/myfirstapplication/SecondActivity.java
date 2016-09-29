package ro.academy.mobile.myfirstapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    private static final String TAG = "SecondActivity";
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        if(getIntent().getStringExtra("my_data") != null) {
            Toast.makeText(this, getIntent().getStringExtra("my_data"), Toast.LENGTH_LONG).show();
        }


        Button secondBtn = (Button) findViewById(R.id.second_btn);
        secondBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG,  "onClick");
                
                Intent respIntent = new Intent();
                respIntent.putExtra("my_second_data", "Test Activity 2");
                setResult(RESULT_OK, respIntent);
                finish();
            }
        });
    }
}
