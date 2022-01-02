package cl.inacap.eva4_danieljara;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import cl.inacap.eva4_danieljara.modelo.ConexionBD;
import cl.inacap.eva4_danieljara.modelo.Jugador;

public class IngresarJugadorActivity extends AppCompatActivity {

    private EditText txtNombre;
    private EditText txtRut;
    private EditText txtAltura;
    private EditText txtPeso;
    private EditText txtEdadString;
    private EditText txtNacimiento;
    private EditText txtSexo;
    private EditText txtClub;
    private EditText txtDiscapacidad;
    private Jugador jugador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ingresar_jugador);

        txtNombre = (EditText) findViewById(R.id.ingresarNombre);
        txtRut= (EditText) findViewById(R.id.ingresarRut);
        txtAltura=(EditText) findViewById(R.id.ingresarAltura);
        txtPeso=(EditText) findViewById(R.id.ingresarPeso);
        //txtEdadString =(EditText) findViewById(R.id.ingresarEdad);
        txtNacimiento=(EditText) findViewById(R.id.ingresarNacimiento);
        txtSexo=(EditText) findViewById(R.id.ingresarSexo);
        txtClub=(EditText) findViewById(R.id.ingresarClub);
        txtDiscapacidad=(EditText) findViewById(R.id.ingresarDiscapacidad);
        Button registrar = (Button) findViewById(R.id.botonRegistrarse);
        registrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

    }
    public void ingresarClick() {
        jugador = new Jugador();
        jugador.setNombre(txtNombre.getText().toString());
        jugador.setRut(txtRut.getText().toString());
        jugador.setAltura(txtAltura.getText().toString());
        jugador.setPeso(txtPeso.getText().toString());
        //jugador.setEdad(txtEdadString.getText().toString());
        jugador.setNacimiento(txtNacimiento.getText().toString());
        jugador.setSexo(txtSexo.getText().toString());
        jugador.setClub(txtClub.getText().toString());
        jugador.setDiscapacidad(txtDiscapacidad.getText().toString());

        ConexionBD bd = ConexionBD.getInstancia();

        bd.ejecutarServicio("http://192.168.1.87/ws/insertar.php", this, jugador, "Se ha ingresado el registro correctamente");
        finish();
    }
}