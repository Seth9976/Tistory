package retrofit2;

import java.lang.reflect.Method;
import java.util.Map.Entry;
import java.util.Map;
import okhttp3.FormBody.Builder;

public final class w extends p0 {
    public final int d;
    public final Method e;
    public final int f;
    public final Converter g;
    public final boolean h;

    public w(Method method0, int v, Converter converter0, boolean z, int v1) {
        this.d = v1;
        this.e = method0;
        this.f = v;
        this.g = converter0;
        this.h = z;
        super();
    }

    @Override  // retrofit2.p0
    public final void a(g0 g00, Object object0) {
        switch(this.d) {
            case 0: {
                int v1 = this.f;
                Method method1 = this.e;
                if(((Map)object0) == null) {
                    throw p0.m(method1, v1, "Field map was null.", new Object[0]);
                }
                for(Object object3: ((Map)object0).entrySet()) {
                    String s2 = (String)((Map.Entry)object3).getKey();
                    if(s2 == null) {
                        throw p0.m(method1, v1, "Field map contained null key.", new Object[0]);
                    }
                    Object object4 = ((Map.Entry)object3).getValue();
                    if(object4 == null) {
                        throw p0.m(method1, v1, "Field map contained null value for key \'" + s2 + "\'.", new Object[0]);
                    }
                    Converter converter1 = this.g;
                    String s3 = (String)converter1.convert(object4);
                    if(s3 == null) {
                        throw p0.m(method1, v1, "Field map value \'" + object4 + "\' converted to null by " + converter1.getClass().getName() + " for key \'" + s2 + "\'.", new Object[0]);
                    }
                    Builder formBody$Builder0 = g00.j;
                    if(this.h) {
                        formBody$Builder0.addEncoded(s2, s3);
                    }
                    else {
                        formBody$Builder0.add(s2, s3);
                    }
                }
                return;
            }
            case 1: {
                int v2 = this.f;
                Method method2 = this.e;
                if(((Map)object0) == null) {
                    throw p0.m(method2, v2, "Header map was null.", new Object[0]);
                }
                for(Object object5: ((Map)object0).entrySet()) {
                    String s4 = (String)((Map.Entry)object5).getKey();
                    if(s4 == null) {
                        throw p0.m(method2, v2, "Header map contained null key.", new Object[0]);
                    }
                    Object object6 = ((Map.Entry)object5).getValue();
                    if(object6 == null) {
                        throw p0.m(method2, v2, "Header map contained null value for key \'" + s4 + "\'.", new Object[0]);
                    }
                    g00.a(s4, ((String)this.g.convert(object6)), this.h);
                }
                return;
            }
            default: {
                int v = this.f;
                Method method0 = this.e;
                if(((Map)object0) == null) {
                    throw p0.m(method0, v, "Query map was null", new Object[0]);
                }
                for(Object object1: ((Map)object0).entrySet()) {
                    String s = (String)((Map.Entry)object1).getKey();
                    if(s == null) {
                        throw p0.m(method0, v, "Query map contained null key.", new Object[0]);
                    }
                    Object object2 = ((Map.Entry)object1).getValue();
                    if(object2 == null) {
                        throw p0.m(method0, v, "Query map contained null value for key \'" + s + "\'.", new Object[0]);
                    }
                    Converter converter0 = this.g;
                    String s1 = (String)converter0.convert(object2);
                    if(s1 == null) {
                        throw p0.m(method0, v, "Query map value \'" + object2 + "\' converted to null by " + converter0.getClass().getName() + " for key \'" + s + "\'.", new Object[0]);
                    }
                    g00.b(s, s1, this.h);
                }
            }
        }
    }
}

