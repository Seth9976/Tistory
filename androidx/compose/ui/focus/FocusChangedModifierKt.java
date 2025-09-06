package androidx.compose.ui.focus;

import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u001A\u001E\u0010\u0000\u001A\u00020\u0001*\u00020\u00012\u0012\u0010\u0000\u001A\u000E\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¨\u0006\u0005"}, d2 = {"onFocusChanged", "Landroidx/compose/ui/Modifier;", "Lkotlin/Function1;", "Landroidx/compose/ui/focus/FocusState;", "", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class FocusChangedModifierKt {
    @NotNull
    public static final Modifier onFocusChanged(@NotNull Modifier modifier0, @NotNull Function1 function10) {
        return modifier0.then(new FocusChangedElement(function10));
    }
}

