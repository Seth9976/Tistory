package fe;

import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

public final class q {
    public final WeakReference a;
    public final int b;

    public q(ClassLoader classLoader0) {
        Intrinsics.checkNotNullParameter(classLoader0, "classLoader");
        super();
        this.a = new WeakReference(classLoader0);
        this.b = System.identityHashCode(classLoader0);
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 instanceof q && this.a.get() == ((q)object0).a.get();
    }

    @Override
    public final int hashCode() {
        return this.b;
    }

    @Override
    public final String toString() {
        ClassLoader classLoader0 = (ClassLoader)this.a.get();
        if(classLoader0 != null) {
            String s = classLoader0.toString();
            return s == null ? "<null>" : s;
        }
        return "<null>";
    }
}

