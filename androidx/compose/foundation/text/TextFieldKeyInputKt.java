package androidx.compose.foundation.text;

import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.input.TextFieldValue;
import j0.o;
import j0.z2;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000@\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001Al\u0010\u0000\u001A\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001A\u00020\u00032\u0006\u0010\u0004\u001A\u00020\u00052\u0006\u0010\u0006\u001A\u00020\u00072\u0014\b\u0002\u0010\b\u001A\u000E\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000B\u001A\u00020\f2\u0006\u0010\r\u001A\u00020\f2\u0006\u0010\u000E\u001A\u00020\u000F2\u0006\u0010\u0010\u001A\u00020\u00112\u0006\u0010\u0012\u001A\u00020\u0013H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u0082\u0002\u0007\n\u0005\b¡\u001E0\u0001¨\u0006\u0016"}, d2 = {"textFieldKeyInput", "Landroidx/compose/ui/Modifier;", "state", "Landroidx/compose/foundation/text/LegacyTextFieldState;", "manager", "Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;", "value", "Landroidx/compose/ui/text/input/TextFieldValue;", "onValueChange", "Lkotlin/Function1;", "", "editable", "", "singleLine", "offsetMapping", "Landroidx/compose/ui/text/input/OffsetMapping;", "undoManager", "Landroidx/compose/foundation/text/UndoManager;", "imeAction", "Landroidx/compose/ui/text/input/ImeAction;", "textFieldKeyInput-2WJ9YEU", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/text/LegacyTextFieldState;Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;Landroidx/compose/ui/text/input/TextFieldValue;Lkotlin/jvm/functions/Function1;ZZLandroidx/compose/ui/text/input/OffsetMapping;Landroidx/compose/foundation/text/UndoManager;I)Landroidx/compose/ui/Modifier;", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class TextFieldKeyInputKt {
    @NotNull
    public static final Modifier textFieldKeyInput-2WJ9YEU(@NotNull Modifier modifier0, @NotNull LegacyTextFieldState legacyTextFieldState0, @NotNull TextFieldSelectionManager textFieldSelectionManager0, @NotNull TextFieldValue textFieldValue0, @NotNull Function1 function10, boolean z, boolean z1, @NotNull OffsetMapping offsetMapping0, @NotNull UndoManager undoManager0, int v) {
        return ComposedModifierKt.composed$default(modifier0, null, new z2(legacyTextFieldState0, textFieldSelectionManager0, textFieldValue0, z, z1, offsetMapping0, undoManager0, function10, v), 1, null);
    }

    public static Modifier textFieldKeyInput-2WJ9YEU$default(Modifier modifier0, LegacyTextFieldState legacyTextFieldState0, TextFieldSelectionManager textFieldSelectionManager0, TextFieldValue textFieldValue0, Function1 function10, boolean z, boolean z1, OffsetMapping offsetMapping0, UndoManager undoManager0, int v, int v1, Object object0) {
        return (v1 & 8) == 0 ? TextFieldKeyInputKt.textFieldKeyInput-2WJ9YEU(modifier0, legacyTextFieldState0, textFieldSelectionManager0, textFieldValue0, function10, z, z1, offsetMapping0, undoManager0, v) : TextFieldKeyInputKt.textFieldKeyInput-2WJ9YEU(modifier0, legacyTextFieldState0, textFieldSelectionManager0, textFieldValue0, o.K, z, z1, offsetMapping0, undoManager0, v);
    }
}

