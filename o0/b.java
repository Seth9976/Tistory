package o0;

import androidx.compose.foundation.text.modifiers.TextAnnotatedStringNode;
import androidx.compose.ui.graphics.ColorProducer;
import androidx.compose.ui.text.TextLayoutInput;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class b extends Lambda implements Function1 {
    public final TextAnnotatedStringNode w;

    public b(TextAnnotatedStringNode textAnnotatedStringNode0) {
        this.w = textAnnotatedStringNode0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        TextAnnotatedStringNode textAnnotatedStringNode0 = this.w;
        TextLayoutResult textLayoutResult0 = textAnnotatedStringNode0.b().getLayoutOrNull();
        if(textLayoutResult0 != null) {
            ColorProducer colorProducer0 = textAnnotatedStringNode0.y;
            TextLayoutResult textLayoutResult1 = TextLayoutResult.copy-O0kMr_c$default(textLayoutResult0, new TextLayoutInput(textLayoutResult0.getLayoutInput().getText(), TextStyle.merge-dA7vx0o$default(textAnnotatedStringNode0.o, (colorProducer0 == null ? 0L : colorProducer0.invoke-0d7_KjU()), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, 0, 0, null, null, 0xFFFFFE, null), textLayoutResult0.getLayoutInput().getPlaceholders(), textLayoutResult0.getLayoutInput().getMaxLines(), textLayoutResult0.getLayoutInput().getSoftWrap(), textLayoutResult0.getLayoutInput().getOverflow-gIe3tQ8(), textLayoutResult0.getLayoutInput().getDensity(), textLayoutResult0.getLayoutInput().getLayoutDirection(), textLayoutResult0.getLayoutInput().getFontFamilyResolver(), textLayoutResult0.getLayoutInput().getConstraints-msEJaDk(), null), 0L, 2, null);
            if(textLayoutResult1 != null) {
                ((List)object0).add(textLayoutResult1);
                return textLayoutResult1 == null ? false : true;
            }
        }
        return false;
    }
}

