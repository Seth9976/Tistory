package io.reactivex.internal.operators.observable;

public final class b3 implements BufferSupplier {
    @Override  // io.reactivex.internal.operators.observable.ObservableReplay$BufferSupplier
    public final ReplayBuffer call() {
        return new c3(16);  // 初始化器: Ljava/util/ArrayList;-><init>(I)V
    }
}

