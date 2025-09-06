package ka;

import com.kakao.kandinsky.core.kdphoto.Mosaic.Type;
import com.kakao.kandinsky.mosaic.MosaicMenu;
import com.kakao.kandinsky.mosaic.MosaicViewModel;
import com.kakao.kandinsky.mosaic.contract.MosaicIntent.ChangeMosaicType;
import com.kakao.kandinsky.mosaic.contract.MosaicIntent.ClearMosaic;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class o extends Lambda implements Function1 {
    public final MosaicViewModel w;

    public o(MosaicViewModel mosaicViewModel0) {
        this.w = mosaicViewModel0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        ChangeMosaicType mosaicIntent$ChangeMosaicType0;
        Intrinsics.checkNotNullParameter(((MosaicMenu)object0), "it");
        switch(((MosaicMenu)object0)) {
            case 1: {
                mosaicIntent$ChangeMosaicType0 = new ChangeMosaicType(Type.Circle);
                break;
            }
            case 2: {
                mosaicIntent$ChangeMosaicType0 = new ChangeMosaicType(Type.Rectangle);
                break;
            }
            case 3: {
                mosaicIntent$ChangeMosaicType0 = ClearMosaic.INSTANCE;
                break;
            }
            default: {
                throw new NoWhenBranchMatchedException();
            }
        }
        this.w.sendIntent(mosaicIntent$ChangeMosaicType0);
        return Unit.INSTANCE;
    }
}

