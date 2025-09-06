package x9;

import com.kakao.kandinsky.crop.CropViewModel;
import com.kakao.kandinsky.crop.contract.CropIntent.Confirm;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class f extends Lambda implements Function0 {
    public final CropViewModel w;

    public f(CropViewModel cropViewModel0) {
        this.w = cropViewModel0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        this.w.sendIntent(Confirm.INSTANCE);
        return Unit.INSTANCE;
    }
}

