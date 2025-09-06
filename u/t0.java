package u;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref.ObjectRef;

public final class t0 extends Lambda implements Function1 {
    public final Rect w;
    public final ObjectRef x;
    public final long y;
    public final ColorFilter z;

    public t0(Rect rect0, ObjectRef ref$ObjectRef0, long v, ColorFilter colorFilter0) {
        this.w = rect0;
        this.x = ref$ObjectRef0;
        this.y = v;
        this.z = colorFilter0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        ImageBitmap imageBitmap0;
        ((ContentDrawScope)object0).drawContent();
        float f = this.w.getLeft();
        float f1 = this.w.getTop();
        long v = this.y;
        ColorFilter colorFilter0 = this.z;
        ((ContentDrawScope)object0).getDrawContext().getTransform().translate(f, f1);
        try {
            imageBitmap0 = (ImageBitmap)this.x.element;
        }
        catch(Throwable throwable0) {
            ((ContentDrawScope)object0).getDrawContext().getTransform().translate(-f, -f1);
            throw throwable0;
        }
        ContentDrawScope contentDrawScope0 = (ContentDrawScope)object0;
        try {
            DrawScope.drawImage-AZ2fEMs$default(contentDrawScope0, imageBitmap0, 0L, v, 0L, 0L, 0.0f, null, colorFilter0, 0, 0, 890, null);
        }
        catch(Throwable throwable0) {
            ((ContentDrawScope)object0).getDrawContext().getTransform().translate(-f, -f1);
            throw throwable0;
        }
        ((ContentDrawScope)object0).getDrawContext().getTransform().translate(-f, -f1);
        return Unit.INSTANCE;
    }
}

