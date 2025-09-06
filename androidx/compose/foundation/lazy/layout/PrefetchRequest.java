package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.ExperimentalFoundationApi;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@ExperimentalFoundationApi
@Metadata(d1 = {"\u0000\u001A\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001A\u00020\u0003*\u00020\u0002H&¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0001\u0001\u0006ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/lazy/layout/PrefetchRequest;", "", "Landroidx/compose/foundation/lazy/layout/PrefetchRequestScope;", "", "execute", "(Landroidx/compose/foundation/lazy/layout/PrefetchRequestScope;)Z", "Landroidx/compose/foundation/lazy/layout/e;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public interface PrefetchRequest {
    boolean execute(@NotNull PrefetchRequestScope arg1);
}

