package kr.hs.emirim.s2106.mirim_app_0331_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {

    RadioGroup rg;
    ImageView imgv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rg = findViewById(R.id.rg);
        imgv = findViewById(R.id.imgv);

        RadioButton rb1 = findViewById(R.id.rb1);
        RadioButton rb2 = findViewById(R.id.rb2);
        RadioButton rb3 = findViewById(R.id.rb3);

        rb1.setOnClickListener(radioListener);
        rb2.setOnClickListener(radioListener);
        rb3.setOnClickListener(radioListener);
    }

    View.OnClickListener radioListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            switch (rg.getCheckedRadioButtonId()) {
                case R.id.rb1:
                    imgv.setImageResource(R.drawable.sc);
                    break;
                case R.id.rb2:
                    imgv.setImageResource(R.drawable.jc);
                    break;
                case R.id.rb3:
                    imgv.setImageResource(R.drawable.winner);
                    break;
            }
        }
    };
}