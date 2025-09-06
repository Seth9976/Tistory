package eb;

import androidx.compose.ui.text.style.TextAlign;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class r extends Lambda implements Function0 {
    public final TextAlign w;
    public final Function1 x;

    public r(TextAlign textAlign0, Function1 function10) {
        this.w = textAlign0;
        this.x = function10;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        boolean z = false;
        TextAlign textAlign0 = this.w;
        Function1 function10 = this.x;
        if((textAlign0 == null ? false : TextAlign.equals-impl0(textAlign0.unbox-impl(), 3))) {
            function10.invoke(TextAlign.box-impl(2));
            return Unit.INSTANCE;
        }
        if((textAlign0 == null ? false : TextAlign.equals-impl0(textAlign0.unbox-impl(), 2))) {
            function10.invoke(TextAlign.box-impl(1));
            return Unit.INSTANCE;
        }
        if(textAlign0 != null) {
            z = TextAlign.equals-impl0(textAlign0.unbox-impl(), 1);
        }
        if(z) {
            function10.invoke(TextAlign.box-impl(3));
            return Unit.INSTANCE;
        }
        function10.invoke(TextAlign.box-impl(2));
        return Unit.INSTANCE;
    }
}

