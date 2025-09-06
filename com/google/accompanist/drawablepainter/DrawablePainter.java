package com.google.accompanist.drawablepainter;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable.Callback;
import android.graphics.drawable.Drawable;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RememberObserver;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.ui.graphics.AndroidColorFilter_androidKt;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.unit.LayoutDirection;
import j2.j;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import md.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u000F\u0012\u0006\u0010\u0004\u001A\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000F\u0010\b\u001A\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000F\u0010\n\u001A\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\tJ\u000F\u0010\u000B\u001A\u00020\u0007H\u0016¢\u0006\u0004\b\u000B\u0010\tJ\u0017\u0010\u000F\u001A\u00020\u000E2\u0006\u0010\r\u001A\u00020\fH\u0014¢\u0006\u0004\b\u000F\u0010\u0010J\u0019\u0010\u0013\u001A\u00020\u000E2\b\u0010\u0012\u001A\u0004\u0018\u00010\u0011H\u0014¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001A\u00020\u000E2\u0006\u0010\u0016\u001A\u00020\u0015H\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u0013\u0010\u001A\u001A\u00020\u0007*\u00020\u0019H\u0014¢\u0006\u0004\b\u001A\u0010\u001BR\u0017\u0010\u0004\u001A\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u001C\u0010\u001D\u001A\u0004\b\u001E\u0010\u001FR\u001D\u0010#\u001A\u00020 8VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001A\u0004\b!\u0010\"\u0082\u0002\u000F\n\u0002\b\u0019\n\u0005\b¡\u001E0\u0001\n\u0002\b!¨\u0006$"}, d2 = {"Lcom/google/accompanist/drawablepainter/DrawablePainter;", "Landroidx/compose/ui/graphics/painter/Painter;", "Landroidx/compose/runtime/RememberObserver;", "Landroid/graphics/drawable/Drawable;", "drawable", "<init>", "(Landroid/graphics/drawable/Drawable;)V", "", "onRemembered", "()V", "onAbandoned", "onForgotten", "", "alpha", "", "applyAlpha", "(F)Z", "Landroidx/compose/ui/graphics/ColorFilter;", "colorFilter", "applyColorFilter", "(Landroidx/compose/ui/graphics/ColorFilter;)Z", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "applyLayoutDirection", "(Landroidx/compose/ui/unit/LayoutDirection;)Z", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "onDraw", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;)V", "f", "Landroid/graphics/drawable/Drawable;", "getDrawable", "()Landroid/graphics/drawable/Drawable;", "Landroidx/compose/ui/geometry/Size;", "getIntrinsicSize-NH-jbRc", "()J", "intrinsicSize", "drawablepainter_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nDrawablePainter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DrawablePainter.kt\ncom/google/accompanist/drawablepainter/DrawablePainter\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n+ 4 Canvas.kt\nandroidx/compose/ui/graphics/CanvasKt\n*L\n1#1,175:1\n81#2:176\n107#2,2:177\n81#2:179\n107#2,2:180\n245#3:182\n47#4,7:183\n*S KotlinDebug\n*F\n+ 1 DrawablePainter.kt\ncom/google/accompanist/drawablepainter/DrawablePainter\n*L\n58#1:176\n58#1:177,2\n59#1:179\n59#1:180,2\n126#1:182\n133#1:183,7\n*E\n"})
public final class DrawablePainter extends Painter implements RememberObserver {
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 0x30)
    public final class WhenMappings {
        public static final int[] $EnumSwitchMapping$0;

        static {
            int[] arr_v = new int[LayoutDirection.values().length];
            try {
                arr_v[LayoutDirection.Ltr.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[LayoutDirection.Rtl.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            WhenMappings.$EnumSwitchMapping$0 = arr_v;
        }
    }

    public static final int $stable = 8;
    public final Drawable f;
    public final MutableState g;
    public final MutableState h;
    public final Lazy i;

    public DrawablePainter(@NotNull Drawable drawable0) {
        Intrinsics.checkNotNullParameter(drawable0, "drawable");
        super();
        this.f = drawable0;
        this.g = SnapshotStateKt.mutableStateOf$default(0, null, 2, null);
        this.h = SnapshotStateKt.mutableStateOf$default(Size.box-impl(DrawablePainterKt.access$getIntrinsicSize(drawable0)), null, 2, null);
        this.i = c.lazy(new j(this, 18));
        if(drawable0.getIntrinsicWidth() >= 0 && drawable0.getIntrinsicHeight() >= 0) {
            drawable0.setBounds(0, 0, drawable0.getIntrinsicWidth(), drawable0.getIntrinsicHeight());
        }
    }

    public static final int access$getDrawInvalidateTick(DrawablePainter drawablePainter0) {
        return ((Number)drawablePainter0.g.getValue()).intValue();
    }

    public static final void access$setDrawInvalidateTick(DrawablePainter drawablePainter0, int v) {
        drawablePainter0.g.setValue(v);
    }

    public static final void access$setDrawableIntrinsicSize-uvyYCjk(DrawablePainter drawablePainter0, long v) {
        Size size0 = Size.box-impl(v);
        drawablePainter0.h.setValue(size0);
    }

    @Override  // androidx.compose.ui.graphics.painter.Painter
    public boolean applyAlpha(float f) {
        int v = kotlin.ranges.c.coerceIn(zd.c.roundToInt(f * 255.0f), 0, 0xFF);
        this.f.setAlpha(v);
        return true;
    }

    @Override  // androidx.compose.ui.graphics.painter.Painter
    public boolean applyColorFilter(@Nullable ColorFilter colorFilter0) {
        android.graphics.ColorFilter colorFilter1 = colorFilter0 == null ? null : AndroidColorFilter_androidKt.asAndroidColorFilter(colorFilter0);
        this.f.setColorFilter(colorFilter1);
        return true;
    }

    @Override  // androidx.compose.ui.graphics.painter.Painter
    public boolean applyLayoutDirection(@NotNull LayoutDirection layoutDirection0) {
        Intrinsics.checkNotNullParameter(layoutDirection0, "layoutDirection");
        int v = WhenMappings.$EnumSwitchMapping$0[layoutDirection0.ordinal()];
        int v1 = 1;
        if(v == 1) {
            v1 = 0;
        }
        else if(v != 2) {
            throw new NoWhenBranchMatchedException();
        }
        return this.f.setLayoutDirection(v1);
    }

    @NotNull
    public final Drawable getDrawable() {
        return this.f;
    }

    @Override  // androidx.compose.ui.graphics.painter.Painter
    public long getIntrinsicSize-NH-jbRc() {
        return ((Size)this.h.getValue()).unbox-impl();
    }

    @Override  // androidx.compose.runtime.RememberObserver
    public void onAbandoned() {
        this.onForgotten();
    }

    @Override  // androidx.compose.ui.graphics.painter.Painter
    public void onDraw(@NotNull DrawScope drawScope0) {
        Intrinsics.checkNotNullParameter(drawScope0, "<this>");
        Canvas canvas0 = drawScope0.getDrawContext().getCanvas();
        ((Number)this.g.getValue()).intValue();
        int v = zd.c.roundToInt(Size.getWidth-impl(drawScope0.getSize-NH-jbRc()));
        int v1 = zd.c.roundToInt(Size.getHeight-impl(drawScope0.getSize-NH-jbRc()));
        this.f.setBounds(0, 0, v, v1);
        try {
            canvas0.save();
            android.graphics.Canvas canvas1 = AndroidCanvas_androidKt.getNativeCanvas(canvas0);
            this.f.draw(canvas1);
        }
        finally {
            canvas0.restore();
        }
    }

    @Override  // androidx.compose.runtime.RememberObserver
    public void onForgotten() {
        Drawable drawable0 = this.f;
        if(drawable0 instanceof Animatable) {
            ((Animatable)drawable0).stop();
        }
        drawable0.setVisible(false, false);
        drawable0.setCallback(null);
    }

    @Override  // androidx.compose.runtime.RememberObserver
    public void onRemembered() {
        Drawable.Callback drawable$Callback0 = (Drawable.Callback)this.i.getValue();
        Drawable drawable0 = this.f;
        drawable0.setCallback(drawable$Callback0);
        drawable0.setVisible(true, true);
        if(drawable0 instanceof Animatable) {
            ((Animatable)drawable0).start();
        }
    }
}

