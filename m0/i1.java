package m0;

import androidx.compose.foundation.text.input.TextFieldState.NotifyImeListener;
import androidx.compose.foundation.text.input.internal.TransformedTextFieldState;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class i1 extends Lambda implements Function1 {
    public final TransformedTextFieldState w;
    public final NotifyImeListener x;

    public i1(TransformedTextFieldState transformedTextFieldState0, NotifyImeListener textFieldState$NotifyImeListener0) {
        this.w = transformedTextFieldState0;
        this.x = textFieldState$NotifyImeListener0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Throwable throwable0 = (Throwable)object0;
        this.w.a.removeNotifyImeListener$foundation_release(this.x);
        return Unit.INSTANCE;
    }
}

