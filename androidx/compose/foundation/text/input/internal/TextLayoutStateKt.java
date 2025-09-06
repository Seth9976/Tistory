package androidx.compose.foundation.text.input.internal;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.LayoutCoordinates;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u001A\u001E\u0010\u0000\u001A\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001A\u00020\u0003H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001A\u001E\u0010\u0006\u001A\u00020\u0001*\u00020\u00072\u0006\u0010\b\u001A\u00020\u0001H\u0000ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u001A\u001E\u0010\u000B\u001A\u00020\u0001*\u00020\u00072\u0006\u0010\b\u001A\u00020\u0001H\u0000ø\u0001\u0000¢\u0006\u0004\b\f\u0010\n\u001A\u001E\u0010\r\u001A\u00020\u0001*\u00020\u00072\u0006\u0010\b\u001A\u00020\u0001H\u0000ø\u0001\u0000¢\u0006\u0004\b\u000E\u0010\n\u0082\u0002\u0007\n\u0005\b¡\u001E0\u0001¨\u0006\u000F"}, d2 = {"coerceIn", "Landroidx/compose/ui/geometry/Offset;", "rect", "Landroidx/compose/ui/geometry/Rect;", "coerceIn-3MmeM6k", "(JLandroidx/compose/ui/geometry/Rect;)J", "fromDecorationToTextLayout", "Landroidx/compose/foundation/text/input/internal/TextLayoutState;", "offset", "fromDecorationToTextLayout-Uv8p0NA", "(Landroidx/compose/foundation/text/input/internal/TextLayoutState;J)J", "fromTextLayoutToCore", "fromTextLayoutToCore-Uv8p0NA", "fromWindowToDecoration", "fromWindowToDecoration-Uv8p0NA", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nTextLayoutState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextLayoutState.kt\nandroidx/compose/foundation/text/input/internal/TextLayoutStateKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,252:1\n1#2:253\n*E\n"})
public final class TextLayoutStateKt {
    public static final long coerceIn-3MmeM6k(long v, @NotNull Rect rect0) {
        float f;
        if(Offset.getX-impl(v) < rect0.getLeft()) {
            f = rect0.getLeft();
        }
        else {
            f = Offset.getX-impl(v) > rect0.getRight() ? rect0.getRight() : Offset.getX-impl(v);
        }
        if(Offset.getY-impl(v) < rect0.getTop()) {
            return OffsetKt.Offset(f, rect0.getTop());
        }
        return Offset.getY-impl(v) > rect0.getBottom() ? OffsetKt.Offset(f, rect0.getBottom()) : OffsetKt.Offset(f, Offset.getY-impl(v));
    }

    public static final long fromDecorationToTextLayout-Uv8p0NA(@NotNull TextLayoutState textLayoutState0, long v) {
        LayoutCoordinates layoutCoordinates0 = textLayoutState0.getTextLayoutNodeCoordinates();
        if(layoutCoordinates0 != null) {
            LayoutCoordinates layoutCoordinates1 = textLayoutState0.getDecoratorNodeCoordinates();
            if(layoutCoordinates1 == null) {
                throw new NullPointerException();
            }
            Offset offset0 = Offset.box-impl((!layoutCoordinates0.isAttached() || !layoutCoordinates1.isAttached() ? v : layoutCoordinates0.localPositionOf-R5De75A(layoutCoordinates1, v)));
            return offset0 == null ? v : offset0.unbox-impl();
        }
        return v;
    }

    public static final long fromTextLayoutToCore-Uv8p0NA(@NotNull TextLayoutState textLayoutState0, long v) {
        Offset offset0 = null;
        LayoutCoordinates layoutCoordinates0 = textLayoutState0.getTextLayoutNodeCoordinates();
        if(layoutCoordinates0 != null) {
            if(!layoutCoordinates0.isAttached()) {
                layoutCoordinates0 = null;
            }
            if(layoutCoordinates0 != null) {
                LayoutCoordinates layoutCoordinates1 = textLayoutState0.getCoreNodeCoordinates();
                if(layoutCoordinates1 != null) {
                    if(!layoutCoordinates1.isAttached()) {
                        layoutCoordinates1 = null;
                    }
                    if(layoutCoordinates1 != null) {
                        offset0 = Offset.box-impl(layoutCoordinates1.localPositionOf-R5De75A(layoutCoordinates0, v));
                    }
                }
                return offset0 == null ? v : offset0.unbox-impl();
            }
        }
        return v;
    }

    public static final long fromWindowToDecoration-Uv8p0NA(@NotNull TextLayoutState textLayoutState0, long v) {
        LayoutCoordinates layoutCoordinates0 = textLayoutState0.getDecoratorNodeCoordinates();
        return layoutCoordinates0 == null || !layoutCoordinates0.isAttached() ? v : layoutCoordinates0.windowToLocal-MK-Hz9U(v);
    }
}

