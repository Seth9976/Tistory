package io.reactivex.internal.operators.observable;

public final class v2 implements BufferSupplier {
    public final int a;

    public v2(int v) {
        this.a = v;
    }

    @Override  // io.reactivex.internal.operators.observable.ObservableReplay$BufferSupplier
    public final ReplayBuffer call() {
        return new a3(this.a);
    }
}

