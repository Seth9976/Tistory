package ea;

import com.kakao.kandinsky.filter.FilterViewModel;
import com.kakao.kandinsky.filter.contract.FeatureMenu;
import com.kakao.kandinsky.filter.contract.FilterIntent.ChangeCurrentFeatureMenu;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class j extends Lambda implements Function1 {
    public final FilterViewModel w;

    public j(FilterViewModel filterViewModel0) {
        this.w = filterViewModel0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((FeatureMenu)object0), "it");
        ChangeCurrentFeatureMenu filterIntent$ChangeCurrentFeatureMenu0 = new ChangeCurrentFeatureMenu(((FeatureMenu)object0));
        this.w.sendIntent(filterIntent$ChangeCurrentFeatureMenu0);
        return Unit.INSTANCE;
    }
}

