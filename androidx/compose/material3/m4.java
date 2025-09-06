package androidx.compose.material3;

import androidx.compose.material3.tokens.TypographyTokensKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.ui.unit.Dp;
import java.util.UUID;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class m4 extends Lambda implements Function0 {
    public static final m4 A;
    public static final m4 B;
    public static final m4 C;
    public static final m4 D;
    public static final m4 E;
    public static final m4 F;
    public static final m4 G;
    public static final m4 H;
    public static final m4 I;
    public static final m4 J;
    public static final m4 K;
    public static final m4 L;
    public static final m4 M;
    public static final m4 N;
    public static final m4 O;
    public static final m4 P;
    public static final m4 Q;
    public final int w;
    public static final m4 x;
    public static final m4 y;
    public static final m4 z;

    static {
        m4.x = new m4(0, 0);
        m4.y = new m4(0, 1);
        m4.z = new m4(0, 2);
        m4.A = new m4(0, 3);
        m4.B = new m4(0, 4);
        m4.C = new m4(0, 5);
        m4.D = new m4(0, 6);
        m4.E = new m4(0, 7);
        m4.F = new m4(0, 8);
        m4.G = new m4(0, 9);
        m4.H = new m4(0, 10);
        m4.I = new m4(0, 11);
        m4.J = new m4(0, 12);
        m4.K = new m4(0, 13);
        m4.L = new m4(0, 14);
        m4.M = new m4(0, 15);
        m4.N = new m4(0, 16);
        m4.O = new m4(0, 17);
        m4.P = new m4(0, 18);
        m4.Q = new m4(0, 19);
    }

    public m4(int v, int v1) {
        this.w = v1;
        super(v);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch(this.w) {
            case 0: {
                return ColorSchemeKt.lightColorScheme-C-Xl9yA$default(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, -1, 15, null);
            }
            case 1: {
                return true;
            }
            case 2: {
                return SnapshotStateKt.mutableStateOf$default("", null, 2, null);
            }
            case 3: {
                return SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
            }
            case 4: {
                return 0.0f;
            }
            case 5: {
                return 0.0f;
            }
            case 6: {
                return 0.0f;
            }
            case 7: {
                return 0.0f;
            }
            case 8: {
                return 0.0f;
            }
            case 9: {
                return 0.0f;
            }
            case 10: {
                return true;
            }
            case 11: {
                return Dp.box-impl(48.0f);
            }
            case 12: {
                return false;
            }
            case 13: {
                return UUID.randomUUID();
            }
            case 14: {
                return new RippleConfiguration(0L, null, 3, null);
            }
            case 15: {
                return false;
            }
            case 16: {
                return new Shapes(null, null, null, null, null, 0x1F, null);
            }
            case 17: {
                return Dp.box-impl(0.0f);
            }
            case 18: {
                return TypographyTokensKt.getDefaultTextStyle();
            }
            default: {
                return new Typography(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0x7FFF, null);
            }
        }
    }
}

