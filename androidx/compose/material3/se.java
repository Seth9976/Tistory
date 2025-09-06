package androidx.compose.material3;

import androidx.compose.ui.graphics.GraphicsLayerScope;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class se extends Lambda implements Function1 {
    public final int w;
    public final boolean x;
    public final Function0 y;

    public se(boolean z, Function0 function00, int v) {
        this.w = v;
        this.x = z;
        this.y = function00;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        switch(this.w) {
            case 0: {
                ((GraphicsLayerScope)object0).setAlpha((this.x ? 1.0f : ((Number)this.y.invoke()).floatValue()));
                return Unit.INSTANCE;
            }
            case 1: {
                ((GraphicsLayerScope)object0).setAlpha((this.x ? 1.0f : ((Number)this.y.invoke()).floatValue()));
                return Unit.INSTANCE;
            }
            default: {
                ((GraphicsLayerScope)object0).setClip(!this.x && ((Boolean)this.y.invoke()).booleanValue());
                return Unit.INSTANCE;
            }
        }
    }
}

