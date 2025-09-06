package androidx.datastore.preferences.protobuf;

import java.util.Iterator;
import java.util.Map.Entry;

public final class t1 implements Iterator {
    public final int a;
    public final Iterator b;

    public t1(UnmodifiableLazyStringList unmodifiableLazyStringList0) {
        this.a = 1;
        super();
        this.b = unmodifiableLazyStringList0.a.iterator();
    }

    public t1(Iterator iterator0) {
        this.a = 0;
        super();
        this.b = iterator0;
    }

    @Override
    public final boolean hasNext() {
        return this.b.hasNext();
    }

    @Override
    public final Object next() {
        if(this.a != 0) {
            return this.b.next();
        }
        Object object1 = this.b.next();
        if(((Map.Entry)object1).getValue() instanceof LazyField) {
            s1 s10 = new s1();  // 初始化器: Ljava/lang/Object;-><init>()V
            s10.a = (Map.Entry)object1;
            return s10;
        }
        return (Map.Entry)object1;
    }

    @Override
    public final void remove() {
        if(this.a != 0) {
            throw new UnsupportedOperationException();
        }
        this.b.remove();
    }
}

