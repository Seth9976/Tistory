package retrofit2;

import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Map.Entry;
import java.util.Map;
import okhttp3.Headers;
import okhttp3.RequestBody;

public final class y extends p0 {
    public final int d;
    public final Method e;
    public final int f;
    public final Converter g;
    public final Object h;

    public y(Method method0, int v, Headers headers0, Converter converter0) {
        this.d = 0;
        super();
        this.e = method0;
        this.f = v;
        this.h = headers0;
        this.g = converter0;
    }

    public y(Method method0, int v, Converter converter0, String s) {
        this.d = 1;
        super();
        this.e = method0;
        this.f = v;
        this.g = converter0;
        this.h = s;
    }

    @Override  // retrofit2.p0
    public final void a(g0 g00, Object object0) {
        RequestBody requestBody1;
        if(this.d != 0) {
            int v = this.f;
            Method method0 = this.e;
            if(((Map)object0) == null) {
                throw p0.m(method0, v, "Part map was null.", new Object[0]);
            }
            for(Object object1: ((Map)object0).entrySet()) {
                String s = (String)((Map.Entry)object1).getKey();
                if(s == null) {
                    throw p0.m(method0, v, "Part map contained null key.", new Object[0]);
                }
                Object object2 = ((Map.Entry)object1).getValue();
                if(object2 == null) {
                    throw p0.m(method0, v, "Part map contained null value for key \'" + s + "\'.", new Object[0]);
                }
                Headers headers0 = Headers.of(new String[]{"Content-Disposition", "form-data; name=\"" + s + "\"", "Content-Transfer-Encoding", ((String)this.h)});
                RequestBody requestBody0 = (RequestBody)this.g.convert(object2);
                g00.i.addPart(headers0, requestBody0);
            }
            return;
        }
        if(object0 != null) {
            try {
                requestBody1 = (RequestBody)this.g.convert(object0);
            }
            catch(IOException iOException0) {
                throw p0.m(this.e, this.f, "Unable to convert " + object0 + " to RequestBody", new Object[]{iOException0});
            }
            g00.i.addPart(((Headers)this.h), requestBody1);
        }
    }
}

