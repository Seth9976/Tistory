package androidx.paging;

import java.util.ArrayList;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

public final class h1 extends ContinuationImpl {
    public int A;
    public int B;
    public Object C;
    public final j1 D;
    public int E;
    public j1 o;
    public Insert p;
    public ArrayList q;
    public ArrayList r;
    public Object s;
    public Object t;
    public Object u;
    public Object v;
    public Object w;
    public ArrayList x;
    public boolean y;
    public int z;

    public h1(j1 j10, ContinuationImpl continuationImpl0) {
        this.D = j10;
        super(continuationImpl0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        this.C = object0;
        this.E |= 0x80000000;
        return this.D.b(null, this);
    }
}

