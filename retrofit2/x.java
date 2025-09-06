package retrofit2;

import java.lang.reflect.Method;
import okhttp3.Headers;

public final class x extends p0 {
    public final int d;
    public final Method e;
    public final int f;

    public x(Method method0, int v, int v1) {
        this.d = v1;
        this.e = method0;
        this.f = v;
        super();
    }

    @Override  // retrofit2.p0
    public final void a(g0 g00, Object object0) {
        if(this.d != 0) {
            if(object0 == null) {
                throw p0.m(this.e, this.f, "@Url parameter is null.", new Object[0]);
            }
            g00.c = object0.toString();
            return;
        }
        if(((Headers)object0) == null) {
            throw p0.m(this.e, this.f, "Headers parameter must not be null.", new Object[0]);
        }
        g00.f.addAll(((Headers)object0));
    }
}

