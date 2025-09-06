package ea;

import com.kakao.kandinsky.filter.FilterViewModel;
import com.kakao.kandinsky.filter.contract.FilterIntent.Reset;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class n extends Lambda implements Function0 {
    public final FilterViewModel w;

    public n(FilterViewModel filterViewModel0) {
        this.w = filterViewModel0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        this.w.sendIntent(Reset.INSTANCE);
        return Unit.INSTANCE;
    }
}

