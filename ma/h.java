package ma;

import androidx.compose.runtime.MutableState;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import com.kakao.kandinsky.mosaic.ui.MosaicDecorationKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class h extends Lambda implements Function1 {
    public final MutableState w;

    public h(MutableState mutableState0) {
        this.w = mutableState0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((ContentDrawScope)object0), "$this$drawWithContent");
        ((ContentDrawScope)object0).getDrawContext().getCanvas().clipPath-mtrdD-E(MosaicDecorationKt.access$DecorationContainer_YLp_XPw$lambda$2(this.w), 0);
        ((ContentDrawScope)object0).drawContent();
        return Unit.INSTANCE;
    }
}

