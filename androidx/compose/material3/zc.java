package androidx.compose.material3;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class zc extends Lambda implements Function2 {
    public final Function2 A;
    public final boolean B;
    public final MenuItemColors C;
    public final PaddingValues D;
    public final MutableInteractionSource E;
    public final int F;
    public final Function2 w;
    public final Function0 x;
    public final Modifier y;
    public final Function2 z;

    public zc(Function2 function20, Function0 function00, Modifier modifier0, Function2 function21, Function2 function22, boolean z, MenuItemColors menuItemColors0, PaddingValues paddingValues0, MutableInteractionSource mutableInteractionSource0, int v) {
        this.w = function20;
        this.x = function00;
        this.y = modifier0;
        this.z = function21;
        this.A = function22;
        this.B = z;
        this.C = menuItemColors0;
        this.D = paddingValues0;
        this.E = mutableInteractionSource0;
        this.F = v;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        MenuKt.DropdownMenuItemContent(this.w, this.x, this.y, this.z, this.A, this.B, this.C, this.D, this.E, ((Composer)object0), (this.F | 1) & -920350135 | ((0x24924924 & (this.F | 1)) >> 1 | 306783378 & (this.F | 1)) | (306783378 & (this.F | 1)) << 1 & (0x24924924 & (this.F | 1)));
        return Unit.INSTANCE;
    }
}

