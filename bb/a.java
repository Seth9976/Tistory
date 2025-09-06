package bb;

import androidx.compose.material3.internal.TextFieldImplKt;
import androidx.compose.material3.pulltorefresh.PullToRefreshKt;
import androidx.compose.runtime.Composer;
import com.kakao.kandinsky.core.kdphoto.Signature;
import com.kakao.kandinsky.core.kdphoto.TextData;
import com.kakao.kandinsky.signature.ui.SignatureDecorationKt;
import com.kakao.kandinsky.text.ui.TextDecorationKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class a extends Lambda implements Function2 {
    public final int w;
    public final long x;
    public final int y;
    public final Object z;

    public a(long v, int v1, int v2, Object object0) {
        this.w = v2;
        this.z = object0;
        this.x = v;
        this.y = v1;
        super(2);
    }

    public a(long v, Function2 function20, int v1) {
        this.w = 2;
        this.x = v;
        this.z = function20;
        this.y = v1;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        switch(this.w) {
            case 0: {
                TextDecorationKt.TextDecoration-x_KDEd0(((TextData)this.z), this.x, ((Composer)object0), (this.y | 1) & -920350135 | ((0x24924924 & (this.y | 1)) >> 1 | 306783378 & (this.y | 1)) | (306783378 & (this.y | 1)) << 1 & (0x24924924 & (this.y | 1)));
                return Unit.INSTANCE;
            }
            case 1: {
                SignatureDecorationKt.access$SignatureContent-x_KDEd0(((Signature)this.z), this.x, ((Composer)object0), (this.y | 1) & -920350135 | ((0x24924924 & (this.y | 1)) >> 1 | 306783378 & (this.y | 1)) | (306783378 & (this.y | 1)) << 1 & (0x24924924 & (this.y | 1)));
                return Unit.INSTANCE;
            }
            case 2: {
                TextFieldImplKt.access$Decoration-Iv8Zu3U(this.x, ((Function2)this.z), ((Composer)object0), (this.y | 1) & -920350135 | ((0x24924924 & (this.y | 1)) >> 1 | 306783378 & (this.y | 1)) | (306783378 & (this.y | 1)) << 1 & (0x24924924 & (this.y | 1)));
                return Unit.INSTANCE;
            }
            default: {
                PullToRefreshKt.access$CircularArrowProgressIndicator-RPmYEkk(((Function0)this.z), this.x, ((Composer)object0), (this.y | 1) & -920350135 | ((0x24924924 & (this.y | 1)) >> 1 | 306783378 & (this.y | 1)) | (306783378 & (this.y | 1)) << 1 & (0x24924924 & (this.y | 1)));
                return Unit.INSTANCE;
            }
        }
    }
}

