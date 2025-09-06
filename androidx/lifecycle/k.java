package androidx.lifecycle;

import aa.r;
import jb.q;
import kotlin.Function;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p4.d;

public final class k implements Observer, FunctionAdapter {
    public final int a;
    public final Lambda b;

    public k(r r0) {
        this.a = 1;
        Intrinsics.checkNotNullParameter(r0, "function");
        super();
        this.b = r0;
    }

    public k(i i0) {
        this.a = 0;
        Intrinsics.checkNotNullParameter(i0, "function");
        super();
        this.b = i0;
    }

    public k(q q0) {
        this.a = 2;
        Intrinsics.checkNotNullParameter(q0, "function");
        super();
        this.b = q0;
    }

    public k(d d0) {
        this.a = 3;
        Intrinsics.checkNotNullParameter(d0, "function");
        super();
        this.b = d0;
    }

    @Override
    public final boolean equals(Object object0) {
        switch(this.a) {
            case 0: {
                if(object0 instanceof Observer && object0 instanceof FunctionAdapter) {
                    Function function1 = ((FunctionAdapter)object0).getFunctionDelegate();
                    return Intrinsics.areEqual(((i)this.b), function1);
                }
                return false;
            }
            case 1: {
                if(object0 instanceof Observer && object0 instanceof FunctionAdapter) {
                    Function function2 = ((FunctionAdapter)object0).getFunctionDelegate();
                    return Intrinsics.areEqual(((r)this.b), function2);
                }
                return false;
            }
            case 2: {
                if(object0 instanceof Observer && object0 instanceof FunctionAdapter) {
                    Function function3 = ((FunctionAdapter)object0).getFunctionDelegate();
                    return Intrinsics.areEqual(((q)this.b), function3);
                }
                return false;
            }
            default: {
                if(object0 instanceof Observer && object0 instanceof FunctionAdapter) {
                    Function function0 = ((FunctionAdapter)object0).getFunctionDelegate();
                    return Intrinsics.areEqual(((d)this.b), function0);
                }
                return false;
            }
        }
    }

    @Override  // kotlin.jvm.internal.FunctionAdapter
    public final Function getFunctionDelegate() {
        switch(this.a) {
            case 0: {
                return (i)this.b;
            }
            case 1: {
                return (r)this.b;
            }
            case 2: {
                return (q)this.b;
            }
            default: {
                return (d)this.b;
            }
        }
    }

    @Override
    public final int hashCode() {
        switch(this.a) {
            case 0: {
                return ((i)this.b).hashCode();
            }
            case 1: {
                return ((r)this.b).hashCode();
            }
            case 2: {
                return ((q)this.b).hashCode();
            }
            default: {
                return ((d)this.b).hashCode();
            }
        }
    }

    @Override  // androidx.lifecycle.Observer
    public final void onChanged(Object object0) {
        switch(this.a) {
            case 0: {
                ((i)this.b).invoke(object0);
                return;
            }
            case 1: {
                ((r)this.b).invoke(object0);
                return;
            }
            case 2: {
                ((q)this.b).invoke(object0);
                return;
            }
            default: {
                ((d)this.b).invoke(object0);
            }
        }
    }
}

