package z9;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.CompositionLocalContext;
import androidx.compose.runtime.CompositionLocalKt;
import com.kakao.kandinsky.crop.contract.CropRatioType;
import com.kakao.kandinsky.crop.ui.CropMenuKt;
import kotlin.Function;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class k extends Lambda implements Function2 {
    public final int w;
    public final int x;
    public final Object y;
    public final Function z;

    public k(Object object0, Function function0, int v, int v1) {
        this.w = v1;
        this.y = object0;
        this.z = function0;
        this.x = v;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        if(this.w != 0) {
            CompositionLocalKt.CompositionLocalProvider(((CompositionLocalContext)this.y), ((Function2)this.z), ((Composer)object0), (this.x | 1) & -920350135 | ((0x24924924 & (this.x | 1)) >> 1 | 306783378 & (this.x | 1)) | (306783378 & (this.x | 1)) << 1 & (0x24924924 & (this.x | 1)));
            return Unit.INSTANCE;
        }
        CropMenuKt.CropMenu(((CropRatioType)this.y), ((Function1)this.z), ((Composer)object0), (this.x | 1) & -920350135 | ((0x24924924 & (this.x | 1)) >> 1 | 306783378 & (this.x | 1)) | (306783378 & (this.x | 1)) << 1 & (0x24924924 & (this.x | 1)));
        return Unit.INSTANCE;
    }
}

