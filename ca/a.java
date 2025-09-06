package ca;

import androidx.compose.runtime.Composer;
import com.kakao.kandinsky.designsystem.common.CommonDialogKt;
import com.kakao.kandinsky.selector.MultipleImageSelectorKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class a extends Lambda implements Function2 {
    public final int A;
    public final int B;
    public final int w;
    public final int x;
    public final Function0 y;
    public final Function0 z;

    public a(int v, int v1, Function0 function00, Function0 function01, int v2) {
        this.w = 0;
        this.x = v;
        this.A = v1;
        this.y = function00;
        this.z = function01;
        this.B = v2;
        super(2);
    }

    public a(int v, Function0 function00, Function0 function01, int v1, int v2) {
        this.w = 1;
        this.x = v;
        this.y = function00;
        this.z = function01;
        this.A = v1;
        this.B = v2;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        if(this.w != 0) {
            MultipleImageSelectorKt.access$TopBar(this.x, this.y, this.z, ((Composer)object0), (this.A | 1) & -920350135 | ((0x24924924 & (this.A | 1)) >> 1 | 306783378 & (this.A | 1)) | (306783378 & (this.A | 1)) << 1 & (0x24924924 & (this.A | 1)), this.B);
            return Unit.INSTANCE;
        }
        CommonDialogKt.CommonDialog(this.x, this.A, this.y, this.z, ((Composer)object0), (this.B | 1) & -920350135 | ((0x24924924 & (this.B | 1)) >> 1 | 306783378 & (this.B | 1)) | (306783378 & (this.B | 1)) << 1 & (0x24924924 & (this.B | 1)));
        return Unit.INSTANCE;
    }
}

