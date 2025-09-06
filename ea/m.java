package ea;

import com.kakao.kandinsky.filter.FilterViewModel;
import com.kakao.kandinsky.filter.contract.EffectMenu;
import com.kakao.kandinsky.filter.contract.FilterIntent.ClickEffectMenu;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class m extends Lambda implements Function1 {
    public final FilterViewModel w;

    public m(FilterViewModel filterViewModel0) {
        this.w = filterViewModel0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((EffectMenu)object0), "it");
        ClickEffectMenu filterIntent$ClickEffectMenu0 = new ClickEffectMenu(((EffectMenu)object0));
        this.w.sendIntent(filterIntent$ClickEffectMenu0);
        return Unit.INSTANCE;
    }
}

