package androidx.compose.material3;

import androidx.compose.foundation.text.input.TextFieldState;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.ShaderBrush;
import androidx.compose.ui.node.LayoutNodeLayoutDelegate;
import androidx.compose.ui.node.LookaheadDelegate;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class p6 extends Lambda implements Function0 {
    public final int w;
    public final long x;
    public final Object y;

    public p6(int v, long v1, Object object0) {
        this.w = v;
        this.y = object0;
        this.x = v1;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch(this.w) {
            case 0: {
                ((Function1)this.y).invoke(this.x);
                return Unit.INSTANCE;
            }
            case 1: {
                LookaheadDelegate lookaheadDelegate0 = ((LayoutNodeLayoutDelegate)this.y).getOuterCoordinator().getLookaheadDelegate();
                Intrinsics.checkNotNull(lookaheadDelegate0);
                lookaheadDelegate0.measure-BRTryo0(this.x);
                return Unit.INSTANCE;
            }
            case 2: {
                return ((ShaderBrush)(((Brush)this.y))).createShader-uvyYCjk(this.x);
            }
            default: {
                return new TextFieldState(((String)this.y), this.x, null);
            }
        }
    }
}

