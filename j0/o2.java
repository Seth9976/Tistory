package j0;

import androidx.compose.foundation.text.TextDragObserver;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerInputChange;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class o2 extends Lambda implements Function2 {
    public final int w;
    public final TextDragObserver x;

    public o2(TextDragObserver textDragObserver0, int v) {
        this.w = v;
        this.x = textDragObserver0;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        if(this.w != 0) {
            PointerInputChange pointerInputChange0 = (PointerInputChange)object0;
            this.x.onDrag-k-4lQ0M(((Offset)object1).unbox-impl());
            return Unit.INSTANCE;
        }
        PointerInputChange pointerInputChange1 = (PointerInputChange)object0;
        this.x.onDrag-k-4lQ0M(((Offset)object1).unbox-impl());
        return Unit.INSTANCE;
    }
}

