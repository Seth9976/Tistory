package androidx.compose.foundation.text;

import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.input.TextFieldValue;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class b extends Lambda implements Function1 {
    public final LegacyTextFieldState w;
    public final TextFieldValue x;
    public final OffsetMapping y;

    public b(LegacyTextFieldState legacyTextFieldState0, TextFieldValue textFieldValue0, OffsetMapping offsetMapping0) {
        this.w = legacyTextFieldState0;
        this.x = textFieldValue0;
        this.y = offsetMapping0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        LegacyTextFieldState legacyTextFieldState0 = this.w;
        TextLayoutResultProxy textLayoutResultProxy0 = legacyTextFieldState0.getLayoutResult();
        if(textLayoutResultProxy0 != null) {
            Canvas canvas0 = ((DrawScope)object0).getDrawContext().getCanvas();
            long v = legacyTextFieldState0.getSelectionPreviewHighlightRange-d9O1mEE();
            long v1 = legacyTextFieldState0.getDeletionPreviewHighlightRange-d9O1mEE();
            TextFieldDelegate.Companion.draw-Q1vqE60$foundation_release(canvas0, this.x, v, v1, this.y, textLayoutResultProxy0.getValue(), legacyTextFieldState0.getHighlightPaint(), legacyTextFieldState0.getSelectionBackgroundColor-0d7_KjU());
        }
        return Unit.INSTANCE;
    }
}

