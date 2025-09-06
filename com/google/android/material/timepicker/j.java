package com.google.android.material.timepicker;

public final class j implements Runnable {
    public final int a;
    public final Object b;

    public j(Object object0, int v) {
        this.a = v;
        this.b = object0;
        super();
    }

    @Override
    public final void run() {
        if(this.a != 0) {
            Object object0 = ((MaterialTimePicker)this.b).H;
            if(object0 instanceof s) {
                ((s)object0).a();
            }
            return;
        }
        ((RadialViewGroup)this.b).c();
    }
}

