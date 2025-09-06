package eb;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.geometry.Rect;
import com.kakao.kandinsky.textedit.ui.TextInputKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class k extends Lambda implements Function2 {
    public final long w;
    public final Rect x;
    public final float y;
    public final int z;

    public k(long v, Rect rect0, float f, int v1) {
        this.w = v;
        this.x = rect0;
        this.y = f;
        this.z = v1;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        TextInputKt.access$DrawBackground-cq6XJ1M(this.w, this.x, this.y, ((Composer)object0), (this.z | 1) & -920350135 | ((0x24924924 & (this.z | 1)) >> 1 | 306783378 & (this.z | 1)) | (306783378 & (this.z | 1)) << 1 & (0x24924924 & (this.z | 1)));
        return Unit.INSTANCE;
    }
}

