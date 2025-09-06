package com.google.accompanist.swiperefresh;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.MutatorMutex;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Stable;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p6.m;
import p6.n;
import qd.a;

@Stable
@Deprecated(message = "\n     accompanist/swiperefresh is deprecated.\n     The androidx.compose equivalent of SwipeRefreshState is PullRefreshState.\n     For more migration information, please visit https://google.github.io/accompanist/swiperefresh/#migration\n    ")
@Metadata(d1 = {"\u0000\u001E\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000B\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0012\b\u0007\u0018\u00002\u00020\u0001B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001B\u0010\u000B\u001A\u00020\b2\u0006\u0010\u0007\u001A\u00020\u0006H\u0080@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ\u001B\u0010\u000E\u001A\u00020\b2\u0006\u0010\f\u001A\u00020\u0006H\u0080@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\nR+\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u000F\u001A\u00020\u00028F@FX\u0086\u008E\u0002¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001A\u0004\b\u0003\u0010\u0012\"\u0004\b\u0013\u0010\u0005R+\u0010\u0015\u001A\u00020\u00022\u0006\u0010\u000F\u001A\u00020\u00028F@@X\u0086\u008E\u0002¢\u0006\u0012\n\u0004\b\u0014\u0010\u0011\u001A\u0004\b\u0015\u0010\u0012\"\u0004\b\u0016\u0010\u0005R\u0011\u0010\u0019\u001A\u00020\u00068F¢\u0006\u0006\u001A\u0004\b\u0017\u0010\u0018\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001A"}, d2 = {"Lcom/google/accompanist/swiperefresh/SwipeRefreshState;", "", "", "isRefreshing", "<init>", "(Z)V", "", "offset", "", "animateOffsetTo$swiperefresh_release", "(FLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "animateOffsetTo", "delta", "dispatchScrollDelta$swiperefresh_release", "dispatchScrollDelta", "<set-?>", "c", "Landroidx/compose/runtime/MutableState;", "()Z", "setRefreshing", "d", "isSwipeInProgress", "setSwipeInProgress$swiperefresh_release", "getIndicatorOffset", "()F", "indicatorOffset", "swiperefresh_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nSwipeRefresh.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SwipeRefresh.kt\ncom/google/accompanist/swiperefresh/SwipeRefreshState\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,318:1\n76#2:319\n102#2,2:320\n76#2:322\n102#2,2:323\n*S KotlinDebug\n*F\n+ 1 SwipeRefresh.kt\ncom/google/accompanist/swiperefresh/SwipeRefreshState\n*L\n109#1:319\n109#1:320,2\n114#1:322\n114#1:323,2\n*E\n"})
public final class SwipeRefreshState {
    public static final int $stable;
    public final Animatable a;
    public final MutatorMutex b;
    public final MutableState c;
    public final MutableState d;

    public SwipeRefreshState(boolean z) {
        this.a = AnimatableKt.Animatable$default(0.0f, 0.0f, 2, null);
        this.b = new MutatorMutex();
        this.c = SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(z), null, 2, null);
        this.d = SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
    }

    @Nullable
    public final Object animateOffsetTo$swiperefresh_release(float f, @NotNull Continuation continuation0) {
        m m0 = new m(this, f, null);
        Object object0 = MutatorMutex.mutate$default(this.b, null, m0, continuation0, 1, null);
        return object0 == a.getCOROUTINE_SUSPENDED() ? object0 : Unit.INSTANCE;
    }

    @Nullable
    public final Object dispatchScrollDelta$swiperefresh_release(float f, @NotNull Continuation continuation0) {
        n n0 = new n(this, f, null);
        Object object0 = this.b.mutate(MutatePriority.UserInput, n0, continuation0);
        return object0 == a.getCOROUTINE_SUSPENDED() ? object0 : Unit.INSTANCE;
    }

    public final float getIndicatorOffset() {
        return ((Number)this.a.getValue()).floatValue();
    }

    public final boolean isRefreshing() {
        return ((Boolean)this.c.getValue()).booleanValue();
    }

    public final boolean isSwipeInProgress() {
        return ((Boolean)this.d.getValue()).booleanValue();
    }

    public final void setRefreshing(boolean z) {
        this.c.setValue(Boolean.valueOf(z));
    }

    public final void setSwipeInProgress$swiperefresh_release(boolean z) {
        this.d.setValue(Boolean.valueOf(z));
    }
}

