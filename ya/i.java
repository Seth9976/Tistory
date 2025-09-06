package ya;

import androidx.compose.runtime.Composer;
import com.kakao.kandinsky.sticker.contract.StickerGroup;
import com.kakao.kandinsky.sticker.ui.StickerTabBarKt;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class i extends Lambda implements Function2 {
    public final Function0 A;
    public final Function0 B;
    public final int C;
    public final int w;
    public final List x;
    public final StickerGroup y;
    public final Function1 z;

    public i(List list0, StickerGroup stickerGroup0, Function1 function10, Function0 function00, Function0 function01, int v, int v1) {
        this.w = v1;
        this.x = list0;
        this.y = stickerGroup0;
        this.z = function10;
        this.A = function00;
        this.B = function01;
        this.C = v;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        if(this.w != 0) {
            ((Number)object1).intValue();
            StickerTabBarKt.StickerVerticalTabBar(this.x, this.y, this.z, this.A, this.B, ((Composer)object0), (this.C | 1) & -920350135 | ((0x24924924 & (this.C | 1)) >> 1 | 306783378 & (this.C | 1)) | (306783378 & (this.C | 1)) << 1 & (0x24924924 & (this.C | 1)));
            return Unit.INSTANCE;
        }
        ((Number)object1).intValue();
        StickerTabBarKt.StickerHorizontalTabBar(this.x, this.y, this.z, this.A, this.B, ((Composer)object0), (this.C | 1) & -920350135 | ((0x24924924 & (this.C | 1)) >> 1 | 306783378 & (this.C | 1)) | (306783378 & (this.C | 1)) << 1 & (0x24924924 & (this.C | 1)));
        return Unit.INSTANCE;
    }
}

