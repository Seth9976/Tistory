package eb;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.IconKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.text.style.TextAlign;
import com.kakao.kandinsky.textedit.R.drawable;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class s extends Lambda implements Function2 {
    public final TextAlign w;

    public s(TextAlign textAlign0) {
        this.w = textAlign0;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        int v1;
        int v = ((Number)object1).intValue();
        if((v & 11) == 2 && ((Composer)object0).getSkipping()) {
            ((Composer)object0).skipToGroupEnd();
            return Unit.INSTANCE;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x5F81BFB0, v, -1, "com.kakao.kandinsky.textedit.ui.AlignButton.<anonymous> (TextStyleAndFontPanel.kt:233)");
        }
        TextAlign textAlign0 = this.w;
        if((textAlign0 == null ? false : TextAlign.equals-impl0(textAlign0.unbox-impl(), 3))) {
            v1 = drawable.style_align_center;
        }
        else if((textAlign0 == null ? false : TextAlign.equals-impl0(textAlign0.unbox-impl(), 2))) {
            v1 = drawable.style_align_right;
        }
        else {
            v1 = (textAlign0 == null ? false : TextAlign.equals-impl0(textAlign0.unbox-impl(), 1)) ? drawable.style_align_left : drawable.style_align_center;
        }
        IconKt.Icon-ww6aTOc(PainterResources_androidKt.painterResource(v1, ((Composer)object0), 0), null, SizeKt.size-3ABfNKs(Modifier.Companion, 28.0f), 0L, ((Composer)object0), 440, 8);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

