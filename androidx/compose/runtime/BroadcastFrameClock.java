package androidx.compose.runtime;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import jeb.synthetic.FIN;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext.Element;
import kotlin.coroutines.CoroutineContext.Key;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CancellableContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import qd.a;
import u2.b;
import y0.c;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0019B\u0019\u0012\u0010\b\u0002\u0010\u0004\u001A\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\t\u001A\u00020\u00032\u0006\u0010\b\u001A\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ*\u0010\u000E\u001A\u00028\u0000\"\u0004\b\u0000\u0010\u000B2\u0012\u0010\r\u001A\u000E\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00028\u00000\fH\u0096@¢\u0006\u0004\b\u000E\u0010\u000FJ\u001B\u0010\u0013\u001A\u00020\u00032\f\b\u0002\u0010\u0012\u001A\u00060\u0010j\u0002`\u0011¢\u0006\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0018\u001A\u00020\u00158F¢\u0006\u0006\u001A\u0004\b\u0016\u0010\u0017¨\u0006\u001A"}, d2 = {"Landroidx/compose/runtime/BroadcastFrameClock;", "Landroidx/compose/runtime/MonotonicFrameClock;", "Lkotlin/Function0;", "", "onNewAwaiters", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "", "timeNanos", "sendFrame", "(J)V", "R", "Lkotlin/Function1;", "onFrame", "withFrameNanos", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "cancellationException", "cancel", "(Ljava/util/concurrent/CancellationException;)V", "", "getHasAwaiters", "()Z", "hasAwaiters", "y0/c", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nBroadcastFrameClock.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BroadcastFrameClock.kt\nandroidx/compose/runtime/BroadcastFrameClock\n+ 2 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n+ 3 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n+ 4 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n*L\n1#1,139:1\n89#2:140\n89#2:150\n89#2:153\n314#3,9:141\n323#3,2:151\n33#4,6:154\n*S KotlinDebug\n*F\n+ 1 BroadcastFrameClock.kt\nandroidx/compose/runtime/BroadcastFrameClock\n*L\n66#1:140\n86#1:150\n118#1:153\n84#1:141,9\n84#1:151,2\n121#1:154,6\n*E\n"})
public final class BroadcastFrameClock implements MonotonicFrameClock {
    public static final int $stable = 8;
    public final Function0 a;
    public final Object b;
    public Throwable c;
    public ArrayList d;
    public ArrayList e;
    public final AtomicInt f;

    public BroadcastFrameClock() {
        this(null, 1, null);
    }

    public BroadcastFrameClock(@Nullable Function0 function00) {
        this.a = function00;
        this.b = new Object();
        this.d = new ArrayList();
        this.e = new ArrayList();
        this.f = new AtomicInt(0);
    }

    public BroadcastFrameClock(Function0 function00, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v & 1) != 0) {
            function00 = null;
        }
        this(function00);
    }

    public final void a(Throwable throwable0) {
        Object object0 = this.b;
        __monitor_enter(object0);
        try {
            if(this.c == null) {
                this.c = throwable0;
                ArrayList arrayList0 = this.d;
                int v = arrayList0.size();
                for(int v1 = 0; v1 < v; ++v1) {
                    ((c)arrayList0.get(v1)).b.resumeWith(Result.constructor-impl(ResultKt.createFailure(throwable0)));
                }
                this.d.clear();
                this.f.set(0);
                goto label_17;
            }
            goto label_19;
        }
        catch(Throwable throwable1) {
        }
        __monitor_exit(object0);
        throw throwable1;
    label_17:
        __monitor_exit(object0);
        return;
    label_19:
        __monitor_exit(object0);
    }

    public final void cancel(@NotNull CancellationException cancellationException0) {
        this.a(cancellationException0);
    }

    public static void cancel$default(BroadcastFrameClock broadcastFrameClock0, CancellationException cancellationException0, int v, Object object0) {
        if((v & 1) != 0) {
            cancellationException0 = new CancellationException("clock cancelled");
        }
        broadcastFrameClock0.cancel(cancellationException0);
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

    public final boolean getHasAwaiters() {
        return this.f.get() != 0;
    }

    @Override  // kotlin.coroutines.CoroutineContext$Element
    @NotNull
    public CoroutineContext minusKey(@NotNull Key coroutineContext$Key0) {
        return DefaultImpls.minusKey(this, coroutineContext$Key0);
    }

    @Override  // kotlin.coroutines.CoroutineContext
    @NotNull
    public CoroutineContext plus(@NotNull CoroutineContext coroutineContext0) {
        return DefaultImpls.plus(this, coroutineContext0);
    }

    public final void sendFrame(long v) {
        Object object1;
        synchronized(this.b) {
            ArrayList arrayList0 = this.d;
            this.d = this.e;
            this.e = arrayList0;
            this.f.set(0);
            int v3 = arrayList0.size();
            for(int v2 = 0; v2 < v3; ++v2) {
                c c0 = (c)arrayList0.get(v2);
                c0.getClass();
                try {
                    object1 = Result.constructor-impl(c0.a.invoke(v));
                }
                catch(Throwable throwable0) {
                    object1 = Result.constructor-impl(ResultKt.createFailure(throwable0));
                }
                c0.b.resumeWith(object1);
            }
            arrayList0.clear();
        }
    }

    @Override  // androidx.compose.runtime.MonotonicFrameClock
    @Nullable
    public Object withFrameNanos(@NotNull Function1 function10, @NotNull Continuation continuation0) {
        CancellableContinuationImpl cancellableContinuationImpl0 = new CancellableContinuationImpl(IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation0), 1);
        cancellableContinuationImpl0.initCancellability();
        c c0 = new c(function10, cancellableContinuationImpl0);
        Object object0 = this.b;
        __monitor_enter(object0);
        int v = FIN.finallyOpen$NT();
        Throwable throwable0 = this.c;
        if(throwable0 == null) {
            boolean z = this.d.isEmpty();
            this.d.add(c0);
            if(z) {
                this.f.set(1);
            }
            FIN.finallyCodeBegin$NT(v);
            __monitor_exit(object0);
            FIN.finallyCodeEnd$NT(v);
            cancellableContinuationImpl0.invokeOnCancellation(new b(8, this, c0));
            if(z && this.a != null) {
                try {
                    this.a.invoke();
                }
                catch(Throwable throwable1) {
                    this.a(throwable1);
                }
            }
        }
        else {
            cancellableContinuationImpl0.resumeWith(Result.constructor-impl(ResultKt.createFailure(throwable0)));
            FIN.finallyExec$NT(v);
        }
        Object object1 = cancellableContinuationImpl0.getResult();
        if(object1 == a.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation0);
        }
        return object1;
    }
}

