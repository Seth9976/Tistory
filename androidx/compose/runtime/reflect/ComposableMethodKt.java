package androidx.compose.runtime.reflect;

import androidx.compose.runtime.Composer;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.IntIterator;
import kotlin.collections.l;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.SpreadBuilder;
import kotlin.ranges.IntRange;
import kotlin.ranges.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u001E\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0004\u001A\u0013\u0010\u0002\u001A\u0004\u0018\u00010\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001A9\u0010\t\u001A\u00020\u0001*\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010\u0006\u001A\u00020\u00052\u001A\u0010\b\u001A\u000E\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00040\u0007\"\u0006\u0012\u0002\b\u00030\u0004¢\u0006\u0004\b\t\u0010\n¨\u0006\u000B"}, d2 = {"Ljava/lang/reflect/Method;", "Landroidx/compose/runtime/reflect/ComposableMethod;", "asComposableMethod", "(Ljava/lang/reflect/Method;)Landroidx/compose/runtime/reflect/ComposableMethod;", "Ljava/lang/Class;", "", "methodName", "", "args", "getDeclaredComposableMethod", "(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Landroidx/compose/runtime/reflect/ComposableMethod;", "runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@JvmName(name = "ComposableMethodKt")
@SourceDebugExtension({"SMAP\nComposableMethod.jvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComposableMethod.jvm.kt\nandroidx/compose/runtime/reflect/ComposableMethodKt\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,222:1\n187#1:235\n187#1:242\n187#1:249\n1735#2,6:223\n1549#3:229\n1620#3,3:230\n1549#3:236\n1620#3,3:237\n1549#3:243\n1620#3,3:244\n1549#3:250\n1620#3,3:251\n37#4,2:233\n37#4,2:240\n37#4,2:247\n37#4,2:254\n*S KotlinDebug\n*F\n+ 1 ComposableMethod.jvm.kt\nandroidx/compose/runtime/reflect/ComposableMethodKt\n*L\n203#1:235\n212#1:242\n213#1:249\n59#1:223,6\n187#1:229\n187#1:230,3\n203#1:236\n203#1:237,3\n212#1:243\n212#1:244,3\n213#1:250\n213#1:251,3\n187#1:233,2\n203#1:240,2\n212#1:247,2\n213#1:254,2\n*E\n"})
public final class ComposableMethodKt {
    public static final Object access$getDefaultValue(Class class0) {
        switch(class0.getName()) {
            case "boolean": {
                return false;
            }
            case "byte": {
                return (byte)0;
            }
            case "char": {
                return Character.valueOf('\u0000');
            }
            case "double": {
                return 0.0;
            }
            case "float": {
                return 0.0f;
            }
            case "int": {
                return 0;
            }
            case "long": {
                return 0L;
            }
            case "short": {
                return (short)0;
            }
            default: {
                return null;
            }
        }
    }

    @Nullable
    public static final ComposableMethod asComposableMethod(@NotNull Method method0) {
        ComposableInfo composableInfo0;
        Class[] arr_class = method0.getParameterTypes();
        int v = arr_class.length - 1;
        if(v >= 0) {
            while(!Intrinsics.areEqual(arr_class[v], Composer.class)) {
                if(v - 1 < 0) {
                    goto label_8;
                }
                --v;
            }
        }
        else {
        label_8:
            v = -1;
        }
        boolean z = false;
        if(v == -1) {
            composableInfo0 = new ComposableInfo(false, method0.getParameterTypes().length, 0, 0);
            return composableInfo0.isComposable() ? new ComposableMethod(method0, composableInfo0) : null;
        }
        int v1 = v == 0 ? 1 : ((int)Math.ceil(((double)(!Modifier.isStatic(method0.getModifiers()) + v)) / 10.0));
        int v2 = v + 1 + v1;
        Class[] arr_class1 = method0.getParameterTypes();
        int v3 = arr_class1.length == v2 ? 0 : ((int)Math.ceil(((double)v) / 31.0));
        if(v2 + v3 == arr_class1.length) {
            z = true;
        }
        composableInfo0 = new ComposableInfo(z, v, v1, v3);
        return composableInfo0.isComposable() ? new ComposableMethod(method0, composableInfo0) : null;
    }

    @NotNull
    public static final ComposableMethod getDeclaredComposableMethod(@NotNull Class class0, @NotNull String s, @NotNull Class[] arr_class) throws NoSuchMethodException {
        Method method0;
        int v;
        Class class1;
        try {
            class1 = Composer.class;
            v = arr_class.length == 0 ? 1 : ((int)Math.ceil(((double)arr_class.length) / 10.0));
            SpreadBuilder spreadBuilder0 = new SpreadBuilder(3);
            spreadBuilder0.addSpread(arr_class);
            spreadBuilder0.add(class1);
            Class class2 = Integer.TYPE;
            IntRange intRange0 = c.until(0, v);
            ArrayList arrayList0 = new ArrayList(l.collectionSizeOrDefault(intRange0, 10));
            Iterator iterator0 = intRange0.iterator();
            while(iterator0.hasNext()) {
                ((IntIterator)iterator0).nextInt();
                arrayList0.add(class2);
            }
            spreadBuilder0.addSpread(arrayList0.toArray(new Class[0]));
            method0 = class0.getDeclaredMethod(s, ((Class[])spreadBuilder0.toArray(new Class[spreadBuilder0.size()])));
        }
        catch(ReflectiveOperationException unused_ex) {
            try {
                int v1 = (int)Math.ceil(((double)arr_class.length) / 31.0);
                SpreadBuilder spreadBuilder1 = new SpreadBuilder(4);
                spreadBuilder1.addSpread(arr_class);
                spreadBuilder1.add(class1);
                Class class3 = Integer.TYPE;
                IntRange intRange1 = c.until(0, v);
                ArrayList arrayList1 = new ArrayList(l.collectionSizeOrDefault(intRange1, 10));
                Iterator iterator1 = intRange1.iterator();
                while(iterator1.hasNext()) {
                    ((IntIterator)iterator1).nextInt();
                    arrayList1.add(class3);
                }
                spreadBuilder1.addSpread(arrayList1.toArray(new Class[0]));
                Class class4 = Integer.TYPE;
                IntRange intRange2 = c.until(0, v1);
                ArrayList arrayList2 = new ArrayList(l.collectionSizeOrDefault(intRange2, 10));
                Iterator iterator2 = intRange2.iterator();
                while(iterator2.hasNext()) {
                    ((IntIterator)iterator2).nextInt();
                    arrayList2.add(class4);
                }
                spreadBuilder1.addSpread(arrayList2.toArray(new Class[0]));
                method0 = class0.getDeclaredMethod(s, ((Class[])spreadBuilder1.toArray(new Class[spreadBuilder1.size()])));
            }
            catch(ReflectiveOperationException unused_ex) {
                method0 = null;
            }
        }
        if(method0 == null) {
            throw new NoSuchMethodException(class0.getName() + '.' + s);
        }
        ComposableMethod composableMethod0 = ComposableMethodKt.asComposableMethod(method0);
        Intrinsics.checkNotNull(composableMethod0);
        return composableMethod0;
    }
}

