package p0;

import androidx.compose.material.ColorsKt;
import androidx.compose.material.Shapes;
import androidx.compose.material.Typography;
import androidx.compose.material.TypographyKt;
import androidx.compose.ui.unit.Dp;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class o2 extends Lambda implements Function0 {
    public static final o2 A;
    public static final o2 B;
    public static final o2 C;
    public static final o2 D;
    public static final o2 E;
    public static final o2 F;
    public final int w;
    public static final o2 x;
    public static final o2 y;
    public static final o2 z;

    static {
        o2.x = new o2(0, 0);
        o2.y = new o2(0, 1);
        o2.z = new o2(0, 2);
        o2.A = new o2(0, 3);
        o2.B = new o2(0, 4);
        o2.C = new o2(0, 5);
        o2.D = new o2(0, 6);
        o2.E = new o2(0, 7);
        o2.F = new o2(0, 8);
    }

    public o2(int v, int v1) {
        this.w = v1;
        super(v);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch(this.w) {
            case 0: {
                return ColorsKt.lightColors-2qZNXz8$default(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0xFFF, null);
            }
            case 1: {
                return 1.0f;
            }
            case 2: {
                return Dp.box-impl(0.0f);
            }
            case 3: {
                return z2.a;
            }
            case 4: {
                return true;
            }
            case 5: {
                return null;
            }
            case 6: {
                return new Shapes(null, null, null, 7, null);
            }
            case 7: {
                return TypographyKt.getDefaultTextStyle();
            }
            default: {
                return new Typography(null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0x3FFF, null);
            }
        }
    }
}

