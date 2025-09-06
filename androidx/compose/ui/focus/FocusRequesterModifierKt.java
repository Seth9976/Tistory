package androidx.compose.ui.focus;

import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001A\u0012\u0010\u0000\u001A\u00020\u0001*\u00020\u00012\u0006\u0010\u0000\u001A\u00020\u0002¨\u0006\u0003"}, d2 = {"focusRequester", "Landroidx/compose/ui/Modifier;", "Landroidx/compose/ui/focus/FocusRequester;", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class FocusRequesterModifierKt {
    @NotNull
    public static final Modifier focusRequester(@NotNull Modifier modifier0, @NotNull FocusRequester focusRequester0) {
        return modifier0.then(new FocusRequesterElement(focusRequester0));
    }
}

