package io.reactivex.internal.operators.flowable;

public final class n4 extends d4 {
    public final int d;

    public n4(int v) {
        this.d = v;
    }

    @Override  // io.reactivex.internal.operators.flowable.d4
    public final void d() {
        if(this.b > this.d) {
            h4 h40 = (h4)((h4)this.get()).get();
            if(h40 == null) {
                throw new IllegalStateException("Empty list!");
            }
            --this.b;
            this.set(h40);
        }
    }
}

