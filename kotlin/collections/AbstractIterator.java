package kotlin.collections;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.markers.KMappedMarker;

@Metadata(d1 = {"\u0000\u001E\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0006\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001A\u00020\u0005H\u0096\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001A\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\b\u0010\tJ\u000F\u0010\u000B\u001A\u00020\nH$¢\u0006\u0004\b\u000B\u0010\u0004J\u0017\u0010\r\u001A\u00020\n2\u0006\u0010\f\u001A\u00028\u0000H\u0004¢\u0006\u0004\b\r\u0010\u000EJ\u000F\u0010\u000F\u001A\u00020\nH\u0004¢\u0006\u0004\b\u000F\u0010\u0004¨\u0006\u0010"}, d2 = {"Lkotlin/collections/AbstractIterator;", "T", "", "<init>", "()V", "", "hasNext", "()Z", "next", "()Ljava/lang/Object;", "", "computeNext", "value", "setNext", "(Ljava/lang/Object;)V", "done", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public abstract class AbstractIterator implements Iterator, KMappedMarker {
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 0x30)
    public final class WhenMappings {
        public static final int[] $EnumSwitchMapping$0;

        static {
            int[] arr_v = new int[i0.values().length];
            try {
                arr_v[2] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[0] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            WhenMappings.$EnumSwitchMapping$0 = arr_v;
        }
    }

    public i0 a;
    public Object b;

    public AbstractIterator() {
        this.a = i0.b;
    }

    public abstract void computeNext();

    public final void done() {
        this.a = i0.c;
    }

    @Override
    public boolean hasNext() {
        i0 i00 = this.a;
        i0 i01 = i0.d;
        if(i00 != i01) {
            switch(i00.ordinal()) {
                case 0: {
                    return true;
                }
                case 2: {
                    return false;
                }
                default: {
                    this.a = i01;
                    this.computeNext();
                    return this.a == i0.a;
                }
            }
        }
        throw new IllegalArgumentException("Failed requirement.");
    }

    @Override
    public Object next() {
        if(!this.hasNext()) {
            throw new NoSuchElementException();
        }
        this.a = i0.b;
        return this.b;
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void setNext(Object object0) {
        this.b = object0;
        this.a = i0.a;
    }
}

