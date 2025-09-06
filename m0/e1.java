package m0;

import androidx.compose.foundation.text.input.internal.TextLayoutState;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class e1 extends Lambda implements Function0 {
    public final TextLayoutState w;

    public e1(TextLayoutState textLayoutState0) {
        this.w = textLayoutState0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return this.w.a.getValue();
    }
}

