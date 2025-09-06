package androidx.compose.material3;

import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

public final class ij extends Lambda implements Function2 {
    public final Shape A;
    public final SearchBarColors B;
    public final float C;
    public final float D;
    public final WindowInsets E;
    public final Function3 F;
    public final int G;
    public final int H;
    public final Function2 w;
    public final boolean x;
    public final Function1 y;
    public final Modifier z;

    public ij(Function2 function20, boolean z, Function1 function10, Modifier modifier0, Shape shape0, SearchBarColors searchBarColors0, float f, float f1, WindowInsets windowInsets0, Function3 function30, int v, int v1) {
        this.w = function20;
        this.x = z;
        this.y = function10;
        this.z = modifier0;
        this.A = shape0;
        this.B = searchBarColors0;
        this.C = f;
        this.D = f1;
        this.E = windowInsets0;
        this.F = function30;
        this.G = v;
        this.H = v1;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        SearchBar_androidKt.SearchBar-Y92LkZI(this.w, this.x, this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, ((Composer)object0), (this.G | 1) & -920350135 | ((0x24924924 & (this.G | 1)) >> 1 | 306783378 & (this.G | 1)) | (306783378 & (this.G | 1)) << 1 & (0x24924924 & (this.G | 1)), this.H);
        return Unit.INSTANCE;
    }
}

