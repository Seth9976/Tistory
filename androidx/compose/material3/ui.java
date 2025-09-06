package androidx.compose.material3;

import androidx.compose.ui.focus.FocusRequester;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class ui extends Lambda implements Function0 {
    public final int w;
    public final FocusRequester x;

    public ui(FocusRequester focusRequester0, int v) {
        this.w = v;
        this.x = focusRequester0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        if(this.w != 0) {
            this.x.requestFocus();
            return Unit.INSTANCE;
        }
        this.x.requestFocus();
        return true;
    }
}

