package f0;

import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.KType;

public final class c extends Lambda implements Function0 {
    public final int w;
    public final List x;

    public c(List list0, int v) {
        this.w = v;
        this.x = list0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch(this.w) {
            case 0: {
                Object object1 = this.x.get(2);
                Intrinsics.checkNotNull(object1, "null cannot be cast to non-null type kotlin.Int");
                return (Integer)object1;
            }
            case 1: {
                return ((KType)this.x.get(0)).getClassifier();
            }
            case 2: {
                return ((KType)this.x.get(0)).getClassifier();
            }
            case 3: {
                return this.x;
            }
            case 4: {
                return this.x;
            }
            default: {
                Object object0 = this.x.get(2);
                Intrinsics.checkNotNull(object0, "null cannot be cast to non-null type kotlin.Int");
                return (Integer)object0;
            }
        }
    }
}

