package com.google.android.material.shape;

import android.graphics.RectF;
import android.view.View;
import androidx.annotation.DoNotInline;

public final class k extends ShapeableDelegate {
    public boolean f;
    public float g;

    public k(View view0) {
        this.f = false;
        this.g = 0.0f;
        this.d(view0);
    }

    @Override  // com.google.android.material.shape.ShapeableDelegate
    public final void a(View view0) {
        boolean z2;
        boolean z1;
        float f;
        ShapeAppearanceModel shapeAppearanceModel0 = this.c;
        if(shapeAppearanceModel0 == null) {
            f = 0.0f;
        }
        else {
            RectF rectF0 = this.d;
            f = rectF0 == null ? 0.0f : shapeAppearanceModel0.f.getCornerSize(rectF0);
        }
        this.g = f;
        boolean z = false;
        if(this.d.isEmpty()) {
            z1 = false;
        }
        else {
            ShapeAppearanceModel shapeAppearanceModel1 = this.c;
            z1 = shapeAppearanceModel1 == null ? false : shapeAppearanceModel1.isRoundRect(this.d);
        }
        if(z1) {
            z = true;
        }
        else {
            if(this.d.isEmpty() || (this.c == null || !this.b || this.c.isRoundRect(this.d)) || (!(this.c.getTopLeftCorner() instanceof RoundedCornerTreatment) || !(this.c.getTopRightCorner() instanceof RoundedCornerTreatment) || !(this.c.getBottomLeftCorner() instanceof RoundedCornerTreatment) || !(this.c.getBottomRightCorner() instanceof RoundedCornerTreatment))) {
                z2 = false;
            }
            else {
                float f1 = this.c.getTopLeftCornerSize().getCornerSize(this.d);
                float f2 = this.c.getTopRightCornerSize().getCornerSize(this.d);
                float f3 = this.c.getBottomLeftCornerSize().getCornerSize(this.d);
                float f4 = this.c.getBottomRightCornerSize().getCornerSize(this.d);
                int v = Float.compare(f1, 0.0f);
                if(v == 0 && f3 == 0.0f && f2 == f4) {
                    this.d.set(this.d.left - f2, this.d.top, this.d.right, this.d.bottom);
                    this.g = f2;
                    z2 = true;
                }
                else if(v == 0 && f2 == 0.0f && f3 == f4) {
                    this.d.set(this.d.left, this.d.top - f3, this.d.right, this.d.bottom);
                    this.g = f3;
                    z2 = true;
                }
                else if(f2 == 0.0f && f4 == 0.0f && f1 == f3) {
                    this.d.set(this.d.left, this.d.top, this.d.right + f1, this.d.bottom);
                    this.g = f1;
                    z2 = true;
                }
                else if(f3 != 0.0f || f4 != 0.0f || f1 != f2) {
                    z2 = false;
                }
                else {
                    this.d.set(this.d.left, this.d.top, this.d.right, this.d.bottom + f1);
                    this.g = f1;
                    z2 = true;
                }
            }
            if(z2) {
                z = true;
            }
        }
        this.f = z;
        view0.setClipToOutline(!this.b());
        if(this.b()) {
            view0.invalidate();
            return;
        }
        view0.invalidateOutline();
    }

    // 去混淆评级： 低(20)
    @Override  // com.google.android.material.shape.ShapeableDelegate
    public final boolean b() {
        return !this.f || this.a;
    }

    @DoNotInline
    private void d(View view0) {
        view0.setOutlineProvider(new j(this, 0));
    }
}

