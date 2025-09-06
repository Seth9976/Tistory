package j0;

import androidx.compose.foundation.relocation.BringIntoViewRequester;
import androidx.compose.foundation.text.CoreTextFieldKt;
import androidx.compose.foundation.text.LegacyTextFieldState;
import androidx.compose.foundation.text.TextLayoutResultProxy;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.ui.focus.FocusState;
import androidx.compose.ui.text.input.ImeOptions;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.TextInputService;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;

public final class r1 extends Lambda implements Function1 {
    public final TextFieldValue A;
    public final ImeOptions B;
    public final OffsetMapping C;
    public final TextFieldSelectionManager D;
    public final CoroutineScope E;
    public final BringIntoViewRequester F;
    public final LegacyTextFieldState w;
    public final boolean x;
    public final boolean y;
    public final TextInputService z;

    public r1(LegacyTextFieldState legacyTextFieldState0, boolean z, boolean z1, TextInputService textInputService0, TextFieldValue textFieldValue0, ImeOptions imeOptions0, OffsetMapping offsetMapping0, TextFieldSelectionManager textFieldSelectionManager0, CoroutineScope coroutineScope0, BringIntoViewRequester bringIntoViewRequester0) {
        this.w = legacyTextFieldState0;
        this.x = z;
        this.y = z1;
        this.z = textInputService0;
        this.A = textFieldValue0;
        this.B = imeOptions0;
        this.C = offsetMapping0;
        this.D = textFieldSelectionManager0;
        this.E = coroutineScope0;
        this.F = bringIntoViewRequester0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        LegacyTextFieldState legacyTextFieldState0 = this.w;
        if(legacyTextFieldState0.getHasFocus() != ((FocusState)object0).isFocused()) {
            legacyTextFieldState0.setHasFocus(((FocusState)object0).isFocused());
            if(!legacyTextFieldState0.getHasFocus() || !this.x || this.y) {
                CoreTextFieldKt.access$endInputSession(legacyTextFieldState0);
            }
            else {
                CoreTextFieldKt.access$startInputSession(this.z, legacyTextFieldState0, this.A, this.B, this.C);
            }
            if(((FocusState)object0).isFocused()) {
                TextLayoutResultProxy textLayoutResultProxy0 = legacyTextFieldState0.getLayoutResult();
                if(textLayoutResultProxy0 != null) {
                    q1 q10 = new q1(this.F, this.A, this.w, textLayoutResultProxy0, this.C, null);
                    BuildersKt.launch$default(this.E, null, null, q10, 3, null);
                }
            }
            if(!((FocusState)object0).isFocused()) {
                TextFieldSelectionManager.deselect-_kEHs6E$foundation_release$default(this.D, null, 1, null);
            }
        }
        return Unit.INSTANCE;
    }
}

