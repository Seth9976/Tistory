package u0;

import androidx.compose.material.ripple.AndroidRippleNode;
import androidx.compose.ui.node.DrawModifierNodeKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class a extends Lambda implements Function0 {
    public final AndroidRippleNode w;

    public a(AndroidRippleNode androidRippleNode0) {
        this.w = androidRippleNode0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        DrawModifierNodeKt.invalidateDraw(this.w);
        return Unit.INSTANCE;
    }
}

