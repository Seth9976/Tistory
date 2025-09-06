package androidx.compose.ui.platform;

import android.os.Handler;
import android.view.Choreographer.FrameCallback;
import android.view.Choreographer;
import androidx.compose.runtime.MonotonicFrameClock;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.collections.ArrayDeque;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineDispatcher;
import md.c;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \u001C2\u00020\u0001:\u0001\u001CJ\u0017\u0010\u0007\u001A\u00020\u00042\u0006\u0010\u0003\u001A\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001A\u00020\u00042\u0006\u0010\u0003\u001A\u00020\u0002H\u0000¢\u0006\u0004\b\b\u0010\u0006J\u001F\u0010\u000E\u001A\u00020\u00042\u0006\u0010\u000B\u001A\u00020\n2\u0006\u0010\r\u001A\u00020\fH\u0016¢\u0006\u0004\b\u000E\u0010\u000FR\u0017\u0010\u0015\u001A\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001A\u0004\b\u0013\u0010\u0014R\u0017\u0010\u001B\u001A\u00020\u00168\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001A\u0004\b\u0019\u0010\u001A¨\u0006\u001D"}, d2 = {"Landroidx/compose/ui/platform/AndroidUiDispatcher;", "Lkotlinx/coroutines/CoroutineDispatcher;", "Landroid/view/Choreographer$FrameCallback;", "callback", "", "postFrameCallback$ui_release", "(Landroid/view/Choreographer$FrameCallback;)V", "postFrameCallback", "removeFrameCallback$ui_release", "removeFrameCallback", "Lkotlin/coroutines/CoroutineContext;", "context", "Ljava/lang/Runnable;", "block", "dispatch", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Runnable;)V", "Landroid/view/Choreographer;", "b", "Landroid/view/Choreographer;", "getChoreographer", "()Landroid/view/Choreographer;", "choreographer", "Landroidx/compose/runtime/MonotonicFrameClock;", "k", "Landroidx/compose/runtime/MonotonicFrameClock;", "getFrameClock", "()Landroidx/compose/runtime/MonotonicFrameClock;", "frameClock", "Companion", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nAndroidUiDispatcher.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidUiDispatcher.android.kt\nandroidx/compose/ui/platform/AndroidUiDispatcher\n+ 2 JvmActuals.jvm.kt\nandroidx/compose/ui/platform/JvmActuals_jvmKt\n*L\n1#1,191:1\n36#2:192\n36#2:193\n36#2:194\n36#2:195\n36#2:196\n36#2:197\n*S KotlinDebug\n*F\n+ 1 AndroidUiDispatcher.android.kt\nandroidx/compose/ui/platform/AndroidUiDispatcher\n*L\n73#1:192\n89#1:193\n99#1:194\n115#1:195\n125#1:196\n137#1:197\n*E\n"})
public final class AndroidUiDispatcher extends CoroutineDispatcher {
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u001B\u0010\u0007\u001A\u00020\u00028FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001A\u0004\b\u0005\u0010\u0006R\u0011\u0010\t\u001A\u00020\u00028F¢\u0006\u0006\u001A\u0004\b\b\u0010\u0006R\u001A\u0010\u000B\u001A\b\u0012\u0004\u0012\u00020\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000B\u0010\f¨\u0006\r"}, d2 = {"Landroidx/compose/ui/platform/AndroidUiDispatcher$Companion;", "", "Lkotlin/coroutines/CoroutineContext;", "Main$delegate", "Lkotlin/Lazy;", "getMain", "()Lkotlin/coroutines/CoroutineContext;", "Main", "getCurrentThread", "CurrentThread", "Ljava/lang/ThreadLocal;", "currentThread", "Ljava/lang/ThreadLocal;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        @NotNull
        public final CoroutineContext getCurrentThread() {
            if(AndroidUiDispatcher_androidKt.access$isMainThread()) {
                return this.getMain();
            }
            CoroutineContext coroutineContext0 = (CoroutineContext)AndroidUiDispatcher.m.get();
            if(coroutineContext0 == null) {
                throw new IllegalStateException("no AndroidUiDispatcher for this thread");
            }
            return coroutineContext0;
        }

        @NotNull
        public final CoroutineContext getMain() {
            return (CoroutineContext)AndroidUiDispatcher.l.getValue();
        }
    }

    public static final int $stable;
    @NotNull
    public static final Companion Companion;
    public final Choreographer b;
    public final Handler c;
    public final Object d;
    public final ArrayDeque e;
    public ArrayList f;
    public ArrayList g;
    public boolean h;
    public boolean i;
    public final AndroidUiDispatcher.dispatchCallback.1 j;
    public final AndroidUiFrameClock k;
    public static final Lazy l;
    public static final AndroidUiDispatcher.Companion.currentThread.1 m;

    static {
        AndroidUiDispatcher.Companion = new Companion(null);
        AndroidUiDispatcher.$stable = 8;
        AndroidUiDispatcher.l = c.lazy(y.G);
        AndroidUiDispatcher.m = new AndroidUiDispatcher.Companion.currentThread.1();  // 初始化器: Ljava/lang/ThreadLocal;-><init>()V
    }

    public AndroidUiDispatcher(Choreographer choreographer0, Handler handler0, DefaultConstructorMarker defaultConstructorMarker0) {
        this.b = choreographer0;
        this.c = handler0;
        this.d = new Object();
        this.e = new ArrayDeque();
        this.f = new ArrayList();
        this.g = new ArrayList();
        this.j = new AndroidUiDispatcher.dispatchCallback.1(this);
        this.k = new AndroidUiFrameClock(choreographer0, this);
    }

    public static final Handler access$getHandler$p(AndroidUiDispatcher androidUiDispatcher0) {
        return androidUiDispatcher0.c;
    }

    public static final Object access$getLock$p(AndroidUiDispatcher androidUiDispatcher0) {
        return androidUiDispatcher0.d;
    }

    public static final List access$getToRunOnFrame$p(AndroidUiDispatcher androidUiDispatcher0) {
        return androidUiDispatcher0.f;
    }

    public static final void access$performFrameDispatch(AndroidUiDispatcher androidUiDispatcher0, long v) {
        ArrayList arrayList0;
        synchronized(androidUiDispatcher0.d) {
            if(!androidUiDispatcher0.i) {
                return;
            }
            androidUiDispatcher0.i = false;
            arrayList0 = androidUiDispatcher0.f;
            androidUiDispatcher0.f = androidUiDispatcher0.g;
            androidUiDispatcher0.g = arrayList0;
        }
        int v2 = arrayList0.size();
        for(int v1 = 0; v1 < v2; ++v1) {
            ((Choreographer.FrameCallback)arrayList0.get(v1)).doFrame(v);
        }
        arrayList0.clear();
    }

    public static final void access$performTrampolineDispatch(AndroidUiDispatcher androidUiDispatcher0) {
        Runnable runnable0;
        boolean z;
        do {
            synchronized(androidUiDispatcher0.d) {
                runnable0 = (Runnable)androidUiDispatcher0.e.removeFirstOrNull();
            }
            while(runnable0 != null) {
                runnable0.run();
                synchronized(androidUiDispatcher0.d) {
                    runnable0 = (Runnable)androidUiDispatcher0.e.removeFirstOrNull();
                }
            }
            synchronized(androidUiDispatcher0.d) {
                if(androidUiDispatcher0.e.isEmpty()) {
                    z = false;
                    androidUiDispatcher0.h = false;
                }
                else {
                    z = true;
                }
            }
        }
        while(z);
    }

    public static final void access$setScheduledFrameDispatch$p(AndroidUiDispatcher androidUiDispatcher0, boolean z) {
        androidUiDispatcher0.i = z;
    }

    @Override  // kotlinx.coroutines.CoroutineDispatcher
    public void dispatch(@NotNull CoroutineContext coroutineContext0, @NotNull Runnable runnable0) {
        synchronized(this.d) {
            this.e.addLast(runnable0);
            if(!this.h) {
                this.h = true;
                this.c.post(this.j);
                if(!this.i) {
                    this.i = true;
                    this.b.postFrameCallback(this.j);
                }
            }
        }
    }

    @NotNull
    public final Choreographer getChoreographer() {
        return this.b;
    }

    @NotNull
    public final MonotonicFrameClock getFrameClock() {
        return this.k;
    }

    public final void postFrameCallback$ui_release(@NotNull Choreographer.FrameCallback choreographer$FrameCallback0) {
        synchronized(this.d) {
            this.f.add(choreographer$FrameCallback0);
            if(!this.i) {
                this.i = true;
                this.b.postFrameCallback(this.j);
            }
        }
    }

    public final void removeFrameCallback$ui_release(@NotNull Choreographer.FrameCallback choreographer$FrameCallback0) {
        synchronized(this.d) {
            this.f.remove(choreographer$FrameCallback0);
        }
    }
}

