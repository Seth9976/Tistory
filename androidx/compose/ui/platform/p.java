package androidx.compose.ui.platform;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class p extends Lambda implements Function0 {
    public final AndroidComposeView w;

    public p(AndroidComposeView androidComposeView0) {
        this.w = androidComposeView0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return this.w.get_viewTreeOwners();
    }
}

