package retrofit2;

import java.lang.reflect.Array;

public final class t extends p0 {
    public final int d;
    public final p0 e;

    public t(p0 p00, int v) {
        this.d = v;
        this.e = p00;
        super();
    }

    @Override  // retrofit2.p0
    public final void a(g0 g00, Object object0) {
        if(this.d != 0) {
            if(object0 != null) {
                int v = Array.getLength(object0);
                for(int v1 = 0; v1 < v; ++v1) {
                    Object object1 = Array.get(object0, v1);
                    this.e.a(g00, object1);
                }
            }
            return;
        }
        if(((Iterable)object0) != null) {
            for(Object object2: ((Iterable)object0)) {
                this.e.a(g00, object2);
            }
        }
    }
}

