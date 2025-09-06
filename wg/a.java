package wg;

import java.util.Iterator;
import kotlin.collections.ArrayDeque;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.sequences.SequenceScope;
import okio.FileSystem;
import okio.Path;
import okio.internal.-FileSystem;

public final class a extends ContinuationImpl {
    public SequenceScope o;
    public FileSystem p;
    public ArrayDeque q;
    public Path r;
    public Iterator s;
    public boolean t;
    public boolean u;
    public Object v;
    public int w;

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        this.v = object0;
        this.w |= 0x80000000;
        return -FileSystem.collectRecursively(null, null, null, null, false, false, this);
    }
}

