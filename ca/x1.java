package ca;

import android.graphics.Canvas;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class x1 extends Lambda implements Function1 {
    public final long w;
    public final Rect x;

    public x1(long v, Rect rect0) {
        this.w = v;
        this.x = rect0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((ContentDrawScope)object0), "$this$drawWithContent");
        Canvas canvas0 = AndroidCanvas_androidKt.getNativeCanvas(((ContentDrawScope)object0).getDrawContext().getCanvas());
        int v = canvas0.saveLayer(null, null);
        long v1 = ((ContentDrawScope)object0).getSize-NH-jbRc();
        DrawScope.drawRect-n-J9OG0$default(((ContentDrawScope)object0), this.w, 0L, v1, 0.0f, null, null, 0, 120, null);
        long v2 = this.x.getSize-NH-jbRc();
        DrawScope.drawRect-n-J9OG0$default(((ContentDrawScope)object0), 0L, this.x.getTopLeft-F1C5BW0(), v2, 0.0f, null, null, 0, 56, null);
        canvas0.restoreToCount(v);
        ((ContentDrawScope)object0).drawContent();
        return Unit.INSTANCE;
    }
}

