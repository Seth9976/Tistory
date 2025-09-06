package androidx.compose.ui.input.rotary;

import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000B\n\u0002\b\u0002\u001A\u001E\u0010\u0000\u001A\u00020\u0001*\u00020\u00012\u0012\u0010\u0000\u001A\u000E\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u001A\u001E\u0010\u0005\u001A\u00020\u0001*\u00020\u00012\u0012\u0010\u0005\u001A\u000E\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¨\u0006\u0006"}, d2 = {"onPreRotaryScrollEvent", "Landroidx/compose/ui/Modifier;", "Lkotlin/Function1;", "Landroidx/compose/ui/input/rotary/RotaryScrollEvent;", "", "onRotaryScrollEvent", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class RotaryInputModifierKt {
    @NotNull
    public static final Modifier onPreRotaryScrollEvent(@NotNull Modifier modifier0, @NotNull Function1 function10) {
        return modifier0.then(new RotaryInputElement(null, function10));
    }

    @NotNull
    public static final Modifier onRotaryScrollEvent(@NotNull Modifier modifier0, @NotNull Function1 function10) {
        return modifier0.then(new RotaryInputElement(function10, null));
    }
}

