package d0;

import android.graphics.Matrix;
import androidx.compose.animation.core.Animatable;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.unit.IntOffset;
import com.kakao.kandinsky.designsystem.util.OffsetExtensionKt;
import com.kakao.kandinsky.designsystem.util.RectExtensionKt;
import com.kakao.kandinsky.preview.PreviewGestureController;
import com.kakao.kandinsky.utils.MatrixExtensionKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class l extends Lambda implements Function1 {
    public final int w;
    public final long x;
    public final Object y;

    public l(int v, long v1, Object object0) {
        this.w = v;
        this.y = object0;
        this.x = v1;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        if(this.w != 0) {
            Intrinsics.checkNotNullParameter(((Matrix)object0), "$this$buildMatrix");
            long v = OffsetExtensionKt.mapVector-Uv8p0NA(MatrixExtensionKt.invert(((Matrix)object0)), this.x);
            Rect rect0 = RectExtensionKt.mapRect(MatrixExtensionKt.invert(((Matrix)object0)), PreviewGestureController.access$getPreviewBoundary$p(((PreviewGestureController)this.y)));
            Rect rect1 = PreviewGestureController.access$getPreviewBoundary$p(((PreviewGestureController)this.y));
            long v1 = OffsetExtensionKt.mapVector-Uv8p0NA(((Matrix)object0), ((PreviewGestureController)this.y).getMovableOffset-qto3Fdw(v, rect0, rect1));
            ((Matrix)object0).postTranslate(Offset.getX-impl(v1), Offset.getY-impl(v1));
            return Unit.INSTANCE;
        }
        long v2 = IntOffset.minus-qkQi6aY(((IntOffset)((Animatable)object0).getValue()).unbox-impl(), this.x);
        LazyLayoutItemAnimation.access$setPlacementDelta--gyyYBs(((LazyLayoutItemAnimation)this.y), v2);
        ((LazyLayoutItemAnimation)this.y).c.invoke();
        return Unit.INSTANCE;
    }
}

