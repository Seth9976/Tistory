package ka;

import com.kakao.kandinsky.mosaic.MosaicViewModel;
import com.kakao.kandinsky.mosaic.contract.MosaicIntent.ChangeIntensity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class n extends Lambda implements Function1 {
    public final MosaicViewModel w;

    public n(MosaicViewModel mosaicViewModel0) {
        this.w = mosaicViewModel0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        ChangeIntensity mosaicIntent$ChangeIntensity0 = new ChangeIntensity(((Number)object0).floatValue() / 100.0f);
        this.w.sendIntent(mosaicIntent$ChangeIntensity0);
        return Unit.INSTANCE;
    }
}

