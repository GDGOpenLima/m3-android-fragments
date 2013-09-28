package net.msonic.fragmentos;

import java.io.InputStream;
import java.lang.ref.WeakReference;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.client.methods.HttpGet;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.http.AndroidHttpClient;
import android.os.AsyncTask;
import android.util.Log;
import android.widget.ImageView;

public class DescargaImagenTask extends AsyncTask<String, Void, Bitmap> {
	
	public static final String TAG = DescargaImagenTask.class.getCanonicalName();
	
	private final WeakReference<ImageView> imageViewReference;
	
	public DescargaImagenTask(ImageView imageView) {
        imageViewReference = new WeakReference<ImageView>(imageView);
    }
	
	@Override
	protected Bitmap doInBackground(String... params) {
		// TODO Auto-generated method stub
		String url = params[0];
		final AndroidHttpClient client = AndroidHttpClient.newInstance("Android");
		final HttpGet getRequest = new HttpGet(url);
		
		try {
            HttpResponse response = client.execute(getRequest);
            final int statusCode = response.getStatusLine().getStatusCode();
            
            if (statusCode != HttpStatus.SC_OK) {
                Log.w(TAG, "ERROR DESCARGANDO IMAGEN.");
                return null;
            }
 
            final HttpEntity entity = response.getEntity();
            
            if (entity != null) {
                InputStream inputStream = null;
                try {
                    inputStream = entity.getContent();
                    final Bitmap bitmap = BitmapFactory.decodeStream(inputStream);
                    return bitmap;
                } finally {
                    if (inputStream != null) {
                        inputStream.close();
                    }
                    entity.consumeContent();
                }
            }
        } catch (Exception e) {
            getRequest.abort();
            Log.w(TAG, "ERROR DESCARGANDO IMAGEN ");
        } finally {
            if (client != null) {
                client.close();
            }
        }
        return null;
	}
	
	@Override
    protected void onPostExecute(Bitmap bitmap) {
        if (isCancelled()) {
            bitmap = null;
        }
 
        if (imageViewReference != null) {
            ImageView imageView = imageViewReference.get();
            
            if (imageView != null) {
                if (bitmap != null) {
                    imageView.setImageBitmap(bitmap);
                } else {
                    imageView.setImageDrawable(imageView.getContext().getResources().getDrawable(R.drawable.descarga));
                }
            }
        }
        
    }

}
