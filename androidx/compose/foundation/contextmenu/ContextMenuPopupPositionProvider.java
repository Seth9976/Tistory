package androidx.compose.foundation.contextmenu;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntRect;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.window.PopupPositionProvider;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J2\u0010\u000F\u001A\u00020\u00022\u0006\u0010\u0007\u001A\u00020\u00062\u0006\u0010\t\u001A\u00020\b2\u0006\u0010\u000B\u001A\u00020\n2\u0006\u0010\f\u001A\u00020\bH\u0016ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000E\u0082\u0002\u0007\n\u0005\b¡\u001E0\u0001¨\u0006\u0010"}, d2 = {"Landroidx/compose/foundation/contextmenu/ContextMenuPopupPositionProvider;", "Landroidx/compose/ui/window/PopupPositionProvider;", "Landroidx/compose/ui/unit/IntOffset;", "localPosition", "<init>", "(JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "Landroidx/compose/ui/unit/IntRect;", "anchorBounds", "Landroidx/compose/ui/unit/IntSize;", "windowSize", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "popupContentSize", "calculatePosition-llwVHH4", "(Landroidx/compose/ui/unit/IntRect;JLandroidx/compose/ui/unit/LayoutDirection;J)J", "calculatePosition", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class ContextMenuPopupPositionProvider implements PopupPositionProvider {
    public static final int $stable;
    public final long a;

    public ContextMenuPopupPositionProvider(long v, DefaultConstructorMarker defaultConstructorMarker0) {
        this.a = v;
    }

    @Override  // androidx.compose.ui.window.PopupPositionProvider
    public long calculatePosition-llwVHH4(@NotNull IntRect intRect0, long v, @NotNull LayoutDirection layoutDirection0, long v1) {
        int v2 = intRect0.getLeft();
        int v3 = IntOffset.getX-impl(this.a);
        int v4 = IntSize.getWidth-impl(v1);
        int v5 = IntSize.getWidth-impl(v);
        return layoutDirection0 == LayoutDirection.Ltr ? IntOffsetKt.IntOffset(ContextMenuPopupPositionProvider_androidKt.alignPopupAxis(v3 + v2, v4, v5, true), ContextMenuPopupPositionProvider_androidKt.alignPopupAxis$default(IntOffset.getY-impl(this.a) + intRect0.getTop(), IntSize.getHeight-impl(v1), IntSize.getHeight-impl(v), false, 8, null)) : IntOffsetKt.IntOffset(ContextMenuPopupPositionProvider_androidKt.alignPopupAxis(v3 + v2, v4, v5, false), ContextMenuPopupPositionProvider_androidKt.alignPopupAxis$default(IntOffset.getY-impl(this.a) + intRect0.getTop(), IntSize.getHeight-impl(v1), IntSize.getHeight-impl(v), false, 8, null));
    }
}

