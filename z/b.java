package z;

import androidx.compose.ui.input.pointer.PointerInputChange;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class b extends Lambda implements Function1 {
    public static final b A;
    public static final b B;
    public static final b C;
    public static final b D;
    public static final b E;
    public static final b F;
    public static final b G;
    public static final b H;
    public static final b I;
    public static final b J;
    public static final b K;
    public final int w;
    public static final b x;
    public static final b y;
    public static final b z;

    static {
        b.x = new b(1, 0);
        b.y = new b(1, 1);
        b.z = new b(1, 2);
        b.A = new b(1, 3);
        b.B = new b(1, 4);
        b.C = new b(1, 5);
        b.D = new b(1, 6);
        b.E = new b(1, 7);
        b.F = new b(1, 8);
        b.G = new b(1, 9);
        b.H = new b(1, 10);
        b.I = new b(1, 11);
        b.J = new b(1, 12);
        b.K = new b(1, 13);
    }

    public b(int v, int v1) {
        this.w = v1;
        super(v);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        switch(this.w) {
            case 0: {
                PointerInputChange pointerInputChange0 = (PointerInputChange)object0;
                return true;
            }
            case 1: {
                return true;
            }
            case 2: {
                return true;
            }
            case 3: {
                return Unit.INSTANCE;
            }
            case 4: {
                return Unit.INSTANCE;
            }
            case 5: {
                return Unit.INSTANCE;
            }
            case 6: {
                return Unit.INSTANCE;
            }
            case 7: {
                PointerInputChange pointerInputChange1 = (PointerInputChange)object0;
                return true;
            }
            case 8: {
                PointerInputChange pointerInputChange2 = (PointerInputChange)object0;
                return true;
            }
            case 9: {
                return Unit.INSTANCE;
            }
            case 10: {
                return Unit.INSTANCE;
            }
            case 11: {
                PointerInputChange pointerInputChange3 = (PointerInputChange)object0;
                return true;
            }
            case 12: {
                ((Number)object0).floatValue();
                return Unit.INSTANCE;
            }
            default: {
                return true;
            }
        }
    }
}

