package androidx.compose.ui.input.pointer;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.unit.IntSize;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u000B\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u001A\u0011\u0010\u0002\u001A\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001A\u0011\u0010\u0004\u001A\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0004\u0010\u0003\u001A\u0011\u0010\u0005\u001A\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0005\u0010\u0003\u001A\u0011\u0010\u0006\u001A\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0006\u0010\u0003\u001A\u0011\u0010\u0007\u001A\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0007\u0010\u0003\u001A\u0011\u0010\b\u001A\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\b\u0010\u0003\u001A\u0011\u0010\n\u001A\u00020\t*\u00020\u0000¢\u0006\u0004\b\n\u0010\u000B\u001A\u0011\u0010\f\u001A\u00020\t*\u00020\u0000¢\u0006\u0004\b\f\u0010\u000B\u001A\u0013\u0010\r\u001A\u00020\u0001*\u00020\u0000H\u0007¢\u0006\u0004\b\r\u0010\u0003\u001A\u0013\u0010\u000E\u001A\u00020\u0001*\u00020\u0000H\u0007¢\u0006\u0004\b\u000E\u0010\u0003\u001A\u0013\u0010\u0010\u001A\u00020\u000F*\u00020\u0000H\u0007¢\u0006\u0004\b\u0010\u0010\u0011\u001A\u0013\u0010\u0012\u001A\u00020\u000F*\u00020\u0000H\u0007¢\u0006\u0004\b\u0012\u0010\u0011\u001A\u0013\u0010\u0013\u001A\u00020\u000F*\u00020\u0000H\u0007¢\u0006\u0004\b\u0013\u0010\u0011\u001A\u001E\u0010\u0018\u001A\u00020\u0001*\u00020\u00002\u0006\u0010\u0015\u001A\u00020\u0014H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017\u001A$\u0010\u0018\u001A\u00020\u0001*\u00020\u00002\u0006\u0010\u0015\u001A\u00020\u00142\u0006\u0010\u001A\u001A\u00020\u0019ø\u0001\u0000¢\u0006\u0004\b\u001B\u0010\u001C\u0082\u0002\u0007\n\u0005\b¡\u001E0\u0001¨\u0006\u001D"}, d2 = {"Landroidx/compose/ui/input/pointer/PointerInputChange;", "", "changedToDown", "(Landroidx/compose/ui/input/pointer/PointerInputChange;)Z", "changedToDownIgnoreConsumed", "changedToUp", "changedToUpIgnoreConsumed", "positionChanged", "positionChangedIgnoreConsumed", "Landroidx/compose/ui/geometry/Offset;", "positionChange", "(Landroidx/compose/ui/input/pointer/PointerInputChange;)J", "positionChangeIgnoreConsumed", "positionChangeConsumed", "anyChangeConsumed", "", "consumeDownChange", "(Landroidx/compose/ui/input/pointer/PointerInputChange;)V", "consumePositionChange", "consumeAllChanges", "Landroidx/compose/ui/unit/IntSize;", "size", "isOutOfBounds-O0kMr_c", "(Landroidx/compose/ui/input/pointer/PointerInputChange;J)Z", "isOutOfBounds", "Landroidx/compose/ui/geometry/Size;", "extendedTouchPadding", "isOutOfBounds-jwHxaWs", "(Landroidx/compose/ui/input/pointer/PointerInputChange;JJ)Z", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class PointerEventKt {
    // 去混淆评级： 低(40)
    public static final long a(PointerInputChange pointerInputChange0, boolean z) {
        return z || !pointerInputChange0.isConsumed() ? Offset.minus-MK-Hz9U(pointerInputChange0.getPosition-F1C5BW0(), pointerInputChange0.getPreviousPosition-F1C5BW0()) : 0L;
    }

    @Deprecated(message = "Partial consumption has been deprecated. Use isConsumed instead", replaceWith = @ReplaceWith(expression = "isConsumed", imports = {}))
    public static final boolean anyChangeConsumed(@NotNull PointerInputChange pointerInputChange0) {
        return pointerInputChange0.isConsumed();
    }

    // 去混淆评级： 低(30)
    public static final boolean changedToDown(@NotNull PointerInputChange pointerInputChange0) {
        return !pointerInputChange0.isConsumed() && !pointerInputChange0.getPreviousPressed() && pointerInputChange0.getPressed();
    }

    // 去混淆评级： 低(20)
    public static final boolean changedToDownIgnoreConsumed(@NotNull PointerInputChange pointerInputChange0) {
        return !pointerInputChange0.getPreviousPressed() && pointerInputChange0.getPressed();
    }

    // 去混淆评级： 低(30)
    public static final boolean changedToUp(@NotNull PointerInputChange pointerInputChange0) {
        return !pointerInputChange0.isConsumed() && pointerInputChange0.getPreviousPressed() && !pointerInputChange0.getPressed();
    }

    // 去混淆评级： 低(20)
    public static final boolean changedToUpIgnoreConsumed(@NotNull PointerInputChange pointerInputChange0) {
        return pointerInputChange0.getPreviousPressed() && !pointerInputChange0.getPressed();
    }

    @Deprecated(message = "Use consume() instead", replaceWith = @ReplaceWith(expression = "consume()", imports = {}))
    public static final void consumeAllChanges(@NotNull PointerInputChange pointerInputChange0) {
        pointerInputChange0.consume();
    }

    @Deprecated(message = "Partial consumption has been deprecated. Use consume() instead.", replaceWith = @ReplaceWith(expression = "if (pressed != previousPressed) consume()", imports = {}))
    public static final void consumeDownChange(@NotNull PointerInputChange pointerInputChange0) {
        if(pointerInputChange0.getPressed() != pointerInputChange0.getPreviousPressed()) {
            pointerInputChange0.consume();
        }
    }

    @Deprecated(message = "Partial consumption has been deprecated. Use consume() instead.", replaceWith = @ReplaceWith(expression = "if (positionChange() != Offset.Zero) consume()", imports = {}))
    public static final void consumePositionChange(@NotNull PointerInputChange pointerInputChange0) {
        if(!Offset.equals-impl0(PointerEventKt.positionChange(pointerInputChange0), 0L)) {
            pointerInputChange0.consume();
        }
    }

    @Deprecated(message = "Use isOutOfBounds() that supports minimum touch target", replaceWith = @ReplaceWith(expression = "this.isOutOfBounds(size, extendedTouchPadding)", imports = {}))
    public static final boolean isOutOfBounds-O0kMr_c(@NotNull PointerInputChange pointerInputChange0, long v) {
        long v1 = pointerInputChange0.getPosition-F1C5BW0();
        float f = Offset.getX-impl(v1);
        float f1 = Offset.getY-impl(v1);
        return f < 0.0f || f > ((float)IntSize.getWidth-impl(v)) || f1 < 0.0f || f1 > ((float)IntSize.getHeight-impl(v));
    }

    public static final boolean isOutOfBounds-jwHxaWs(@NotNull PointerInputChange pointerInputChange0, long v, long v1) {
        if(!PointerType.equals-impl0(pointerInputChange0.getType-T8wyACA(), 1)) {
            return PointerEventKt.isOutOfBounds-O0kMr_c(pointerInputChange0, v);
        }
        long v2 = pointerInputChange0.getPosition-F1C5BW0();
        float f = Offset.getX-impl(v2);
        float f1 = Offset.getY-impl(v2);
        return f < -Size.getWidth-impl(v1) || f > Size.getWidth-impl(v1) + ((float)IntSize.getWidth-impl(v)) || f1 < -Size.getHeight-impl(v1) || f1 > Size.getHeight-impl(v1) + ((float)IntSize.getHeight-impl(v));
    }

    public static final long positionChange(@NotNull PointerInputChange pointerInputChange0) {
        return PointerEventKt.a(pointerInputChange0, false);
    }

    @Deprecated(message = "Partial consumption has been deprecated. Use isConsumed instead", replaceWith = @ReplaceWith(expression = "isConsumed", imports = {}))
    public static final boolean positionChangeConsumed(@NotNull PointerInputChange pointerInputChange0) {
        return pointerInputChange0.isConsumed();
    }

    public static final long positionChangeIgnoreConsumed(@NotNull PointerInputChange pointerInputChange0) {
        return PointerEventKt.a(pointerInputChange0, true);
    }

    // 去混淆评级： 低(20)
    public static final boolean positionChanged(@NotNull PointerInputChange pointerInputChange0) {
        return !Offset.equals-impl0(PointerEventKt.a(pointerInputChange0, false), 0L);
    }

    // 去混淆评级： 低(20)
    public static final boolean positionChangedIgnoreConsumed(@NotNull PointerInputChange pointerInputChange0) {
        return !Offset.equals-impl0(PointerEventKt.a(pointerInputChange0, true), 0L);
    }
}

