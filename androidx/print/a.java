package androidx.print;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.print.PageRange;
import android.print.PrintAttributes;
import android.print.PrintDocumentAdapter.LayoutResultCallback;
import android.print.PrintDocumentAdapter.WriteResultCallback;
import android.print.PrintDocumentAdapter;
import android.print.PrintDocumentInfo.Builder;

public final class a extends PrintDocumentAdapter {
    public final String a;
    public final int b;
    public final Bitmap c;
    public final OnPrintFinishCallback d;
    public PrintAttributes e;
    public final PrintHelper f;

    public a(PrintHelper printHelper0, String s, int v, Bitmap bitmap0, OnPrintFinishCallback printHelper$OnPrintFinishCallback0) {
        this.f = printHelper0;
        super();
        this.a = s;
        this.b = v;
        this.c = bitmap0;
        this.d = printHelper$OnPrintFinishCallback0;
    }

    @Override  // android.print.PrintDocumentAdapter
    public final void onFinish() {
        OnPrintFinishCallback printHelper$OnPrintFinishCallback0 = this.d;
        if(printHelper$OnPrintFinishCallback0 != null) {
            printHelper$OnPrintFinishCallback0.onFinish();
        }
    }

    @Override  // android.print.PrintDocumentAdapter
    public final void onLayout(PrintAttributes printAttributes0, PrintAttributes printAttributes1, CancellationSignal cancellationSignal0, PrintDocumentAdapter.LayoutResultCallback printDocumentAdapter$LayoutResultCallback0, Bundle bundle0) {
        this.e = printAttributes1;
        printDocumentAdapter$LayoutResultCallback0.onLayoutFinished(new PrintDocumentInfo.Builder(this.a).setContentType(1).setPageCount(1).build(), !printAttributes1.equals(printAttributes0));
    }

    @Override  // android.print.PrintDocumentAdapter
    public final void onWrite(PageRange[] arr_pageRange, ParcelFileDescriptor parcelFileDescriptor0, CancellationSignal cancellationSignal0, PrintDocumentAdapter.WriteResultCallback printDocumentAdapter$WriteResultCallback0) {
        PrintAttributes printAttributes0 = this.e;
        this.f.getClass();
        new u4.a(this.f, cancellationSignal0, printAttributes0, this.c, printAttributes0, this.b, parcelFileDescriptor0, printDocumentAdapter$WriteResultCallback0).execute(new Void[0]);
    }
}

