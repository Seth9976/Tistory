package androidx.datastore.core;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import w3.g0;

public final class k extends Lambda implements Function0 {
    public final MultiProcessCoordinator w;

    public k(MultiProcessCoordinator multiProcessCoordinator0) {
        this.w = multiProcessCoordinator0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        SharedCounter.Factory.loadLib();
        g0 g00 = new g0(this.w, 0);
        return SharedCounter.Factory.create$datastore_core_release(g00);
    }
}

