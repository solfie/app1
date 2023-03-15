package nascimento.andrade.sofia.app1;



import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnEnviar = findViewById(R.id.btnEnviar);
        btnEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText editText = findViewById(R.id.etDigiteAqui);
                String textoDigitado = editText.getText().toString();
                Intent i = new Intent(MainActivity.this,ProximaActivity.class);
                i.putExtra("texto",textoDigitado);
                startActivity(i);


            }
        });
    }
}