package ea;

import com.kakao.kandinsky.filter.FilterViewModel;
import com.kakao.kandinsky.filter.contract.FilterIntent.ChangeFilterIntensity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class l extends Lambda implements Function1 {
    public final FilterViewModel w;

    public l(FilterViewModel filterViewModel0) {
        this.w = filterViewModel0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        ChangeFilterIntensity filterIntent$ChangeFilterIntensity0 = new ChangeFilterIntensity(((Number)object0).floatValue());
        this.w.sendIntent(filterIntent$ChangeFilterIntensity0);
        return Unit.INSTANCE;
    }
}

