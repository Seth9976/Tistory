package com.google.android.material.slider;

public final class c implements Runnable {
    public int a;
    public final BaseSlider b;

    public c(BaseSlider baseSlider0) {
        this.b = baseSlider0;
        this.a = -1;
    }

    @Override
    public final void run() {
        this.b.g.sendEventForVirtualView(this.a, 4);
    }
}

