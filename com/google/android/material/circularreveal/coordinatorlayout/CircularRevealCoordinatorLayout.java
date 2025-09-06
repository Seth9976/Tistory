package com.google.android.material.circularreveal.coordinatorlayout;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.circularreveal.CircularRevealHelper;
import com.google.android.material.circularreveal.CircularRevealWidget.RevealInfo;
import com.google.android.material.circularreveal.CircularRevealWidget;

public class CircularRevealCoordinatorLayout extends CoordinatorLayout implements CircularRevealWidget {
    public final CircularRevealHelper z;

    public CircularRevealCoordinatorLayout(@NonNull Context context0) {
        this(context0, null);
    }

    public CircularRevealCoordinatorLayout(@NonNull Context context0, AttributeSet attributeSet0) {
        super(context0, attributeSet0);
        this.z = new CircularRevealHelper(this);
    }

    @Override  // com.google.android.material.circularreveal.CircularRevealHelper$Delegate
    public void actualDraw(Canvas canvas0) {
        super.draw(canvas0);
    }

    @Override  // com.google.android.material.circularreveal.CircularRevealHelper$Delegate
    public boolean actualIsOpaque() {
        return super.isOpaque();
    }

    @Override  // com.google.android.material.circularreveal.CircularRevealWidget
    public void buildCircularRevealCache() {
        this.z.buildCircularRevealCache();
    }

    @Override  // com.google.android.material.circularreveal.CircularRevealWidget
    public void destroyCircularRevealCache() {
        this.z.destroyCircularRevealCache();
    }

    @Override  // com.google.android.material.circularreveal.CircularRevealWidget, android.view.View
    public void draw(Canvas canvas0) {
        CircularRevealHelper circularRevealHelper0 = this.z;
        if(circularRevealHelper0 != null) {
            circularRevealHelper0.draw(canvas0);
            return;
        }
        super.draw(canvas0);
    }

    @Override  // com.google.android.material.circularreveal.CircularRevealWidget
    @Nullable
    public Drawable getCircularRevealOverlayDrawable() {
        return this.z.getCircularRevealOverlayDrawable();
    }

    @Override  // com.google.android.material.circularreveal.CircularRevealWidget
    public int getCircularRevealScrimColor() {
        return this.z.getCircularRevealScrimColor();
    }

    @Override  // com.google.android.material.circularreveal.CircularRevealWidget
    @Nullable
    public RevealInfo getRevealInfo() {
        return this.z.getRevealInfo();
    }

    @Override  // com.google.android.material.circularreveal.CircularRevealWidget, android.view.View
    public boolean isOpaque() {
        return this.z == null ? super.isOpaque() : this.z.isOpaque();
    }

    @Override  // com.google.android.material.circularreveal.CircularRevealWidget
    public void setCircularRevealOverlayDrawable(@Nullable Drawable drawable0) {
        this.z.setCircularRevealOverlayDrawable(drawable0);
    }

    @Override  // com.google.android.material.circularreveal.CircularRevealWidget
    public void setCircularRevealScrimColor(@ColorInt int v) {
        this.z.setCircularRevealScrimColor(v);
    }

    @Override  // com.google.android.material.circularreveal.CircularRevealWidget
    public void setRevealInfo(@Nullable RevealInfo circularRevealWidget$RevealInfo0) {
        this.z.setRevealInfo(circularRevealWidget$RevealInfo0);
    }
}

