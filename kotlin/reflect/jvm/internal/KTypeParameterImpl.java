package kotlin.reflect.jvm.internal;

import d0.s;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.TypeParameterReference;
import kotlin.reflect.KClass;
import kotlin.reflect.KProperty;
import kotlin.reflect.KTypeParameter;
import kotlin.reflect.KVariance;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.ReflectKotlinClass;
import kotlin.reflect.jvm.internal.impl.load.kotlin.JvmPackagePartSource;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedContainerSource;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\u0012\b\u0010\u0004\u001A\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001A\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001A\u0010\f\u001A\u00020\u000B2\b\u0010\n\u001A\u0004\u0018\u00010\tH\u0096\u0002¢\u0006\u0004\b\f\u0010\rJ\u000F\u0010\u000F\u001A\u00020\u000EH\u0016¢\u0006\u0004\b\u000F\u0010\u0010J\u000F\u0010\u0012\u001A\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R!\u0010\u001A\u001A\b\u0012\u0004\u0012\u00020\u00150\u00148VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001A\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001C\u001A\u00020\u00118VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\u001B\u0010\u0013R\u0014\u0010 \u001A\u00020\u001D8VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\u001E\u0010\u001FR\u0014\u0010!\u001A\u00020\u000B8VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Lkotlin/reflect/jvm/internal/KTypeParameterImpl;", "Lkotlin/reflect/KTypeParameter;", "Lkotlin/reflect/jvm/internal/KClassifierImpl;", "Lkotlin/reflect/jvm/internal/KTypeParameterOwnerImpl;", "container", "Lkotlin/reflect/jvm/internal/impl/descriptors/TypeParameterDescriptor;", "descriptor", "<init>", "(Lkotlin/reflect/jvm/internal/KTypeParameterOwnerImpl;Lorg/jetbrains/kotlin/descriptors/TypeParameterDescriptor;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "", "Lkotlin/reflect/KType;", "b", "Lkotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal;", "getUpperBounds", "()Ljava/util/List;", "upperBounds", "getName", "name", "Lkotlin/reflect/KVariance;", "getVariance", "()Lkotlin/reflect/KVariance;", "variance", "isReified", "()Z", "kotlin-reflection"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class KTypeParameterImpl implements KTypeParameter, KClassifierImpl {
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 0x30)
    public final class WhenMappings {
        public static final int[] $EnumSwitchMapping$0;

        static {
            int[] arr_v = new int[Variance.values().length];
            try {
                arr_v[Variance.INVARIANT.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[Variance.IN_VARIANCE.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[Variance.OUT_VARIANCE.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            WhenMappings.$EnumSwitchMapping$0 = arr_v;
        }
    }

    public final TypeParameterDescriptor a;
    public final LazySoftVal b;
    public final KTypeParameterOwnerImpl c;
    public static final KProperty[] d;

    static {
        KTypeParameterImpl.d = new KProperty[]{Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(KTypeParameterImpl.class), "upperBounds", "getUpperBounds()Ljava/util/List;"))};
    }

    public KTypeParameterImpl(@Nullable KTypeParameterOwnerImpl kTypeParameterOwnerImpl0, @NotNull TypeParameterDescriptor typeParameterDescriptor0) {
        Intrinsics.checkNotNullParameter(typeParameterDescriptor0, "descriptor");
        KClassImpl kClassImpl0;
        super();
        this.a = typeParameterDescriptor0;
        this.b = ReflectProperties.lazySoft(new s(this, 11));
        if(kTypeParameterOwnerImpl0 == null) {
            DeclarationDescriptor declarationDescriptor0 = this.getDescriptor().getContainingDeclaration();
            Intrinsics.checkNotNullExpressionValue(declarationDescriptor0, "descriptor.containingDeclaration");
            if(declarationDescriptor0 instanceof ClassDescriptor) {
                kClassImpl0 = KTypeParameterImpl.a(((ClassDescriptor)declarationDescriptor0));
                Intrinsics.checkNotNullExpressionValue(kClassImpl0, "when (val declaration = … $declaration\")\n        }");
                kTypeParameterOwnerImpl0 = kClassImpl0;
            }
            else {
                if(!(declarationDescriptor0 instanceof CallableMemberDescriptor)) {
                    throw new KotlinReflectionInternalError("Unknown type parameter container: " + declarationDescriptor0);
                }
                ReflectKotlinClass reflectKotlinClass0 = null;
                DeclarationDescriptor declarationDescriptor1 = ((CallableMemberDescriptor)declarationDescriptor0).getContainingDeclaration();
                Intrinsics.checkNotNullExpressionValue(declarationDescriptor1, "declaration.containingDeclaration");
                if(declarationDescriptor1 instanceof ClassDescriptor) {
                    kClassImpl0 = declarationDescriptor0.accept(new CreateKCallableVisitor(KTypeParameterImpl.a(((ClassDescriptor)declarationDescriptor1))), Unit.INSTANCE);
                    Intrinsics.checkNotNullExpressionValue(kClassImpl0, "when (val declaration = … $declaration\")\n        }");
                    kTypeParameterOwnerImpl0 = kClassImpl0;
                }
                else {
                    DeserializedMemberDescriptor deserializedMemberDescriptor0 = declarationDescriptor0 instanceof DeserializedMemberDescriptor ? ((DeserializedMemberDescriptor)declarationDescriptor0) : null;
                    if(deserializedMemberDescriptor0 == null) {
                        throw new KotlinReflectionInternalError("Non-class callable descriptor must be deserialized: " + declarationDescriptor0);
                    }
                    DeserializedContainerSource deserializedContainerSource0 = deserializedMemberDescriptor0.getContainerSource();
                    JvmPackagePartSource jvmPackagePartSource0 = deserializedContainerSource0 instanceof JvmPackagePartSource ? ((JvmPackagePartSource)deserializedContainerSource0) : null;
                    KotlinJvmBinaryClass kotlinJvmBinaryClass0 = jvmPackagePartSource0 == null ? null : jvmPackagePartSource0.getKnownJvmBinaryClass();
                    if(kotlinJvmBinaryClass0 instanceof ReflectKotlinClass) {
                        reflectKotlinClass0 = (ReflectKotlinClass)kotlinJvmBinaryClass0;
                    }
                    if(reflectKotlinClass0 != null) {
                        Class class0 = reflectKotlinClass0.getKlass();
                        if(class0 != null) {
                            KClass kClass0 = JvmClassMappingKt.getKotlinClass(class0);
                            Intrinsics.checkNotNull(kClass0, "null cannot be cast to non-null type kotlin.reflect.jvm.internal.KClassImpl<*>");
                            kClassImpl0 = declarationDescriptor0.accept(new CreateKCallableVisitor(((KClassImpl)kClass0)), Unit.INSTANCE);
                            Intrinsics.checkNotNullExpressionValue(kClassImpl0, "when (val declaration = … $declaration\")\n        }");
                            kTypeParameterOwnerImpl0 = kClassImpl0;
                            this.c = kTypeParameterOwnerImpl0;
                            return;
                        }
                    }
                    throw new KotlinReflectionInternalError("Container of deserialized member is not resolved: " + deserializedMemberDescriptor0);
                }
            }
        }
        this.c = kTypeParameterOwnerImpl0;
    }

    public static KClassImpl a(ClassDescriptor classDescriptor0) {
        Class class0 = UtilKt.toJavaClass(classDescriptor0);
        KClass kClass0 = class0 == null ? null : JvmClassMappingKt.getKotlinClass(class0);
        if(((KClassImpl)kClass0) == null) {
            throw new KotlinReflectionInternalError("Type parameter container is not resolved: " + classDescriptor0.getContainingDeclaration());
        }
        return (KClassImpl)kClass0;
    }

    // 去混淆评级： 低(30)
    @Override
    public boolean equals(@Nullable Object object0) {
        return object0 instanceof KTypeParameterImpl && Intrinsics.areEqual(this.c, ((KTypeParameterImpl)object0).c) && Intrinsics.areEqual(this.getName(), ((KTypeParameterImpl)object0).getName());
    }

    @Override  // kotlin.reflect.jvm.internal.KClassifierImpl
    public ClassifierDescriptor getDescriptor() {
        return this.getDescriptor();
    }

    @NotNull
    public TypeParameterDescriptor getDescriptor() {
        return this.a;
    }

    @Override  // kotlin.reflect.KTypeParameter
    @NotNull
    public String getName() {
        String s = this.getDescriptor().getName().asString();
        Intrinsics.checkNotNullExpressionValue(s, "descriptor.name.asString()");
        return s;
    }

    @Override  // kotlin.reflect.KTypeParameter
    @NotNull
    public List getUpperBounds() {
        Object object0 = this.b.getValue(this, KTypeParameterImpl.d[0]);
        Intrinsics.checkNotNullExpressionValue(object0, "<get-upperBounds>(...)");
        return (List)object0;
    }

    @Override  // kotlin.reflect.KTypeParameter
    @NotNull
    public KVariance getVariance() {
        switch(WhenMappings.$EnumSwitchMapping$0[this.getDescriptor().getVariance().ordinal()]) {
            case 1: {
                return KVariance.INVARIANT;
            }
            case 2: {
                return KVariance.IN;
            }
            case 3: {
                return KVariance.OUT;
            }
            default: {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    @Override
    public int hashCode() {
        return this.getName().hashCode() + this.c.hashCode() * 0x1F;
    }

    @Override  // kotlin.reflect.KTypeParameter
    public boolean isReified() {
        return this.getDescriptor().isReified();
    }

    @Override
    @NotNull
    public String toString() {
        return TypeParameterReference.Companion.toString(this);
    }
}

