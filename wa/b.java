package wa;

import com.kakao.kandinsky.sticker.StickerViewModel;
import com.kakao.kandinsky.sticker.contract.StickerIntent.AddSticker;
import com.kakao.kandinsky.sticker.contract.StickerItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class b extends Lambda implements Function1 {
    public final StickerViewModel w;

    public b(StickerViewModel stickerViewModel0) {
        this.w = stickerViewModel0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((StickerItem)object0), "it");
        AddSticker stickerIntent$AddSticker0 = new AddSticker(((StickerItem)object0));
        this.w.sendIntent(stickerIntent$AddSticker0);
        return Unit.INSTANCE;
    }
}

