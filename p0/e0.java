package p0;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.material.AndroidMenu_androidKt;
import androidx.compose.material.MenuKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

public final class e0 extends Lambda implements Function2 {
    public final PaddingValues A;
    public final MutableInteractionSource B;
    public final Function3 C;
    public final int D;
    public final int E;
    public final int w;
    public final Function0 x;
    public final Modifier y;
    public final boolean z;

    public e0(Function0 function00, Modifier modifier0, boolean z, PaddingValues paddingValues0, MutableInteractionSource mutableInteractionSource0, Function3 function30, int v, int v1, int v2) {
        this.w = v2;
        this.x = function00;
        this.y = modifier0;
        this.z = z;
        this.A = paddingValues0;
        this.B = mutableInteractionSource0;
        this.C = function30;
        this.D = v;
        this.E = v1;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        if(this.w != 0) {
            ((Number)object1).intValue();
            MenuKt.DropdownMenuItemContent(this.x, this.y, this.z, this.A, this.B, this.C, ((Composer)object0), (this.D | 1) & -920350135 | ((0x24924924 & (this.D | 1)) >> 1 | 306783378 & (this.D | 1)) | (306783378 & (this.D | 1)) << 1 & (0x24924924 & (this.D | 1)), this.E);
            return Unit.INSTANCE;
        }
        ((Number)object1).intValue();
        AndroidMenu_androidKt.DropdownMenuItem(this.x, this.y, this.z, this.A, this.B, this.C, ((Composer)object0), (this.D | 1) & -920350135 | ((0x24924924 & (this.D | 1)) >> 1 | 306783378 & (this.D | 1)) | (306783378 & (this.D | 1)) << 1 & (0x24924924 & (this.D | 1)), this.E);
        return Unit.INSTANCE;
    }
}

