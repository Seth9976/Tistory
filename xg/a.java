package xg;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil;

public final class a implements InvocationHandler {
    public final Object a;

    public a(Object object0) {
        this.a = object0;
    }

    @Override
    public final Object invoke(Object object0, Method method0, Object[] arr_object) {
        ClassLoader classLoader0 = this.a.getClass().getClassLoader();
        try {
            return BoundaryInterfaceReflectionUtil.dupeMethod(method0, classLoader0).invoke(this.a, arr_object);
        }
        catch(InvocationTargetException invocationTargetException0) {
            throw invocationTargetException0.getTargetException();
        }
        catch(ReflectiveOperationException reflectiveOperationException0) {
            throw new RuntimeException("Reflection failed for method " + method0, reflectiveOperationException0);
        }
    }
}

