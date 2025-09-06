package retrofit2;

import java.io.IOException;
import java.lang.reflect.Method;
import okhttp3.RequestBody;

public final class u extends p0 {
    public final Method d;
    public final int e;
    public final Converter f;

    public u(Method method0, int v, Converter converter0) {
        this.d = method0;
        this.e = v;
        this.f = converter0;
    }

    @Override  // retrofit2.p0
    public final void a(g0 g00, Object object0) {
        int v = this.e;
        Method method0 = this.d;
        if(object0 != null) {
            try {
                g00.k = (RequestBody)this.f.convert(object0);
                return;
            }
            catch(IOException iOException0) {
                throw p0.n(method0, iOException0, v, "Unable to convert " + object0 + " to RequestBody", new Object[0]);
            }
        }
        throw p0.m(method0, v, "Body parameter value must not be null.", new Object[0]);
    }
}

