package pa;

import com.kakao.kandinsky.base.contract.Destination;
import com.kakao.kandinsky.resize.ResizeViewModel;
import com.kakao.kandinsky.resize.contract.ResizeEvent.Go;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class b0 extends Lambda implements Function0 {
    public final ResizeViewModel w;

    public b0(ResizeViewModel resizeViewModel0) {
        this.w = resizeViewModel0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Go resizeEvent$Go0 = new Go(Destination.HOME);
        this.w.sendEvent(resizeEvent$Go0);
        return Unit.INSTANCE;
    }
}

