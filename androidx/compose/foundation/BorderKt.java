package androidx.compose.foundation;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.CacheDrawScope;
import androidx.compose.ui.draw.DrawResult;
import androidx.compose.ui.geometry.CornerRadius;
import androidx.compose.ui.geometry.CornerRadiusKt;
import androidx.compose.ui.geometry.RoundRect;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.drawscope.Fill;
import androidx.compose.ui.graphics.drawscope.Stroke;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import u.o;
import u.r0;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001A%\u0010\u0002\u001A\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001A\u00020\u00012\b\b\u0002\u0010\u0004\u001A\u00020\u0003H\u0007¢\u0006\u0004\b\u0002\u0010\u0005\u001A0\u0010\u0002\u001A\u00020\u0000*\u00020\u00002\u0006\u0010\u0007\u001A\u00020\u00062\u0006\u0010\t\u001A\u00020\b2\b\b\u0002\u0010\u0004\u001A\u00020\u0003H\u0007ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000B\u001A.\u0010\u0002\u001A\u00020\u0000*\u00020\u00002\u0006\u0010\u0007\u001A\u00020\u00062\u0006\u0010\r\u001A\u00020\f2\u0006\u0010\u0004\u001A\u00020\u0003H\u0007ø\u0001\u0000¢\u0006\u0004\b\u000E\u0010\u000F\u0082\u0002\u0007\n\u0005\b¡\u001E0\u0001¨\u0006\u0010"}, d2 = {"Landroidx/compose/ui/Modifier;", "Landroidx/compose/foundation/BorderStroke;", "border", "Landroidx/compose/ui/graphics/Shape;", "shape", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/BorderStroke;Landroidx/compose/ui/graphics/Shape;)Landroidx/compose/ui/Modifier;", "Landroidx/compose/ui/unit/Dp;", "width", "Landroidx/compose/ui/graphics/Color;", "color", "border-xT4_qwU", "(Landroidx/compose/ui/Modifier;FJLandroidx/compose/ui/graphics/Shape;)Landroidx/compose/ui/Modifier;", "Landroidx/compose/ui/graphics/Brush;", "brush", "border-ziNgDLE", "(Landroidx/compose/ui/Modifier;FLandroidx/compose/ui/graphics/Brush;Landroidx/compose/ui/graphics/Shape;)Landroidx/compose/ui/Modifier;", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class BorderKt {
    public static final long a(float f, long v) {
        return CornerRadiusKt.CornerRadius(Math.max(0.0f, CornerRadius.getX-impl(v) - f), Math.max(0.0f, CornerRadius.getY-impl(v) - f));
    }

    public static final Path access$createRoundRectPath(Path path0, RoundRect roundRect0, float f, boolean z) {
        path0.reset();
        Path.addRoundRect$default(path0, roundRect0, null, 2, null);
        if(!z) {
            Path path1 = AndroidPath_androidKt.Path();
            Path.addRoundRect$default(path1, new RoundRect(f, f, roundRect0.getWidth() - f, roundRect0.getHeight() - f, BorderKt.a(f, roundRect0.getTopLeftCornerRadius-kKHJgLs()), BorderKt.a(f, roundRect0.getTopRightCornerRadius-kKHJgLs()), BorderKt.a(f, roundRect0.getBottomRightCornerRadius-kKHJgLs()), BorderKt.a(f, roundRect0.getBottomLeftCornerRadius-kKHJgLs()), null), null, 2, null);
            path0.op-N5in7k0(path0, path1, 0);
        }
        return path0;
    }

    public static final DrawResult access$drawContentWithoutBorder(CacheDrawScope cacheDrawScope0) {
        return cacheDrawScope0.onDrawWithContent(o.z);
    }

    // 去混淆评级： 低(26)
    public static final DrawResult access$drawRectBorder-NsqcLGU(CacheDrawScope cacheDrawScope0, Brush brush0, long v, long v1, boolean z, float f) {
        long v2 = z ? 0L : v;
        long v3 = z ? cacheDrawScope0.getSize-NH-jbRc() : v1;
        return z ? cacheDrawScope0.onDrawWithContent(new r0(brush0, v2, v3, Fill.INSTANCE)) : cacheDrawScope0.onDrawWithContent(new r0(brush0, v2, v3, new Stroke(f, 0.0f, 0, 0, null, 30, null)));
    }

    public static final long access$shrink-Kibmq7A(long v, float f) {
        return BorderKt.a(f, v);
    }

    @Stable
    @NotNull
    public static final Modifier border(@NotNull Modifier modifier0, @NotNull BorderStroke borderStroke0, @NotNull Shape shape0) {
        return BorderKt.border-ziNgDLE(modifier0, borderStroke0.getWidth-D9Ej5fM(), borderStroke0.getBrush(), shape0);
    }

    public static Modifier border$default(Modifier modifier0, BorderStroke borderStroke0, Shape shape0, int v, Object object0) {
        if((v & 2) != 0) {
            shape0 = RectangleShapeKt.getRectangleShape();
        }
        return BorderKt.border(modifier0, borderStroke0, shape0);
    }

    @Stable
    @NotNull
    public static final Modifier border-xT4_qwU(@NotNull Modifier modifier0, float f, long v, @NotNull Shape shape0) {
        return BorderKt.border-ziNgDLE(modifier0, f, new SolidColor(v, null), shape0);
    }

    public static Modifier border-xT4_qwU$default(Modifier modifier0, float f, long v, Shape shape0, int v1, Object object0) {
        if((v1 & 4) != 0) {
            shape0 = RectangleShapeKt.getRectangleShape();
        }
        return BorderKt.border-xT4_qwU(modifier0, f, v, shape0);
    }

    @Stable
    @NotNull
    public static final Modifier border-ziNgDLE(@NotNull Modifier modifier0, float f, @NotNull Brush brush0, @NotNull Shape shape0) {
        return modifier0.then(new BorderModifierNodeElement(f, brush0, shape0, null));
    }
}

