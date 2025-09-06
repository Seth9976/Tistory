package androidx.compose.material3;

import androidx.compose.foundation.text.CoreTextFieldKt;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.runtime.Composer;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class p9 extends Lambda implements Function2 {
    public final int w;
    public final boolean x;
    public final int y;
    public final Object z;

    public p9(int v, boolean z, int v1, Object object0) {
        this.w = v1;
        this.z = object0;
        this.x = z;
        this.y = v;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        if(this.w != 0) {
            CoreTextFieldKt.access$SelectionToolbarAndHandles(((TextFieldSelectionManager)this.z), this.x, ((Composer)object0), (this.y | 1) & -920350135 | ((0x24924924 & (this.y | 1)) >> 1 | 306783378 & (this.y | 1)) | (306783378 & (this.y | 1)) << 1 & (0x24924924 & (this.y | 1)));
            return Unit.INSTANCE;
        }
        ((ExposedDropdownMenuDefaults)this.z).TrailingIcon(this.x, ((Composer)object0), (this.y | 1) & -920350135 | ((0x24924924 & (this.y | 1)) >> 1 | 306783378 & (this.y | 1)) | (306783378 & (this.y | 1)) << 1 & (0x24924924 & (this.y | 1)));
        return Unit.INSTANCE;
    }
}

