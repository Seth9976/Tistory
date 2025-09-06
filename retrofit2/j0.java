package retrofit2;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public final class j0 implements InvocationHandler {
    public final Object[] a;
    public final Class b;
    public final Retrofit c;

    public j0(Retrofit retrofit0, Class class0) {
        this.c = retrofit0;
        this.b = class0;
        this.a = new Object[0];
    }

    @Override
    public final Object invoke(Object object0, Method method0, Object[] arr_object) {
        if(method0.getDeclaringClass() == Object.class) {
            return method0.invoke(this, arr_object);
        }
        if(arr_object == null) {
            arr_object = this.a;
        }
        a a0 = d0.b;
        Class class0 = this.b;
        if(a0.c(method0)) {
            return a0.b(method0, class0, object0, arr_object);
        }
        m m0 = (m)this.c.a(class0, method0);
        return m0.b(new s(m0.a, object0, arr_object, m0.b, m0.c), arr_object);
    }
}

