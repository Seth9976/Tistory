package u4;

import a5.b;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.pdf.PdfDocument.Page;
import android.os.AsyncTask;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.print.PageRange;
import android.print.PrintAttributes;
import android.print.PrintDocumentAdapter.WriteResultCallback;
import android.print.pdf.PrintedPdfDocument;
import android.util.Log;
import androidx.print.PrintHelper;
import java.io.FileOutputStream;
import java.io.IOException;

public final class a extends AsyncTask {
    public final CancellationSignal a;
    public final PrintAttributes b;
    public final Bitmap c;
    public final int d;
    public final ParcelFileDescriptor e;
    public final PrintDocumentAdapter.WriteResultCallback f;
    public final PrintHelper g;

    public a(PrintHelper printHelper0, CancellationSignal cancellationSignal0, PrintAttributes printAttributes0, Bitmap bitmap0, PrintAttributes printAttributes1, int v, ParcelFileDescriptor parcelFileDescriptor0, PrintDocumentAdapter.WriteResultCallback printDocumentAdapter$WriteResultCallback0) {
        this.g = printHelper0;
        this.a = cancellationSignal0;
        this.b = printAttributes0;
        this.c = bitmap0;
        this.d = v;
        this.e = parcelFileDescriptor0;
        this.f = printDocumentAdapter$WriteResultCallback0;
        super();
    }

    @Override  // android.os.AsyncTask
    public final Object doInBackground(Object[] arr_object) {
        Void[] arr_void = (Void[])arr_object;
        PrintAttributes printAttributes0 = this.b;
        CancellationSignal cancellationSignal0 = this.a;
        ParcelFileDescriptor parcelFileDescriptor0 = this.e;
        Bitmap bitmap0 = this.c;
        try {
            if(!cancellationSignal0.isCanceled()) {
                PrintedPdfDocument printedPdfDocument0 = new PrintedPdfDocument(this.g.a, printAttributes0);
                Bitmap bitmap1 = PrintHelper.a(bitmap0, printAttributes0.getColorMode());
                if(!cancellationSignal0.isCanceled()) {
                    try {
                        PdfDocument.Page pdfDocument$Page0 = printedPdfDocument0.startPage(1);
                        RectF rectF0 = new RectF(pdfDocument$Page0.getInfo().getContentRect());
                        int v = bitmap1.getWidth();
                        int v1 = bitmap1.getHeight();
                        Matrix matrix0 = new Matrix();
                        float f = rectF0.width() / ((float)v);
                        float f1 = this.d == 2 ? Math.max(f, rectF0.height() / ((float)v1)) : Math.min(f, rectF0.height() / ((float)v1));
                        matrix0.postScale(f1, f1);
                        matrix0.postTranslate(b.a(v, f1, rectF0.width(), 2.0f), b.a(v1, f1, rectF0.height(), 2.0f));
                        pdfDocument$Page0.getCanvas().drawBitmap(bitmap1, matrix0, null);
                        printedPdfDocument0.finishPage(pdfDocument$Page0);
                        if(cancellationSignal0.isCanceled()) {
                            goto label_34;
                        }
                        else {
                            printedPdfDocument0.writeTo(new FileOutputStream(parcelFileDescriptor0.getFileDescriptor()));
                            goto label_30;
                        }
                        return null;
                    }
                    catch(Throwable throwable1) {
                        printedPdfDocument0.close();
                        if(parcelFileDescriptor0 != null) {
                            try {
                                parcelFileDescriptor0.close();
                            }
                            catch(IOException unused_ex) {
                            }
                        }
                        if(bitmap1 != bitmap0) {
                            bitmap1.recycle();
                        }
                        throw throwable1;
                    }
                label_30:
                    printedPdfDocument0.close();
                    try {
                        parcelFileDescriptor0.close();
                    }
                    catch(IOException unused_ex) {
                    }
                    if(bitmap1 != bitmap0) {
                        bitmap1.recycle();
                        return null;
                    label_34:
                        printedPdfDocument0.close();
                        if(parcelFileDescriptor0 != null) {
                            try {
                                parcelFileDescriptor0.close();
                            }
                            catch(IOException unused_ex) {
                            }
                        }
                        if(bitmap1 != bitmap0) {
                            bitmap1.recycle();
                            return null;
                        }
                    }
                }
            }
            return null;
        }
        catch(Throwable throwable0) {
            return throwable0;
        }
    }

    @Override  // android.os.AsyncTask
    public final void onPostExecute(Object object0) {
        boolean z = this.a.isCanceled();
        PrintDocumentAdapter.WriteResultCallback printDocumentAdapter$WriteResultCallback0 = this.f;
        if(z) {
            printDocumentAdapter$WriteResultCallback0.onWriteCancelled();
            return;
        }
        if(((Throwable)object0) == null) {
            printDocumentAdapter$WriteResultCallback0.onWriteFinished(new PageRange[]{PageRange.ALL_PAGES});
            return;
        }
        Log.e("PrintHelper", "Error writing printed content", ((Throwable)object0));
        printDocumentAdapter$WriteResultCallback0.onWriteFailed(null);
    }
}

