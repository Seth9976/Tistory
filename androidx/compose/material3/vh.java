package androidx.compose.material3;

import androidx.compose.ui.graphics.drawscope.DrawScope;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class vh extends Lambda implements Function1 {
    public final long w;
    public final int x;

    public vh(long v, int v1) {
        this.w = v;
        this.x = v1;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        float f = ProgressIndicatorDefaults.INSTANCE.getLinearTrackStopIndicatorSize-D9Ej5fM();
        ProgressIndicatorDefaults.INSTANCE.drawStopIndicator-EgI2THU(((DrawScope)object0), f, this.w, this.x);
        return Unit.INSTANCE;
    }
}

