package androidx.appcompat.widget;

public final class g3 implements Runnable {
    public final int a;
    public final Toolbar b;

    public g3(Toolbar toolbar0, int v) {
        this.a = v;
        this.b = toolbar0;
        super();
    }

    @Override
    public final void run() {
        if(this.a != 0) {
            this.b.invalidateMenu();
            return;
        }
        this.b.collapseActionView();
    }
}

