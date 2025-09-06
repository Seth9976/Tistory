package androidx.compose.material3.pulltorefresh;

import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.input.nestedscroll.NestedScrollNodeKt;
import androidx.compose.ui.input.nestedscroll.NestedScrollSource;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt;
import androidx.compose.ui.node.DelegatableNode;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Velocity;
import androidx.compose.ui.unit.VelocityKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.c;
import kotlinx.coroutines.BuildersKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import qd.a;
import x0.h;
import x0.i;
import x0.j;
import x0.k;
import x0.l;
import x0.m;
import x0.n;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u001F\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B5\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u0012\f\u0010\b\u001A\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\t\u001A\u00020\u0004\u0012\u0006\u0010\u000B\u001A\u00020\n\u0012\u0006\u0010\r\u001A\u00020\f¢\u0006\u0004\b\u000E\u0010\u000FJ\u000F\u0010\u0010\u001A\u00020\u0007H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\"\u0010\u0018\u001A\u00020\u00122\u0006\u0010\u0013\u001A\u00020\u00122\u0006\u0010\u0015\u001A\u00020\u0014H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017J*\u0010\u001C\u001A\u00020\u00122\u0006\u0010\u0019\u001A\u00020\u00122\u0006\u0010\u0013\u001A\u00020\u00122\u0006\u0010\u0015\u001A\u00020\u0014H\u0016ø\u0001\u0000¢\u0006\u0004\b\u001A\u0010\u001BJ\u001B\u0010 \u001A\u00020\u001D2\u0006\u0010\u0013\u001A\u00020\u001DH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u001E\u0010\u001FJ\r\u0010!\u001A\u00020\u0007¢\u0006\u0004\b!\u0010\u0011R\"\u0010\u0005\u001A\u00020\u00048\u0006@\u0006X\u0086\u000E¢\u0006\u0012\n\u0004\b\"\u0010#\u001A\u0004\b\u0005\u0010$\"\u0004\b%\u0010&R(\u0010\b\u001A\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006@\u0006X\u0086\u000E¢\u0006\u0012\n\u0004\b\'\u0010(\u001A\u0004\b)\u0010*\"\u0004\b+\u0010,R\"\u0010\t\u001A\u00020\u00048\u0006@\u0006X\u0086\u000E¢\u0006\u0012\n\u0004\b-\u0010#\u001A\u0004\b.\u0010$\"\u0004\b/\u0010&R\"\u0010\u000B\u001A\u00020\n8\u0006@\u0006X\u0086\u000E¢\u0006\u0012\n\u0004\b0\u00101\u001A\u0004\b2\u00103\"\u0004\b4\u00105R(\u0010\r\u001A\u00020\f8\u0006@\u0006X\u0086\u000Eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b6\u00107\u001A\u0004\b8\u00109\"\u0004\b:\u0010;\u0082\u0002\u000B\n\u0005\b¡\u001E0\u0001\n\u0002\b!¨\u0006<"}, d2 = {"Landroidx/compose/material3/pulltorefresh/PullToRefreshModifierNode;", "Landroidx/compose/ui/node/DelegatingNode;", "Landroidx/compose/ui/node/CompositionLocalConsumerModifierNode;", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "", "isRefreshing", "Lkotlin/Function0;", "", "onRefresh", "enabled", "Landroidx/compose/material3/pulltorefresh/PullToRefreshState;", "state", "Landroidx/compose/ui/unit/Dp;", "threshold", "<init>", "(ZLkotlin/jvm/functions/Function0;ZLandroidx/compose/material3/pulltorefresh/PullToRefreshState;FLkotlin/jvm/internal/DefaultConstructorMarker;)V", "onAttach", "()V", "Landroidx/compose/ui/geometry/Offset;", "available", "Landroidx/compose/ui/input/nestedscroll/NestedScrollSource;", "source", "onPreScroll-OzD1aCk", "(JI)J", "onPreScroll", "consumed", "onPostScroll-DzOQY0M", "(JJI)J", "onPostScroll", "Landroidx/compose/ui/unit/Velocity;", "onPreFling-QWom1Mo", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onPreFling", "update", "p", "Z", "()Z", "setRefreshing", "(Z)V", "q", "Lkotlin/jvm/functions/Function0;", "getOnRefresh", "()Lkotlin/jvm/functions/Function0;", "setOnRefresh", "(Lkotlin/jvm/functions/Function0;)V", "r", "getEnabled", "setEnabled", "s", "Landroidx/compose/material3/pulltorefresh/PullToRefreshState;", "getState", "()Landroidx/compose/material3/pulltorefresh/PullToRefreshState;", "setState", "(Landroidx/compose/material3/pulltorefresh/PullToRefreshState;)V", "t", "F", "getThreshold-D9Ej5fM", "()F", "setThreshold-0680j_4", "(F)V", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nPullToRefresh.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PullToRefresh.kt\nandroidx/compose/material3/pulltorefresh/PullToRefreshModifierNode\n+ 2 SnapshotFloatState.kt\nandroidx/compose/runtime/PrimitiveSnapshotStateKt__SnapshotFloatStateKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,678:1\n76#2:679\n109#2,2:680\n76#2:682\n109#2,2:683\n1#3:685\n*S KotlinDebug\n*F\n+ 1 PullToRefresh.kt\nandroidx/compose/material3/pulltorefresh/PullToRefreshModifierNode\n*L\n271#1:679\n271#1:680,2\n272#1:682\n272#1:683,2\n*E\n"})
public final class PullToRefreshModifierNode extends DelegatingNode implements NestedScrollConnection, CompositionLocalConsumerModifierNode {
    public static final int $stable = 8;
    public boolean p;
    public Function0 q;
    public boolean r;
    public PullToRefreshState s;
    public float t;
    public final DelegatableNode u;
    public final MutableFloatState v;
    public final MutableFloatState w;

    public PullToRefreshModifierNode(boolean z, Function0 function00, boolean z1, PullToRefreshState pullToRefreshState0, float f, DefaultConstructorMarker defaultConstructorMarker0) {
        this.p = z;
        this.q = function00;
        this.r = z1;
        this.s = pullToRefreshState0;
        this.t = f;
        this.u = NestedScrollNodeKt.nestedScrollModifierNode(this, null);
        this.v = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
        this.w = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
    }

    public static final float access$getVerticalOffset(PullToRefreshModifierNode pullToRefreshModifierNode0) {
        return pullToRefreshModifierNode0.v.getFloatValue();
    }

    public final Object c(Continuation continuation0) {
        PullToRefreshModifierNode pullToRefreshModifierNode0;
        h h0;
        if(continuation0 instanceof h) {
            h0 = (h)continuation0;
            int v = h0.r;
            if((v & 0x80000000) == 0) {
                h0 = new h(this, continuation0);
            }
            else {
                h0.r = v ^ 0x80000000;
            }
        }
        else {
            h0 = new h(this, continuation0);
        }
        Object object0 = h0.p;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(h0.r) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                h0.o = this;
                h0.r = 1;
                if(this.s.animateToHidden(h0) == object1) {
                    return object1;
                }
                pullToRefreshModifierNode0 = this;
                break;
            }
            case 1: {
                pullToRefreshModifierNode0 = h0.o;
                ResultKt.throwOnFailure(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        pullToRefreshModifierNode0.w.setFloatValue(0.0f);
        pullToRefreshModifierNode0.v.setFloatValue(0.0f);
        return Unit.INSTANCE;
    }

    public final Object d(Continuation continuation0) {
        PullToRefreshModifierNode pullToRefreshModifierNode0;
        i i0;
        if(continuation0 instanceof i) {
            i0 = (i)continuation0;
            int v = i0.r;
            if((v & 0x80000000) == 0) {
                i0 = new i(this, continuation0);
            }
            else {
                i0.r = v ^ 0x80000000;
            }
        }
        else {
            i0 = new i(this, continuation0);
        }
        Object object0 = i0.p;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(i0.r) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                i0.o = this;
                i0.r = 1;
                if(this.s.animateToThreshold(i0) == object1) {
                    return object1;
                }
                pullToRefreshModifierNode0 = this;
                break;
            }
            case 1: {
                pullToRefreshModifierNode0 = i0.o;
                ResultKt.throwOnFailure(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        float f = (float)pullToRefreshModifierNode0.f();
        pullToRefreshModifierNode0.w.setFloatValue(f);
        float f1 = (float)pullToRefreshModifierNode0.f();
        pullToRefreshModifierNode0.v.setFloatValue(f1);
        return Unit.INSTANCE;
    }

    public final long e(long v) {
        float f2;
        if(this.p) {
            return 0L;
        }
        MutableFloatState mutableFloatState0 = this.w;
        float f = c.coerceAtLeast(Offset.getY-impl(v) + mutableFloatState0.getFloatValue(), 0.0f);
        float f1 = f - mutableFloatState0.getFloatValue();
        mutableFloatState0.setFloatValue(f);
        if(mutableFloatState0.getFloatValue() * 0.5f <= ((float)this.f())) {
            f2 = mutableFloatState0.getFloatValue() * 0.5f;
        }
        else {
            float f3 = c.coerceIn(Math.abs(mutableFloatState0.getFloatValue() * 0.5f / ((float)this.f())) - 1.0f, 0.0f, 2.0f);
            float f4 = ((float)this.f()) * (f3 - ((float)Math.pow(f3, 2.0)) / 4.0f);
            f2 = ((float)this.f()) + f4;
        }
        this.v.setFloatValue(f2);
        return OffsetKt.Offset(0.0f, f1);
    }

    public final int f() {
        return ((Density)CompositionLocalConsumerModifierNodeKt.currentValueOf(this, CompositionLocalsKt.getLocalDensity())).roundToPx-0680j_4(this.t);
    }

    public final Object g(float f, Continuation continuation0) {
        PullToRefreshModifierNode pullToRefreshModifierNode0;
        m m0;
        if(continuation0 instanceof m) {
            m0 = (m)continuation0;
            int v = m0.s;
            if((v & 0x80000000) == 0) {
                m0 = new m(this, continuation0);
            }
            else {
                m0.s = v ^ 0x80000000;
            }
        }
        else {
            m0 = new m(this, continuation0);
        }
        Object object0 = m0.q;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(m0.s) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                if(this.p) {
                    return Boxing.boxFloat(0.0f);
                }
                if(this.w.getFloatValue() * 0.5f > ((float)this.f())) {
                    m0.o = this;
                    m0.p = f;
                    m0.s = 1;
                    if(this.d(m0) == object1) {
                        return object1;
                    }
                    pullToRefreshModifierNode0 = this;
                    pullToRefreshModifierNode0.q.invoke();
                }
                else {
                    m0.o = this;
                    m0.p = f;
                    m0.s = 2;
                    if(this.c(m0) == object1) {
                        return object1;
                    }
                    pullToRefreshModifierNode0 = this;
                }
                break;
            }
            case 1: {
                f = m0.p;
                pullToRefreshModifierNode0 = m0.o;
                ResultKt.throwOnFailure(object0);
                pullToRefreshModifierNode0.q.invoke();
                break;
            }
            case 2: {
                f = m0.p;
                pullToRefreshModifierNode0 = m0.o;
                ResultKt.throwOnFailure(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        if(pullToRefreshModifierNode0.w.getFloatValue() == 0.0f) {
            f = 0.0f;
        }
        else if(f < 0.0f) {
            f = 0.0f;
        }
        pullToRefreshModifierNode0.w.setFloatValue(0.0f);
        return Boxing.boxFloat(f);
    }

    public final boolean getEnabled() {
        return this.r;
    }

    @NotNull
    public final Function0 getOnRefresh() {
        return this.q;
    }

    @NotNull
    public final PullToRefreshState getState() {
        return this.s;
    }

    public final float getThreshold-D9Ej5fM() {
        return this.t;
    }

    public final boolean isRefreshing() {
        return this.p;
    }

    @Override  // androidx.compose.ui.Modifier$Node
    public void onAttach() {
        this.delegate(this.u);
        BuildersKt.launch$default(this.getCoroutineScope(), null, null, new j(this, null), 3, null);
    }

    @Override  // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    public long onPostScroll-DzOQY0M(long v, long v1, int v2) {
        if(this.s.isAnimating()) {
            return 0L;
        }
        if(!this.r) {
            return 0L;
        }
        if(NestedScrollSource.equals-impl0(v2, 1)) {
            long v3 = this.e(v1);
            BuildersKt.launch$default(this.getCoroutineScope(), null, null, new k(this, null), 3, null);
            return v3;
        }
        return 0L;
    }

    @Override  // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    @Nullable
    public Object onPreFling-QWom1Mo(long v, @NotNull Continuation continuation0) {
        l l0;
        if(continuation0 instanceof l) {
            l0 = (l)continuation0;
            int v1 = l0.q;
            if((v1 & 0x80000000) == 0) {
                l0 = new l(this, continuation0);
            }
            else {
                l0.q = v1 ^ 0x80000000;
            }
        }
        else {
            l0 = new l(this, continuation0);
        }
        Object object0 = l0.o;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(l0.q) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                l0.q = 1;
                object0 = this.g(Velocity.getY-impl(v), l0);
                return object0 == object1 ? object1 : Velocity.box-impl(VelocityKt.Velocity(0.0f, ((Number)object0).floatValue()));
            }
            case 1: {
                ResultKt.throwOnFailure(object0);
                return Velocity.box-impl(VelocityKt.Velocity(0.0f, ((Number)object0).floatValue()));
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }

    // 去混淆评级： 低(22)
    @Override  // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    public long onPreScroll-OzD1aCk(long v, int v1) {
        if(this.s.isAnimating()) {
            return 0L;
        }
        if(!this.r) {
            return 0L;
        }
        return !NestedScrollSource.equals-impl0(v1, 1) || Offset.getY-impl(v) >= 0.0f ? 0L : this.e(v);
    }

    public final void setEnabled(boolean z) {
        this.r = z;
    }

    public final void setOnRefresh(@NotNull Function0 function00) {
        this.q = function00;
    }

    public final void setRefreshing(boolean z) {
        this.p = z;
    }

    public final void setState(@NotNull PullToRefreshState pullToRefreshState0) {
        this.s = pullToRefreshState0;
    }

    public final void setThreshold-0680j_4(float f) {
        this.t = f;
    }

    public final void update() {
        BuildersKt.launch$default(this.getCoroutineScope(), null, null, new n(this, null), 3, null);
    }
}

