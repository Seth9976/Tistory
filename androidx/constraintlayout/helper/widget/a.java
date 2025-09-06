package androidx.constraintlayout.helper.widget;

public final class a implements Runnable {
    public final float a;
    public final b b;

    public a(b b0, float f) {
        this.b = b0;
        this.a = f;
    }

    @Override
    public final void run() {
        this.b.a.i.touchAnimateTo(5, 1.0f, this.a);
    }
}

