package ea;

import com.kakao.kandinsky.core.kdphoto.Filter;
import com.kakao.kandinsky.filter.FilterViewModel;
import com.kakao.kandinsky.filter.contract.FilterIntent.ChangeFilter;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class k extends Lambda implements Function1 {
    public final FilterViewModel w;

    public k(FilterViewModel filterViewModel0) {
        this.w = filterViewModel0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((Filter)object0), "it");
        ChangeFilter filterIntent$ChangeFilter0 = new ChangeFilter(((Filter)object0));
        this.w.sendIntent(filterIntent$ChangeFilter0);
        return Unit.INSTANCE;
    }
}

