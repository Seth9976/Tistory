package androidx.compose.foundation.lazy.layout;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import kotlin.ranges.c;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000\u001C\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\f\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0014B\u001F\u0012\u0006\u0010\u0004\u001A\u00020\u0003\u0012\u0006\u0010\u0005\u001A\u00020\u0003\u0012\u0006\u0010\u0006\u001A\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\n\u001A\u00020\t2\u0006\u0010\u0004\u001A\u00020\u0003¢\u0006\u0004\b\n\u0010\u000BR+\u0010\u0013\u001A\u00020\u00022\u0006\u0010\f\u001A\u00020\u00028V@RX\u0096\u008E\u0002¢\u0006\u0012\n\u0004\b\r\u0010\u000E\u001A\u0004\b\u000F\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutNearestRangeState;", "Landroidx/compose/runtime/State;", "Lkotlin/ranges/IntRange;", "", "firstVisibleItem", "slidingWindowSize", "extraItemCount", "<init>", "(III)V", "", "update", "(I)V", "<set-?>", "c", "Landroidx/compose/runtime/MutableState;", "getValue", "()Lkotlin/ranges/IntRange;", "setValue", "(Lkotlin/ranges/IntRange;)V", "value", "a7/c", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nLazyLayoutNearestRangeState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyLayoutNearestRangeState.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutNearestRangeState\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,65:1\n81#2:66\n107#2,2:67\n*S KotlinDebug\n*F\n+ 1 LazyLayoutNearestRangeState.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutNearestRangeState\n*L\n31#1:66\n31#1:67,2\n*E\n"})
public final class LazyLayoutNearestRangeState implements State {
    public static final int $stable;
    public final int a;
    public final int b;
    public final MutableState c;
    public int d;

    static {
    }

    public LazyLayoutNearestRangeState(int v, int v1, int v2) {
        this.a = v1;
        this.b = v2;
        int v3 = v / v1 * v1;
        this.c = SnapshotStateKt.mutableStateOf(c.until(Math.max(v3 - v2, 0), v3 + v1 + v2), SnapshotStateKt.structuralEqualityPolicy());
        this.d = v;
    }

    @Override  // androidx.compose.runtime.State
    public Object getValue() {
        return this.getValue();
    }

    @NotNull
    public IntRange getValue() {
        return (IntRange)this.c.getValue();
    }

    public final void update(int v) {
        if(v != this.d) {
            this.d = v;
            int v1 = v / this.a * this.a;
            IntRange intRange0 = c.until(Math.max(v1 - this.b, 0), v1 + this.a + this.b);
            this.c.setValue(intRange0);
        }
    }
}

