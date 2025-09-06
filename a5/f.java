package a5;

import android.view.MotionEvent;
import android.widget.FrameLayout;

public final class f extends FrameLayout {
    @Override  // android.view.View
    public final boolean onGenericMotionEvent(MotionEvent motionEvent0) {
        return true;
    }

    @Override  // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent0) {
        return true;
    }
}

