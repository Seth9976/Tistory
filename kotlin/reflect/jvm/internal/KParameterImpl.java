package kotlin.reflect.jvm.internal;

import fe.l;
import fe.m;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KParameter.Kind;
import kotlin.reflect.KParameter;
import kotlin.reflect.KProperty;
import kotlin.reflect.KType;
import kotlin.reflect.jvm.internal.impl.descriptors.ParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0004\n\u0002\u0010\u000E\n\u0002\b\r\n\u0002\u0010 \n\u0002\u0010\u001B\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B1\u0012\n\u0010\u0003\u001A\u0006\u0012\u0002\b\u00030\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u0012\u0006\u0010\u0007\u001A\u00020\u0006\u0012\f\u0010\n\u001A\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000B\u0010\fJ\u001A\u0010\u0010\u001A\u00020\u000F2\b\u0010\u000E\u001A\u0004\u0018\u00010\rH\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000F\u0010\u0012\u001A\u00020\u0004H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000F\u0010\u0015\u001A\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u001B\u0010\u0003\u001A\u0006\u0012\u0002\b\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001A\u0004\b\u0019\u0010\u001AR\u001A\u0010\u0005\u001A\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001B\u0010\u001C\u001A\u0004\b\u001D\u0010\u0013R\u001A\u0010\u0007\u001A\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001E\u0010\u001F\u001A\u0004\b \u0010!R!\u0010(\u001A\b\u0012\u0004\u0012\u00020#0\"8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b$\u0010%\u001A\u0004\b&\u0010\'R\u0016\u0010*\u001A\u0004\u0018\u00010\u00148VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b)\u0010\u0016R\u0014\u0010.\u001A\u00020+8VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b,\u0010-R\u0014\u0010/\u001A\u00020\u000F8VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b/\u00100R\u0014\u00101\u001A\u00020\u000F8VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b1\u00100¨\u00062"}, d2 = {"Lkotlin/reflect/jvm/internal/KParameterImpl;", "Lkotlin/reflect/KParameter;", "Lkotlin/reflect/jvm/internal/KCallableImpl;", "callable", "", "index", "Lkotlin/reflect/KParameter$Kind;", "kind", "Lkotlin/Function0;", "Lkotlin/reflect/jvm/internal/impl/descriptors/ParameterDescriptor;", "computeDescriptor", "<init>", "(Lkotlin/reflect/jvm/internal/KCallableImpl;ILkotlin/reflect/KParameter$Kind;Lkotlin/jvm/functions/Function0;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "Lkotlin/reflect/jvm/internal/KCallableImpl;", "getCallable", "()Lkotlin/reflect/jvm/internal/KCallableImpl;", "b", "I", "getIndex", "c", "Lkotlin/reflect/KParameter$Kind;", "getKind", "()Lkotlin/reflect/KParameter$Kind;", "", "", "e", "Lkotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal;", "getAnnotations", "()Ljava/util/List;", "annotations", "getName", "name", "Lkotlin/reflect/KType;", "getType", "()Lkotlin/reflect/KType;", "type", "isOptional", "()Z", "isVararg", "kotlin-reflection"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nKParameterImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KParameterImpl.kt\nkotlin/reflect/jvm/internal/KParameterImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,75:1\n1#2:76\n*E\n"})
public final class KParameterImpl implements KParameter {
    public final KCallableImpl a;
    public final int b;
    public final Kind c;
    public final LazySoftVal d;
    public final LazySoftVal e;
    public static final KProperty[] f;

    static {
        KParameterImpl.f = new KProperty[]{Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(KParameterImpl.class), "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/ParameterDescriptor;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(KParameterImpl.class), "annotations", "getAnnotations()Ljava/util/List;"))};
    }

    public KParameterImpl(@NotNull KCallableImpl kCallableImpl0, int v, @NotNull Kind kParameter$Kind0, @NotNull Function0 function00) {
        Intrinsics.checkNotNullParameter(kCallableImpl0, "callable");
        Intrinsics.checkNotNullParameter(kParameter$Kind0, "kind");
        Intrinsics.checkNotNullParameter(function00, "computeDescriptor");
        super();
        this.a = kCallableImpl0;
        this.b = v;
        this.c = kParameter$Kind0;
        this.d = ReflectProperties.lazySoft(function00);
        this.e = ReflectProperties.lazySoft(new l(this));
    }

    public final ParameterDescriptor a() {
        Object object0 = this.d.getValue(this, KParameterImpl.f[0]);
        Intrinsics.checkNotNullExpressionValue(object0, "<get-descriptor>(...)");
        return (ParameterDescriptor)object0;
    }

    public static final ParameterDescriptor access$getDescriptor(KParameterImpl kParameterImpl0) {
        return kParameterImpl0.a();
    }

    // 去混淆评级： 低(20)
    @Override
    public boolean equals(@Nullable Object object0) {
        return object0 instanceof KParameterImpl && Intrinsics.areEqual(this.a, ((KParameterImpl)object0).a) && this.getIndex() == ((KParameterImpl)object0).getIndex();
    }

    @Override  // kotlin.reflect.KAnnotatedElement
    @NotNull
    public List getAnnotations() {
        Object object0 = this.e.getValue(this, KParameterImpl.f[1]);
        Intrinsics.checkNotNullExpressionValue(object0, "<get-annotations>(...)");
        return (List)object0;
    }

    @NotNull
    public final KCallableImpl getCallable() {
        return this.a;
    }

    @Override  // kotlin.reflect.KParameter
    public int getIndex() {
        return this.b;
    }

    @Override  // kotlin.reflect.KParameter
    @NotNull
    public Kind getKind() {
        return this.c;
    }

    @Override  // kotlin.reflect.KParameter
    @Nullable
    public String getName() {
        ParameterDescriptor parameterDescriptor0 = this.a();
        ValueParameterDescriptor valueParameterDescriptor0 = parameterDescriptor0 instanceof ValueParameterDescriptor ? ((ValueParameterDescriptor)parameterDescriptor0) : null;
        if(valueParameterDescriptor0 == null) {
            return null;
        }
        if(valueParameterDescriptor0.getContainingDeclaration().hasSynthesizedParameterNames()) {
            return null;
        }
        Name name0 = valueParameterDescriptor0.getName();
        Intrinsics.checkNotNullExpressionValue(name0, "valueParameter.name");
        return name0.isSpecial() ? null : name0.asString();
    }

    @Override  // kotlin.reflect.KParameter
    @NotNull
    public KType getType() {
        KotlinType kotlinType0 = this.a().getType();
        Intrinsics.checkNotNullExpressionValue(kotlinType0, "descriptor.type");
        return new KTypeImpl(kotlinType0, new m(this));
    }

    @Override
    public int hashCode() {
        return this.getIndex() + this.a.hashCode() * 0x1F;
    }

    @Override  // kotlin.reflect.KParameter
    public boolean isOptional() {
        ParameterDescriptor parameterDescriptor0 = this.a();
        ValueParameterDescriptor valueParameterDescriptor0 = parameterDescriptor0 instanceof ValueParameterDescriptor ? ((ValueParameterDescriptor)parameterDescriptor0) : null;
        return valueParameterDescriptor0 == null ? false : DescriptorUtilsKt.declaresOrInheritsDefaultValue(valueParameterDescriptor0);
    }

    @Override  // kotlin.reflect.KParameter
    public boolean isVararg() {
        ParameterDescriptor parameterDescriptor0 = this.a();
        return parameterDescriptor0 instanceof ValueParameterDescriptor && ((ValueParameterDescriptor)parameterDescriptor0).getVarargElementType() != null;
    }

    @Override
    @NotNull
    public String toString() {
        return ReflectionObjectRenderer.INSTANCE.renderParameter(this);
    }
}

