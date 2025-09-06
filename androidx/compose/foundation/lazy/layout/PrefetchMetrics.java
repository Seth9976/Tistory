package androidx.compose.foundation.lazy.layout;

import androidx.collection.MutableObjectLongMap;
import androidx.collection.ObjectLongMapKt;
import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@ExperimentalFoundationApi
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\n\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J(\u0010\n\u001A\u00020\u00062\b\u0010\u0004\u001A\u0004\u0018\u00010\u00012\f\u0010\u0007\u001A\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0080\b¢\u0006\u0004\b\b\u0010\tJ(\u0010\r\u001A\u00020\u00062\b\u0010\u0004\u001A\u0004\u0018\u00010\u00012\f\u0010\u000B\u001A\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0080\b¢\u0006\u0004\b\f\u0010\tR\u001D\u0010\u0013\u001A\b\u0012\u0004\u0012\u00020\u00010\u000E8\u0006¢\u0006\f\n\u0004\b\u000F\u0010\u0010\u001A\u0004\b\u0011\u0010\u0012R\u001D\u0010\u0016\u001A\b\u0012\u0004\u0012\u00020\u00010\u000E8\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0010\u001A\u0004\b\u0015\u0010\u0012R$\u0010\u001D\u001A\u00020\u00172\u0006\u0010\u0018\u001A\u00020\u00178\u0006@BX\u0086\u000E¢\u0006\f\n\u0004\b\u0019\u0010\u001A\u001A\u0004\b\u001B\u0010\u001CR$\u0010 \u001A\u00020\u00172\u0006\u0010\u0018\u001A\u00020\u00178\u0006@BX\u0086\u000E¢\u0006\f\n\u0004\b\u001E\u0010\u001A\u001A\u0004\b\u001F\u0010\u001C¨\u0006!"}, d2 = {"Landroidx/compose/foundation/lazy/layout/PrefetchMetrics;", "", "<init>", "()V", "contentType", "Lkotlin/Function0;", "", "doComposition", "recordCompositionTiming$foundation_release", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function0;)V", "recordCompositionTiming", "doMeasure", "recordMeasureTiming$foundation_release", "recordMeasureTiming", "Landroidx/collection/MutableObjectLongMap;", "a", "Landroidx/collection/MutableObjectLongMap;", "getAverageCompositionTimeNanosByContentType", "()Landroidx/collection/MutableObjectLongMap;", "averageCompositionTimeNanosByContentType", "b", "getAverageMeasureTimeNanosByContentType", "averageMeasureTimeNanosByContentType", "", "<set-?>", "c", "J", "getAverageCompositionTimeNanos", "()J", "averageCompositionTimeNanos", "d", "getAverageMeasureTimeNanos", "averageMeasureTimeNanos", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nLazyLayoutPrefetchState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyLayoutPrefetchState.kt\nandroidx/compose/foundation/lazy/layout/PrefetchMetrics\n+ 2 Timing.kt\nkotlin/system/TimingKt\n*L\n1#1,505:1\n31#2,6:506\n31#2,6:512\n*S KotlinDebug\n*F\n+ 1 LazyLayoutPrefetchState.kt\nandroidx/compose/foundation/lazy/layout/PrefetchMetrics\n*L\n177#1:506,6\n193#1:512,6\n*E\n"})
public final class PrefetchMetrics {
    public static final int $stable = 8;
    public final MutableObjectLongMap a;
    public final MutableObjectLongMap b;
    public long c;
    public long d;

    public PrefetchMetrics() {
        this.a = ObjectLongMapKt.mutableObjectLongMapOf();
        this.b = ObjectLongMapKt.mutableObjectLongMapOf();
    }

    public static final long access$calculateAverageTime(PrefetchMetrics prefetchMetrics0, long v, long v1) {
        prefetchMetrics0.getClass();
        return v1 == 0L ? v : v / 4L + v1 / 4L * 3L;
    }

    public final long getAverageCompositionTimeNanos() {
        return this.c;
    }

    @NotNull
    public final MutableObjectLongMap getAverageCompositionTimeNanosByContentType() {
        return this.a;
    }

    public final long getAverageMeasureTimeNanos() {
        return this.d;
    }

    @NotNull
    public final MutableObjectLongMap getAverageMeasureTimeNanosByContentType() {
        return this.b;
    }

    public final void recordCompositionTiming$foundation_release(@Nullable Object object0, @NotNull Function0 function00) {
        function00.invoke();
        if(object0 != null) {
            this.getAverageCompositionTimeNanosByContentType().set(object0, PrefetchMetrics.access$calculateAverageTime(this, 0L, this.getAverageCompositionTimeNanosByContentType().getOrDefault(object0, 0L)));
        }
        this.c = PrefetchMetrics.access$calculateAverageTime(this, 0L, this.getAverageCompositionTimeNanos());
    }

    public final void recordMeasureTiming$foundation_release(@Nullable Object object0, @NotNull Function0 function00) {
        function00.invoke();
        if(object0 != null) {
            this.getAverageMeasureTimeNanosByContentType().set(object0, PrefetchMetrics.access$calculateAverageTime(this, 0L, this.getAverageMeasureTimeNanosByContentType().getOrDefault(object0, 0L)));
        }
        this.d = PrefetchMetrics.access$calculateAverageTime(this, 0L, this.getAverageMeasureTimeNanos());
    }
}

