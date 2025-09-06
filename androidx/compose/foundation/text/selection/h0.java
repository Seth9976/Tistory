package androidx.compose.foundation.text.selection;

import androidx.compose.ui.input.pointer.PointerInputChange;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class h0 extends Lambda implements Function1 {
    public final int w;
    public final MouseSelectionObserver x;
    public final SelectionAdjustment y;

    public h0(MouseSelectionObserver mouseSelectionObserver0, SelectionAdjustment selectionAdjustment0, int v) {
        this.w = v;
        this.x = mouseSelectionObserver0;
        this.y = selectionAdjustment0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        if(this.w != 0) {
            if(this.x.onDrag-3MmeM6k(((PointerInputChange)object0).getPosition-F1C5BW0(), this.y)) {
                ((PointerInputChange)object0).consume();
            }
            return Unit.INSTANCE;
        }
        if(this.x.onDrag-3MmeM6k(((PointerInputChange)object0).getPosition-F1C5BW0(), this.y)) {
            ((PointerInputChange)object0).consume();
        }
        return Unit.INSTANCE;
    }
}

