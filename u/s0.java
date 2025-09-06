package u;

import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Outline.Generic;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class s0 extends Lambda implements Function1 {
    public final Generic w;
    public final Brush x;

    public s0(Generic outline$Generic0, Brush brush0) {
        this.w = outline$Generic0;
        this.x = brush0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        ((ContentDrawScope)object0).drawContent();
        DrawScope.drawPath-GBMwjPU$default(((ContentDrawScope)object0), this.w.getPath(), this.x, 0.0f, null, null, 0, 60, null);
        return Unit.INSTANCE;
    }
}

