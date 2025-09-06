package androidx.compose.material3;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class pf extends Lambda implements Function2 {
    public final int A;
    public final int B;
    public final Object C;
    public final Object D;
    public final Object E;
    public final int w;
    public final Modifier x;
    public final boolean y;
    public final long z;

    public pf(SliderDefaults sliderDefaults0, MutableInteractionSource mutableInteractionSource0, Modifier modifier0, SliderColors sliderColors0, boolean z, long v, int v1, int v2) {
        this.w = 1;
        this.C = sliderDefaults0;
        this.D = mutableInteractionSource0;
        this.x = modifier0;
        this.E = sliderColors0;
        this.y = z;
        this.z = v;
        this.A = v1;
        this.B = v2;
        super(2);
    }

    public pf(Function2 function20, Modifier modifier0, DrawerState drawerState0, boolean z, long v, Function2 function21, int v1, int v2) {
        this.w = 0;
        this.C = function20;
        this.x = modifier0;
        this.E = drawerState0;
        this.y = z;
        this.z = v;
        this.D = function21;
        this.A = v1;
        this.B = v2;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        if(this.w != 0) {
            ((Number)object1).intValue();
            ((SliderDefaults)this.C).Thumb-9LiSoMs(((MutableInteractionSource)this.D), this.x, ((SliderColors)this.E), this.y, this.z, ((Composer)object0), (this.A | 1) & -920350135 | ((0x24924924 & (this.A | 1)) >> 1 | 306783378 & (this.A | 1)) | (306783378 & (this.A | 1)) << 1 & (0x24924924 & (this.A | 1)), this.B);
            return Unit.INSTANCE;
        }
        ((Number)object1).intValue();
        NavigationDrawerKt.ModalNavigationDrawer-FHprtrg(((Function2)this.C), this.x, ((DrawerState)this.E), this.y, this.z, ((Function2)this.D), ((Composer)object0), (this.A | 1) & -920350135 | ((0x24924924 & (this.A | 1)) >> 1 | 306783378 & (this.A | 1)) | (306783378 & (this.A | 1)) << 1 & (0x24924924 & (this.A | 1)), this.B);
        return Unit.INSTANCE;
    }
}

