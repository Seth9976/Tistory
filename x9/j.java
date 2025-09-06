package x9;

import com.kakao.kandinsky.crop.CropViewModel;
import com.kakao.kandinsky.crop.contract.CropIntent.RotateDirect;
import com.kakao.kandinsky.crop.contract.RotateType;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class j extends Lambda implements Function1 {
    public final CropViewModel w;

    public j(CropViewModel cropViewModel0) {
        this.w = cropViewModel0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((RotateType)object0), "it");
        RotateDirect cropIntent$RotateDirect0 = new RotateDirect(((RotateType)object0));
        this.w.sendIntent(cropIntent$RotateDirect0);
        return Unit.INSTANCE;
    }
}

