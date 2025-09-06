package androidx.datastore.core;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.DisposableHandle;

public final class l extends Lambda implements Function0 {
    public final DisposableHandle w;

    public l(DisposableHandle disposableHandle0) {
        this.w = disposableHandle0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        this.w.dispose();
        return Unit.INSTANCE;
    }
}

