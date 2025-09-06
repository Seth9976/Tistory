package androidx.core.splashscreen;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Path.Direction;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001A\u00020\u0001\u0012\u0006\u0010\u0004\u001A\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001A\u00020\t2\u0006\u0010\b\u001A\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000BJ\u0017\u0010\u000E\u001A\u00020\t2\u0006\u0010\r\u001A\u00020\fH\u0016¢\u0006\u0004\b\u000E\u0010\u000FJ\u0019\u0010\u0012\u001A\u00020\t2\b\u0010\u0011\u001A\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000F\u0010\u0014\u001A\u00020\fH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001A\u00020\t2\u0006\u0010\u0017\u001A\u00020\u0016H\u0014¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001A"}, d2 = {"Landroidx/core/splashscreen/MaskedDrawable;", "Landroid/graphics/drawable/Drawable;", "drawable", "", "maskDiameter", "<init>", "(Landroid/graphics/drawable/Drawable;F)V", "Landroid/graphics/Canvas;", "canvas", "", "draw", "(Landroid/graphics/Canvas;)V", "", "alpha", "setAlpha", "(I)V", "Landroid/graphics/ColorFilter;", "colorFilter", "setColorFilter", "(Landroid/graphics/ColorFilter;)V", "getOpacity", "()I", "Landroid/graphics/Rect;", "bounds", "onBoundsChange", "(Landroid/graphics/Rect;)V", "core-splashscreen_release"}, k = 1, mv = {1, 6, 0}, xi = 0x30)
public final class MaskedDrawable extends Drawable {
    public final Drawable a;
    public final Path b;

    public MaskedDrawable(@NotNull Drawable drawable0, float f) {
        Intrinsics.checkNotNullParameter(drawable0, "drawable");
        super();
        this.a = drawable0;
        Path path0 = new Path();
        path0.addCircle(0.0f, 0.0f, f / 2.0f, Path.Direction.CW);
        this.b = path0;
    }

    @Override  // android.graphics.drawable.Drawable
    public void draw(@NotNull Canvas canvas0) {
        Intrinsics.checkNotNullParameter(canvas0, "canvas");
        canvas0.clipPath(this.b);
        this.a.draw(canvas0);
    }

    @Override  // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.a.getOpacity();
    }

    @Override  // android.graphics.drawable.Drawable
    public void onBoundsChange(@NotNull Rect rect0) {
        Intrinsics.checkNotNullParameter(rect0, "bounds");
        super.onBoundsChange(rect0);
        this.a.setBounds(rect0);
        float f = rect0.exactCenterX();
        float f1 = rect0.exactCenterY();
        this.b.offset(f, f1);
    }

    @Override  // android.graphics.drawable.Drawable
    public void setAlpha(int v) {
        this.a.setAlpha(v);
    }

    @Override  // android.graphics.drawable.Drawable
    public void setColorFilter(@Nullable ColorFilter colorFilter0) {
        this.a.setColorFilter(colorFilter0);
    }
}

