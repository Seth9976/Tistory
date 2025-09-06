package kotlin.ranges;

import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.collections.CharIterator;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u001F\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0004\u001A\u00020\u0002\u0012\u0006\u0010\u0006\u001A\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001A\u00020\tH\u0096\u0002¢\u0006\u0004\b\n\u0010\u000BJ\u000F\u0010\f\u001A\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0006\u001A\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u000E\u0010\u000F\u001A\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lkotlin/ranges/CharProgressionIterator;", "Lkotlin/collections/CharIterator;", "", "first", "last", "", "step", "<init>", "(CCI)V", "", "hasNext", "()Z", "nextChar", "()C", "a", "I", "getStep", "()I", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class CharProgressionIterator extends CharIterator {
    public final int a;
    public final int b;
    public boolean c;
    public int d;

    public CharProgressionIterator(char c, char c1, int v) {
        this.a = v;
        this.b = c1;
        boolean z = false;
        if(v <= 0) {
            if(Intrinsics.compare(c, c1) >= 0) {
                z = true;
            }
        }
        else if(Intrinsics.compare(c, c1) <= 0) {
            z = true;
        }
        this.c = z;
        if(!z) {
            c = c1;
        }
        this.d = c;
    }

    public final int getStep() {
        return this.a;
    }

    @Override
    public boolean hasNext() {
        return this.c;
    }

    @Override  // kotlin.collections.CharIterator
    public char nextChar() {
        int v = this.d;
        if(v == this.b) {
            if(!this.c) {
                throw new NoSuchElementException();
            }
            this.c = false;
            return (char)v;
        }
        this.d = this.a + v;
        return (char)v;
    }
}

