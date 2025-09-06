package j0;

import androidx.compose.foundation.text.TextLinkScope;
import androidx.compose.ui.text.TextLayoutResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class r0 extends Lambda implements Function1 {
    public final TextLinkScope w;
    public final Function1 x;

    public r0(TextLinkScope textLinkScope0, Function1 function10) {
        this.w = textLinkScope0;
        this.x = function10;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        TextLinkScope textLinkScope0 = this.w;
        if(textLinkScope0 != null) {
            textLinkScope0.setTextLayoutResult(((TextLayoutResult)object0));
        }
        Function1 function10 = this.x;
        if(function10 != null) {
            function10.invoke(((TextLayoutResult)object0));
        }
        return Unit.INSTANCE;
    }
}

