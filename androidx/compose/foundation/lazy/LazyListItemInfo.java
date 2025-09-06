package androidx.compose.foundation.lazy;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\t\bf\u0018\u00002\u00020\u0001R\u0016\u0010\u0002\u001A\u0004\u0018\u00010\u00018VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\u0003\u0010\u0004R\u0012\u0010\u0005\u001A\u00020\u0006X¦\u0004¢\u0006\u0006\u001A\u0004\b\u0007\u0010\bR\u0012\u0010\t\u001A\u00020\u0001X¦\u0004¢\u0006\u0006\u001A\u0004\b\n\u0010\u0004R\u0012\u0010\u000B\u001A\u00020\u0006X¦\u0004¢\u0006\u0006\u001A\u0004\b\f\u0010\bR\u0012\u0010\r\u001A\u00020\u0006X¦\u0004¢\u0006\u0006\u001A\u0004\b\u000E\u0010\bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000FÀ\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/lazy/LazyListItemInfo;", "", "contentType", "getContentType", "()Ljava/lang/Object;", "index", "", "getIndex", "()I", "key", "getKey", "offset", "getOffset", "size", "getSize", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public interface LazyListItemInfo {
    @Nullable
    default Object getContentType() {
        return null;
    }

    int getIndex();

    @NotNull
    Object getKey();

    int getOffset();

    int getSize();
}

