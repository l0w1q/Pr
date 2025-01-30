package dan.bogdan.danapp;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class Three extends AppCompatActivity {
    EditText x1, x2, x3;
    TextView textView1, textView2;
    Button button1, button2;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.three);
        x1 = findViewById(R.id.radiusInput);
        x2 = findViewById(R.id.radiusInput2);
        x3 = findViewById(R.id.radiusInput3);
        textView1 = findViewById(R.id.textView3);
        textView2 = findViewById(R.id.textView4);
        button1 = findViewById(R.id.button2);
        button2 = findViewById(R.id.button4);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (x1.getText().toString().isEmpty() || x2.getText().toString().isEmpty() || x3.getText().toString().isEmpty()) {
                    textView1.setText("Ошибка: заполните все поля");
                    textView2.setText("");
                    return;
                }

                float a = Float.parseFloat(x1.getText().toString());
                float b = Float.parseFloat(x2.getText().toString());
                float c = Float.parseFloat(x3.getText().toString());
                textView1.setText("1 килограмм = " + b / a);
                textView2.setText("Фин.Кг = " + c * (b / a) + " Руб.");
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Three.this, Second.class);
                startActivity(intent);
            }
        });
    }
}
