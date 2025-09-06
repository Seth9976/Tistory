package w0;

import androidx.compose.material3.internal.AnchoredDragScope;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref.FloatRef;

public final class k extends Lambda implements Function2 {
    public final AnchoredDragScope w;
    public final FloatRef x;

    public k(AnchoredDragScope anchoredDragScope0, FloatRef ref$FloatRef0) {
        this.w = anchoredDragScope0;
        this.x = ref$FloatRef0;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        float f = ((Number)object0).floatValue();
        this.w.dragTo(f, ((Number)object1).floatValue());
        this.x.element = f;
        return Unit.INSTANCE;
    }
}

