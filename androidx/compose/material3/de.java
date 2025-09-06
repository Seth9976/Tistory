package androidx.compose.material3;

import androidx.compose.material.BackdropScaffoldKt;
import androidx.compose.material.DrawerKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.c;

public final class de extends Lambda implements Function1 {
    public final int w;
    public final long x;
    public final State y;

    public de(long v, State state0, int v1) {
        this.w = v1;
        this.x = v;
        this.y = state0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        switch(this.w) {
            case 0: {
                float f1 = c.coerceIn(ModalBottomSheetKt.access$Scrim_3J_VO9M$lambda$10(this.y), 0.0f, 1.0f);
                DrawScope.drawRect-n-J9OG0$default(((DrawScope)object0), this.x, 0L, 0L, f1, null, null, 0, 0x76, null);
                return Unit.INSTANCE;
            }
            case 1: {
                float f2 = BackdropScaffoldKt.access$Scrim_3J_VO9M$lambda$4(this.y);
                DrawScope.drawRect-n-J9OG0$default(((DrawScope)object0), this.x, 0L, 0L, f2, null, null, 0, 0x76, null);
                return Unit.INSTANCE;
            }
            case 2: {
                float f3 = DrawerKt.access$BottomDrawerScrim_3J_VO9M$lambda$3(this.y);
                DrawScope.drawRect-n-J9OG0$default(((DrawScope)object0), this.x, 0L, 0L, f3, null, null, 0, 0x76, null);
                return Unit.INSTANCE;
            }
            default: {
                float f = androidx.compose.material.ModalBottomSheetKt.access$Scrim_3J_VO9M$lambda$1(this.y);
                DrawScope.drawRect-n-J9OG0$default(((DrawScope)object0), this.x, 0L, 0L, f, null, null, 0, 0x76, null);
                return Unit.INSTANCE;
            }
        }
    }
}

