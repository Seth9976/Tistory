package pa;

import com.kakao.kandinsky.resize.ResizeViewModel;
import com.kakao.kandinsky.resize.contract.ResizeIntent.BackPressed;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class a0 extends Lambda implements Function0 {
    public final ResizeViewModel w;

    public a0(ResizeViewModel resizeViewModel0) {
        this.w = resizeViewModel0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        this.w.sendIntent(BackPressed.INSTANCE);
        return Unit.INSTANCE;
    }
}

