package ca;

import androidx.compose.animation.SharedTransitionScopeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import com.kakao.kandinsky.designsystem.common.KDSliderKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

public final class s1 extends Lambda implements Function2 {
    public final int A;
    public final int w;
    public final Modifier x;
    public final Function3 y;
    public final int z;

    public s1(Modifier modifier0, Function3 function30, int v, int v1, int v2) {
        this.w = v2;
        this.x = modifier0;
        this.y = function30;
        this.z = v;
        this.A = v1;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        if(this.w != 0) {
            SharedTransitionScopeKt.SharedTransitionLayout(this.x, this.y, ((Composer)object0), (this.z | 1) & -920350135 | ((0x24924924 & (this.z | 1)) >> 1 | 306783378 & (this.z | 1)) | (306783378 & (this.z | 1)) << 1 & (0x24924924 & (this.z | 1)), this.A);
            return Unit.INSTANCE;
        }
        KDSliderKt.SliderBoundBox(this.x, this.y, ((Composer)object0), (this.z | 1) & -920350135 | ((0x24924924 & (this.z | 1)) >> 1 | 306783378 & (this.z | 1)) | (306783378 & (this.z | 1)) << 1 & (0x24924924 & (this.z | 1)), this.A);
        return Unit.INSTANCE;
    }
}

