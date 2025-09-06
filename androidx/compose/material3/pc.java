package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class pc extends Lambda implements Function2 {
    public final Function2 A;
    public final int B;
    public final int C;
    public final int w;
    public final ColorScheme x;
    public final Shapes y;
    public final Typography z;

    public pc(ColorScheme colorScheme0, Shapes shapes0, Typography typography0, Function2 function20, int v, int v1, int v2) {
        this.w = v2;
        this.x = colorScheme0;
        this.y = shapes0;
        this.z = typography0;
        this.A = function20;
        this.B = v;
        this.C = v1;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        if(this.w != 0) {
            ((Number)object1).intValue();
            MaterialThemeKt.MaterialTheme(this.x, this.y, this.z, this.A, ((Composer)object0), (this.B | 1) & -920350135 | ((0x24924924 & (this.B | 1)) >> 1 | 306783378 & (this.B | 1)) | (306783378 & (this.B | 1)) << 1 & (0x24924924 & (this.B | 1)), this.C);
            return Unit.INSTANCE;
        }
        ((Number)object1).intValue();
        MaterialThemeKt.MaterialExpressiveTheme(this.x, this.y, this.z, this.A, ((Composer)object0), (this.B | 1) & -920350135 | ((0x24924924 & (this.B | 1)) >> 1 | 306783378 & (this.B | 1)) | (306783378 & (this.B | 1)) << 1 & (0x24924924 & (this.B | 1)), this.C);
        return Unit.INSTANCE;
    }
}

