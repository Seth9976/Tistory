package androidx.compose.ui.input.pointer;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0000\u001A\u001E\u0010\u0000\u001A\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001A\u00020\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u0005H\u0007¨\u0006\u0006"}, d2 = {"pointerHoverIcon", "Landroidx/compose/ui/Modifier;", "icon", "Landroidx/compose/ui/input/pointer/PointerIcon;", "overrideDescendants", "", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class PointerIconKt {
    @Stable
    @NotNull
    public static final Modifier pointerHoverIcon(@NotNull Modifier modifier0, @NotNull PointerIcon pointerIcon0, boolean z) {
        return modifier0.then(new PointerHoverIconModifierElement(pointerIcon0, z));
    }

    public static Modifier pointerHoverIcon$default(Modifier modifier0, PointerIcon pointerIcon0, boolean z, int v, Object object0) {
        if((v & 2) != 0) {
            z = false;
        }
        return PointerIconKt.pointerHoverIcon(modifier0, pointerIcon0, z);
    }
}

