package androidx.compose.foundation.text;

import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.foundation.text.selection.TextFieldSelectionManagerKt;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.platform.WindowInfo;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.TextInputSession;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class c extends Lambda implements Function1 {
    public final TextFieldValue A;
    public final OffsetMapping B;
    public final LegacyTextFieldState w;
    public final boolean x;
    public final WindowInfo y;
    public final TextFieldSelectionManager z;

    public c(LegacyTextFieldState legacyTextFieldState0, boolean z, WindowInfo windowInfo0, TextFieldSelectionManager textFieldSelectionManager0, TextFieldValue textFieldValue0, OffsetMapping offsetMapping0) {
        this.w = legacyTextFieldState0;
        this.x = z;
        this.y = windowInfo0;
        this.z = textFieldSelectionManager0;
        this.A = textFieldValue0;
        this.B = offsetMapping0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        LegacyTextFieldState legacyTextFieldState0 = this.w;
        legacyTextFieldState0.setLayoutCoordinates(((LayoutCoordinates)object0));
        TextLayoutResultProxy textLayoutResultProxy0 = legacyTextFieldState0.getLayoutResult();
        if(textLayoutResultProxy0 != null) {
            textLayoutResultProxy0.setInnerTextFieldCoordinates(((LayoutCoordinates)object0));
        }
        if(this.x) {
            HandleState handleState0 = legacyTextFieldState0.getHandleState();
            TextFieldValue textFieldValue0 = this.A;
            TextFieldSelectionManager textFieldSelectionManager0 = this.z;
            if(handleState0 == HandleState.Selection) {
                if(!legacyTextFieldState0.getShowFloatingToolbar() || !this.y.isWindowFocused()) {
                    textFieldSelectionManager0.hideSelectionToolbar$foundation_release();
                }
                else {
                    textFieldSelectionManager0.showSelectionToolbar$foundation_release();
                }
                legacyTextFieldState0.setShowSelectionHandleStart(TextFieldSelectionManagerKt.isSelectionHandleInVisibleBound(textFieldSelectionManager0, true));
                legacyTextFieldState0.setShowSelectionHandleEnd(TextFieldSelectionManagerKt.isSelectionHandleInVisibleBound(textFieldSelectionManager0, false));
                legacyTextFieldState0.setShowCursorHandle(TextRange.getCollapsed-impl(textFieldValue0.getSelection-d9O1mEE()));
            }
            else if(legacyTextFieldState0.getHandleState() == HandleState.Cursor) {
                legacyTextFieldState0.setShowCursorHandle(TextFieldSelectionManagerKt.isSelectionHandleInVisibleBound(textFieldSelectionManager0, true));
            }
            OffsetMapping offsetMapping0 = this.B;
            CoreTextFieldKt.b(legacyTextFieldState0, textFieldValue0, offsetMapping0);
            TextLayoutResultProxy textLayoutResultProxy1 = legacyTextFieldState0.getLayoutResult();
            if(textLayoutResultProxy1 != null) {
                TextInputSession textInputSession0 = legacyTextFieldState0.getInputSession();
                if(textInputSession0 != null && legacyTextFieldState0.getHasFocus()) {
                    TextFieldDelegate.Companion.updateTextLayoutResult$foundation_release(textInputSession0, textFieldValue0, offsetMapping0, textLayoutResultProxy1);
                }
            }
        }
        return Unit.INSTANCE;
    }
}

