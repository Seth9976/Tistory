package androidx.compose.foundation.text;

import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.text.input.OffsetMapping;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class d extends Lambda implements Function1 {
    public final TextFieldSelectionManager A;
    public final OffsetMapping B;
    public final LegacyTextFieldState w;
    public final FocusRequester x;
    public final boolean y;
    public final boolean z;

    public d(LegacyTextFieldState legacyTextFieldState0, FocusRequester focusRequester0, boolean z, boolean z1, TextFieldSelectionManager textFieldSelectionManager0, OffsetMapping offsetMapping0) {
        this.w = legacyTextFieldState0;
        this.x = focusRequester0;
        this.y = z;
        this.z = z1;
        this.A = textFieldSelectionManager0;
        this.B = offsetMapping0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        long v = ((Offset)object0).unbox-impl();
        LegacyTextFieldState legacyTextFieldState0 = this.w;
        CoreTextFieldKt.access$tapToFocus(legacyTextFieldState0, this.x, !this.y);
        if(legacyTextFieldState0.getHasFocus() && this.z) {
            if(legacyTextFieldState0.getHandleState() == HandleState.Selection) {
                Offset offset0 = Offset.box-impl(v);
                this.A.deselect-_kEHs6E$foundation_release(offset0);
            }
            else {
                TextLayoutResultProxy textLayoutResultProxy0 = legacyTextFieldState0.getLayoutResult();
                if(textLayoutResultProxy0 != null) {
                    TextFieldDelegate.Companion.setCursorOffset-ULxng0E$foundation_release(v, textLayoutResultProxy0, legacyTextFieldState0.getProcessor(), this.B, legacyTextFieldState0.getOnValueChange());
                    if(legacyTextFieldState0.getTextDelegate().getText().length() > 0) {
                        legacyTextFieldState0.setHandleState(HandleState.Cursor);
                        return Unit.INSTANCE;
                    }
                }
            }
        }
        return Unit.INSTANCE;
    }
}

