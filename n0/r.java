package n0;

import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref.LongRef;

public final class r extends Lambda implements Function0 {
    public final LongRef w;
    public final TextFieldSelectionState x;
    public final LongRef y;

    public r(LongRef ref$LongRef0, TextFieldSelectionState textFieldSelectionState0, LongRef ref$LongRef1) {
        this.w = ref$LongRef0;
        this.x = textFieldSelectionState0;
        this.y = ref$LongRef1;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        TextFieldSelectionState.b(this.w, this.x, this.y);
        return Unit.INSTANCE;
    }
}

