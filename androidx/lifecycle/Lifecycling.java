package androidx.lifecycle;

import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.k;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.p;
import org.jetbrains.annotations.NotNull;
import r0.a;

@RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
@Metadata(d1 = {"\u0000\u001A\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001J\u0017\u0010\u0004\u001A\u00020\u00032\u0006\u0010\u0002\u001A\u00020\u0001H\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001A\u00020\u00062\u0006\u0010\u0007\u001A\u00020\u0006H\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Landroidx/lifecycle/Lifecycling;", "", "object", "Landroidx/lifecycle/LifecycleEventObserver;", "lifecycleEventObserver", "(Ljava/lang/Object;)Landroidx/lifecycle/LifecycleEventObserver;", "", "className", "getAdapterName", "(Ljava/lang/String;)Ljava/lang/String;", "lifecycle-common"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class Lifecycling {
    @NotNull
    public static final Lifecycling INSTANCE;
    public static final HashMap a;
    public static final HashMap b;

    static {
        Lifecycling.INSTANCE = new Lifecycling();  // 初始化器: Ljava/lang/Object;-><init>()V
        Lifecycling.a = new HashMap();
        Lifecycling.b = new HashMap();
    }

    public static GeneratedAdapter a(Constructor constructor0, Object object0) {
        try {
            Object object1 = constructor0.newInstance(object0);
            Intrinsics.checkNotNullExpressionValue(object1, "{\n            constructo…tance(`object`)\n        }");
            return (GeneratedAdapter)object1;
        }
        catch(IllegalAccessException illegalAccessException0) {
            throw new RuntimeException(illegalAccessException0);
        }
        catch(InstantiationException instantiationException0) {
            throw new RuntimeException(instantiationException0);
        }
        catch(InvocationTargetException invocationTargetException0) {
            throw new RuntimeException(invocationTargetException0);
        }
    }

    public static int b(Class class0) {
        boolean z;
        Constructor constructor0;
        ArrayList arrayList0;
        int v = 1;
        HashMap hashMap0 = Lifecycling.a;
        Integer integer0 = (Integer)hashMap0.get(class0);
        if(integer0 != null) {
            return (int)integer0;
        }
        if(class0.getCanonicalName() != null) {
            try {
                arrayList0 = null;
                Package package0 = class0.getPackage();
                String s = class0.getCanonicalName();
                String s1 = package0 == null ? "" : package0.getName();
                Intrinsics.checkNotNullExpressionValue(s1, "fullPackage");
                if(s1.length() != 0) {
                    Intrinsics.checkNotNullExpressionValue(s, "name");
                    s = s.substring(s1.length() + 1);
                    Intrinsics.checkNotNullExpressionValue(s, "this as java.lang.String).substring(startIndex)");
                }
                Intrinsics.checkNotNullExpressionValue(s, "if (fullPackage.isEmpty(…g(fullPackage.length + 1)");
                String s2 = Lifecycling.getAdapterName(s);
                if(s1.length() != 0) {
                    s2 = s1 + '.' + s2;
                }
                Class class1 = Class.forName(s2);
                Intrinsics.checkNotNull(class1, "null cannot be cast to non-null type java.lang.Class<out androidx.lifecycle.GeneratedAdapter>");
                constructor0 = class1.getDeclaredConstructor(class0);
                if(!constructor0.isAccessible()) {
                    constructor0.setAccessible(true);
                }
                goto label_30;
            }
            catch(ClassNotFoundException unused_ex) {
            }
            catch(NoSuchMethodException noSuchMethodException0) {
                throw new RuntimeException(noSuchMethodException0);
            }
            constructor0 = null;
        label_30:
            HashMap hashMap1 = Lifecycling.b;
            if(constructor0 == null) {
                e e0 = e.c;
                HashMap hashMap2 = e0.b;
                Boolean boolean0 = (Boolean)hashMap2.get(class0);
                if(boolean0 == null) {
                    Method[] arr_method = class0.getDeclaredMethods();
                    for(int v1 = 0; true; ++v1) {
                        if(v1 >= arr_method.length) {
                            hashMap2.put(class0, Boolean.FALSE);
                            z = false;
                            break;
                        }
                        if(((OnLifecycleEvent)arr_method[v1].getAnnotation(OnLifecycleEvent.class)) != null) {
                            e0.a(class0, arr_method);
                            z = true;
                            break;
                        }
                    }
                }
                else {
                    z = boolean0.booleanValue();
                }
                if(!z) {
                    Class class2 = class0.getSuperclass();
                    Class class3 = LifecycleObserver.class;
                    if(class2 == null || !class3.isAssignableFrom(class2)) {
                    label_62:
                        Class[] arr_class = class0.getInterfaces();
                        Intrinsics.checkNotNullExpressionValue(arr_class, "klass.interfaces");
                        for(int v2 = 0; v2 < arr_class.length; ++v2) {
                            Class class4 = arr_class[v2];
                            if(class4 != null && class3.isAssignableFrom(class4)) {
                                Intrinsics.checkNotNullExpressionValue(class4, "intrface");
                                if(Lifecycling.b(class4) == 1) {
                                    hashMap0.put(class0, v);
                                    return v;
                                }
                                if(arrayList0 == null) {
                                    arrayList0 = new ArrayList();
                                }
                                Object object1 = hashMap1.get(class4);
                                Intrinsics.checkNotNull(object1);
                                arrayList0.addAll(((Collection)object1));
                            }
                        }
                        if(arrayList0 != null) {
                            hashMap1.put(class0, arrayList0);
                            v = 2;
                        }
                    }
                    else {
                        Intrinsics.checkNotNullExpressionValue(class2, "superclass");
                        if(Lifecycling.b(class2) != 1) {
                            Object object0 = hashMap1.get(class2);
                            Intrinsics.checkNotNull(object0);
                            arrayList0 = new ArrayList(((Collection)object0));
                            goto label_62;
                        }
                    }
                }
            }
            else {
                hashMap1.put(class0, k.listOf(constructor0));
                v = 2;
            }
        }
        hashMap0.put(class0, v);
        return v;
    }

    @JvmStatic
    @NotNull
    public static final String getAdapterName(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "className");
        return a.o(new StringBuilder(), p.replace$default(s, ".", "_", false, 4, null), "_LifecycleAdapter");
    }

    @JvmStatic
    @NotNull
    public static final LifecycleEventObserver lifecycleEventObserver(@NotNull Object object0) {
        Intrinsics.checkNotNullParameter(object0, "object");
        if(object0 instanceof LifecycleEventObserver && object0 instanceof DefaultLifecycleObserver) {
            return new DefaultLifecycleObserverAdapter(((DefaultLifecycleObserver)object0), ((LifecycleEventObserver)object0));
        }
        if(object0 instanceof DefaultLifecycleObserver) {
            return new DefaultLifecycleObserverAdapter(((DefaultLifecycleObserver)object0), null);
        }
        if(object0 instanceof LifecycleEventObserver) {
            return (LifecycleEventObserver)object0;
        }
        Class class0 = object0.getClass();
        Lifecycling.INSTANCE.getClass();
        if(Lifecycling.b(class0) == 2) {
            Object object1 = Lifecycling.b.get(class0);
            Intrinsics.checkNotNull(object1);
            if(((List)object1).size() == 1) {
                return new SingleGeneratedAdapterObserver(Lifecycling.a(((Constructor)((List)object1).get(0)), object0));
            }
            int v1 = ((List)object1).size();
            GeneratedAdapter[] arr_generatedAdapter = new GeneratedAdapter[v1];
            for(int v = 0; v < v1; ++v) {
                Constructor constructor0 = (Constructor)((List)object1).get(v);
                Lifecycling.INSTANCE.getClass();
                arr_generatedAdapter[v] = Lifecycling.a(constructor0, object0);
            }
            return new CompositeGeneratedAdaptersObserver(arr_generatedAdapter);
        }
        return new h0(object0);
    }
}

