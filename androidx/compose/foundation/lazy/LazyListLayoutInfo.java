package androidx.compose.foundation.lazy;

import androidx.compose.foundation.gestures.Orientation;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001R\u0014\u0010\u0002\u001A\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001A\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\u0007\u0010\u0005R\u0014\u0010\b\u001A\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\t\u0010\u0005R\u0014\u0010\n\u001A\u00020\u000B8VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\f\u0010\rR\u0014\u0010\u000E\u001A\u00020\u000F8VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\u0010\u0010\u0011R\u0012\u0010\u0012\u001A\u00020\u0003X¦\u0004¢\u0006\u0006\u001A\u0004\b\u0013\u0010\u0005R\u0012\u0010\u0014\u001A\u00020\u0003X¦\u0004¢\u0006\u0006\u001A\u0004\b\u0015\u0010\u0005R\u001A\u0010\u0016\u001A\u00020\u00178VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001A\u0004\b\u0018\u0010\u0019R\u0012\u0010\u001A\u001A\u00020\u0003X¦\u0004¢\u0006\u0006\u001A\u0004\b\u001B\u0010\u0005R\u0018\u0010\u001C\u001A\b\u0012\u0004\u0012\u00020\u001E0\u001DX¦\u0004¢\u0006\u0006\u001A\u0004\b\u001F\u0010 ø\u0001\u0002\u0082\u0002\u0011\n\u0005\b¡\u001E0\u0001\n\u0002\b!\n\u0004\b!0\u0001¨\u0006!À\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/lazy/LazyListLayoutInfo;", "", "afterContentPadding", "", "getAfterContentPadding", "()I", "beforeContentPadding", "getBeforeContentPadding", "mainAxisItemSpacing", "getMainAxisItemSpacing", "orientation", "Landroidx/compose/foundation/gestures/Orientation;", "getOrientation", "()Landroidx/compose/foundation/gestures/Orientation;", "reverseLayout", "", "getReverseLayout", "()Z", "totalItemsCount", "getTotalItemsCount", "viewportEndOffset", "getViewportEndOffset", "viewportSize", "Landroidx/compose/ui/unit/IntSize;", "getViewportSize-YbymL2g", "()J", "viewportStartOffset", "getViewportStartOffset", "visibleItemsInfo", "", "Landroidx/compose/foundation/lazy/LazyListItemInfo;", "getVisibleItemsInfo", "()Ljava/util/List;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public interface LazyListLayoutInfo {
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 0x30)
    public static final class DefaultImpls {
        @Deprecated
        public static int getAfterContentPadding(@NotNull LazyListLayoutInfo lazyListLayoutInfo0) {
            return lazyListLayoutInfo0.super.getAfterContentPadding();
        }

        @Deprecated
        public static int getBeforeContentPadding(@NotNull LazyListLayoutInfo lazyListLayoutInfo0) {
            return lazyListLayoutInfo0.super.getBeforeContentPadding();
        }

        @Deprecated
        public static int getMainAxisItemSpacing(@NotNull LazyListLayoutInfo lazyListLayoutInfo0) {
            return lazyListLayoutInfo0.super.getMainAxisItemSpacing();
        }

        @Deprecated
        @NotNull
        public static Orientation getOrientation(@NotNull LazyListLayoutInfo lazyListLayoutInfo0) {
            return lazyListLayoutInfo0.super.getOrientation();
        }

        @Deprecated
        public static boolean getReverseLayout(@NotNull LazyListLayoutInfo lazyListLayoutInfo0) {
            return lazyListLayoutInfo0.super.getReverseLayout();
        }

        @Deprecated
        public static long getViewportSize-YbymL2g(@NotNull LazyListLayoutInfo lazyListLayoutInfo0) {
            return lazyListLayoutInfo0.super.getViewportSize-YbymL2g();
        }
    }

    default int getAfterContentPadding() {
        return 0;
    }

    default int getBeforeContentPadding() {
        return 0;
    }

    default int getMainAxisItemSpacing() {
        return 0;
    }

    @NotNull
    default Orientation getOrientation() {
        return Orientation.Vertical;
    }

    default boolean getReverseLayout() {
        return false;
    }

    int getTotalItemsCount();

    int getViewportEndOffset();

    // 去混淆评级： 低(20)
    default long getViewportSize-YbymL2g() {
        return 0L;
    }

    int getViewportStartOffset();

    @NotNull
    List getVisibleItemsInfo();
}

