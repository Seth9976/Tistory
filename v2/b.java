package v2;

import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.window.PopupLayout;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class b extends Lambda implements Function1 {
    public static final b A;
    public final int w;
    public static final b x;
    public static final b y;
    public static final b z;

    static {
        b.x = new b(1, 0);
        b.y = new b(1, 1);
        b.z = new b(1, 2);
        b.A = new b(1, 3);
    }

    public b(int v, int v1) {
        this.w = v1;
        super(v);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        switch(this.w) {
            case 0: {
                SemanticsPropertiesKt.dialog(((SemanticsPropertyReceiver)object0));
                return Unit.INSTANCE;
            }
            case 1: {
                ((Number)object0).longValue();
                return Unit.INSTANCE;
            }
            case 2: {
                SemanticsPropertiesKt.popup(((SemanticsPropertyReceiver)object0));
                return Unit.INSTANCE;
            }
            default: {
                if(((PopupLayout)object0).isAttachedToWindow()) {
                    ((PopupLayout)object0).updatePosition();
                }
                return Unit.INSTANCE;
            }
        }
    }
}

