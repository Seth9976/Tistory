package j0;

import androidx.compose.foundation.text.TextLinkScope;
import androidx.compose.ui.text.AnnotatedString;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class x0 extends Lambda implements Function0 {
    public final TextLinkScope w;
    public final AnnotatedString x;

    public x0(TextLinkScope textLinkScope0, AnnotatedString annotatedString0) {
        this.w = textLinkScope0;
        this.x = annotatedString0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        TextLinkScope textLinkScope0 = this.w;
        if(textLinkScope0 != null) {
            AnnotatedString annotatedString0 = textLinkScope0.applyAnnotators$foundation_release();
            return annotatedString0 == null ? this.x : annotatedString0;
        }
        return this.x;
    }
}

