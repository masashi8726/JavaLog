package jp.techacademy.masashi.muto.javalog;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Human human = new Human("masashi", 27, "football");
        human.say();
        human.think();
    }
}