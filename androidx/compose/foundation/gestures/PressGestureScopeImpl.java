package androidx.compose.foundation.gestures;

import androidx.compose.runtime.Stable;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DpRect;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlinx.coroutines.sync.Mutex.DefaultImpls;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import qd.a;
import z.r1;
import z.s1;
import z.t1;

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000B\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u00A2\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\n\u001A\u00020\u0007*\u00020\u0006H\u0097\u0001\u00F8\u0001\u0000\u00A2\u0006\u0004\b\b\u0010\tJ\u0017\u0010\n\u001A\u00020\u0007*\u00020\u000BH\u0097\u0001\u00F8\u0001\u0000\u00A2\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001A\u00020\u0006*\u00020\u000BH\u0097\u0001\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u000E\u0010\u000FJ\u001A\u0010\u0010\u001A\u00020\u0006*\u00020\u0011H\u0097\u0001\u00F8\u0001\u0001\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u0012\u0010\u0013J\u001A\u0010\u0010\u001A\u00020\u0006*\u00020\u0007H\u0097\u0001\u00F8\u0001\u0001\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u0012\u0010\u0014J\u0017\u0010\u0019\u001A\u00020\u0016*\u00020\u0015H\u0097\u0001\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001B\u001A\u00020\u0011*\u00020\u0006H\u0097\u0001\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u001A\u0010\u0013J\u0017\u0010\u001B\u001A\u00020\u0011*\u00020\u000BH\u0097\u0001\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u001C\u0010\u000FJ\u0014\u0010\u001F\u001A\u00020\u001E*\u00020\u001DH\u0097\u0001\u00A2\u0006\u0004\b\u001F\u0010 J\u0017\u0010\"\u001A\u00020\u0015*\u00020\u0016H\u0097\u0001\u00F8\u0001\u0000\u00A2\u0006\u0004\b!\u0010\u0018J\u0017\u0010%\u001A\u00020\u000B*\u00020\u0006H\u0097\u0001\u00F8\u0001\u0000\u00A2\u0006\u0004\b#\u0010$J\u001A\u0010%\u001A\u00020\u000B*\u00020\u0011H\u0097\u0001\u00F8\u0001\u0001\u00F8\u0001\u0000\u00A2\u0006\u0004\b&\u0010$J\u001A\u0010%\u001A\u00020\u000B*\u00020\u0007H\u0097\u0001\u00F8\u0001\u0001\u00F8\u0001\u0000\u00A2\u0006\u0004\b&\u0010\'J\r\u0010)\u001A\u00020(\u00A2\u0006\u0004\b)\u0010*J\r\u0010+\u001A\u00020(\u00A2\u0006\u0004\b+\u0010*J\u0010\u0010,\u001A\u00020(H\u0086@\u00A2\u0006\u0004\b,\u0010-J\u0010\u0010.\u001A\u00020(H\u0096@\u00A2\u0006\u0004\b.\u0010-J\u0010\u00100\u001A\u00020/H\u0096@\u00A2\u0006\u0004\b0\u0010-R\u0014\u0010\u0003\u001A\u00020\u00118\u0016X\u0097\u0005\u00A2\u0006\u0006\u001A\u0004\b1\u00102R\u0014\u00104\u001A\u00020\u00118\u0016X\u0097\u0005\u00A2\u0006\u0006\u001A\u0004\b3\u00102\u0082\u0002\u000B\n\u0005\b\u00A1\u001E0\u0001\n\u0002\b!\u00A8\u00065"}, d2 = {"Landroidx/compose/foundation/gestures/PressGestureScopeImpl;", "Landroidx/compose/foundation/gestures/PressGestureScope;", "Landroidx/compose/ui/unit/Density;", "density", "<init>", "(Landroidx/compose/ui/unit/Density;)V", "Landroidx/compose/ui/unit/Dp;", "", "roundToPx-0680j_4", "(F)I", "roundToPx", "Landroidx/compose/ui/unit/TextUnit;", "roundToPx--R2X_6o", "(J)I", "toDp-GaN1DYA", "(J)F", "toDp", "", "toDp-u2uoSUM", "(F)F", "(I)F", "Landroidx/compose/ui/geometry/Size;", "Landroidx/compose/ui/unit/DpSize;", "toDpSize-k-rfVVM", "(J)J", "toDpSize", "toPx-0680j_4", "toPx", "toPx--R2X_6o", "Landroidx/compose/ui/unit/DpRect;", "Landroidx/compose/ui/geometry/Rect;", "toRect", "(Landroidx/compose/ui/unit/DpRect;)Landroidx/compose/ui/geometry/Rect;", "toSize-XkaWNTQ", "toSize", "toSp-0xMU5do", "(F)J", "toSp", "toSp-kPz2Gy4", "(I)J", "", "cancel", "()V", "release", "reset", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "awaitRelease", "", "tryAwaitRelease", "getDensity", "()F", "getFontScale", "fontScale", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class PressGestureScopeImpl implements PressGestureScope, Density {
    public static final int $stable;
    public final Density a;
    public boolean b;
    public boolean c;
    public final Mutex d;

    public PressGestureScopeImpl(@NotNull Density density0) {
        this.a = density0;
        this.d = MutexKt.Mutex(false);
    }

    @Override  // androidx.compose.foundation.gestures.PressGestureScope
    @Nullable
    public Object awaitRelease(@NotNull Continuation continuation0) {
        r1 r10;
        if(continuation0 instanceof r1) {
            r10 = (r1)continuation0;
            int v = r10.q;
            if((v & 0x80000000) == 0) {
                r10 = new r1(this, continuation0);
            }
            else {
                r10.q = v ^ 0x80000000;
            }
        }
        else {
            r10 = new r1(this, continuation0);
        }
        Object object0 = r10.o;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(r10.q) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                r10.q = 1;
                object0 = this.tryAwaitRelease(r10);
                if(object0 == object1) {
                    return object1;
                }
                break;
            }
            case 1: {
                ResultKt.throwOnFailure(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        if(!((Boolean)object0).booleanValue()) {
            throw new GestureCancellationException("The press gesture was canceled.");
        }
        return Unit.INSTANCE;
    }

    public final void cancel() {
        this.c = true;
        DefaultImpls.unlock$default(this.d, null, 1, null);
    }

    @Override  // androidx.compose.ui.unit.Density
    public float getDensity() {
        return this.a.getDensity();
    }

    @Override  // androidx.compose.ui.unit.FontScaling
    public float getFontScale() {
        return this.a.getFontScale();
    }

    public final void release() {
        this.b = true;
        DefaultImpls.unlock$default(this.d, null, 1, null);
    }

    @Nullable
    public final Object reset(@NotNull Continuation continuation0) {
        PressGestureScopeImpl pressGestureScopeImpl0;
        s1 s10;
        if(continuation0 instanceof s1) {
            s10 = (s1)continuation0;
            int v = s10.r;
            if((v & 0x80000000) == 0) {
                s10 = new s1(this, continuation0);
            }
            else {
                s10.r = v ^ 0x80000000;
            }
        }
        else {
            s10 = new s1(this, continuation0);
        }
        Object object0 = s10.p;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(s10.r) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                s10.o = this;
                s10.r = 1;
                if(DefaultImpls.lock$default(this.d, null, s10, 1, null) == object1) {
                    return object1;
                }
                pressGestureScopeImpl0 = this;
                break;
            }
            case 1: {
                pressGestureScopeImpl0 = s10.o;
                ResultKt.throwOnFailure(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        pressGestureScopeImpl0.b = false;
        pressGestureScopeImpl0.c = false;
        return Unit.INSTANCE;
    }

    @Override  // androidx.compose.ui.unit.Density
    @Stable
    public int roundToPx--R2X_6o(long v) {
        return this.a.roundToPx--R2X_6o(v);
    }

    @Override  // androidx.compose.ui.unit.Density
    @Stable
    public int roundToPx-0680j_4(float f) {
        return this.a.roundToPx-0680j_4(f);
    }

    @Override  // androidx.compose.ui.unit.FontScaling
    @Stable
    public float toDp-GaN1DYA(long v) {
        return this.a.toDp-GaN1DYA(v);
    }

    @Override  // androidx.compose.ui.unit.Density
    @Stable
    public float toDp-u2uoSUM(float f) {
        return this.a.toDp-u2uoSUM(f);
    }

    @Override  // androidx.compose.ui.unit.Density
    @Stable
    public float toDp-u2uoSUM(int v) {
        return this.a.toDp-u2uoSUM(v);
    }

    @Override  // androidx.compose.ui.unit.Density
    @Stable
    public long toDpSize-k-rfVVM(long v) {
        return this.a.toDpSize-k-rfVVM(v);
    }

    @Override  // androidx.compose.ui.unit.Density
    @Stable
    public float toPx--R2X_6o(long v) {
        return this.a.toPx--R2X_6o(v);
    }

    @Override  // androidx.compose.ui.unit.Density
    @Stable
    public float toPx-0680j_4(float f) {
        return this.a.toPx-0680j_4(f);
    }

    @Override  // androidx.compose.ui.unit.Density
    @Stable
    @NotNull
    public Rect toRect(@NotNull DpRect dpRect0) {
        return this.a.toRect(dpRect0);
    }

    @Override  // androidx.compose.ui.unit.Density
    @Stable
    public long toSize-XkaWNTQ(long v) {
        return this.a.toSize-XkaWNTQ(v);
    }

    @Override  // androidx.compose.ui.unit.FontScaling
    @Stable
    public long toSp-0xMU5do(float f) {
        return this.a.toSp-0xMU5do(f);
    }

    @Override  // androidx.compose.ui.unit.Density
    @Stable
    public long toSp-kPz2Gy4(float f) {
        return this.a.toSp-kPz2Gy4(f);
    }

    @Override  // androidx.compose.ui.unit.Density
    @Stable
    public long toSp-kPz2Gy4(int v) {
        return this.a.toSp-kPz2Gy4(v);
    }

    @Override  // androidx.compose.foundation.gestures.PressGestureScope
    @Nullable
    public Object tryAwaitRelease(@NotNull Continuation continuation0) {
        PressGestureScopeImpl pressGestureScopeImpl0;
        t1 t10;
        if(continuation0 instanceof t1) {
            t10 = (t1)continuation0;
            int v = t10.r;
            if((v & 0x80000000) == 0) {
                t10 = new t1(this, continuation0);
            }
            else {
                t10.r = v ^ 0x80000000;
            }
        }
        else {
            t10 = new t1(this, continuation0);
        }
        Object object0 = t10.p;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(t10.r) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                if(!this.b && !this.c) {
                    t10.o = this;
                    t10.r = 1;
                    if(DefaultImpls.lock$default(this.d, null, t10, 1, null) == object1) {
                        return object1;
                    }
                    pressGestureScopeImpl0 = this;
                    break;
                }
                return Boxing.boxBoolean(this.b);
            }
            case 1: {
                pressGestureScopeImpl0 = t10.o;
                ResultKt.throwOnFailure(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        DefaultImpls.unlock$default(pressGestureScopeImpl0.d, null, 1, null);
        return Boxing.boxBoolean(pressGestureScopeImpl0.b);
    }
}

