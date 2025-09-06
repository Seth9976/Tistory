package androidx.compose.foundation.lazy;

import androidx.compose.foundation.ExperimentalFoundationApi;
import b0.a;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u000E\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u001A\u0012\u0010\u0000\u001A\u00020\u00012\b\b\u0002\u0010\u0002\u001A\u00020\u0003H\u0007¨\u0006\u0004"}, d2 = {"LazyListPrefetchStrategy", "Landroidx/compose/foundation/lazy/LazyListPrefetchStrategy;", "nestedPrefetchItemCount", "", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class LazyListPrefetchStrategyKt {
    @ExperimentalFoundationApi
    @NotNull
    public static final LazyListPrefetchStrategy LazyListPrefetchStrategy(int v) {
        return new a(v);
    }

    public static LazyListPrefetchStrategy LazyListPrefetchStrategy$default(int v, int v1, Object object0) {
        if((v1 & 1) != 0) {
            v = 2;
        }
        return LazyListPrefetchStrategyKt.LazyListPrefetchStrategy(v);
    }
}

