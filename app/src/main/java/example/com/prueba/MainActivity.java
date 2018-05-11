package example.com.prueba;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
//Atributos
    EditText UserName, Password,Email;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        UserName = findViewById(R.id.txtUserName);
        Password = findViewById(R.id.txtPassword);
        Email = findViewById(R.id.txtEmail);


      Button cmdEnviar = (Button) findViewById(R.id.cmdEnviar) ;
        cmdEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                login(view);
            }
        });
    }

    private void login (View view){
        Intent intent = new Intent(view.getContext(), Main2Activity.class);
        intent.putExtra("User_Extra", new Users(UserName.getText().toString(),Email.getText().toString(),Password.getText().toString()));
        startActivity(intent);
    }
}
