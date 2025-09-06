package com.google.android.material.appbar;

import android.view.View;
import androidx.core.view.ViewCompat;

public final class j {
    public final View a;
    public int b;
    public int c;
    public int d;
    public int e;
    public boolean f;
    public boolean g;

    public j(View view0) {
        this.f = true;
        this.g = true;
        this.a = view0;
    }

    public final void a() {
        int v = this.d;
        int v1 = this.a.getTop();
        ViewCompat.offsetTopAndBottom(this.a, v - (v1 - this.b));
        int v2 = this.e;
        int v3 = this.a.getLeft();
        ViewCompat.offsetLeftAndRight(this.a, v2 - (v3 - this.c));
    }

    public final boolean b(int v) {
        if(this.f && this.d != v) {
            this.d = v;
            this.a();
            return true;
        }
        return false;
    }
}

