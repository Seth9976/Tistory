package androidx.compose.material3;

import androidx.compose.ui.focus.FocusRequester;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class r9 extends Lambda implements Function0 {
    public final int w;
    public final boolean x;
    public final FocusRequester y;

    public r9(boolean z, FocusRequester focusRequester0, int v) {
        this.w = v;
        this.x = z;
        this.y = focusRequester0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        if(this.w != 0) {
            if(this.x) {
                this.y.requestFocus();
            }
            return Unit.INSTANCE;
        }
        if(this.x) {
            this.y.requestFocus();
        }
        return Unit.INSTANCE;
    }
}

