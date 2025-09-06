package v2;

import androidx.compose.ui.unit.IntRect;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.window.PopupLayout;
import androidx.compose.ui.window.PopupPositionProvider;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref.LongRef;

public final class p extends Lambda implements Function0 {
    public final long A;
    public final LongRef w;
    public final PopupLayout x;
    public final IntRect y;
    public final long z;

    public p(LongRef ref$LongRef0, PopupLayout popupLayout0, IntRect intRect0, long v, long v1) {
        this.w = ref$LongRef0;
        this.x = popupLayout0;
        this.y = intRect0;
        this.z = v;
        this.A = v1;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        PopupPositionProvider popupPositionProvider0 = this.x.getPositionProvider();
        LayoutDirection layoutDirection0 = this.x.getParentLayoutDirection();
        this.w.element = popupPositionProvider0.calculatePosition-llwVHH4(this.y, this.z, layoutDirection0, this.A);
        return Unit.INSTANCE;
    }
}

