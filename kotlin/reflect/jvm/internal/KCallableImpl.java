package kotlin.reflect.jvm.internal;

import fe.c;
import fe.e;
import java.lang.reflect.Array;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.l;
import kotlin.coroutines.Continuation;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KCallable;
import kotlin.reflect.KParameter.Kind;
import kotlin.reflect.KParameter;
import kotlin.reflect.KType;
import kotlin.reflect.KVisibility;
import kotlin.reflect.full.IllegalCallableAccessException;
import kotlin.reflect.jvm.KTypesJvm;
import kotlin.reflect.jvm.internal.calls.Caller;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u001B\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b \u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00020\u0003B\u0007\u00A2\u0006\u0004\b\u0004\u0010\u0005J\'\u0010\t\u001A\u00028\u00002\u0016\u0010\b\u001A\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00070\u0006\"\u0004\u0018\u00010\u0007H\u0016\u00A2\u0006\u0004\b\t\u0010\nJ%\u0010\r\u001A\u00028\u00002\u0014\u0010\b\u001A\u0010\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u000BH\u0016\u00A2\u0006\u0004\b\r\u0010\u000EJ3\u0010\u0013\u001A\u00028\u00002\u0014\u0010\b\u001A\u0010\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u000B2\f\u0010\u0010\u001A\b\u0012\u0002\b\u0003\u0018\u00010\u000FH\u0000\u00A2\u0006\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0017\u001A\u0006\u0012\u0002\b\u00030\u00148&X\u00A6\u0004\u00A2\u0006\u0006\u001A\u0004\b\u0015\u0010\u0016R\u001A\u0010\u0019\u001A\b\u0012\u0002\b\u0003\u0018\u00010\u00148&X\u00A6\u0004\u00A2\u0006\u0006\u001A\u0004\b\u0018\u0010\u0016R\u0014\u0010\u001D\u001A\u00020\u001A8&X\u00A6\u0004\u00A2\u0006\u0006\u001A\u0004\b\u001B\u0010\u001CR\u0014\u0010\u001F\u001A\u00020\u001E8&X\u00A6\u0004\u00A2\u0006\u0006\u001A\u0004\b\u001F\u0010 R\u001A\u0010%\u001A\b\u0012\u0004\u0012\u00020\"0!8VX\u0096\u0004\u00A2\u0006\u0006\u001A\u0004\b#\u0010$R\u001A\u0010\'\u001A\b\u0012\u0004\u0012\u00020\f0!8VX\u0096\u0004\u00A2\u0006\u0006\u001A\u0004\b&\u0010$R\u0014\u0010+\u001A\u00020(8VX\u0096\u0004\u00A2\u0006\u0006\u001A\u0004\b)\u0010*R\u001A\u0010.\u001A\b\u0012\u0004\u0012\u00020,0!8VX\u0096\u0004\u00A2\u0006\u0006\u001A\u0004\b-\u0010$R\u0016\u00102\u001A\u0004\u0018\u00010/8VX\u0096\u0004\u00A2\u0006\u0006\u001A\u0004\b0\u00101R\u0014\u00103\u001A\u00020\u001E8VX\u0096\u0004\u00A2\u0006\u0006\u001A\u0004\b3\u0010 R\u0014\u00104\u001A\u00020\u001E8VX\u0096\u0004\u00A2\u0006\u0006\u001A\u0004\b4\u0010 R\u0014\u00105\u001A\u00020\u001E8VX\u0096\u0004\u00A2\u0006\u0006\u001A\u0004\b5\u0010 R\u0014\u00106\u001A\u00020\u001E8DX\u0084\u0004\u00A2\u0006\u0006\u001A\u0004\b6\u0010 R\u0014\u0010:\u001A\u0002078&X\u00A6\u0004\u00A2\u0006\u0006\u001A\u0004\b8\u00109\u00A8\u0006;"}, d2 = {"Lkotlin/reflect/jvm/internal/KCallableImpl;", "R", "Lkotlin/reflect/KCallable;", "Lkotlin/reflect/jvm/internal/KTypeParameterOwnerImpl;", "<init>", "()V", "", "", "args", "call", "([Ljava/lang/Object;)Ljava/lang/Object;", "", "Lkotlin/reflect/KParameter;", "callBy", "(Ljava/util/Map;)Ljava/lang/Object;", "Lkotlin/coroutines/Continuation;", "continuationArgument", "callDefaultMethod$kotlin_reflection", "(Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "callDefaultMethod", "Lkotlin/reflect/jvm/internal/calls/Caller;", "getCaller", "()Lkotlin/reflect/jvm/internal/calls/Caller;", "caller", "getDefaultCaller", "defaultCaller", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "getContainer", "()Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "container", "", "isBound", "()Z", "", "", "getAnnotations", "()Ljava/util/List;", "annotations", "getParameters", "parameters", "Lkotlin/reflect/KType;", "getReturnType", "()Lkotlin/reflect/KType;", "returnType", "Lkotlin/reflect/KTypeParameter;", "getTypeParameters", "typeParameters", "Lkotlin/reflect/KVisibility;", "getVisibility", "()Lkotlin/reflect/KVisibility;", "visibility", "isFinal", "isOpen", "isAbstract", "isAnnotationConstructor", "Lkotlin/reflect/jvm/internal/impl/descriptors/CallableMemberDescriptor;", "getDescriptor", "()Lorg/jetbrains/kotlin/descriptors/CallableMemberDescriptor;", "descriptor", "kotlin-reflection"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nKCallableImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KCallableImpl.kt\nkotlin/reflect/jvm/internal/KCallableImpl\n+ 2 util.kt\nkotlin/reflect/jvm/internal/UtilKt\n+ 3 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,243:1\n224#2,5:244\n224#2,2:249\n226#2,3:252\n224#2,5:255\n224#2,5:260\n224#2,2:269\n226#2,3:273\n26#3:251\n1549#4:265\n1620#4,3:266\n37#5,2:271\n*S KotlinDebug\n*F\n+ 1 KCallableImpl.kt\nkotlin/reflect/jvm/internal/KCallableImpl\n*L\n106#1:244,5\n148#1:249,2\n148#1:252,3\n187#1:255,5\n195#1:260,5\n215#1:269,2\n215#1:273,3\n149#1:251\n201#1:265\n201#1:266,3\n216#1:271,2\n*E\n"})
public abstract class KCallableImpl implements KCallable, KTypeParameterOwnerImpl {
    public final LazySoftVal a;
    public final LazySoftVal b;
    public final LazySoftVal c;
    public final LazySoftVal d;
    public final LazySoftVal e;

    public KCallableImpl() {
        LazySoftVal reflectProperties$LazySoftVal0 = ReflectProperties.lazySoft(new c(this, 1));
        Intrinsics.checkNotNullExpressionValue(reflectProperties$LazySoftVal0, "lazySoft { descriptor.computeAnnotations() }");
        this.a = reflectProperties$LazySoftVal0;
        LazySoftVal reflectProperties$LazySoftVal1 = ReflectProperties.lazySoft(new e(this));
        Intrinsics.checkNotNullExpressionValue(reflectProperties$LazySoftVal1, "lazySoft {\n        val d…ze()\n        result\n    }");
        this.b = reflectProperties$LazySoftVal1;
        LazySoftVal reflectProperties$LazySoftVal2 = ReflectProperties.lazySoft(new c(this, 3));
        Intrinsics.checkNotNullExpressionValue(reflectProperties$LazySoftVal2, "lazySoft {\n        KType…eturnType\n        }\n    }");
        this.c = reflectProperties$LazySoftVal2;
        LazySoftVal reflectProperties$LazySoftVal3 = ReflectProperties.lazySoft(new c(this, 4));
        Intrinsics.checkNotNullExpressionValue(reflectProperties$LazySoftVal3, "lazySoft {\n        descr…this, descriptor) }\n    }");
        this.d = reflectProperties$LazySoftVal3;
        LazySoftVal reflectProperties$LazySoftVal4 = ReflectProperties.lazySoft(new c(this, 0));
        Intrinsics.checkNotNullExpressionValue(reflectProperties$LazySoftVal4, "lazySoft {\n        val p…\n\n        arguments\n    }");
        this.e = reflectProperties$LazySoftVal4;
    }

    public static Object a(KType kType0) {
        Class class0 = JvmClassMappingKt.getJavaClass(KTypesJvm.getJvmErasure(kType0));
        if(!class0.isArray()) {
            throw new KotlinReflectionInternalError("Cannot instantiate the default empty array of type " + class0.getSimpleName() + ", because it is not an array type");
        }
        Object object0 = Array.newInstance(class0.getComponentType(), 0);
        Intrinsics.checkNotNullExpressionValue(object0, "type.jvmErasure.java.run…\"\n            )\n        }");
        return object0;
    }

    public static final Object access$defaultEmptyArray(KCallableImpl kCallableImpl0, KType kType0) {
        kCallableImpl0.getClass();
        return KCallableImpl.a(kType0);
    }

    public static final Type access$extractContinuationArgument(KCallableImpl kCallableImpl0) {
        if(kCallableImpl0.isSuspend()) {
            Object object0 = CollectionsKt___CollectionsKt.lastOrNull(kCallableImpl0.getCaller().getParameterTypes());
            ParameterizedType parameterizedType0 = object0 instanceof ParameterizedType ? ((ParameterizedType)object0) : null;
            if(Intrinsics.areEqual((parameterizedType0 == null ? null : parameterizedType0.getRawType()), Continuation.class)) {
                Type[] arr_type = parameterizedType0.getActualTypeArguments();
                Intrinsics.checkNotNullExpressionValue(arr_type, "continuationType.actualTypeArguments");
                Object object1 = ArraysKt___ArraysKt.single(arr_type);
                WildcardType wildcardType0 = object1 instanceof WildcardType ? ((WildcardType)object1) : null;
                if(wildcardType0 != null) {
                    Type[] arr_type1 = wildcardType0.getLowerBounds();
                    return arr_type1 == null ? null : ((Type)ArraysKt___ArraysKt.first(arr_type1));
                }
            }
        }
        return null;
    }

    @Override  // kotlin.reflect.KCallable
    public Object call(@NotNull Object[] arr_object) {
        Intrinsics.checkNotNullParameter(arr_object, "args");
        try {
            return this.getCaller().call(arr_object);
        }
        catch(IllegalAccessException illegalAccessException0) {
            throw new IllegalCallableAccessException(illegalAccessException0);
        }
    }

    @Override  // kotlin.reflect.KCallable
    public Object callBy(@NotNull Map map0) {
        Object object1;
        Intrinsics.checkNotNullParameter(map0, "args");
        if(this.isAnnotationConstructor()) {
            Iterable iterable0 = this.getParameters();
            ArrayList arrayList0 = new ArrayList(l.collectionSizeOrDefault(iterable0, 10));
            for(Object object0: iterable0) {
                KParameter kParameter0 = (KParameter)object0;
                if(map0.containsKey(kParameter0)) {
                    object1 = map0.get(kParameter0);
                    if(object1 == null) {
                        throw new IllegalArgumentException("Annotation argument value cannot be null (" + kParameter0 + ')');
                    }
                }
                else if(kParameter0.isOptional()) {
                    object1 = null;
                }
                else {
                    if(!kParameter0.isVararg()) {
                        throw new IllegalArgumentException("No argument provided for a required parameter: " + kParameter0);
                    }
                    object1 = KCallableImpl.a(kParameter0.getType());
                }
                arrayList0.add(object1);
            }
            Caller caller0 = this.getDefaultCaller();
            if(caller0 != null) {
                try {
                    return caller0.call(arrayList0.toArray(new Object[0]));
                }
                catch(IllegalAccessException illegalAccessException0) {
                    throw new IllegalCallableAccessException(illegalAccessException0);
                }
            }
            throw new KotlinReflectionInternalError("This callable does not support a default call: " + this.getDescriptor());
        }
        return this.callDefaultMethod$kotlin_reflection(map0, null);
    }

    public final Object callDefaultMethod$kotlin_reflection(@NotNull Map map0, @Nullable Continuation continuation0) {
        Intrinsics.checkNotNullParameter(map0, "args");
        List list0 = this.getParameters();
        boolean z = false;
        if(list0.isEmpty()) {
            try {
                return this.getCaller().call((this.isSuspend() ? new Continuation[]{continuation0} : new Continuation[0]));
            }
            catch(IllegalAccessException illegalAccessException0) {
                throw new IllegalCallableAccessException(illegalAccessException0);
            }
        }
        int v = this.isSuspend() + list0.size();
        Object[] arr_object = (Object[])((Object[])this.e.invoke()).clone();
        if(this.isSuspend()) {
            arr_object[list0.size()] = continuation0;
        }
        int v1 = 0;
        for(Object object0: list0) {
            KParameter kParameter0 = (KParameter)object0;
            if(map0.containsKey(kParameter0)) {
                int v2 = kParameter0.getIndex();
                arr_object[v2] = map0.get(kParameter0);
            }
            else if(kParameter0.isOptional()) {
                int v3 = v1 / 0x20 + v;
                Object object1 = arr_object[v3];
                Intrinsics.checkNotNull(object1, "null cannot be cast to non-null type kotlin.Int");
                arr_object[v3] = (int)(((int)(((Integer)object1))) | 1 << v1 % 0x20);
                z = true;
            }
            else if(!kParameter0.isVararg()) {
                throw new IllegalArgumentException("No argument provided for a required parameter: " + kParameter0);
            }
            if(kParameter0.getKind() == Kind.VALUE) {
                ++v1;
            }
        }
        if(!z) {
            try {
                Caller caller0 = this.getCaller();
                Object[] arr_object1 = Arrays.copyOf(arr_object, v);
                Intrinsics.checkNotNullExpressionValue(arr_object1, "copyOf(this, newSize)");
                return caller0.call(arr_object1);
            }
            catch(IllegalAccessException illegalAccessException1) {
                throw new IllegalCallableAccessException(illegalAccessException1);
            }
        }
        Caller caller1 = this.getDefaultCaller();
        if(caller1 != null) {
            try {
                return caller1.call(arr_object);
            }
            catch(IllegalAccessException illegalAccessException2) {
                throw new IllegalCallableAccessException(illegalAccessException2);
            }
        }
        throw new KotlinReflectionInternalError("This callable does not support a default call: " + this.getDescriptor());
    }

    @Override  // kotlin.reflect.KAnnotatedElement
    @NotNull
    public List getAnnotations() {
        Object object0 = this.a.invoke();
        Intrinsics.checkNotNullExpressionValue(object0, "_annotations()");
        return (List)object0;
    }

    @NotNull
    public abstract Caller getCaller();

    @NotNull
    public abstract KDeclarationContainerImpl getContainer();

    @Nullable
    public abstract Caller getDefaultCaller();

    @NotNull
    public abstract CallableMemberDescriptor getDescriptor();

    @Override  // kotlin.reflect.KCallable
    @NotNull
    public List getParameters() {
        Object object0 = this.b.invoke();
        Intrinsics.checkNotNullExpressionValue(object0, "_parameters()");
        return (List)object0;
    }

    @Override  // kotlin.reflect.KCallable
    @NotNull
    public KType getReturnType() {
        Object object0 = this.c.invoke();
        Intrinsics.checkNotNullExpressionValue(object0, "_returnType()");
        return (KType)object0;
    }

    @Override  // kotlin.reflect.KCallable
    @NotNull
    public List getTypeParameters() {
        Object object0 = this.d.invoke();
        Intrinsics.checkNotNullExpressionValue(object0, "_typeParameters()");
        return (List)object0;
    }

    @Override  // kotlin.reflect.KCallable
    @Nullable
    public KVisibility getVisibility() {
        DescriptorVisibility descriptorVisibility0 = this.getDescriptor().getVisibility();
        Intrinsics.checkNotNullExpressionValue(descriptorVisibility0, "descriptor.visibility");
        return UtilKt.toKVisibility(descriptorVisibility0);
    }

    @Override  // kotlin.reflect.KCallable
    public boolean isAbstract() {
        return this.getDescriptor().getModality() == Modality.ABSTRACT;
    }

    // 去混淆评级： 低(20)
    public final boolean isAnnotationConstructor() {
        return Intrinsics.areEqual(this.getName(), "<init>") && this.getContainer().getJClass().isAnnotation();
    }

    public abstract boolean isBound();

    @Override  // kotlin.reflect.KCallable
    public boolean isFinal() {
        return this.getDescriptor().getModality() == Modality.FINAL;
    }

    @Override  // kotlin.reflect.KCallable
    public boolean isOpen() {
        return this.getDescriptor().getModality() == Modality.OPEN;
    }
}

