package androidx.compose.runtime.reflect;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.StabilityInferred;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.collections.l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import kotlin.ranges.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0000\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\b\u001A\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ<\u0010\u000F\u001A\u0004\u0018\u00010\u00012\u0006\u0010\u000B\u001A\u00020\n2\b\u0010\f\u001A\u0004\u0018\u00010\u00012\u0016\u0010\u000E\u001A\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\r\"\u0004\u0018\u00010\u0001H\u0086\u0002¢\u0006\u0004\b\u000F\u0010\u0010J\u001A\u0010\u0013\u001A\u00020\u00122\b\u0010\u0011\u001A\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000F\u0010\u0016\u001A\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0019\u001A\u00020\u00158F¢\u0006\u0006\u001A\u0004\b\u0018\u0010\u0017R\u0017\u0010\u001D\u001A\b\u0012\u0004\u0012\u00020\u001A0\r8F¢\u0006\u0006\u001A\u0004\b\u001B\u0010\u001CR\u001B\u0010!\u001A\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u001E0\r8F¢\u0006\u0006\u001A\u0004\b\u001F\u0010 ¨\u0006\""}, d2 = {"Landroidx/compose/runtime/reflect/ComposableMethod;", "", "Ljava/lang/reflect/Method;", "method", "Landroidx/compose/runtime/reflect/ComposableInfo;", "composableInfo", "<init>", "(Ljava/lang/reflect/Method;Landroidx/compose/runtime/reflect/ComposableInfo;)V", "asMethod", "()Ljava/lang/reflect/Method;", "Landroidx/compose/runtime/Composer;", "composer", "instance", "", "args", "invoke", "(Landroidx/compose/runtime/Composer;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "getParameterCount", "parameterCount", "Ljava/lang/reflect/Parameter;", "getParameters", "()[Ljava/lang/reflect/Parameter;", "parameters", "Ljava/lang/Class;", "getParameterTypes", "()[Ljava/lang/Class;", "parameterTypes", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nComposableMethod.jvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComposableMethod.jvm.kt\nandroidx/compose/runtime/reflect/ComposableMethod\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,222:1\n1549#2:223\n1620#2,3:224\n1804#2,4:227\n*S KotlinDebug\n*F\n+ 1 ComposableMethod.jvm.kt\nandroidx/compose/runtime/reflect/ComposableMethod\n*L\n145#1:223\n145#1:224,3\n146#1:227,4\n*E\n"})
public final class ComposableMethod {
    public static final int $stable = 8;
    public final Method a;
    public final ComposableInfo b;

    public ComposableMethod(@NotNull Method method0, @NotNull ComposableInfo composableInfo0) {
        this.a = method0;
        this.b = composableInfo0;
    }

    @NotNull
    public final Method asMethod() {
        return this.a;
    }

    // 去混淆评级： 低(20)
    @Override
    public boolean equals(@Nullable Object object0) {
        return object0 instanceof ComposableMethod ? Intrinsics.areEqual(this.a, ((ComposableMethod)object0).a) : false;
    }

    public final int getParameterCount() {
        return this.b.getRealParamsCount();
    }

    @NotNull
    public final Class[] getParameterTypes() {
        return (Class[])ArraysKt___ArraysJvmKt.copyOfRange(this.a.getParameterTypes(), 0, this.b.getRealParamsCount());
    }

    @NotNull
    public final Parameter[] getParameters() {
        return (Parameter[])ArraysKt___ArraysJvmKt.copyOfRange(this.a.getParameters(), 0, this.b.getRealParamsCount());
    }

    @Override
    public int hashCode() {
        return this.a.hashCode();
    }

    @Nullable
    public final Object invoke(@NotNull Composer composer0, @Nullable Object object0, @NotNull Object[] arr_object) {
        Object object2;
        int v = this.b.component2();
        int v1 = this.b.component4();
        Method method0 = this.a;
        Class[] arr_class = method0.getParameterTypes();
        int v2 = this.b.component3() + (v + 1);
        Integer[] arr_integer = new Integer[v1];
        for(int v4 = 0; v4 < v1; ++v4) {
            IntRange intRange0 = c.until(v4 * 0x1F, Math.min(v4 * 0x1F + 0x1F, v));
            ArrayList arrayList0 = new ArrayList(l.collectionSizeOrDefault(intRange0, 10));
            Iterator iterator0 = intRange0.iterator();
            while(iterator0.hasNext()) {
                int v5 = ((IntIterator)iterator0).nextInt();
                arrayList0.add(((int)(v5 >= arr_object.length || arr_object[v5] == null ? 1 : 0)));
            }
            int v6 = 0;
            int v7 = 0;
            for(Object object1: arrayList0) {
                if(v7 < 0) {
                    CollectionsKt__CollectionsKt.throwIndexOverflow();
                }
                v6 |= ((Number)object1).intValue() << v7;
                ++v7;
            }
            arr_integer[v4] = v6;
        }
        Object[] arr_object1 = new Object[arr_class.length];
        for(int v3 = 0; v3 < arr_class.length; ++v3) {
            if(v3 < 0 || v3 >= v) {
                if(v3 == v) {
                    object2 = composer0;
                }
                else if(v3 == v + 1 || v + 2 <= v3 && v3 < v2) {
                    object2 = 0;
                }
                else {
                    if(v2 > v3 || v3 >= arr_class.length) {
                        throw new IllegalStateException("Unexpected index");
                    }
                    object2 = arr_integer[v3 - v2];
                }
            }
            else if(v3 < 0 || v3 > ArraysKt___ArraysKt.getLastIndex(arr_object)) {
                object2 = ComposableMethodKt.access$getDefaultValue(method0.getParameterTypes()[v3]);
            }
            else {
                object2 = arr_object[v3];
            }
            arr_object1[v3] = object2;
        }
        return method0.invoke(object0, Arrays.copyOf(arr_object1, arr_class.length));
    }
}

