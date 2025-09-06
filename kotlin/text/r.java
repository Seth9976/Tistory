package kotlin.text;

import java.util.List;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class r extends Lambda implements Function2 {
    public final int w;
    public final boolean x;
    public final Object y;

    public r(Object object0, boolean z, int v) {
        this.w = v;
        this.y = object0;
        this.x = z;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        if(this.w != 0) {
            Intrinsics.checkNotNullParameter(((CharSequence)object0), "$this$$receiver");
            Pair pair0 = StringsKt__StringsKt.a(((CharSequence)object0), ((List)this.y), ((Number)object1).intValue(), this.x, false);
            return pair0 != null ? TuplesKt.to(pair0.getFirst(), ((String)pair0.getSecond()).length()) : null;
        }
        Intrinsics.checkNotNullParameter(((CharSequence)object0), "$this$$receiver");
        int v = StringsKt__StringsKt.indexOfAny(((CharSequence)object0), ((char[])this.y), ((Number)object1).intValue(), this.x);
        return v >= 0 ? TuplesKt.to(v, 1) : null;
    }
}

