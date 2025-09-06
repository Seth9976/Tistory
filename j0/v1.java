package j0;

import androidx.compose.foundation.text.LegacyTextFieldState;
import androidx.compose.foundation.text.input.internal.LegacyPlatformTextInputServiceAdapter;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.text.input.ImeOptions;
import androidx.compose.ui.text.input.KeyboardType;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class v1 extends Lambda implements Function0 {
    public final LegacyTextFieldState w;
    public final FocusRequester x;
    public final ImeOptions y;
    public final LegacyPlatformTextInputServiceAdapter z;

    public v1(LegacyTextFieldState legacyTextFieldState0, FocusRequester focusRequester0, ImeOptions imeOptions0, LegacyPlatformTextInputServiceAdapter legacyPlatformTextInputServiceAdapter0) {
        this.w = legacyTextFieldState0;
        this.x = focusRequester0;
        this.y = imeOptions0;
        this.z = legacyPlatformTextInputServiceAdapter0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        if(!this.w.getHasFocus()) {
            this.x.requestFocus();
        }
        if(!KeyboardType.equals-impl0(this.y.getKeyboardType-PjHm6EE(), 7) && !KeyboardType.equals-impl0(this.y.getKeyboardType-PjHm6EE(), 8)) {
            this.z.startStylusHandwriting();
        }
        return true;
    }
}

