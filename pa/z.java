package pa;

import com.kakao.kandinsky.resize.ResizeScreenType;
import com.kakao.kandinsky.resize.ResizeViewModel;
import com.kakao.kandinsky.resize.contract.ResizeIntent.ChangeScreenType;
import com.kakao.kdtracker.KDTracker;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class z extends Lambda implements Function0 {
    public final ResizeViewModel w;

    public z(ResizeViewModel resizeViewModel0) {
        this.w = resizeViewModel0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        KDTracker.clickEvent$default(KDTracker.INSTANCE, "size-tab", "size-tab", null, null, 12, null);
        ChangeScreenType resizeIntent$ChangeScreenType0 = new ChangeScreenType(ResizeScreenType.Custom);
        this.w.sendIntent(resizeIntent$ChangeScreenType0);
        return Unit.INSTANCE;
    }
}

