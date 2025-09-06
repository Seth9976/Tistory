package s;

import androidx.compose.animation.core.AnimationVector2D;
import androidx.compose.animation.core.AnimationVector4D;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.TransformOrigin;
import androidx.compose.ui.graphics.TransformOriginKt;
import androidx.compose.ui.graphics.colorspace.ColorSpace;
import androidx.compose.ui.graphics.colorspace.ColorSpaces;
import androidx.compose.ui.unit.IntSize;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import m0.b0;

public final class s extends Lambda implements Function1 {
    public static final s A;
    public static final s B;
    public static final s C;
    public static final s D;
    public static final s E;
    public static final s F;
    public static final s G;
    public static final s H;
    public static final s I;
    public static final s J;
    public static final s K;
    public static final s L;
    public static final s M;
    public static final s N;
    public static final s O;
    public final int w;
    public static final s x;
    public static final s y;
    public static final s z;

    static {
        s.x = new s(1, 0);
        s.y = new s(1, 1);
        s.z = new s(1, 2);
        s.A = new s(1, 3);
        s.B = new s(1, 4);
        s.C = new s(1, 5);
        s.D = new s(1, 6);
        s.E = new s(1, 7);
        s.F = new s(1, 8);
        s.G = new s(1, 9);
        s.H = new s(1, 10);
        s.I = new s(1, 11);
        s.J = new s(1, 12);
        s.K = new s(1, 13);
        s.L = new s(1, 14);
        s.M = new s(1, 15);
        s.N = new s(1, 16);
        s.O = new s(1, 17);
    }

    public s(int v, int v1) {
        this.w = v1;
        super(v);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        switch(this.w) {
            case 0: {
                ((Boolean)object0).booleanValue();
                return (Boolean)object0;
            }
            case 1: {
                ((Boolean)object0).booleanValue();
                return (Boolean)object0;
            }
            case 2: {
                ((Boolean)object0).booleanValue();
                return (Boolean)object0;
            }
            case 3: {
                ((Boolean)object0).booleanValue();
                return (Boolean)object0;
            }
            case 4: {
                ((Boolean)object0).booleanValue();
                return (Boolean)object0;
            }
            case 5: {
                ((Boolean)object0).booleanValue();
                return (Boolean)object0;
            }
            case 6: {
                return IntSize.box-impl(0L);
            }
            case 7: {
                long v = Color.convert-vNxB06k(((Color)object0).unbox-impl(), ColorSpaces.INSTANCE.getOklab());
                return new AnimationVector4D(Color.getAlpha-impl(v), Color.getRed-impl(v), Color.getGreen-impl(v), Color.getBlue-impl(v));
            }
            case 8: {
                b0 b00 = new b0(((ColorSpace)object0), 28);
                return VectorConvertersKt.TwoWayConverter(s.E, b00);
            }
            case 9: {
                long v1 = ((TransformOrigin)object0).unbox-impl();
                return new AnimationVector2D(TransformOrigin.getPivotFractionX-impl(v1), TransformOrigin.getPivotFractionY-impl(v1));
            }
            case 10: {
                return TransformOrigin.box-impl(TransformOriginKt.TransformOrigin(((AnimationVector2D)object0).getV1(), ((AnimationVector2D)object0).getV2()));
            }
            case 11: {
                return IntSize.box-impl(0L);
            }
            case 12: {
                return IntSize.box-impl(0L);
            }
            case 13: {
                return (int)(-((Number)object0).intValue() / 2);
            }
            case 14: {
                return (int)(-((Number)object0).intValue() / 2);
            }
            case 15: {
                return (int)(-((Number)object0).intValue() / 2);
            }
            case 16: {
                return (int)(-((Number)object0).intValue() / 2);
            }
            default: {
                ((Function0)object0).invoke();
                return Unit.INSTANCE;
            }
        }
    }
}

