package kotlin.reflect.jvm.internal.impl.util;

import java.util.List;
import jf.d;
import jf.e;
import jf.f;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ImplicitClassReceiver;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ReceiverValue;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import org.jetbrains.annotations.NotNull;

public final class OperatorChecks extends AbstractModifierChecks {
    @NotNull
    public static final OperatorChecks INSTANCE;
    public static final List a;

    static {
        OperatorChecks.INSTANCE = new OperatorChecks();  // 初始化器: Lkotlin/reflect/jvm/internal/impl/util/AbstractModifierChecks;-><init>()V
        AtLeast valueParameterCountCheck$AtLeast0 = new AtLeast(1);
        Checks checks0 = new Checks(OperatorNameConventions.GET, new Check[]{MemberOrExtension.INSTANCE, valueParameterCountCheck$AtLeast0}, null, 4, null);
        AtLeast valueParameterCountCheck$AtLeast1 = new AtLeast(2);
        Checks checks1 = new Checks(OperatorNameConventions.SET, new Check[]{MemberOrExtension.INSTANCE, valueParameterCountCheck$AtLeast1}, d.w);
        AtLeast valueParameterCountCheck$AtLeast2 = new AtLeast(2);
        Checks checks2 = new Checks(OperatorNameConventions.GET_VALUE, new Check[]{MemberOrExtension.INSTANCE, b.a, valueParameterCountCheck$AtLeast2, a.a}, null, 4, null);
        AtLeast valueParameterCountCheck$AtLeast3 = new AtLeast(3);
        Checks checks3 = new Checks(OperatorNameConventions.SET_VALUE, new Check[]{MemberOrExtension.INSTANCE, b.a, valueParameterCountCheck$AtLeast3, a.a}, null, 4, null);
        Equals valueParameterCountCheck$Equals0 = new Equals(2);
        OperatorChecks.a = CollectionsKt__CollectionsKt.listOf(new Checks[]{checks0, checks1, checks2, checks3, new Checks(OperatorNameConventions.PROVIDE_DELEGATE, new Check[]{MemberOrExtension.INSTANCE, b.a, valueParameterCountCheck$Equals0, a.a}, null, 4, null), new Checks(OperatorNameConventions.INVOKE, new Check[]{MemberOrExtension.INSTANCE}, null, 4, null), new Checks(OperatorNameConventions.CONTAINS, new Check[]{MemberOrExtension.INSTANCE, SingleValueParameter.INSTANCE, b.a, ReturnsBoolean.INSTANCE}, null, 4, null), new Checks(OperatorNameConventions.ITERATOR, new Check[]{MemberOrExtension.INSTANCE, NoValueParameters.INSTANCE}, null, 4, null), new Checks(OperatorNameConventions.NEXT, new Check[]{MemberOrExtension.INSTANCE, NoValueParameters.INSTANCE}, null, 4, null), new Checks(OperatorNameConventions.HAS_NEXT, new Check[]{MemberOrExtension.INSTANCE, NoValueParameters.INSTANCE, ReturnsBoolean.INSTANCE}, null, 4, null), new Checks(OperatorNameConventions.RANGE_TO, new Check[]{MemberOrExtension.INSTANCE, SingleValueParameter.INSTANCE, b.a}, null, 4, null), new Checks(OperatorNameConventions.RANGE_UNTIL, new Check[]{MemberOrExtension.INSTANCE, SingleValueParameter.INSTANCE, b.a}, null, 4, null), new Checks(OperatorNameConventions.EQUALS, new Check[]{Member.INSTANCE}, e.w), new Checks(OperatorNameConventions.COMPARE_TO, new Check[]{MemberOrExtension.INSTANCE, ReturnsInt.INSTANCE, SingleValueParameter.INSTANCE, b.a}, null, 4, null), new Checks(OperatorNameConventions.BINARY_OPERATION_NAMES, new Check[]{MemberOrExtension.INSTANCE, SingleValueParameter.INSTANCE, b.a}, null, 4, null), new Checks(OperatorNameConventions.SIMPLE_UNARY_OPERATION_NAMES, new Check[]{MemberOrExtension.INSTANCE, NoValueParameters.INSTANCE}, null, 4, null), new Checks(CollectionsKt__CollectionsKt.listOf(new Name[]{OperatorNameConventions.INC, OperatorNameConventions.DEC}), new Check[]{MemberOrExtension.INSTANCE}, f.w), new Checks(OperatorNameConventions.ASSIGNMENT_OPERATIONS, new Check[]{MemberOrExtension.INSTANCE, ReturnsUnit.INSTANCE, SingleValueParameter.INSTANCE, b.a}, null, 4, null), new Checks(OperatorNameConventions.COMPONENT_REGEX, new Check[]{MemberOrExtension.INSTANCE, NoValueParameters.INSTANCE}, null, 4, null)});
    }

    public static final boolean access$incDecCheckForExpectClass(OperatorChecks operatorChecks0, FunctionDescriptor functionDescriptor0, ReceiverParameterDescriptor receiverParameterDescriptor0) {
        operatorChecks0.getClass();
        ReceiverValue receiverValue0 = receiverParameterDescriptor0.getValue();
        Intrinsics.checkNotNullExpressionValue(receiverValue0, "receiver.value");
        if(receiverValue0 instanceof ImplicitClassReceiver) {
            ClassDescriptor classDescriptor0 = ((ImplicitClassReceiver)receiverValue0).getClassDescriptor();
            if(classDescriptor0.isExpect()) {
                ClassId classId0 = DescriptorUtilsKt.getClassId(classDescriptor0);
                if(classId0 != null) {
                    ClassifierDescriptor classifierDescriptor0 = FindClassInModuleKt.findClassifierAcrossModuleDependencies(DescriptorUtilsKt.getModule(classDescriptor0), classId0);
                    TypeAliasDescriptor typeAliasDescriptor0 = classifierDescriptor0 instanceof TypeAliasDescriptor ? ((TypeAliasDescriptor)classifierDescriptor0) : null;
                    if(typeAliasDescriptor0 != null) {
                        KotlinType kotlinType0 = functionDescriptor0.getReturnType();
                        return kotlinType0 == null ? false : TypeUtilsKt.isSubtypeOf(kotlinType0, typeAliasDescriptor0.getExpandedType());
                    }
                }
            }
        }
        return false;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.util.AbstractModifierChecks
    @NotNull
    public List getChecks$descriptors() {
        return OperatorChecks.a;
    }
}

