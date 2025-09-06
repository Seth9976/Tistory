package ra;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.kakao.kandinsky.selector.MultipleImageSelectorKt;
import com.kakao.kandinsky.selector.SingleImageSelectorKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class c extends Lambda implements Function2 {
    public final int w;
    public static final c x;
    public static final c y;

    static {
        c.x = new c(2, 0);
        c.y = new c(2, 1);
    }

    public c(int v, int v1) {
        this.w = v1;
        super(v);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        if(this.w != 0) {
            int v = ((Number)object1).intValue();
            if((v & 11) == 2 && ((Composer)object0).getSkipping()) {
                ((Composer)object0).skipToGroupEnd();
                return Unit.INSTANCE;
            }
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x4BD0E8B5, v, -1, "com.kakao.kandinsky.selector.ComposableSingletons$SingleImageSelectorKt.lambda-1.<anonymous> (SingleImageSelector.kt:27)");
            }
            SingleImageSelectorKt.SingleImageSelector(CollectionsKt__CollectionsKt.emptyList(), 0, a.y, b.y, ((Composer)object0), 3510);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            return Unit.INSTANCE;
        }
        int v1 = ((Number)object1).intValue();
        if((v1 & 11) == 2 && ((Composer)object0).getSkipping()) {
            ((Composer)object0).skipToGroupEnd();
            return Unit.INSTANCE;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1980223045, v1, -1, "com.kakao.kandinsky.selector.ComposableSingletons$MultipleImageSelectorKt.lambda-1.<anonymous> (MultipleImageSelector.kt:29)");
        }
        MultipleImageSelectorKt.MultipleImageSelector(CollectionsKt__CollectionsKt.emptyList(), 0, "frame", a.x, b.x, ((Composer)object0), 28086, 0);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

