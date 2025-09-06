package com.google.android.material.datepicker;

public final class g implements Runnable {
    public final h a;
    public final long b;

    public g(h h0, long v) {
        this.a = h0;
        this.b = v;
    }

    @Override
    public final void run() {
        this.a.getClass();
        Object[] arr_object = {j.b(this.b).replace(' ', ' ')};
        this.a.a.setError(String.format(this.a.e, arr_object));
        this.a.a();
    }
}

