package net.msonic.fragmentos;

import net.msonic.fragmentos.ListaNoticiasFragment.OnNoticiaSelectedListener;
import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends Activity implements OnNoticiaSelectedListener {

	public static final String TAG = MainActivity.class.getCanonicalName();
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		
	}

	@Override
	public void onNoticiaSelected(int posicion) {
		// TODO Auto-generated method stub
		Log.d(TAG, String.valueOf(posicion));
		
		DetalleNoticiaFragment detalleFragment = (DetalleNoticiaFragment)getFragmentManager().findFragmentById(R.id.fragment2);
		if (detalleFragment != null && detalleFragment.isInLayout()) {
			detalleFragment.cargarNoticia(posicion);
		}
		
		
	}



}
