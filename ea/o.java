package ea;

import com.kakao.kandinsky.filter.FilterViewModel;
import com.kakao.kandinsky.filter.contract.FilterIntent.ChangeEffectValue;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class o extends Lambda implements Function1 {
    public final FilterViewModel w;

    public o(FilterViewModel filterViewModel0) {
        this.w = filterViewModel0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        ChangeEffectValue filterIntent$ChangeEffectValue0 = new ChangeEffectValue(((Number)object0).floatValue());
        this.w.sendIntent(filterIntent$ChangeEffectValue0);
        return Unit.INSTANCE;
    }
}

