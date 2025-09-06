package x9;

import com.kakao.kandinsky.crop.CropViewModel;
import com.kakao.kandinsky.crop.contract.CropIntent.RotateAngle;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class h extends Lambda implements Function1 {
    public final CropViewModel w;

    public h(CropViewModel cropViewModel0) {
        this.w = cropViewModel0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        RotateAngle cropIntent$RotateAngle0 = new RotateAngle(((Number)object0).floatValue());
        this.w.sendIntent(cropIntent$RotateAngle0);
        return Unit.INSTANCE;
    }
}

