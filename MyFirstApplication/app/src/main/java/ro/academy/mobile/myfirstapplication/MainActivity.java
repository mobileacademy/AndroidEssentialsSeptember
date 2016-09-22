package ro.academy.mobile.myfirstapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;


/**
 *  If either the MAIN action or LAUNCHER category are not declared for one of your activities, then your app icon will
 not appear in the Home screen's list of apps.
    An application can have one or more activities without any restrictions. Every activity you define for your
 application must be declared in your AndroidManifest.xml file and the main activity for your app must be declared
 in the manifest with an <intent-filter> that includes the MAIN action and LAUNCHER category
 */
public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    private Button openButton;

    /** Called when the activity is first created. */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //An activity class loads all the UI component using the XML file available in res/layout folder of the project.
        setContentView(R.layout.activity_main);

        Log.d(TAG, "onCreate");

        openButton = (Button) findViewById(R.id.open_btn);
        openButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "onclick");
                openNextActivity();
            }
        });
    }

    private void openNextActivity() {
        Intent intent = new Intent(MainActivity.this, SecondActivity.class);
        startActivity(intent);
    }

    /** Called when the activity is about to become visible. */
    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart");
    }

    /** Called when the activity has become visible. */
    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume");
    }

    /** Called when another activity is taking focus. */
    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause");
    }

    /** Called when the activity is no longer visible. */
    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop");
    }

    /** Called just before the activity is destroyed. */
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy");
    }
}
