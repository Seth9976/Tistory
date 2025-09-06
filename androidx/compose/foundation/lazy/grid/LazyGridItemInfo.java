package androidx.compose.foundation.lazy.grid;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016R\u0012\u0010\u0002\u001A\u00020\u0003X¦\u0004¢\u0006\u0006\u001A\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001A\u0004\u0018\u00010\u0001X¦\u0004¢\u0006\u0006\u001A\u0004\b\u0007\u0010\bR\u0012\u0010\t\u001A\u00020\u0003X¦\u0004¢\u0006\u0006\u001A\u0004\b\n\u0010\u0005R\u0012\u0010\u000B\u001A\u00020\u0001X¦\u0004¢\u0006\u0006\u001A\u0004\b\f\u0010\bR\u0018\u0010\r\u001A\u00020\u000EX¦\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001A\u0004\b\u000F\u0010\u0010R\u0012\u0010\u0011\u001A\u00020\u0003X¦\u0004¢\u0006\u0006\u001A\u0004\b\u0012\u0010\u0005R\u0018\u0010\u0013\u001A\u00020\u0014X¦\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001A\u0004\b\u0015\u0010\u0010\u0082\u0001\u0001\u0017ø\u0001\u0002\u0082\u0002\u0011\n\u0005\b¡\u001E0\u0001\n\u0002\b!\n\u0004\b!0\u0001¨\u0006\u0018À\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/lazy/grid/LazyGridItemInfo;", "", "column", "", "getColumn", "()I", "contentType", "getContentType", "()Ljava/lang/Object;", "index", "getIndex", "key", "getKey", "offset", "Landroidx/compose/ui/unit/IntOffset;", "getOffset-nOcc-ac", "()J", "row", "getRow", "size", "Landroidx/compose/ui/unit/IntSize;", "getSize-YbymL2g", "Companion", "Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public interface LazyGridItemInfo {
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001A\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001A\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Landroidx/compose/foundation/lazy/grid/LazyGridItemInfo$Companion;", "", "", "UnknownRow", "I", "UnknownColumn", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Companion {
        public static final int UnknownColumn = -1;
        public static final int UnknownRow = -1;
        public static final Companion a;

        static {
            Companion.a = new Companion();  // 初始化器: Ljava/lang/Object;-><init>()V
        }
    }

    @NotNull
    public static final Companion Companion = null;
    public static final int UnknownColumn = -1;
    public static final int UnknownRow = -1;

    static {
        LazyGridItemInfo.Companion = Companion.a;
    }

    int getColumn();

    @Nullable
    Object getContentType();

    int getIndex();

    @NotNull
    Object getKey();

    long getOffset-nOcc-ac();

    int getRow();

    long getSize-YbymL2g();
}

