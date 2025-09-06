package o0;

import androidx.compose.foundation.text.modifiers.ParagraphLayoutCache;
import androidx.compose.foundation.text.modifiers.TextStringSimpleNode;
import androidx.compose.ui.graphics.ColorProducer;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class d extends Lambda implements Function1 {
    public final TextStringSimpleNode w;

    public d(TextStringSimpleNode textStringSimpleNode0) {
        this.w = textStringSimpleNode0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        ParagraphLayoutCache paragraphLayoutCache0 = this.w.b();
        ColorProducer colorProducer0 = this.w.u;
        TextLayoutResult textLayoutResult0 = paragraphLayoutCache0.slowCreateTextLayoutResultOrNull(TextStyle.merge-dA7vx0o$default(this.w.o, (colorProducer0 == null ? 0L : colorProducer0.invoke-0d7_KjU()), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, 0, 0, null, null, 0xFFFFFE, null));
        if(textLayoutResult0 != null) {
            ((List)object0).add(textLayoutResult0);
            return textLayoutResult0 == null ? false : true;
        }
        return false;
    }
}

