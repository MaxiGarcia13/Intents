package example.com.prueba;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button cmd1 = (Button) findViewById(R.id.cmd1) ;
        cmd1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(view.getContext(), Main2Activity.class);
                startActivity(intent);
            }
        });
        Button cmd2 = (Button) findViewById(R.id.cmd2) ;
        cmd2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(Intent.ACTION_SEND);
                intent.setType("text/plain");
                intent.putExtra(Intent.EXTRA_EMAIL, new String[]{"mail@mail.com"});
                intent.putExtra(Intent.EXTRA_SUBJECT, "Este es un mail de prueba");
                intent.putExtra(Intent.EXTRA_TEXT, "Mensaje texto");
                Intent mailer = Intent.createChooser(intent, "Enviar mail usando");
                startActivity(intent);
            }
        });

        Button cmd3 = (Button) findViewById(R.id.cmd3) ;
        cmd3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent =new Intent();
                intent.setType("image/*");
               intent.setAction( intent.ACTION_GET_CONTENT);
            }
        });
    }
}
