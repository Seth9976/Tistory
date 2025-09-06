package j0;

import androidx.compose.foundation.text.input.InputTransformation;
import androidx.compose.foundation.text.input.internal.TransformedTextFieldState;
import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState;
import androidx.compose.ui.hapticfeedback.HapticFeedback;
import androidx.compose.ui.platform.ClipboardManager;
import androidx.compose.ui.platform.TextToolbar;
import androidx.compose.ui.unit.Density;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class x extends Lambda implements Function0 {
    public final ClipboardManager A;
    public final TextToolbar B;
    public final Density C;
    public final boolean D;
    public final boolean E;
    public final boolean F;
    public final TransformedTextFieldState w;
    public final InputTransformation x;
    public final TextFieldSelectionState y;
    public final HapticFeedback z;

    public x(TransformedTextFieldState transformedTextFieldState0, InputTransformation inputTransformation0, TextFieldSelectionState textFieldSelectionState0, HapticFeedback hapticFeedback0, ClipboardManager clipboardManager0, TextToolbar textToolbar0, Density density0, boolean z, boolean z1, boolean z2) {
        this.w = transformedTextFieldState0;
        this.x = inputTransformation0;
        this.y = textFieldSelectionState0;
        this.z = hapticFeedback0;
        this.A = clipboardManager0;
        this.B = textToolbar0;
        this.C = density0;
        this.D = z;
        this.E = z1;
        this.F = z2;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        this.w.update(this.x);
        this.y.update(this.z, this.A, this.B, this.C, this.D, this.E, this.F);
        return Unit.INSTANCE;
    }
}

