package net.sgoliver.android.fragments;

import android.app.Activity;
import android.os.Bundle;

public class DetalleActivity extends Activity {
	
	public static final String EXTRA_TEXTO = 
			"net.sgoliver.android.fragments.EXTRA_TEXTO";
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_detalle);
		
		FragmentDetalle detalle = 
				(FragmentDetalle)getFragmentManager()
					.findFragmentById(R.id.FrgDetalle);
		
		detalle.mostrarDetalle(getIntent().getStringExtra(EXTRA_TEXTO));
	}
}
