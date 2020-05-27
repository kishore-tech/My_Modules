package sg.edu.rp.c346.id18037611.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ModuleActivity extends AppCompatActivity {

    TextView code;
    TextView name;
    TextView year;
    TextView sem;
    TextView credit;
    TextView venue;
    Button backbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_module);

        code = findViewById(R.id.tvCode);
        name = findViewById(R.id.tvName);
        year = findViewById(R.id.tvYear);
        sem  = findViewById(R.id.tvSem);
        credit = findViewById(R.id.tvCredit);
        venue = findViewById(R.id.tvVenue);
        backbtn = findViewById(R.id.backButton);

        Intent intentReceived = getIntent();
        String code = intentReceived.getStringExtra("Module Code: ");
        code.setText("Module Code: " + code);

        String name = intentReceived.getStringExtra("Module Name: ");
        name.setText("Module Name: " + name);

        String year = intentReceived.getStringExtra("Year: ");
        name.setText("Year: " + year);

        int sem = intentReceived.getIntExtra("Semester: ", 1);
        name.setText("Semester: " + sem);

        int credit = intentReceived.getIntExtra("Semester: ", 1);
        name.setText("Module Credit: " + credit);

        String venue = intentReceived.getStringExtra("Venue");



    }




}
