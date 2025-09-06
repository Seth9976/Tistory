package androidx.compose.foundation.pager;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.c;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J7\u0010\f\u001A\u00020\u00022\u0006\u0010\u0006\u001A\u00020\u00022\u0006\u0010\u0007\u001A\u00020\u00022\u0006\u0010\t\u001A\u00020\b2\u0006\u0010\n\u001A\u00020\u00022\u0006\u0010\u000B\u001A\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\rJ\u001A\u0010\u0011\u001A\u00020\u00102\b\u0010\u000F\u001A\u0004\u0018\u00010\u000EH\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000F\u0010\u0013\u001A\u00020\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Landroidx/compose/foundation/pager/PagerSnapDistanceMaxPages;", "Landroidx/compose/foundation/pager/PagerSnapDistance;", "", "pagesLimit", "<init>", "(I)V", "startPage", "suggestedTargetPage", "", "velocity", "pageSize", "pageSpacing", "calculateTargetPage", "(IIFII)I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nPagerSnapDistance.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PagerSnapDistance.kt\nandroidx/compose/foundation/pager/PagerSnapDistanceMaxPages\n+ 2 PagerSnapDistance.kt\nandroidx/compose/foundation/pager/PagerSnapDistanceKt\n*L\n1#1,109:1\n105#2,4:110\n*S KotlinDebug\n*F\n+ 1 PagerSnapDistance.kt\nandroidx/compose/foundation/pager/PagerSnapDistanceMaxPages\n*L\n78#1:110,4\n*E\n"})
public final class PagerSnapDistanceMaxPages implements PagerSnapDistance {
    public static final int $stable;
    public final int a;

    public PagerSnapDistanceMaxPages(int v) {
        this.a = v;
    }

    @Override  // androidx.compose.foundation.pager.PagerSnapDistance
    public int calculateTargetPage(int v, int v1, float f, int v2, int v3) {
        return c.coerceIn(v1, ((int)c.coerceAtLeast(((long)v) - ((long)this.a), 0L)), ((int)c.coerceAtMost(((long)v) + ((long)this.a), 0x7FFFFFFFL)));
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        return object0 instanceof PagerSnapDistanceMaxPages && this.a == ((PagerSnapDistanceMaxPages)object0).a;
    }

    @Override
    public int hashCode() {
        return this.a;
    }
}

