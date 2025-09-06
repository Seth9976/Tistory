package kotlin.reflect.jvm.internal;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorVisitorEmptyBodies;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0010\u0018\u00002\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000F\u0012\u0006\u0010\u0005\u001A\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\u000B\u001A\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\t\u001A\u00020\b2\u0006\u0010\n\u001A\u00020\u0003H\u0016¢\u0006\u0004\b\u000B\u0010\fJ#\u0010\u000E\u001A\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\t\u001A\u00020\r2\u0006\u0010\n\u001A\u00020\u0003H\u0016¢\u0006\u0004\b\u000E\u0010\u000F¨\u0006\u0010"}, d2 = {"Lkotlin/reflect/jvm/internal/CreateKCallableVisitor;", "Lkotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorVisitorEmptyBodies;", "Lkotlin/reflect/jvm/internal/KCallableImpl;", "", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "container", "<init>", "(Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;)V", "Lkotlin/reflect/jvm/internal/impl/descriptors/FunctionDescriptor;", "descriptor", "data", "visitFunctionDescriptor", "(Lorg/jetbrains/kotlin/descriptors/FunctionDescriptor;Lkotlin/Unit;)Lkotlin/reflect/jvm/internal/KCallableImpl;", "Lkotlin/reflect/jvm/internal/impl/descriptors/PropertyDescriptor;", "visitPropertyDescriptor", "(Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;Lkotlin/Unit;)Lkotlin/reflect/jvm/internal/KCallableImpl;", "kotlin-reflection"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nutil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 util.kt\nkotlin/reflect/jvm/internal/CreateKCallableVisitor\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,311:1\n1#2:312\n*E\n"})
public class CreateKCallableVisitor extends DeclarationDescriptorVisitorEmptyBodies {
    public final KDeclarationContainerImpl a;

    public CreateKCallableVisitor(@NotNull KDeclarationContainerImpl kDeclarationContainerImpl0) {
        Intrinsics.checkNotNullParameter(kDeclarationContainerImpl0, "container");
        super();
        this.a = kDeclarationContainerImpl0;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorVisitorEmptyBodies
    public Object visitFunctionDescriptor(FunctionDescriptor functionDescriptor0, Object object0) {
        return this.visitFunctionDescriptor(functionDescriptor0, ((Unit)object0));
    }

    @NotNull
    public KCallableImpl visitFunctionDescriptor(@NotNull FunctionDescriptor functionDescriptor0, @NotNull Unit unit0) {
        Intrinsics.checkNotNullParameter(functionDescriptor0, "descriptor");
        Intrinsics.checkNotNullParameter(unit0, "data");
        return new KFunctionImpl(this.a, functionDescriptor0);
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorVisitorEmptyBodies
    public Object visitPropertyDescriptor(PropertyDescriptor propertyDescriptor0, Object object0) {
        return this.visitPropertyDescriptor(propertyDescriptor0, ((Unit)object0));
    }

    @NotNull
    public KCallableImpl visitPropertyDescriptor(@NotNull PropertyDescriptor propertyDescriptor0, @NotNull Unit unit0) {
        Intrinsics.checkNotNullParameter(propertyDescriptor0, "descriptor");
        Intrinsics.checkNotNullParameter(unit0, "data");
        int v = 0;
        int v1 = propertyDescriptor0.getDispatchReceiverParameter() == null ? 0 : 1;
        if(propertyDescriptor0.getExtensionReceiverParameter() != null) {
            v = 1;
        }
        int v2 = v1 + v;
        boolean z = propertyDescriptor0.isVar();
        KDeclarationContainerImpl kDeclarationContainerImpl0 = this.a;
        if(z) {
            switch(v2) {
                case 0: {
                    return new KMutableProperty0Impl(kDeclarationContainerImpl0, propertyDescriptor0);
                }
                case 1: {
                    return new KMutableProperty1Impl(kDeclarationContainerImpl0, propertyDescriptor0);
                }
                case 2: {
                    return new KMutableProperty2Impl(kDeclarationContainerImpl0, propertyDescriptor0);
                }
            }
        }
        else {
            switch(v2) {
                case 0: {
                    return new KProperty0Impl(kDeclarationContainerImpl0, propertyDescriptor0);
                }
                case 1: {
                    return new KProperty1Impl(kDeclarationContainerImpl0, propertyDescriptor0);
                }
                case 2: {
                    return new KProperty2Impl(kDeclarationContainerImpl0, propertyDescriptor0);
                }
            }
        }
        throw new KotlinReflectionInternalError("Unsupported property: " + propertyDescriptor0);
    }
}

