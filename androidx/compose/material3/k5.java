package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.window.DialogProperties;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

public final class k5 extends Lambda implements Function2 {
    public final Shape A;
    public final float B;
    public final DatePickerColors C;
    public final DialogProperties D;
    public final Function3 E;
    public final int F;
    public final int G;
    public final Function0 w;
    public final Function2 x;
    public final Modifier y;
    public final Function2 z;

    public k5(Function0 function00, Function2 function20, Modifier modifier0, Function2 function21, Shape shape0, float f, DatePickerColors datePickerColors0, DialogProperties dialogProperties0, Function3 function30, int v, int v1) {
        this.w = function00;
        this.x = function20;
        this.y = modifier0;
        this.z = function21;
        this.A = shape0;
        this.B = f;
        this.C = datePickerColors0;
        this.D = dialogProperties0;
        this.E = function30;
        this.F = v;
        this.G = v1;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        DatePickerDialog_androidKt.DatePickerDialog-GmEhDVc(this.w, this.x, this.y, this.z, this.A, this.B, this.C, this.D, this.E, ((Composer)object0), (this.F | 1) & -920350135 | ((0x24924924 & (this.F | 1)) >> 1 | 306783378 & (this.F | 1)) | (306783378 & (this.F | 1)) << 1 & (0x24924924 & (this.F | 1)), this.G);
        return Unit.INSTANCE;
    }
}

