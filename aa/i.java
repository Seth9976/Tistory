package aa;

import android.graphics.BlurMaskFilter.Blur;
import android.graphics.BlurMaskFilter;
import androidx.compose.ui.draw.CacheDrawScope;
import androidx.compose.ui.graphics.AndroidPaint_androidKt;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Paint;
import androidx.compose.ui.graphics.Path;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class i extends Lambda implements Function1 {
    public final long A;
    public final float w;
    public final long x;
    public final Function1 y;
    public final int z;

    public i(float f, long v, Function1 function10, int v1, long v2) {
        this.w = f;
        this.x = v;
        this.y = function10;
        this.z = v1;
        this.A = v2;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((CacheDrawScope)object0), "$this$drawWithCache");
        float f = ((CacheDrawScope)object0).toPx-0680j_4(this.w);
        Path path0 = AndroidPath_androidKt.Path();
        Paint paint0 = AndroidPaint_androidKt.Paint();
        paint0.setStyle-k9PVt8s(1);
        paint0.setColor-8_81llA(this.x);
        paint0.asFrameworkPaint().setMaskFilter(new BlurMaskFilter(((CacheDrawScope)object0).toPx-0680j_4(1.0f), BlurMaskFilter.Blur.NORMAL));
        return ((CacheDrawScope)object0).onDrawWithContent(new h(this.y, this.z, path0, this.A, f, paint0));
    }
}

