package eb;

import androidx.compose.runtime.Composer;
import com.kakao.kandinsky.selector.MultipleImageSelectorKt;
import com.kakao.kandinsky.textedit.ui.EditTabBarKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class i extends Lambda implements Function2 {
    public final int w;
    public final boolean x;
    public final Function1 y;
    public final int z;

    public i(boolean z, Function1 function10, int v, int v1) {
        this.w = v1;
        this.x = z;
        this.y = function10;
        this.z = v;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        if(this.w != 0) {
            MultipleImageSelectorKt.access$BottomBar(this.x, this.y, ((Composer)object0), (this.z | 1) & -920350135 | ((0x24924924 & (this.z | 1)) >> 1 | 306783378 & (this.z | 1)) | (306783378 & (this.z | 1)) << 1 & (0x24924924 & (this.z | 1)));
            return Unit.INSTANCE;
        }
        EditTabBarKt.d(this.x, this.y, ((Composer)object0), (this.z | 1) & -920350135 | ((0x24924924 & (this.z | 1)) >> 1 | 306783378 & (this.z | 1)) | (306783378 & (this.z | 1)) << 1 & (0x24924924 & (this.z | 1)));
        return Unit.INSTANCE;
    }
}

