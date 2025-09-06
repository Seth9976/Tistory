package gd;

import io.reactivex.SingleSource;
import io.reactivex.internal.operators.single.SingleToFlowable;
import java.util.Iterator;
import java.util.Map.Entry;
import kotlin.reflect.jvm.internal.impl.protobuf.LazyField;
import kotlin.reflect.jvm.internal.impl.protobuf.UnmodifiableLazyStringList;
import kotlin.reflect.jvm.internal.impl.protobuf.g;

public final class w implements Iterator {
    public final int a;
    public Iterator b;

    public w() {
        this.a = 1;
        super();
    }

    public w(Iterator iterator0) {
        this.a = 0;
        super();
        this.b = iterator0;
    }

    public w(UnmodifiableLazyStringList unmodifiableLazyStringList0) {
        this.a = 2;
        super();
        this.b = unmodifiableLazyStringList0.a.iterator();
    }

    @Override
    public final boolean hasNext() {
        switch(this.a) {
            case 0: {
                return this.b.hasNext();
            }
            case 1: {
                return this.b.hasNext();
            }
            default: {
                return this.b.hasNext();
            }
        }
    }

    @Override
    public final Object next() {
        switch(this.a) {
            case 0: {
                Object object1 = this.b.next();
                return new SingleToFlowable(((SingleSource)object1));
            }
            case 1: {
                Object object2 = this.b.next();
                if(((Map.Entry)object2).getValue() instanceof LazyField) {
                    g g0 = new g();  // 初始化器: Ljava/lang/Object;-><init>()V
                    g0.a = (Map.Entry)object2;
                    return g0;
                }
                return (Map.Entry)object2;
            }
            default: {
                return this.b.next();
            }
        }
    }

    @Override
    public final void remove() {
        switch(this.a) {
            case 0: {
                throw new UnsupportedOperationException();
            }
            case 1: {
                this.b.remove();
                return;
            }
            default: {
                throw new UnsupportedOperationException();
            }
        }
    }
}

