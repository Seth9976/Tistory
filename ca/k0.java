package ca;

import androidx.compose.runtime.Composer;
import com.kakao.kandinsky.designsystem.common.FeatureBottomBarKt;
import com.kakao.kandinsky.selector.SingleImageSelectorKt;
import com.kakao.kandinsky.signature.ui.SavedSignatureBottomSheetKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class k0 extends Lambda implements Function2 {
    public final int w;
    public final Function0 x;
    public final int y;
    public final int z;

    public k0(int v, int v1, int v2, Function0 function00) {
        this.w = v2;
        this.x = function00;
        this.y = v;
        this.z = v1;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        switch(this.w) {
            case 0: {
                FeatureBottomBarKt.access$FeatureBottomBarLeftContent(this.x, ((Composer)object0), (this.y | 1) & -920350135 | ((0x24924924 & (this.y | 1)) >> 1 | 306783378 & (this.y | 1)) | (306783378 & (this.y | 1)) << 1 & (0x24924924 & (this.y | 1)), this.z);
                return Unit.INSTANCE;
            }
            case 1: {
                SingleImageSelectorKt.access$TopBar(this.x, ((Composer)object0), (this.y | 1) & -920350135 | ((0x24924924 & (this.y | 1)) >> 1 | 306783378 & (this.y | 1)) | (306783378 & (this.y | 1)) << 1 & (0x24924924 & (this.y | 1)), this.z);
                return Unit.INSTANCE;
            }
            default: {
                SavedSignatureBottomSheetKt.access$TopBar(this.x, ((Composer)object0), (this.y | 1) & -920350135 | ((0x24924924 & (this.y | 1)) >> 1 | 306783378 & (this.y | 1)) | (306783378 & (this.y | 1)) << 1 & (0x24924924 & (this.y | 1)), this.z);
                return Unit.INSTANCE;
            }
        }
    }
}

