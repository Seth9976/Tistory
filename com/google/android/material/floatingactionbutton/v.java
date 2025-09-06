package com.google.android.material.floatingactionbutton;

public final class v extends w {
    public final int e;
    public final z f;

    public v(z z0, int v) {
        this.e = v;
        this.f = z0;
        super(z0);
    }

    @Override  // com.google.android.material.floatingactionbutton.w
    public final float a() {
        switch(this.e) {
            case 0: {
                return this.f.h + this.f.i;
            }
            case 1: {
                return this.f.h + this.f.j;
            }
            default: {
                return this.f.h;
            }
        }
    }
}

