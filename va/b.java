package va;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.kakao.kandinsky.signature.ui.SavedSignatureBottomSheetKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class b extends Lambda implements Function2 {
    public static final b w;

    static {
        b.w = new b(2);  // 初始化器: Lkotlin/jvm/internal/Lambda;-><init>(I)V
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        int v = ((Number)object1).intValue();
        if((v & 11) == 2 && ((Composer)object0).getSkipping()) {
            ((Composer)object0).skipToGroupEnd();
            return Unit.INSTANCE;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-862209154, v, -1, "com.kakao.kandinsky.signature.ui.ComposableSingletons$SavedSignatureBottomSheetKt.lambda-1.<anonymous> (SavedSignatureBottomSheet.kt:45)");
        }
        SavedSignatureBottomSheetKt.SavedSignatureBottomSheet(CollectionsKt__CollectionsKt.emptyList(), a.x, a.y, a.z, ((Composer)object0), 3510);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

