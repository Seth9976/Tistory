package x9;

import com.kakao.kandinsky.crop.CropViewModel;
import com.kakao.kandinsky.crop.contract.CropIntent.ChangeViewType;
import com.kakao.kandinsky.crop.contract.CropViewType;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class g extends Lambda implements Function1 {
    public final CropViewModel w;

    public g(CropViewModel cropViewModel0) {
        this.w = cropViewModel0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((CropViewType)object0), "it");
        ChangeViewType cropIntent$ChangeViewType0 = new ChangeViewType(((CropViewType)object0));
        this.w.sendIntent(cropIntent$ChangeViewType0);
        return Unit.INSTANCE;
    }
}

