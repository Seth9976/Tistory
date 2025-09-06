package androidx.compose.foundation.text.selection;

import androidx.compose.ui.input.pointer.PointerInputChange;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class g0 extends Lambda implements Function1 {
    public final int w;
    public final MouseSelectionObserver x;

    public g0(MouseSelectionObserver mouseSelectionObserver0, int v) {
        this.w = v;
        this.x = mouseSelectionObserver0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        if(this.w != 0) {
            if(this.x.onExtendDrag-k-4lQ0M(((PointerInputChange)object0).getPosition-F1C5BW0())) {
                ((PointerInputChange)object0).consume();
            }
            return Unit.INSTANCE;
        }
        if(this.x.onExtendDrag-k-4lQ0M(((PointerInputChange)object0).getPosition-F1C5BW0())) {
            ((PointerInputChange)object0).consume();
        }
        return Unit.INSTANCE;
    }
}

