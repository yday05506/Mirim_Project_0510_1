package kr.hs.emirim.s2106.mirim_project_0405_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnFinish = findViewById(R.id.btn_finish);
        btnFinish.setOnClickListener(btnListener);
        Button btnVisibility = findViewById(R.id.btn_visibility);
        btnVisibility.setOnClickListener(btnListener);
    }

    View.OnClickListener btnListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            switch (view.getId()) {
                case R.id.btn_finish:
                    finish();
                    break;
                case R.id.btn_visibility:
                    Intent intent = new Intent(getApplicationContext(), MainActivity3.class);
                    startActivity(intent);
            }
        }
    };
}