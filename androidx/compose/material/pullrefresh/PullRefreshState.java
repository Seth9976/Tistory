package androidx.compose.material.pullrefresh;

import androidx.compose.foundation.MutatorMutex;
import androidx.compose.material.ExperimentalMaterialApi;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.c;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import t0.d;
import t0.k;

@ExperimentalMaterialApi
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u000B\n\u0002\u0010\u000B\n\u0002\b\u0012\b\u0007\u0018\u00002\u00020\u0001B5\b\u0000\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0012\u0010\u0007\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004\u0012\u0006\u0010\t\u001A\u00020\b\u0012\u0006\u0010\n\u001A\u00020\b¢\u0006\u0004\b\u000B\u0010\fJ\u0017\u0010\u0010\u001A\u00020\b2\u0006\u0010\r\u001A\u00020\bH\u0000¢\u0006\u0004\b\u000E\u0010\u000FJ\u0017\u0010\u0013\u001A\u00020\b2\u0006\u0010\u0011\u001A\u00020\bH\u0000¢\u0006\u0004\b\u0012\u0010\u000FJ\u0017\u0010\u0018\u001A\u00020\u00062\u0006\u0010\u0015\u001A\u00020\u0014H\u0000¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001B\u001A\u00020\u00062\u0006\u0010\n\u001A\u00020\bH\u0000¢\u0006\u0004\b\u0019\u0010\u001AJ\u0017\u0010\u001D\u001A\u00020\u00062\u0006\u0010\t\u001A\u00020\bH\u0000¢\u0006\u0004\b\u001C\u0010\u001AR\u0011\u0010 \u001A\u00020\b8F¢\u0006\u0006\u001A\u0004\b\u001E\u0010\u001FR\u0014\u0010\u0015\u001A\u00020\u00148@X\u0080\u0004¢\u0006\u0006\u001A\u0004\b!\u0010\"R\u0014\u0010$\u001A\u00020\b8@X\u0080\u0004¢\u0006\u0006\u001A\u0004\b#\u0010\u001FR\u0014\u0010\n\u001A\u00020\b8@X\u0080\u0004¢\u0006\u0006\u001A\u0004\b%\u0010\u001F¨\u0006&"}, d2 = {"Landroidx/compose/material/pullrefresh/PullRefreshState;", "", "Lkotlinx/coroutines/CoroutineScope;", "animationScope", "Landroidx/compose/runtime/State;", "Lkotlin/Function0;", "", "onRefreshState", "", "refreshingOffset", "threshold", "<init>", "(Lkotlinx/coroutines/CoroutineScope;Landroidx/compose/runtime/State;FF)V", "pullDelta", "onPull$material_release", "(F)F", "onPull", "velocity", "onRelease$material_release", "onRelease", "", "refreshing", "setRefreshing$material_release", "(Z)V", "setRefreshing", "setThreshold$material_release", "(F)V", "setThreshold", "setRefreshingOffset$material_release", "setRefreshingOffset", "getProgress", "()F", "progress", "getRefreshing$material_release", "()Z", "getPosition$material_release", "position", "getThreshold$material_release", "material_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nPullRefreshState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PullRefreshState.kt\nandroidx/compose/material/pullrefresh/PullRefreshState\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 SnapshotFloatState.kt\nandroidx/compose/runtime/PrimitiveSnapshotStateKt__SnapshotFloatStateKt\n*L\n1#1,234:1\n81#2:235\n81#2:236\n107#2,2:237\n76#3:239\n109#3,2:240\n76#3:242\n109#3,2:243\n76#3:245\n109#3,2:246\n76#3:248\n109#3,2:249\n*S KotlinDebug\n*F\n+ 1 PullRefreshState.kt\nandroidx/compose/material/pullrefresh/PullRefreshState\n*L\n122#1:235\n124#1:236\n124#1:237,2\n125#1:239\n125#1:240,2\n126#1:242\n126#1:243,2\n127#1:245\n127#1:246,2\n128#1:248\n128#1:249,2\n*E\n"})
public final class PullRefreshState {
    public static final int $stable = 8;
    public final CoroutineScope a;
    public final State b;
    public final State c;
    public final MutableState d;
    public final MutableFloatState e;
    public final MutableFloatState f;
    public final MutableFloatState g;
    public final MutableFloatState h;
    public final MutatorMutex i;

    public PullRefreshState(@NotNull CoroutineScope coroutineScope0, @NotNull State state0, float f, float f1) {
        this.a = coroutineScope0;
        this.b = state0;
        this.c = SnapshotStateKt.derivedStateOf(new d(this, 1));
        this.d = SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
        this.e = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
        this.f = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
        this.g = PrimitiveSnapshotStateKt.mutableFloatStateOf(f1);
        this.h = PrimitiveSnapshotStateKt.mutableFloatStateOf(f);
        this.i = new MutatorMutex();
    }

    public static final float access$getDistancePulled(PullRefreshState pullRefreshState0) {
        return pullRefreshState0.f.getFloatValue();
    }

    public static final float access$get_position(PullRefreshState pullRefreshState0) {
        return pullRefreshState0.e.getFloatValue();
    }

    public static final void access$set_position(PullRefreshState pullRefreshState0, float f) {
        pullRefreshState0.e.setFloatValue(f);
    }

    public final float getPosition$material_release() {
        return this.e.getFloatValue();
    }

    public final float getProgress() {
        return ((Number)this.c.getValue()).floatValue() / this.getThreshold$material_release();
    }

    public final boolean getRefreshing$material_release() {
        return ((Boolean)this.d.getValue()).booleanValue();
    }

    public final float getThreshold$material_release() {
        return this.g.getFloatValue();
    }

    public final float onPull$material_release(float f) {
        float f3;
        if(((Boolean)this.d.getValue()).booleanValue()) {
            return 0.0f;
        }
        float f1 = c.coerceAtLeast(this.f.getFloatValue() + f, 0.0f);
        float f2 = this.f.getFloatValue();
        this.f.setFloatValue(f1);
        State state0 = this.c;
        if(((Number)state0.getValue()).floatValue() <= this.getThreshold$material_release()) {
            f3 = ((Number)state0.getValue()).floatValue();
        }
        else {
            float f4 = c.coerceIn(Math.abs(this.getProgress()) - 1.0f, 0.0f, 2.0f);
            float f5 = this.getThreshold$material_release();
            f3 = this.getThreshold$material_release() + f5 * (f4 - ((float)Math.pow(f4, 2.0)) / 4.0f);
        }
        this.e.setFloatValue(f3);
        return f1 - f2;
    }

    public final float onRelease$material_release(float f) {
        if(this.getRefreshing$material_release()) {
            return 0.0f;
        }
        if(((Number)this.c.getValue()).floatValue() > this.getThreshold$material_release()) {
            ((Function0)this.b.getValue()).invoke();
        }
        k k0 = new k(this, 0.0f, null);
        BuildersKt.launch$default(this.a, null, null, k0, 3, null);
        MutableFloatState mutableFloatState0 = this.f;
        if(mutableFloatState0.getFloatValue() == 0.0f) {
            f = 0.0f;
        }
        else if(f < 0.0f) {
            f = 0.0f;
        }
        mutableFloatState0.setFloatValue(0.0f);
        return f;
    }

    public final void setRefreshing$material_release(boolean z) {
        MutableState mutableState0 = this.d;
        if(((Boolean)mutableState0.getValue()).booleanValue() != z) {
            mutableState0.setValue(Boolean.valueOf(z));
            float f = 0.0f;
            this.f.setFloatValue(0.0f);
            if(z) {
                f = this.h.getFloatValue();
            }
            k k0 = new k(this, f, null);
            BuildersKt.launch$default(this.a, null, null, k0, 3, null);
        }
    }

    public final void setRefreshingOffset$material_release(float f) {
        MutableFloatState mutableFloatState0 = this.h;
        if(mutableFloatState0.getFloatValue() != f) {
            mutableFloatState0.setFloatValue(f);
            if(this.getRefreshing$material_release()) {
                k k0 = new k(this, f, null);
                BuildersKt.launch$default(this.a, null, null, k0, 3, null);
            }
        }
    }

    public final void setThreshold$material_release(float f) {
        this.g.setFloatValue(f);
    }
}

