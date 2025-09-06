package j0;

import androidx.compose.foundation.text.TextLinkScope;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class s0 extends Lambda implements Function0 {
    public final TextLinkScope w;

    public s0(TextLinkScope textLinkScope0) {
        this.w = textLinkScope0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return this.w == null ? false : Boolean.valueOf(((Boolean)this.w.getShouldMeasureLinks().invoke()).booleanValue());
    }
}

