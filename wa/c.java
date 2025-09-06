package wa;

import com.kakao.kandinsky.sticker.StickerViewModel;
import com.kakao.kandinsky.sticker.contract.StickerGroup;
import com.kakao.kandinsky.sticker.contract.StickerIntent.SelectStickerGroup;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class c extends Lambda implements Function1 {
    public final StickerViewModel w;

    public c(StickerViewModel stickerViewModel0) {
        this.w = stickerViewModel0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((StickerGroup)object0), "it");
        SelectStickerGroup stickerIntent$SelectStickerGroup0 = new SelectStickerGroup(((StickerGroup)object0));
        this.w.sendIntent(stickerIntent$SelectStickerGroup0);
        return Unit.INSTANCE;
    }
}

