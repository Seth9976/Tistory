package va;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.IconKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.res.PainterResources_androidKt;
import com.kakao.kandinsky.signature.R.drawable;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class d extends Lambda implements Function2 {
    public static final d w;

    static {
        d.w = new d(2);  // 初始化器: Lkotlin/jvm/internal/Lambda;-><init>(I)V
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        int v = ((Number)object1).intValue();
        if((v & 11) == 2 && ((Composer)object0).getSkipping()) {
            ((Composer)object0).skipToGroupEnd();
            return Unit.INSTANCE;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xBD86EF1B, v, -1, "com.kakao.kandinsky.signature.ui.ComposableSingletons$SavedSignatureBottomSheetKt.lambda-3.<anonymous> (SavedSignatureBottomSheet.kt:187)");
        }
        Modifier modifier0 = SizeKt.size-3ABfNKs(Modifier.Companion, 24.0f);
        IconKt.Icon-ww6aTOc(PainterResources_androidKt.painterResource(drawable.icon_signature_delete, ((Composer)object0), 0), null, modifier0, Color.Companion.getUnspecified-0d7_KjU(), ((Composer)object0), 0xDB8, 0);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

