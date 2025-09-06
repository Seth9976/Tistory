package androidx.compose.ui.graphics;

import androidx.annotation.FloatRange;
import androidx.compose.ui.geometry.CornerRadius;
import androidx.compose.ui.geometry.CornerRadiusKt;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RoundRect;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.graphics.drawscope.Fill;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001A\u0019\u0010\u0004\u001A\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001A\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001AN\u0010\u0013\u001A\u00020\u0003*\u00020\u00062\u0006\u0010\u0002\u001A\u00020\u00012\u0006\u0010\b\u001A\u00020\u00072\b\b\u0003\u0010\n\u001A\u00020\t2\b\b\u0002\u0010\f\u001A\u00020\u000B2\n\b\u0002\u0010\u000E\u001A\u0004\u0018\u00010\r2\b\b\u0002\u0010\u0010\u001A\u00020\u000Fø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001AN\u0010\u0013\u001A\u00020\u0003*\u00020\u00062\u0006\u0010\u0002\u001A\u00020\u00012\u0006\u0010\u0015\u001A\u00020\u00142\b\b\u0003\u0010\n\u001A\u00020\t2\b\b\u0002\u0010\f\u001A\u00020\u000B2\n\b\u0002\u0010\u000E\u001A\u0004\u0018\u00010\r2\b\b\u0002\u0010\u0010\u001A\u00020\u000Fø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017\u001A!\u0010\u0013\u001A\u00020\u0003*\u00020\u00182\u0006\u0010\u0002\u001A\u00020\u00012\u0006\u0010\u001A\u001A\u00020\u0019¢\u0006\u0004\b\u0013\u0010\u001B\u0082\u0002\u0007\n\u0005\b¡\u001E0\u0001¨\u0006\u001C"}, d2 = {"Landroidx/compose/ui/graphics/Path;", "Landroidx/compose/ui/graphics/Outline;", "outline", "", "addOutline", "(Landroidx/compose/ui/graphics/Path;Landroidx/compose/ui/graphics/Outline;)V", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "Landroidx/compose/ui/graphics/Color;", "color", "", "alpha", "Landroidx/compose/ui/graphics/drawscope/DrawStyle;", "style", "Landroidx/compose/ui/graphics/ColorFilter;", "colorFilter", "Landroidx/compose/ui/graphics/BlendMode;", "blendMode", "drawOutline-wDX37Ww", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;Landroidx/compose/ui/graphics/Outline;JFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "drawOutline", "Landroidx/compose/ui/graphics/Brush;", "brush", "drawOutline-hn5TExg", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;Landroidx/compose/ui/graphics/Outline;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "Landroidx/compose/ui/graphics/Canvas;", "Landroidx/compose/ui/graphics/Paint;", "paint", "(Landroidx/compose/ui/graphics/Canvas;Landroidx/compose/ui/graphics/Outline;Landroidx/compose/ui/graphics/Paint;)V", "ui-graphics_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nOutline.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Outline.kt\nandroidx/compose/ui/graphics/OutlineKt\n*L\n1#1,297:1\n235#1,16:298\n235#1,16:314\n*S KotlinDebug\n*F\n+ 1 Outline.kt\nandroidx/compose/ui/graphics/OutlineKt\n*L\n146#1:298,16\n185#1:314,16\n*E\n"})
public final class OutlineKt {
    public static final void addOutline(@NotNull Path path0, @NotNull Outline outline0) {
        if(outline0 instanceof Rectangle) {
            Path.addRect$default(path0, ((Rectangle)outline0).getRect(), null, 2, null);
            return;
        }
        if(outline0 instanceof Rounded) {
            Path.addRoundRect$default(path0, ((Rounded)outline0).getRoundRect(), null, 2, null);
            return;
        }
        if(!(outline0 instanceof Generic)) {
            throw new NoWhenBranchMatchedException();
        }
        Path.addPath-Uv8p0NA$default(path0, ((Generic)outline0).getPath(), 0L, 2, null);
    }

    public static final void drawOutline(@NotNull Canvas canvas0, @NotNull Outline outline0, @NotNull Paint paint0) {
        if(outline0 instanceof Rectangle) {
            canvas0.drawRect(((Rectangle)outline0).getRect(), paint0);
            return;
        }
        if(outline0 instanceof Rounded) {
            Path path0 = ((Rounded)outline0).getRoundRectPath$ui_graphics_release();
            if(path0 != null) {
                canvas0.drawPath(path0, paint0);
                return;
            }
            canvas0.drawRoundRect(((Rounded)outline0).getRoundRect().getLeft(), ((Rounded)outline0).getRoundRect().getTop(), ((Rounded)outline0).getRoundRect().getRight(), ((Rounded)outline0).getRoundRect().getBottom(), CornerRadius.getX-impl(((Rounded)outline0).getRoundRect().getBottomLeftCornerRadius-kKHJgLs()), CornerRadius.getY-impl(((Rounded)outline0).getRoundRect().getBottomLeftCornerRadius-kKHJgLs()), paint0);
            return;
        }
        if(!(outline0 instanceof Generic)) {
            throw new NoWhenBranchMatchedException();
        }
        canvas0.drawPath(((Generic)outline0).getPath(), paint0);
    }

    public static final void drawOutline-hn5TExg(@NotNull DrawScope drawScope0, @NotNull Outline outline0, @NotNull Brush brush0, @FloatRange(from = 0.0, to = 1.0) float f, @NotNull DrawStyle drawStyle0, @Nullable ColorFilter colorFilter0, int v) {
        Path path0;
        if(outline0 instanceof Rectangle) {
            Rect rect0 = ((Rectangle)outline0).getRect();
            drawScope0.drawRect-AsUm42w(brush0, OffsetKt.Offset(rect0.getLeft(), rect0.getTop()), SizeKt.Size(rect0.getWidth(), rect0.getHeight()), f, drawStyle0, colorFilter0, v);
            return;
        }
        if(outline0 instanceof Rounded) {
            path0 = ((Rounded)outline0).getRoundRectPath$ui_graphics_release();
            if(path0 != null) {
                drawScope0.drawPath-GBMwjPU(path0, brush0, f, drawStyle0, colorFilter0, v);
                return;
            }
            RoundRect roundRect0 = ((Rounded)outline0).getRoundRect();
            drawScope0.drawRoundRect-ZuiqVtQ(brush0, OffsetKt.Offset(roundRect0.getLeft(), roundRect0.getTop()), SizeKt.Size(roundRect0.getWidth(), roundRect0.getHeight()), CornerRadiusKt.CornerRadius$default(CornerRadius.getX-impl(roundRect0.getBottomLeftCornerRadius-kKHJgLs()), 0.0f, 2, null), f, drawStyle0, colorFilter0, v);
            return;
        }
        if(!(outline0 instanceof Generic)) {
            throw new NoWhenBranchMatchedException();
        }
        path0 = ((Generic)outline0).getPath();
        drawScope0.drawPath-GBMwjPU(path0, brush0, f, drawStyle0, colorFilter0, v);
    }

    public static void drawOutline-hn5TExg$default(DrawScope drawScope0, Outline outline0, Brush brush0, float f, DrawStyle drawStyle0, ColorFilter colorFilter0, int v, int v1, Object object0) {
        if((v1 & 4) != 0) {
            f = 1.0f;
        }
        if((v1 & 8) != 0) {
            drawStyle0 = Fill.INSTANCE;
        }
        if((v1 & 16) != 0) {
            colorFilter0 = null;
        }
        if((v1 & 0x20) != 0) {
            v = 3;
        }
        OutlineKt.drawOutline-hn5TExg(drawScope0, outline0, brush0, f, drawStyle0, colorFilter0, v);
    }

    public static final void drawOutline-wDX37Ww(@NotNull DrawScope drawScope0, @NotNull Outline outline0, long v, @FloatRange(from = 0.0, to = 1.0) float f, @NotNull DrawStyle drawStyle0, @Nullable ColorFilter colorFilter0, int v1) {
        Path path0;
        if(outline0 instanceof Rectangle) {
            Rect rect0 = ((Rectangle)outline0).getRect();
            drawScope0.drawRect-n-J9OG0(v, OffsetKt.Offset(rect0.getLeft(), rect0.getTop()), SizeKt.Size(rect0.getWidth(), rect0.getHeight()), f, drawStyle0, colorFilter0, v1);
            return;
        }
        if(outline0 instanceof Rounded) {
            path0 = ((Rounded)outline0).getRoundRectPath$ui_graphics_release();
            if(path0 != null) {
                drawScope0.drawPath-LG529CI(path0, v, f, drawStyle0, colorFilter0, v1);
                return;
            }
            RoundRect roundRect0 = ((Rounded)outline0).getRoundRect();
            drawScope0.drawRoundRect-u-Aw5IA(v, OffsetKt.Offset(roundRect0.getLeft(), roundRect0.getTop()), SizeKt.Size(roundRect0.getWidth(), roundRect0.getHeight()), CornerRadiusKt.CornerRadius$default(CornerRadius.getX-impl(roundRect0.getBottomLeftCornerRadius-kKHJgLs()), 0.0f, 2, null), drawStyle0, f, colorFilter0, v1);
            return;
        }
        if(!(outline0 instanceof Generic)) {
            throw new NoWhenBranchMatchedException();
        }
        path0 = ((Generic)outline0).getPath();
        drawScope0.drawPath-LG529CI(path0, v, f, drawStyle0, colorFilter0, v1);
    }

    public static void drawOutline-wDX37Ww$default(DrawScope drawScope0, Outline outline0, long v, float f, DrawStyle drawStyle0, ColorFilter colorFilter0, int v1, int v2, Object object0) {
        DrawStyle drawStyle1 = (v2 & 8) == 0 ? drawStyle0 : Fill.INSTANCE;
        OutlineKt.drawOutline-wDX37Ww(drawScope0, outline0, v, ((v2 & 4) == 0 ? f : 1.0f), drawStyle1, ((v2 & 16) == 0 ? colorFilter0 : null), ((v2 & 0x20) == 0 ? v1 : 3));
    }
}

