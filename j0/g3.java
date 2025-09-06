package j0;

import androidx.compose.foundation.text.TextFieldScrollerPosition;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class g3 extends Lambda implements Function0 {
    public final int w;
    public final TextFieldScrollerPosition x;

    public g3(TextFieldScrollerPosition textFieldScrollerPosition0, int v) {
        this.w = v;
        this.x = textFieldScrollerPosition0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return this.w != 0 ? this.x.getOffset() < this.x.getMaximum() : this.x.getOffset() > 0.0f;
    }
}

