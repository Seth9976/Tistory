package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.TextDragObserver;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerEventKt;
import androidx.compose.ui.input.pointer.PointerInputChange;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class n0 extends Lambda implements Function1 {
    public final int w;
    public final TextDragObserver x;

    public n0(TextDragObserver textDragObserver0, int v) {
        this.w = v;
        this.x = textDragObserver0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        switch(this.w) {
            case 0: {
                long v = PointerEventKt.positionChange(((PointerInputChange)object0));
                this.x.onDrag-k-4lQ0M(v);
                ((PointerInputChange)object0).consume();
                return Unit.INSTANCE;
            }
            case 1: {
                long v1 = PointerEventKt.positionChange(((PointerInputChange)object0));
                this.x.onDrag-k-4lQ0M(v1);
                ((PointerInputChange)object0).consume();
                return Unit.INSTANCE;
            }
            case 2: {
                long v2 = PointerEventKt.positionChange(((PointerInputChange)object0));
                this.x.onDrag-k-4lQ0M(v2);
                ((PointerInputChange)object0).consume();
                return Unit.INSTANCE;
            }
            case 3: {
                this.x.onStart-k-4lQ0M(((Offset)object0).unbox-impl());
                return Unit.INSTANCE;
            }
            default: {
                this.x.onStart-k-4lQ0M(((Offset)object0).unbox-impl());
                return Unit.INSTANCE;
            }
        }
    }
}

