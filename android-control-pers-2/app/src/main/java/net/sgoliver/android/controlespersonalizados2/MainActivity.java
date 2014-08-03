package net.sgoliver.android.controlespersonalizados2;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends Activity {

    private ControlLogin ctlLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ctlLogin = (ControlLogin)findViewById(R.id.CtlLogin);

        ctlLogin.setOnLoginListener(new OnLoginListener()
        {
            public void onLogin(String usuario, String password)
            {
                //Validamos el usuario y la contraseña
                if (usuario.equals("demo") && password.equals("demo"))
                    ctlLogin.setMensaje("Login correcto!");
                else
                    ctlLogin.setMensaje("Vuelva a intentarlo.");
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
