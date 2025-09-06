package eb;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.IconKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.res.PainterResources_androidKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class t extends Lambda implements Function2 {
    public final int w;

    public t(int v) {
        this.w = v;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        int v = ((Number)object1).intValue();
        if((v & 11) == 2 && ((Composer)object0).getSkipping()) {
            ((Composer)object0).skipToGroupEnd();
            return Unit.INSTANCE;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x84A1F272, v, -1, "com.kakao.kandinsky.textedit.ui.StyleToggleButton.<anonymous> (TextStyleAndFontPanel.kt:206)");
        }
        IconKt.Icon-ww6aTOc(PainterResources_androidKt.painterResource(this.w, ((Composer)object0), 0), null, SizeKt.size-3ABfNKs(Modifier.Companion, 28.0f), 0L, ((Composer)object0), 440, 8);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

