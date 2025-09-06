package androidx.print;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.print.PageRange;
import android.print.PrintAttributes;
import android.print.PrintDocumentAdapter.LayoutResultCallback;
import android.print.PrintDocumentAdapter.WriteResultCallback;
import android.print.PrintDocumentAdapter;
import android.print.PrintDocumentInfo.Builder;
import u4.a;
import u4.c;

public final class b extends PrintDocumentAdapter {
    public final String a;
    public final Uri b;
    public final OnPrintFinishCallback c;
    public final int d;
    public PrintAttributes e;
    public AsyncTask f;
    public Bitmap g;
    public final PrintHelper h;

    public b(PrintHelper printHelper0, String s, Uri uri0, OnPrintFinishCallback printHelper$OnPrintFinishCallback0, int v) {
        this.h = printHelper0;
        super();
        this.a = s;
        this.b = uri0;
        this.c = printHelper$OnPrintFinishCallback0;
        this.d = v;
        this.g = null;
    }

    @Override  // android.print.PrintDocumentAdapter
    public final void onFinish() {
        super.onFinish();
        synchronized(this.h.c) {
            PrintHelper printHelper0 = this.h;
            if(printHelper0.b != null) {
                printHelper0.b = null;
            }
        }
        AsyncTask asyncTask0 = this.f;
        if(asyncTask0 != null) {
            asyncTask0.cancel(true);
        }
        OnPrintFinishCallback printHelper$OnPrintFinishCallback0 = this.c;
        if(printHelper$OnPrintFinishCallback0 != null) {
            printHelper$OnPrintFinishCallback0.onFinish();
        }
        Bitmap bitmap0 = this.g;
        if(bitmap0 != null) {
            bitmap0.recycle();
            this.g = null;
        }
    }

    @Override  // android.print.PrintDocumentAdapter
    public final void onLayout(PrintAttributes printAttributes0, PrintAttributes printAttributes1, CancellationSignal cancellationSignal0, PrintDocumentAdapter.LayoutResultCallback printDocumentAdapter$LayoutResultCallback0, Bundle bundle0) {
        synchronized(this) {
            this.e = printAttributes1;
        }
        if(cancellationSignal0.isCanceled()) {
            printDocumentAdapter$LayoutResultCallback0.onLayoutCancelled();
            return;
        }
        if(this.g != null) {
            printDocumentAdapter$LayoutResultCallback0.onLayoutFinished(new PrintDocumentInfo.Builder(this.a).setContentType(1).setPageCount(1).build(), !printAttributes1.equals(printAttributes0));
            return;
        }
        this.f = new c(this, cancellationSignal0, printAttributes1, printAttributes0, printDocumentAdapter$LayoutResultCallback0).execute(new Uri[0]);
    }

    @Override  // android.print.PrintDocumentAdapter
    public final void onWrite(PageRange[] arr_pageRange, ParcelFileDescriptor parcelFileDescriptor0, CancellationSignal cancellationSignal0, PrintDocumentAdapter.WriteResultCallback printDocumentAdapter$WriteResultCallback0) {
        PrintAttributes printAttributes0 = this.e;
        Bitmap bitmap0 = this.g;
        this.h.getClass();
        new a(this.h, cancellationSignal0, printAttributes0, bitmap0, printAttributes0, this.d, parcelFileDescriptor0, printDocumentAdapter$WriteResultCallback0).execute(new Void[0]);
    }
}

