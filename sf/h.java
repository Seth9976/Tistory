package sf;

import java.util.concurrent.Future;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.CancelHandler;
import kotlinx.coroutines.DebugStringsKt;
import kotlinx.coroutines.DisposableHandle;

public final class h extends CancelHandler {
    public final int a;
    public final Object b;

    public h(Object object0, int v) {
        this.a = v;
        super();
        this.b = object0;
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        switch(this.a) {
            case 0: {
                this.invoke(((Throwable)object0));
                return Unit.INSTANCE;
            }
            case 1: {
                this.invoke(((Throwable)object0));
                return Unit.INSTANCE;
            }
            default: {
                this.invoke(((Throwable)object0));
                return Unit.INSTANCE;
            }
        }
    }

    @Override  // kotlinx.coroutines.CancelHandlerBase
    public final void invoke(Throwable throwable0) {
        switch(this.a) {
            case 0: {
                if(throwable0 != null) {
                    ((Future)this.b).cancel(false);
                }
                return;
            }
            case 1: {
                ((DisposableHandle)this.b).dispose();
                return;
            }
            default: {
                ((Function1)this.b).invoke(throwable0);
            }
        }
    }

    @Override
    public final String toString() {
        switch(this.a) {
            case 0: {
                return "CancelFutureOnCancel[" + ((Future)this.b) + ']';
            }
            case 1: {
                return "DisposeOnCancel[" + ((DisposableHandle)this.b) + ']';
            }
            default: {
                return "InvokeOnCancel[" + DebugStringsKt.getClassSimpleName(((Function1)this.b)) + '@' + DebugStringsKt.getHexAddress(this) + ']';
            }
        }
    }
}

