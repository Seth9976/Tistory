package androidx.constraintlayout.helper.widget;

public final class b implements Runnable {
    public final Carousel a;

    public b(Carousel carousel0) {
        this.a = carousel0;
    }

    @Override
    public final void run() {
        Carousel carousel0 = this.a;
        carousel0.i.setProgress(0.0f);
        carousel0.h();
        carousel0.e.onNewItem(carousel0.h);
        float f = carousel0.i.getVelocity();
        if(carousel0.s == 2 && f > carousel0.t && carousel0.h < carousel0.e.count() - 1) {
            float f1 = f * carousel0.p;
            int v = carousel0.h;
            if(v == 0 && carousel0.g > 0) {
                return;
            }
            if(v == carousel0.e.count() - 1 && carousel0.g < carousel0.h) {
                return;
            }
            carousel0.i.post(new a(this, f1));
        }
    }
}

