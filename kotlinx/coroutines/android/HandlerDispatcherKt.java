package kotlinx.coroutines.android;

import android.os.Build.VERSION;
import android.os.Handler.Callback;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import androidx.annotation.VisibleForTesting;
import j2.k;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import qd.a;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000B\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\u001A\u001F\u0010\u0006\u001A\u00020\u0003*\u00020\u00002\n\b\u0002\u0010\u0002\u001A\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001A\u001B\u0010\n\u001A\u00020\u0000*\u00020\u00072\u0006\u0010\t\u001A\u00020\bH\u0001¢\u0006\u0004\b\n\u0010\u000B\u001A\u0013\u0010\r\u001A\u00020\fH\u0086@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000E\"\u001C\u0010\u000F\u001A\u0004\u0018\u00010\u00038\u0000X\u0081\u0004¢\u0006\f\n\u0004\b\u000F\u0010\u0010\u0012\u0004\b\u0011\u0010\u0012\"\u0018\u0010\u0014\u001A\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000E¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0016"}, d2 = {"Landroid/os/Handler;", "", "name", "Lkotlinx/coroutines/android/HandlerDispatcher;", "from", "(Landroid/os/Handler;Ljava/lang/String;)Lkotlinx/coroutines/android/HandlerDispatcher;", "asCoroutineDispatcher", "Landroid/os/Looper;", "", "async", "asHandler", "(Landroid/os/Looper;Z)Landroid/os/Handler;", "", "awaitFrame", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Main", "Lkotlinx/coroutines/android/HandlerDispatcher;", "getMain$annotations", "()V", "Landroid/view/Choreographer;", "choreographer", "Landroid/view/Choreographer;", "kotlinx-coroutines-android"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nHandlerDispatcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HandlerDispatcher.kt\nkotlinx/coroutines/android/HandlerDispatcherKt\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n+ 3 Runnable.kt\nkotlinx/coroutines/RunnableKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,217:1\n314#2,11:218\n314#2,9:229\n323#2,2:239\n17#3:238\n1#4:241\n*S KotlinDebug\n*F\n+ 1 HandlerDispatcher.kt\nkotlinx/coroutines/android/HandlerDispatcherKt\n*L\n189#1:218,11\n197#1:229,9\n197#1:239,2\n201#1:238\n*E\n"})
public final class HandlerDispatcherKt {
    @JvmField
    @Nullable
    public static final HandlerDispatcher Main;
    @Nullable
    private static volatile Choreographer choreographer;

    static {
        Object object1;
        Object object0 = null;
        try {
            object1 = Result.constructor-impl(new HandlerContext(HandlerDispatcherKt.asHandler(Looper.getMainLooper(), true), null, 2, null));
        }
        catch(Throwable throwable0) {
            object1 = Result.constructor-impl(ResultKt.createFailure(throwable0));
        }
        if(!Result.isFailure-impl(object1)) {
            object0 = object1;
        }
        HandlerDispatcherKt.Main = (HandlerDispatcher)object0;
    }

    public static final Object a(Continuation continuation0) {
        CancellableContinuationImpl cancellableContinuationImpl0 = new CancellableContinuationImpl(IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation0), 1);
        cancellableContinuationImpl0.initCancellability();
        if(Looper.myLooper() == Looper.getMainLooper()) {
            HandlerDispatcherKt.access$updateChoreographerAndPostFrameCallback(cancellableContinuationImpl0);
        }
        else {
            Dispatchers.getMain().dispatch(cancellableContinuationImpl0.getContext(), new HandlerDispatcherKt.awaitFrameSlowPath.lambda.3..inlined.Runnable.1(cancellableContinuationImpl0));
        }
        Object object0 = cancellableContinuationImpl0.getResult();
        if(object0 == a.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation0);
        }
        return object0;
    }

    public static final Object access$awaitFrameSlowPath(Continuation continuation0) {
        return HandlerDispatcherKt.a(continuation0);
    }

    public static final void access$postFrameCallback(Choreographer choreographer0, CancellableContinuation cancellableContinuation0) {
        choreographer0.postFrameCallback(new k(cancellableContinuation0, 2));
    }

    public static final void access$updateChoreographerAndPostFrameCallback(CancellableContinuation cancellableContinuation0) {
        Choreographer choreographer0 = HandlerDispatcherKt.choreographer;
        if(choreographer0 == null) {
            choreographer0 = Choreographer.getInstance();
            Intrinsics.checkNotNull(choreographer0);
            HandlerDispatcherKt.choreographer = choreographer0;
        }
        choreographer0.postFrameCallback(new k(cancellableContinuation0, 2));
    }

    @VisibleForTesting
    @NotNull
    public static final Handler asHandler(@NotNull Looper looper0, boolean z) {
        if(z) {
            Class class0 = Looper.class;
            Class class1 = Handler.class;
            if(Build.VERSION.SDK_INT >= 28) {
                Handler handler0 = Handler.createAsync(looper0);
                Intrinsics.checkNotNull(handler0, "null cannot be cast to non-null type android.os.Handler");
                return handler0;
            }
            try {
                return (Handler)class1.getDeclaredConstructor(class0, Handler.Callback.class, Boolean.TYPE).newInstance(looper0, 0, Boolean.TRUE);
            }
            catch(NoSuchMethodException unused_ex) {
                return new Handler(looper0);
            }
        }
        return new Handler(looper0);
    }

    @Nullable
    public static final Object awaitFrame(@NotNull Continuation continuation0) {
        Choreographer choreographer0 = HandlerDispatcherKt.choreographer;
        if(choreographer0 != null) {
            CancellableContinuationImpl cancellableContinuationImpl0 = new CancellableContinuationImpl(IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation0), 1);
            cancellableContinuationImpl0.initCancellability();
            HandlerDispatcherKt.access$postFrameCallback(choreographer0, cancellableContinuationImpl0);
            Object object0 = cancellableContinuationImpl0.getResult();
            if(object0 == a.getCOROUTINE_SUSPENDED()) {
                DebugProbesKt.probeCoroutineSuspended(continuation0);
            }
            return object0;
        }
        return HandlerDispatcherKt.a(continuation0);
    }

    @JvmName(name = "from")
    @JvmOverloads
    @NotNull
    public static final HandlerDispatcher from(@NotNull Handler handler0) {
        return HandlerDispatcherKt.from$default(handler0, null, 1, null);
    }

    @JvmName(name = "from")
    @JvmOverloads
    @NotNull
    public static final HandlerDispatcher from(@NotNull Handler handler0, @Nullable String s) {
        return new HandlerContext(handler0, s);
    }

    public static HandlerDispatcher from$default(Handler handler0, String s, int v, Object object0) {
        if((v & 1) != 0) {
            s = null;
        }
        return HandlerDispatcherKt.from(handler0, s);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Use Dispatchers.Main instead")
    public static void getMain$annotations() {
    }
}

