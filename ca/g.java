package ca;

import androidx.compose.runtime.Composer;
import com.kakao.kandinsky.designsystem.common.CommonDialogKt;
import com.kakao.kandinsky.designsystem.common.FeatureBottomBarKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class g extends Lambda implements Function2 {
    public final int A;
    public final int w;
    public final Function0 x;
    public final Function0 y;
    public final int z;

    public g(int v, int v1, Function0 function00, Function0 function01, int v2) {
        this.w = v2;
        this.x = function00;
        this.y = function01;
        this.z = v;
        this.A = v1;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        if(this.w != 0) {
            FeatureBottomBarKt.access$FeatureBottomBarRightContent(this.x, this.y, ((Composer)object0), (this.z | 1) & -920350135 | ((0x24924924 & (this.z | 1)) >> 1 | 306783378 & (this.z | 1)) | (306783378 & (this.z | 1)) << 1 & (0x24924924 & (this.z | 1)), this.A);
            return Unit.INSTANCE;
        }
        CommonDialogKt.access$DialogButtons(this.x, this.y, ((Composer)object0), (this.z | 1) & -920350135 | ((0x24924924 & (this.z | 1)) >> 1 | 306783378 & (this.z | 1)) | (306783378 & (this.z | 1)) << 1 & (0x24924924 & (this.z | 1)), this.A);
        return Unit.INSTANCE;
    }
}

