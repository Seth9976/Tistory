package j0;

import androidx.compose.foundation.text.HandleState;
import androidx.compose.foundation.text.LegacyTextFieldState;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.input.TextFieldValue;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class i2 extends Lambda implements Function1 {
    public final LegacyTextFieldState w;

    public i2(LegacyTextFieldState legacyTextFieldState0) {
        this.w = legacyTextFieldState0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        String s = ((TextFieldValue)object0).getText();
        LegacyTextFieldState legacyTextFieldState0 = this.w;
        AnnotatedString annotatedString0 = legacyTextFieldState0.getUntransformedText();
        if(!Intrinsics.areEqual(s, (annotatedString0 == null ? null : annotatedString0.getText()))) {
            legacyTextFieldState0.setHandleState(HandleState.None);
        }
        legacyTextFieldState0.setSelectionPreviewHighlightRange-5zc-tL8(0L);
        legacyTextFieldState0.setDeletionPreviewHighlightRange-5zc-tL8(0L);
        legacyTextFieldState0.s.invoke(((TextFieldValue)object0));
        legacyTextFieldState0.getRecomposeScope().invalidate();
        return Unit.INSTANCE;
    }
}

