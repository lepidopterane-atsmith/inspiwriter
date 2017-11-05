package com.example.inspiwriter;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.support.v7.app.AppCompatActivity;

import static android.content.Intent.getIntent;

/**
 * Created by hcao on 11/4/2017, refactored by sabowitz 11/5/17.
 */

public class DisplayMessageActivity extends Fragment {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
      View v = inflater.inflate(R.layout.activity_display_message, container, false);
      String s = getActivity().getIntent().getStringExtra("str");
      TextView text = v.findViewById(R.id.textView);
      text.setText(s);
      return v;
    }
}
