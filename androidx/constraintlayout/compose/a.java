package androidx.constraintlayout.compose;

import androidx.constraintlayout.core.state.ConstraintReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class a extends Lambda implements Function2 {
    public static final a A;
    public static final a B;
    public static final a C;
    public static final a D;
    public static final a E;
    public final int w;
    public static final a x;
    public static final a y;
    public static final a z;

    static {
        a.x = new a(2, 0);
        a.y = new a(2, 1);
        a.z = new a(2, 2);
        a.A = new a(2, 3);
        a.B = new a(2, 4);
        a.C = new a(2, 5);
        a.D = new a(2, 6);
        a.E = new a(2, 7);
    }

    public a(int v, int v1) {
        this.w = v1;
        super(v);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        switch(this.w) {
            case 0: {
                Intrinsics.checkNotNullParameter(((ConstraintReference)object0), "$this$null");
                Intrinsics.checkNotNullParameter(object1, "other");
                ((ConstraintReference)object0).topToTop(null);
                ((ConstraintReference)object0).topToBottom(null);
                ((ConstraintReference)object0).bottomToTop(null);
                ((ConstraintReference)object0).bottomToBottom(null);
                ConstraintReference constraintReference0 = ((ConstraintReference)object0).baselineToBaseline(object1);
                Intrinsics.checkNotNullExpressionValue(constraintReference0, "baselineToBaseline(other)");
                return constraintReference0;
            }
            case 1: {
                Intrinsics.checkNotNullParameter(((ConstraintReference)object0), "$this$arrayOf");
                Intrinsics.checkNotNullParameter(object1, "other");
                ((ConstraintReference)object0).topToBottom(null);
                ((ConstraintReference)object0).baselineToBaseline(null);
                ConstraintReference constraintReference1 = ((ConstraintReference)object0).topToTop(object1);
                Intrinsics.checkNotNullExpressionValue(constraintReference1, "topToTop(other)");
                return constraintReference1;
            }
            case 2: {
                Intrinsics.checkNotNullParameter(((ConstraintReference)object0), "$this$arrayOf");
                Intrinsics.checkNotNullParameter(object1, "other");
                ((ConstraintReference)object0).topToTop(null);
                ((ConstraintReference)object0).baselineToBaseline(null);
                ConstraintReference constraintReference2 = ((ConstraintReference)object0).topToBottom(object1);
                Intrinsics.checkNotNullExpressionValue(constraintReference2, "topToBottom(other)");
                return constraintReference2;
            }
            case 3: {
                Intrinsics.checkNotNullParameter(((ConstraintReference)object0), "$this$arrayOf");
                Intrinsics.checkNotNullParameter(object1, "other");
                ((ConstraintReference)object0).bottomToBottom(null);
                ((ConstraintReference)object0).baselineToBaseline(null);
                ConstraintReference constraintReference3 = ((ConstraintReference)object0).bottomToTop(object1);
                Intrinsics.checkNotNullExpressionValue(constraintReference3, "bottomToTop(other)");
                return constraintReference3;
            }
            case 4: {
                Intrinsics.checkNotNullParameter(((ConstraintReference)object0), "$this$arrayOf");
                Intrinsics.checkNotNullParameter(object1, "other");
                ((ConstraintReference)object0).bottomToTop(null);
                ((ConstraintReference)object0).baselineToBaseline(null);
                ConstraintReference constraintReference4 = ((ConstraintReference)object0).bottomToBottom(object1);
                Intrinsics.checkNotNullExpressionValue(constraintReference4, "bottomToBottom(other)");
                return constraintReference4;
            }
            case 5: {
                Intrinsics.checkNotNullParameter(((ConstraintReference)object0), "$this$addFloatTransformFromDp");
                ((ConstraintReference)object0).translationX(((Number)object1).floatValue());
                return Unit.INSTANCE;
            }
            case 6: {
                Intrinsics.checkNotNullParameter(((ConstraintReference)object0), "$this$addFloatTransformFromDp");
                ((ConstraintReference)object0).translationY(((Number)object1).floatValue());
                return Unit.INSTANCE;
            }
            default: {
                Intrinsics.checkNotNullParameter(((ConstraintReference)object0), "$this$addFloatTransformFromDp");
                ((ConstraintReference)object0).translationZ(((Number)object1).floatValue());
                return Unit.INSTANCE;
            }
        }
    }
}

