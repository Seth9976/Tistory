package ea;

import androidx.compose.ui.geometry.Rect;
import com.kakao.kandinsky.filter.FilterViewModel;
import com.kakao.kandinsky.filter.contract.FilterIntent.UpdateContentBounds;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class i extends Lambda implements Function1 {
    public final FilterViewModel w;

    public i(FilterViewModel filterViewModel0) {
        this.w = filterViewModel0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((Rect)object0), "it");
        UpdateContentBounds filterIntent$UpdateContentBounds0 = new UpdateContentBounds(((Rect)object0));
        this.w.sendIntent(filterIntent$UpdateContentBounds0);
        return Unit.INSTANCE;
    }
}

