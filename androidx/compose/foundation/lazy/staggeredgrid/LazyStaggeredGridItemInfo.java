package androidx.compose.foundation.lazy.staggeredgrid;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001R\u0014\u0010\u0002\u001A\u0004\u0018\u00010\u0001X¦\u0004¢\u0006\u0006\u001A\u0004\b\u0003\u0010\u0004R\u0012\u0010\u0005\u001A\u00020\u0006X¦\u0004¢\u0006\u0006\u001A\u0004\b\u0007\u0010\bR\u0012\u0010\t\u001A\u00020\u0001X¦\u0004¢\u0006\u0006\u001A\u0004\b\n\u0010\u0004R\u0012\u0010\u000B\u001A\u00020\u0006X¦\u0004¢\u0006\u0006\u001A\u0004\b\f\u0010\bR\u0018\u0010\r\u001A\u00020\u000EX¦\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001A\u0004\b\u000F\u0010\u0010R\u0018\u0010\u0011\u001A\u00020\u0012X¦\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001A\u0004\b\u0013\u0010\u0010\u0082\u0001\u0001\u0014ø\u0001\u0002\u0082\u0002\u0011\n\u0005\b¡\u001E0\u0001\n\u0002\b!\n\u0004\b!0\u0001¨\u0006\u0015À\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemInfo;", "", "contentType", "getContentType", "()Ljava/lang/Object;", "index", "", "getIndex", "()I", "key", "getKey", "lane", "getLane", "offset", "Landroidx/compose/ui/unit/IntOffset;", "getOffset-nOcc-ac", "()J", "size", "Landroidx/compose/ui/unit/IntSize;", "getSize-YbymL2g", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasuredItem;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public interface LazyStaggeredGridItemInfo {
    @Nullable
    Object getContentType();

    int getIndex();

    @NotNull
    Object getKey();

    int getLane();

    long getOffset-nOcc-ac();

    long getSize-YbymL2g();
}

