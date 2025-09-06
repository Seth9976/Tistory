package eb;

import androidx.compose.runtime.Composer;
import com.kakao.kandinsky.textedit.ui.EditTabBarKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class h extends Lambda implements Function2 {
    public final Function0 A;
    public final int B;
    public final int C;
    public final boolean w;
    public final boolean x;
    public final int y;
    public final int z;

    public h(boolean z, boolean z1, int v, int v1, Function0 function00, int v2, int v3) {
        this.w = z;
        this.x = z1;
        this.y = v;
        this.z = v1;
        this.A = function00;
        this.B = v2;
        this.C = v3;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        EditTabBarKt.c(this.w, this.x, this.y, this.z, this.A, ((Composer)object0), (this.B | 1) & -920350135 | ((0x24924924 & (this.B | 1)) >> 1 | 306783378 & (this.B | 1)) | (306783378 & (this.B | 1)) << 1 & (0x24924924 & (this.B | 1)), this.C);
        return Unit.INSTANCE;
    }
}

