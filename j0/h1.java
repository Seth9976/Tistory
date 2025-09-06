package j0;

import androidx.compose.foundation.contextmenu.ContextMenuState;
import androidx.compose.foundation.contextmenu.ContextMenuState_androidKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class h1 extends Lambda implements Function0 {
    public final int w;
    public final ContextMenuState x;

    public h1(ContextMenuState contextMenuState0, int v) {
        this.w = v;
        this.x = contextMenuState0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch(this.w) {
            case 0: {
                ContextMenuState_androidKt.close(this.x);
                return Unit.INSTANCE;
            }
            case 1: {
                ContextMenuState_androidKt.close(this.x);
                return Unit.INSTANCE;
            }
            default: {
                ContextMenuState_androidKt.close(this.x);
                return Unit.INSTANCE;
            }
        }
    }
}

