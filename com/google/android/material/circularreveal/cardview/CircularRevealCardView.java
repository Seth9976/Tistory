package com.google.android.material.circularreveal.cardview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.annotation.ColorInt;
import androidx.annotation.Nullable;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.circularreveal.CircularRevealHelper;
import com.google.android.material.circularreveal.CircularRevealWidget.RevealInfo;
import com.google.android.material.circularreveal.CircularRevealWidget;

public class CircularRevealCardView extends MaterialCardView implements CircularRevealWidget {
    public final CircularRevealHelper s;

    public CircularRevealCardView(Context context0) {
        this(context0, null);
    }

    public CircularRevealCardView(Context context0, AttributeSet attributeSet0) {
        super(context0, attributeSet0);
        this.s = new CircularRevealHelper(this);
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
        this.s.buildCircularRevealCache();
    }

    @Override  // com.google.android.material.circularreveal.CircularRevealWidget
    public void destroyCircularRevealCache() {
        this.s.destroyCircularRevealCache();
    }

    @Override  // com.google.android.material.circularreveal.CircularRevealWidget, android.view.View
    public void draw(Canvas canvas0) {
        CircularRevealHelper circularRevealHelper0 = this.s;
        if(circularRevealHelper0 != null) {
            circularRevealHelper0.draw(canvas0);
            return;
        }
        super.draw(canvas0);
    }

    @Override  // com.google.android.material.circularreveal.CircularRevealWidget
    @Nullable
    public Drawable getCircularRevealOverlayDrawable() {
        return this.s.getCircularRevealOverlayDrawable();
    }

    @Override  // com.google.android.material.circularreveal.CircularRevealWidget
    public int getCircularRevealScrimColor() {
        return this.s.getCircularRevealScrimColor();
    }

    @Override  // com.google.android.material.circularreveal.CircularRevealWidget
    @Nullable
    public RevealInfo getRevealInfo() {
        return this.s.getRevealInfo();
    }

    @Override  // com.google.android.material.circularreveal.CircularRevealWidget, android.view.View
    public boolean isOpaque() {
        return this.s == null ? super.isOpaque() : this.s.isOpaque();
    }

    @Override  // com.google.android.material.circularreveal.CircularRevealWidget
    public void setCircularRevealOverlayDrawable(@Nullable Drawable drawable0) {
        this.s.setCircularRevealOverlayDrawable(drawable0);
    }

    @Override  // com.google.android.material.circularreveal.CircularRevealWidget
    public void setCircularRevealScrimColor(@ColorInt int v) {
        this.s.setCircularRevealScrimColor(v);
    }

    @Override  // com.google.android.material.circularreveal.CircularRevealWidget
    public void setRevealInfo(@Nullable RevealInfo circularRevealWidget$RevealInfo0) {
        this.s.setRevealInfo(circularRevealWidget$RevealInfo0);
    }
}

