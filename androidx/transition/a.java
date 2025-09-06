package androidx.transition;

import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.Property;

public final class a extends Property {
    public Rect a;

    @Override  // android.util.Property
    public final Object get(Object object0) {
        Rect rect0 = this.a;
        ((Drawable)object0).copyBounds(rect0);
        return new PointF(((float)rect0.left), ((float)rect0.top));
    }

    @Override  // android.util.Property
    public final void set(Object object0, Object object1) {
        Rect rect0 = this.a;
        ((Drawable)object0).copyBounds(rect0);
        rect0.offsetTo(Math.round(((PointF)object1).x), Math.round(((PointF)object1).y));
        ((Drawable)object0).setBounds(rect0);
    }
}

