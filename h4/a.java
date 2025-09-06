package h4;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable.Callback;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import androidx.core.view.ViewCompat;
import androidx.legacy.app.ActionBarDrawerToggle;

public final class a extends InsetDrawable implements Drawable.Callback {
    public final boolean a;
    public final Rect b;
    public float c;
    public float d;
    public final ActionBarDrawerToggle e;

    public a(ActionBarDrawerToggle actionBarDrawerToggle0, Drawable drawable0) {
        this.e = actionBarDrawerToggle0;
        super(drawable0, 0);
        this.a = true;
        this.b = new Rect();
    }

    @Override  // android.graphics.drawable.DrawableWrapper
    public final void draw(Canvas canvas0) {
        Rect rect0 = this.b;
        this.copyBounds(rect0);
        canvas0.save();
        int v = 1;
        boolean z = ViewCompat.getLayoutDirection(this.e.a.getWindow().getDecorView()) == 1;
        if(z) {
            v = -1;
        }
        int v1 = rect0.width();
        canvas0.translate(-this.d * ((float)v1) * this.c * ((float)v), 0.0f);
        if(z && !this.a) {
            canvas0.translate(((float)v1), 0.0f);
            canvas0.scale(-1.0f, 1.0f);
        }
        super.draw(canvas0);
        canvas0.restore();
    }
}

