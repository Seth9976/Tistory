package androidx.compose.foundation.text.selection;

import aa.o;
import androidx.compose.foundation.contextmenu.ContextMenuState;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.pointer.PointerEvent;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0010\u000B\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\u001A%\u0010\u0004\u001A\u0013\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0002\b\b*\u00020\t2\u0006\u0010\n\u001A\u00020\u000BH\u0000\u001A\u0014\u0010\f\u001A\u00020\r*\u00020\r2\u0006\u0010\u000E\u001A\u00020\tH\u0000\"\u0018\u0010\u0000\u001A\u00020\u0001*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001A\u0004\b\u0000\u0010\u0003¨\u0006\u000F²\u0006\n\u0010\u0010\u001A\u00020\u0011X\u008A\u008E\u0002"}, d2 = {"isShiftPressed", "", "Landroidx/compose/ui/input/pointer/PointerEvent;", "(Landroidx/compose/ui/input/pointer/PointerEvent;)Z", "contextMenuBuilder", "Lkotlin/Function1;", "Landroidx/compose/foundation/contextmenu/ContextMenuScope;", "", "Lkotlin/ExtensionFunctionType;", "Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;", "contextMenuState", "Landroidx/compose/foundation/contextmenu/ContextMenuState;", "textFieldMagnifier", "Landroidx/compose/ui/Modifier;", "manager", "foundation_release", "magnifierSize", "Landroidx/compose/ui/unit/IntSize;"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class TextFieldSelectionManager_androidKt {
    @NotNull
    public static final Function1 contextMenuBuilder(@NotNull TextFieldSelectionManager textFieldSelectionManager0, @NotNull ContextMenuState contextMenuState0) {
        return new o(3, textFieldSelectionManager0, contextMenuState0);
    }

    public static final boolean isShiftPressed(@NotNull PointerEvent pointerEvent0) [...] // Inlined contents

    // 去混淆评级： 低(30)
    @NotNull
    public static final Modifier textFieldMagnifier(@NotNull Modifier modifier0, @NotNull TextFieldSelectionManager textFieldSelectionManager0) {
        return ComposedModifierKt.composed$default(modifier0, null, new x1(textFieldSelectionManager0), 1, null);
    }
}

