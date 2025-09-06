package androidx.compose.ui.window;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntRect;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000E\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J2\u0010\u0011\u001A\u00020\u00042\u0006\u0010\t\u001A\u00020\b2\u0006\u0010\u000B\u001A\u00020\n2\u0006\u0010\r\u001A\u00020\f2\u0006\u0010\u000E\u001A\u00020\nH\u0016ø\u0001\u0000¢\u0006\u0004\b\u000F\u0010\u0010R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001A\u0004\b\u0014\u0010\u0015R\u001D\u0010\u0005\u001A\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001A\u0004\b\u0018\u0010\u0019\u0082\u0002\u000B\n\u0005\b¡\u001E0\u0001\n\u0002\b!¨\u0006\u001A"}, d2 = {"Landroidx/compose/ui/window/AlignmentOffsetPositionProvider;", "Landroidx/compose/ui/window/PopupPositionProvider;", "Landroidx/compose/ui/Alignment;", "alignment", "Landroidx/compose/ui/unit/IntOffset;", "offset", "<init>", "(Landroidx/compose/ui/Alignment;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "Landroidx/compose/ui/unit/IntRect;", "anchorBounds", "Landroidx/compose/ui/unit/IntSize;", "windowSize", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "popupContentSize", "calculatePosition-llwVHH4", "(Landroidx/compose/ui/unit/IntRect;JLandroidx/compose/ui/unit/LayoutDirection;J)J", "calculatePosition", "a", "Landroidx/compose/ui/Alignment;", "getAlignment", "()Landroidx/compose/ui/Alignment;", "b", "J", "getOffset-nOcc-ac", "()J", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class AlignmentOffsetPositionProvider implements PopupPositionProvider {
    public static final int $stable;
    public final Alignment a;
    public final long b;

    public AlignmentOffsetPositionProvider(Alignment alignment0, long v, DefaultConstructorMarker defaultConstructorMarker0) {
        this.a = alignment0;
        this.b = v;
    }

    @Override  // androidx.compose.ui.window.PopupPositionProvider
    public long calculatePosition-llwVHH4(@NotNull IntRect intRect0, long v, @NotNull LayoutDirection layoutDirection0, long v1) {
        long v2 = intRect0.getSize-YbymL2g();
        long v3 = this.a.align-KFBX0sM(0L, v2, layoutDirection0);
        long v4 = IntOffset.unaryMinus-nOcc-ac(this.a.align-KFBX0sM(0L, v1, layoutDirection0));
        int v5 = IntOffset.getX-impl(this.b);
        return layoutDirection0 == LayoutDirection.Ltr ? IntOffset.plus-qkQi6aY(IntOffset.plus-qkQi6aY(IntOffset.plus-qkQi6aY(intRect0.getTopLeft-nOcc-ac(), v3), v4), IntOffsetKt.IntOffset(v5, IntOffset.getY-impl(this.b))) : IntOffset.plus-qkQi6aY(IntOffset.plus-qkQi6aY(IntOffset.plus-qkQi6aY(intRect0.getTopLeft-nOcc-ac(), v3), v4), IntOffsetKt.IntOffset(-v5, IntOffset.getY-impl(this.b)));
    }

    @NotNull
    public final Alignment getAlignment() {
        return this.a;
    }

    public final long getOffset-nOcc-ac() {
        return this.b;
    }
}

