package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Stable;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@ExperimentalFoundationApi
@Stable
@Metadata(d1 = {"\u0000\u001A\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\bg\u0018\u00002\u00020\u0001J\u001D\u0010\u0006\u001A\u00020\u00072\u0006\u0010\b\u001A\u00020\u00032\u0006\u0010\t\u001A\u00020\u0001H\'¢\u0006\u0002\u0010\nJ\u0012\u0010\u000B\u001A\u0004\u0018\u00010\u00012\u0006\u0010\b\u001A\u00020\u0003H\u0016J\u0010\u0010\f\u001A\u00020\u00032\u0006\u0010\t\u001A\u00020\u0001H\u0016J\u0010\u0010\r\u001A\u00020\u00012\u0006\u0010\b\u001A\u00020\u0003H\u0016R\u0012\u0010\u0002\u001A\u00020\u0003X¦\u0004¢\u0006\u0006\u001A\u0004\b\u0004\u0010\u0005ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000EÀ\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutItemProvider;", "", "itemCount", "", "getItemCount", "()I", "Item", "", "index", "key", "(ILjava/lang/Object;Landroidx/compose/runtime/Composer;I)V", "getContentType", "getIndex", "getKey", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public interface LazyLayoutItemProvider {
    @Composable
    void Item(int arg1, @NotNull Object arg2, @Nullable Composer arg3, int arg4);

    @Nullable
    default Object getContentType(int v) {
        return null;
    }

    default int getIndex(@NotNull Object object0) {
        return -1;
    }

    int getItemCount();

    @NotNull
    default Object getKey(int v) {
        return Lazy_androidKt.getDefaultLazyLayoutKey(v);
    }
}

