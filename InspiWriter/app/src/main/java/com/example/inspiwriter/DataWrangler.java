package com.example.inspiwriter;

/**
 * Created by sabowitz on 11/4/17.
 */

public class DataWrangler {
    public String name;
    public String text;

    public DataWrangler(){
        text = "";
        name = "";
    }

    public DataWrangler(String n, String t){
      text = t;
      name = n;
    }

    public String toString() {
        return name;
    }

}
