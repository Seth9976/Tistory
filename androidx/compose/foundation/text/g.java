package androidx.compose.foundation.text;

import androidx.compose.ui.text.input.EditProcessor;
import androidx.compose.ui.text.input.TextInputSession;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref.ObjectRef;

public final class g extends Lambda implements Function1 {
    public final EditProcessor w;
    public final Function1 x;
    public final ObjectRef y;

    public g(EditProcessor editProcessor0, Function1 function10, ObjectRef ref$ObjectRef0) {
        this.w = editProcessor0;
        this.x = function10;
        this.y = ref$ObjectRef0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        TextFieldDelegate.Companion.onEditCommand$foundation_release(((List)object0), this.w, this.x, ((TextInputSession)this.y.element));
        return Unit.INSTANCE;
    }
}

