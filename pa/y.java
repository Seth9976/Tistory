package pa;

import com.kakao.kandinsky.resize.ResizeViewModel;
import com.kakao.kandinsky.resize.contract.ResizeIntent.ResetWidth;
import com.kakao.kdtracker.KDTracker;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class y extends Lambda implements Function0 {
    public final ResizeViewModel w;

    public y(ResizeViewModel resizeViewModel0) {
        this.w = resizeViewModel0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        KDTracker.clickEvent$default(KDTracker.INSTANCE, "size-tab", "original", null, "original", 4, null);
        this.w.sendIntent(ResetWidth.INSTANCE);
        return Unit.INSTANCE;
    }
}

