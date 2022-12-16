package net.akhma.zakatapps;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class About extends AppCompatActivity {

    TextView About_text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        About_text = findViewById(R.id.About_text) ;

        About_text.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v){
                String urlGit = "https://github.com/AkhmaLail/zakatApps.git";
                Intent in = new Intent(Intent.ACTION_VIEW);
                in.setData(Uri.parse(urlGit));
                startActivity(in);
            }
        });
    }
}