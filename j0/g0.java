package j0;

import androidx.compose.foundation.text.BasicTextFieldKt;
import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState;
import androidx.compose.runtime.Composer;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class g0 extends Lambda implements Function2 {
    public final int w;
    public final TextFieldSelectionState x;
    public final int y;

    public g0(TextFieldSelectionState textFieldSelectionState0, int v, int v1) {
        this.w = v1;
        this.x = textFieldSelectionState0;
        this.y = v;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        if(this.w != 0) {
            BasicTextFieldKt.TextFieldSelectionHandles(this.x, ((Composer)object0), (this.y | 1) & -920350135 | ((0x24924924 & (this.y | 1)) >> 1 | 306783378 & (this.y | 1)) | (306783378 & (this.y | 1)) << 1 & (0x24924924 & (this.y | 1)));
            return Unit.INSTANCE;
        }
        BasicTextFieldKt.TextFieldCursorHandle(this.x, ((Composer)object0), (this.y | 1) & -920350135 | ((0x24924924 & (this.y | 1)) >> 1 | 306783378 & (this.y | 1)) | (306783378 & (this.y | 1)) << 1 & (0x24924924 & (this.y | 1)));
        return Unit.INSTANCE;
    }
}

