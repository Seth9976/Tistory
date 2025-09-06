package kotlin.ranges;

import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.collections.IntIterator;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000B\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u001F\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0004\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001A\u00020\bH\u0096\u0002¢\u0006\u0004\b\t\u0010\nJ\u000F\u0010\u000B\u001A\u00020\u0002H\u0016¢\u0006\u0004\b\u000B\u0010\fR\u0017\u0010\u0005\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u000E\u001A\u0004\b\u000F\u0010\f¨\u0006\u0010"}, d2 = {"Lkotlin/ranges/IntProgressionIterator;", "Lkotlin/collections/IntIterator;", "", "first", "last", "step", "<init>", "(III)V", "", "hasNext", "()Z", "nextInt", "()I", "a", "I", "getStep", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class IntProgressionIterator extends IntIterator {
    public final int a;
    public final int b;
    public boolean c;
    public int d;

    public IntProgressionIterator(int v, int v1, int v2) {
        this.a = v2;
        this.b = v1;
        boolean z = false;
        if(v2 <= 0) {
            if(v >= v1) {
                z = true;
            }
        }
        else if(v <= v1) {
            z = true;
        }
        this.c = z;
        if(!z) {
            v = v1;
        }
        this.d = v;
    }

    public final int getStep() {
        return this.a;
    }

    @Override
    public boolean hasNext() {
        return this.c;
    }

    @Override  // kotlin.collections.IntIterator
    public int nextInt() {
        int v = this.d;
        if(v == this.b) {
            if(!this.c) {
                throw new NoSuchElementException();
            }
            this.c = false;
            return v;
        }
        this.d = this.a + v;
        return v;
    }
}

