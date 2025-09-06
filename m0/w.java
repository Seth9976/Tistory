package m0;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref.IntRef;
import kotlin.text.MatchResult;

public final class w extends Lambda implements Function1 {
    public final IntRef w;
    public final IntRef x;

    public w(IntRef ref$IntRef0, IntRef ref$IntRef1) {
        this.w = ref$IntRef0;
        this.x = ref$IntRef1;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        IntRef ref$IntRef0 = this.w;
        if(ref$IntRef0.element == -1) {
            ref$IntRef0.element = ((MatchResult)object0).getRange().getFirst();
        }
        this.x.element = ((MatchResult)object0).getRange().getLast() + 1;
        return "";
    }
}

