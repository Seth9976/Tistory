package androidx.compose.ui.graphics.painter;

import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.FilterQuality;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001A\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001A\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\f\u001A\u00020\u000B*\u00020\nH\u0014¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0011\u001A\u00020\u00102\u0006\u0010\u000F\u001A\u00020\u000EH\u0014¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0015\u001A\u00020\u00102\b\u0010\u0014\u001A\u0004\u0018\u00010\u0013H\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u001A\u0010\u0019\u001A\u00020\u00102\b\u0010\u0018\u001A\u0004\u0018\u00010\u0017H\u0096\u0002¢\u0006\u0004\b\u0019\u0010\u001AJ\u000F\u0010\u001C\u001A\u00020\u001BH\u0016¢\u0006\u0004\b\u001C\u0010\u001DJ\u000F\u0010\u001F\u001A\u00020\u001EH\u0016¢\u0006\u0004\b\u001F\u0010 R(\u0010\'\u001A\u00020!8\u0000@\u0000X\u0080\u000Eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\"\u0010#\u001A\u0004\b$\u0010\u001D\"\u0004\b%\u0010&R\u001A\u0010+\u001A\u00020(8VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001A\u0004\b)\u0010*\u0082\u0002\u000B\n\u0005\b¡\u001E0\u0001\n\u0002\b!¨\u0006,"}, d2 = {"Landroidx/compose/ui/graphics/painter/BitmapPainter;", "Landroidx/compose/ui/graphics/painter/Painter;", "Landroidx/compose/ui/graphics/ImageBitmap;", "image", "Landroidx/compose/ui/unit/IntOffset;", "srcOffset", "Landroidx/compose/ui/unit/IntSize;", "srcSize", "<init>", "(Landroidx/compose/ui/graphics/ImageBitmap;JJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "", "onDraw", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;)V", "", "alpha", "", "applyAlpha", "(F)Z", "Landroidx/compose/ui/graphics/ColorFilter;", "colorFilter", "applyColorFilter", "(Landroidx/compose/ui/graphics/ColorFilter;)Z", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Landroidx/compose/ui/graphics/FilterQuality;", "i", "I", "getFilterQuality-f-v9h1I$ui_graphics_release", "setFilterQuality-vDHp3xo$ui_graphics_release", "(I)V", "filterQuality", "Landroidx/compose/ui/geometry/Size;", "getIntrinsicSize-NH-jbRc", "()J", "intrinsicSize", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nBitmapPainter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BitmapPainter.kt\nandroidx/compose/ui/graphics/painter/BitmapPainter\n+ 2 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,159:1\n26#2:160\n26#2:161\n*S KotlinDebug\n*F\n+ 1 BitmapPainter.kt\nandroidx/compose/ui/graphics/painter/BitmapPainter\n*L\n98#1:160\n99#1:161\n*E\n"})
public final class BitmapPainter extends Painter {
    public final ImageBitmap f;
    public final long g;
    public final long h;
    public int i;
    public final long j;
    public float k;
    public ColorFilter l;

    public BitmapPainter(ImageBitmap imageBitmap0, long v, long v1, int v2, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v2 & 2) != 0) {
            v = 0L;
        }
        if((v2 & 4) != 0) {
            v1 = IntSizeKt.IntSize(imageBitmap0.getWidth(), imageBitmap0.getHeight());
        }
        this(imageBitmap0, v, v1, null);
    }

    public BitmapPainter(ImageBitmap imageBitmap0, long v, long v1, DefaultConstructorMarker defaultConstructorMarker0) {
        this.f = imageBitmap0;
        this.g = v;
        this.h = v1;
        this.i = 1;
        if(IntOffset.getX-impl(v) < 0 || IntOffset.getY-impl(v) < 0 || IntSize.getWidth-impl(v1) < 0 || IntSize.getHeight-impl(v1) < 0 || IntSize.getWidth-impl(v1) > imageBitmap0.getWidth() || IntSize.getHeight-impl(v1) > imageBitmap0.getHeight()) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        this.j = v1;
        this.k = 1.0f;
    }

    @Override  // androidx.compose.ui.graphics.painter.Painter
    public boolean applyAlpha(float f) {
        this.k = f;
        return true;
    }

    @Override  // androidx.compose.ui.graphics.painter.Painter
    public boolean applyColorFilter(@Nullable ColorFilter colorFilter0) {
        this.l = colorFilter0;
        return true;
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof BitmapPainter)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.f, ((BitmapPainter)object0).f)) {
            return false;
        }
        if(!IntOffset.equals-impl0(this.g, ((BitmapPainter)object0).g)) {
            return false;
        }
        return IntSize.equals-impl0(this.h, ((BitmapPainter)object0).h) ? FilterQuality.equals-impl0(this.i, ((BitmapPainter)object0).i) : false;
    }

    public final int getFilterQuality-f-v9h1I$ui_graphics_release() {
        return this.i;
    }

    @Override  // androidx.compose.ui.graphics.painter.Painter
    public long getIntrinsicSize-NH-jbRc() {
        return IntSizeKt.toSize-ozmzZPI(this.j);
    }

    @Override
    public int hashCode() {
        return FilterQuality.hashCode-impl(this.i) + (IntSize.hashCode-impl(this.h) + (IntOffset.hashCode-impl(this.g) + this.f.hashCode() * 0x1F) * 0x1F) * 0x1F;
    }

    @Override  // androidx.compose.ui.graphics.painter.Painter
    public void onDraw(@NotNull DrawScope drawScope0) {
        long v = IntSizeKt.IntSize(Math.round(Size.getWidth-impl(drawScope0.getSize-NH-jbRc())), Math.round(Size.getHeight-impl(drawScope0.getSize-NH-jbRc())));
        DrawScope.drawImage-AZ2fEMs$default(drawScope0, this.f, this.g, this.h, 0L, v, this.k, null, this.l, 0, this.i, 328, null);
    }

    public final void setFilterQuality-vDHp3xo$ui_graphics_release(int v) {
        this.i = v;
    }

    @Override
    @NotNull
    public String toString() {
        return "BitmapPainter(image=" + this.f + ", srcOffset=" + IntOffset.toString-impl(this.g) + ", srcSize=" + IntSize.toString-impl(this.h) + ", filterQuality=" + FilterQuality.toString-impl(this.i) + ')';
    }
}

