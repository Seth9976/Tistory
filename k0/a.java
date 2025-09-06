package k0;

import androidx.compose.foundation.text.input.internal.ComposeInputMethodManager;
import androidx.compose.foundation.text.input.internal.ComposeInputMethodManager_androidKt;
import androidx.compose.ui.node.DelegatableNode_androidKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class a extends Lambda implements Function0 {
    public final int w;
    public final b x;

    public a(b b0, int v) {
        this.w = v;
        this.x = b0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        if(this.w != 0) {
            this.x.p.invoke();
            ((ComposeInputMethodManager)this.x.q.getValue()).prepareStylusHandwritingDelegation();
            return true;
        }
        return ComposeInputMethodManager_androidKt.ComposeInputMethodManager(DelegatableNode_androidKt.requireView(this.x));
    }
}

