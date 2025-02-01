package Dan.Bogdan.danpr10;

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

public class MainActivity extends AppCompatActivity {
    TextView Zagolovok;
    TextView Label1;
    EditText Field1;
    EditText Field2;
    Button button1;
    Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Zagolovok = findViewById(R.id.Zagolovok);
        Label1 = findViewById(R.id.Label1);
        Field1 = findViewById(R.id.Field1);
        Field2 = findViewById(R.id.Field2);
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
                Intent intent = new Intent(MainActivity.this, Second.class);
                startActivity(intent);
            }
        });
    }

    private void Rascet() {
        try {
            int A = Integer.parseInt(String.valueOf(Field1.getText()));
            int B = Integer.parseInt(String.valueOf(Field2.getText()));
            int X = 0;
            String res = "";
            while (X < A) {
                X = X + B;
                res = res + " " + X;
            }
            Label1.setText("Ответ: " + res);
        }catch (NumberFormatException e){
            Label1.setText("Введите корректные значения");
        }

    }
}