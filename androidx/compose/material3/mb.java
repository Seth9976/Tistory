package androidx.compose.material3;

import androidx.compose.material.TextFieldImplKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.text.TextStyle;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class mb extends Lambda implements Function2 {
    public final int A;
    public final int B;
    public final Object C;
    public final int w;
    public final Object x;
    public final Object y;
    public final long z;

    public mb(long v, TextStyle textStyle0, Float float0, Function2 function20, int v1, int v2) {
        this.w = 2;
        this.z = v;
        this.C = textStyle0;
        this.x = float0;
        this.y = function20;
        this.A = v1;
        this.B = v2;
        super(2);
    }

    public mb(Object object0, String s, Modifier modifier0, long v, int v1, int v2, int v3) {
        this.w = v3;
        this.C = object0;
        this.x = s;
        this.y = modifier0;
        this.z = v;
        this.A = v1;
        this.B = v2;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        switch(this.w) {
            case 0: {
                ((Number)object1).intValue();
                IconKt.Icon-ww6aTOc(((ImageVector)this.C), ((String)this.x), ((Modifier)this.y), this.z, ((Composer)object0), (this.A | 1) & -920350135 | ((0x24924924 & (this.A | 1)) >> 1 | 306783378 & (this.A | 1)) | (306783378 & (this.A | 1)) << 1 & (0x24924924 & (this.A | 1)), this.B);
                return Unit.INSTANCE;
            }
            case 1: {
                ((Number)object1).intValue();
                IconKt.Icon-ww6aTOc(((ImageBitmap)this.C), ((String)this.x), ((Modifier)this.y), this.z, ((Composer)object0), (this.A | 1) & -920350135 | ((0x24924924 & (this.A | 1)) >> 1 | 306783378 & (this.A | 1)) | (306783378 & (this.A | 1)) << 1 & (0x24924924 & (this.A | 1)), this.B);
                return Unit.INSTANCE;
            }
            default: {
                ((Number)object1).intValue();
                TextFieldImplKt.Decoration-euL9pac(this.z, ((TextStyle)this.C), ((Float)this.x), ((Function2)this.y), ((Composer)object0), (this.A | 1) & -920350135 | ((0x24924924 & (this.A | 1)) >> 1 | 306783378 & (this.A | 1)) | (306783378 & (this.A | 1)) << 1 & (0x24924924 & (this.A | 1)), this.B);
                return Unit.INSTANCE;
            }
        }
    }
}

