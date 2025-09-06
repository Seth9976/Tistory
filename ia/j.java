package ia;

import androidx.compose.runtime.Composer;
import com.kakao.kandinsky.home.HomeScreenKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class j extends Lambda implements Function2 {
    public final int w;
    public final int x;
    public final Function0 y;
    public final int z;

    public j(int v, int v1, int v2, Function0 function00) {
        this.w = v;
        this.x = v1;
        this.y = function00;
        this.z = v2;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        HomeScreenKt.access$ImageIndex(this.w, this.x, this.y, ((Composer)object0), (this.z | 1) & -920350135 | ((0x24924924 & (this.z | 1)) >> 1 | 306783378 & (this.z | 1)) | (306783378 & (this.z | 1)) << 1 & (0x24924924 & (this.z | 1)));
        return Unit.INSTANCE;
    }
}

