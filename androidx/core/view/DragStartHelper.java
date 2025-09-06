package androidx.core.view;

import android.graphics.Point;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.NonNull;

public class DragStartHelper {
    public interface OnDragStartListener {
        boolean onDragStart(@NonNull View arg1, @NonNull DragStartHelper arg2);
    }

    public final View a;
    public final OnDragStartListener b;
    public int c;
    public int d;
    public boolean e;
    public final n f;
    public final o g;

    public DragStartHelper(@NonNull View view0, @NonNull OnDragStartListener dragStartHelper$OnDragStartListener0) {
        this.f = new n(this, 0);
        this.g = new o(this, 0);
        this.a = view0;
        this.b = dragStartHelper$OnDragStartListener0;
    }

    public void attach() {
        this.a.setOnLongClickListener(this.f);
        this.a.setOnTouchListener(this.g);
    }

    public void detach() {
        this.a.setOnLongClickListener(null);
        this.a.setOnTouchListener(null);
    }

    public void getTouchPosition(@NonNull Point point0) {
        point0.set(this.c, this.d);
    }

    public boolean onLongClick(@NonNull View view0) {
        if(this.e) {
            return true;
        }
        boolean z = this.b.onDragStart(view0, this);
        this.e = z;
        return z;
    }

    public boolean onTouch(@NonNull View view0, @NonNull MotionEvent motionEvent0) {
        int v = (int)motionEvent0.getX();
        int v1 = (int)motionEvent0.getY();
        switch(motionEvent0.getAction()) {
            case 0: {
                this.c = v;
                this.d = v1;
                return false;
            }
            case 2: {
                if(MotionEventCompat.isFromSource(motionEvent0, 0x2002) && (motionEvent0.getButtonState() & 1) != 0 && !this.e && (this.c != v || this.d != v1)) {
                    this.c = v;
                    this.d = v1;
                    boolean z = this.b.onDragStart(view0, this);
                    this.e = z;
                    return z;
                }
                return false;
            }
            case 1: 
            case 3: {
                this.e = false;
                return false;
            }
            default: {
                return false;
            }
        }
    }
}

