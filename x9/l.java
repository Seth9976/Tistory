package x9;

import com.kakao.kandinsky.crop.CropViewModel;
import com.kakao.kandinsky.crop.contract.CropIntent.ZoomInOut;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class l extends Lambda implements Function1 {
    public final CropViewModel w;

    public l(CropViewModel cropViewModel0) {
        this.w = cropViewModel0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        ZoomInOut cropIntent$ZoomInOut0 = new ZoomInOut(((Number)object0).floatValue());
        this.w.sendIntent(cropIntent$ZoomInOut0);
        return Unit.INSTANCE;
    }
}

