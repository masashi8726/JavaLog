package jp.techacademy.masashi.muto.javalog;

import android.util.Log;

public class Dog {
    String name;
    int age;


    public Dog() {
        name = "";
        age = 0;
    }


    public void say(){
        Log.d("javatest", this.name + "(" + this.age "歳)" + "「ワンワン」");
    }
}
