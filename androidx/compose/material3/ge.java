package androidx.compose.material3;

import a4.c;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class ge extends Lambda implements Function1 {
    public final int w;
    public final String x;
    public final Function0 y;

    public ge(String s, Function0 function00, int v) {
        this.w = v;
        this.x = s;
        this.y = function00;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        switch(this.w) {
            case 0: {
                SemanticsPropertiesKt.setTraversalIndex(((SemanticsPropertyReceiver)object0), 1.0f);
                SemanticsPropertiesKt.setContentDescription(((SemanticsPropertyReceiver)object0), this.x);
                SemanticsPropertiesKt.onClick$default(((SemanticsPropertyReceiver)object0), null, new c(this.y, 2), 1, null);
                return Unit.INSTANCE;
            }
            case 1: {
                SemanticsPropertiesKt.setContentDescription(((SemanticsPropertyReceiver)object0), this.x);
                SemanticsPropertiesKt.onClick$default(((SemanticsPropertyReceiver)object0), null, new c(this.y, 3), 1, null);
                return Unit.INSTANCE;
            }
            case 2: {
                SemanticsPropertiesKt.setContentDescription(((SemanticsPropertyReceiver)object0), this.x);
                SemanticsPropertiesKt.onClick$default(((SemanticsPropertyReceiver)object0), null, new c(this.y, 10), 1, null);
                return Unit.INSTANCE;
            }
            case 3: {
                SemanticsPropertiesKt.setContentDescription(((SemanticsPropertyReceiver)object0), this.x);
                SemanticsPropertiesKt.onClick$default(((SemanticsPropertyReceiver)object0), null, new c(this.y, 11), 1, null);
                return Unit.INSTANCE;
            }
            case 4: {
                SemanticsPropertiesKt.setContentDescription(((SemanticsPropertyReceiver)object0), this.x);
                SemanticsPropertiesKt.onClick$default(((SemanticsPropertyReceiver)object0), null, new c(this.y, 12), 1, null);
                return Unit.INSTANCE;
            }
            default: {
                SemanticsPropertiesKt.setContentDescription(((SemanticsPropertyReceiver)object0), this.x);
                SemanticsPropertiesKt.onClick$default(((SemanticsPropertyReceiver)object0), null, new c(this.y, 13), 1, null);
                return Unit.INSTANCE;
            }
        }
    }
}

