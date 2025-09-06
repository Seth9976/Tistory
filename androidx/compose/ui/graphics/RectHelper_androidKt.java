package androidx.compose.ui.graphics;

import android.graphics.Rect;
import android.graphics.RectF;
import androidx.compose.ui.unit.IntRect;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001A\f\u0010\u0000\u001A\u00020\u0001*\u00020\u0002H\u0007\u001A\n\u0010\u0000\u001A\u00020\u0001*\u00020\u0003\u001A\n\u0010\u0004\u001A\u00020\u0005*\u00020\u0002\u001A\n\u0010\u0006\u001A\u00020\u0003*\u00020\u0001\u001A\n\u0010\u0007\u001A\u00020\u0002*\u00020\u0001\u001A\n\u0010\u0007\u001A\u00020\u0002*\u00020\u0005¨\u0006\b"}, d2 = {"toAndroidRect", "Landroid/graphics/Rect;", "Landroidx/compose/ui/geometry/Rect;", "Landroidx/compose/ui/unit/IntRect;", "toAndroidRectF", "Landroid/graphics/RectF;", "toComposeIntRect", "toComposeRect", "ui-graphics_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class RectHelper_androidKt {
    @Deprecated(message = "Converting Rect to android.graphics.Rect is lossy, and requires rounding. The behavior of toAndroidRect() truncates to an integral Rect, but you should choose the method of rounding most suitable for your use case.", replaceWith = @ReplaceWith(expression = "android.graphics.Rect(left.toInt(), top.toInt(), right.toInt(), bottom.toInt())", imports = {}))
    @NotNull
    public static final Rect toAndroidRect(@NotNull androidx.compose.ui.geometry.Rect rect0) {
        return new Rect(((int)rect0.getLeft()), ((int)rect0.getTop()), ((int)rect0.getRight()), ((int)rect0.getBottom()));
    }

    @NotNull
    public static final Rect toAndroidRect(@NotNull IntRect intRect0) {
        return new Rect(intRect0.getLeft(), intRect0.getTop(), intRect0.getRight(), intRect0.getBottom());
    }

    @NotNull
    public static final RectF toAndroidRectF(@NotNull androidx.compose.ui.geometry.Rect rect0) {
        return new RectF(rect0.getLeft(), rect0.getTop(), rect0.getRight(), rect0.getBottom());
    }

    @NotNull
    public static final IntRect toComposeIntRect(@NotNull Rect rect0) {
        return new IntRect(rect0.left, rect0.top, rect0.right, rect0.bottom);
    }

    @NotNull
    public static final androidx.compose.ui.geometry.Rect toComposeRect(@NotNull Rect rect0) {
        return new androidx.compose.ui.geometry.Rect(((float)rect0.left), ((float)rect0.top), ((float)rect0.right), ((float)rect0.bottom));
    }

    @NotNull
    public static final androidx.compose.ui.geometry.Rect toComposeRect(@NotNull RectF rectF0) {
        return new androidx.compose.ui.geometry.Rect(rectF0.left, rectF0.top, rectF0.right, rectF0.bottom);
    }
}

