package n6;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import com.google.accompanist.navigation.material.BottomSheetKt;
import com.google.accompanist.navigation.material.BottomSheetNavigator;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class a extends Lambda implements Function2 {
    public final long A;
    public final long B;
    public final long C;
    public final Function2 D;
    public final int E;
    public final int F;
    public final BottomSheetNavigator w;
    public final Modifier x;
    public final Shape y;
    public final float z;

    public a(BottomSheetNavigator bottomSheetNavigator0, Modifier modifier0, Shape shape0, float f, long v, long v1, long v2, Function2 function20, int v3, int v4) {
        this.w = bottomSheetNavigator0;
        this.x = modifier0;
        this.y = shape0;
        this.z = f;
        this.A = v;
        this.B = v1;
        this.C = v2;
        this.D = function20;
        this.E = v3;
        this.F = v4;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        BottomSheetKt.ModalBottomSheetLayout-4erKP6g(this.w, this.x, this.y, this.z, this.A, this.B, this.C, this.D, ((Composer)object0), (this.E | 1) & -920350135 | ((0x24924924 & (this.E | 1)) >> 1 | 306783378 & (this.E | 1)) | (306783378 & (this.E | 1)) << 1 & (0x24924924 & (this.E | 1)), this.F);
        return Unit.INSTANCE;
    }
}

