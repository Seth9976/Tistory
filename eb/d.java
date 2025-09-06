package eb;

import androidx.activity.compose.ReportDrawnKt;
import androidx.compose.runtime.Composer;
import com.kakao.kandinsky.home.HomeScreenKt;
import com.kakao.kandinsky.sticker.ui.StickerTabBarKt;
import com.kakao.kandinsky.textedit.ui.EditTabBarKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class d extends Lambda implements Function2 {
    public final int w;
    public final Function0 x;
    public final int y;

    public d(Function0 function00, int v, int v1) {
        this.w = v1;
        this.x = function00;
        this.y = v;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        switch(this.w) {
            case 0: {
                EditTabBarKt.a(this.x, ((Composer)object0), (this.y | 1) & -920350135 | ((0x24924924 & (this.y | 1)) >> 1 | 306783378 & (this.y | 1)) | (306783378 & (this.y | 1)) << 1 & (0x24924924 & (this.y | 1)));
                return Unit.INSTANCE;
            }
            case 1: {
                HomeScreenKt.access$CancelButton(this.x, ((Composer)object0), (this.y | 1) & -920350135 | ((0x24924924 & (this.y | 1)) >> 1 | 306783378 & (this.y | 1)) | (306783378 & (this.y | 1)) << 1 & (0x24924924 & (this.y | 1)));
                return Unit.INSTANCE;
            }
            case 2: {
                HomeScreenKt.access$ConfirmButton(this.x, ((Composer)object0), (this.y | 1) & -920350135 | ((0x24924924 & (this.y | 1)) >> 1 | 306783378 & (this.y | 1)) | (306783378 & (this.y | 1)) << 1 & (0x24924924 & (this.y | 1)));
                return Unit.INSTANCE;
            }
            case 3: {
                ReportDrawnKt.ReportDrawnWhen(this.x, ((Composer)object0), this.y | 1);
                return Unit.INSTANCE;
            }
            case 4: {
                ReportDrawnKt.ReportDrawnWhen(this.x, ((Composer)object0), this.y | 1);
                return Unit.INSTANCE;
            }
            case 5: {
                StickerTabBarKt.a(this.x, ((Composer)object0), (this.y | 1) & -920350135 | ((0x24924924 & (this.y | 1)) >> 1 | 306783378 & (this.y | 1)) | (306783378 & (this.y | 1)) << 1 & (0x24924924 & (this.y | 1)));
                return Unit.INSTANCE;
            }
            default: {
                StickerTabBarKt.b(this.x, ((Composer)object0), (this.y | 1) & -920350135 | ((0x24924924 & (this.y | 1)) >> 1 | 306783378 & (this.y | 1)) | (306783378 & (this.y | 1)) << 1 & (0x24924924 & (this.y | 1)));
                return Unit.INSTANCE;
            }
        }
    }
}

