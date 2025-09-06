package androidx.compose.ui.platform;

import androidx.compose.ui.geometry.CornerRadius;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RoundRect;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Outline.Generic;
import androidx.compose.ui.graphics.Outline.Rectangle;
import androidx.compose.ui.graphics.Outline.Rounded;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.graphics.Path;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u001E\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0002\b\u0003\u001A?\u0010\t\u001A\u00020\b2\u0006\u0010\u0001\u001A\u00020\u00002\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u0004\u001A\u00020\u00022\n\b\u0002\u0010\u0006\u001A\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001A\u0004\u0018\u00010\u0005H\u0000¢\u0006\u0004\b\t\u0010\n¨\u0006\u000B"}, d2 = {"Landroidx/compose/ui/graphics/Outline;", "outline", "", "x", "y", "Landroidx/compose/ui/graphics/Path;", "tmpTouchPointPath", "tmpOpPath", "", "isInOutline", "(Landroidx/compose/ui/graphics/Outline;FFLandroidx/compose/ui/graphics/Path;Landroidx/compose/ui/graphics/Path;)Z", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class ShapeContainingUtilKt {
    public static final boolean a(Path path0, float f, float f1, Path path1, Path path2) {
        Rect rect0 = new Rect(f - 0.005f, f1 - 0.005f, f + 0.005f, f1 + 0.005f);
        if(path1 == null) {
            path1 = AndroidPath_androidKt.Path();
        }
        Path.addRect$default(path1, rect0, null, 2, null);
        if(path2 == null) {
            path2 = AndroidPath_androidKt.Path();
        }
        path2.op-N5in7k0(path0, path1, 1);
        path2.reset();
        path1.reset();
        return !path2.isEmpty();
    }

    public static final boolean b(float f, float f1, long v, float f2, float f3) {
        float f4 = CornerRadius.getX-impl(v);
        float f5 = CornerRadius.getY-impl(v);
        return (f1 - f3) * (f1 - f3) / (f5 * f5) + (f - f2) * (f - f2) / (f4 * f4) <= 1.0f;
    }

    public static final boolean isInOutline(@NotNull Outline outline0, float f, float f1, @Nullable Path path0, @Nullable Path path1) {
        if(outline0 instanceof Rectangle) {
            Rect rect0 = ((Rectangle)outline0).getRect();
            return rect0.getLeft() <= f && f < rect0.getRight() && rect0.getTop() <= f1 && f1 < rect0.getBottom();
        }
        if(outline0 instanceof Rounded) {
            RoundRect roundRect0 = ((Rounded)outline0).getRoundRect();
            if(f >= roundRect0.getLeft() && f < roundRect0.getRight() && f1 >= roundRect0.getTop() && f1 < roundRect0.getBottom()) {
                if(CornerRadius.getX-impl(roundRect0.getTopRightCornerRadius-kKHJgLs()) + CornerRadius.getX-impl(roundRect0.getTopLeftCornerRadius-kKHJgLs()) <= roundRect0.getWidth() && CornerRadius.getX-impl(roundRect0.getBottomRightCornerRadius-kKHJgLs()) + CornerRadius.getX-impl(roundRect0.getBottomLeftCornerRadius-kKHJgLs()) <= roundRect0.getWidth() && CornerRadius.getY-impl(roundRect0.getBottomLeftCornerRadius-kKHJgLs()) + CornerRadius.getY-impl(roundRect0.getTopLeftCornerRadius-kKHJgLs()) <= roundRect0.getHeight() && CornerRadius.getY-impl(roundRect0.getBottomRightCornerRadius-kKHJgLs()) + CornerRadius.getY-impl(roundRect0.getTopRightCornerRadius-kKHJgLs()) <= roundRect0.getHeight()) {
                    float f2 = CornerRadius.getX-impl(roundRect0.getTopLeftCornerRadius-kKHJgLs()) + roundRect0.getLeft();
                    float f3 = CornerRadius.getY-impl(roundRect0.getTopLeftCornerRadius-kKHJgLs()) + roundRect0.getTop();
                    float f4 = roundRect0.getRight() - CornerRadius.getX-impl(roundRect0.getTopRightCornerRadius-kKHJgLs());
                    float f5 = CornerRadius.getY-impl(roundRect0.getTopRightCornerRadius-kKHJgLs()) + roundRect0.getTop();
                    float f6 = roundRect0.getRight() - CornerRadius.getX-impl(roundRect0.getBottomRightCornerRadius-kKHJgLs());
                    float f7 = roundRect0.getBottom() - CornerRadius.getY-impl(roundRect0.getBottomRightCornerRadius-kKHJgLs());
                    float f8 = roundRect0.getBottom() - CornerRadius.getY-impl(roundRect0.getBottomLeftCornerRadius-kKHJgLs());
                    float f9 = CornerRadius.getX-impl(roundRect0.getBottomLeftCornerRadius-kKHJgLs()) + roundRect0.getLeft();
                    if(f < f2 && f1 < f3) {
                        return ShapeContainingUtilKt.b(f, f1, roundRect0.getTopLeftCornerRadius-kKHJgLs(), f2, f3);
                    }
                    if(f < f9 && f1 > f8) {
                        return ShapeContainingUtilKt.b(f, f1, roundRect0.getBottomLeftCornerRadius-kKHJgLs(), f9, f8);
                    }
                    if(f > f4 && f1 < f5) {
                        return ShapeContainingUtilKt.b(f, f1, roundRect0.getTopRightCornerRadius-kKHJgLs(), f4, f5);
                    }
                    return f <= f6 || f1 <= f7 ? true : ShapeContainingUtilKt.b(f, f1, roundRect0.getBottomRightCornerRadius-kKHJgLs(), f6, f7);
                }
                Path path2 = path1 == null ? AndroidPath_androidKt.Path() : path1;
                Path.addRoundRect$default(path2, roundRect0, null, 2, null);
                return ShapeContainingUtilKt.a(path2, f, f1, path0, path1);
            }
            return false;
        }
        if(!(outline0 instanceof Generic)) {
            throw new NoWhenBranchMatchedException();
        }
        return ShapeContainingUtilKt.a(((Generic)outline0).getPath(), f, f1, path0, path1);
    }

    public static boolean isInOutline$default(Outline outline0, float f, float f1, Path path0, Path path1, int v, Object object0) {
        if((v & 8) != 0) {
            path0 = null;
        }
        if((v & 16) != 0) {
            path1 = null;
        }
        return ShapeContainingUtilKt.isInOutline(outline0, f, f1, path0, path1);
    }
}

