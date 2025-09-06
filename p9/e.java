package p9;

import com.kakao.kandinsky.base.KDMviViewModel;
import com.kakao.kandinsky.base.contract.Destination;
import com.kakao.kandinsky.base.contract.KDEvent.Go;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class e extends Lambda implements Function0 {
    public final KDMviViewModel w;

    public e(KDMviViewModel kDMviViewModel0) {
        this.w = kDMviViewModel0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Go kDEvent$Go0 = new Go(Destination.HOME);
        this.w.sendEvent(kDEvent$Go0);
        return Unit.INSTANCE;
    }
}

