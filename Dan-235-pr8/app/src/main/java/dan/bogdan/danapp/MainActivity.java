package dan.bogdan.danapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {


    EditText radiusInput;
    TextView resultText;
    Button calculateButton;
    private View calButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radiusInput = findViewById(R.id.radiusInput);
        resultText = findViewById(R.id.textView4);
        calculateButton = findViewById(R.id.button2);
        calButton = findViewById(R.id.button3);

        calculateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculateCircleProperties();

            }
        });

        calButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Second.class);
                startActivity(intent);
            }
        });
    }


    private void calculateCircleProperties() {
        String radiusString = radiusInput.getText().toString();

        if (radiusString.isEmpty()) {
            resultText.setText("Ошибка: введите радиус");
            return;
        }

        double radius = Double.parseDouble(radiusString);
        double pi = 3.14;
        double circumference = 2 * pi * radius;
        double area = pi * radius * radius;

        String result = "Длина окружности L = " + circumference + "\nПлощадь круга S = " + area;
        resultText.setText(result);
    }
}
