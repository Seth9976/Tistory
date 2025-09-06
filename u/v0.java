package u;

import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class v0 extends Lambda implements Function1 {
    public final Path w;
    public final Brush x;

    public v0(Path path0, Brush brush0) {
        this.w = path0;
        this.x = brush0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        ((ContentDrawScope)object0).drawContent();
        DrawScope.drawPath-GBMwjPU$default(((ContentDrawScope)object0), this.w, this.x, 0.0f, null, null, 0, 60, null);
        return Unit.INSTANCE;
    }
}

