package he;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.name.Name;
import pe.a;

public final class b implements Function1 {
    public final int a;
    public final Object b;

    public b(Object object0, int v) {
        this.a = v;
        this.b = object0;
        super();
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        boolean z = false;
        switch(this.a) {
            case 0: {
                ClassifierDescriptor classifierDescriptor0 = ((KotlinBuiltIns)this.b).getBuiltInsPackageScope().getContributedClassifier(((Name)object0), NoLookupLocation.FROM_BUILTINS);
                if(classifierDescriptor0 == null) {
                    throw new AssertionError("Built-in class " + StandardNames.BUILT_INS_PACKAGE_FQ_NAME.child(((Name)object0)) + " is not found");
                }
                if(!(classifierDescriptor0 instanceof ClassDescriptor)) {
                    throw new AssertionError("Must be a class descriptor " + ((Name)object0) + ", but was " + classifierDescriptor0);
                }
                return (ClassDescriptor)classifierDescriptor0;
            }
            case 1: {
                if(((CallableMemberDescriptor)object0) == null) {
                    throw new IllegalArgumentException("Argument for @NotNull parameter \'descriptor\' of kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils$1$1.invoke must not be null");
                }
                ((a)this.b).a.reportCannotInferVisibility(((CallableMemberDescriptor)object0));
                return Unit.INSTANCE;
            }
            case 2: {
                return ((CallableMemberDescriptor)object0).getContainingDeclaration() == ((DeclarationDescriptor)this.b);
            }
            default: {
                if(!DescriptorVisibilities.isPrivate(((CallableMemberDescriptor)object0).getVisibility()) && DescriptorVisibilities.isVisibleIgnoringReceiver(((CallableMemberDescriptor)object0), ((ClassDescriptor)this.b), false)) {
                    z = true;
                }
                return Boolean.valueOf(z);
            }
        }
    }
}

