package ca;

import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class t extends Lambda implements Function1 {
    public final Brush w;

    public t(Brush brush0) {
        this.w = brush0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((ContentDrawScope)object0), "$this$onDrawWithContent");
        ((ContentDrawScope)object0).drawContent();
        DrawScope.drawRect-AsUm42w$default(((ContentDrawScope)object0), this.w, 0L, 0L, 0.0f, null, null, 6, 62, null);
        return Unit.INSTANCE;
    }
}

