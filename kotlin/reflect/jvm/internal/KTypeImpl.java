package kotlin.reflect.jvm.internal;

import fe.o;
import fe.p;
import java.lang.reflect.Type;
import java.util.List;
import kotlin.Metadata;
import kotlin.NotImplementedError;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.KTypeBase;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClassifier;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.KTypesJvm;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt;
import kotlin.reflect.jvm.internal.impl.types.FlexibleTypesKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.TypeUtils;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u001B\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0010\b\u0002\u0010\u0006\u001A\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\r\u001A\u00020\u00002\u0006\u0010\n\u001A\u00020\tH\u0000¢\u0006\u0004\b\u000B\u0010\fJ\u001A\u0010\u0010\u001A\u00020\t2\b\u0010\u000F\u001A\u0004\u0018\u00010\u000EH\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000F\u0010\u0013\u001A\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000F\u0010\u0016\u001A\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u001D\u0010\u001D\u001A\u0004\u0018\u00010\u00188VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u001A\u001A\u0004\b\u001B\u0010\u001CR!\u0010#\u001A\b\u0012\u0004\u0012\u00020\u001F0\u001E8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b \u0010\u001A\u001A\u0004\b!\u0010\"R\u0016\u0010&\u001A\u0004\u0018\u00010\u00058VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b$\u0010%R\u0014\u0010\'\u001A\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\'\u0010(R\u001A\u0010+\u001A\b\u0012\u0004\u0012\u00020)0\u001E8VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b*\u0010\"¨\u0006-²\u0006\u0012\u0010,\u001A\b\u0012\u0004\u0012\u00020\u00050\u001E8\nX\u008A\u0084\u0002"}, d2 = {"Lkotlin/reflect/jvm/internal/KTypeImpl;", "Lkotlin/jvm/internal/KTypeBase;", "Lkotlin/reflect/jvm/internal/impl/types/KotlinType;", "type", "Lkotlin/Function0;", "Ljava/lang/reflect/Type;", "computeJavaType", "<init>", "(Lorg/jetbrains/kotlin/types/KotlinType;Lkotlin/jvm/functions/Function0;)V", "", "nullable", "makeNullableAsSpecified$kotlin_reflection", "(Z)Lkotlin/reflect/jvm/internal/KTypeImpl;", "makeNullableAsSpecified", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lkotlin/reflect/KClassifier;", "c", "Lkotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal;", "getClassifier", "()Lkotlin/reflect/KClassifier;", "classifier", "", "Lkotlin/reflect/KTypeProjection;", "d", "getArguments", "()Ljava/util/List;", "arguments", "getJavaType", "()Ljava/lang/reflect/Type;", "javaType", "isMarkedNullable", "()Z", "", "getAnnotations", "annotations", "parameterizedTypeArguments", "kotlin-reflection"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nKTypeImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KTypeImpl.kt\nkotlin/reflect/jvm/internal/KTypeImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,136:1\n1#2:137\n*E\n"})
public final class KTypeImpl implements KTypeBase {
    public final KotlinType a;
    public final LazySoftVal b;
    public final LazySoftVal c;
    public final LazySoftVal d;
    public static final KProperty[] e;

    static {
        KTypeImpl.e = new KProperty[]{Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(KTypeImpl.class), "classifier", "getClassifier()Lkotlin/reflect/KClassifier;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(KTypeImpl.class), "arguments", "getArguments()Ljava/util/List;"))};
    }

    public KTypeImpl(@NotNull KotlinType kotlinType0, @Nullable Function0 function00) {
        Intrinsics.checkNotNullParameter(kotlinType0, "type");
        super();
        this.a = kotlinType0;
        LazySoftVal reflectProperties$LazySoftVal0 = null;
        LazySoftVal reflectProperties$LazySoftVal1 = function00 instanceof LazySoftVal ? ((LazySoftVal)function00) : null;
        if(reflectProperties$LazySoftVal1 != null) {
            reflectProperties$LazySoftVal0 = reflectProperties$LazySoftVal1;
        }
        else if(function00 != null) {
            reflectProperties$LazySoftVal0 = ReflectProperties.lazySoft(function00);
        }
        this.b = reflectProperties$LazySoftVal0;
        this.c = ReflectProperties.lazySoft(new o(this, 1));
        this.d = ReflectProperties.lazySoft(new p(this, function00));
    }

    public KTypeImpl(KotlinType kotlinType0, Function0 function00, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v & 2) != 0) {
            function00 = null;
        }
        this(kotlinType0, function00);
    }

    public final KClassifier a(KotlinType kotlinType0) {
        ClassifierDescriptor classifierDescriptor0 = kotlinType0.getConstructor().getDeclarationDescriptor();
        if(classifierDescriptor0 instanceof ClassDescriptor) {
            Class class0 = UtilKt.toJavaClass(((ClassDescriptor)classifierDescriptor0));
            if(class0 == null) {
                return null;
            }
            if(class0.isArray()) {
                TypeProjection typeProjection0 = (TypeProjection)CollectionsKt___CollectionsKt.singleOrNull(kotlinType0.getArguments());
                if(typeProjection0 != null) {
                    KotlinType kotlinType1 = typeProjection0.getType();
                    if(kotlinType1 != null) {
                        KClassifier kClassifier0 = this.a(kotlinType1);
                        if(kClassifier0 == null) {
                            throw new KotlinReflectionInternalError("Cannot determine classifier for array element type: " + this);
                        }
                        return new KClassImpl(UtilKt.createArrayType(JvmClassMappingKt.getJavaClass(KTypesJvm.getJvmErasure(kClassifier0))));
                    }
                }
                return new KClassImpl(class0);
            }
            if(!TypeUtils.isNullableType(kotlinType0)) {
                Class class1 = ReflectClassUtilKt.getPrimitiveByWrapper(class0);
                if(class1 != null) {
                    class0 = class1;
                }
                return new KClassImpl(class0);
            }
            return new KClassImpl(class0);
        }
        if(classifierDescriptor0 instanceof TypeParameterDescriptor) {
            return new KTypeParameterImpl(null, ((TypeParameterDescriptor)classifierDescriptor0));
        }
        if(classifierDescriptor0 instanceof TypeAliasDescriptor) {
            throw new NotImplementedError("An operation is not implemented: Type alias classifiers are not yet supported");
        }
        return null;
    }

    public static final KClassifier access$convert(KTypeImpl kTypeImpl0, KotlinType kotlinType0) {
        return kTypeImpl0.a(kotlinType0);
    }

    // 去混淆评级： 低(40)
    @Override
    public boolean equals(@Nullable Object object0) {
        return object0 instanceof KTypeImpl && Intrinsics.areEqual(this.a, ((KTypeImpl)object0).a) && Intrinsics.areEqual(this.getClassifier(), ((KTypeImpl)object0).getClassifier()) && Intrinsics.areEqual(this.getArguments(), ((KTypeImpl)object0).getArguments());
    }

    @Override  // kotlin.reflect.KAnnotatedElement
    @NotNull
    public List getAnnotations() {
        return UtilKt.computeAnnotations(this.a);
    }

    @Override  // kotlin.reflect.KType
    @NotNull
    public List getArguments() {
        Object object0 = this.d.getValue(this, KTypeImpl.e[1]);
        Intrinsics.checkNotNullExpressionValue(object0, "<get-arguments>(...)");
        return (List)object0;
    }

    @Override  // kotlin.reflect.KType
    @Nullable
    public KClassifier getClassifier() {
        return (KClassifier)this.c.getValue(this, KTypeImpl.e[0]);
    }

    @Override  // kotlin.jvm.internal.KTypeBase
    @Nullable
    public Type getJavaType() {
        return this.b == null ? null : ((Type)this.b.invoke());
    }

    @NotNull
    public final KotlinType getType() {
        return this.a;
    }

    @Override
    public int hashCode() {
        int v = this.a.hashCode();
        KClassifier kClassifier0 = this.getClassifier();
        return kClassifier0 == null ? this.getArguments().hashCode() + v * 961 : this.getArguments().hashCode() + (v * 0x1F + kClassifier0.hashCode()) * 0x1F;
    }

    @Override  // kotlin.reflect.KType
    public boolean isMarkedNullable() {
        return this.a.isMarkedNullable();
    }

    @NotNull
    public final KTypeImpl makeNullableAsSpecified$kotlin_reflection(boolean z) {
        KotlinType kotlinType0 = this.a;
        if(!FlexibleTypesKt.isFlexible(kotlinType0) && this.isMarkedNullable() == z) {
            return this;
        }
        KotlinType kotlinType1 = TypeUtils.makeNullableAsSpecified(kotlinType0, z);
        Intrinsics.checkNotNullExpressionValue(kotlinType1, "makeNullableAsSpecified(type, nullable)");
        return new KTypeImpl(kotlinType1, this.b);
    }

    @Override
    @NotNull
    public String toString() {
        return ReflectionObjectRenderer.INSTANCE.renderType(this.a);
    }
}

