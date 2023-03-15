package nascimento.andrade.sofia.app1;

//Importando nana

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
        setContentView(R.layout.activity_main); // Esse método faz ligação entre a view e activity
        Button btnEnviar = findViewById(R.id.btnEnviar); //Usando o método findViewById para localizar um button Enviar através do id
        btnEnviar.setOnClickListener(new View.OnClickListener() /*Permite definir a ação que será disparada ao clicar no botão, que seria de enviar */{
            @Override
            public void onClick(View view) {
                EditText editText = findViewById(R.id.etDigiteAqui); //Usando o método findViewById para localizar um editText através do id
                String textoDigitado = editText.getText().toString(); // Retorna a string (textoDigitado) referente ao editText
                Intent i = new Intent(MainActivity.this,ProximaActivity.class); //define o componente que deve ser chamado pelo sistema Android
                i.putExtra("texto",textoDigitado);
                startActivity(i);


            }
        });
    }
}