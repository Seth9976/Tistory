package ka;

import com.kakao.kandinsky.core.kdphoto.Blur.Type;
import com.kakao.kandinsky.mosaic.BlurMenu;
import com.kakao.kandinsky.mosaic.MosaicViewModel;
import com.kakao.kandinsky.mosaic.contract.MosaicIntent.ChangeBlurType;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class p extends Lambda implements Function1 {
    public final MosaicViewModel w;

    public p(MosaicViewModel mosaicViewModel0) {
        this.w = mosaicViewModel0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        ChangeBlurType mosaicIntent$ChangeBlurType0;
        Intrinsics.checkNotNullParameter(((BlurMenu)object0), "it");
        switch(((BlurMenu)object0)) {
            case 1: {
                mosaicIntent$ChangeBlurType0 = new ChangeBlurType(Type.Circle);
                break;
            }
            case 2: {
                mosaicIntent$ChangeBlurType0 = new ChangeBlurType(Type.Rectangle);
                break;
            }
            default: {
                throw new NoWhenBranchMatchedException();
            }
        }
        this.w.sendIntent(mosaicIntent$ChangeBlurType0);
        return Unit.INSTANCE;
    }
}

