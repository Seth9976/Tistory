package ie;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.k;
import kotlin.collections.l;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassDescriptor.FunctionTypeConstructor.WhenMappings;
import kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassDescriptor;
import kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SupertypeLoopChecker.EMPTY;
import kotlin.reflect.jvm.internal.impl.descriptors.SupertypeLoopChecker;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.types.AbstractClassTypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.TypeAttributes;
import kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl;

public final class a extends AbstractClassTypeConstructor {
    public final FunctionClassDescriptor c;

    public a(FunctionClassDescriptor functionClassDescriptor0) {
        this.c = functionClassDescriptor0;
        super(FunctionClassDescriptor.access$getStorageManager$p(functionClassDescriptor0));
    }

    @Override  // kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor
    public final Collection computeSupertypes() {
        List list0;
        FunctionClassDescriptor functionClassDescriptor0 = this.c;
        switch(FunctionClassDescriptor.FunctionTypeConstructor.WhenMappings.$EnumSwitchMapping$0[functionClassDescriptor0.getFunctionKind().ordinal()]) {
            case 1: {
                list0 = k.listOf(FunctionClassDescriptor.access$getFunctionClassId$cp());
                break;
            }
            case 2: {
                Name name0 = FunctionClassKind.Function.numberedClassName(functionClassDescriptor0.getArity());
                list0 = CollectionsKt__CollectionsKt.listOf(new ClassId[]{FunctionClassDescriptor.access$getKFunctionClassId$cp(), new ClassId(StandardNames.BUILT_INS_PACKAGE_FQ_NAME, name0)});
                break;
            }
            case 3: {
                list0 = k.listOf(FunctionClassDescriptor.access$getFunctionClassId$cp());
                break;
            }
            case 4: {
                Name name1 = FunctionClassKind.SuspendFunction.numberedClassName(functionClassDescriptor0.getArity());
                list0 = CollectionsKt__CollectionsKt.listOf(new ClassId[]{FunctionClassDescriptor.access$getKFunctionClassId$cp(), new ClassId(StandardNames.COROUTINES_PACKAGE_FQ_NAME, name1)});
                break;
            }
            default: {
                throw new NoWhenBranchMatchedException();
            }
        }
        ModuleDescriptor moduleDescriptor0 = FunctionClassDescriptor.access$getContainingDeclaration$p(functionClassDescriptor0).getContainingDeclaration();
        ArrayList arrayList0 = new ArrayList(l.collectionSizeOrDefault(list0, 10));
        for(Object object0: list0) {
            ClassId classId0 = (ClassId)object0;
            ClassDescriptor classDescriptor0 = FindClassInModuleKt.findClassAcrossModuleDependencies(moduleDescriptor0, classId0);
            if(classDescriptor0 == null) {
                throw new IllegalStateException(("Built-in class " + classId0 + " not found").toString());
            }
            Iterable iterable0 = CollectionsKt___CollectionsKt.takeLast(FunctionClassDescriptor.access$getParameters$p(functionClassDescriptor0), classDescriptor0.getTypeConstructor().getParameters().size());
            ArrayList arrayList1 = new ArrayList(l.collectionSizeOrDefault(iterable0, 10));
            for(Object object1: iterable0) {
                arrayList1.add(new TypeProjectionImpl(((TypeParameterDescriptor)object1).getDefaultType()));
            }
            arrayList0.add(KotlinTypeFactory.simpleNotNullType(TypeAttributes.Companion.getEmpty(), classDescriptor0, arrayList1));
        }
        return CollectionsKt___CollectionsKt.toList(arrayList0);
    }

    @Override  // kotlin.reflect.jvm.internal.impl.types.AbstractClassTypeConstructor
    public final ClassDescriptor getDeclarationDescriptor() {
        return this.c;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.types.AbstractClassTypeConstructor
    public final ClassifierDescriptor getDeclarationDescriptor() {
        return this.c;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    public final List getParameters() {
        return FunctionClassDescriptor.access$getParameters$p(this.c);
    }

    @Override  // kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor
    public final SupertypeLoopChecker getSupertypeLoopChecker() {
        return EMPTY.INSTANCE;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    public final boolean isDenotable() {
        return true;
    }

    @Override
    public final String toString() {
        return this.c.toString();
    }
}

