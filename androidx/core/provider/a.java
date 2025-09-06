package androidx.core.provider;

import android.graphics.Typeface;

public final class a implements Runnable {
    public final FontRequestCallback a;
    public final Typeface b;

    public a(FontRequestCallback fontsContractCompat$FontRequestCallback0, Typeface typeface0) {
        this.a = fontsContractCompat$FontRequestCallback0;
        this.b = typeface0;
    }

    @Override
    public final void run() {
        this.a.onTypefaceRetrieved(this.b);
    }
}

