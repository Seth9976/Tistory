package wa;

import android.graphics.Matrix;
import androidx.compose.ui.geometry.Offset;
import com.kakao.kandinsky.sticker.contract.StickerIntent.MoveSelectSticker;
import com.kakao.kandinsky.sticker.contract.StickerIntent;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class f extends Lambda implements Function1 {
    public final StickerIntent w;

    public f(StickerIntent stickerIntent0) {
        this.w = stickerIntent0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((Matrix)object0), "$this$buildMatrix");
        ((Matrix)object0).postTranslate(Offset.getX-impl(((MoveSelectSticker)this.w).getOffset-F1C5BW0()), Offset.getY-impl(((MoveSelectSticker)this.w).getOffset-F1C5BW0()));
        return Unit.INSTANCE;
    }
}

