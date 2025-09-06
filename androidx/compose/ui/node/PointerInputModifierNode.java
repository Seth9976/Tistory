package androidx.compose.ui.node;

import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerEventPass;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001A\u00020\u0003H\u0016J\b\u0010\u0004\u001A\u00020\u0005H&J\b\u0010\u0006\u001A\u00020\u0005H\u0016J*\u0010\u0007\u001A\u00020\u00052\u0006\u0010\b\u001A\u00020\t2\u0006\u0010\n\u001A\u00020\u000B2\u0006\u0010\f\u001A\u00020\rH&ø\u0001\u0000¢\u0006\u0004\b\u000E\u0010\u000FJ\b\u0010\u0010\u001A\u00020\u0005H\u0016J\b\u0010\u0011\u001A\u00020\u0003H\u0016ø\u0001\u0001\u0082\u0002\r\n\u0005\b¡\u001E0\u0001\n\u0004\b!0\u0001¨\u0006\u0012À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/node/PointerInputModifierNode;", "Landroidx/compose/ui/node/DelegatableNode;", "interceptOutOfBoundsChildEvents", "", "onCancelPointerInput", "", "onDensityChange", "onPointerEvent", "pointerEvent", "Landroidx/compose/ui/input/pointer/PointerEvent;", "pass", "Landroidx/compose/ui/input/pointer/PointerEventPass;", "bounds", "Landroidx/compose/ui/unit/IntSize;", "onPointerEvent-H0pRuoY", "(Landroidx/compose/ui/input/pointer/PointerEvent;Landroidx/compose/ui/input/pointer/PointerEventPass;J)V", "onViewConfigurationChange", "sharePointerInputWithSiblings", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public interface PointerInputModifierNode extends DelegatableNode {
    default boolean interceptOutOfBoundsChildEvents() {
        return false;
    }

    void onCancelPointerInput();

    default void onDensityChange() {
        this.onCancelPointerInput();
    }

    void onPointerEvent-H0pRuoY(@NotNull PointerEvent arg1, @NotNull PointerEventPass arg2, long arg3);

    default void onViewConfigurationChange() {
        this.onCancelPointerInput();
    }

    default boolean sharePointerInputWithSiblings() {
        return false;
    }
}

