package kotlinx.coroutines.android;

import android.os.Handler;
import android.os.Looper;
import j0.b2;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.c;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.Delay;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.DisposableHandle;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.MainCoroutineDispatcher;
import kotlinx.coroutines.NonDisposableHandle;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tf.a;

@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u001D\b\u0016\u0012\u0006\u0010\u0004\u001A\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001A\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001A\u00020\u000B2\u0006\u0010\n\u001A\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ#\u0010\u0012\u001A\u00020\u00112\u0006\u0010\n\u001A\u00020\t2\n\u0010\u0010\u001A\u00060\u000Ej\u0002`\u000FH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J%\u0010\u0018\u001A\u00020\u00112\u0006\u0010\u0015\u001A\u00020\u00142\f\u0010\u0017\u001A\b\u0012\u0004\u0012\u00020\u00110\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J+\u0010\u001B\u001A\u00020\u001A2\u0006\u0010\u0015\u001A\u00020\u00142\n\u0010\u0010\u001A\u00060\u000Ej\u0002`\u000F2\u0006\u0010\n\u001A\u00020\tH\u0016¢\u0006\u0004\b\u001B\u0010\u001CJ\u000F\u0010\u001D\u001A\u00020\u0005H\u0016¢\u0006\u0004\b\u001D\u0010\u001EJ\u001A\u0010!\u001A\u00020\u000B2\b\u0010 \u001A\u0004\u0018\u00010\u001FH\u0096\u0002¢\u0006\u0004\b!\u0010\"J\u000F\u0010$\u001A\u00020#H\u0016¢\u0006\u0004\b$\u0010%R\u0018\u0010&\u001A\u0004\u0018\u00010\u00008\u0002@\u0002X\u0082\u000E¢\u0006\u0006\n\u0004\b&\u0010\'R\u001A\u0010+\u001A\u00020\u00008\u0016X\u0096\u0004¢\u0006\f\n\u0004\b(\u0010\'\u001A\u0004\b)\u0010*¨\u0006,"}, d2 = {"Lkotlinx/coroutines/android/HandlerContext;", "Lkotlinx/coroutines/android/HandlerDispatcher;", "Lkotlinx/coroutines/Delay;", "Landroid/os/Handler;", "handler", "", "name", "<init>", "(Landroid/os/Handler;Ljava/lang/String;)V", "Lkotlin/coroutines/CoroutineContext;", "context", "", "isDispatchNeeded", "(Lkotlin/coroutines/CoroutineContext;)Z", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "", "dispatch", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Runnable;)V", "", "timeMillis", "Lkotlinx/coroutines/CancellableContinuation;", "continuation", "scheduleResumeAfterDelay", "(JLkotlinx/coroutines/CancellableContinuation;)V", "Lkotlinx/coroutines/DisposableHandle;", "invokeOnTimeout", "(JLjava/lang/Runnable;Lkotlin/coroutines/CoroutineContext;)Lkotlinx/coroutines/DisposableHandle;", "toString", "()Ljava/lang/String;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "_immediate", "Lkotlinx/coroutines/android/HandlerContext;", "e", "getImmediate", "()Lkotlinx/coroutines/android/HandlerContext;", "immediate", "kotlinx-coroutines-android"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nHandlerDispatcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HandlerDispatcher.kt\nkotlinx/coroutines/android/HandlerContext\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Runnable.kt\nkotlinx/coroutines/RunnableKt\n*L\n1#1,217:1\n1#2:218\n17#3:219\n*S KotlinDebug\n*F\n+ 1 HandlerDispatcher.kt\nkotlinx/coroutines/android/HandlerContext\n*L\n147#1:219\n*E\n"})
public final class HandlerContext extends HandlerDispatcher implements Delay {
    @Nullable
    private volatile HandlerContext _immediate;
    public final Handler b;
    public final String c;
    public final boolean d;
    public final HandlerContext e;

    public HandlerContext(@NotNull Handler handler0, @Nullable String s) {
        this(handler0, s, false);
    }

    public HandlerContext(Handler handler0, String s, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v & 2) != 0) {
            s = null;
        }
        this(handler0, s);
    }

    public HandlerContext(Handler handler0, String s, boolean z) {
        HandlerContext handlerContext0 = null;
        super(null);
        this.b = handler0;
        this.c = s;
        this.d = z;
        if(z) {
            handlerContext0 = this;
        }
        this._immediate = handlerContext0;
        HandlerContext handlerContext1 = this._immediate;
        if(handlerContext1 == null) {
            handlerContext1 = new HandlerContext(handler0, s, true);
            this._immediate = handlerContext1;
        }
        this.e = handlerContext1;
    }

    public final void a(CoroutineContext coroutineContext0, Runnable runnable0) {
        JobKt.cancel(coroutineContext0, new CancellationException("The task was rejected, the handler underlying the dispatcher \'" + this + "\' was closed"));
        Dispatchers.getIO().dispatch(coroutineContext0, runnable0);
    }

    public static final Handler access$getHandler$p(HandlerContext handlerContext0) {
        return handlerContext0.b;
    }

    @Override  // kotlinx.coroutines.CoroutineDispatcher
    public void dispatch(@NotNull CoroutineContext coroutineContext0, @NotNull Runnable runnable0) {
        if(!this.b.post(runnable0)) {
            this.a(coroutineContext0, runnable0);
        }
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        return object0 instanceof HandlerContext && ((HandlerContext)object0).b == this.b;
    }

    @Override  // kotlinx.coroutines.MainCoroutineDispatcher
    public MainCoroutineDispatcher getImmediate() {
        return this.getImmediate();
    }

    @NotNull
    public HandlerContext getImmediate() {
        return this.e;
    }

    @Override  // kotlinx.coroutines.android.HandlerDispatcher
    public HandlerDispatcher getImmediate() {
        return this.getImmediate();
    }

    @Override
    public int hashCode() {
        return System.identityHashCode(this.b);
    }

    @Override  // kotlinx.coroutines.android.HandlerDispatcher, kotlinx.coroutines.Delay
    @NotNull
    public DisposableHandle invokeOnTimeout(long v, @NotNull Runnable runnable0, @NotNull CoroutineContext coroutineContext0) {
        if(this.b.postDelayed(runnable0, c.coerceAtMost(v, 0x3FFFFFFFFFFFFFFFL))) {
            return new a(0, this, runnable0);
        }
        this.a(coroutineContext0, runnable0);
        return NonDisposableHandle.INSTANCE;
    }

    // 去混淆评级： 低(20)
    @Override  // kotlinx.coroutines.CoroutineDispatcher
    public boolean isDispatchNeeded(@NotNull CoroutineContext coroutineContext0) {
        return !this.d || !Intrinsics.areEqual(Looper.myLooper(), this.b.getLooper());
    }

    @Override  // kotlinx.coroutines.Delay
    public void scheduleResumeAfterDelay(long v, @NotNull CancellableContinuation cancellableContinuation0) {
        kotlinx.coroutines.android.HandlerContext.scheduleResumeAfterDelay..inlined.Runnable.1 handlerContext$scheduleResumeAfterDelay$$inlined$Runnable$10 = new Runnable() {
            @Override
            public final void run() {
                this.resumeUndispatched(this.b, Unit.INSTANCE);
            }
        };
        if(this.b.postDelayed(handlerContext$scheduleResumeAfterDelay$$inlined$Runnable$10, c.coerceAtMost(v, 0x3FFFFFFFFFFFFFFFL))) {
            cancellableContinuation0.invokeOnCancellation(new b2(27, this, handlerContext$scheduleResumeAfterDelay$$inlined$Runnable$10));
            return;
        }
        this.a(cancellableContinuation0.getContext(), handlerContext$scheduleResumeAfterDelay$$inlined$Runnable$10);
    }

    @Override  // kotlinx.coroutines.MainCoroutineDispatcher
    @NotNull
    public String toString() {
        String s = this.toStringInternalImpl();
        if(s == null) {
            s = this.c == null ? this.b.toString() : this.c;
            return this.d ? s + ".immediate" : s;
        }
        return s;
    }
}

