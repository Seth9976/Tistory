package kotlin.reflect.jvm.internal;

import a5.b;
import com.google.android.material.button.c;
import fe.a;
import fe.g;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.w;
import kotlin.jvm.internal.ClassBasedDeclarationContainer;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.ReflectJavaClassFinderKt;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.RuntimeModuleData;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope.DefaultImpls;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.p;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001E\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b \u0018\u0000 12\u00020\u0001:\u0003123B\u0007\u00A2\u0006\u0004\b\u0002\u0010\u0003J\u001D\u0010\b\u001A\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001A\u00020\u0004H&\u00A2\u0006\u0004\b\b\u0010\tJ\u001D\u0010\u000B\u001A\b\u0012\u0004\u0012\u00020\n0\u00062\u0006\u0010\u0005\u001A\u00020\u0004H&\u00A2\u0006\u0004\b\u000B\u0010\tJ\u0019\u0010\u000E\u001A\u0004\u0018\u00010\u00072\u0006\u0010\r\u001A\u00020\fH&\u00A2\u0006\u0004\b\u000E\u0010\u000FJ)\u0010\u0015\u001A\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00140\u00062\u0006\u0010\u0011\u001A\u00020\u00102\u0006\u0010\u0013\u001A\u00020\u0012H\u0004\u00A2\u0006\u0004\b\u0015\u0010\u0016J\u001D\u0010\u0019\u001A\u00020\u00072\u0006\u0010\u0005\u001A\u00020\u00172\u0006\u0010\u0018\u001A\u00020\u0017\u00A2\u0006\u0004\b\u0019\u0010\u001AJ\u001D\u0010\u001B\u001A\u00020\n2\u0006\u0010\u0005\u001A\u00020\u00172\u0006\u0010\u0018\u001A\u00020\u0017\u00A2\u0006\u0004\b\u001B\u0010\u001CJ\u001F\u0010\u001F\u001A\u0004\u0018\u00010\u001E2\u0006\u0010\u0005\u001A\u00020\u00172\u0006\u0010\u001D\u001A\u00020\u0017\u00A2\u0006\u0004\b\u001F\u0010 J\'\u0010#\u001A\u0004\u0018\u00010\u001E2\u0006\u0010\u0005\u001A\u00020\u00172\u0006\u0010\u001D\u001A\u00020\u00172\u0006\u0010\"\u001A\u00020!\u00A2\u0006\u0004\b#\u0010$J\u001B\u0010&\u001A\b\u0012\u0002\b\u0003\u0018\u00010%2\u0006\u0010\u001D\u001A\u00020\u0017\u00A2\u0006\u0004\b&\u0010\'J\u001B\u0010(\u001A\b\u0012\u0002\b\u0003\u0018\u00010%2\u0006\u0010\u001D\u001A\u00020\u0017\u00A2\u0006\u0004\b(\u0010\'R\u0018\u0010,\u001A\u0006\u0012\u0002\b\u00030)8TX\u0094\u0004\u00A2\u0006\u0006\u001A\u0004\b*\u0010+R\u001A\u00100\u001A\b\u0012\u0004\u0012\u00020-0\u00068&X\u00A6\u0004\u00A2\u0006\u0006\u001A\u0004\b.\u0010/\u00A8\u00064"}, d2 = {"Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "Lkotlin/jvm/internal/ClassBasedDeclarationContainer;", "<init>", "()V", "Lkotlin/reflect/jvm/internal/impl/name/Name;", "name", "", "Lkotlin/reflect/jvm/internal/impl/descriptors/PropertyDescriptor;", "getProperties", "(Lkotlin/reflect/jvm/internal/impl/name/Name;)Ljava/util/Collection;", "Lkotlin/reflect/jvm/internal/impl/descriptors/FunctionDescriptor;", "getFunctions", "", "index", "getLocalProperty", "(I)Lkotlin/reflect/jvm/internal/impl/descriptors/PropertyDescriptor;", "Lkotlin/reflect/jvm/internal/impl/resolve/scopes/MemberScope;", "scope", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl$MemberBelonginess;", "belonginess", "Lkotlin/reflect/jvm/internal/KCallableImpl;", "getMembers", "(Lkotlin/reflect/jvm/internal/impl/resolve/scopes/MemberScope;Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl$MemberBelonginess;)Ljava/util/Collection;", "", "signature", "findPropertyDescriptor", "(Ljava/lang/String;Ljava/lang/String;)Lkotlin/reflect/jvm/internal/impl/descriptors/PropertyDescriptor;", "findFunctionDescriptor", "(Ljava/lang/String;Ljava/lang/String;)Lkotlin/reflect/jvm/internal/impl/descriptors/FunctionDescriptor;", "desc", "Ljava/lang/reflect/Method;", "findMethodBySignature", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/reflect/Method;", "", "isMember", "findDefaultMethod", "(Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/reflect/Method;", "Ljava/lang/reflect/Constructor;", "findConstructorBySignature", "(Ljava/lang/String;)Ljava/lang/reflect/Constructor;", "findDefaultConstructor", "Ljava/lang/Class;", "getMethodOwner", "()Ljava/lang/Class;", "methodOwner", "Lkotlin/reflect/jvm/internal/impl/descriptors/ConstructorDescriptor;", "getConstructorDescriptors", "()Ljava/util/Collection;", "constructorDescriptors", "Companion", "Data", "MemberBelonginess", "kotlin-reflection"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nKDeclarationContainerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KDeclarationContainerImpl.kt\nkotlin/reflect/jvm/internal/KDeclarationContainerImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 5 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 6 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,296:1\n1603#2,9:297\n1855#2:306\n1856#2:308\n1612#2:309\n766#2:310\n857#2,2:311\n1477#2:313\n1502#2,3:314\n1505#2,3:324\n766#2:327\n857#2,2:328\n1#3:307\n1#3:330\n361#4,7:317\n1282#5,2:331\n37#6,2:333\n37#6,2:335\n37#6,2:337\n*S KotlinDebug\n*F\n+ 1 KDeclarationContainerImpl.kt\nkotlin/reflect/jvm/internal/KDeclarationContainerImpl\n*L\n56#1:297,9\n56#1:306\n56#1:308\n56#1:309\n81#1:310\n81#1:311,2\n101#1:313\n101#1:314,3\n101#1:324,3\n123#1:327\n123#1:328,2\n56#1:307\n101#1:317,7\n179#1:331,2\n189#1:333,2\n197#1:335,2\n221#1:337,2\n*E\n"})
public abstract class KDeclarationContainerImpl implements ClassBasedDeclarationContainer {
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u001A\u0010\u0003\u001A\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001A\u0004\b\u0005\u0010\u0006R$\u0010\t\u001A\u0012\u0012\u0002\b\u0003 \b*\b\u0012\u0002\b\u0003\u0018\u00010\u00070\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000B"}, d2 = {"Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl$Companion;", "", "Lkotlin/text/Regex;", "LOCAL_PROPERTY_SIGNATURE", "Lkotlin/text/Regex;", "getLOCAL_PROPERTY_SIGNATURE$kotlin_reflection", "()Lkotlin/text/Regex;", "Ljava/lang/Class;", "kotlin.jvm.PlatformType", "DEFAULT_CONSTRUCTOR_MARKER", "Ljava/lang/Class;", "kotlin-reflection"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        @NotNull
        public final Regex getLOCAL_PROPERTY_SIGNATURE$kotlin_reflection() {
            return KDeclarationContainerImpl.b;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b¦\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl$Data;", "", "<init>", "(Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;)V", "kotlin-reflection"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public abstract class Data {
        public final LazySoftVal a;
        public static final KProperty[] b;

        static {
            Data.b = new KProperty[]{Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(Data.class), "moduleData", "getModuleData()Lorg/jetbrains/kotlin/descriptors/runtime/components/RuntimeModuleData;"))};
        }

        public Data() {
            this.a = ReflectProperties.lazySoft(new x(kDeclarationContainerImpl0));
        }

        @NotNull
        public final RuntimeModuleData getModuleData() {
            Object object0 = this.a.getValue(this, Data.b[0]);
            Intrinsics.checkNotNullExpressionValue(object0, "<get-moduleData>(...)");
            return (RuntimeModuleData)object0;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0005\b\u0084\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001J\u0015\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl$MemberBelonginess;", "", "Lkotlin/reflect/jvm/internal/impl/descriptors/CallableMemberDescriptor;", "member", "", "accept", "(Lkotlin/reflect/jvm/internal/impl/descriptors/CallableMemberDescriptor;)Z", "DECLARED", "INHERITED", "kotlin-reflection"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static enum MemberBelonginess {
        DECLARED,
        INHERITED;

        public final boolean accept(@NotNull CallableMemberDescriptor callableMemberDescriptor0) {
            Intrinsics.checkNotNullParameter(callableMemberDescriptor0, "member");
            return callableMemberDescriptor0.getKind().isReal() == (this == MemberBelonginess.DECLARED);
        }
    }

    @NotNull
    public static final Companion Companion;
    public static final Class a;
    public static final Regex b;

    static {
        KDeclarationContainerImpl.Companion = new Companion(null);
        KDeclarationContainerImpl.a = DefaultConstructorMarker.class;
        KDeclarationContainerImpl.b = new Regex("<v#(\\d+)>");
    }

    public final void a(ArrayList arrayList0, String s, boolean z) {
        ArrayList arrayList1 = this.b(s);
        arrayList0.addAll(arrayList1);
        int v = arrayList1.size();
        for(int v1 = 0; v1 < (v + 0x1F) / 0x20; ++v1) {
            Class class0 = Integer.TYPE;
            Intrinsics.checkNotNullExpressionValue(class0, "TYPE");
            arrayList0.add(class0);
        }
        if(z) {
            arrayList0.remove(KDeclarationContainerImpl.a);
            Intrinsics.checkNotNullExpressionValue(KDeclarationContainerImpl.a, "DEFAULT_CONSTRUCTOR_MARKER");
            arrayList0.add(KDeclarationContainerImpl.a);
            return;
        }
        arrayList0.add(Object.class);
    }

    public final ArrayList b(String s) {
        int v3;
        ArrayList arrayList0 = new ArrayList();
        for(int v = 1; s.charAt(v) != 41; v = v3) {
            int v1;
            for(v1 = v; s.charAt(v1) == 91; ++v1) {
            }
            int v2 = s.charAt(v1);
            if(StringsKt__StringsKt.contains$default("VZCBSIFJD", ((char)v2), false, 2, null)) {
                v3 = v1 + 1;
            }
            else {
                if(v2 != 76) {
                    throw new KotlinReflectionInternalError("Unknown type prefix in the method signature: " + s);
                }
                v3 = StringsKt__StringsKt.indexOf$default(s, ';', v, false, 4, null) + 1;
            }
            arrayList0.add(this.d(v, v3, s));
        }
        return arrayList0;
    }

    public static Method c(Class class0, String s, Class[] arr_class, Class class1, boolean z) {
        if(z) {
            arr_class[0] = class0;
        }
        Method method0 = KDeclarationContainerImpl.f(class0, s, arr_class, class1);
        if(method0 != null) {
            return method0;
        }
        Class class2 = class0.getSuperclass();
        if(class2 != null) {
            Method method1 = KDeclarationContainerImpl.c(class2, s, arr_class, class1, z);
            if(method1 != null) {
                return method1;
            }
        }
        Class[] arr_class1 = class0.getInterfaces();
        Intrinsics.checkNotNullExpressionValue(arr_class1, "interfaces");
        for(int v = 0; v < arr_class1.length; ++v) {
            Class class3 = arr_class1[v];
            Intrinsics.checkNotNullExpressionValue(class3, "superInterface");
            Method method2 = KDeclarationContainerImpl.c(class3, s, arr_class, class1, z);
            if(method2 != null) {
                return method2;
            }
            if(z) {
                Class class4 = ReflectJavaClassFinderKt.tryLoadClass(ReflectClassUtilKt.getSafeClassLoader(class3), class3.getName() + "$DefaultImpls");
                if(class4 != null) {
                    arr_class[0] = class3;
                    Method method3 = KDeclarationContainerImpl.f(class4, s, arr_class, class1);
                    if(method3 != null) {
                        return method3;
                    }
                }
            }
        }
        return null;
    }

    public final Class d(int v, int v1, String s) {
        Class class0;
        switch(s.charAt(v)) {
            case 66: {
                return Byte.TYPE;
            }
            case 67: {
                return Character.TYPE;
            }
            case 68: {
                return Double.TYPE;
            }
            case 70: {
                return Float.TYPE;
            }
            case 73: {
                return Integer.TYPE;
            }
            case 74: {
                return Long.TYPE;
            }
            case 76: {
                ClassLoader classLoader0 = ReflectClassUtilKt.getSafeClassLoader(this.getJClass());
                String s1 = s.substring(v + 1, v1 - 1);
                Intrinsics.checkNotNullExpressionValue(s1, "this as java.lang.String…ing(startIndex, endIndex)");
                class0 = classLoader0.loadClass(p.replace$default(s1, '/', '.', false, 4, null));
                Intrinsics.checkNotNullExpressionValue(class0, "jClass.safeClassLoader.l…d - 1).replace(\'/\', \'.\'))");
                return class0;
            }
            case 83: {
                return Short.TYPE;
            }
            case 86: {
                class0 = Void.TYPE;
                Intrinsics.checkNotNullExpressionValue(class0, "TYPE");
                return class0;
            }
            case 90: {
                return Boolean.TYPE;
            }
            case 91: {
                return UtilKt.createArrayType(this.d(v + 1, v1, s));
            }
            default: {
                throw new KotlinReflectionInternalError("Unknown type prefix in the method signature: " + s);
            }
        }
    }

    public static Constructor e(Class class0, ArrayList arrayList0) {
        try {
            Class[] arr_class = (Class[])arrayList0.toArray(new Class[0]);
            return class0.getDeclaredConstructor(((Class[])Arrays.copyOf(arr_class, arr_class.length)));
        }
        catch(NoSuchMethodException unused_ex) {
            return null;
        }
    }

    public static Method f(Class class0, String s, Class[] arr_class, Class class1) {
        try {
            Method method0 = class0.getDeclaredMethod(s, ((Class[])Arrays.copyOf(arr_class, arr_class.length)));
            if(Intrinsics.areEqual(method0.getReturnType(), class1)) {
                return method0;
            }
            Method[] arr_method = class0.getDeclaredMethods();
            Intrinsics.checkNotNullExpressionValue(arr_method, "declaredMethods");
            for(int v = 0; v < arr_method.length; ++v) {
                Method method1 = arr_method[v];
                if(Intrinsics.areEqual(method1.getName(), s) && Intrinsics.areEqual(method1.getReturnType(), class1) && Arrays.equals(method1.getParameterTypes(), arr_class)) {
                    return method1;
                }
            }
        }
        catch(NoSuchMethodException unused_ex) {
        }
        return null;
    }

    @Nullable
    public final Constructor findConstructorBySignature(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "desc");
        return KDeclarationContainerImpl.e(this.getJClass(), this.b(s));
    }

    @Nullable
    public final Constructor findDefaultConstructor(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "desc");
        Class class0 = this.getJClass();
        ArrayList arrayList0 = new ArrayList();
        this.a(arrayList0, s, true);
        return KDeclarationContainerImpl.e(class0, arrayList0);
    }

    @Nullable
    public final Method findDefaultMethod(@NotNull String s, @NotNull String s1, boolean z) {
        Intrinsics.checkNotNullParameter(s, "name");
        Intrinsics.checkNotNullParameter(s1, "desc");
        if(Intrinsics.areEqual(s, "<init>")) {
            return null;
        }
        ArrayList arrayList0 = new ArrayList();
        if(z) {
            arrayList0.add(this.getJClass());
        }
        this.a(arrayList0, s1, false);
        return KDeclarationContainerImpl.c(this.getMethodOwner(), s + "$default", ((Class[])arrayList0.toArray(new Class[0])), this.d(StringsKt__StringsKt.indexOf$default(s1, ')', 0, false, 6, null) + 1, s1.length(), s1), z);
    }

    @NotNull
    public final FunctionDescriptor findFunctionDescriptor(@NotNull String s, @NotNull String s1) {
        Collection collection0;
        Intrinsics.checkNotNullParameter(s, "name");
        Intrinsics.checkNotNullParameter(s1, "signature");
        if(Intrinsics.areEqual(s, "<init>")) {
            collection0 = CollectionsKt___CollectionsKt.toList(this.getConstructorDescriptors());
        }
        else {
            Name name0 = Name.identifier(s);
            Intrinsics.checkNotNullExpressionValue(name0, "identifier(name)");
            collection0 = this.getFunctions(name0);
        }
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: collection0) {
            if(Intrinsics.areEqual(RuntimeTypeMapper.INSTANCE.mapSignature(((FunctionDescriptor)object0)).asString(), s1)) {
                arrayList0.add(object0);
            }
        }
        if(arrayList0.size() != 1) {
            String s2 = CollectionsKt___CollectionsKt.joinToString$default(collection0, "\n", null, null, 0, null, a.C, 30, null);
            StringBuilder stringBuilder0 = b.w("Function \'", s, "\' (JVM signature: ", s1, ") not resolved in ");
            stringBuilder0.append(this);
            stringBuilder0.append(':');
            stringBuilder0.append((s2.length() == 0 ? " no members found" : "\n" + s2));
            throw new KotlinReflectionInternalError(stringBuilder0.toString());
        }
        return (FunctionDescriptor)CollectionsKt___CollectionsKt.single(arrayList0);
    }

    @Nullable
    public final Method findMethodBySignature(@NotNull String s, @NotNull String s1) {
        Intrinsics.checkNotNullParameter(s, "name");
        Intrinsics.checkNotNullParameter(s1, "desc");
        if(Intrinsics.areEqual(s, "<init>")) {
            return null;
        }
        Class[] arr_class = (Class[])this.b(s1).toArray(new Class[0]);
        Class class0 = this.d(StringsKt__StringsKt.indexOf$default(s1, ')', 0, false, 6, null) + 1, s1.length(), s1);
        Method method0 = KDeclarationContainerImpl.c(this.getMethodOwner(), s, arr_class, class0, false);
        if(method0 != null) {
            return method0;
        }
        if(this.getMethodOwner().isInterface()) {
            Method method1 = KDeclarationContainerImpl.c(Object.class, s, arr_class, class0, false);
            return method1 == null ? null : method1;
        }
        return null;
    }

    @NotNull
    public final PropertyDescriptor findPropertyDescriptor(@NotNull String s, @NotNull String s1) {
        Intrinsics.checkNotNullParameter(s, "name");
        Intrinsics.checkNotNullParameter(s1, "signature");
        MatchResult matchResult0 = KDeclarationContainerImpl.b.matchEntire(s1);
        if(matchResult0 != null) {
            String s2 = (String)matchResult0.getDestructured().getMatch().getGroupValues().get(1);
            PropertyDescriptor propertyDescriptor0 = this.getLocalProperty(Integer.parseInt(s2));
            if(propertyDescriptor0 != null) {
                return propertyDescriptor0;
            }
            StringBuilder stringBuilder0 = b.v("Local property #", s2, " not found in ");
            stringBuilder0.append(this.getJClass());
            throw new KotlinReflectionInternalError(stringBuilder0.toString());
        }
        Name name0 = Name.identifier(s);
        Intrinsics.checkNotNullExpressionValue(name0, "identifier(name)");
        Iterable iterable0 = this.getProperties(name0);
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: iterable0) {
            if(Intrinsics.areEqual(RuntimeTypeMapper.INSTANCE.mapPropertySignature(((PropertyDescriptor)object0)).asString(), s1)) {
                arrayList0.add(object0);
            }
        }
        if(!arrayList0.isEmpty()) {
            if(arrayList0.size() != 1) {
                LinkedHashMap linkedHashMap0 = new LinkedHashMap();
                for(Object object1: arrayList0) {
                    DescriptorVisibility descriptorVisibility0 = ((PropertyDescriptor)object1).getVisibility();
                    ArrayList arrayList1 = linkedHashMap0.get(descriptorVisibility0);
                    if(arrayList1 == null) {
                        arrayList1 = new ArrayList();
                        linkedHashMap0.put(descriptorVisibility0, arrayList1);
                    }
                    arrayList1.add(object1);
                }
                Collection collection0 = w.toSortedMap(linkedHashMap0, new c(g.w, 1)).values();
                Intrinsics.checkNotNullExpressionValue(collection0, "properties\n             …\n                }.values");
                List list0 = (List)CollectionsKt___CollectionsKt.last(collection0);
                if(list0.size() == 1) {
                    Intrinsics.checkNotNullExpressionValue(list0, "mostVisibleProperties");
                    return (PropertyDescriptor)CollectionsKt___CollectionsKt.first(list0);
                }
                Name name1 = Name.identifier(s);
                Intrinsics.checkNotNullExpressionValue(name1, "identifier(name)");
                String s3 = CollectionsKt___CollectionsKt.joinToString$default(this.getProperties(name1), "\n", null, null, 0, null, a.D, 30, null);
                StringBuilder stringBuilder1 = b.w("Property \'", s, "\' (JVM signature: ", s1, ") not resolved in ");
                stringBuilder1.append(this);
                stringBuilder1.append(':');
                stringBuilder1.append((s3.length() == 0 ? " no members found" : "\n" + s3));
                throw new KotlinReflectionInternalError(stringBuilder1.toString());
            }
            return (PropertyDescriptor)CollectionsKt___CollectionsKt.single(arrayList0);
        }
        StringBuilder stringBuilder2 = b.w("Property \'", s, "\' (JVM signature: ", s1, ") not resolved in ");
        stringBuilder2.append(this);
        throw new KotlinReflectionInternalError(stringBuilder2.toString());
    }

    @NotNull
    public abstract Collection getConstructorDescriptors();

    @NotNull
    public abstract Collection getFunctions(@NotNull Name arg1);

    @Nullable
    public abstract PropertyDescriptor getLocalProperty(int arg1);

    @NotNull
    public final Collection getMembers(@NotNull MemberScope memberScope0, @NotNull MemberBelonginess kDeclarationContainerImpl$MemberBelonginess0) {
        Intrinsics.checkNotNullParameter(memberScope0, "scope");
        Intrinsics.checkNotNullParameter(kDeclarationContainerImpl$MemberBelonginess0, "belonginess");
        kotlin.reflect.jvm.internal.KDeclarationContainerImpl.getMembers.visitor.1 kDeclarationContainerImpl$getMembers$visitor$10 = new CreateKCallableVisitor() {  // 初始化器: Lkotlin/reflect/jvm/internal/CreateKCallableVisitor;-><init>(Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;)V
            @Override  // kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorVisitorEmptyBodies
            public Object visitConstructorDescriptor(ConstructorDescriptor constructorDescriptor0, Object object0) {
                return this.visitConstructorDescriptor(constructorDescriptor0, ((Unit)object0));
            }

            @NotNull
            public KCallableImpl visitConstructorDescriptor(@NotNull ConstructorDescriptor constructorDescriptor0, @NotNull Unit unit0) {
                Intrinsics.checkNotNullParameter(constructorDescriptor0, "descriptor");
                Intrinsics.checkNotNullParameter(unit0, "data");
                throw new IllegalStateException("No constructors should appear here: " + constructorDescriptor0);
            }
        };
        Iterable iterable0 = DefaultImpls.getContributedDescriptors$default(memberScope0, null, null, 3, null);
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: iterable0) {
            DeclarationDescriptor declarationDescriptor0 = (DeclarationDescriptor)object0;
            KCallableImpl kCallableImpl0 = !(declarationDescriptor0 instanceof CallableMemberDescriptor) || Intrinsics.areEqual(((CallableMemberDescriptor)declarationDescriptor0).getVisibility(), DescriptorVisibilities.INVISIBLE_FAKE) || !kDeclarationContainerImpl$MemberBelonginess0.accept(((CallableMemberDescriptor)declarationDescriptor0)) ? null : ((KCallableImpl)declarationDescriptor0.accept(kDeclarationContainerImpl$getMembers$visitor$10, Unit.INSTANCE));
            if(kCallableImpl0 != null) {
                arrayList0.add(kCallableImpl0);
            }
        }
        return CollectionsKt___CollectionsKt.toList(arrayList0);
    }

    @NotNull
    public Class getMethodOwner() {
        Class class0 = ReflectClassUtilKt.getWrapperByPrimitive(this.getJClass());
        return class0 == null ? this.getJClass() : class0;
    }

    @NotNull
    public abstract Collection getProperties(@NotNull Name arg1);
}

