package cl.inacap.eva4_danieljara.modelo;

import android.content.Context;
import android.widget.Toast;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import java.util.HashMap;
import java.util.Map;

public class ConexionBD {
    private static ConexionBD instancia = new ConexionBD();

    private ConexionBD() {

    }

    public static ConexionBD getInstancia() {
        return instancia;
    }

    public void ejecutarServicio(String url, final Context context, final Jugador jugador, final String msg) {
        StringRequest stringRequest = new StringRequest(Request.Method.POST, url, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                Toast.makeText(context,msg,Toast.LENGTH_SHORT).show();
            }
        },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        Toast.makeText(context,error.toString(),Toast.LENGTH_SHORT).show();
                    }
                }
        )
        {
            @Override
            protected Map<String,String> getParams() throws AuthFailureError {
                Map<String,String> parametros = new HashMap<String,String>();
                parametros.put("nombre", jugador.getNombre());
                parametros.put("rut", jugador.getRut());
                parametros.put("altura", jugador.getAltura());
                parametros.put("peso", jugador.getPeso());
                //parametros.put("edad", jugador.getEdad()); falta convertir a String
                parametros.put("nacimiento", jugador.getNacimiento());
                parametros.put("sexo", jugador.getSexo());
                parametros.put("club", jugador.getClub());
                parametros.put("discapacidad", jugador.getDiscapacidad());
                return parametros;
            }
        };
        RequestQueue requestQueue = Volley.newRequestQueue(context);
        requestQueue.add(stringRequest);
    }


}
