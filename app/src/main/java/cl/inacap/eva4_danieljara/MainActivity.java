package cl.inacap.eva4_danieljara;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;

import cl.inacap.eva4_danieljara.modelo.Jugador;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void registrarse(View view) {
        Intent intent = new Intent(this, IngresarJugadorActivity.class);
        startActivity(intent);
    }

    public void verJugador(View view) {
     //   try {
            Intent intent = new Intent(this, VerJugadorActivity.class);
            startActivity(intent);
       // }catch (Exception ex){
         //   Toast.makeText(this, "No hay jugadores inscritos", Toast.LENGTH_SHORT).show();
        //}
    }

    public void actualizar(View view){
        Intent intent = new Intent(this,ModificarJugadorActivity.class);
        startActivity(intent);
    }

    public void eliminar(View view) {
        Intent intent = new Intent(this, VerJugadorActivity.class);
        startActivity(intent);
    }
}