package com.google.accompanist.drawablepainter;

import android.graphics.drawable.Drawable.Callback;
import android.graphics.drawable.Drawable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0003\u001A\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\'\u0010\u000B\u001A\u00020\u00042\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010\b\u001A\u00020\u00072\u0006\u0010\n\u001A\u00020\tH\u0016¢\u0006\u0004\b\u000B\u0010\fJ\u001F\u0010\r\u001A\u00020\u00042\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010\b\u001A\u00020\u0007H\u0016¢\u0006\u0004\b\r\u0010\u000E¨\u0006\u000F"}, d2 = {"com/google/accompanist/drawablepainter/DrawablePainter$callback$2$1", "Landroid/graphics/drawable/Drawable$Callback;", "Landroid/graphics/drawable/Drawable;", "d", "", "invalidateDrawable", "(Landroid/graphics/drawable/Drawable;)V", "Ljava/lang/Runnable;", "what", "", "time", "scheduleDrawable", "(Landroid/graphics/drawable/Drawable;Ljava/lang/Runnable;J)V", "unscheduleDrawable", "(Landroid/graphics/drawable/Drawable;Ljava/lang/Runnable;)V", "drawablepainter_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class DrawablePainter.callback.2.1 implements Drawable.Callback {
    public final DrawablePainter a;

    public DrawablePainter.callback.2.1(DrawablePainter drawablePainter0) {
        this.a = drawablePainter0;
    }

    @Override  // android.graphics.drawable.Drawable$Callback
    public void invalidateDrawable(@NotNull Drawable drawable0) {
        Intrinsics.checkNotNullParameter(drawable0, "d");
        int v = DrawablePainter.access$getDrawInvalidateTick(this.a);
        DrawablePainter.access$setDrawInvalidateTick(this.a, v + 1);
        long v1 = DrawablePainterKt.access$getIntrinsicSize(this.a.getDrawable());
        DrawablePainter.access$setDrawableIntrinsicSize-uvyYCjk(this.a, v1);
    }

    @Override  // android.graphics.drawable.Drawable$Callback
    public void scheduleDrawable(@NotNull Drawable drawable0, @NotNull Runnable runnable0, long v) {
        Intrinsics.checkNotNullParameter(drawable0, "d");
        Intrinsics.checkNotNullParameter(runnable0, "what");
        DrawablePainterKt.access$getMAIN_HANDLER().postAtTime(runnable0, v);
    }

    @Override  // android.graphics.drawable.Drawable$Callback
    public void unscheduleDrawable(@NotNull Drawable drawable0, @NotNull Runnable runnable0) {
        Intrinsics.checkNotNullParameter(drawable0, "d");
        Intrinsics.checkNotNullParameter(runnable0, "what");
        DrawablePainterKt.access$getMAIN_HANDLER().removeCallbacks(runnable0);
    }
}

