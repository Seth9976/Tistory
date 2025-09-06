package androidx.constraintlayout.compose;

import androidx.compose.ui.unit.LayoutDirection;
import androidx.constraintlayout.core.state.ConstraintReference;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class b extends Lambda implements Function3 {
    public static final b A;
    public final int w;
    public static final b x;
    public static final b y;
    public static final b z;

    static {
        b.x = new b(3, 0);
        b.y = new b(3, 1);
        b.z = new b(3, 2);
        b.A = new b(3, 3);
    }

    public b(int v, int v1) {
        this.w = v1;
        super(v);
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object invoke(Object object0, Object object1, Object object2) {
        switch(this.w) {
            case 0: {
                Intrinsics.checkNotNullParameter(((ConstraintReference)object0), "$this$arrayOf");
                Intrinsics.checkNotNullParameter(object1, "other");
                Intrinsics.checkNotNullParameter(((LayoutDirection)object2), "layoutDirection");
                AnchorFunctions.access$clearLeft(AnchorFunctions.INSTANCE, ((ConstraintReference)object0), ((LayoutDirection)object2));
                ConstraintReference constraintReference1 = ((ConstraintReference)object0).leftToLeft(object1);
                Intrinsics.checkNotNullExpressionValue(constraintReference1, "leftToLeft(other)");
                return constraintReference1;
            }
            case 1: {
                Intrinsics.checkNotNullParameter(((ConstraintReference)object0), "$this$arrayOf");
                Intrinsics.checkNotNullParameter(object1, "other");
                Intrinsics.checkNotNullParameter(((LayoutDirection)object2), "layoutDirection");
                AnchorFunctions.access$clearLeft(AnchorFunctions.INSTANCE, ((ConstraintReference)object0), ((LayoutDirection)object2));
                ConstraintReference constraintReference2 = ((ConstraintReference)object0).leftToRight(object1);
                Intrinsics.checkNotNullExpressionValue(constraintReference2, "leftToRight(other)");
                return constraintReference2;
            }
            case 2: {
                Intrinsics.checkNotNullParameter(((ConstraintReference)object0), "$this$arrayOf");
                Intrinsics.checkNotNullParameter(object1, "other");
                Intrinsics.checkNotNullParameter(((LayoutDirection)object2), "layoutDirection");
                AnchorFunctions.access$clearRight(AnchorFunctions.INSTANCE, ((ConstraintReference)object0), ((LayoutDirection)object2));
                ConstraintReference constraintReference3 = ((ConstraintReference)object0).rightToLeft(object1);
                Intrinsics.checkNotNullExpressionValue(constraintReference3, "rightToLeft(other)");
                return constraintReference3;
            }
            default: {
                Intrinsics.checkNotNullParameter(((ConstraintReference)object0), "$this$arrayOf");
                Intrinsics.checkNotNullParameter(object1, "other");
                Intrinsics.checkNotNullParameter(((LayoutDirection)object2), "layoutDirection");
                AnchorFunctions.access$clearRight(AnchorFunctions.INSTANCE, ((ConstraintReference)object0), ((LayoutDirection)object2));
                ConstraintReference constraintReference0 = ((ConstraintReference)object0).rightToRight(object1);
                Intrinsics.checkNotNullExpressionValue(constraintReference0, "rightToRight(other)");
                return constraintReference0;
            }
        }
    }
}

