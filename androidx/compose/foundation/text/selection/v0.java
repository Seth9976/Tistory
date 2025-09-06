package androidx.compose.foundation.text.selection;

import androidx.compose.animation.core.AnimationVector2D;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.text.input.TextFieldValue;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class v0 extends Lambda implements Function1 {
    public static final v0 A;
    public final int w;
    public static final v0 x;
    public static final v0 y;
    public static final v0 z;

    static {
        v0.x = new v0(1, 0);
        v0.y = new v0(1, 1);
        v0.z = new v0(1, 2);
        v0.A = new v0(1, 3);
    }

    public v0(int v, int v1) {
        this.w = v1;
        super(v);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        switch(this.w) {
            case 0: {
                long v = ((Offset)object0).unbox-impl();
                return OffsetKt.isSpecified-k-4lQ0M(v) ? new AnimationVector2D(Offset.getX-impl(v), Offset.getY-impl(v)) : SelectionMagnifierKt.a;
            }
            case 1: {
                return Offset.box-impl(OffsetKt.Offset(((AnimationVector2D)object0).getV1(), ((AnimationVector2D)object0).getV2()));
            }
            case 2: {
                return new SelectionRegistrarImpl(((Number)object0).longValue(), null);
            }
            default: {
                TextFieldValue textFieldValue0 = (TextFieldValue)object0;
                return Unit.INSTANCE;
            }
        }
    }
}

