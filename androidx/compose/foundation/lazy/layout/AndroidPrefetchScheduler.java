package androidx.compose.foundation.lazy.layout;

import android.view.Choreographer.FrameCallback;
import android.view.Choreographer;
import android.view.Display;
import android.view.View;
import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.runtime.RememberObserver;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@ExperimentalFoundationApi
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u0000 \u00172\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0002\u0017\u0018B\u000F\u0012\u0006\u0010\u0006\u001A\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000F\u0010\n\u001A\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000BJ\u0017\u0010\u000E\u001A\u00020\t2\u0006\u0010\r\u001A\u00020\fH\u0016¢\u0006\u0004\b\u000E\u0010\u000FJ\u0017\u0010\u0012\u001A\u00020\t2\u0006\u0010\u0011\u001A\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000F\u0010\u0014\u001A\u00020\tH\u0016¢\u0006\u0004\b\u0014\u0010\u000BJ\u000F\u0010\u0015\u001A\u00020\tH\u0016¢\u0006\u0004\b\u0015\u0010\u000BJ\u000F\u0010\u0016\u001A\u00020\tH\u0016¢\u0006\u0004\b\u0016\u0010\u000B¨\u0006\u0019"}, d2 = {"Landroidx/compose/foundation/lazy/layout/AndroidPrefetchScheduler;", "Landroidx/compose/foundation/lazy/layout/PrefetchScheduler;", "Landroidx/compose/runtime/RememberObserver;", "Ljava/lang/Runnable;", "Landroid/view/Choreographer$FrameCallback;", "Landroid/view/View;", "view", "<init>", "(Landroid/view/View;)V", "", "run", "()V", "", "frameTimeNanos", "doFrame", "(J)V", "Landroidx/compose/foundation/lazy/layout/PrefetchRequest;", "prefetchRequest", "schedulePrefetch", "(Landroidx/compose/foundation/lazy/layout/PrefetchRequest;)V", "onRemembered", "onForgotten", "onAbandoned", "Companion", "PrefetchRequestScopeImpl", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nPrefetchScheduler.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PrefetchScheduler.android.kt\nandroidx/compose/foundation/lazy/layout/AndroidPrefetchScheduler\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,219:1\n1208#2:220\n1187#2,2:221\n523#3:223\n1#4:224\n*S KotlinDebug\n*F\n+ 1 PrefetchScheduler.android.kt\nandroidx/compose/foundation/lazy/layout/AndroidPrefetchScheduler\n*L\n103#1:220\n103#1:221,2\n133#1:223\n*E\n"})
public final class AndroidPrefetchScheduler implements Choreographer.FrameCallback, PrefetchScheduler, RememberObserver, Runnable {
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0016\u0010\u0003\u001A\u00020\u00028\u0002@\u0002X\u0082\u000E¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/foundation/lazy/layout/AndroidPrefetchScheduler$Companion;", "", "", "frameIntervalNs", "J", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        public static final void access$calculateFrameIntervalIfNeeded(Companion androidPrefetchScheduler$Companion0, View view0) {
            float f;
            androidPrefetchScheduler$Companion0.getClass();
            Display display0 = view0.getDisplay();
            if(view0.isInEditMode() || display0 == null) {
                f = 60.0f;
            }
            else {
                f = display0.getRefreshRate();
                if(f < 30.0f) {
                    f = 60.0f;
                }
            }
            AndroidPrefetchScheduler.g = (long)(1000000000.0f / f);
        }
    }

    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000F\u0010\u0006\u001A\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/compose/foundation/lazy/layout/AndroidPrefetchScheduler$PrefetchRequestScopeImpl;", "Landroidx/compose/foundation/lazy/layout/PrefetchRequestScope;", "", "nextFrameTimeNs", "<init>", "(J)V", "availableTimeNanos", "()J", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class PrefetchRequestScopeImpl implements PrefetchRequestScope {
        public static final int $stable;
        public final long a;

        public PrefetchRequestScopeImpl(long v) {
            this.a = v;
        }

        @Override  // androidx.compose.foundation.lazy.layout.PrefetchRequestScope
        public long availableTimeNanos() {
            return Math.max(0L, this.a - System.nanoTime());
        }
    }

    public static final int $stable;
    @NotNull
    public static final Companion Companion;
    public final View a;
    public final MutableVector b;
    public boolean c;
    public final Choreographer d;
    public boolean e;
    public long f;
    public static long g;

    static {
        AndroidPrefetchScheduler.Companion = new Companion(null);
        AndroidPrefetchScheduler.$stable = 8;
    }

    public AndroidPrefetchScheduler(@NotNull View view0) {
        this.a = view0;
        this.b = new MutableVector(new PrefetchRequest[16], 0);
        this.d = Choreographer.getInstance();
        Companion.access$calculateFrameIntervalIfNeeded(AndroidPrefetchScheduler.Companion, view0);
    }

    public static final long access$getFrameIntervalNs$cp() [...] // 潜在的解密器

    @Override  // android.view.Choreographer$FrameCallback
    public void doFrame(long v) {
        if(this.e) {
            this.f = v;
            this.a.post(this);
        }
    }

    @Override  // androidx.compose.runtime.RememberObserver
    public void onAbandoned() {
    }

    @Override  // androidx.compose.runtime.RememberObserver
    public void onForgotten() {
        this.e = false;
        this.a.removeCallbacks(this);
        this.d.removeFrameCallback(this);
    }

    @Override  // androidx.compose.runtime.RememberObserver
    public void onRemembered() {
        this.e = true;
    }

    @Override
    public void run() {
        MutableVector mutableVector0 = this.b;
        if(!mutableVector0.isEmpty() && this.c && this.e && this.a.getWindowVisibility() == 0) {
            PrefetchRequestScopeImpl androidPrefetchScheduler$PrefetchRequestScopeImpl0 = new PrefetchRequestScopeImpl(this.f + AndroidPrefetchScheduler.g);
            boolean z = false;
            while(mutableVector0.isNotEmpty() && !z) {
                if(Long.compare(androidPrefetchScheduler$PrefetchRequestScopeImpl0.availableTimeNanos(), 0L) <= 0 || ((PrefetchRequest)mutableVector0.getContent()[0]).execute(androidPrefetchScheduler$PrefetchRequestScopeImpl0)) {
                    z = true;
                }
                else {
                    mutableVector0.removeAt(0);
                }
            }
            if(z) {
                this.d.postFrameCallback(this);
                return;
            }
            this.c = false;
            return;
        }
        this.c = false;
    }

    @Override  // androidx.compose.foundation.lazy.layout.PrefetchScheduler
    public void schedulePrefetch(@NotNull PrefetchRequest prefetchRequest0) {
        this.b.add(prefetchRequest0);
        if(!this.c) {
            this.c = true;
            this.a.post(this);
        }
    }
}

