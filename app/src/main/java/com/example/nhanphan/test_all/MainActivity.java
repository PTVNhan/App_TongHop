package com.example.nhanphan.test_all;

import android.app.ActionBar;
import android.app.AlertDialog;
import android.app.Notification;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
        TextView txtmsg;
        Button btn;
        String msg;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            txtmsg = (TextView) findViewById(R.id.txtmsg);
            btn = (Button) findViewById(R.id.btnalert);

            btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                    builder.setTitle("Thoát")
                            .setIcon(R.drawable.exit)
                            .setMessage("Bạn có muốn thoát chương trình?")
                            .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    msg = "YES" + Integer.toString(which);
                                    txtmsg.setText("YES" + which);
                                }
                            })
                            .setNegativeButton("No", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    txtmsg.setText("No" + which);
                                }
                            }).show();

                }
            });
        }
    }