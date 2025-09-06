package wa;

import com.kakao.kandinsky.sticker.StickerViewModel;
import com.kakao.kandinsky.sticker.contract.StickerIntent.Confirm;
import com.kakao.kandinsky.sticker.contract.StickerIntent.SelectDecoSticker;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class e extends Lambda implements Function0 {
    public final StickerViewModel w;

    public e(StickerViewModel stickerViewModel0) {
        this.w = stickerViewModel0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        SelectDecoSticker stickerIntent$SelectDecoSticker0 = new SelectDecoSticker(null);
        this.w.sendIntent(stickerIntent$SelectDecoSticker0);
        this.w.sendIntent(Confirm.INSTANCE);
        return Unit.INSTANCE;
    }
}

