package androidx.compose.foundation.text.selection;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class e extends Lambda implements Function2 {
    public final long A;
    public final Modifier B;
    public final int C;
    public final int D;
    public final OffsetProvider w;
    public final boolean x;
    public final ResolvedTextDirection y;
    public final boolean z;

    public e(OffsetProvider offsetProvider0, boolean z, ResolvedTextDirection resolvedTextDirection0, boolean z1, long v, Modifier modifier0, int v1, int v2) {
        this.w = offsetProvider0;
        this.x = z;
        this.y = resolvedTextDirection0;
        this.z = z1;
        this.A = v;
        this.B = modifier0;
        this.C = v1;
        this.D = v2;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        AndroidSelectionHandles_androidKt.SelectionHandle-pzduO1o(this.w, this.x, this.y, this.z, this.A, this.B, ((Composer)object0), (this.C | 1) & -920350135 | ((0x24924924 & (this.C | 1)) >> 1 | 306783378 & (this.C | 1)) | (306783378 & (this.C | 1)) << 1 & (0x24924924 & (this.C | 1)), this.D);
        return Unit.INSTANCE;
    }
}

