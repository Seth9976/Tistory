package j0;

import android.view.InputDevice;
import android.view.KeyEvent;
import androidx.compose.foundation.text.LegacyTextFieldState;
import androidx.compose.foundation.text.TextFieldFocusModifier_androidKt;
import androidx.compose.ui.focus.FocusManager;
import androidx.compose.ui.input.key.KeyEventType;
import androidx.compose.ui.input.key.KeyEvent_androidKt;
import androidx.compose.ui.platform.SoftwareKeyboardController;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class x2 extends Lambda implements Function1 {
    public final FocusManager w;
    public final LegacyTextFieldState x;

    public x2(FocusManager focusManager0, LegacyTextFieldState legacyTextFieldState0) {
        this.w = focusManager0;
        this.x = legacyTextFieldState0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        KeyEvent keyEvent0 = ((androidx.compose.ui.input.key.KeyEvent)object0).unbox-impl();
        InputDevice inputDevice0 = keyEvent0.getDevice();
        boolean z = false;
        if(inputDevice0 != null && inputDevice0.supportsSource(0x201) && !inputDevice0.isVirtual() && KeyEventType.equals-impl0(KeyEvent_androidKt.getType-ZmokQxo(keyEvent0), 2) && keyEvent0.getSource() != 0x101) {
            boolean z1 = TextFieldFocusModifier_androidKt.access$isKeyCode-YhN2O0w(keyEvent0, 19);
            FocusManager focusManager0 = this.w;
            if(z1) {
                return Boolean.valueOf(focusManager0.moveFocus-3ESFkO8(5));
            }
            if(TextFieldFocusModifier_androidKt.access$isKeyCode-YhN2O0w(keyEvent0, 20)) {
                return Boolean.valueOf(focusManager0.moveFocus-3ESFkO8(6));
            }
            if(TextFieldFocusModifier_androidKt.access$isKeyCode-YhN2O0w(keyEvent0, 21)) {
                return Boolean.valueOf(focusManager0.moveFocus-3ESFkO8(3));
            }
            if(TextFieldFocusModifier_androidKt.access$isKeyCode-YhN2O0w(keyEvent0, 22)) {
                return Boolean.valueOf(focusManager0.moveFocus-3ESFkO8(4));
            }
            if(TextFieldFocusModifier_androidKt.access$isKeyCode-YhN2O0w(keyEvent0, 23)) {
                SoftwareKeyboardController softwareKeyboardController0 = this.x.getKeyboardController();
                if(softwareKeyboardController0 != null) {
                    softwareKeyboardController0.show();
                }
                z = true;
            }
        }
        return Boolean.valueOf(z);
    }
}

