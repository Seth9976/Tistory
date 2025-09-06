package n2;

import androidx.compose.ui.text.style.TextForegroundStyle;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class c extends Lambda implements Function0 {
    public final int w;
    public final TextForegroundStyle x;

    public c(TextForegroundStyle textForegroundStyle0, int v) {
        this.w = v;
        this.x = textForegroundStyle0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return this.w != 0 ? this.x : this.x.getAlpha();
    }
}

