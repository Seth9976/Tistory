package androidx.compose.ui.input.pointer;

import androidx.compose.runtime.Stable;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Stable
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bg\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0003À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/input/pointer/PointerIcon;", "", "Companion", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public interface PointerIcon {
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u000F\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0017\u0010\u0007\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001A\u0004\b\u0005\u0010\u0006R\u0017\u0010\n\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0004\u001A\u0004\b\t\u0010\u0006R\u0017\u0010\r\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000B\u0010\u0004\u001A\u0004\b\f\u0010\u0006R\u0017\u0010\u0010\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000E\u0010\u0004\u001A\u0004\b\u000F\u0010\u0006¨\u0006\u0011"}, d2 = {"Landroidx/compose/ui/input/pointer/PointerIcon$Companion;", "", "Landroidx/compose/ui/input/pointer/PointerIcon;", "b", "Landroidx/compose/ui/input/pointer/PointerIcon;", "getDefault", "()Landroidx/compose/ui/input/pointer/PointerIcon;", "Default", "c", "getCrosshair", "Crosshair", "d", "getText", "Text", "e", "getHand", "Hand", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Companion {
        public static final Companion a;
        public static final PointerIcon b;
        public static final PointerIcon c;
        public static final PointerIcon d;
        public static final PointerIcon e;

        static {
            Companion.a = new Companion();  // 初始化器: Ljava/lang/Object;-><init>()V
            Companion.b = PointerIcon_androidKt.getPointerIconDefault();
            Companion.c = PointerIcon_androidKt.getPointerIconCrosshair();
            Companion.d = PointerIcon_androidKt.getPointerIconText();
            Companion.e = PointerIcon_androidKt.getPointerIconHand();
        }

        @NotNull
        public final PointerIcon getCrosshair() {
            return Companion.c;
        }

        @NotNull
        public final PointerIcon getDefault() {
            return Companion.b;
        }

        @NotNull
        public final PointerIcon getHand() {
            return Companion.e;
        }

        @NotNull
        public final PointerIcon getText() {
            return Companion.d;
        }
    }

    @NotNull
    public static final Companion Companion;

    static {
        PointerIcon.Companion = Companion.a;
    }
}

