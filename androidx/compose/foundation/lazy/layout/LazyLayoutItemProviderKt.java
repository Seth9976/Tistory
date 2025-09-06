package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.ExperimentalFoundationApi;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u001A\u001E\u0010\u0000\u001A\u00020\u0001*\u00020\u00022\b\u0010\u0003\u001A\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001A\u00020\u0001H\u0001¨\u0006\u0006"}, d2 = {"findIndexByKey", "", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemProvider;", "key", "", "lastKnownIndex", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class LazyLayoutItemProviderKt {
    @ExperimentalFoundationApi
    public static final int findIndexByKey(@NotNull LazyLayoutItemProvider lazyLayoutItemProvider0, @Nullable Object object0, int v) {
        if(object0 == null || lazyLayoutItemProvider0.getItemCount() == 0 || v < lazyLayoutItemProvider0.getItemCount() && Intrinsics.areEqual(object0, lazyLayoutItemProvider0.getKey(v))) {
            return v;
        }
        int v1 = lazyLayoutItemProvider0.getIndex(object0);
        return v1 == -1 ? v : v1;
    }
}

