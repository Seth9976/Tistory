package kf;

import java.util.HashSet;
import java.util.Iterator;
import kotlin.collections.AbstractIterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

public final class a extends AbstractIterator {
    public final Iterator c;
    public final Function1 d;
    public final HashSet e;

    public a(Iterator iterator0, Function1 function10) {
        Intrinsics.checkNotNullParameter(iterator0, "source");
        Intrinsics.checkNotNullParameter(function10, "keySelector");
        super();
        this.c = iterator0;
        this.d = function10;
        this.e = new HashSet();
    }

    @Override  // kotlin.collections.AbstractIterator
    public final void computeNext() {
        while(true) {
            Iterator iterator0 = this.c;
            if(!iterator0.hasNext()) {
                break;
            }
            Object object0 = iterator0.next();
            Object object1 = this.d.invoke(object0);
            if(this.e.add(object1)) {
                this.setNext(object0);
                return;
            }
        }
        this.done();
    }
}

