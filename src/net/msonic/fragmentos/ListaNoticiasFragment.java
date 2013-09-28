package net.msonic.fragmentos;

import java.util.ArrayList;

import android.app.Activity;
import android.app.ListFragment;
import android.content.Context;
import android.os.Bundle;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class ListaNoticiasFragment extends ListFragment   {
	
	
	
	 public interface OnNoticiaSelectedListener {
	        public void onNoticiaSelected(int posicion);
	    }
	    
	  
	 OnNoticiaSelectedListener mListener;
	 
	 @Override
	    public void onAttach(Activity activity) {
	        super.onAttach(activity);
	        try {
	            mListener = (OnNoticiaSelectedListener) activity;
	        } catch (ClassCastException e) {
	            throw new ClassCastException(activity.toString() + " debe implementar OnNoticiaSelectedListener");
	        }
	    }
	 
	 
	 
	 
	 
	@Override
	public void onListItemClick(ListView l, View v, int position, long id) {
		// TODO Auto-generated method stub
		super.onListItemClick(l, v, position, id);
		mListener.onNoticiaSelected(position);
	}





	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreateView(inflater, container, savedInstanceState);
		
		View vista = inflater.inflate(R.layout.listanoticias_fragment, container, false);
		return vista;
	}

	
	
	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onActivityCreated(savedInstanceState);
		
		ArrayList<NoticiaTO> noticias = ((MiApp)getActivity().getApplication()).noticias;
		NoticiaAdapter adapter = new NoticiaAdapter(getActivity(), noticias);
		setListAdapter(adapter);
		
	}



	public class NoticiaAdapter extends ArrayAdapter<NoticiaTO> {
		
		
		public NoticiaAdapter(Context context,ArrayList<NoticiaTO> detalle) {
			super(context,R.layout.listanoticiasfragment_content, detalle);
			// TODO Auto-generated constructor stub
			this.context = context;
			this.detalle = detalle;
			
		}
		public final Context context;
		public final ArrayList<NoticiaTO> detalle;
		
		
		@Override
		public View getView(int position, View convertView, ViewGroup parent) {
			// TODO Auto-generated method stub
			
			NoticiaTO noticiaTO = detalle.get(position);
			
			LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
			View rowView = inflater.inflate(R.layout.listanoticiasfragment_content, parent, false);
			
			TextView lblTitulo = (TextView) rowView.findViewById(R.id.lblTitulo);
			TextView lblNotaCorta = (TextView) rowView.findViewById(R.id.lblNotaCorta);
			ImageView imgHeader = (ImageView) rowView.findViewById(R.id.imgHeader);
			
			
			lblTitulo.setText(Html.fromHtml(noticiaTO.titulo));
			lblNotaCorta.setText(Html.fromHtml(noticiaTO.notaCorta));
			new DescargaImagenTask(imgHeader).execute(noticiaTO.url);
			
			return rowView;
		}
		
		
		
		
	}

	
	
}
