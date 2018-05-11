package example.com.prueba;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
TextView Resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Resultado = findViewById(R.id.txtResultado);
       Users user =  getIntent().getParcelableExtra("User_Extra");
        Resultado.setText(user.nombre + "  " + user.email);
    }



}
