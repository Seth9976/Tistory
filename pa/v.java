package pa;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import com.kakao.kandinsky.resize.ReSizeScreenKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class v extends Lambda implements Function2 {
    public final Function0 A;
    public final int B;
    public final int C;
    public final Modifier w;
    public final String x;
    public final boolean y;
    public final boolean z;

    public v(Modifier modifier0, String s, boolean z, boolean z1, Function0 function00, int v, int v1) {
        this.w = modifier0;
        this.x = s;
        this.y = z;
        this.z = z1;
        this.A = function00;
        this.B = v;
        this.C = v1;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        ReSizeScreenKt.access$ResizeTypeButton(this.w, this.x, this.y, this.z, this.A, ((Composer)object0), (this.B | 1) & -920350135 | ((0x24924924 & (this.B | 1)) >> 1 | 306783378 & (this.B | 1)) | (306783378 & (this.B | 1)) << 1 & (0x24924924 & (this.B | 1)), this.C);
        return Unit.INSTANCE;
    }
}

