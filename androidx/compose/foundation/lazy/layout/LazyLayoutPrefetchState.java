package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.runtime.Stable;
import d0.y;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@ExperimentalFoundationApi
@Stable
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001:\u0002%&B0\u0012\n\b\u0002\u0010\u0003\u001A\u0004\u0018\u00010\u0002\u0012\u001B\b\u0002\u0010\b\u001A\u0015\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004¢\u0006\u0002\b\u0007¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000E\u001A\u00020\r2\u0006\u0010\f\u001A\u00020\u000B¢\u0006\u0004\b\u000E\u0010\u000FJ \u0010\u000E\u001A\u00020\r2\u0006\u0010\f\u001A\u00020\u000B2\u0006\u0010\u0011\u001A\u00020\u0010ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0018\u001A\b\u0012\u0004\u0012\u00020\u00150\u0014H\u0000¢\u0006\u0004\b\u0016\u0010\u0017R\u001C\u0010\u0003\u001A\u0004\u0018\u00010\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001A\u001A\u0004\b\u001B\u0010\u001CR$\u0010$\u001A\u0004\u0018\u00010\u001D8\u0000@\u0000X\u0080\u000E¢\u0006\u0012\n\u0004\b\u001E\u0010\u001F\u001A\u0004\b \u0010!\"\u0004\b\"\u0010#\u0082\u0002\u0007\n\u0005\b¡\u001E0\u0001¨\u0006\'"}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState;", "", "Landroidx/compose/foundation/lazy/layout/PrefetchScheduler;", "prefetchScheduler", "Lkotlin/Function1;", "Landroidx/compose/foundation/lazy/layout/NestedPrefetchScope;", "", "Lkotlin/ExtensionFunctionType;", "onNestedPrefetch", "<init>", "(Landroidx/compose/foundation/lazy/layout/PrefetchScheduler;Lkotlin/jvm/functions/Function1;)V", "", "index", "Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState$PrefetchHandle;", "schedulePrefetch", "(I)Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState$PrefetchHandle;", "Landroidx/compose/ui/unit/Constraints;", "constraints", "schedulePrefetch-0kLqBqw", "(IJ)Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState$PrefetchHandle;", "", "Landroidx/compose/foundation/lazy/layout/PrefetchRequest;", "collectNestedPrefetchRequests$foundation_release", "()Ljava/util/List;", "collectNestedPrefetchRequests", "a", "Landroidx/compose/foundation/lazy/layout/PrefetchScheduler;", "getPrefetchScheduler$foundation_release", "()Landroidx/compose/foundation/lazy/layout/PrefetchScheduler;", "Landroidx/compose/foundation/lazy/layout/PrefetchHandleProvider;", "d", "Landroidx/compose/foundation/lazy/layout/PrefetchHandleProvider;", "getPrefetchHandleProvider$foundation_release", "()Landroidx/compose/foundation/lazy/layout/PrefetchHandleProvider;", "setPrefetchHandleProvider$foundation_release", "(Landroidx/compose/foundation/lazy/layout/PrefetchHandleProvider;)V", "prefetchHandleProvider", "d0/y", "PrefetchHandle", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class LazyLayoutPrefetchState {
    @Metadata(d1 = {"\u0000\u001A\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001J\u000F\u0010\u0003\u001A\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u000F\u0010\u0005\u001A\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0004\u0082\u0001\u0002\u0006\u0007ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState$PrefetchHandle;", "", "", "cancel", "()V", "markAsUrgent", "Landroidx/compose/foundation/lazy/layout/a;", "Landroidx/compose/foundation/lazy/layout/e;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public interface PrefetchHandle {
        void cancel();

        void markAsUrgent();
    }

    public static final int $stable;
    public final PrefetchScheduler a;
    public final Function1 b;
    public final PrefetchMetrics c;
    public PrefetchHandleProvider d;

    public LazyLayoutPrefetchState() {
        this(null, null, 3, null);
    }

    public LazyLayoutPrefetchState(@Nullable PrefetchScheduler prefetchScheduler0, @Nullable Function1 function10) {
        this.a = prefetchScheduler0;
        this.b = function10;
        this.c = new PrefetchMetrics();
    }

    public LazyLayoutPrefetchState(PrefetchScheduler prefetchScheduler0, Function1 function10, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v & 1) != 0) {
            prefetchScheduler0 = null;
        }
        if((v & 2) != 0) {
            function10 = null;
        }
        this(prefetchScheduler0, function10);
    }

    @NotNull
    public final List collectNestedPrefetchRequests$foundation_release() {
        Function1 function10 = this.b;
        if(function10 == null) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        y y0 = new y(this);
        function10.invoke(y0);
        return y0.a;
    }

    @Nullable
    public final PrefetchHandleProvider getPrefetchHandleProvider$foundation_release() {
        return this.d;
    }

    @Nullable
    public final PrefetchScheduler getPrefetchScheduler$foundation_release() {
        return this.a;
    }

    // 去混淆评级： 低(20)
    @NotNull
    public final PrefetchHandle schedulePrefetch(int v) {
        return this.schedulePrefetch-0kLqBqw(v, 0x400200000000L);
    }

    @NotNull
    public final PrefetchHandle schedulePrefetch-0kLqBqw(int v, long v1) {
        PrefetchHandleProvider prefetchHandleProvider0 = this.d;
        if(prefetchHandleProvider0 != null) {
            PrefetchHandle lazyLayoutPrefetchState$PrefetchHandle0 = prefetchHandleProvider0.schedulePrefetch-VKLhPVY(v, v1, this.c);
            if(lazyLayoutPrefetchState$PrefetchHandle0 != null) {
                return lazyLayoutPrefetchState$PrefetchHandle0;
            }
        }
        return a.a;
    }

    public final void setPrefetchHandleProvider$foundation_release(@Nullable PrefetchHandleProvider prefetchHandleProvider0) {
        this.d = prefetchHandleProvider0;
    }
}

