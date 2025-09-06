package a;

import com.kakao.kandinsky.selector.SelectorEvent.MultipleSelector;
import com.kakao.kandinsky.selector.SelectorEvent;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class w extends Lambda implements Function1 {
    public final SelectorEvent a;

    public w(SelectorEvent selectorEvent0) {
        this.a = selectorEvent0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((List)object0), "it");
        ((MultipleSelector)this.a).getOnSelect().invoke(((List)object0));
        return Unit.INSTANCE;
    }
}

