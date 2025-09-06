package m3;

import androidx.core.util.Predicate;

public final class d implements Predicate {
    public final int a;
    public final Predicate b;
    public final Object c;

    public d(Predicate predicate0, Predicate predicate1, int v) {
        this.a = v;
        this.b = predicate0;
        this.c = predicate1;
        super();
    }

    public d(Class class0, Predicate predicate0) {
        this.a = 2;
        super();
        this.c = class0;
        this.b = predicate0;
    }

    @Override  // androidx.core.util.Predicate
    public final boolean test(Object object0) {
        switch(this.a) {
            case 0: {
                return this.b.b(((Predicate)this.c), object0);
            }
            case 1: {
                return this.b.c(((Predicate)this.c), object0);
            }
            default: {
                Class class0 = (Class)this.c;
                if(class0.isInstance(object0)) {
                    Object object1 = class0.cast(object0);
                    return this.b.test(object1);
                }
                return false;
            }
        }
    }
}

