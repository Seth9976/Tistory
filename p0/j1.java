package p0;

import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.material.BottomNavigationKt;
import androidx.compose.material.NavigationRailKt;
import androidx.compose.runtime.Composer;
import androidx.constraintlayout.compose.Measurer;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class j1 extends Lambda implements Function2 {
    public final int A;
    public final int w;
    public final Object x;
    public final Object y;
    public final float z;

    public j1(Object object0, Object object1, float f, int v, int v1) {
        this.w = v1;
        this.x = object0;
        this.y = object1;
        this.z = f;
        this.A = v;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        switch(this.w) {
            case 0: {
                BottomNavigationKt.access$BottomNavigationItemBaselineLayout(((Function2)this.x), ((Function2)this.y), this.z, ((Composer)object0), (this.A | 1) & -920350135 | ((0x24924924 & (this.A | 1)) >> 1 | 306783378 & (this.A | 1)) | (306783378 & (this.A | 1)) << 1 & (0x24924924 & (this.A | 1)));
                return Unit.INSTANCE;
            }
            case 1: {
                NavigationRailKt.access$NavigationRailItemBaselineLayout(((Function2)this.x), ((Function2)this.y), this.z, ((Composer)object0), (this.A | 1) & -920350135 | ((0x24924924 & (this.A | 1)) >> 1 | 306783378 & (this.A | 1)) | (306783378 & (this.A | 1)) << 1 & (0x24924924 & (this.A | 1)));
                return Unit.INSTANCE;
            }
            default: {
                ((Measurer)this.x).drawDebugBounds(((BoxScope)this.y), this.z, ((Composer)object0), this.A | 1);
                return Unit.INSTANCE;
            }
        }
    }
}

