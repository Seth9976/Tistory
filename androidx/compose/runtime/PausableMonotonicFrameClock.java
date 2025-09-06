package androidx.compose.runtime;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext.Element;
import kotlin.coroutines.CoroutineContext.Key;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import qd.a;
import y0.z;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000B\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000F\u0012\u0006\u0010\u0002\u001A\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\r\u0010\u0006\u001A\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\b\u001A\u00020\u0005¢\u0006\u0004\b\b\u0010\u0007J9\u0010\u0010\u001A\u00028\u0000\"\u0004\b\u0000\u0010\t2!\u0010\u000F\u001A\u001D\u0012\u0013\u0012\u00110\u000B¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000E\u0012\u0004\u0012\u00028\u00000\nH\u0096@¢\u0006\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0013\u001A\u00020\u00128F¢\u0006\u0006\u001A\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Landroidx/compose/runtime/PausableMonotonicFrameClock;", "Landroidx/compose/runtime/MonotonicFrameClock;", "frameClock", "<init>", "(Landroidx/compose/runtime/MonotonicFrameClock;)V", "", "pause", "()V", "resume", "R", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "frameTimeNanos", "onFrame", "withFrameNanos", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "isPaused", "()Z", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class PausableMonotonicFrameClock implements MonotonicFrameClock {
    public static final int $stable = 8;
    public final MonotonicFrameClock a;
    public final Latch b;

    public PausableMonotonicFrameClock(@NotNull MonotonicFrameClock monotonicFrameClock0) {
        this.a = monotonicFrameClock0;
        this.b = new Latch();
    }

    @Override  // kotlin.coroutines.CoroutineContext$Element
    public Object fold(Object object0, @NotNull Function2 function20) {
        return DefaultImpls.fold(this, object0, function20);
    }

    @Override  // kotlin.coroutines.CoroutineContext$Element
    @Nullable
    public Element get(@NotNull Key coroutineContext$Key0) {
        return DefaultImpls.get(this, coroutineContext$Key0);
    }

    public final boolean isPaused() {
        return !this.b.isOpen();
    }

    @Override  // kotlin.coroutines.CoroutineContext$Element
    @NotNull
    public CoroutineContext minusKey(@NotNull Key coroutineContext$Key0) {
        return DefaultImpls.minusKey(this, coroutineContext$Key0);
    }

    public final void pause() {
        this.b.closeLatch();
    }

    @Override  // kotlin.coroutines.CoroutineContext
    @NotNull
    public CoroutineContext plus(@NotNull CoroutineContext coroutineContext0) {
        return DefaultImpls.plus(this, coroutineContext0);
    }

    public final void resume() {
        this.b.openLatch();
    }

    @Override  // androidx.compose.runtime.MonotonicFrameClock
    @Nullable
    public Object withFrameNanos(@NotNull Function1 function10, @NotNull Continuation continuation0) {
        PausableMonotonicFrameClock pausableMonotonicFrameClock0;
        z z0;
        if(continuation0 instanceof z) {
            z0 = (z)continuation0;
            int v = z0.s;
            if((v & 0x80000000) == 0) {
                z0 = new z(this, continuation0);
            }
            else {
                z0.s = v ^ 0x80000000;
            }
        }
        else {
            z0 = new z(this, continuation0);
        }
        Object object0 = z0.q;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(z0.s) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                z0.o = this;
                z0.p = function10;
                z0.s = 1;
                if(this.b.await(z0) == object1) {
                    return object1;
                }
                pausableMonotonicFrameClock0 = this;
                break;
            }
            case 1: {
                function10 = z0.p;
                pausableMonotonicFrameClock0 = z0.o;
                ResultKt.throwOnFailure(object0);
                break;
            }
            case 2: {
                ResultKt.throwOnFailure(object0);
                return object0;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        z0.o = null;
        z0.p = null;
        z0.s = 2;
        object0 = pausableMonotonicFrameClock0.a.withFrameNanos(function10, z0);
        return object0 == object1 ? object1 : object0;
    }
}

