package androidx.fragment.app;

import androidx.lifecycle.Lifecycle.State;

public final class p1 {
    public int a;
    public Fragment b;
    public boolean c;
    public int d;
    public int e;
    public int f;
    public int g;
    public State h;
    public State i;

    public p1(int v, Fragment fragment0) {
        this.a = v;
        this.b = fragment0;
        this.c = false;
        this.h = State.RESUMED;
        this.i = State.RESUMED;
    }

    public p1(Fragment fragment0, int v, int v1) {
        this.a = v;
        this.b = fragment0;
        this.c = true;
        this.h = State.RESUMED;
        this.i = State.RESUMED;
    }
}

