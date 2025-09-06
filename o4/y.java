package o4;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.navigation.NavGraph;
import androidx.navigation.NavHostController;
import androidx.navigation.compose.NavHostKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class y extends Lambda implements Function2 {
    public final Alignment A;
    public final Function1 B;
    public final Function1 C;
    public final Function1 D;
    public final Function1 E;
    public final Function1 F;
    public final int G;
    public final int H;
    public final int w;
    public final NavHostController x;
    public final NavGraph y;
    public final Modifier z;

    public y(NavHostController navHostController0, NavGraph navGraph0, Modifier modifier0, Alignment alignment0, Function1 function10, Function1 function11, Function1 function12, Function1 function13, Function1 function14, int v, int v1, int v2) {
        this.w = v2;
        this.x = navHostController0;
        this.y = navGraph0;
        this.z = modifier0;
        this.A = alignment0;
        this.B = function10;
        this.C = function11;
        this.D = function12;
        this.E = function13;
        this.F = function14;
        this.G = v;
        this.H = v1;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        switch(this.w) {
            case 0: {
                ((Number)object1).intValue();
                NavHostKt.NavHost(this.x, this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, ((Composer)object0), (this.G | 1) & -920350135 | ((0x24924924 & (this.G | 1)) >> 1 | 306783378 & (this.G | 1)) | (306783378 & (this.G | 1)) << 1 & (0x24924924 & (this.G | 1)), this.H);
                return Unit.INSTANCE;
            }
            case 1: {
                ((Number)object1).intValue();
                NavHostKt.NavHost(this.x, this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, ((Composer)object0), (this.G | 1) & -920350135 | ((0x24924924 & (this.G | 1)) >> 1 | 306783378 & (this.G | 1)) | (306783378 & (this.G | 1)) << 1 & (0x24924924 & (this.G | 1)), this.H);
                return Unit.INSTANCE;
            }
            default: {
                ((Number)object1).intValue();
                NavHostKt.NavHost(this.x, this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, ((Composer)object0), (this.G | 1) & -920350135 | ((0x24924924 & (this.G | 1)) >> 1 | 306783378 & (this.G | 1)) | (306783378 & (this.G | 1)) << 1 & (0x24924924 & (this.G | 1)), this.H);
                return Unit.INSTANCE;
            }
        }
    }
}

