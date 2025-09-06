package kotlin.io;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.jetbrains.annotations.NotNull;
import wd.m;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010(\n\u0002\u0010\u000E\n\u0002\u0010\u000B\n\u0002\b\u0005\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0004\u001A\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001A\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"kotlin/io/LinesSequence$iterator$1", "", "", "", "hasNext", "()Z", "next", "()Ljava/lang/String;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class LinesSequence.iterator.1 implements Iterator, KMappedMarker {
    public String a;
    public boolean b;
    public final m c;

    public LinesSequence.iterator.1(m m0) {
        this.c = m0;
    }

    @Override
    public boolean hasNext() {
        if(this.a == null && !this.b) {
            String s = this.c.a.readLine();
            this.a = s;
            if(s == null) {
                this.b = true;
            }
        }
        return this.a != null;
    }

    @Override
    public Object next() {
        return this.next();
    }

    @NotNull
    public String next() {
        if(!this.hasNext()) {
            throw new NoSuchElementException();
        }
        String s = this.a;
        this.a = null;
        Intrinsics.checkNotNull(s);
        return s;
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}

