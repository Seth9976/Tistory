package t;

import androidx.compose.animation.core.AnimationScope;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.AnimationVector2D;
import androidx.compose.animation.core.AnimationVector4D;
import androidx.compose.animation.core.AnimationVector;
import androidx.compose.animation.core.SeekableTransitionState;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.DpKt;
import androidx.compose.ui.unit.DpOffset;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.c;

public final class g extends Lambda implements Function1 {
    public static final g A;
    public static final g B;
    public static final g C;
    public static final g D;
    public static final g E;
    public static final g F;
    public static final g G;
    public static final g H;
    public static final g I;
    public static final g J;
    public static final g K;
    public static final g L;
    public static final g M;
    public static final g N;
    public static final g O;
    public static final g P;
    public static final g Q;
    public static final g R;
    public static final g S;
    public static final g T;
    public static final g U;
    public static final g V;
    public final int w;
    public static final g x;
    public static final g y;
    public static final g z;

    static {
        g.x = new g(1, 0);
        g.y = new g(1, 1);
        g.z = new g(1, 2);
        g.A = new g(1, 3);
        g.B = new g(1, 4);
        g.C = new g(1, 5);
        g.D = new g(1, 6);
        g.E = new g(1, 7);
        g.F = new g(1, 8);
        g.G = new g(1, 9);
        g.H = new g(1, 10);
        g.I = new g(1, 11);
        g.J = new g(1, 12);
        g.K = new g(1, 13);
        g.L = new g(1, 14);
        g.M = new g(1, 15);
        g.N = new g(1, 16);
        g.O = new g(1, 17);
        g.P = new g(1, 18);
        g.Q = new g(1, 19);
        g.R = new g(1, 20);
        g.S = new g(1, 21);
        g.T = new g(1, 22);
        g.U = new g(1, 23);
        g.V = new g(1, 24);
    }

    public g(int v, int v1) {
        this.w = v1;
        super(v);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        switch(this.w) {
            case 0: {
                return (AnimationVector)object0;
            }
            case 1: {
                return (AnimationVector)object0;
            }
            case 2: {
                AnimationScope animationScope0 = (AnimationScope)object0;
                return Unit.INSTANCE;
            }
            case 3: {
                AnimationScope animationScope1 = (AnimationScope)object0;
                return Unit.INSTANCE;
            }
            case 4: {
                AnimationScope animationScope2 = (AnimationScope)object0;
                return Unit.INSTANCE;
            }
            case 5: {
                ((Function0)object0).invoke();
                return Unit.INSTANCE;
            }
            case 6: {
                ((SeekableTransitionState)object0).onTotalDurationChanged$animation_core_release();
                return Unit.INSTANCE;
            }
            case 7: {
                long v = ((DpOffset)object0).unbox-impl();
                return new AnimationVector2D(DpOffset.getX-D9Ej5fM(v), DpOffset.getY-D9Ej5fM(v));
            }
            case 8: {
                return DpOffset.box-impl(DpKt.DpOffset-YgX7TsA(Dp.constructor-impl(((AnimationVector2D)object0).getV1()), Dp.constructor-impl(((AnimationVector2D)object0).getV2())));
            }
            case 9: {
                return new AnimationVector1D(((Dp)object0).unbox-impl());
            }
            case 10: {
                return Dp.box-impl(Dp.constructor-impl(((AnimationVector1D)object0).getValue()));
            }
            case 11: {
                return new AnimationVector1D(((Number)object0).floatValue());
            }
            case 12: {
                return ((AnimationVector1D)object0).getValue();
            }
            case 13: {
                long v1 = ((IntOffset)object0).unbox-impl();
                return new AnimationVector2D(((float)IntOffset.getX-impl(v1)), ((float)IntOffset.getY-impl(v1)));
            }
            case 14: {
                return IntOffset.box-impl(IntOffsetKt.IntOffset(Math.round(((AnimationVector2D)object0).getV1()), Math.round(((AnimationVector2D)object0).getV2())));
            }
            case 15: {
                long v2 = ((IntSize)object0).unbox-impl();
                return new AnimationVector2D(((float)IntSize.getWidth-impl(v2)), ((float)IntSize.getHeight-impl(v2)));
            }
            case 16: {
                return IntSize.box-impl(IntSizeKt.IntSize(c.coerceAtLeast(Math.round(((AnimationVector2D)object0).getV1()), 0), c.coerceAtLeast(Math.round(((AnimationVector2D)object0).getV2()), 0)));
            }
            case 17: {
                return new AnimationVector1D(((float)((Number)object0).intValue()));
            }
            case 18: {
                return (int)((AnimationVector1D)object0).getValue();
            }
            case 19: {
                long v3 = ((Offset)object0).unbox-impl();
                return new AnimationVector2D(Offset.getX-impl(v3), Offset.getY-impl(v3));
            }
            case 20: {
                return Offset.box-impl(OffsetKt.Offset(((AnimationVector2D)object0).getV1(), ((AnimationVector2D)object0).getV2()));
            }
            case 21: {
                return new AnimationVector4D(((Rect)object0).getLeft(), ((Rect)object0).getTop(), ((Rect)object0).getRight(), ((Rect)object0).getBottom());
            }
            case 22: {
                return new Rect(((AnimationVector4D)object0).getV1(), ((AnimationVector4D)object0).getV2(), ((AnimationVector4D)object0).getV3(), ((AnimationVector4D)object0).getV4());
            }
            case 23: {
                long v4 = ((Size)object0).unbox-impl();
                return new AnimationVector2D(Size.getWidth-impl(v4), Size.getHeight-impl(v4));
            }
            default: {
                return Size.box-impl(SizeKt.Size(((AnimationVector2D)object0).getV1(), ((AnimationVector2D)object0).getV2()));
            }
        }
    }
}

