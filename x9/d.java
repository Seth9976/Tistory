package x9;

import com.kakao.kandinsky.crop.CropViewModel;
import com.kakao.kandinsky.crop.contract.CropIntent.ChangeCropRatio;
import com.kakao.kandinsky.crop.contract.CropRatioType;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class d extends Lambda implements Function1 {
    public final CropViewModel w;

    public d(CropViewModel cropViewModel0) {
        this.w = cropViewModel0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((CropRatioType)object0), "it");
        ChangeCropRatio cropIntent$ChangeCropRatio0 = new ChangeCropRatio(((CropRatioType)object0));
        this.w.sendIntent(cropIntent$ChangeCropRatio0);
        return Unit.INSTANCE;
    }
}

