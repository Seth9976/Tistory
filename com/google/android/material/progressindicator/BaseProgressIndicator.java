package com.google.android.material.progressindicator;

import a8.a;
import a8.b;
import a8.c;
import a8.k;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import android.widget.ProgressBar;
import androidx.annotation.AttrRes;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;
import androidx.annotation.VisibleForTesting;
import androidx.core.view.ViewCompat;
import com.google.android.material.R.attr;
import com.google.android.material.R.style;
import com.google.android.material.R.styleable;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Arrays;

public abstract class BaseProgressIndicator extends ProgressBar {
    @RestrictTo({Scope.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    public @interface HideAnimationBehavior {
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    public @interface ShowAnimationBehavior {
    }

    public static final int HIDE_INWARD = 2;
    public static final int HIDE_NONE = 0;
    public static final int HIDE_OUTWARD = 1;
    public static final int SHOW_INWARD = 2;
    public static final int SHOW_NONE = 0;
    public static final int SHOW_OUTWARD = 1;
    public final BaseProgressIndicatorSpec a;
    public int b;
    public boolean c;
    public final boolean d;
    public final int e;
    public final int f;
    public long g;
    public AnimatorDurationScaleProvider h;
    public boolean i;
    public int j;
    public final a k;
    public final a l;
    public final b m;
    public final c n;
    public static final int o;

    static {
        BaseProgressIndicator.o = style.Widget_MaterialComponents_ProgressIndicator;
    }

    public BaseProgressIndicator(@NonNull Context context0, @Nullable AttributeSet attributeSet0, @AttrRes int v, @StyleRes int v1) {
        super(MaterialThemeOverlay.wrap(context0, attributeSet0, v, BaseProgressIndicator.o), attributeSet0, v);
        this.g = -1L;
        this.i = false;
        this.j = 4;
        this.k = new a(this, 0);
        this.l = new a(this, 1);
        this.m = new b(this);
        this.n = new c(this);
        Context context1 = this.getContext();
        this.a = this.a(context1, attributeSet0);
        TypedArray typedArray0 = ThemeEnforcement.obtainStyledAttributes(context1, attributeSet0, styleable.BaseProgressIndicator, v, v1, new int[0]);
        this.e = typedArray0.getInt(styleable.BaseProgressIndicator_showDelay, -1);
        this.f = Math.min(typedArray0.getInt(styleable.BaseProgressIndicator_minHideDelay, -1), 1000);
        typedArray0.recycle();
        this.h = new AnimatorDurationScaleProvider();
        this.d = true;
    }

    public abstract BaseProgressIndicatorSpec a(Context arg1, AttributeSet arg2);

    public void applyNewVisibility(boolean z) {
        if(!this.d) {
            return;
        }
        ((com.google.android.material.progressindicator.a)this.getCurrentDrawable()).setVisible(this.b(), false, z);
    }

    public final boolean b() {
        if(ViewCompat.isAttachedToWindow(this) && this.getWindowVisibility() == 0) {
            for(View view0 = this; view0.getVisibility() == 0; view0 = (View)viewParent0) {
                ViewParent viewParent0 = view0.getParent();
                if(viewParent0 == null) {
                    return this.getWindowVisibility() == 0;
                }
                if(!(viewParent0 instanceof View)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override  // android.widget.ProgressBar
    @Nullable
    public Drawable getCurrentDrawable() {
        return this.isIndeterminate() ? this.getIndeterminateDrawable() : this.getProgressDrawable();
    }

    @Nullable
    private k getCurrentDrawingDelegate() {
        if(this.isIndeterminate()) {
            return this.getIndeterminateDrawable() == null ? null : this.getIndeterminateDrawable().l;
        }
        return this.getProgressDrawable() == null ? null : this.getProgressDrawable().l;
    }

    public int getHideAnimationBehavior() {
        return this.a.hideAnimationBehavior;
    }

    @Override  // android.widget.ProgressBar
    @Nullable
    public Drawable getIndeterminateDrawable() {
        return this.getIndeterminateDrawable();
    }

    @Nullable
    public IndeterminateDrawable getIndeterminateDrawable() {
        return (IndeterminateDrawable)super.getIndeterminateDrawable();
    }

    @NonNull
    public int[] getIndicatorColor() {
        return this.a.indicatorColors;
    }

    @Override  // android.widget.ProgressBar
    @Nullable
    public Drawable getProgressDrawable() {
        return this.getProgressDrawable();
    }

    @Nullable
    public DeterminateDrawable getProgressDrawable() {
        return (DeterminateDrawable)super.getProgressDrawable();
    }

    public int getShowAnimationBehavior() {
        return this.a.showAnimationBehavior;
    }

    @ColorInt
    public int getTrackColor() {
        return this.a.trackColor;
    }

    @Px
    public int getTrackCornerRadius() {
        return this.a.trackCornerRadius;
    }

    @Px
    public int getTrackThickness() {
        return this.a.trackThickness;
    }

    public void hide() {
        if(this.getVisibility() != 0) {
            this.removeCallbacks(this.k);
            return;
        }
        a a0 = this.l;
        this.removeCallbacks(a0);
        long v = SystemClock.uptimeMillis() - this.g;
        long v1 = (long)this.f;
        if(v >= v1) {
            a0.run();
            return;
        }
        this.postDelayed(a0, v1 - v);
    }

    @Override  // android.view.View
    public void invalidate() {
        super.invalidate();
        if(this.getCurrentDrawable() != null) {
            this.getCurrentDrawable().invalidateSelf();
        }
    }

    @Override  // android.widget.ProgressBar
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if(this.getProgressDrawable() != null && this.getIndeterminateDrawable() != null) {
            this.getIndeterminateDrawable().m.c(this.m);
        }
        DeterminateDrawable determinateDrawable0 = this.getProgressDrawable();
        c c0 = this.n;
        if(determinateDrawable0 != null) {
            this.getProgressDrawable().registerAnimationCallback(c0);
        }
        if(this.getIndeterminateDrawable() != null) {
            this.getIndeterminateDrawable().registerAnimationCallback(c0);
        }
        if(this.b()) {
            if(this.f > 0) {
                this.g = SystemClock.uptimeMillis();
            }
            this.setVisibility(0);
        }
    }

    @Override  // android.widget.ProgressBar
    public void onDetachedFromWindow() {
        this.removeCallbacks(this.l);
        this.removeCallbacks(this.k);
        ((com.google.android.material.progressindicator.a)this.getCurrentDrawable()).hideNow();
        IndeterminateDrawable indeterminateDrawable0 = this.getIndeterminateDrawable();
        c c0 = this.n;
        if(indeterminateDrawable0 != null) {
            this.getIndeterminateDrawable().unregisterAnimationCallback(c0);
            this.getIndeterminateDrawable().m.f();
        }
        if(this.getProgressDrawable() != null) {
            this.getProgressDrawable().unregisterAnimationCallback(c0);
        }
        super.onDetachedFromWindow();
    }

    @Override  // android.widget.ProgressBar
    public void onDraw(@NonNull Canvas canvas0) {
        synchronized(this) {
            int v1 = canvas0.save();
            if(this.getPaddingLeft() != 0 || this.getPaddingTop() != 0) {
                canvas0.translate(((float)this.getPaddingLeft()), ((float)this.getPaddingTop()));
            }
            if(this.getPaddingRight() != 0 || this.getPaddingBottom() != 0) {
                canvas0.clipRect(0, 0, this.getWidth() - (this.getPaddingLeft() + this.getPaddingRight()), this.getHeight() - (this.getPaddingTop() + this.getPaddingBottom()));
            }
            this.getCurrentDrawable().draw(canvas0);
            canvas0.restoreToCount(v1);
        }
    }

    @Override  // android.widget.ProgressBar
    public void onMeasure(int v, int v1) {
        synchronized(this) {
            k k0 = this.getCurrentDrawingDelegate();
            if(k0 == null) {
                return;
            }
            this.setMeasuredDimension((k0.e() >= 0 ? k0.e() + this.getPaddingLeft() + this.getPaddingRight() : View.getDefaultSize(this.getSuggestedMinimumWidth(), v)), (k0.d() >= 0 ? k0.d() + this.getPaddingTop() + this.getPaddingBottom() : View.getDefaultSize(this.getSuggestedMinimumHeight(), v1)));
        }
    }

    @Override  // android.view.View
    public void onVisibilityChanged(@NonNull View view0, int v) {
        super.onVisibilityChanged(view0, v);
        this.applyNewVisibility(v == 0);
    }

    @Override  // android.view.View
    public void onWindowVisibilityChanged(int v) {
        super.onWindowVisibilityChanged(v);
        this.applyNewVisibility(false);
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    @VisibleForTesting
    public void setAnimatorDurationScaleProvider(@NonNull AnimatorDurationScaleProvider animatorDurationScaleProvider0) {
        this.h = animatorDurationScaleProvider0;
        if(this.getProgressDrawable() != null) {
            this.getProgressDrawable().c = animatorDurationScaleProvider0;
        }
        if(this.getIndeterminateDrawable() != null) {
            this.getIndeterminateDrawable().c = animatorDurationScaleProvider0;
        }
    }

    public void setHideAnimationBehavior(int v) {
        this.a.hideAnimationBehavior = v;
        this.invalidate();
    }

    @Override  // android.widget.ProgressBar
    public void setIndeterminate(boolean z) {
        synchronized(this) {
            if(z == this.isIndeterminate()) {
                return;
            }
            com.google.android.material.progressindicator.a a0 = (com.google.android.material.progressindicator.a)this.getCurrentDrawable();
            if(a0 != null) {
                a0.hideNow();
            }
            super.setIndeterminate(z);
            com.google.android.material.progressindicator.a a1 = (com.google.android.material.progressindicator.a)this.getCurrentDrawable();
            if(a1 != null) {
                a1.setVisible(this.b(), false, false);
            }
            if(a1 instanceof IndeterminateDrawable && this.b()) {
                ((IndeterminateDrawable)a1).m.e();
            }
            this.i = false;
        }
    }

    @Override  // android.widget.ProgressBar
    public void setIndeterminateDrawable(@Nullable Drawable drawable0) {
        if(drawable0 == null) {
            super.setIndeterminateDrawable(null);
            return;
        }
        if(!(drawable0 instanceof IndeterminateDrawable)) {
            throw new IllegalArgumentException("Cannot set framework drawable as indeterminate drawable.");
        }
        ((com.google.android.material.progressindicator.a)drawable0).hideNow();
        super.setIndeterminateDrawable(drawable0);
    }

    public void setIndicatorColor(@ColorInt int[] arr_v) {
        if(arr_v.length == 0) {
            arr_v = new int[]{MaterialColors.getColor(this.getContext(), attr.colorPrimary, -1)};
        }
        if(!Arrays.equals(this.getIndicatorColor(), arr_v)) {
            this.a.indicatorColors = arr_v;
            this.getIndeterminateDrawable().m.b();
            this.invalidate();
        }
    }

    @Override  // android.widget.ProgressBar
    public void setProgress(int v) {
        synchronized(this) {
            if(this.isIndeterminate()) {
                return;
            }
            this.setProgressCompat(v, false);
        }
    }

    public void setProgressCompat(int v, boolean z) {
        if(!this.isIndeterminate()) {
            super.setProgress(v);
            if(this.getProgressDrawable() != null && !z) {
                this.getProgressDrawable().jumpToCurrentState();
            }
        }
        else if(this.getProgressDrawable() != null) {
            this.b = v;
            this.c = z;
            this.i = true;
            if(this.getIndeterminateDrawable().isVisible() && this.h.getSystemAnimatorDurationScale(this.getContext().getContentResolver()) != 0.0f) {
                this.getIndeterminateDrawable().m.d();
                return;
            }
            IndeterminateDrawable indeterminateDrawable0 = this.getIndeterminateDrawable();
            this.m.onAnimationEnd(indeterminateDrawable0);
        }
    }

    @Override  // android.widget.ProgressBar
    public void setProgressDrawable(@Nullable Drawable drawable0) {
        if(drawable0 == null) {
            super.setProgressDrawable(null);
            return;
        }
        if(!(drawable0 instanceof DeterminateDrawable)) {
            throw new IllegalArgumentException("Cannot set framework drawable as progress drawable.");
        }
        ((DeterminateDrawable)drawable0).hideNow();
        super.setProgressDrawable(((DeterminateDrawable)drawable0));
        ((DeterminateDrawable)drawable0).setLevel(((int)(((float)this.getProgress()) / ((float)this.getMax()) * 10000.0f)));
    }

    public void setShowAnimationBehavior(int v) {
        this.a.showAnimationBehavior = v;
        this.invalidate();
    }

    public void setTrackColor(@ColorInt int v) {
        BaseProgressIndicatorSpec baseProgressIndicatorSpec0 = this.a;
        if(baseProgressIndicatorSpec0.trackColor != v) {
            baseProgressIndicatorSpec0.trackColor = v;
            this.invalidate();
        }
    }

    public void setTrackCornerRadius(@Px int v) {
        BaseProgressIndicatorSpec baseProgressIndicatorSpec0 = this.a;
        if(baseProgressIndicatorSpec0.trackCornerRadius != v) {
            baseProgressIndicatorSpec0.trackCornerRadius = Math.min(v, baseProgressIndicatorSpec0.trackThickness / 2);
        }
    }

    public void setTrackThickness(@Px int v) {
        BaseProgressIndicatorSpec baseProgressIndicatorSpec0 = this.a;
        if(baseProgressIndicatorSpec0.trackThickness != v) {
            baseProgressIndicatorSpec0.trackThickness = v;
            this.requestLayout();
        }
    }

    public void setVisibilityAfterHide(int v) {
        if(v != 0 && v != 4 && v != 8) {
            throw new IllegalArgumentException("The component\'s visibility must be one of VISIBLE, INVISIBLE, and GONE defined in View.");
        }
        this.j = v;
    }

    public void show() {
        a a0 = this.k;
        int v = this.e;
        if(v > 0) {
            this.removeCallbacks(a0);
            this.postDelayed(a0, ((long)v));
            return;
        }
        a0.run();
    }
}

