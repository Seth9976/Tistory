package androidx.appcompat.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources.Theme;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable.Callback;
import android.graphics.drawable.Drawable.ConstantState;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.appcompat.widget.a;
import androidx.core.graphics.drawable.DrawableCompat;
import d5.b;
import l.e;

public class DrawableContainerCompat extends Drawable implements Drawable.Callback {
    public e a;
    public Rect b;
    public Drawable c;
    public Drawable d;
    public int e;
    public boolean f;
    public int g;
    public boolean h;
    public a i;
    public long j;
    public long k;
    public b l;
    public static final int m;

    public DrawableContainerCompat() {
        this.e = 0xFF;
        this.g = -1;
    }

    public final void a(boolean z) {
        int v3;
        int v = 1;
        this.f = true;
        long v1 = SystemClock.uptimeMillis();
        Drawable drawable0 = this.c;
        if(drawable0 == null) {
            this.j = 0L;
            v3 = 0;
        }
        else {
            long v2 = this.j;
            if(v2 == 0L) {
                v3 = 0;
            }
            else if(v2 <= v1) {
                drawable0.setAlpha(this.e);
                this.j = 0L;
                v3 = 0;
            }
            else {
                drawable0.setAlpha((0xFF - ((int)((v2 - v1) * 0xFFL)) / this.a.z) * this.e / 0xFF);
                v3 = 1;
            }
        }
        Drawable drawable1 = this.d;
        if(drawable1 == null) {
            this.k = 0L;
            v = v3;
        }
        else {
            long v4 = this.k;
            if(v4 == 0L) {
                v = v3;
            }
            else if(v4 <= v1) {
                drawable1.setVisible(false, false);
                this.d = null;
                this.k = 0L;
                v = v3;
            }
            else {
                drawable1.setAlpha(((int)((v4 - v1) * 0xFFL)) / this.a.A * this.e / 0xFF);
            }
        }
        if(z && v != 0) {
            this.scheduleSelf(this.i, v1 + 16L);
        }
    }

    @Override  // android.graphics.drawable.Drawable
    @RequiresApi(21)
    public void applyTheme(@NonNull Resources.Theme resources$Theme0) {
        e e0 = this.a;
        if(resources$Theme0 == null) {
            e0.getClass();
        }
        else {
            e0.c();
            int v = e0.h;
            Drawable[] arr_drawable = e0.g;
            for(int v1 = 0; v1 < v; ++v1) {
                Drawable drawable0 = arr_drawable[v1];
                if(drawable0 != null && DrawableCompat.canApplyTheme(drawable0)) {
                    DrawableCompat.applyTheme(arr_drawable[v1], resources$Theme0);
                    e0.e |= arr_drawable[v1].getChangingConfigurations();
                }
            }
            Resources resources0 = resources$Theme0.getResources();
            if(resources0 != null) {
                e0.b = resources0;
                int v2 = resources0.getDisplayMetrics().densityDpi;
                if(v2 == 0) {
                    v2 = 0xA0;
                }
                int v3 = e0.c;
                e0.c = v2;
                if(v3 != v2) {
                    e0.m = false;
                    e0.j = false;
                }
            }
        }
    }

    public e b() {
        return this.a;
    }

    public final void c(Drawable drawable0) {
        if(this.l == null) {
            this.l = new b();
        }
        b b0 = this.l;
        b0.b = drawable0.getCallback();
        drawable0.setCallback(b0);
        try {
            if(this.a.z <= 0 && this.f) {
                drawable0.setAlpha(this.e);
            }
            e e0 = this.a;
            if(e0.D) {
                drawable0.setColorFilter(e0.C);
            }
            else {
                if(e0.G) {
                    DrawableCompat.setTintList(drawable0, e0.E);
                }
                e e1 = this.a;
                if(e1.H) {
                    DrawableCompat.setTintMode(drawable0, e1.F);
                }
            }
            drawable0.setVisible(this.isVisible(), true);
            drawable0.setDither(this.a.x);
            drawable0.setState(this.getState());
            drawable0.setLevel(this.getLevel());
            drawable0.setBounds(this.getBounds());
            DrawableCompat.setLayoutDirection(drawable0, DrawableCompat.getLayoutDirection(this));
            DrawableCompat.setAutoMirrored(drawable0, this.a.B);
            Rect rect0 = this.b;
            if(rect0 != null) {
                DrawableCompat.setHotspotBounds(drawable0, rect0.left, rect0.top, rect0.right, rect0.bottom);
            }
        }
        finally {
            b b1 = this.l;
            Drawable.Callback drawable$Callback0 = (Drawable.Callback)b1.b;
            b1.b = null;
            drawable0.setCallback(drawable$Callback0);
        }
    }

    @Override  // android.graphics.drawable.Drawable
    @RequiresApi(21)
    public boolean canApplyTheme() {
        return this.a.canApplyTheme();
    }

    public final boolean d(int v) {
        if(v == this.g) {
            return false;
        }
        long v1 = SystemClock.uptimeMillis();
        if(this.a.A > 0) {
            Drawable drawable0 = this.d;
            if(drawable0 != null) {
                drawable0.setVisible(false, false);
            }
            Drawable drawable1 = this.c;
            if(drawable1 == null) {
                this.d = null;
                this.k = 0L;
            }
            else {
                this.d = drawable1;
                this.k = ((long)this.a.A) + v1;
            }
        }
        else {
            Drawable drawable2 = this.c;
            if(drawable2 != null) {
                drawable2.setVisible(false, false);
            }
        }
        if(v >= 0) {
            e e0 = this.a;
            if(v < e0.h) {
                Drawable drawable3 = e0.d(v);
                this.c = drawable3;
                this.g = v;
                if(drawable3 != null) {
                    int v2 = this.a.z;
                    if(v2 > 0) {
                        this.j = v1 + ((long)v2);
                    }
                    this.c(drawable3);
                }
            }
            else {
                this.c = null;
                this.g = -1;
            }
        }
        else {
            this.c = null;
            this.g = -1;
        }
        if(Long.compare(this.j, 0L) != 0 || this.k != 0L) {
            a a0 = this.i;
            if(a0 == null) {
                this.i = new a(((StateListDrawableCompat)this), 18);
            }
            else {
                this.unscheduleSelf(a0);
            }
            this.a(true);
        }
        this.invalidateSelf();
        return true;
    }

    @Override  // android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas0) {
        Drawable drawable0 = this.c;
        if(drawable0 != null) {
            drawable0.draw(canvas0);
        }
        Drawable drawable1 = this.d;
        if(drawable1 != null) {
            drawable1.draw(canvas0);
        }
    }

    public void e(e e0) {
        this.a = e0;
        int v = this.g;
        if(v >= 0) {
            Drawable drawable0 = e0.d(v);
            this.c = drawable0;
            if(drawable0 != null) {
                this.c(drawable0);
            }
        }
        this.d = null;
    }

    @Override  // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.e;
    }

    @Override  // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        return super.getChangingConfigurations() | this.a.getChangingConfigurations();
    }

    @Override  // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        boolean z;
        e e0 = this.a;
        if(e0.v) {
            z = e0.w;
        }
        else {
            e0.c();
            e0.v = true;
            int v = e0.h;
            Drawable[] arr_drawable = e0.g;
            for(int v1 = 0; true; ++v1) {
                if(v1 >= v) {
                    e0.w = true;
                    z = true;
                    break;
                }
                if(arr_drawable[v1].getConstantState() == null) {
                    e0.w = false;
                    z = false;
                    break;
                }
            }
        }
        if(z) {
            e e1 = this.a;
            e1.d = this.getChangingConfigurations();
            return this.a;
        }
        return null;
    }

    @Override  // android.graphics.drawable.Drawable
    @NonNull
    public Drawable getCurrent() {
        return this.c;
    }

    @Override  // android.graphics.drawable.Drawable
    public void getHotspotBounds(@NonNull Rect rect0) {
        Rect rect1 = this.b;
        if(rect1 != null) {
            rect0.set(rect1);
            return;
        }
        super.getHotspotBounds(rect0);
    }

    @Override  // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        e e0 = this.a;
        if(e0.l) {
            if(!e0.m) {
                e0.b();
            }
            return e0.o;
        }
        return this.c == null ? -1 : this.c.getIntrinsicHeight();
    }

    @Override  // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        e e0 = this.a;
        if(e0.l) {
            if(!e0.m) {
                e0.b();
            }
            return e0.n;
        }
        return this.c == null ? -1 : this.c.getIntrinsicWidth();
    }

    @Override  // android.graphics.drawable.Drawable
    public int getMinimumHeight() {
        e e0 = this.a;
        if(e0.l) {
            if(!e0.m) {
                e0.b();
            }
            return e0.q;
        }
        return this.c == null ? 0 : this.c.getMinimumHeight();
    }

    @Override  // android.graphics.drawable.Drawable
    public int getMinimumWidth() {
        e e0 = this.a;
        if(e0.l) {
            if(!e0.m) {
                e0.b();
            }
            return e0.p;
        }
        return this.c == null ? 0 : this.c.getMinimumWidth();
    }

    @Override  // android.graphics.drawable.Drawable
    public int getOpacity() {
        int v = -2;
        if(this.c != null && this.c.isVisible()) {
            e e0 = this.a;
            if(e0.r) {
                return e0.s;
            }
            e0.c();
            int v1 = e0.h;
            Drawable[] arr_drawable = e0.g;
            if(v1 > 0) {
                v = arr_drawable[0].getOpacity();
            }
            for(int v2 = 1; v2 < v1; ++v2) {
                v = Drawable.resolveOpacity(v, arr_drawable[v2].getOpacity());
            }
            e0.s = v;
            e0.r = true;
        }
        return v;
    }

    @Override  // android.graphics.drawable.Drawable
    @RequiresApi(21)
    public void getOutline(@NonNull Outline outline0) {
        Drawable drawable0 = this.c;
        if(drawable0 != null) {
            drawable0.getOutline(outline0);
        }
    }

    @Override  // android.graphics.drawable.Drawable
    public boolean getPadding(@NonNull Rect rect0) {
        e e0 = this.a;
        boolean z = false;
        Rect rect1 = null;
        if(!e0.i) {
            Rect rect2 = e0.k;
            if(rect2 != null || e0.j) {
                rect1 = rect2;
            }
            else {
                e0.c();
                Rect rect3 = new Rect();
                int v = e0.h;
                Drawable[] arr_drawable = e0.g;
                for(int v1 = 0; v1 < v; ++v1) {
                    if(arr_drawable[v1].getPadding(rect3)) {
                        if(rect1 == null) {
                            rect1 = new Rect(0, 0, 0, 0);
                        }
                        int v2 = rect3.left;
                        if(v2 > rect1.left) {
                            rect1.left = v2;
                        }
                        int v3 = rect3.top;
                        if(v3 > rect1.top) {
                            rect1.top = v3;
                        }
                        int v4 = rect3.right;
                        if(v4 > rect1.right) {
                            rect1.right = v4;
                        }
                        int v5 = rect3.bottom;
                        if(v5 > rect1.bottom) {
                            rect1.bottom = v5;
                        }
                    }
                }
                e0.j = true;
                e0.k = rect1;
            }
        }
        if(rect1 == null) {
            Drawable drawable0 = this.c;
            z = drawable0 == null ? super.getPadding(rect0) : drawable0.getPadding(rect0);
        }
        else {
            rect0.set(rect1);
            if((rect1.left | rect1.top | rect1.bottom | rect1.right) != 0) {
                z = true;
            }
        }
        if(this.isAutoMirrored() && DrawableCompat.getLayoutDirection(this) == 1) {
            int v6 = rect0.left;
            rect0.left = rect0.right;
            rect0.right = v6;
        }
        return z;
    }

    @Override  // android.graphics.drawable.Drawable$Callback
    public void invalidateDrawable(@NonNull Drawable drawable0) {
        e e0 = this.a;
        if(e0 != null) {
            e0.r = false;
            e0.t = false;
        }
        if(drawable0 == this.c && this.getCallback() != null) {
            this.getCallback().invalidateDrawable(this);
        }
    }

    @Override  // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        return this.a.B;
    }

    @Override  // android.graphics.drawable.Drawable
    public boolean isStateful() {
        e e0 = this.a;
        if(e0.t) {
            return e0.u;
        }
        e0.c();
        int v = e0.h;
        Drawable[] arr_drawable = e0.g;
        boolean z = false;
        for(int v1 = 0; v1 < v; ++v1) {
            if(arr_drawable[v1].isStateful()) {
                z = true;
                break;
            }
        }
        e0.u = z;
        e0.t = true;
        return z;
    }

    @Override  // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        int v1;
        Drawable drawable0 = this.d;
        int v = 1;
        if(drawable0 == null) {
            v1 = 0;
        }
        else {
            drawable0.jumpToCurrentState();
            this.d = null;
            v1 = 1;
        }
        Drawable drawable1 = this.c;
        if(drawable1 != null) {
            drawable1.jumpToCurrentState();
            if(this.f) {
                this.c.setAlpha(this.e);
            }
        }
        if(this.k != 0L) {
            this.k = 0L;
            v1 = 1;
        }
        if(this.j == 0L) {
            v = v1;
        }
        else {
            this.j = 0L;
        }
        if(v != 0) {
            this.invalidateSelf();
        }
    }

    @Override  // android.graphics.drawable.Drawable
    public Drawable mutate() {
        if(!this.h && super.mutate() == this) {
            e e0 = this.b();
            e0.f();
            this.e(e0);
            this.h = true;
        }
        return this;
    }

    @Override  // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect0) {
        Drawable drawable0 = this.d;
        if(drawable0 != null) {
            drawable0.setBounds(rect0);
        }
        Drawable drawable1 = this.c;
        if(drawable1 != null) {
            drawable1.setBounds(rect0);
        }
    }

    @Override  // android.graphics.drawable.Drawable
    public boolean onLayoutDirectionChanged(int v) {
        e e0 = this.a;
        int v1 = this.g;
        int v2 = e0.h;
        Drawable[] arr_drawable = e0.g;
        boolean z = false;
        for(int v3 = 0; v3 < v2; ++v3) {
            Drawable drawable0 = arr_drawable[v3];
            if(drawable0 != null) {
                boolean z1 = DrawableCompat.setLayoutDirection(drawable0, v);
                if(v3 == v1) {
                    z = z1;
                }
            }
        }
        e0.y = v;
        return z;
    }

    @Override  // android.graphics.drawable.Drawable
    public boolean onLevelChange(int v) {
        Drawable drawable0 = this.d;
        if(drawable0 != null) {
            return drawable0.setLevel(v);
        }
        return this.c == null ? false : this.c.setLevel(v);
    }

    @Override  // android.graphics.drawable.Drawable
    public boolean onStateChange(@NonNull int[] arr_v) {
        Drawable drawable0 = this.d;
        if(drawable0 != null) {
            return drawable0.setState(arr_v);
        }
        return this.c == null ? false : this.c.setState(arr_v);
    }

    @Override  // android.graphics.drawable.Drawable$Callback
    public void scheduleDrawable(@NonNull Drawable drawable0, @NonNull Runnable runnable0, long v) {
        if(drawable0 == this.c && this.getCallback() != null) {
            this.getCallback().scheduleDrawable(this, runnable0, v);
        }
    }

    @Override  // android.graphics.drawable.Drawable
    public void setAlpha(int v) {
        if(!this.f || this.e != v) {
            this.f = true;
            this.e = v;
            Drawable drawable0 = this.c;
            if(drawable0 != null) {
                if(this.j == 0L) {
                    drawable0.setAlpha(v);
                    return;
                }
                this.a(false);
            }
        }
    }

    @Override  // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z) {
        e e0 = this.a;
        if(e0.B != z) {
            e0.B = z;
            Drawable drawable0 = this.c;
            if(drawable0 != null) {
                DrawableCompat.setAutoMirrored(drawable0, z);
            }
        }
    }

    @Override  // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter0) {
        e e0 = this.a;
        e0.D = true;
        if(e0.C != colorFilter0) {
            e0.C = colorFilter0;
            Drawable drawable0 = this.c;
            if(drawable0 != null) {
                drawable0.setColorFilter(colorFilter0);
            }
        }
    }

    @Override  // android.graphics.drawable.Drawable
    public void setDither(boolean z) {
        e e0 = this.a;
        if(e0.x != z) {
            e0.x = z;
            Drawable drawable0 = this.c;
            if(drawable0 != null) {
                drawable0.setDither(z);
            }
        }
    }

    public void setEnterFadeDuration(int v) {
        this.a.z = v;
    }

    public void setExitFadeDuration(int v) {
        this.a.A = v;
    }

    @Override  // android.graphics.drawable.Drawable
    public void setHotspot(float f, float f1) {
        Drawable drawable0 = this.c;
        if(drawable0 != null) {
            DrawableCompat.setHotspot(drawable0, f, f1);
        }
    }

    @Override  // android.graphics.drawable.Drawable
    public void setHotspotBounds(int v, int v1, int v2, int v3) {
        Rect rect0 = this.b;
        if(rect0 == null) {
            this.b = new Rect(v, v1, v2, v3);
        }
        else {
            rect0.set(v, v1, v2, v3);
        }
        Drawable drawable0 = this.c;
        if(drawable0 != null) {
            DrawableCompat.setHotspotBounds(drawable0, v, v1, v2, v3);
        }
    }

    @Override  // android.graphics.drawable.Drawable
    public void setTint(@ColorInt int v) {
        this.setTintList(ColorStateList.valueOf(v));
    }

    @Override  // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList0) {
        e e0 = this.a;
        e0.G = true;
        if(e0.E != colorStateList0) {
            e0.E = colorStateList0;
            DrawableCompat.setTintList(this.c, colorStateList0);
        }
    }

    @Override  // android.graphics.drawable.Drawable
    public void setTintMode(@NonNull PorterDuff.Mode porterDuff$Mode0) {
        e e0 = this.a;
        e0.H = true;
        if(e0.F != porterDuff$Mode0) {
            e0.F = porterDuff$Mode0;
            DrawableCompat.setTintMode(this.c, porterDuff$Mode0);
        }
    }

    @Override  // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z1) {
        boolean z2 = super.setVisible(z, z1);
        Drawable drawable0 = this.d;
        if(drawable0 != null) {
            drawable0.setVisible(z, z1);
        }
        Drawable drawable1 = this.c;
        if(drawable1 != null) {
            drawable1.setVisible(z, z1);
        }
        return z2;
    }

    @Override  // android.graphics.drawable.Drawable$Callback
    public void unscheduleDrawable(@NonNull Drawable drawable0, @NonNull Runnable runnable0) {
        if(drawable0 == this.c && this.getCallback() != null) {
            this.getCallback().unscheduleDrawable(this, runnable0);
        }
    }
}

