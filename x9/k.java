package x9;

import com.kakao.kandinsky.crop.CropViewModel;
import com.kakao.kandinsky.crop.contract.CropIntent.Flip;
import com.kakao.kandinsky.crop.contract.FlipType;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class k extends Lambda implements Function1 {
    public final CropViewModel w;

    public k(CropViewModel cropViewModel0) {
        this.w = cropViewModel0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((FlipType)object0), "it");
        Flip cropIntent$Flip0 = new Flip(((FlipType)object0));
        this.w.sendIntent(cropIntent$Flip0);
        return Unit.INSTANCE;
    }
}

