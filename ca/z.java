package ca;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import com.kakao.kandinsky.designsystem.common.FeatureBottomBarKt;
import com.kakao.kandinsky.selector.SingleImageSelectorKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class z extends Lambda implements Function2 {
    public final int A;
    public final int B;
    public final Object C;
    public final int w;
    public final String x;
    public final boolean y;
    public final boolean z;

    public z(Modifier modifier0, String s, boolean z, boolean z1, int v, int v1) {
        this.w = 1;
        this.C = modifier0;
        this.x = s;
        this.y = z;
        this.z = z1;
        this.A = v;
        this.B = v1;
        super(2);
    }

    public z(String s, boolean z, boolean z1, Function0 function00, int v, int v1) {
        this.w = 0;
        this.x = s;
        this.y = z;
        this.z = z1;
        this.C = function00;
        this.A = v;
        this.B = v1;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        if(this.w != 0) {
            ((Number)object1).intValue();
            SingleImageSelectorKt.access$ImageItem(((Modifier)this.C), this.x, this.y, this.z, ((Composer)object0), (this.A | 1) & -920350135 | ((0x24924924 & (this.A | 1)) >> 1 | 306783378 & (this.A | 1)) | (306783378 & (this.A | 1)) << 1 & (0x24924924 & (this.A | 1)), this.B);
            return Unit.INSTANCE;
        }
        ((Number)object1).intValue();
        FeatureBottomBarKt.BottomBarFeatureTypeText(this.x, this.y, this.z, ((Function0)this.C), ((Composer)object0), (this.A | 1) & -920350135 | ((0x24924924 & (this.A | 1)) >> 1 | 306783378 & (this.A | 1)) | (306783378 & (this.A | 1)) << 1 & (0x24924924 & (this.A | 1)), this.B);
        return Unit.INSTANCE;
    }
}

