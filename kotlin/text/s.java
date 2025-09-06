package kotlin.text;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.IntRange;

public final class s extends Lambda implements Function1 {
    public final int w;
    public final CharSequence x;

    public s(CharSequence charSequence0, int v) {
        this.w = v;
        this.x = charSequence0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        if(this.w != 0) {
            Intrinsics.checkNotNullParameter(((IntRange)object0), "it");
            return StringsKt__StringsKt.substring(this.x, ((IntRange)object0));
        }
        Intrinsics.checkNotNullParameter(((IntRange)object0), "it");
        return StringsKt__StringsKt.substring(this.x, ((IntRange)object0));
    }
}

