package ca;

import androidx.compose.foundation.pager.PagerState;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import com.kakao.kandinsky.designsystem.common.ItemSliderKt;
import com.kakao.kandinsky.designsystem.theme.Orientation;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

public final class e1 extends Lambda implements Function2 {
    public final Function1 A;
    public final Function3 B;
    public final Function3 C;
    public final int D;
    public final int E;
    public final Modifier w;
    public final Orientation x;
    public final PagerState y;
    public final int z;

    public e1(Modifier modifier0, Orientation orientation0, PagerState pagerState0, int v, Function1 function10, Function3 function30, Function3 function31, int v1, int v2) {
        this.w = modifier0;
        this.x = orientation0;
        this.y = pagerState0;
        this.z = v;
        this.A = function10;
        this.B = function30;
        this.C = function31;
        this.D = v1;
        this.E = v2;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        ItemSliderKt.access$SliderItemBox(this.w, this.x, this.y, this.z, this.A, this.B, this.C, ((Composer)object0), (this.D | 1) & -920350135 | ((0x24924924 & (this.D | 1)) >> 1 | 306783378 & (this.D | 1)) | (306783378 & (this.D | 1)) << 1 & (0x24924924 & (this.D | 1)), this.E);
        return Unit.INSTANCE;
    }
}

