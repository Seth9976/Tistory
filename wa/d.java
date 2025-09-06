package wa;

import com.kakao.kandinsky.sticker.StickerViewModel;
import com.kakao.kandinsky.sticker.contract.StickerIntent.RemoveAllSticker;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class d extends Lambda implements Function0 {
    public final StickerViewModel w;

    public d(StickerViewModel stickerViewModel0) {
        this.w = stickerViewModel0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        this.w.sendIntent(RemoveAllSticker.INSTANCE);
        return Unit.INSTANCE;
    }
}

