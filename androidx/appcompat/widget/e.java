package androidx.appcompat.widget;

public final class e implements Runnable {
    public final int a;
    public final ActionBarOverlayLayout b;

    public e(ActionBarOverlayLayout actionBarOverlayLayout0, int v) {
        this.a = v;
        this.b = actionBarOverlayLayout0;
        super();
    }

    @Override
    public final void run() {
        if(this.a != 0) {
            this.b.b();
            this.b.w = this.b.d.animate().translationY(((float)(-this.b.d.getHeight()))).setListener(this.b.x);
            return;
        }
        this.b.b();
        this.b.w = this.b.d.animate().translationY(0.0f).setListener(this.b.x);
    }
}

