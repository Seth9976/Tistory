package x1;

import android.view.MotionEvent;
import androidx.compose.ui.input.pointer.PointerInteropFilter;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class j extends Lambda implements Function1 {
    public final int w;
    public final PointerInteropFilter x;

    public j(PointerInteropFilter pointerInteropFilter0, int v) {
        this.w = v;
        this.x = pointerInteropFilter0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        if(this.w != 0) {
            this.x.getOnTouchEvent().invoke(((MotionEvent)object0));
            return Unit.INSTANCE;
        }
        this.x.getOnTouchEvent().invoke(((MotionEvent)object0));
        return Unit.INSTANCE;
    }
}

