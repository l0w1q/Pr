package Dan.Bogdan.danpr10;

import static java.lang.Math.pow;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Third extends AppCompatActivity {
    TextView Zagolovok;
    TextView Label1;
    EditText Field1;
    EditText Field2;
    EditText Field3;
    EditText Field4;
    EditText Field5;
    EditText Field6;
    Button button1;
    Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        Zagolovok = findViewById(R.id.Zagolovok);
        Label1 = findViewById(R.id.Label1);
        Field1 = findViewById(R.id.Field1);
        Field2 = findViewById(R.id.Field2);
        Field3 = findViewById(R.id.Field3);
        Field4 = findViewById(R.id.Field4);
        Field5 = findViewById(R.id.Field5);
        Field6 = findViewById(R.id.Field6);
        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Rascet();
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Third.this, Second.class);
                startActivity(intent);
            }
        });
    }

    private void Rascet() {
        try {
            int x = Integer.parseInt(String.valueOf(Field1.getText()));
            int y = Integer.parseInt(String.valueOf(Field2.getText()));
            int Am = Integer.parseInt(String.valueOf(Field3.getText()));
            int An = Integer.parseInt(String.valueOf(Field4.getText()));
            int a = Integer.parseInt(String.valueOf(Field5.getText()));
            int R = Integer.parseInt(String.valueOf(Field6.getText()));
            if (
                    pow(Am + x, 2) + pow(An + y, 2) <= pow(R, 2) &&
                            pow(Am + x, 2) + pow(An - a + y, 2) <= pow(R, 2) &&
                            pow(Am - a + x, 2) + pow(An - a + y, 2) <= pow(R, 2) &&
                            pow(Am - a + x, 2) + pow(An + y, 2) <= pow(R, 2)) {
                Label1.setText("Внутри");
            } else {
                Label1.setText("Нет");
            }
        } catch (NumberFormatException e) {
            Label1.setText("Введите корректные значения");
        }
    }
}