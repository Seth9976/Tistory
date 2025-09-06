package androidx.core.view;

public final class b2 extends a2 {
    @Override  // androidx.core.view.g2
    public final boolean e() {
        return (this.a.getDecorView().getSystemUiVisibility() & 16) != 0;
    }

    @Override  // androidx.core.view.g2
    public final boolean f() {
        return (this.a.getDecorView().getSystemUiVisibility() & 0x2000) != 0;
    }

    @Override  // androidx.core.view.g2
    public final void h(boolean z) {
        if(z) {
            this.a.clearFlags(0x8000000);
            this.a.addFlags(0x80000000);
            this.l(16);
            return;
        }
        this.m(16);
    }

    @Override  // androidx.core.view.g2
    public final void i(boolean z) {
        if(z) {
            this.a.clearFlags(0x4000000);
            this.a.addFlags(0x80000000);
            this.l(0x2000);
            return;
        }
        this.m(0x2000);
    }
}

