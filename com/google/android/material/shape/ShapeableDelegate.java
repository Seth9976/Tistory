package com.google.android.material.shape;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Build.VERSION;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import com.google.android.material.canvas.CanvasCompat.CanvasOperation;

@RestrictTo({Scope.LIBRARY_GROUP})
public abstract class ShapeableDelegate {
    public boolean a;
    public boolean b;
    public ShapeAppearanceModel c;
    public RectF d;
    public final Path e;

    public ShapeableDelegate() {
        this.a = false;
        this.b = false;
        this.d = new RectF();
        this.e = new Path();
    }

    public abstract void a(View arg1);

    public abstract boolean b();

    public final void c() {
        if(this.d.left <= this.d.right && this.d.top <= this.d.bottom && this.c != null) {
            ShapeAppearancePathProvider.getInstance().calculatePath(this.c, 1.0f, this.d, this.e);
        }
    }

    @NonNull
    public static ShapeableDelegate create(@NonNull View view0) {
        return Build.VERSION.SDK_INT >= 33 ? new l(view0) : new k(view0);
    }

    public boolean isForceCompatClippingEnabled() {
        return this.a;
    }

    public void maybeClip(@NonNull Canvas canvas0, @NonNull CanvasOperation canvasCompat$CanvasOperation0) {
        if(this.b()) {
            Path path0 = this.e;
            if(!path0.isEmpty()) {
                canvas0.save();
                canvas0.clipPath(path0);
                canvasCompat$CanvasOperation0.run(canvas0);
                canvas0.restore();
                return;
            }
        }
        canvasCompat$CanvasOperation0.run(canvas0);
    }

    public void onMaskChanged(@NonNull View view0, @NonNull RectF rectF0) {
        this.d = rectF0;
        this.c();
        this.a(view0);
    }

    public void onShapeAppearanceChanged(@NonNull View view0, @NonNull ShapeAppearanceModel shapeAppearanceModel0) {
        this.c = shapeAppearanceModel0;
        this.c();
        this.a(view0);
    }

    public void setForceCompatClippingEnabled(@NonNull View view0, boolean z) {
        if(z != this.a) {
            this.a = z;
            this.a(view0);
        }
    }

    public void setOffsetZeroCornerEdgeBoundsEnabled(@NonNull View view0, boolean z) {
        this.b = z;
        this.a(view0);
    }
}

