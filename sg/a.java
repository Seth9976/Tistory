package sg;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

public final class a implements InvocationHandler {
    public final List a;
    public boolean b;
    public String c;

    public a(List list0) {
        Intrinsics.checkNotNullParameter(list0, "protocols");
        super();
        this.a = list0;
    }

    @Override
    public final Object invoke(Object object0, Method method0, Object[] arr_object) {
        Intrinsics.checkNotNullParameter(object0, "proxy");
        Intrinsics.checkNotNullParameter(method0, "method");
        if(arr_object == null) {
            arr_object = new Object[0];
        }
        String s = method0.getName();
        Class class0 = method0.getReturnType();
        if(Intrinsics.areEqual(s, "supports") && Intrinsics.areEqual(Boolean.TYPE, class0)) {
            return true;
        }
        if(Intrinsics.areEqual(s, "unsupported") && Intrinsics.areEqual(Void.TYPE, class0)) {
            this.b = true;
            return null;
        }
        boolean z = Intrinsics.areEqual(s, "protocols");
        List list0 = this.a;
        if(z && arr_object.length == 0) {
            return list0;
        }
        if((Intrinsics.areEqual(s, "selectProtocol") || Intrinsics.areEqual(s, "select")) && Intrinsics.areEqual(String.class, class0) && arr_object.length == 1) {
            Object object1 = arr_object[0];
            if(object1 instanceof List) {
                Intrinsics.checkNotNull(object1, "null cannot be cast to non-null type kotlin.collections.List<*>");
                int v = ((List)object1).size();
                if(v >= 0) {
                    for(int v1 = 0; true; ++v1) {
                        Object object2 = ((List)object1).get(v1);
                        Intrinsics.checkNotNull(object2, "null cannot be cast to non-null type kotlin.String");
                        String s1 = (String)object2;
                        if(list0.contains(s1)) {
                            this.c = s1;
                            return s1;
                        }
                        if(v1 == v) {
                            break;
                        }
                    }
                }
                String s2 = (String)list0.get(0);
                this.c = s2;
                return s2;
            }
        }
        if((Intrinsics.areEqual(s, "protocolSelected") || Intrinsics.areEqual(s, "selected")) && arr_object.length == 1) {
            Object object3 = arr_object[0];
            Intrinsics.checkNotNull(object3, "null cannot be cast to non-null type kotlin.String");
            this.c = (String)object3;
            return null;
        }
        return method0.invoke(this, Arrays.copyOf(arr_object, arr_object.length));
    }
}

