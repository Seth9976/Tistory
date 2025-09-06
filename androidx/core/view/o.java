package androidx.core.view;

import android.view.MotionEvent;
import android.view.View.OnTouchListener;
import android.view.View;
import com.google.android.material.search.SearchView;
import f8.i;

public final class o implements View.OnTouchListener {
    public final int a;
    public final Object b;

    public o(Object object0, int v) {
        this.a = v;
        this.b = object0;
        super();
    }

    @Override  // android.view.View$OnTouchListener
    public final boolean onTouch(View view0, MotionEvent motionEvent0) {
        Object object0 = this.b;
        switch(this.a) {
            case 0: {
                return ((DragStartHelper)object0).onTouch(view0, motionEvent0);
            }
            case 1: {
                if(((SearchView)object0).b()) {
                    ((SearchView)object0).clearFocusAndHideKeyboard();
                }
                return false;
            }
            default: {
                ((i)object0).getClass();
                if(motionEvent0.getAction() == 1) {
                    long v = System.currentTimeMillis() - ((i)object0).o;
                    if(v < 0L || v > 300L) {
                        ((i)object0).m = false;
                    }
                    ((i)object0).u();
                    ((i)object0).m = true;
                    ((i)object0).o = System.currentTimeMillis();
                }
                return false;
            }
        }
    }
}

