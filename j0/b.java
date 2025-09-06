package j0;

import androidx.compose.foundation.text.AndroidCursorHandle_androidKt;
import androidx.compose.foundation.text.selection.OffsetProvider;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class b extends Lambda implements Function2 {
    public final int A;
    public final OffsetProvider w;
    public final Modifier x;
    public final long y;
    public final int z;

    public b(OffsetProvider offsetProvider0, Modifier modifier0, long v, int v1, int v2) {
        this.w = offsetProvider0;
        this.x = modifier0;
        this.y = v;
        this.z = v1;
        this.A = v2;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        AndroidCursorHandle_androidKt.CursorHandle-USBMPiE(this.w, this.x, this.y, ((Composer)object0), (this.z | 1) & -920350135 | ((0x24924924 & (this.z | 1)) >> 1 | 306783378 & (this.z | 1)) | (306783378 & (this.z | 1)) << 1 & (0x24924924 & (this.z | 1)), this.A);
        return Unit.INSTANCE;
    }
}

