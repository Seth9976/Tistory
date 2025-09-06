package eb;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import com.kakao.kandinsky.textedit.ui.ColorPanelKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Lambda;

public final class c extends Lambda implements Function4 {
    public static final c w;

    static {
        c.w = new c(4);  // 初始化器: Lkotlin/jvm/internal/Lambda;-><init>(I)V
    }

    @Override  // kotlin.jvm.functions.Function4
    public final Object invoke(Object object0, Object object1, Object object2, Object object3) {
        ((Boolean)object0).booleanValue();
        int v = ((Number)object1).intValue();
        int v1 = ((Number)object3).intValue();
        if((v1 & 0x70) == 0) {
            v1 |= (((Composer)object2).changed(v) ? 0x20 : 16);
        }
        if((v1 & 721) == 0x90 && ((Composer)object2).getSkipping()) {
            ((Composer)object2).skipToGroupEnd();
            return Unit.INSTANCE;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1435687051, v1, -1, "com.kakao.kandinsky.textedit.ui.ComposableSingletons$ColorPanelKt.lambda-1.<anonymous> (ColorPanel.kt:54)");
        }
        j j0 = (j)ColorPanelKt.a.get(v);
        RoundedCornerShape roundedCornerShape0 = RoundedCornerShapeKt.RoundedCornerShape-0680j_4(14.0f);
        Modifier modifier0 = Modifier.Companion;
        Modifier modifier1 = SizeKt.fillMaxSize$default(modifier0, 0.0f, 1, null);
        BorderStroke borderStroke0 = j0.c;
        if(borderStroke0 != null) {
            Modifier modifier2 = BorderKt.border(modifier0, borderStroke0, roundedCornerShape0);
            if(modifier2 != null) {
                modifier0 = modifier2;
            }
        }
        BoxKt.Box(BackgroundKt.background-bw27NRU(modifier1.then(modifier0), j0.a, roundedCornerShape0), ((Composer)object2), 0);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

