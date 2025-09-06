package androidx.compose.foundation.text.selection;

import aa.o;
import android.view.KeyEvent;
import androidx.compose.foundation.contextmenu.ContextMenuState;
import androidx.compose.foundation.text.KeyCommand;
import androidx.compose.foundation.text.KeyMapping_androidKt;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\u001A\u001A\u0010\u0000\u001A\u00020\u00012\u0006\u0010\u0002\u001A\u00020\u0003H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001A%\u0010\u0006\u001A\u0013\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0002\b\n*\u00020\u000B2\u0006\u0010\f\u001A\u00020\rH\u0000\u001A\u0014\u0010\u000E\u001A\u00020\u000F*\u00020\u000F2\u0006\u0010\u0010\u001A\u00020\u000BH\u0000\u0082\u0002\u0007\n\u0005\b¡\u001E0\u0001¨\u0006\u0011²\u0006\n\u0010\u0012\u001A\u00020\u0013X\u008A\u008E\u0002"}, d2 = {"isCopyKeyEvent", "", "keyEvent", "Landroidx/compose/ui/input/key/KeyEvent;", "isCopyKeyEvent-ZmokQxo", "(Landroid/view/KeyEvent;)Z", "contextMenuBuilder", "Lkotlin/Function1;", "Landroidx/compose/foundation/contextmenu/ContextMenuScope;", "", "Lkotlin/ExtensionFunctionType;", "Landroidx/compose/foundation/text/selection/SelectionManager;", "state", "Landroidx/compose/foundation/contextmenu/ContextMenuState;", "selectionMagnifier", "Landroidx/compose/ui/Modifier;", "manager", "foundation_release", "magnifierSize", "Landroidx/compose/ui/unit/IntSize;"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class SelectionManager_androidKt {
    @NotNull
    public static final Function1 contextMenuBuilder(@NotNull SelectionManager selectionManager0, @NotNull ContextMenuState contextMenuState0) {
        return new o(2, contextMenuState0, selectionManager0);
    }

    public static final boolean isCopyKeyEvent-ZmokQxo(@NotNull KeyEvent keyEvent0) {
        return KeyMapping_androidKt.getPlatformDefaultKeyMapping().map-ZmokQxo(keyEvent0) == KeyCommand.COPY;
    }

    // 去混淆评级： 低(30)
    @NotNull
    public static final Modifier selectionMagnifier(@NotNull Modifier modifier0, @NotNull SelectionManager selectionManager0) {
        return ComposedModifierKt.composed$default(modifier0, null, new k1(selectionManager0), 1, null);
    }
}

