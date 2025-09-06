package androidx.compose.material3;

import java.util.Locale;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.IntRange;

public final class q8 extends Lambda implements Function0 {
    public final int A;
    public final SelectableDates B;
    public final Locale C;
    public final Long w;
    public final Long x;
    public final Long y;
    public final IntRange z;

    public q8(Locale locale0, Long long0, Long long1, Long long2, IntRange intRange0, int v, SelectableDates selectableDates0) {
        this.w = long0;
        this.x = long1;
        this.y = long2;
        this.z = intRange0;
        this.A = v;
        this.B = selectableDates0;
        this.C = locale0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return new r8(this.C, this.w, this.x, this.y, this.z, this.A, this.B);
    }
}

