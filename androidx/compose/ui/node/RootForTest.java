package androidx.compose.ui.node;

import android.view.KeyEvent;
import androidx.compose.ui.ExperimentalComposeUiApi;
import androidx.compose.ui.semantics.SemanticsOwner;
import androidx.compose.ui.text.input.TextInputService;
import androidx.compose.ui.unit.Density;
import kotlin.Deprecated;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0010\u001A\u00020\u00112\u0006\u0010\u0012\u001A\u00020\u0013H\u0017J\b\u0010\u0014\u001A\u00020\u0011H\u0017J\u001A\u0010\u0015\u001A\u00020\u00132\u0006\u0010\u0016\u001A\u00020\u0017H&ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001A\u001A\u00020\u00112\u0006\u0010\u001B\u001A\u00020\u001CH\u0017R\u0012\u0010\u0002\u001A\u00020\u0003X¦\u0004¢\u0006\u0006\u001A\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001A\u00020\u0007X¦\u0004¢\u0006\u0006\u001A\u0004\b\b\u0010\tR\u001A\u0010\n\u001A\u00020\u000B8&X§\u0004¢\u0006\f\u0012\u0004\b\f\u0010\r\u001A\u0004\b\u000E\u0010\u000Fø\u0001\u0001\u0082\u0002\r\n\u0005\b¡\u001E0\u0001\n\u0004\b!0\u0001¨\u0006\u001DÀ\u0006\u0001"}, d2 = {"Landroidx/compose/ui/node/RootForTest;", "", "density", "Landroidx/compose/ui/unit/Density;", "getDensity", "()Landroidx/compose/ui/unit/Density;", "semanticsOwner", "Landroidx/compose/ui/semantics/SemanticsOwner;", "getSemanticsOwner", "()Landroidx/compose/ui/semantics/SemanticsOwner;", "textInputService", "Landroidx/compose/ui/text/input/TextInputService;", "getTextInputService$annotations", "()V", "getTextInputService", "()Landroidx/compose/ui/text/input/TextInputService;", "forceAccessibilityForTesting", "", "enable", "", "measureAndLayoutForTest", "sendKeyEvent", "keyEvent", "Landroidx/compose/ui/input/key/KeyEvent;", "sendKeyEvent-ZmokQxo", "(Landroid/view/KeyEvent;)Z", "setAccessibilityEventBatchIntervalMillis", "intervalMillis", "", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public interface RootForTest {
    @ExperimentalComposeUiApi
    default void forceAccessibilityForTesting(boolean z) {
    }

    @NotNull
    Density getDensity();

    @NotNull
    SemanticsOwner getSemanticsOwner();

    @NotNull
    TextInputService getTextInputService();

    @Deprecated(message = "Use PlatformTextInputModifierNode instead.")
    static void getTextInputService$annotations() {
    }

    @ExperimentalComposeUiApi
    default void measureAndLayoutForTest() {
    }

    boolean sendKeyEvent-ZmokQxo(@NotNull KeyEvent arg1);

    @ExperimentalComposeUiApi
    default void setAccessibilityEventBatchIntervalMillis(long v) {
    }
}

