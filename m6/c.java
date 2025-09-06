package m6;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import com.google.accompanist.flowlayout.FlowCrossAxisAlignment;
import com.google.accompanist.flowlayout.FlowKt;
import com.google.accompanist.flowlayout.LayoutOrientation;
import com.google.accompanist.flowlayout.MainAxisAlignment;
import com.google.accompanist.flowlayout.SizeMode;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class c extends Lambda implements Function2 {
    public final float A;
    public final FlowCrossAxisAlignment B;
    public final float C;
    public final MainAxisAlignment D;
    public final Function2 E;
    public final int F;
    public final Modifier w;
    public final LayoutOrientation x;
    public final SizeMode y;
    public final MainAxisAlignment z;

    public c(Modifier modifier0, LayoutOrientation layoutOrientation0, SizeMode sizeMode0, MainAxisAlignment mainAxisAlignment0, float f, FlowCrossAxisAlignment flowCrossAxisAlignment0, float f1, MainAxisAlignment mainAxisAlignment1, Function2 function20, int v) {
        this.w = modifier0;
        this.x = layoutOrientation0;
        this.y = sizeMode0;
        this.z = mainAxisAlignment0;
        this.A = f;
        this.B = flowCrossAxisAlignment0;
        this.C = f1;
        this.D = mainAxisAlignment1;
        this.E = function20;
        this.F = v;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        FlowKt.a(this.w, this.x, this.y, this.z, this.A, this.B, this.C, this.D, this.E, ((Composer)object0), (this.F | 1) & -920350135 | ((0x24924924 & (this.F | 1)) >> 1 | 306783378 & (this.F | 1)) | (306783378 & (this.F | 1)) << 1 & (0x24924924 & (this.F | 1)));
        return Unit.INSTANCE;
    }
}

