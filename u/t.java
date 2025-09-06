package u;

import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref.ObjectRef;

public final class t extends Lambda implements Function0 {
    public final ObjectRef w;
    public final u x;
    public final ContentDrawScope y;

    public t(ObjectRef ref$ObjectRef0, u u0, ContentDrawScope contentDrawScope0) {
        this.w = ref$ObjectRef0;
        this.x = u0;
        this.y = contentDrawScope0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        this.w.element = this.x.q.createOutline-Pq9zytI(this.y.getSize-NH-jbRc(), this.y.getLayoutDirection(), this.y);
        return Unit.INSTANCE;
    }
}

