package eb;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import com.kakao.kandinsky.textedit.ui.TextStyleAndFontPanelKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class u extends Lambda implements Function2 {
    public final int A;
    public final int B;
    public final Modifier w;
    public final boolean x;
    public final Function1 y;
    public final int z;

    public u(Modifier modifier0, boolean z, Function1 function10, int v, int v1, int v2) {
        this.w = modifier0;
        this.x = z;
        this.y = function10;
        this.z = v;
        this.A = v1;
        this.B = v2;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        TextStyleAndFontPanelKt.e(this.w, this.x, this.y, this.z, ((Composer)object0), (this.A | 1) & -920350135 | ((0x24924924 & (this.A | 1)) >> 1 | 306783378 & (this.A | 1)) | (306783378 & (this.A | 1)) << 1 & (0x24924924 & (this.A | 1)), this.B);
        return Unit.INSTANCE;
    }
}

