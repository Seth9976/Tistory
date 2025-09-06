package p5;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import coil.compose.SubcomposeAsyncImageKt;
import coil.compose.SubcomposeAsyncImageScope;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

public final class d extends Lambda implements Function3 {
    public static final d w;

    static {
        d.w = new d(3);  // 初始化器: Lkotlin/jvm/internal/Lambda;-><init>(I)V
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object invoke(Object object0, Object object1, Object object2) {
        int v = ((Number)object2).intValue();
        if((v & 14) == 0) {
            v |= (((Composer)object1).changed(((SubcomposeAsyncImageScope)object0)) ? 4 : 2);
        }
        if((v & 91) == 18 && ((Composer)object1).getSkipping()) {
            ((Composer)object1).skipToGroupEnd();
            return Unit.INSTANCE;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1692951203, v, -1, "coil.compose.ComposableSingletons$SubcomposeAsyncImageKt.lambda-1.<anonymous> (SubcomposeAsyncImage.kt:391)");
        }
        SubcomposeAsyncImageKt.SubcomposeAsyncImageContent(((SubcomposeAsyncImageScope)object0), null, null, null, null, null, 0.0f, null, false, ((Composer)object1), v & 14, 0xFF);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

