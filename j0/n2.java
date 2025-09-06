package j0;

import androidx.compose.foundation.text.TextDragObserver;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class n2 extends Lambda implements Function0 {
    public final int w;
    public final TextDragObserver x;

    public n2(TextDragObserver textDragObserver0, int v) {
        this.w = v;
        this.x = textDragObserver0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch(this.w) {
            case 0: {
                this.x.onStop();
                return Unit.INSTANCE;
            }
            case 1: {
                this.x.onCancel();
                return Unit.INSTANCE;
            }
            case 2: {
                this.x.onStop();
                return Unit.INSTANCE;
            }
            default: {
                this.x.onCancel();
                return Unit.INSTANCE;
            }
        }
    }
}

