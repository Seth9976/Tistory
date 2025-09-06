package na;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class i extends Lambda implements Function1 {
    public final Rect w;

    public i(Rect rect0) {
        this.w = rect0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((ContentDrawScope)object0), "$this$drawWithContent");
        ((ContentDrawScope)object0).getDrawContext().getCanvas().clipRect-mtrdD-E(this.w, 1);
        ((ContentDrawScope)object0).drawContent();
        return Unit.INSTANCE;
    }
}

