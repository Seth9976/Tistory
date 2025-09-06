package z9;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import com.kakao.kandinsky.crop.contract.TouchLinePoint;
import com.kakao.kandinsky.crop.ui.CropBoxKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class h extends Lambda implements Function2 {
    public final Function0 A;
    public final int B;
    public final boolean w;
    public final long x;
    public final long y;
    public final TouchLinePoint z;

    public h(boolean z, long v, long v1, TouchLinePoint touchLinePoint0, Function0 function00, int v2) {
        this.w = z;
        this.x = v;
        this.y = v1;
        this.z = touchLinePoint0;
        this.A = function00;
        this.B = v2;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        CropBoxKt.b(this.w, this.x, this.y, this.z, this.A, ((Composer)object0), RecomposeScopeImplKt.updateChangedFlags(this.B | 1));
        return Unit.INSTANCE;
    }
}

