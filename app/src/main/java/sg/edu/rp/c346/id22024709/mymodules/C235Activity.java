package sg.edu.rp.c346.id22024709.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class C235Activity extends AppCompatActivity {

    TextView tvC235;
    Button homebtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);

        tvC235 = findViewById(R.id.display);
        homebtn = findViewById(R.id.homebtn);

        Intent intentReceived = getIntent();
        String code = intentReceived.getStringExtra("code");
        String name = intentReceived.getStringExtra("name");
        int year = intentReceived.getIntExtra("year",2023);
        int sem = intentReceived.getIntExtra("sem",1);
        int credit = intentReceived.getIntExtra("credit",4);
        String venue = intentReceived.getStringExtra("venue");


        tvC235.setText("Module Code: "+code+"\n"+
                "Module Name: "+name+"\n"+
                "Academic Year: "+year+"\n"+
                "Semester: "+sem+"\n"+
                "Module Credit: : "+credit+"\n"+
                "Venue: "+venue+"\n");

        homebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent back =  new Intent(C235Activity.this, MainActivity.class);
                startActivity(back);
            }
        });
    }
}