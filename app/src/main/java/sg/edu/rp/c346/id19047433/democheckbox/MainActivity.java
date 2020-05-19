package sg.edu.rp.c346.id19047433.democheckbox;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    CheckBox cbEnabled;
    Button btnCheck;
    TextView tvShow;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cbEnabled = findViewById(R.id.checkboxDiscount);
        btnCheck = findViewById(R.id.ButtonCheck);
        tvShow = findViewById(R.id.textView);
        btnCheck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("MyActivity", "Inside onClick()");
                Toast.makeText(MainActivity.this, "Button Click", Toast.LENGTH_LONG).show();
                if (cbEnabled.isChecked()){
                    tvShow.setText("The discount is given");
                }
                else{
                    tvShow.setText("The discount is not given");
                }
            }
        });
    }
}
