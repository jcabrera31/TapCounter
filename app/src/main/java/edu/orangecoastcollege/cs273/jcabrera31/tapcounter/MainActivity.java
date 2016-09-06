package edu.orangecoastcollege.cs273.jcabrera31.tapcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button tapButton;
    private Counter counter;
    private TextView textView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        counter = new Counter();
        textView =  (TextView) findViewById(R.id.countTextView);
        tapButton = (Button) findViewById(R.id.tapButton);

        tapButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                counter.addCount();
                textView.setText( String.valueOf(counter.getCount()));
            }
        });



    }
}
