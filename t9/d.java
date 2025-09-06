package t9;

import androidx.compose.ui.geometry.Rect;
import com.kakao.kandinsky.border.BorderViewModel;
import com.kakao.kandinsky.border.contract.BorderIntent.UpdateContentBounds;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class d extends Lambda implements Function1 {
    public final BorderViewModel w;

    public d(BorderViewModel borderViewModel0) {
        this.w = borderViewModel0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((Rect)object0), "it");
        UpdateContentBounds borderIntent$UpdateContentBounds0 = new UpdateContentBounds(((Rect)object0));
        this.w.sendIntent(borderIntent$UpdateContentBounds0);
        return Unit.INSTANCE;
    }
}

