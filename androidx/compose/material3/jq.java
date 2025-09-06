package androidx.compose.material3;

import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class jq extends Lambda implements Function1 {
    public static final jq A;
    public final int w;
    public static final jq x;
    public static final jq y;
    public static final jq z;

    static {
        jq.x = new jq(1, 0);
        jq.y = new jq(1, 1);
        jq.z = new jq(1, 2);
        jq.A = new jq(1, 3);
    }

    public jq(int v, int v1) {
        this.w = v1;
        super(v);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        switch(this.w) {
            case 0: {
                SemanticsPropertyReceiver semanticsPropertyReceiver0 = (SemanticsPropertyReceiver)object0;
                return Unit.INSTANCE;
            }
            case 1: {
                SemanticsPropertiesKt.setTraversalGroup(((SemanticsPropertyReceiver)object0), true);
                return Unit.INSTANCE;
            }
            case 2: {
                Object object1 = ((List)object0).get(0);
                Intrinsics.checkNotNull(object1, "null cannot be cast to non-null type kotlin.Int");
                Object object2 = ((List)object0).get(1);
                Intrinsics.checkNotNull(object2, "null cannot be cast to non-null type kotlin.Int");
                Object object3 = ((List)object0).get(2);
                Intrinsics.checkNotNull(object3, "null cannot be cast to non-null type kotlin.Boolean");
                return new vq(((int)(((Integer)object1))), ((int)(((Integer)object2))), ((Boolean)object3).booleanValue());
            }
            default: {
                return new TopAppBarState(((Number)((List)object0).get(0)).floatValue(), ((Number)((List)object0).get(1)).floatValue(), ((Number)((List)object0).get(2)).floatValue());
            }
        }
    }
}

