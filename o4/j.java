package o4;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.navigation.NavHostController;
import androidx.navigation.compose.NavHostKt;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.KClass;

public final class j extends Lambda implements Function2 {
    public final KClass A;
    public final Map B;
    public final Function1 C;
    public final Function1 D;
    public final Function1 E;
    public final Function1 F;
    public final Function1 G;
    public final Function1 H;
    public final int I;
    public final int J;
    public final int K;
    public final Object L;
    public final int w;
    public final NavHostController x;
    public final Modifier y;
    public final Alignment z;

    public j(NavHostController navHostController0, Object object0, Modifier modifier0, Alignment alignment0, KClass kClass0, Map map0, Function1 function10, Function1 function11, Function1 function12, Function1 function13, Function1 function14, Function1 function15, int v, int v1, int v2) {
        this.w = 1;
        this.x = navHostController0;
        this.L = object0;
        this.y = modifier0;
        this.z = alignment0;
        this.A = kClass0;
        this.B = map0;
        this.C = function10;
        this.D = function11;
        this.E = function12;
        this.F = function13;
        this.G = function14;
        this.H = function15;
        this.I = v;
        this.J = v1;
        this.K = v2;
        super(2);
    }

    public j(NavHostController navHostController0, KClass kClass0, Modifier modifier0, Alignment alignment0, KClass kClass1, Map map0, Function1 function10, Function1 function11, Function1 function12, Function1 function13, Function1 function14, Function1 function15, int v, int v1, int v2) {
        this.w = 0;
        this.x = navHostController0;
        this.A = kClass0;
        this.y = modifier0;
        this.z = alignment0;
        this.L = kClass1;
        this.B = map0;
        this.C = function10;
        this.D = function11;
        this.E = function12;
        this.F = function13;
        this.G = function14;
        this.H = function15;
        this.I = v;
        this.J = v1;
        this.K = v2;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        if(this.w != 0) {
            ((Number)object1).intValue();
            NavHostKt.NavHost(this.x, this.L, this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, this.H, ((Composer)object0), (this.I | 1) & -920350135 | ((0x24924924 & (this.I | 1)) >> 1 | 306783378 & (this.I | 1)) | (306783378 & (this.I | 1)) << 1 & (0x24924924 & (this.I | 1)), this.J & -920350135 | ((0x24924924 & this.J) >> 1 | 306783378 & this.J) | (306783378 & this.J) << 1 & (0x24924924 & this.J), this.K);
            return Unit.INSTANCE;
        }
        ((Number)object1).intValue();
        NavHostKt.NavHost(this.x, this.A, this.y, this.z, ((KClass)this.L), this.B, this.C, this.D, this.E, this.F, this.G, this.H, ((Composer)object0), (this.I | 1) & -920350135 | ((0x24924924 & (this.I | 1)) >> 1 | 306783378 & (this.I | 1)) | (306783378 & (this.I | 1)) << 1 & (0x24924924 & (this.I | 1)), this.J & -920350135 | ((0x24924924 & this.J) >> 1 | 306783378 & this.J) | (306783378 & this.J) << 1 & (0x24924924 & this.J), this.K);
        return Unit.INSTANCE;
    }
}

