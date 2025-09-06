package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.text.LegacyTextFieldState;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001A\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001A$\u0010\u0000\u001A\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001A\u00020\u00032\u0006\u0010\u0004\u001A\u00020\u00052\u0006\u0010\u0006\u001A\u00020\u0007H\u0000¨\u0006\b"}, d2 = {"legacyTextInputAdapter", "Landroidx/compose/ui/Modifier;", "serviceAdapter", "Landroidx/compose/foundation/text/input/internal/LegacyPlatformTextInputServiceAdapter;", "legacyTextFieldState", "Landroidx/compose/foundation/text/LegacyTextFieldState;", "textFieldSelectionManager", "Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class LegacyAdaptingPlatformTextInputModifierNodeKt {
    @NotNull
    public static final Modifier legacyTextInputAdapter(@NotNull Modifier modifier0, @NotNull LegacyPlatformTextInputServiceAdapter legacyPlatformTextInputServiceAdapter0, @NotNull LegacyTextFieldState legacyTextFieldState0, @NotNull TextFieldSelectionManager textFieldSelectionManager0) {
        return modifier0.then(new LegacyAdaptingPlatformTextInputModifier(legacyPlatformTextInputServiceAdapter0, legacyTextFieldState0, textFieldSelectionManager0));
    }
}

