package u;

import androidx.compose.foundation.MagnifierNode;
import androidx.compose.ui.geometry.Offset;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class k2 extends Lambda implements Function0 {
    public final int w;
    public final MagnifierNode x;

    public k2(MagnifierNode magnifierNode0, int v) {
        this.w = v;
        this.x = magnifierNode0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        if(this.w != 0) {
            this.x.d();
            return Unit.INSTANCE;
        }
        return Offset.box-impl(this.x.C);
    }
}

