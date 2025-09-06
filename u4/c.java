package u4;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.CancellationSignal;
import android.print.PrintAttributes.MediaSize;
import android.print.PrintAttributes;
import android.print.PrintDocumentAdapter.LayoutResultCallback;
import android.print.PrintDocumentInfo.Builder;
import android.print.PrintDocumentInfo;
import androidx.print.b;
import java.io.FileNotFoundException;

public final class c extends AsyncTask {
    public final CancellationSignal a;
    public final PrintAttributes b;
    public final PrintAttributes c;
    public final PrintDocumentAdapter.LayoutResultCallback d;
    public final b e;

    public c(b b0, CancellationSignal cancellationSignal0, PrintAttributes printAttributes0, PrintAttributes printAttributes1, PrintDocumentAdapter.LayoutResultCallback printDocumentAdapter$LayoutResultCallback0) {
        this.e = b0;
        this.a = cancellationSignal0;
        this.b = printAttributes0;
        this.c = printAttributes1;
        this.d = printDocumentAdapter$LayoutResultCallback0;
        super();
    }

    @Override  // android.os.AsyncTask
    public final Object doInBackground(Object[] arr_object) {
        Uri[] arr_uri = (Uri[])arr_object;
        try {
            return this.e.h.c(this.e.b);
        }
        catch(FileNotFoundException unused_ex) {
            return null;
        }
    }

    @Override  // android.os.AsyncTask
    public final void onCancelled(Object object0) {
        Bitmap bitmap0 = (Bitmap)object0;
        this.d.onLayoutCancelled();
        this.e.f = null;
    }

    @Override  // android.os.AsyncTask
    public final void onPostExecute(Object object0) {
        Bitmap bitmap0 = (Bitmap)object0;
        super.onPostExecute(bitmap0);
        if(bitmap0 != null && this.e.h.f == 0) {
            synchronized(this) {
                PrintAttributes.MediaSize printAttributes$MediaSize0 = this.e.e.getMediaSize();
            }
            if(printAttributes$MediaSize0 != null && printAttributes$MediaSize0.isPortrait() != bitmap0.getWidth() <= bitmap0.getHeight()) {
                Matrix matrix0 = new Matrix();
                matrix0.postRotate(90.0f);
                bitmap0 = Bitmap.createBitmap(bitmap0, 0, 0, bitmap0.getWidth(), bitmap0.getHeight(), matrix0, true);
            }
        }
        this.e.g = bitmap0;
        if(bitmap0 == null) {
            this.d.onLayoutFailed(null);
        }
        else {
            PrintDocumentInfo printDocumentInfo0 = new PrintDocumentInfo.Builder(this.e.a).setContentType(1).setPageCount(1).build();
            boolean z = this.b.equals(this.c);
            this.d.onLayoutFinished(printDocumentInfo0, ((boolean)(true ^ z)));
        }
        this.e.f = null;
    }

    @Override  // android.os.AsyncTask
    public final void onPreExecute() {
        u4.b b0 = new u4.b(this);
        this.a.setOnCancelListener(b0);
    }
}

