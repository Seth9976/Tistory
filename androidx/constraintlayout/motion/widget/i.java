package androidx.constraintlayout.motion.widget;

public final class i implements Runnable {
    public final int a;
    public final MotionLayout b;

    public i(MotionLayout motionLayout0, int v) {
        this.a = v;
        this.b = motionLayout0;
        super();
    }

    @Override
    public final void run() {
        switch(this.a) {
            case 0: {
                this.b.d0.a();
                return;
            }
            case 1: {
                this.b.h0 = false;
                return;
            }
            default: {
                this.b.d0.a();
            }
        }
    }
}

