package chl.ancud.m4_individual5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initListeners();
    }

    private void initListeners() {
        Button btn_showToast = findViewById(R.id.btn_showToast);
        Button btn_addCounter = findViewById(R.id.btn_addCounter);
        TextView txV_contador = findViewById(R.id.txV_contador);

        btn_showToast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getBaseContext(), "Hola", Toast.LENGTH_SHORT).show();
            }
        });

    }
}