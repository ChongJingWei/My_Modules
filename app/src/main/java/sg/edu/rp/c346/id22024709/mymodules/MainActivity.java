package sg.edu.rp.c346.id22024709.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tvC346;
    TextView tvC203;
    TextView tvC218;
    TextView tvC235;
    TextView tvC206;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvC346 = findViewById(R.id.tvC346);
        tvC203 = findViewById(R.id.tvC203);
        tvC218 = findViewById(R.id.tvC218);
        tvC235 = findViewById(R.id.tvC235);
        tvC206 = findViewById(R.id.tvC206);



        tvC346.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent display =  new Intent(MainActivity.this, C346Activity.class);
                display.putExtra("code","C346");
                display.putExtra("name","Mobile App Development");
                display.putExtra("year",2023);
                display.putExtra("sem",1);
                display.putExtra("credit",4);
                display.putExtra("venue","E63A");
                startActivity(display);
            }
        });
        tvC203.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent display =  new Intent(MainActivity.this, C203Activity.class);
                display.putExtra("code","C203");
                display.putExtra("name","Web Appln Development in php");
                display.putExtra("year",2023);
                display.putExtra("sem",1);
                display.putExtra("credit",4);
                display.putExtra("venue","W64N");
                startActivity(display);
            }
        });
        tvC218.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent display =  new Intent(MainActivity.this, C218Activity.class);
                display.putExtra("code","C218");
                display.putExtra("name","C218 UI/UX Design for apps");
                display.putExtra("year",2023);
                display.putExtra("sem",1);
                display.putExtra("credit",4);
                display.putExtra("venue","W64N");
                startActivity(display);
            }
        });
        tvC235.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent display =  new Intent(MainActivity.this, C235Activity.class);
                display.putExtra("code","C235");
                display.putExtra("name","C235 IT Security and Management");
                display.putExtra("year",2023);
                display.putExtra("sem",1);
                display.putExtra("credit",4);
                display.putExtra("venue","W64N");
                startActivity(display);
            }
        });
        tvC206.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent display =  new Intent(MainActivity.this, C206Activity.class);
                display.putExtra("code","C206");
                display.putExtra("name","C206 Software Development Process");
                display.putExtra("year",2023);
                display.putExtra("sem",1);
                display.putExtra("credit",4);
                display.putExtra("venue","W64N");
                startActivity(display);
            }
        });
    }
}