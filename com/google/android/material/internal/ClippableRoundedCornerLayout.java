package com.google.android.material.internal;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path.Direction;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;

@RestrictTo({Scope.LIBRARY_GROUP})
public class ClippableRoundedCornerLayout extends FrameLayout {
    public Path a;
    public float b;

    public ClippableRoundedCornerLayout(@NonNull Context context0) {
        super(context0);
    }

    public ClippableRoundedCornerLayout(@NonNull Context context0, @Nullable AttributeSet attributeSet0) {
        super(context0, attributeSet0);
    }

    public ClippableRoundedCornerLayout(@NonNull Context context0, @Nullable AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0, v);
    }

    @Override  // android.view.ViewGroup
    public void dispatchDraw(Canvas canvas0) {
        if(this.a == null) {
            super.dispatchDraw(canvas0);
            return;
        }
        int v = canvas0.save();
        canvas0.clipPath(this.a);
        super.dispatchDraw(canvas0);
        canvas0.restoreToCount(v);
    }

    public float getCornerRadius() {
        return this.b;
    }

    public void resetClipBoundsAndCornerRadius() {
        this.a = null;
        this.b = 0.0f;
        this.invalidate();
    }

    public void updateClipBoundsAndCornerRadius(float f, float f1, float f2, float f3, float f4) {
        this.updateClipBoundsAndCornerRadius(new RectF(f, f1, f2, f3), f4);
    }

    public void updateClipBoundsAndCornerRadius(@NonNull Rect rect0, float f) {
        this.updateClipBoundsAndCornerRadius(((float)rect0.left), ((float)rect0.top), ((float)rect0.right), ((float)rect0.bottom), f);
    }

    public void updateClipBoundsAndCornerRadius(@NonNull RectF rectF0, float f) {
        if(this.a == null) {
            this.a = new Path();
        }
        this.b = f;
        this.a.reset();
        this.a.addRoundRect(rectF0, f, f, Path.Direction.CW);
        this.a.close();
        this.invalidate();
    }

    public void updateCornerRadius(float f) {
        this.updateClipBoundsAndCornerRadius(((float)this.getLeft()), ((float)this.getTop()), ((float)this.getRight()), ((float)this.getBottom()), f);
    }
}

