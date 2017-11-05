package com.example.inspiwriter;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v4.app.NotificationCompat;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";
    FirebaseDatabase database = FirebaseDatabase.getInstance();
    String dataRef = "self-discovery";
    DatabaseReference myRef = database.getReference(dataRef);
    ArrayList<DataWrangler> prompts = new ArrayList<DataWrangler>();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        System.out.println(myRef.getKey() + " print pls");

        myRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {

                for (DataSnapshot ds : dataSnapshot.getChildren()) {
                    DataWrangler foo = ds.getValue(DataWrangler.class);
                    System.out.println(foo);
                    prompts.add(foo);
                    System.out.println("prompts contains " + prompts.size() + " items");
                }
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {
                System.out.println(databaseError);
            }
        });

        findViewById(R.id.button2).setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                //System.out.println("but with a strong female protag");
                // refreshDirectory("anxiety-depression");

                TextView draft = findViewById(R.id.draft);

                draft.setText("");

                int randex = (int) (Math.random()*(prompts.size()));
                //System.out.println("!!!!!!!!"+prompts.get(randex));

                TextView text = findViewById(R.id.promptView);
                text.setText(prompts.get(randex).toString());
            }
        });

        findViewById(R.id.button3).setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                showDraft(v);
            }
        });
    }

    /** Called when the user taps the Show button */
    public void showDraft(View view) {
        TextView draft = findViewById(R.id.draft);
        EditText edit = findViewById(R.id.editText);

        draft.setText(edit.getText());
    }

    private void refreshDirectory(String s, final ArrayList<DataWrangler> prompts){

        DatabaseReference myRef2 = database.getReference(s);
        prompts.clear();

        myRef2.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {

                for (DataSnapshot ds : dataSnapshot.getChildren()){
                    DataWrangler foo = ds.getValue(DataWrangler.class);
                    System.out.println(foo);
                    prompts.add(foo);
                    System.out.println("prompts contains "+prompts.size()+" items");
                }
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {
                System.out.println(databaseError);
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    // Notification button and sending notification (you can comment out this thing if you want)
    /**@RequiresApi(api = Build.VERSION_CODES.O)
    public void sendNotification(View view) {
        //Get an instance of NotificationManager//
        NotificationManager mNotificationManager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
        String id = "my_channel";
        int importance = NotificationManager.IMPORTANCE_LOW;
        NotificationChannel mChannel = new NotificationChannel(id, "my_channel", importance);
        mChannel.enableLights(true);
        mNotificationManager.createNotificationChannel(mChannel);
        Notification.Builder mBuilder =
                new Notification.Builder(this)
                        .setSmallIcon(R.drawable.notification_icon)
                        .setContentTitle("My notification")
                        .setContentText("Hello World!")
                        .setChannelId(id);
        mNotificationManager.notify(001, mBuilder.build());
    }*/

    /** The function to show the prompt of the writer */

}