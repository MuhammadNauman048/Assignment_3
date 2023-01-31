package com.example.assignment_2;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button search;
    EditText surah;
    EditText ayat;
    TextView displayAyat;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        search = findViewById(R.id.search);
        surah = findViewById(R.id.surahNo);
        ayat = findViewById(R.id.ayatNo);
        displayAyat = findViewById(R.id.displayAyat);
        QuranDataHelper qdh = new QuranDataHelper();
        QuranText qt = new QuranText();

        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int suratInt = Integer.parseInt(surah.getText().toString());
                int ayatInt = Integer.parseInt((ayat.getText().toString()));
                int temp1 = qdh.SSP[suratInt-1];
                int temp2 = temp1 + ayatInt;

                displayAyat.setText(qt.QuranArabicText[temp2-1]);
            }
        });


    }

}