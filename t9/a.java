package t9;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.geometry.Rect;
import com.kakao.kandinsky.border.BorderDecorationKt;
import com.kakao.kandinsky.core.kdphoto.Border;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class a extends Lambda implements Function2 {
    public final int A;
    public final int w;
    public final Border x;
    public final Rect y;
    public final boolean z;

    public a(Border border0, Rect rect0, boolean z, int v, int v1) {
        this.w = v1;
        this.x = border0;
        this.y = rect0;
        this.z = z;
        this.A = v;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        if(this.w != 0) {
            BorderDecorationKt.BorderDecoration(this.x, this.y, this.z, ((Composer)object0), (this.A | 1) & -920350135 | ((0x24924924 & (this.A | 1)) >> 1 | 306783378 & (this.A | 1)) | (306783378 & (this.A | 1)) << 1 & (0x24924924 & (this.A | 1)));
            return Unit.INSTANCE;
        }
        BorderDecorationKt.BorderDecoration(this.x, this.y, this.z, ((Composer)object0), (this.A | 1) & -920350135 | ((0x24924924 & (this.A | 1)) >> 1 | 306783378 & (this.A | 1)) | (306783378 & (this.A | 1)) << 1 & (0x24924924 & (this.A | 1)));
        return Unit.INSTANCE;
    }
}

