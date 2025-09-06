package com.google.android.material.carousel;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.compose.ui.text.n0;
import androidx.core.app.h;
import androidx.core.math.MathUtils;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.shape.Shapeable;
import com.google.android.material.shape.ShapeableDelegate;

public class MaskableFrameLayout extends FrameLayout implements Maskable, Shapeable {
    public float a;
    public final RectF b;
    public OnMaskChangedListener c;
    public ShapeAppearanceModel d;
    public final ShapeableDelegate e;
    public Boolean f;
    public static final int g;

    public MaskableFrameLayout(@NonNull Context context0) {
        this(context0, null);
    }

    public MaskableFrameLayout(@NonNull Context context0, @Nullable AttributeSet attributeSet0) {
        this(context0, attributeSet0, 0);
    }

    public MaskableFrameLayout(@NonNull Context context0, @Nullable AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0, v);
        this.a = -1.0f;
        this.b = new RectF();
        this.e = ShapeableDelegate.create(this);
        this.f = null;
        this.setShapeAppearanceModel(ShapeAppearanceModel.builder(context0, attributeSet0, v, 0, 0).build());
    }

    public static void a(MaskableFrameLayout maskableFrameLayout0, Canvas canvas0) {
        maskableFrameLayout0.super.dispatchDraw(canvas0);
    }

    public final void b() {
        if(this.a != -1.0f) {
            float f = AnimationUtils.lerp(0.0f, ((float)this.getWidth()) / 2.0f, 0.0f, 1.0f, this.a);
            this.setMaskRectF(new RectF(f, 0.0f, ((float)this.getWidth()) - f, ((float)this.getHeight())));
        }
    }

    @Override  // android.view.ViewGroup
    public void dispatchDraw(Canvas canvas0) {
        h h0 = new h(this, 3);
        this.e.maybeClip(canvas0, h0);
    }

    @Override  // android.view.View
    public void getFocusedRect(Rect rect0) {
        rect0.set(((int)this.b.left), ((int)this.b.top), ((int)this.b.right), ((int)this.b.bottom));
    }

    @Override  // com.google.android.material.carousel.Maskable
    @NonNull
    public RectF getMaskRectF() {
        return this.b;
    }

    @Override  // com.google.android.material.carousel.Maskable
    @Deprecated
    public float getMaskXPercentage() {
        return this.a;
    }

    @Override  // com.google.android.material.shape.Shapeable
    @NonNull
    public ShapeAppearanceModel getShapeAppearanceModel() {
        return this.d;
    }

    @Override  // android.view.ViewGroup
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Boolean boolean0 = this.f;
        if(boolean0 != null) {
            this.e.setForceCompatClippingEnabled(this, boolean0.booleanValue());
        }
    }

    @Override  // android.view.ViewGroup
    public void onDetachedFromWindow() {
        this.f = Boolean.valueOf(this.e.isForceCompatClippingEnabled());
        this.e.setForceCompatClippingEnabled(this, true);
        super.onDetachedFromWindow();
    }

    @Override  // android.view.View
    public void onSizeChanged(int v, int v1, int v2, int v3) {
        super.onSizeChanged(v, v1, v2, v3);
        if(this.a != -1.0f) {
            this.b();
        }
    }

    // 去混淆评级： 低(20)
    @Override  // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent motionEvent0) {
        return this.b.isEmpty() || motionEvent0.getAction() != 0 || this.b.contains(motionEvent0.getX(), motionEvent0.getY()) ? super.onTouchEvent(motionEvent0) : false;
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    @VisibleForTesting
    public void setForceCompatClipping(boolean z) {
        this.e.setForceCompatClippingEnabled(this, z);
    }

    @Override  // com.google.android.material.carousel.Maskable
    public void setMaskRectF(@NonNull RectF rectF0) {
        RectF rectF1 = this.b;
        rectF1.set(rectF0);
        this.e.onMaskChanged(this, rectF1);
        OnMaskChangedListener onMaskChangedListener0 = this.c;
        if(onMaskChangedListener0 != null) {
            onMaskChangedListener0.onMaskChanged(rectF1);
        }
    }

    @Override  // com.google.android.material.carousel.Maskable
    @Deprecated
    public void setMaskXPercentage(float f) {
        float f1 = MathUtils.clamp(f, 0.0f, 1.0f);
        if(this.a != f1) {
            this.a = f1;
            this.b();
        }
    }

    @Override  // com.google.android.material.carousel.Maskable
    public void setOnMaskChangedListener(@Nullable OnMaskChangedListener onMaskChangedListener0) {
        this.c = onMaskChangedListener0;
    }

    @Override  // com.google.android.material.shape.Shapeable
    public void setShapeAppearanceModel(@NonNull ShapeAppearanceModel shapeAppearanceModel0) {
        ShapeAppearanceModel shapeAppearanceModel1 = shapeAppearanceModel0.withTransformedCornerSizes(new n0(13));
        this.d = shapeAppearanceModel1;
        this.e.onShapeAppearanceChanged(this, shapeAppearanceModel1);
    }
}

