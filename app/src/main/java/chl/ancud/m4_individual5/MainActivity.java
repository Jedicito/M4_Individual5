package chl.ancud.m4_individual5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
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
                Toast tostada = new Toast(getBaseContext());
                tostada.setText("Hola");
                tostada.setDuration(Toast.LENGTH_SHORT);
                tostada.setGravity(Gravity.TOP, 0, 0);
                tostada.show();
            }
        });

        btn_addCounter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Integer numero = Integer.parseInt(txV_contador.getText().toString());
                numero++;
                txV_contador.setText(numero.toString());
            }
        });

    }
}