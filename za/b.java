package za;

import androidx.compose.ui.geometry.Rect;
import com.kakao.kandinsky.text.TextViewModel;
import com.kakao.kandinsky.text.contract.TextIntent.UpdateContentBounds;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class b extends Lambda implements Function1 {
    public final TextViewModel w;

    public b(TextViewModel textViewModel0) {
        this.w = textViewModel0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((Rect)object0), "it");
        UpdateContentBounds textIntent$UpdateContentBounds0 = new UpdateContentBounds(((Rect)object0));
        this.w.sendIntent(textIntent$UpdateContentBounds0);
        return Unit.INSTANCE;
    }
}

