package nascimento.andrade.sofia.app1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
//Aqui possuímos uma herança onde Proxima herda de App
public class ProximaActivity extends AppCompatActivity {

    @Override
//
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_proxima); //Esse método faz ligação entre a view e activity
        Intent i = getIntent();
        String textoDigitado = i.getStringExtra("texto");
        TextView tvTexto = findViewById(R.id.tvTexto); //Usando o método findViewById para localizar um button Enviar através do id
        tvTexto.setText(textoDigitado);
    }
}