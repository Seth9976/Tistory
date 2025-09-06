package oa;

import android.content.Context;
import android.view.TextureView;
import android.view.ViewGroup.LayoutParams;
import androidx.compose.material3.pulltorefresh.PullToRefreshKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RectKt;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.unit.IntSize;
import com.kakao.kandinsky.preview.ui.PreviewTextureViewKt.TextureView.1.1.1.1;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import x0.a;

public final class k extends Lambda implements Function1 {
    public final Object A;
    public final int w;
    public final Function0 x;
    public final long y;
    public final Object z;

    public k(long v, Function3 function30, MutableState mutableState0, Function0 function00) {
        this.w = 0;
        this.y = v;
        this.z = function30;
        this.A = mutableState0;
        this.x = function00;
        super(1);
    }

    public k(Function0 function00, State state0, long v, Path path0) {
        this.w = 1;
        this.x = function00;
        this.z = state0;
        this.y = v;
        this.A = path0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        if(this.w != 0) {
            a a0 = PullToRefreshKt.access$ArrowValues(((Number)this.x.invoke()).floatValue());
            float f = ((Number)((State)this.z).getValue()).floatValue();
            long v = ((DrawScope)object0).getCenter-F1C5BW0();
            DrawContext drawContext0 = ((DrawScope)object0).getDrawContext();
            long v1 = drawContext0.getSize-NH-jbRc();
            drawContext0.getCanvas().save();
            try {
                drawContext0.getTransform().rotate-Uv8p0NA(a0.a, v);
                float f1 = ((DrawScope)object0).toPx-0680j_4(0.0f);
                float f2 = ((DrawScope)object0).toPx-0680j_4(0.0f);
                Rect rect0 = RectKt.Rect-3MmeM6k(SizeKt.getCenter-uvyYCjk(((DrawScope)object0).getSize-NH-jbRc()), f2 / 2.0f + f1);
                PullToRefreshKt.access$drawCircularIndicator-KzyDr3Q(((DrawScope)object0), this.y, f, a0, rect0, 0.0f);
                PullToRefreshKt.access$drawArrow-uDrxG_w(((DrawScope)object0), ((Path)this.A), rect0, this.y, f, a0, 0.0f);
                return Unit.INSTANCE;
            }
            finally {
                r0.a.y(drawContext0, v1);
            }
        }
        Intrinsics.checkNotNullParameter(((Context)object0), "it");
        TextureView textureView0 = new TextureView(((Context)object0));
        textureView0.setSurfaceTextureListener(new PreviewTextureViewKt.TextureView.1.1.1.1(((Function3)this.z), ((MutableState)this.A), this.x));
        textureView0.setLayoutParams(new ViewGroup.LayoutParams(IntSize.getWidth-impl(this.y), IntSize.getHeight-impl(this.y)));
        return textureView0;
    }
}

