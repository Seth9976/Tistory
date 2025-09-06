package androidx.compose.foundation.text.selection;

import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.platform.ViewConfiguration;

public final class k {
    public final ViewConfiguration a;
    public int b;
    public PointerInputChange c;

    public k(ViewConfiguration viewConfiguration0) {
        this.a = viewConfiguration0;
    }

    public final void a(PointerEvent pointerEvent0) {
        PointerInputChange pointerInputChange0 = this.c;
        PointerInputChange pointerInputChange1 = (PointerInputChange)pointerEvent0.getChanges().get(0);
        if(pointerInputChange0 == null || (pointerInputChange1.getUptimeMillis() - pointerInputChange0.getUptimeMillis() >= this.a.getDoubleTapTimeoutMillis() || !SelectionGesturesKt.a(this.a, pointerInputChange0, pointerInputChange1))) {
            this.b = 1;
        }
        else {
            ++this.b;
        }
        this.c = pointerInputChange1;
    }
}

