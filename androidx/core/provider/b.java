package androidx.core.provider;

public final class b implements Runnable {
    public final FontRequestCallback a;
    public final int b;

    public b(FontRequestCallback fontsContractCompat$FontRequestCallback0, int v) {
        this.a = fontsContractCompat$FontRequestCallback0;
        this.b = v;
    }

    @Override
    public final void run() {
        this.a.onTypefaceRequestFailed(this.b);
    }
}

