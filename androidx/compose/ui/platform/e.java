package androidx.compose.ui.platform;

import androidx.compose.ui.input.InputMode;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class e extends Lambda implements Function1 {
    public final AndroidComposeView w;

    public e(AndroidComposeView androidComposeView0) {
        this.w = androidComposeView0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        int v = ((InputMode)object0).unbox-impl();
        AndroidComposeView androidComposeView0 = this.w;
        if(InputMode.equals-impl0(v, 1)) {
            return Boolean.valueOf(androidComposeView0.isInTouchMode());
        }
        if(InputMode.equals-impl0(v, 2)) {
            return androidComposeView0.isInTouchMode() ? Boolean.valueOf(androidComposeView0.requestFocusFromTouch()) : true;
        }
        return false;
    }
}

