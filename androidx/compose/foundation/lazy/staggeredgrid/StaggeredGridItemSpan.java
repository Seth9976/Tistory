package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0007\u0018\u0000 \b2\u00020\u0001:\u0001\bR\u001A\u0010\u0007\u001A\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001A\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Landroidx/compose/foundation/lazy/staggeredgrid/StaggeredGridItemSpan;", "", "", "a", "I", "getValue$foundation_release", "()I", "value", "Companion", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class StaggeredGridItemSpan {
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001A\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0007\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001A\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Landroidx/compose/foundation/lazy/staggeredgrid/StaggeredGridItemSpan$Companion;", "", "Landroidx/compose/foundation/lazy/staggeredgrid/StaggeredGridItemSpan;", "FullLine", "Landroidx/compose/foundation/lazy/staggeredgrid/StaggeredGridItemSpan;", "getFullLine", "()Landroidx/compose/foundation/lazy/staggeredgrid/StaggeredGridItemSpan;", "SingleLane", "getSingleLane", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        @NotNull
        public final StaggeredGridItemSpan getFullLine() {
            return StaggeredGridItemSpan.b;
        }

        @NotNull
        public final StaggeredGridItemSpan getSingleLane() {
            return StaggeredGridItemSpan.c;
        }
    }

    public static final int $stable;
    @NotNull
    public static final Companion Companion;
    public final int a;
    public static final StaggeredGridItemSpan b;
    public static final StaggeredGridItemSpan c;

    static {
        StaggeredGridItemSpan.Companion = new Companion(null);
        StaggeredGridItemSpan.b = new StaggeredGridItemSpan(0);
        StaggeredGridItemSpan.c = new StaggeredGridItemSpan(1);
    }

    public StaggeredGridItemSpan(int v) {
        this.a = v;
    }

    public final int getValue$foundation_release() {
        return this.a;
    }
}

