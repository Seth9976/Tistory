package androidx.compose.foundation.layout;

import android.graphics.Insets;
import android.os.CancellationSignal;
import android.view.View;
import android.view.WindowInsetsAnimationControlListener;
import android.view.WindowInsetsAnimationController;
import android.view.WindowInsetsController;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Velocity;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.internal.Ref.FloatRef;
import kotlin.ranges.c;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import qd.a;

public final class n4 implements WindowInsetsAnimationControlListener, NestedScrollConnection {
    public final AndroidWindowInsets a;
    public final View b;
    public final SideCalculator c;
    public final Density d;
    public WindowInsetsAnimationController e;
    public boolean f;
    public final CancellationSignal g;
    public float h;
    public Job i;
    public CancellableContinuationImpl j;

    public n4(AndroidWindowInsets androidWindowInsets0, View view0, SideCalculator sideCalculator0, Density density0) {
        this.a = androidWindowInsets0;
        this.b = view0;
        this.c = sideCalculator0;
        this.d = density0;
        this.g = new CancellationSignal();
    }

    public final void a() {
        if(this.e != null && this.e.isReady()) {
            WindowInsetsAnimationController windowInsetsAnimationController0 = this.e;
            if(windowInsetsAnimationController0 != null) {
                windowInsetsAnimationController0.finish(this.a.isVisible());
            }
        }
        this.e = null;
        CancellableContinuationImpl cancellableContinuationImpl0 = this.j;
        if(cancellableContinuationImpl0 != null) {
            cancellableContinuationImpl0.resume(null, f4.x);
        }
        this.j = null;
        Job job0 = this.i;
        if(job0 != null) {
            job0.cancel(new b4(0));
        }
        this.i = null;
        this.h = 0.0f;
        this.f = false;
    }

    public final Object b(long v, float f, boolean z, Continuation continuation0) {
        n4 n42;
        long v4;
        float f1;
        g4 g40;
        if(continuation0 instanceof g4) {
            g40 = (g4)continuation0;
            int v1 = g40.u;
            if((v1 & 0x80000000) == 0) {
                g40 = new g4(this, continuation0);
            }
            else {
                g40.u = v1 ^ 0x80000000;
            }
        }
        else {
            g40 = new g4(this, continuation0);
        }
        WindowInsetsAnimationController windowInsetsAnimationController0 = g40.s;
        Object object0 = a.getCOROUTINE_SUSPENDED();
        switch(g40.u) {
            case 0: {
                ResultKt.throwOnFailure(windowInsetsAnimationController0);
                Job job0 = this.i;
                if(job0 != null) {
                    job0.cancel(new b4(0));
                }
                this.i = null;
                this.h = 0.0f;
                if(f == 0.0f && !z || this.e == null && this.a.isVisible() == z) {
                    return Velocity.box-impl(0L);
                }
                g40.o = this;
                g40.q = v;
                g40.r = f;
                g40.u = 1;
                WindowInsetsAnimationController windowInsetsAnimationController1 = this.e;
                if(windowInsetsAnimationController1 == null) {
                    CancellableContinuationImpl cancellableContinuationImpl0 = new CancellableContinuationImpl(IntrinsicsKt__IntrinsicsJvmKt.intercepted(g40), 1);
                    cancellableContinuationImpl0.initCancellability();
                    this.j = cancellableContinuationImpl0;
                    this.c();
                    windowInsetsAnimationController1 = cancellableContinuationImpl0.getResult();
                    if(windowInsetsAnimationController1 == a.getCOROUTINE_SUSPENDED()) {
                        DebugProbesKt.probeCoroutineSuspended(g40);
                    }
                }
                if(windowInsetsAnimationController1 == object0) {
                    return object0;
                }
                f1 = f;
                v4 = v;
                windowInsetsAnimationController0 = windowInsetsAnimationController1;
                n42 = this;
                break;
            }
            case 1: {
                float f2 = g40.r;
                v4 = g40.q;
                n42 = g40.o;
                ResultKt.throwOnFailure(windowInsetsAnimationController0);
                f1 = f2;
                break;
            }
            case 2: {
                long v2 = g40.q;
                FloatRef ref$FloatRef0 = g40.p;
                n4 n40 = g40.o;
                ResultKt.throwOnFailure(windowInsetsAnimationController0);
                return Velocity.box-impl(n40.c.consumedVelocity-QWom1Mo(v2, ref$FloatRef0.element));
            }
            case 3: {
                long v3 = g40.q;
                n4 n41 = g40.o;
                ResultKt.throwOnFailure(windowInsetsAnimationController0);
                return Velocity.box-impl(n41.c.consumedVelocity-QWom1Mo(v3, 0.0f));
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        if(windowInsetsAnimationController0 == null) {
            return Velocity.box-impl(0L);
        }
        Insets insets0 = windowInsetsAnimationController0.getHiddenStateInsets();
        int v5 = n42.c.valueOf(insets0);
        Insets insets1 = windowInsetsAnimationController0.getShownStateInsets();
        int v6 = n42.c.valueOf(insets1);
        Insets insets2 = windowInsetsAnimationController0.getCurrentInsets();
        int v7 = n42.c.valueOf(insets2);
        if(Float.compare(f1, 0.0f) <= 0 && v7 == v5 || f1 >= 0.0f && v7 == v6) {
            windowInsetsAnimationController0.finish(v7 == v6);
            n42.e = null;
            return Velocity.box-impl(0L);
        }
        w3 w30 = new w3(n42.d);
        float f3 = w30.a(f1) + ((float)v7);
        boolean z1 = (f3 - ((float)v5)) / ((float)(v6 - v5)) > 0.5f;
        if(f3 <= ((float)v6) && f3 >= ((float)v5)) {
            m4 m40 = new m4(f1, v7, (z1 ? v6 : v5), windowInsetsAnimationController0, n42, null, z1);
            g40.o = n42;
            g40.q = v4;
            g40.u = 3;
            return CoroutineScopeKt.coroutineScope(m40, g40) == object0 ? object0 : Velocity.box-impl(n42.c.consumedVelocity-QWom1Mo(v4, 0.0f));
        }
        FloatRef ref$FloatRef1 = new FloatRef();
        j4 j40 = new j4(f1, v7, v5, v6, windowInsetsAnimationController0, w30, n42, null, ref$FloatRef1, z1);
        g40.o = n42;
        g40.p = ref$FloatRef1;
        g40.q = v4;
        g40.u = 2;
        return CoroutineScopeKt.coroutineScope(j40, g40) == object0 ? object0 : Velocity.box-impl(n42.c.consumedVelocity-QWom1Mo(v4, ref$FloatRef1.element));
    }

    public final void c() {
        if(!this.f) {
            this.f = true;
            WindowInsetsController windowInsetsController0 = this.b.getWindowInsetsController();
            if(windowInsetsController0 != null) {
                e4.s(windowInsetsController0, this.a.getType$foundation_layout_release(), this.g, this);
            }
        }
    }

    public final long d(float f, long v) {
        Job job0 = this.i;
        if(job0 != null) {
            job0.cancel(new b4(0));
            this.i = null;
        }
        WindowInsetsAnimationController windowInsetsAnimationController0 = this.e;
        if(f != 0.0f) {
            int v1 = Float.compare(f, 0.0f);
            if(this.a.isVisible() != v1 > 0 || windowInsetsAnimationController0 != null) {
                if(windowInsetsAnimationController0 == null) {
                    this.h = 0.0f;
                    this.c();
                    return this.c.consumedOffsets-MK-Hz9U(v);
                }
                Insets insets0 = windowInsetsAnimationController0.getHiddenStateInsets();
                int v2 = this.c.valueOf(insets0);
                Insets insets1 = windowInsetsAnimationController0.getShownStateInsets();
                int v3 = this.c.valueOf(insets1);
                Insets insets2 = windowInsetsAnimationController0.getCurrentInsets();
                int v4 = this.c.valueOf(insets2);
                if(v4 == (v1 <= 0 ? v2 : v3)) {
                    this.h = 0.0f;
                    return 0L;
                }
                float f1 = ((float)v4) + f + this.h;
                int v5 = c.coerceIn(Math.round(f1), v2, v3);
                this.h = f1 - ((float)Math.round(f1));
                if(v5 != v4) {
                    e4.p(windowInsetsAnimationController0, this.c.adjustInsets(insets2, v5));
                }
                return this.c.consumedOffsets-MK-Hz9U(v);
            }
        }
        return 0L;
    }

    @Override  // android.view.WindowInsetsAnimationControlListener
    public final void onCancelled(WindowInsetsAnimationController windowInsetsAnimationController0) {
        this.a();
    }

    @Override  // android.view.WindowInsetsAnimationControlListener
    public final void onFinished(WindowInsetsAnimationController windowInsetsAnimationController0) {
        this.a();
    }

    @Override  // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    public final Object onPostFling-RZ2iAVY(long v, long v1, Continuation continuation0) {
        return this.b(v1, this.c.showMotion(Velocity.getX-impl(v1), Velocity.getY-impl(v1)), true, continuation0);
    }

    @Override  // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    public final long onPostScroll-DzOQY0M(long v, long v1, int v2) {
        return this.d(this.c.showMotion(Offset.getX-impl(v1), Offset.getY-impl(v1)), v1);
    }

    @Override  // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    public final Object onPreFling-QWom1Mo(long v, Continuation continuation0) {
        return this.b(v, this.c.hideMotion(Velocity.getX-impl(v), Velocity.getY-impl(v)), false, continuation0);
    }

    @Override  // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    public final long onPreScroll-OzD1aCk(long v, int v1) {
        return this.d(this.c.hideMotion(Offset.getX-impl(v), Offset.getY-impl(v)), v);
    }

    @Override  // android.view.WindowInsetsAnimationControlListener
    public final void onReady(WindowInsetsAnimationController windowInsetsAnimationController0, int v) {
        this.e = windowInsetsAnimationController0;
        this.f = false;
        CancellableContinuationImpl cancellableContinuationImpl0 = this.j;
        if(cancellableContinuationImpl0 != null) {
            cancellableContinuationImpl0.resume(windowInsetsAnimationController0, f4.z);
        }
        this.j = null;
    }
}

