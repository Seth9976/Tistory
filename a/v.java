package a;

import com.kakao.kandinsky.selector.SelectorEvent.SingleSelector;
import com.kakao.kandinsky.selector.SelectorEvent;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class v extends Lambda implements Function1 {
    public final SelectorEvent a;

    public v(SelectorEvent selectorEvent0) {
        this.a = selectorEvent0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        ((SingleSelector)this.a).getOnSelect().invoke(((Number)object0).intValue());
        return Unit.INSTANCE;
    }
}

