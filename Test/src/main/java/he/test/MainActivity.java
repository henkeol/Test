package he.test;


import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.Chronometer;
import android.view.View.OnClickListener;

public class MainActivity extends Activity implements OnClickListener{

    private Button b1;
    private Button b2;
    private Button b3;
    private Chronometer chronometer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        chronometer = (Chronometer)findViewById(R.id.chronometer);
        b1 = (Button)findViewById(R.id.button);
        b1.setOnClickListener(this);
        b2 = (Button)findViewById(R.id.button2);
        b2.setOnClickListener(this);
        b3 = (Button)findViewById(R.id.button3);
        b3.setOnClickListener(this);



    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }


    @Override
    public void onClick(View view) {
        if(view.getId() == R.id.button){
            chronometer.start();
        }
        if (view.getId() == R.id.button2){
            chronometer.stop();
        }
    }
}
