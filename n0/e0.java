package n0;

import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState;
import androidx.compose.ui.geometry.Rect;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowCollector;

public final class e0 implements FlowCollector {
    public final TextFieldSelectionState a;

    public e0(TextFieldSelectionState textFieldSelectionState0) {
        this.a = textFieldSelectionState0;
    }

    @Override  // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object object0, Continuation continuation0) {
        boolean z = Intrinsics.areEqual(((Rect)object0), Rect.Companion.getZero());
        TextFieldSelectionState textFieldSelectionState0 = this.a;
        if(z) {
            textFieldSelectionState0.e();
            return Unit.INSTANCE;
        }
        TextFieldSelectionState.access$showTextToolbar(textFieldSelectionState0, ((Rect)object0));
        return Unit.INSTANCE;
    }
}

