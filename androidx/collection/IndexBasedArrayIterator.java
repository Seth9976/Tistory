package androidx.collection;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.markers.KMutableIterator;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010)\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0007\b \u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u000F\u0012\u0006\u0010\u0004\u001A\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001A\u00028\u00002\u0006\u0010\u0007\u001A\u00020\u0003H$¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000B\u001A\u00020\n2\u0006\u0010\u0007\u001A\u00020\u0003H$¢\u0006\u0004\b\u000B\u0010\u0006J\u0010\u0010\r\u001A\u00020\fH\u0096\u0002¢\u0006\u0004\b\r\u0010\u000EJ\u0010\u0010\u000F\u001A\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u000F\u0010\u0010J\u000F\u0010\u0011\u001A\u00020\nH\u0016¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Landroidx/collection/IndexBasedArrayIterator;", "T", "", "", "startingSize", "<init>", "(I)V", "index", "elementAt", "(I)Ljava/lang/Object;", "", "removeAt", "", "hasNext", "()Z", "next", "()Ljava/lang/Object;", "remove", "()V", "collection"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nIndexBasedArrayIterator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IndexBasedArrayIterator.kt\nandroidx/collection/IndexBasedArrayIterator\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,48:1\n1#2:49\n*E\n"})
public abstract class IndexBasedArrayIterator implements Iterator, KMutableIterator {
    public int a;
    public int b;
    public boolean c;

    public IndexBasedArrayIterator(int v) {
        this.a = v;
    }

    public abstract Object elementAt(int arg1);

    @Override
    public boolean hasNext() {
        return this.b < this.a;
    }

    @Override
    public Object next() {
        if(!this.hasNext()) {
            throw new NoSuchElementException();
        }
        Object object0 = this.elementAt(this.b);
        ++this.b;
        this.c = true;
        return object0;
    }

    @Override
    public void remove() {
        if(!this.c) {
            throw new IllegalStateException("Call next() before removing an element.");
        }
        int v = this.b - 1;
        this.b = v;
        this.removeAt(v);
        --this.a;
        this.c = false;
    }

    public abstract void removeAt(int arg1);
}

