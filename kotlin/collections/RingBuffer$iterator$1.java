package kotlin.collections;

import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u000E\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u000F\u0010\u0003\u001A\u00020\u0002H\u0014¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"kotlin/collections/RingBuffer$iterator$1", "Lkotlin/collections/AbstractIterator;", "", "computeNext", "()V", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nSlidingWindow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SlidingWindow.kt\nkotlin/collections/RingBuffer$iterator$1\n+ 2 SlidingWindow.kt\nkotlin/collections/RingBuffer\n*L\n1#1,206:1\n204#2:207\n*S KotlinDebug\n*F\n+ 1 SlidingWindow.kt\nkotlin/collections/RingBuffer$iterator$1\n*L\n121#1:207\n*E\n"})
public final class RingBuffer.iterator.1 extends AbstractIterator {
    public int c;
    public int d;
    public final d0 e;

    public RingBuffer.iterator.1(d0 d00) {
        this.e = d00;
        super();
        this.c = d00.size();
        this.d = d00.c;
    }

    @Override  // kotlin.collections.AbstractIterator
    public void computeNext() {
        if(this.c == 0) {
            this.done();
            return;
        }
        this.setNext(this.e.a[this.d]);
        this.d = (this.d + 1) % this.e.b;
        --this.c;
    }
}

