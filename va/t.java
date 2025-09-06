package va;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import com.kakao.kandinsky.core.kdphoto.Signature.Text.Companion.WatermarkDrawData;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class t extends Lambda implements Function1 {
    public final WatermarkDrawData w;
    public final Rect x;

    public t(WatermarkDrawData signature$Text$Companion$WatermarkDrawData0, Rect rect0) {
        this.w = signature$Text$Companion$WatermarkDrawData0;
        this.x = rect0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((GraphicsLayerScope)object0), "$this$graphicsLayer");
        ((GraphicsLayerScope)object0).setTranslationX(-(Size.getWidth-impl(this.w.getBoundsSize-NH-jbRc()) - this.x.getWidth()) / 2.0f);
        ((GraphicsLayerScope)object0).setTranslationY(-(Size.getHeight-impl(this.w.getBoundsSize-NH-jbRc()) - this.x.getHeight()) / 2.0f);
        ((GraphicsLayerScope)object0).setRotationZ(-45.0f);
        return Unit.INSTANCE;
    }
}

