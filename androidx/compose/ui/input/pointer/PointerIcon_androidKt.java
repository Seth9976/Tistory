package androidx.compose.ui.input.pointer;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0011\u001A\u0015\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u0001\u001A\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001A\u0015\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u0006\u001A\u00020\u0005¢\u0006\u0004\b\u0003\u0010\u0007\"\u001A\u0010\f\u001A\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001A\u0004\b\n\u0010\u000B\"\u001A\u0010\u000F\u001A\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\r\u0010\t\u001A\u0004\b\u000E\u0010\u000B\"\u001A\u0010\u0012\u001A\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0010\u0010\t\u001A\u0004\b\u0011\u0010\u000B\"\u001A\u0010\u0015\u001A\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0013\u0010\t\u001A\u0004\b\u0014\u0010\u000B¨\u0006\u0016"}, d2 = {"Landroid/view/PointerIcon;", "pointerIcon", "Landroidx/compose/ui/input/pointer/PointerIcon;", "PointerIcon", "(Landroid/view/PointerIcon;)Landroidx/compose/ui/input/pointer/PointerIcon;", "", "pointerIconType", "(I)Landroidx/compose/ui/input/pointer/PointerIcon;", "a", "Landroidx/compose/ui/input/pointer/PointerIcon;", "getPointerIconDefault", "()Landroidx/compose/ui/input/pointer/PointerIcon;", "pointerIconDefault", "b", "getPointerIconCrosshair", "pointerIconCrosshair", "c", "getPointerIconText", "pointerIconText", "d", "getPointerIconHand", "pointerIconHand", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class PointerIcon_androidKt {
    public static final AndroidPointerIconType a;
    public static final AndroidPointerIconType b;
    public static final AndroidPointerIconType c;
    public static final AndroidPointerIconType d;

    static {
        PointerIcon_androidKt.a = new AndroidPointerIconType(1000);
        PointerIcon_androidKt.b = new AndroidPointerIconType(1007);
        PointerIcon_androidKt.c = new AndroidPointerIconType(0x3F0);
        PointerIcon_androidKt.d = new AndroidPointerIconType(1002);
    }

    @NotNull
    public static final PointerIcon PointerIcon(int v) {
        return new AndroidPointerIconType(v);
    }

    @NotNull
    public static final PointerIcon PointerIcon(@NotNull android.view.PointerIcon pointerIcon0) {
        return new AndroidPointerIcon(pointerIcon0);
    }

    @NotNull
    public static final PointerIcon getPointerIconCrosshair() {
        return PointerIcon_androidKt.b;
    }

    @NotNull
    public static final PointerIcon getPointerIconDefault() {
        return PointerIcon_androidKt.a;
    }

    @NotNull
    public static final PointerIcon getPointerIconHand() {
        return PointerIcon_androidKt.d;
    }

    @NotNull
    public static final PointerIcon getPointerIconText() {
        return PointerIcon_androidKt.c;
    }
}

