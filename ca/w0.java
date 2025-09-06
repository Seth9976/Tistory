package ca;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import com.kakao.kandinsky.designsystem.common.ItemSliderKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Lambda;

public final class w0 extends Lambda implements Function2 {
    public final Function1 A;
    public final Function4 B;
    public final Function4 C;
    public final int D;
    public final int E;
    public final Modifier w;
    public final int x;
    public final int y;
    public final Function2 z;

    public w0(Modifier modifier0, int v, int v1, Function2 function20, Function1 function10, Function4 function40, Function4 function41, int v2, int v3) {
        this.w = modifier0;
        this.x = v;
        this.y = v1;
        this.z = function20;
        this.A = function10;
        this.B = function40;
        this.C = function41;
        this.D = v2;
        this.E = v3;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        ItemSliderKt.ItemSlider(this.w, this.x, this.y, this.z, this.A, this.B, this.C, ((Composer)object0), (this.D | 1) & -920350135 | ((0x24924924 & (this.D | 1)) >> 1 | 306783378 & (this.D | 1)) | (306783378 & (this.D | 1)) << 1 & (0x24924924 & (this.D | 1)), this.E);
        return Unit.INSTANCE;
    }
}

