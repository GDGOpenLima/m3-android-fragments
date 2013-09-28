package net.msonic.fragmentos;

import java.util.ArrayList;

import android.app.Fragment;
import android.os.Bundle;
import android.text.Html;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class DetalleNoticiaFragment extends Fragment {

	public static final String TAG = DetalleNoticiaFragment.class.getCanonicalName();
	
	ImageView imgHeader;
	TextView lblTitulo;
	TextView lblNotaCompleta;
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreateView(inflater, container, savedInstanceState);
		
		View vista = inflater.inflate(R.layout.detallenoticia_fragment, container, false);
		
		imgHeader = (ImageView)vista.findViewById(R.id.imgHeader);
		lblTitulo = (TextView)vista.findViewById(R.id.lblTitulo);
		lblNotaCompleta = (TextView)vista.findViewById(R.id.lblNotaCompleta);
		
		return vista;
	}
	
	
	
	public void cargarNoticia(int posicion) {
		Log.d(TAG, String.valueOf(posicion));
		
		ArrayList<NoticiaTO> noticias = ((MiApp)getActivity().getApplication()).noticias;
		
		NoticiaTO noticiaTO = noticias.get(posicion);
		
		lblTitulo.setText(Html.fromHtml(noticiaTO.titulo));
		lblNotaCompleta.setText(Html.fromHtml(noticiaTO.notaCompleta));
		new DescargaImagenTask(imgHeader).execute(noticiaTO.url);
		
	}
	
}
