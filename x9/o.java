package x9;

import com.kakao.kandinsky.crop.CropViewModel;
import com.kakao.kandinsky.crop.contract.CropIntent.FinishInteraction;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class o extends Lambda implements Function0 {
    public final CropViewModel w;

    public o(CropViewModel cropViewModel0) {
        this.w = cropViewModel0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        this.w.sendIntent(FinishInteraction.INSTANCE);
        return Unit.INSTANCE;
    }
}

