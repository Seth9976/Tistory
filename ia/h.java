package ia;

import androidx.compose.foundation.ScrollState;
import androidx.compose.runtime.Composer;
import com.kakao.kandinsky.home.HomeScreenKt;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class h extends Lambda implements Function2 {
    public final Function0 A;
    public final Function0 B;
    public final Function1 C;
    public final Function0 D;
    public final Function1 E;
    public final int F;
    public final int G;
    public final ScrollState w;
    public final int x;
    public final int y;
    public final List z;

    public h(ScrollState scrollState0, int v, int v1, List list0, Function0 function00, Function0 function01, Function1 function10, Function0 function02, Function1 function11, int v2, int v3) {
        this.w = scrollState0;
        this.x = v;
        this.y = v1;
        this.z = list0;
        this.A = function00;
        this.B = function01;
        this.C = function10;
        this.D = function02;
        this.E = function11;
        this.F = v2;
        this.G = v3;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        HomeScreenKt.HomeScreen(this.w, this.x, this.y, this.z, this.A, this.B, this.C, this.D, this.E, ((Composer)object0), (this.F | 1) & -920350135 | ((0x24924924 & (this.F | 1)) >> 1 | 306783378 & (this.F | 1)) | (306783378 & (this.F | 1)) << 1 & (0x24924924 & (this.F | 1)), this.G);
        return Unit.INSTANCE;
    }
}

