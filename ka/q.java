package ka;

import com.kakao.kandinsky.mosaic.MosaicViewModel;
import com.kakao.kandinsky.mosaic.contract.MosaicIntent.Cancel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class q extends Lambda implements Function0 {
    public final MosaicViewModel w;

    public q(MosaicViewModel mosaicViewModel0) {
        this.w = mosaicViewModel0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        this.w.sendIntent(Cancel.INSTANCE);
        return Unit.INSTANCE;
    }
}

