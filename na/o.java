package na;

import android.graphics.Matrix;
import androidx.compose.ui.geometry.Offset;
import com.kakao.kandinsky.designsystem.util.Transform;
import com.kakao.kandinsky.preview.PreviewAnimator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class o extends Lambda implements Function1 {
    public final int w;
    public final Transform x;
    public final PreviewAnimator y;

    public o(Transform transform0, PreviewAnimator previewAnimator0, int v) {
        this.w = v;
        this.x = transform0;
        this.y = previewAnimator0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        if(this.w != 0) {
            Intrinsics.checkNotNullParameter(((Matrix)object0), "$this$buildMatrix");
            float f = Offset.getX-impl(this.y.g.getCenter-F1C5BW0());
            float f1 = Offset.getY-impl(this.y.g.getCenter-F1C5BW0());
            ((Matrix)object0).postRotate(this.x.getRotateZ(), f, f1);
            float f2 = Offset.getX-impl(this.y.g.getCenter-F1C5BW0());
            float f3 = Offset.getY-impl(this.y.g.getCenter-F1C5BW0());
            ((Matrix)object0).postScale(this.x.getScaleX(), this.x.getScaleY(), f2, f3);
            return Unit.INSTANCE;
        }
        Intrinsics.checkNotNullParameter(((Matrix)object0), "$this$buildMatrix");
        float f4 = Offset.getX-impl(this.y.g.getCenter-F1C5BW0());
        float f5 = Offset.getY-impl(this.y.g.getCenter-F1C5BW0());
        ((Matrix)object0).postRotate(this.x.getRotateZ(), f4, f5);
        float f6 = Offset.getX-impl(this.y.g.getCenter-F1C5BW0());
        float f7 = Offset.getY-impl(this.y.g.getCenter-F1C5BW0());
        ((Matrix)object0).postScale(this.x.getScaleX(), this.x.getScaleY(), f6, f7);
        return Unit.INSTANCE;
    }
}

