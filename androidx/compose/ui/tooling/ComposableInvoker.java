package androidx.compose.ui.tooling;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.ExperimentalComposeUiApi;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.IntIterator;
import kotlin.collections.l;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.SpreadBuilder;
import kotlin.ranges.IntRange;
import kotlin.ranges.c;
import kotlin.text.p;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 1)
@ExperimentalComposeUiApi
@Deprecated(message = "Use androidx.compose.runtime.reflect.ComposableMethodInvoker instead")
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001J?\u0010\n\u001A\u00020\t2\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u0004\u001A\u00020\u00022\u0006\u0010\u0006\u001A\u00020\u00052\u0016\u0010\b\u001A\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u0007\"\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0004\b\n\u0010\u000B¨\u0006\f"}, d2 = {"Landroidx/compose/ui/tooling/ComposableInvoker;", "", "", "className", "methodName", "Landroidx/compose/runtime/Composer;", "composer", "", "args", "", "invokeComposable", "(Ljava/lang/String;Ljava/lang/String;Landroidx/compose/runtime/Composer;[Ljava/lang/Object;)V", "ui-tooling_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nComposableInvoker.jvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComposableInvoker.jvm.kt\nandroidx/compose/ui/tooling/ComposableInvoker\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,234:1\n75#1:266\n11425#2:235\n11536#2,4:236\n1282#2,2:243\n11653#2,9:251\n13579#2:260\n13580#2:262\n11662#2:263\n1735#2,6:273\n1726#3,3:240\n1549#3:245\n1620#3,3:246\n1549#3:267\n1620#3,3:268\n37#4,2:249\n37#4,2:264\n37#4,2:271\n1#5:261\n*S KotlinDebug\n*F\n+ 1 ComposableInvoker.jvm.kt\nandroidx/compose/ui/tooling/ComposableInvoker\n*L\n93#1:266\n44#1:235\n44#1:236,4\n67#1:243,2\n89#1:251,9\n89#1:260\n89#1:262\n89#1:263\n140#1:273,6\n54#1:240,3\n75#1:245\n75#1:246,3\n93#1:267\n93#1:268,3\n75#1:249,2\n89#1:264,2\n93#1:271,2\n89#1:261\n*E\n"})
public final class ComposableInvoker {
    public static final int $stable;
    @NotNull
    public static final ComposableInvoker INSTANCE;

    static {
        ComposableInvoker.INSTANCE = new ComposableInvoker();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    public static Method a(Method[] arr_method, String s, Class[] arr_class) {
        Method method0;
        int v = 0;
        while(true) {
            method0 = null;
            if(v >= arr_method.length) {
                break;
            }
            Method method1 = arr_method[v];
            if(Intrinsics.areEqual(s, method1.getName()) || p.startsWith$default(method1.getName(), s + '-', false, 2, null)) {
                Class[] arr_class1 = method1.getParameterTypes();
                Class[] arr_class2 = (Class[])Arrays.copyOf(arr_class, arr_class.length);
                ComposableInvoker.INSTANCE.getClass();
                if(arr_class1.length == arr_class2.length) {
                    ArrayList arrayList0 = new ArrayList(arr_class1.length);
                    int v1 = arr_class1.length;
                    int v2 = 0;
                    for(int v3 = 0; v2 < v1; ++v3) {
                        Class class0 = arr_class1[v2];
                        Class class1 = arr_class2[v3];
                        arrayList0.add(Boolean.valueOf(Intrinsics.areEqual(JvmClassMappingKt.getKotlinClass(class0), JvmClassMappingKt.getKotlinClass(class1)) || class0.isAssignableFrom(class1)));
                        ++v2;
                    }
                    if(!arrayList0.isEmpty()) {
                        for(Object object0: arrayList0) {
                            if(((Boolean)object0).booleanValue()) {
                                continue;
                            }
                            goto label_28;
                        }
                    }
                    method0 = method1;
                    break;
                }
            }
        label_28:
            ++v;
        }
        if(method0 == null) {
            throw new NoSuchMethodException(s + " not found");
        }
        return method0;
    }

    public static Method b(Class class0, String s, Object[] arr_object) {
        ArrayList arrayList0 = new ArrayList();
        for(int v = 0; true; ++v) {
            Class class1 = null;
            if(v >= arr_object.length) {
                break;
            }
            Object object0 = arr_object[v];
            if(object0 != null) {
                class1 = object0.getClass();
            }
            if(class1 != null) {
                arrayList0.add(class1);
            }
        }
        Class[] arr_class = (Class[])arrayList0.toArray(new Class[0]);
        try {
            Class class2 = Integer.TYPE;
            IntRange intRange0 = c.until(0, (arr_class.length == 0 ? 1 : ((int)Math.ceil(((double)arr_class.length) / 10.0))));
            ArrayList arrayList1 = new ArrayList(l.collectionSizeOrDefault(intRange0, 10));
            Iterator iterator0 = intRange0.iterator();
            while(iterator0.hasNext()) {
                ((IntIterator)iterator0).nextInt();
                arrayList1.add(class2);
            }
            Class[] arr_class1 = (Class[])arrayList1.toArray(new Class[0]);
            SpreadBuilder spreadBuilder0 = new SpreadBuilder(3);
            spreadBuilder0.addSpread(arr_class);
            spreadBuilder0.add(Composer.class);
            spreadBuilder0.addSpread(arr_class1);
            return ComposableInvoker.a(class0.getDeclaredMethods(), s, ((Class[])spreadBuilder0.toArray(new Class[spreadBuilder0.size()])));
        }
        catch(ReflectiveOperationException unused_ex) {
            try {
                Method[] arr_method = class0.getDeclaredMethods();
                for(int v1 = 0; v1 < arr_method.length; ++v1) {
                    Method method0 = arr_method[v1];
                    if(Intrinsics.areEqual(method0.getName(), s) || p.startsWith$default(method0.getName(), s + '-', false, 2, null)) {
                        return method0;
                    }
                }
            }
            catch(ReflectiveOperationException unused_ex) {
            }
            return null;
        }
    }

    public static void c(Method method0, Object object0, Composer composer0, Object[] arr_object) {
        Object object1;
        Class[] arr_class = method0.getParameterTypes();
        int v = -1;
        int v1 = arr_class.length - 1;
        if(v1 >= 0) {
            while(true) {
                if(Intrinsics.areEqual(arr_class[v1], Composer.class)) {
                    v = v1;
                    break;
                }
                if(v1 - 1 < 0) {
                    break;
                }
                --v1;
            }
        }
        int v2 = (v == 0 ? 1 : ((int)Math.ceil(((double)((object0 == null ? 0 : 1) + v)) / 10.0))) + (v + 1);
        Class[] arr_class1 = method0.getParameterTypes();
        if((arr_class1.length == v2 ? 0 : ((int)Math.ceil(((double)v) / 31.0))) + v2 != arr_class1.length) {
            throw new IllegalStateException("params don\'t add up to total params");
        }
        Object[] arr_object1 = new Object[arr_class1.length];
        for(int v3 = 0; v3 < arr_class1.length; ++v3) {
            if(v3 < 0 || v3 >= v) {
                if(v3 == v) {
                    object1 = composer0;
                }
                else if(v + 1 > v3 || v3 >= v2) {
                    if(v2 > v3 || v3 >= arr_class1.length) {
                        throw new IllegalStateException("Unexpected index");
                    }
                    object1 = 0x1FFFFF;
                }
                else {
                    object1 = 0;
                }
            }
            else if(v3 < 0 || v3 > ArraysKt___ArraysKt.getLastIndex(arr_object)) {
                Class class0 = method0.getParameterTypes()[v3];
                ComposableInvoker.INSTANCE.getClass();
                switch(class0.getName()) {
                    case "boolean": {
                        object1 = Boolean.FALSE;
                        break;
                    }
                    case "byte": {
                        object1 = (byte)0;
                        break;
                    }
                    case "char": {
                        object1 = Character.valueOf('\u0000');
                        break;
                    }
                    case "double": {
                        object1 = 0.0;
                        break;
                    }
                    case "float": {
                        object1 = 0.0f;
                        break;
                    }
                    case "int": {
                        object1 = 0;
                        break;
                    }
                    case "long": {
                        object1 = 0L;
                        break;
                    }
                    case "short": {
                        object1 = (short)0;
                        break;
                    }
                    default: {
                        object1 = null;
                    }
                }
            }
            else {
                object1 = arr_object[v3];
            }
            arr_object1[v3] = object1;
        }
        method0.invoke(object0, Arrays.copyOf(arr_object1, arr_class1.length));
    }

    @ExperimentalComposeUiApi
    public final void invokeComposable(@NotNull String s, @NotNull String s1, @NotNull Composer composer0, @NotNull Object[] arr_object) {
        try {
            Class class0 = Class.forName(s);
            Method method0 = ComposableInvoker.b(class0, s1, Arrays.copyOf(arr_object, arr_object.length));
            if(method0 == null) {
                throw new NoSuchMethodException("Composable " + s + '.' + s1 + " not found");
            }
            method0.setAccessible(true);
            if(Modifier.isStatic(method0.getModifiers())) {
                ComposableInvoker.c(method0, null, composer0, Arrays.copyOf(arr_object, arr_object.length));
                return;
            }
            ComposableInvoker.c(method0, class0.getConstructor(null).newInstance(null), composer0, Arrays.copyOf(arr_object, arr_object.length));
            return;
        }
        catch(Exception exception0) {
        }
        Companion.logWarning$ui_tooling_release$default(PreviewLogger.Companion, "Failed to invoke Composable Method \'" + s + '.' + s1 + '\'', null, 2, null);
        throw exception0;
    }
}

