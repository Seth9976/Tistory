package androidx.compose.ui.input.pointer;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.layout.LayoutCoordinates;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000B\n\u0002\b\u0010\b\'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J*\u0010\r\u001A\u00020\n2\u0006\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0007\u001A\u00020\u00062\u0006\u0010\t\u001A\u00020\bH&ø\u0001\u0000¢\u0006\u0004\b\u000B\u0010\fJ\u000F\u0010\u000E\u001A\u00020\nH&¢\u0006\u0004\b\u000E\u0010\u0003R$\u0010\u0016\u001A\u0004\u0018\u00010\u000F8\u0000@\u0000X\u0080\u000E¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001A\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\"\u0010\u001E\u001A\u00020\u00178\u0000@\u0000X\u0080\u000E¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001A\u0004\b\u001A\u0010\u001B\"\u0004\b\u001C\u0010\u001DR\u001A\u0010!\u001A\u00020\u00178VX\u0096\u0004¢\u0006\f\u0012\u0004\b \u0010\u0003\u001A\u0004\b\u001F\u0010\u001BR\u0017\u0010$\u001A\u00020\b8Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001A\u0004\b\"\u0010#R\u0014\u0010&\u001A\u00020\u00178VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b%\u0010\u001B\u0082\u0002\u000B\n\u0005\b¡\u001E0\u0001\n\u0002\b!¨\u0006\'"}, d2 = {"Landroidx/compose/ui/input/pointer/PointerInputFilter;", "", "<init>", "()V", "Landroidx/compose/ui/input/pointer/PointerEvent;", "pointerEvent", "Landroidx/compose/ui/input/pointer/PointerEventPass;", "pass", "Landroidx/compose/ui/unit/IntSize;", "bounds", "", "onPointerEvent-H0pRuoY", "(Landroidx/compose/ui/input/pointer/PointerEvent;Landroidx/compose/ui/input/pointer/PointerEventPass;J)V", "onPointerEvent", "onCancel", "Landroidx/compose/ui/layout/LayoutCoordinates;", "a", "Landroidx/compose/ui/layout/LayoutCoordinates;", "getLayoutCoordinates$ui_release", "()Landroidx/compose/ui/layout/LayoutCoordinates;", "setLayoutCoordinates$ui_release", "(Landroidx/compose/ui/layout/LayoutCoordinates;)V", "layoutCoordinates", "", "b", "Z", "isAttached$ui_release", "()Z", "setAttached$ui_release", "(Z)V", "isAttached", "getShareWithSiblings", "getShareWithSiblings$annotations", "shareWithSiblings", "getSize-YbymL2g", "()J", "size", "getInterceptOutOfBoundsChildEvents", "interceptOutOfBoundsChildEvents", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public abstract class PointerInputFilter {
    public static final int $stable = 8;
    public LayoutCoordinates a;
    public boolean b;

    public boolean getInterceptOutOfBoundsChildEvents() {
        return false;
    }

    @Nullable
    public final LayoutCoordinates getLayoutCoordinates$ui_release() {
        return this.a;
    }

    public boolean getShareWithSiblings() {
        return false;
    }

    public static void getShareWithSiblings$annotations() {
    }

    // 去混淆评级： 低(20)
    public final long getSize-YbymL2g() {
        return this.a == null ? 0L : this.a.getSize-YbymL2g();
    }

    public final boolean isAttached$ui_release() {
        return this.b;
    }

    public abstract void onCancel();

    public abstract void onPointerEvent-H0pRuoY(@NotNull PointerEvent arg1, @NotNull PointerEventPass arg2, long arg3);

    public final void setAttached$ui_release(boolean z) {
        this.b = z;
    }

    public final void setLayoutCoordinates$ui_release(@Nullable LayoutCoordinates layoutCoordinates0) {
        this.a = layoutCoordinates0;
    }
}

