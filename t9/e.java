package t9;

import a5.b;
import com.kakao.kandinsky.border.BorderViewModel;
import com.kakao.kandinsky.border.contract.BorderIntent.SelectBorder;
import com.kakao.kandinsky.core.kdphoto.Border;
import com.kakao.kdtracker.KDTracker;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class e extends Lambda implements Function1 {
    public final BorderViewModel w;

    public e(BorderViewModel borderViewModel0) {
        this.w = borderViewModel0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((Border)object0), "it");
        KDTracker.clickEvent$default(KDTracker.INSTANCE, "frame-tab", (((Border)object0).getIndex() == 0 ? "original" : b.e(((Border)object0).getIndex(), "frame")), null, null, 12, null);
        SelectBorder borderIntent$SelectBorder0 = new SelectBorder(((Border)object0));
        this.w.sendIntent(borderIntent$SelectBorder0);
        return Unit.INSTANCE;
    }
}

