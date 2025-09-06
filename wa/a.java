package wa;

import androidx.compose.ui.geometry.Rect;
import com.kakao.kandinsky.sticker.StickerViewModel;
import com.kakao.kandinsky.sticker.contract.StickerIntent.UpdateContentBounds;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class a extends Lambda implements Function1 {
    public final StickerViewModel w;

    public a(StickerViewModel stickerViewModel0) {
        this.w = stickerViewModel0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((Rect)object0), "it");
        UpdateContentBounds stickerIntent$UpdateContentBounds0 = new UpdateContentBounds(((Rect)object0));
        this.w.sendIntent(stickerIntent$UpdateContentBounds0);
        return Unit.INSTANCE;
    }
}

