package net.sgoliver.android.botones;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends ActionBarActivity {

    private TextView lblMensaje;
    private Button btnBoton1;
    private Button btnBoton5;
    private ToggleButton btnBoton2;
    private ImageButton btnBoton3;
    private ToggleButton btnBoton4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lblMensaje = (TextView)findViewById(R.id.LblMensaje);

        btnBoton1 = (Button)findViewById(R.id.BtnBoton1);

        btnBoton1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0)
            {
                lblMensaje.setText("Botón 1 pulsado!");
            }
        });

        btnBoton5 = (Button)findViewById(R.id.BtnBoton5);

        btnBoton5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0)
            {
                lblMensaje.setText("Botón 5 pulsado!");
            }
        });

        btnBoton2 = (ToggleButton)findViewById(R.id.BtnBoton2);

        btnBoton2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0)
            {
                if(btnBoton2.isChecked())
                    lblMensaje.setText("Botón 2: ON");
                else
                    lblMensaje.setText("Botón 2: OFF");
            }
        });

        btnBoton3 = (ImageButton)findViewById(R.id.BtnBoton3);

        btnBoton3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0)
            {
                lblMensaje.setText("Botón 3 pulsado!");
            }
        });

        btnBoton4 = (ToggleButton)findViewById(R.id.BtnBoton4);

        btnBoton4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0)
            {
                if(btnBoton4.isChecked())
                    lblMensaje.setText("Botón 4: ON");
                else
                    lblMensaje.setText("Botón 4: OFF");
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
