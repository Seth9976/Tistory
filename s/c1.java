package s;

import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class c1 extends Lambda implements Function1 {
    public final ContentDrawScope w;

    public c1(ContentDrawScope contentDrawScope0) {
        this.w = contentDrawScope0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        DrawScope drawScope0 = (DrawScope)object0;
        this.w.drawContent();
        return Unit.INSTANCE;
    }
}

