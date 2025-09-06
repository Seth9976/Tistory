package androidx.core.util;

import android.annotation.SuppressLint;
import android.util.Range;
import androidx.annotation.RequiresApi;
import kotlin.Metadata;
import kotlin.ranges.ClosedRange.DefaultImpls;
import kotlin.ranges.ClosedRange;
import org.jetbrains.annotations.NotNull;

@SuppressLint({"ClassVerificationFailure"})
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000F\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u001A7\u0010\u0000\u001A\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u000E\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003*\b\u0012\u0004\u0012\u0002H\u00020\u00012\f\u0010\u0004\u001A\b\u0012\u0004\u0012\u0002H\u00020\u0001H\u0087\f\u001A6\u0010\u0005\u001A\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u000E\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u0006\u0010\u0006\u001A\u0002H\u0002H\u0087\n¢\u0006\u0002\u0010\u0007\u001A7\u0010\u0005\u001A\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u000E\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003*\b\u0012\u0004\u0012\u0002H\u00020\u00012\f\u0010\u0004\u001A\b\u0012\u0004\u0012\u0002H\u00020\u0001H\u0087\n\u001A0\u0010\b\u001A\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u000E\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003*\u0002H\u00022\u0006\u0010\t\u001A\u0002H\u0002H\u0087\f¢\u0006\u0002\u0010\n\u001A(\u0010\u000B\u001A\b\u0012\u0004\u0012\u0002H\u00020\f\"\u000E\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003*\b\u0012\u0004\u0012\u0002H\u00020\u0001H\u0007\u001A(\u0010\r\u001A\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u000E\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003*\b\u0012\u0004\u0012\u0002H\u00020\fH\u0007¨\u0006\u000E"}, d2 = {"and", "Landroid/util/Range;", "T", "", "other", "plus", "value", "(Landroid/util/Range;Ljava/lang/Comparable;)Landroid/util/Range;", "rangeTo", "that", "(Ljava/lang/Comparable;Ljava/lang/Comparable;)Landroid/util/Range;", "toClosedRange", "Lkotlin/ranges/ClosedRange;", "toRange", "core-ktx_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class RangeKt {
    @RequiresApi(21)
    @NotNull
    public static final Range and(@NotNull Range range0, @NotNull Range range1) {
        return range0.intersect(range1);
    }

    @RequiresApi(21)
    @NotNull
    public static final Range plus(@NotNull Range range0, @NotNull Range range1) {
        return range0.extend(range1);
    }

    @RequiresApi(21)
    @NotNull
    public static final Range plus(@NotNull Range range0, @NotNull Comparable comparable0) {
        return range0.extend(comparable0);
    }

    @RequiresApi(21)
    @NotNull
    public static final Range rangeTo(@NotNull Comparable comparable0, @NotNull Comparable comparable1) {
        return new Range(comparable0, comparable1);
    }

    @RequiresApi(21)
    @NotNull
    public static final ClosedRange toClosedRange(@NotNull Range range0) {
        return new ClosedRange() {
            public final Range a;

            {
                Range range0 = range0;  // 捕获的参数 （可能与外部方法变量命名冲突；考虑手动重命名）
                this.a = range0;
            }

            @Override  // kotlin.ranges.ClosedRange
            public boolean contains(@NotNull Comparable comparable0) {
                return DefaultImpls.contains(this, comparable0);
            }

            @Override  // kotlin.ranges.ClosedRange
            public Comparable getEndInclusive() {
                return this.a.getUpper();
            }

            @Override  // kotlin.ranges.ClosedRange
            public Comparable getStart() {
                return this.a.getLower();
            }

            @Override  // kotlin.ranges.ClosedRange
            public boolean isEmpty() {
                return DefaultImpls.isEmpty(this);
            }
        };
    }

    @RequiresApi(21)
    @NotNull
    public static final Range toRange(@NotNull ClosedRange closedRange0) {
        return new Range(closedRange0.getStart(), closedRange0.getEndInclusive());
    }
}

