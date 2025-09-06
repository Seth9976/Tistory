package retrofit2;

import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

public final class e0 extends a {
    public final int h;

    public e0(int v) {
        this.h = v;
        super(6);
    }

    @Override  // retrofit2.a
    public String a(Method method0, int v) {
        if(this.h != 1) {
            return super.a(method0, v);
        }
        Parameter parameter0 = method0.getParameters()[v];
        return parameter0.isNamePresent() ? "parameter \'" + parameter0.getName() + '\'' : super.a(method0, v);
    }

    @Override  // retrofit2.a
    public final Object b(Method method0, Class class0, Object object0, Object[] arr_object) {
        return p0.i(method0, class0, object0, arr_object);
    }

    @Override  // retrofit2.a
    public final boolean c(Method method0) {
        return method0.isDefault();
    }
}

