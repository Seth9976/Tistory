package ka;

import com.kakao.kandinsky.mosaic.MosaicViewModel;
import com.kakao.kandinsky.mosaic.ViewType;
import com.kakao.kandinsky.mosaic.contract.MosaicIntent.ChangeViewType;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class l extends Lambda implements Function1 {
    public final MosaicViewModel w;

    public l(MosaicViewModel mosaicViewModel0) {
        this.w = mosaicViewModel0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((ViewType)object0), "it");
        ChangeViewType mosaicIntent$ChangeViewType0 = new ChangeViewType(((ViewType)object0));
        this.w.sendIntent(mosaicIntent$ChangeViewType0);
        return Unit.INSTANCE;
    }
}

