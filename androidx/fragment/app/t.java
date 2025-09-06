package androidx.fragment.app;

public final class t implements Runnable {
    public final int a;
    public final Fragment b;

    public t(Fragment fragment0, int v) {
        this.a = v;
        this.b = fragment0;
        super();
    }

    @Override
    public final void run() {
        if(this.a != 0) {
            this.b.callStartTransitionListener(false);
            return;
        }
        this.b.startPostponedEnterTransition();
    }
}

