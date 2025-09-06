package sf;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancelHandler;
import kotlinx.coroutines.DisposableHandle;

public final class c extends CancelHandler {
    public final b[] a;

    public c(b[] arr_b) {
        this.a = arr_b;
    }

    public final void a() {
        b[] arr_b = this.a;
        for(int v = 0; v < arr_b.length; ++v) {
            DisposableHandle disposableHandle0 = arr_b[v].e;
            if(disposableHandle0 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("handle");
                disposableHandle0 = null;
            }
            disposableHandle0.dispose();
        }
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Throwable throwable0 = (Throwable)object0;
        this.a();
        return Unit.INSTANCE;
    }

    @Override  // kotlinx.coroutines.CancelHandlerBase
    public final void invoke(Throwable throwable0) {
        this.a();
    }

    @Override
    public final String toString() {
        return "DisposeHandlersOnCancel[" + this.a + ']';
    }
}

