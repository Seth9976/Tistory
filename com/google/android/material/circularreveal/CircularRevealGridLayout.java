package com.google.android.material.circularreveal;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.GridLayout;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class CircularRevealGridLayout extends GridLayout implements CircularRevealWidget {
    public final CircularRevealHelper a;

    public CircularRevealGridLayout(Context context0) {
        this(context0, null);
    }

    public CircularRevealGridLayout(Context context0, AttributeSet attributeSet0) {
        super(context0, attributeSet0);
        this.a = new CircularRevealHelper(this);
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
        this.a.buildCircularRevealCache();
    }

    @Override  // com.google.android.material.circularreveal.CircularRevealWidget
    public void destroyCircularRevealCache() {
        this.a.destroyCircularRevealCache();
    }

    @Override  // com.google.android.material.circularreveal.CircularRevealWidget, android.view.View
    public void draw(@NonNull Canvas canvas0) {
        CircularRevealHelper circularRevealHelper0 = this.a;
        if(circularRevealHelper0 != null) {
            circularRevealHelper0.draw(canvas0);
            return;
        }
        super.draw(canvas0);
    }

    @Override  // com.google.android.material.circularreveal.CircularRevealWidget
    @Nullable
    public Drawable getCircularRevealOverlayDrawable() {
        return this.a.getCircularRevealOverlayDrawable();
    }

    @Override  // com.google.android.material.circularreveal.CircularRevealWidget
    public int getCircularRevealScrimColor() {
        return this.a.getCircularRevealScrimColor();
    }

    @Override  // com.google.android.material.circularreveal.CircularRevealWidget
    @Nullable
    public RevealInfo getRevealInfo() {
        return this.a.getRevealInfo();
    }

    @Override  // com.google.android.material.circularreveal.CircularRevealWidget, android.view.View
    public boolean isOpaque() {
        return this.a == null ? super.isOpaque() : this.a.isOpaque();
    }

    @Override  // com.google.android.material.circularreveal.CircularRevealWidget
    public void setCircularRevealOverlayDrawable(@Nullable Drawable drawable0) {
        this.a.setCircularRevealOverlayDrawable(drawable0);
    }

    @Override  // com.google.android.material.circularreveal.CircularRevealWidget
    public void setCircularRevealScrimColor(@ColorInt int v) {
        this.a.setCircularRevealScrimColor(v);
    }

    @Override  // com.google.android.material.circularreveal.CircularRevealWidget
    public void setRevealInfo(@Nullable RevealInfo circularRevealWidget$RevealInfo0) {
        this.a.setRevealInfo(circularRevealWidget$RevealInfo0);
    }
}

