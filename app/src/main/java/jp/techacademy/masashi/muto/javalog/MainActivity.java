package jp.techacademy.masashi.muto.javalog;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int t = total(50, 1000);
        Log.d("javatest", String.valueOf(t));
    }

    private int total(int first, int last) {
        int sum = 0;
        for(int i = first; i <= last; i++) {
            sum = sum + i;
        }

        return sum;
    }
}