package com.pjm0922;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText ed1;
    Switch swc1;
    TextView txt1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setTitle("Report03");

        ed1 = findViewById(R.id.EDT1);
        swc1 = findViewById(R.id.SWC1);
        txt1 = findViewById(R.id.TXT1);

        String[] anm = {"쥐", "소", "호랑이", "토끼", "용", "뱀", "말", "양", "원숭이", "닭", "개", "돼지"};


        swc1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                String qwe = "";
                String asd = "";
                String EDT1 = ed1.getText().toString();

                int suseh = Integer.parseInt(0 + EDT1);


                if (EDT1.equals("")) {
                    Toast.makeText(MainActivity.this, "입력해주세요", Toast.LENGTH_SHORT).show();
                } else if (1700 > suseh) {
                    Toast.makeText(MainActivity.this, "년도는 1700년 이상이어야 합니다", Toast.LENGTH_SHORT).show();
                } else {
                    int result = suseh % 12;

                    if (result == 8) {
                        asd = anm[4];
                    } else if (result == 9) {
                        asd = anm[5];
                    } else if (result == 10) {
                        asd = anm[6];
                    } else if (result == 11) {
                        asd = anm[7];
                    } else if (result == 0) {
                        asd = anm[8];
                    } else if (result == 1) {
                        asd = anm[9];
                    } else if (result == 2) {
                        asd = anm[10];
                    } else if (result == 3) {
                        asd = anm[11];
                    } else if (result == 4) {
                        asd = anm[0];
                    } else if (result == 5) {
                        asd = anm[1];
                    } else if (result == 6) {
                        asd = anm[2];
                    } else if (result == 7) {
                        asd = anm[3];
                    }
                    qwe = EDT1 + "년의 띠동물은 " + asd + " 입니다. ";
                    txt1.setText(qwe);
                }
            }
        });
    }
}