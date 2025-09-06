package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@ExperimentalFoundationApi
@StabilityInferred(parameters = 2)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\'\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003:\u0001\u0001B\u0005¢\u0006\u0002\u0010\u0004J\u0010\u0010\r\u001A\u0004\u0018\u00010\u00032\u0006\u0010\u000E\u001A\u00020\nJ\u000E\u0010\u000F\u001A\u00020\u00032\u0006\u0010\u000E\u001A\u00020\nJT\u0010\u0010\u001A\u0002H\u0011\"\u0004\b\u0001\u0010\u00112\u0006\u0010\u0012\u001A\u00020\n26\u0010\u0013\u001A2\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0017\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0018\u0012\u0004\u0012\u0002H\u00110\u0014H\u0086\b¢\u0006\u0002\u0010\u0019R\u0018\u0010\u0005\u001A\b\u0012\u0004\u0012\u00028\u00000\u0006X¦\u0004¢\u0006\u0006\u001A\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001A\u00020\n8F¢\u0006\u0006\u001A\u0004\b\u000B\u0010\f¨\u0006\u001A"}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutIntervalContent;", "Interval", "Landroidx/compose/foundation/lazy/layout/LazyLayoutIntervalContent$Interval;", "", "()V", "intervals", "Landroidx/compose/foundation/lazy/layout/IntervalList;", "getIntervals", "()Landroidx/compose/foundation/lazy/layout/IntervalList;", "itemCount", "", "getItemCount", "()I", "getContentType", "index", "getKey", "withInterval", "T", "globalIndex", "block", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "localIntervalIndex", "content", "(ILkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nLazyLayoutIntervalContent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyLayoutIntervalContent.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutIntervalContent\n*L\n1#1,85:1\n60#1,3:86\n60#1,3:89\n*S KotlinDebug\n*F\n+ 1 LazyLayoutIntervalContent.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutIntervalContent\n*L\n40#1:86,3\n48#1:89,3\n*E\n"})
public abstract class LazyLayoutIntervalContent {
    @ExperimentalFoundationApi
    @Metadata(d1 = {"\u0000\u001A\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0007\bg\u0018\u00002\u00020\u0001R1\u0010\u0002\u001A\u001F\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00038VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\b\u0010\tR1\u0010\n\u001A\u001F\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00038VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\u000B\u0010\tø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\fÀ\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutIntervalContent$Interval;", "", "key", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "index", "getKey", "()Lkotlin/jvm/functions/Function1;", "type", "getType", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public interface Interval {
        @Nullable
        default Function1 getKey() {
            return null;
        }

        @NotNull
        default Function1 getType() {
            return b.w;
        }
    }

    public static final int $stable;

    @Nullable
    public final Object getContentType(int v) {
        androidx.compose.foundation.lazy.layout.IntervalList.Interval intervalList$Interval0 = this.getIntervals().get(v);
        return ((Interval)intervalList$Interval0.getValue()).getType().invoke(((int)(v - intervalList$Interval0.getStartIndex())));
    }

    @NotNull
    public abstract IntervalList getIntervals();

    public final int getItemCount() {
        return this.getIntervals().getSize();
    }

    @NotNull
    public final Object getKey(int v) {
        androidx.compose.foundation.lazy.layout.IntervalList.Interval intervalList$Interval0 = this.getIntervals().get(v);
        int v1 = intervalList$Interval0.getStartIndex();
        Function1 function10 = ((Interval)intervalList$Interval0.getValue()).getKey();
        if(function10 != null) {
            Object object0 = function10.invoke(((int)(v - v1)));
            return object0 == null ? Lazy_androidKt.getDefaultLazyLayoutKey(v) : object0;
        }
        return Lazy_androidKt.getDefaultLazyLayoutKey(v);
    }

    public final Object withInterval(int v, @NotNull Function2 function20) {
        androidx.compose.foundation.lazy.layout.IntervalList.Interval intervalList$Interval0 = this.getIntervals().get(v);
        return function20.invoke(((int)(v - intervalList$Interval0.getStartIndex())), intervalList$Interval0.getValue());
    }
}

