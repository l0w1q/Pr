package dan.bogdan.danapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Second extends AppCompatActivity {

    EditText x1, x2, y1, y2;
    Button button21, calButton, cacButton;
    TextView textView4;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second);

        x1 = findViewById(R.id.radiusInput);
        x2 = findViewById(R.id.radiusInput2);
        y1 = findViewById(R.id.radiusInput3);
        y2 = findViewById(R.id.radiusInput4);
        button21 = findViewById(R.id.button2);
        textView4 = findViewById(R.id.textView4);
        calButton = findViewById(R.id.button4);
        cacButton = findViewById(R.id.button3);

        button21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (x1.getText().toString().isEmpty() || x2.getText().toString().isEmpty() ||
                        y1.getText().toString().isEmpty() || y2.getText().toString().isEmpty()) {
                    textView4.setText("Ошибка: заполните все поля");
                    return;
                }

                double x1_val = Double.parseDouble(x1.getText().toString());
                double x2_val = Double.parseDouble(x2.getText().toString());
                double x3_val = Double.parseDouble(y1.getText().toString());
                double x4_val = Double.parseDouble(y2.getText().toString());
                double result = Math.sqrt(Math.pow((x2_val - x1_val), 2) + Math.pow((x4_val - x3_val), 2));
                textView4.setText("Ответ: " + String.format("%.2f", result));
            }
        });

        calButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Second.this, MainActivity.class);
                startActivity(intent);
            }
        });

        cacButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Second.this, Three.class);
                startActivity(intent);
            }
        });
    }
}
