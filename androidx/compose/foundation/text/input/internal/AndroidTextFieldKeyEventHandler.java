package androidx.compose.foundation.text.input.internal;

import android.view.InputDevice;
import android.view.KeyEvent;
import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.focus.FocusManager;
import androidx.compose.ui.input.key.KeyEventType;
import androidx.compose.ui.input.key.KeyEvent_androidKt;
import androidx.compose.ui.platform.SoftwareKeyboardController;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002JP\u0010\u0003\u001A\u00020\u00042\u0006\u0010\u0005\u001A\u00020\u00062\u0006\u0010\u0007\u001A\u00020\b2\u0006\u0010\t\u001A\u00020\n2\u0006\u0010\u000B\u001A\u00020\f2\u0006\u0010\r\u001A\u00020\u00042\u0006\u0010\u000E\u001A\u00020\u00042\f\u0010\u000F\u001A\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J:\u0010\u0014\u001A\u00020\u00042\u0006\u0010\u0005\u001A\u00020\u00062\u0006\u0010\u0007\u001A\u00020\b2\u0006\u0010\u000B\u001A\u00020\f2\u0006\u0010\u0015\u001A\u00020\u00162\u0006\u0010\u0017\u001A\u00020\u0018H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001A\u0082\u0002\u0007\n\u0005\b¡\u001E0\u0001¨\u0006\u001B"}, d2 = {"Landroidx/compose/foundation/text/input/internal/AndroidTextFieldKeyEventHandler;", "Landroidx/compose/foundation/text/input/internal/TextFieldKeyEventHandler;", "()V", "onKeyEvent", "", "event", "Landroidx/compose/ui/input/key/KeyEvent;", "textFieldState", "Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;", "textLayoutState", "Landroidx/compose/foundation/text/input/internal/TextLayoutState;", "textFieldSelectionState", "Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;", "editable", "singleLine", "onSubmit", "Lkotlin/Function0;", "", "onKeyEvent-6ptp14s", "(Landroid/view/KeyEvent;Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;Landroidx/compose/foundation/text/input/internal/TextLayoutState;Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;ZZLkotlin/jvm/functions/Function0;)Z", "onPreKeyEvent", "focusManager", "Landroidx/compose/ui/focus/FocusManager;", "keyboardController", "Landroidx/compose/ui/platform/SoftwareKeyboardController;", "onPreKeyEvent-MyFupTE", "(Landroid/view/KeyEvent;Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;Landroidx/compose/ui/focus/FocusManager;Landroidx/compose/ui/platform/SoftwareKeyboardController;)Z", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class AndroidTextFieldKeyEventHandler extends TextFieldKeyEventHandler {
    public static final int $stable;

    @Override  // androidx.compose.foundation.text.input.internal.TextFieldKeyEventHandler
    public boolean onKeyEvent-6ptp14s(@NotNull KeyEvent keyEvent0, @NotNull TransformedTextFieldState transformedTextFieldState0, @NotNull TextLayoutState textLayoutState0, @NotNull TextFieldSelectionState textFieldSelectionState0, boolean z, boolean z1, @NotNull Function0 function00) {
        if(KeyEventType.equals-impl0(KeyEvent_androidKt.getType-ZmokQxo(keyEvent0), 2) && keyEvent0.isFromSource(0x101) && !TextFieldKeyEventHandler_androidKt.isFromSoftKeyboard-ZmokQxo(keyEvent0)) {
            textFieldSelectionState0.setInTouchMode(false);
        }
        return super.onKeyEvent-6ptp14s(keyEvent0, transformedTextFieldState0, textLayoutState0, textFieldSelectionState0, z, z1, function00);
    }

    @Override  // androidx.compose.foundation.text.input.internal.TextFieldKeyEventHandler
    public boolean onPreKeyEvent-MyFupTE(@NotNull KeyEvent keyEvent0, @NotNull TransformedTextFieldState transformedTextFieldState0, @NotNull TextFieldSelectionState textFieldSelectionState0, @NotNull FocusManager focusManager0, @NotNull SoftwareKeyboardController softwareKeyboardController0) {
        if(super.onPreKeyEvent-MyFupTE(keyEvent0, transformedTextFieldState0, textFieldSelectionState0, focusManager0, softwareKeyboardController0)) {
            return true;
        }
        InputDevice inputDevice0 = keyEvent0.getDevice();
        if(inputDevice0 != null && (inputDevice0.supportsSource(0x201) && !inputDevice0.isVirtual() && KeyEventType.equals-impl0(KeyEvent_androidKt.getType-ZmokQxo(keyEvent0), 2) && keyEvent0.getSource() != 0x101)) {
            if(TextFieldKeyEventHandler_androidKt.access$isKeyCode-YhN2O0w(keyEvent0, 19)) {
                return focusManager0.moveFocus-3ESFkO8(5);
            }
            if(TextFieldKeyEventHandler_androidKt.access$isKeyCode-YhN2O0w(keyEvent0, 20)) {
                return focusManager0.moveFocus-3ESFkO8(6);
            }
            if(TextFieldKeyEventHandler_androidKt.access$isKeyCode-YhN2O0w(keyEvent0, 21)) {
                return focusManager0.moveFocus-3ESFkO8(3);
            }
            if(TextFieldKeyEventHandler_androidKt.access$isKeyCode-YhN2O0w(keyEvent0, 22)) {
                return focusManager0.moveFocus-3ESFkO8(4);
            }
            if(TextFieldKeyEventHandler_androidKt.access$isKeyCode-YhN2O0w(keyEvent0, 23)) {
                softwareKeyboardController0.show();
                return true;
            }
        }
        return false;
    }
}

