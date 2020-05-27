package sg.edu.rp.c346.id18037611.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvView1;
    TextView tvView2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvView1 = findViewById(R.id.c346);
        tvView2 = findViewById(R.id.c349);

        tvView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ModuleActivity.class);
                intent.putExtra("Module Code", "C346");
                intent.putExtra("Module Name", "Android Programming");
                intent.putExtra("Year", "2020");
                intent.putExtra("Semester", 1);
                intent.putExtra("Module Credit", 4);
                intent.putExtra("Venue", "W66M");
                startActivity(intent);

            }
        });

        tvView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ModuleActivity.class);
                intent.putExtra("Module Code", "C349");
                intent.putExtra("Module Name", "iPad Programming");
                intent.putExtra("Year", "2020");
                intent.putExtra("Semester", 2);
                intent.putExtra("Module Credit", 4);
                intent.putExtra("Venue", "W64C");
                startActivity(intent);

            }
        });




    }
}
