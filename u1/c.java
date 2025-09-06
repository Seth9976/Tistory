package u1;

import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.GroupComponent;
import androidx.compose.ui.graphics.vector.PathComponent;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class c extends Lambda implements Function2 {
    public static final c A;
    public static final c B;
    public static final c C;
    public static final c D;
    public static final c E;
    public static final c F;
    public static final c G;
    public static final c H;
    public static final c I;
    public static final c J;
    public static final c K;
    public static final c L;
    public static final c M;
    public static final c N;
    public static final c O;
    public static final c P;
    public static final c Q;
    public static final c R;
    public static final c S;
    public static final c T;
    public final int w;
    public static final c x;
    public static final c y;
    public static final c z;

    static {
        c.x = new c(2, 0);
        c.y = new c(2, 1);
        c.z = new c(2, 2);
        c.A = new c(2, 3);
        c.B = new c(2, 4);
        c.C = new c(2, 5);
        c.D = new c(2, 6);
        c.E = new c(2, 7);
        c.F = new c(2, 8);
        c.G = new c(2, 9);
        c.H = new c(2, 10);
        c.I = new c(2, 11);
        c.J = new c(2, 12);
        c.K = new c(2, 13);
        c.L = new c(2, 14);
        c.M = new c(2, 15);
        c.N = new c(2, 16);
        c.O = new c(2, 17);
        c.P = new c(2, 18);
        c.Q = new c(2, 19);
        c.R = new c(2, 20);
        c.S = new c(2, 21);
        c.T = new c(2, 22);
    }

    public c(int v, int v1) {
        this.w = v1;
        super(v);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        switch(this.w) {
            case 0: {
                ((GroupComponent)object0).setName(((String)object1));
                return Unit.INSTANCE;
            }
            case 1: {
                ((GroupComponent)object0).setRotation(((Number)object1).floatValue());
                return Unit.INSTANCE;
            }
            case 2: {
                ((GroupComponent)object0).setPivotX(((Number)object1).floatValue());
                return Unit.INSTANCE;
            }
            case 3: {
                ((GroupComponent)object0).setPivotY(((Number)object1).floatValue());
                return Unit.INSTANCE;
            }
            case 4: {
                ((GroupComponent)object0).setScaleX(((Number)object1).floatValue());
                return Unit.INSTANCE;
            }
            case 5: {
                ((GroupComponent)object0).setScaleY(((Number)object1).floatValue());
                return Unit.INSTANCE;
            }
            case 6: {
                ((GroupComponent)object0).setTranslationX(((Number)object1).floatValue());
                return Unit.INSTANCE;
            }
            case 7: {
                ((GroupComponent)object0).setTranslationY(((Number)object1).floatValue());
                return Unit.INSTANCE;
            }
            case 8: {
                ((GroupComponent)object0).setClipPathData(((List)object1));
                return Unit.INSTANCE;
            }
            case 9: {
                ((PathComponent)object0).setStrokeLineCap-BeK7IIE(((StrokeCap)object1).unbox-impl());
                return Unit.INSTANCE;
            }
            case 10: {
                ((PathComponent)object0).setStrokeLineMiter(((Number)object1).floatValue());
                return Unit.INSTANCE;
            }
            case 11: {
                ((PathComponent)object0).setTrimPathStart(((Number)object1).floatValue());
                return Unit.INSTANCE;
            }
            case 12: {
                ((PathComponent)object0).setTrimPathEnd(((Number)object1).floatValue());
                return Unit.INSTANCE;
            }
            case 13: {
                ((PathComponent)object0).setTrimPathOffset(((Number)object1).floatValue());
                return Unit.INSTANCE;
            }
            case 14: {
                ((PathComponent)object0).setName(((String)object1));
                return Unit.INSTANCE;
            }
            case 15: {
                ((PathComponent)object0).setPathData(((List)object1));
                return Unit.INSTANCE;
            }
            case 16: {
                ((PathComponent)object0).setPathFillType-oQ8Xj4U(((PathFillType)object1).unbox-impl());
                return Unit.INSTANCE;
            }
            case 17: {
                ((PathComponent)object0).setFill(((Brush)object1));
                return Unit.INSTANCE;
            }
            case 18: {
                ((PathComponent)object0).setFillAlpha(((Number)object1).floatValue());
                return Unit.INSTANCE;
            }
            case 19: {
                ((PathComponent)object0).setStroke(((Brush)object1));
                return Unit.INSTANCE;
            }
            case 20: {
                ((PathComponent)object0).setStrokeAlpha(((Number)object1).floatValue());
                return Unit.INSTANCE;
            }
            case 21: {
                ((PathComponent)object0).setStrokeLineWidth(((Number)object1).floatValue());
                return Unit.INSTANCE;
            }
            default: {
                ((PathComponent)object0).setStrokeLineJoin-Ww9F2mQ(((StrokeJoin)object1).unbox-impl());
                return Unit.INSTANCE;
            }
        }
    }
}

