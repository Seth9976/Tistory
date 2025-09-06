package n1;

import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.RenderEffectKt;
import androidx.compose.ui.graphics.Shape;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class a extends Lambda implements Function1 {
    public final boolean A;
    public final float w;
    public final float x;
    public final int y;
    public final Shape z;

    public a(float f, float f1, int v, Shape shape0, boolean z) {
        this.w = f;
        this.x = f1;
        this.y = v;
        this.z = shape0;
        this.A = z;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        float f = ((GraphicsLayerScope)object0).toPx-0680j_4(this.w);
        float f1 = ((GraphicsLayerScope)object0).toPx-0680j_4(this.x);
        ((GraphicsLayerScope)object0).setRenderEffect((f <= 0.0f || f1 <= 0.0f ? null : RenderEffectKt.BlurEffect-3YTHUZs(f, f1, this.y)));
        ((GraphicsLayerScope)object0).setShape((this.z == null ? RectangleShapeKt.getRectangleShape() : this.z));
        ((GraphicsLayerScope)object0).setClip(this.A);
        return Unit.INSTANCE;
    }
}

