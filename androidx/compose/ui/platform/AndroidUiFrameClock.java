package androidx.compose.ui.platform;

import aa.o;
import android.view.Choreographer;
import androidx.compose.runtime.MonotonicFrameClock.DefaultImpls;
import androidx.compose.runtime.MonotonicFrameClock;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.ContinuationInterceptor;
import kotlin.coroutines.CoroutineContext.Element;
import kotlin.coroutines.CoroutineContext.Key;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CancellableContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import qd.a;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u001B\b\u0000\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\b\u0010\u0005\u001A\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0006\u0010\bJ*\u0010\r\u001A\u00028\u0000\"\u0004\b\u0000\u0010\t2\u0012\u0010\f\u001A\u000E\u0012\u0004\u0012\u00020\u000B\u0012\u0004\u0012\u00028\u00000\nH\u0096@¢\u0006\u0004\b\r\u0010\u000ER\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000F\u0010\u0010\u001A\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Landroidx/compose/ui/platform/AndroidUiFrameClock;", "Landroidx/compose/runtime/MonotonicFrameClock;", "Landroid/view/Choreographer;", "choreographer", "Landroidx/compose/ui/platform/AndroidUiDispatcher;", "dispatcher", "<init>", "(Landroid/view/Choreographer;Landroidx/compose/ui/platform/AndroidUiDispatcher;)V", "(Landroid/view/Choreographer;)V", "R", "Lkotlin/Function1;", "", "onFrame", "withFrameNanos", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "a", "Landroid/view/Choreographer;", "getChoreographer", "()Landroid/view/Choreographer;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nAndroidUiFrameClock.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidUiFrameClock.android.kt\nandroidx/compose/ui/platform/AndroidUiFrameClock\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,61:1\n314#2,11:62\n*S KotlinDebug\n*F\n+ 1 AndroidUiFrameClock.android.kt\nandroidx/compose/ui/platform/AndroidUiFrameClock\n*L\n38#1:62,11\n*E\n"})
public final class AndroidUiFrameClock implements MonotonicFrameClock {
    public static final int $stable = 8;
    public final Choreographer a;
    public final AndroidUiDispatcher b;

    public AndroidUiFrameClock(@NotNull Choreographer choreographer0) {
        this(choreographer0, null);
    }

    public AndroidUiFrameClock(@NotNull Choreographer choreographer0, @Nullable AndroidUiDispatcher androidUiDispatcher0) {
        this.a = choreographer0;
        this.b = androidUiDispatcher0;
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

    @NotNull
    public final Choreographer getChoreographer() {
        return this.a;
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

    @Override  // androidx.compose.runtime.MonotonicFrameClock
    @Nullable
    public Object withFrameNanos(@NotNull Function1 function10, @NotNull Continuation continuation0) {
        AndroidUiDispatcher androidUiDispatcher0 = this.b;
        if(androidUiDispatcher0 == null) {
            Element coroutineContext$Element0 = continuation0.getContext().get(ContinuationInterceptor.Key);
            androidUiDispatcher0 = coroutineContext$Element0 instanceof AndroidUiDispatcher ? ((AndroidUiDispatcher)coroutineContext$Element0) : null;
        }
        CancellableContinuationImpl cancellableContinuationImpl0 = new CancellableContinuationImpl(IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation0), 1);
        cancellableContinuationImpl0.initCancellability();
        l0 l00 = new l0(cancellableContinuationImpl0, this, function10);
        if(androidUiDispatcher0 == null || !Intrinsics.areEqual(androidUiDispatcher0.getChoreographer(), this.getChoreographer())) {
            this.getChoreographer().postFrameCallback(l00);
            cancellableContinuationImpl0.invokeOnCancellation(new o(15, this, l00));
        }
        else {
            androidUiDispatcher0.postFrameCallback$ui_release(l00);
            cancellableContinuationImpl0.invokeOnCancellation(new o(14, androidUiDispatcher0, l00));
        }
        Object object0 = cancellableContinuationImpl0.getResult();
        if(object0 == a.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation0);
        }
        return object0;
    }
}

