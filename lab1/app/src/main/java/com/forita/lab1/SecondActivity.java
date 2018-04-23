package com.forita.lab1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends Activity {
Button button1_secondAct;
Thread thread;
int mCounter=0;
    final Handler myHandler = new Handler(); // автоматически привязывается к текущему потоку.

//CalendarView calendarView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_second);
        final TextView txtResult = (TextView)findViewById(R.id.textView1);
        button1_secondAct = (Button) findViewById(R.id.button);

        button1_secondAct.setOnClickListener(new View.OnClickListener() {
            final String result = doLongAndComplicatedTask();
            @Override

            public void onClick(View v) {
            thread = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(10000);
                    doLongAndComplicatedTask();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }


            }
});
thread.start();
                txtResult.setText(result);
            }
        });
    }

    private String doLongAndComplicatedTask() {
        long res=0;
        for(int i=0;i<100000;i++)
        {
            res=res+i;

        }
        return "Результат = "+res;
    }
}
