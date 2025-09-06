package kotlin.reflect.jvm.internal.impl.renderer;

import a5.b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.k;
import kotlin.collections.l;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.builtins.FunctionTypesKt;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames.FqNames;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters;
import kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithSource;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility;
import kotlin.reflect.jvm.internal.impl.descriptors.FieldDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses.MockClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageViewDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PossiblyInnerType;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyAccessorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyGetterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertySetterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterUtilsKt;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.VariableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotated;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationUseSiteTarget;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.name.SpecialNames;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import kotlin.reflect.jvm.internal.impl.resolve.constants.AnnotationValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ArrayValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.KClassValue.Value.LocalClass;
import kotlin.reflect.jvm.internal.impl.resolve.constants.KClassValue.Value.NormalClass;
import kotlin.reflect.jvm.internal.impl.resolve.constants.KClassValue.Value;
import kotlin.reflect.jvm.internal.impl.resolve.constants.KClassValue;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.AbbreviatedType;
import kotlin.reflect.jvm.internal.impl.types.DefinitelyNotNullType;
import kotlin.reflect.jvm.internal.impl.types.FlexibleType;
import kotlin.reflect.jvm.internal.impl.types.IntersectionTypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeKt;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.SpecialTypesKt;
import kotlin.reflect.jvm.internal.impl.types.StubTypeForBuilderInference;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.TypeUtils;
import kotlin.reflect.jvm.internal.impl.types.UnwrappedType;
import kotlin.reflect.jvm.internal.impl.types.WrappedType;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorType;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import kotlin.reflect.jvm.internal.impl.util.capitalizeDecapitalize.CapitalizeDecapitalizeKt;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.StringsKt___StringsKt;
import kotlin.text.p;
import md.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import w1.a;
import x1.h;
import ye.g;
import ye.i;
import ye.j;

@SourceDebugExtension({"SMAP\nDescriptorRendererImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DescriptorRendererImpl.kt\norg/jetbrains/kotlin/renderer/DescriptorRendererImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1205:1\n2624#2,3:1206\n766#2:1209\n857#2,2:1210\n1549#2:1212\n1620#2,3:1213\n766#2:1216\n857#2,2:1217\n1549#2:1219\n1620#2,3:1220\n1549#2:1223\n1620#2,3:1224\n2624#2,3:1228\n2624#2,3:1231\n766#2:1234\n857#2,2:1235\n1620#2,3:1237\n1#3:1227\n*S KotlinDebug\n*F\n+ 1 DescriptorRendererImpl.kt\norg/jetbrains/kotlin/renderer/DescriptorRendererImpl\n*L\n183#1:1206,3\n483#1:1209\n483#1:1210,2\n484#1:1212\n484#1:1213,3\n486#1:1216\n486#1:1217,2\n486#1:1219\n486#1:1220,3\n488#1:1223\n488#1:1224,3\n587#1:1228,3\n589#1:1231,3\n805#1:1234\n805#1:1235,2\n828#1:1237,3\n*E\n"})
public final class DescriptorRendererImpl extends DescriptorRenderer implements DescriptorRendererOptions {
    public final class WhenMappings {
        public static final int[] $EnumSwitchMapping$0;
        public static final int[] $EnumSwitchMapping$1;

        static {
            int[] arr_v = new int[RenderingFormat.values().length];
            try {
                arr_v[RenderingFormat.PLAIN.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[RenderingFormat.HTML.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            WhenMappings.$EnumSwitchMapping$0 = arr_v;
            int[] arr_v1 = new int[ParameterNameRenderingPolicy.values().length];
            try {
                arr_v1[ParameterNameRenderingPolicy.ALL.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v1[ParameterNameRenderingPolicy.ONLY_NON_SYNTHESIZED.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v1[ParameterNameRenderingPolicy.NONE.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            WhenMappings.$EnumSwitchMapping$1 = arr_v1;
        }
    }

    public final DescriptorRendererOptionsImpl a;
    public final Lazy b;

    public DescriptorRendererImpl(@NotNull DescriptorRendererOptionsImpl descriptorRendererOptionsImpl0) {
        Intrinsics.checkNotNullParameter(descriptorRendererOptionsImpl0, "options");
        super();
        this.a = descriptorRendererOptionsImpl0;
        this.b = c.lazy(new a(this, 6));
    }

    public final void A(VariableDescriptor variableDescriptor0, StringBuilder stringBuilder0, boolean z) {
        if(z || !(variableDescriptor0 instanceof ValueParameterDescriptor)) {
            stringBuilder0.append(this.j((variableDescriptor0.isVar() ? "var" : "val")));
            stringBuilder0.append(" ");
        }
    }

    public final void B(ValueParameterDescriptor valueParameterDescriptor0, boolean z, StringBuilder stringBuilder0, boolean z1) {
        boolean z2;
        if(z1) {
            stringBuilder0.append(this.j("value-parameter"));
            stringBuilder0.append(" ");
        }
        if(this.getVerbose()) {
            stringBuilder0.append("/*");
            stringBuilder0.append(valueParameterDescriptor0.getIndex());
            stringBuilder0.append("*/ ");
        }
        ClassConstructorDescriptor classConstructorDescriptor0 = null;
        this.c(stringBuilder0, valueParameterDescriptor0, null);
        this.n(stringBuilder0, valueParameterDescriptor0.isCrossinline(), "crossinline");
        this.n(stringBuilder0, valueParameterDescriptor0.isNoinline(), "noinline");
        if(this.getRenderPrimaryConstructorParametersAsProperties()) {
            CallableDescriptor callableDescriptor0 = valueParameterDescriptor0.getContainingDeclaration();
            if(callableDescriptor0 instanceof ClassConstructorDescriptor) {
                classConstructorDescriptor0 = (ClassConstructorDescriptor)callableDescriptor0;
            }
            z2 = classConstructorDescriptor0 == null || !classConstructorDescriptor0.isPrimary() ? false : true;
        }
        else {
            z2 = false;
        }
        if(z2) {
            this.n(stringBuilder0, this.getActualPropertiesInPrimaryConstructor(), "actual");
        }
        KotlinType kotlinType0 = valueParameterDescriptor0.getType();
        Intrinsics.checkNotNullExpressionValue(kotlinType0, "variable.type");
        KotlinType kotlinType1 = valueParameterDescriptor0.getVarargElementType();
        this.n(stringBuilder0, kotlinType1 != null, "vararg");
        if(z2 || z1 && !this.getStartFromName()) {
            this.A(valueParameterDescriptor0, stringBuilder0, z2);
        }
        if(z) {
            this.o(valueParameterDescriptor0, stringBuilder0, z1);
            stringBuilder0.append(": ");
        }
        stringBuilder0.append(this.renderType((kotlinType1 == null ? kotlinType0 : kotlinType1)));
        if(this.getIncludePropertyConstant()) {
            ConstantValue constantValue0 = valueParameterDescriptor0.getCompileTimeInitializer();
            if(constantValue0 != null) {
                stringBuilder0.append(" = ");
                stringBuilder0.append(this.a(this.e(constantValue0)));
            }
        }
        if(this.getVerbose() && kotlinType1 != null) {
            stringBuilder0.append(" /*");
            stringBuilder0.append(this.renderType(kotlinType0));
            stringBuilder0.append("*/");
        }
        if(this.getDefaultParameterValueRenderer() != null && (this.getDebugMode() ? valueParameterDescriptor0.declaresDefaultValue() : DescriptorUtilsKt.declaresOrInheritsDefaultValue(valueParameterDescriptor0))) {
            Function1 function10 = this.getDefaultParameterValueRenderer();
            Intrinsics.checkNotNull(function10);
            stringBuilder0.append(" = " + ((String)function10.invoke(valueParameterDescriptor0)));
        }
    }

    public final void C(Collection collection0, boolean z, StringBuilder stringBuilder0) {
        boolean z1 = true;
        switch(WhenMappings.$EnumSwitchMapping$1[this.getParameterNameRenderingPolicy().ordinal()]) {
            case 1: {
                break;
            }
            case 2: {
                if(z) {
                    z1 = false;
                }
                break;
            }
            case 3: {
                z1 = false;
                break;
            }
            default: {
                throw new NoWhenBranchMatchedException();
            }
        }
        int v = collection0.size();
        this.getValueParametersHandler().appendBeforeValueParameters(v, stringBuilder0);
        int v1 = 0;
        for(Object object0: collection0) {
            this.getValueParametersHandler().appendBeforeValueParameter(((ValueParameterDescriptor)object0), v1, v, stringBuilder0);
            this.B(((ValueParameterDescriptor)object0), z1, stringBuilder0, false);
            this.getValueParametersHandler().appendAfterValueParameter(((ValueParameterDescriptor)object0), v1, v, stringBuilder0);
            ++v1;
        }
        this.getValueParametersHandler().appendAfterValueParameters(v, stringBuilder0);
    }

    public final boolean D(DescriptorVisibility descriptorVisibility0, StringBuilder stringBuilder0) {
        if(!this.getModifiers().contains(DescriptorRendererModifier.VISIBILITY)) {
            return false;
        }
        if(this.getNormalizedVisibilities()) {
            descriptorVisibility0 = descriptorVisibility0.normalize();
        }
        if(!this.getRenderDefaultVisibility() && Intrinsics.areEqual(descriptorVisibility0, DescriptorVisibilities.DEFAULT_VISIBILITY)) {
            return false;
        }
        stringBuilder0.append(this.j(descriptorVisibility0.getInternalDisplayName()));
        stringBuilder0.append(" ");
        return true;
    }

    public final void E(List list0, StringBuilder stringBuilder0) {
        if(this.getWithoutTypeParameters()) {
            return;
        }
        ArrayList arrayList0 = new ArrayList(0);
        for(Object object0: list0) {
            TypeParameterDescriptor typeParameterDescriptor0 = (TypeParameterDescriptor)object0;
            List list1 = typeParameterDescriptor0.getUpperBounds();
            Intrinsics.checkNotNullExpressionValue(list1, "typeParameter.upperBounds");
            for(Object object1: CollectionsKt___CollectionsKt.drop(list1, 1)) {
                Name name0 = typeParameterDescriptor0.getName();
                Intrinsics.checkNotNullExpressionValue(name0, "typeParameter.name");
                Intrinsics.checkNotNullExpressionValue(((KotlinType)object1), "it");
                arrayList0.add(this.renderName(name0, false) + " : " + this.renderType(((KotlinType)object1)));
            }
        }
        if(!arrayList0.isEmpty()) {
            stringBuilder0.append(" ");
            stringBuilder0.append(this.j("where"));
            stringBuilder0.append(" ");
            CollectionsKt___CollectionsKt.joinTo$default(arrayList0, stringBuilder0, ", ", null, null, 0, null, null, 0x7C, null);
        }
    }

    public static boolean F(KotlinType kotlinType0) {
        if(FunctionTypesKt.isBuiltinFunctionalType(kotlinType0)) {
            Iterable iterable0 = kotlinType0.getArguments();
            if(!(iterable0 instanceof Collection) || !((Collection)iterable0).isEmpty()) {
                for(Object object0: iterable0) {
                    if(((TypeProjection)object0).isStarProjection()) {
                        return false;
                    }
                    if(false) {
                        break;
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final String a(String s) {
        return this.getTextFormat().escape(s);
    }

    public static final void access$renderAccessorModifiers(DescriptorRendererImpl descriptorRendererImpl0, PropertyAccessorDescriptor propertyAccessorDescriptor0, StringBuilder stringBuilder0) {
        descriptorRendererImpl0.l(propertyAccessorDescriptor0, stringBuilder0);
    }

    public static final void access$renderClass(DescriptorRendererImpl descriptorRendererImpl0, ClassDescriptor classDescriptor0, StringBuilder stringBuilder0) {
        descriptorRendererImpl0.getClass();
        boolean z = classDescriptor0.getKind() == ClassKind.ENUM_ENTRY;
        if(!descriptorRendererImpl0.getStartFromName()) {
            descriptorRendererImpl0.c(stringBuilder0, classDescriptor0, null);
            List list0 = classDescriptor0.getContextReceivers();
            Intrinsics.checkNotNullExpressionValue(list0, "klass.contextReceivers");
            descriptorRendererImpl0.f(list0, stringBuilder0);
            if(!z) {
                DescriptorVisibility descriptorVisibility0 = classDescriptor0.getVisibility();
                Intrinsics.checkNotNullExpressionValue(descriptorVisibility0, "klass.visibility");
                descriptorRendererImpl0.D(descriptorVisibility0, stringBuilder0);
            }
            if((classDescriptor0.getKind() != ClassKind.INTERFACE || classDescriptor0.getModality() != Modality.ABSTRACT) && (!classDescriptor0.getKind().isSingleton() || classDescriptor0.getModality() != Modality.FINAL)) {
                Modality modality0 = classDescriptor0.getModality();
                Intrinsics.checkNotNullExpressionValue(modality0, "klass.modality");
                Modality modality1 = DescriptorRendererImpl.b(classDescriptor0);
                if(descriptorRendererImpl0.getRenderDefaultModality() || modality0 != modality1) {
                    descriptorRendererImpl0.n(stringBuilder0, descriptorRendererImpl0.getModifiers().contains(DescriptorRendererModifier.MODALITY), CapitalizeDecapitalizeKt.toLowerCaseAsciiOnly(modality0.name()));
                }
            }
            descriptorRendererImpl0.l(classDescriptor0, stringBuilder0);
            descriptorRendererImpl0.n(stringBuilder0, descriptorRendererImpl0.getModifiers().contains(DescriptorRendererModifier.INNER) && classDescriptor0.isInner(), "inner");
            descriptorRendererImpl0.n(stringBuilder0, descriptorRendererImpl0.getModifiers().contains(DescriptorRendererModifier.DATA) && classDescriptor0.isData(), "data");
            descriptorRendererImpl0.n(stringBuilder0, descriptorRendererImpl0.getModifiers().contains(DescriptorRendererModifier.INLINE) && classDescriptor0.isInline(), "inline");
            descriptorRendererImpl0.n(stringBuilder0, descriptorRendererImpl0.getModifiers().contains(DescriptorRendererModifier.VALUE) && classDescriptor0.isValue(), "value");
            descriptorRendererImpl0.n(stringBuilder0, descriptorRendererImpl0.getModifiers().contains(DescriptorRendererModifier.FUN) && classDescriptor0.isFun(), "fun");
            stringBuilder0.append(descriptorRendererImpl0.j(DescriptorRenderer.Companion.getClassifierKindPrefix(classDescriptor0)));
        }
        if(DescriptorUtils.isCompanionObject(classDescriptor0)) {
            if(descriptorRendererImpl0.getRenderCompanionObjectName()) {
                if(descriptorRendererImpl0.getStartFromName()) {
                    stringBuilder0.append("companion object");
                }
                DescriptorRendererImpl.w(stringBuilder0);
                DeclarationDescriptor declarationDescriptor0 = classDescriptor0.getContainingDeclaration();
                if(declarationDescriptor0 != null) {
                    stringBuilder0.append("of ");
                    Name name0 = declarationDescriptor0.getName();
                    Intrinsics.checkNotNullExpressionValue(name0, "containingDeclaration.name");
                    stringBuilder0.append(descriptorRendererImpl0.renderName(name0, false));
                }
            }
            if(descriptorRendererImpl0.getVerbose() || !Intrinsics.areEqual(classDescriptor0.getName(), SpecialNames.DEFAULT_NAME_FOR_COMPANION_OBJECT)) {
                if(!descriptorRendererImpl0.getStartFromName()) {
                    DescriptorRendererImpl.w(stringBuilder0);
                }
                Name name1 = classDescriptor0.getName();
                Intrinsics.checkNotNullExpressionValue(name1, "descriptor.name");
                stringBuilder0.append(descriptorRendererImpl0.renderName(name1, true));
            }
        }
        else {
            if(!descriptorRendererImpl0.getStartFromName()) {
                DescriptorRendererImpl.w(stringBuilder0);
            }
            descriptorRendererImpl0.o(classDescriptor0, stringBuilder0, true);
        }
        if(!z) {
            List list1 = classDescriptor0.getDeclaredTypeParameters();
            Intrinsics.checkNotNullExpressionValue(list1, "klass.declaredTypeParameters");
            descriptorRendererImpl0.z(list1, stringBuilder0, false);
            descriptorRendererImpl0.d(classDescriptor0, stringBuilder0);
            if(!classDescriptor0.getKind().isSingleton() && descriptorRendererImpl0.getClassWithPrimaryConstructor()) {
                ClassConstructorDescriptor classConstructorDescriptor0 = classDescriptor0.getUnsubstitutedPrimaryConstructor();
                if(classConstructorDescriptor0 != null) {
                    stringBuilder0.append(" ");
                    descriptorRendererImpl0.c(stringBuilder0, classConstructorDescriptor0, null);
                    DescriptorVisibility descriptorVisibility1 = classConstructorDescriptor0.getVisibility();
                    Intrinsics.checkNotNullExpressionValue(descriptorVisibility1, "primaryConstructor.visibility");
                    descriptorRendererImpl0.D(descriptorVisibility1, stringBuilder0);
                    stringBuilder0.append(descriptorRendererImpl0.j("constructor"));
                    List list2 = classConstructorDescriptor0.getValueParameters();
                    Intrinsics.checkNotNullExpressionValue(list2, "primaryConstructor.valueParameters");
                    descriptorRendererImpl0.C(list2, classConstructorDescriptor0.hasSynthesizedParameterNames(), stringBuilder0);
                }
            }
            if(!descriptorRendererImpl0.getWithoutSuperTypes() && !KotlinBuiltIns.isNothing(classDescriptor0.getDefaultType())) {
                Collection collection0 = classDescriptor0.getTypeConstructor().getSupertypes();
                Intrinsics.checkNotNullExpressionValue(collection0, "klass.typeConstructor.supertypes");
                if(!collection0.isEmpty()) {
                    if(collection0.size() == 1) {
                        Object object0 = collection0.iterator().next();
                        if(!KotlinBuiltIns.isAnyOrNullableAny(((KotlinType)object0))) {
                            goto label_69;
                        }
                    }
                    else {
                    label_69:
                        DescriptorRendererImpl.w(stringBuilder0);
                        stringBuilder0.append(": ");
                        CollectionsKt___CollectionsKt.joinTo$default(collection0, stringBuilder0, ", ", null, null, 0, null, new g(descriptorRendererImpl0, 2), 60, null);
                    }
                }
            }
            descriptorRendererImpl0.E(list1, stringBuilder0);
        }
    }

    public static final void access$renderConstructor(DescriptorRendererImpl descriptorRendererImpl0, ConstructorDescriptor constructorDescriptor0, StringBuilder stringBuilder0) {
        boolean z;
        descriptorRendererImpl0.getClass();
        descriptorRendererImpl0.c(stringBuilder0, constructorDescriptor0, null);
        if(!descriptorRendererImpl0.a.getRenderDefaultVisibility() && constructorDescriptor0.getConstructedClass().getModality() == Modality.SEALED) {
            z = false;
        }
        else {
            DescriptorVisibility descriptorVisibility0 = constructorDescriptor0.getVisibility();
            Intrinsics.checkNotNullExpressionValue(descriptorVisibility0, "constructor.visibility");
            z = descriptorRendererImpl0.D(descriptorVisibility0, stringBuilder0);
        }
        descriptorRendererImpl0.k(stringBuilder0, constructorDescriptor0);
        boolean z1 = descriptorRendererImpl0.getRenderConstructorKeyword() || !constructorDescriptor0.isPrimary() || z;
        if(z1) {
            stringBuilder0.append(descriptorRendererImpl0.j("constructor"));
        }
        ClassifierDescriptorWithTypeParameters classifierDescriptorWithTypeParameters0 = constructorDescriptor0.getContainingDeclaration();
        Intrinsics.checkNotNullExpressionValue(classifierDescriptorWithTypeParameters0, "constructor.containingDeclaration");
        if(descriptorRendererImpl0.getSecondaryConstructorsAsPrimary()) {
            if(z1) {
                stringBuilder0.append(" ");
            }
            descriptorRendererImpl0.o(classifierDescriptorWithTypeParameters0, stringBuilder0, true);
            List list0 = constructorDescriptor0.getTypeParameters();
            Intrinsics.checkNotNullExpressionValue(list0, "constructor.typeParameters");
            descriptorRendererImpl0.z(list0, stringBuilder0, false);
        }
        List list1 = constructorDescriptor0.getValueParameters();
        Intrinsics.checkNotNullExpressionValue(list1, "constructor.valueParameters");
        descriptorRendererImpl0.C(list1, constructorDescriptor0.hasSynthesizedParameterNames(), stringBuilder0);
        if(descriptorRendererImpl0.getRenderConstructorDelegation() && !constructorDescriptor0.isPrimary() && classifierDescriptorWithTypeParameters0 instanceof ClassDescriptor) {
            ClassConstructorDescriptor classConstructorDescriptor0 = ((ClassDescriptor)classifierDescriptorWithTypeParameters0).getUnsubstitutedPrimaryConstructor();
            if(classConstructorDescriptor0 != null) {
                List list2 = classConstructorDescriptor0.getValueParameters();
                Intrinsics.checkNotNullExpressionValue(list2, "primaryConstructor.valueParameters");
                ArrayList arrayList0 = new ArrayList();
                for(Object object0: list2) {
                    if(!((ValueParameterDescriptor)object0).declaresDefaultValue() && ((ValueParameterDescriptor)object0).getVarargElementType() == null) {
                        arrayList0.add(object0);
                    }
                }
                if(!arrayList0.isEmpty()) {
                    stringBuilder0.append(" : ");
                    stringBuilder0.append(descriptorRendererImpl0.j("this"));
                    stringBuilder0.append(CollectionsKt___CollectionsKt.joinToString$default(arrayList0, ", ", "(", ")", 0, null, i.w, 24, null));
                }
            }
        }
        if(descriptorRendererImpl0.getSecondaryConstructorsAsPrimary()) {
            List list3 = constructorDescriptor0.getTypeParameters();
            Intrinsics.checkNotNullExpressionValue(list3, "constructor.typeParameters");
            descriptorRendererImpl0.E(list3, stringBuilder0);
        }
    }

    public static final void access$renderFunction(DescriptorRendererImpl descriptorRendererImpl0, FunctionDescriptor functionDescriptor0, StringBuilder stringBuilder0) {
        boolean z1;
        if(!descriptorRendererImpl0.getStartFromName()) {
            if(!descriptorRendererImpl0.getStartFromDeclarationKeyword()) {
                descriptorRendererImpl0.c(stringBuilder0, functionDescriptor0, null);
                List list0 = functionDescriptor0.getContextReceiverParameters();
                Intrinsics.checkNotNullExpressionValue(list0, "function.contextReceiverParameters");
                descriptorRendererImpl0.f(list0, stringBuilder0);
                DescriptorVisibility descriptorVisibility0 = functionDescriptor0.getVisibility();
                Intrinsics.checkNotNullExpressionValue(descriptorVisibility0, "function.visibility");
                descriptorRendererImpl0.D(descriptorVisibility0, stringBuilder0);
                descriptorRendererImpl0.m(stringBuilder0, functionDescriptor0);
                if(descriptorRendererImpl0.getIncludeAdditionalModifiers()) {
                    descriptorRendererImpl0.l(functionDescriptor0, stringBuilder0);
                }
                boolean z = false;
                descriptorRendererImpl0.r(stringBuilder0, functionDescriptor0);
                if(descriptorRendererImpl0.getIncludeAdditionalModifiers()) {
                    if(functionDescriptor0.isOperator()) {
                        z1 = true;
                        Collection collection0 = functionDescriptor0.getOverriddenDescriptors();
                        Intrinsics.checkNotNullExpressionValue(collection0, "functionDescriptor.overriddenDescriptors");
                        if(!collection0.isEmpty()) {
                            for(Object object0: collection0) {
                                if(((FunctionDescriptor)object0).isOperator()) {
                                    if(descriptorRendererImpl0.getAlwaysRenderModifiers()) {
                                        break;
                                    }
                                    z1 = false;
                                    break;
                                }
                            }
                        }
                    }
                    else {
                        z1 = false;
                    }
                    if(functionDescriptor0.isInfix()) {
                        Collection collection1 = functionDescriptor0.getOverriddenDescriptors();
                        Intrinsics.checkNotNullExpressionValue(collection1, "functionDescriptor.overriddenDescriptors");
                        if(!collection1.isEmpty()) {
                            for(Object object1: collection1) {
                                if(!((FunctionDescriptor)object1).isInfix()) {
                                    continue;
                                }
                                if(descriptorRendererImpl0.getAlwaysRenderModifiers()) {
                                    z = true;
                                }
                                goto label_42;
                            }
                        }
                        z = true;
                    }
                label_42:
                    descriptorRendererImpl0.n(stringBuilder0, functionDescriptor0.isTailrec(), "tailrec");
                    descriptorRendererImpl0.n(stringBuilder0, functionDescriptor0.isSuspend(), "suspend");
                    descriptorRendererImpl0.n(stringBuilder0, functionDescriptor0.isInline(), "inline");
                    descriptorRendererImpl0.n(stringBuilder0, z, "infix");
                    descriptorRendererImpl0.n(stringBuilder0, z1, "operator");
                }
                else {
                    descriptorRendererImpl0.n(stringBuilder0, functionDescriptor0.isSuspend(), "suspend");
                }
                descriptorRendererImpl0.k(stringBuilder0, functionDescriptor0);
                if(descriptorRendererImpl0.getVerbose()) {
                    if(functionDescriptor0.isHiddenToOvercomeSignatureClash()) {
                        stringBuilder0.append("/*isHiddenToOvercomeSignatureClash*/ ");
                    }
                    if(functionDescriptor0.isHiddenForResolutionEverywhereBesideSupercalls()) {
                        stringBuilder0.append("/*isHiddenForResolutionEverywhereBesideSupercalls*/ ");
                    }
                }
            }
            stringBuilder0.append(descriptorRendererImpl0.j("fun"));
            stringBuilder0.append(" ");
            List list1 = functionDescriptor0.getTypeParameters();
            Intrinsics.checkNotNullExpressionValue(list1, "function.typeParameters");
            descriptorRendererImpl0.z(list1, stringBuilder0, true);
            descriptorRendererImpl0.u(stringBuilder0, functionDescriptor0);
        }
        descriptorRendererImpl0.o(functionDescriptor0, stringBuilder0, true);
        List list2 = functionDescriptor0.getValueParameters();
        Intrinsics.checkNotNullExpressionValue(list2, "function.valueParameters");
        descriptorRendererImpl0.C(list2, functionDescriptor0.hasSynthesizedParameterNames(), stringBuilder0);
        descriptorRendererImpl0.v(stringBuilder0, functionDescriptor0);
        KotlinType kotlinType0 = functionDescriptor0.getReturnType();
        if(!descriptorRendererImpl0.getWithoutReturnType() && (descriptorRendererImpl0.getUnitReturnType() || kotlinType0 == null || !KotlinBuiltIns.isUnit(kotlinType0))) {
            stringBuilder0.append(": ");
            stringBuilder0.append((kotlinType0 == null ? "[NULL]" : descriptorRendererImpl0.renderType(kotlinType0)));
        }
        List list3 = functionDescriptor0.getTypeParameters();
        Intrinsics.checkNotNullExpressionValue(list3, "function.typeParameters");
        descriptorRendererImpl0.E(list3, stringBuilder0);
    }

    public static final void access$renderName(DescriptorRendererImpl descriptorRendererImpl0, DeclarationDescriptor declarationDescriptor0, StringBuilder stringBuilder0, boolean z) {
        descriptorRendererImpl0.o(declarationDescriptor0, stringBuilder0, z);
    }

    public static final void access$renderPackageFragment(DescriptorRendererImpl descriptorRendererImpl0, PackageFragmentDescriptor packageFragmentDescriptor0, StringBuilder stringBuilder0) {
        descriptorRendererImpl0.getClass();
        descriptorRendererImpl0.s(packageFragmentDescriptor0.getFqName(), "package-fragment", stringBuilder0);
        if(descriptorRendererImpl0.getDebugMode()) {
            stringBuilder0.append(" in ");
            descriptorRendererImpl0.o(packageFragmentDescriptor0.getContainingDeclaration(), stringBuilder0, false);
        }
    }

    public static final void access$renderPackageView(DescriptorRendererImpl descriptorRendererImpl0, PackageViewDescriptor packageViewDescriptor0, StringBuilder stringBuilder0) {
        descriptorRendererImpl0.getClass();
        descriptorRendererImpl0.s(packageViewDescriptor0.getFqName(), "package", stringBuilder0);
        if(descriptorRendererImpl0.getDebugMode()) {
            stringBuilder0.append(" in context of ");
            descriptorRendererImpl0.o(packageViewDescriptor0.getModule(), stringBuilder0, false);
        }
    }

    public static final void access$renderProperty(DescriptorRendererImpl descriptorRendererImpl0, PropertyDescriptor propertyDescriptor0, StringBuilder stringBuilder0) {
        if(!descriptorRendererImpl0.getStartFromName()) {
            if(!descriptorRendererImpl0.getStartFromDeclarationKeyword()) {
                if(descriptorRendererImpl0.getModifiers().contains(DescriptorRendererModifier.ANNOTATIONS)) {
                    descriptorRendererImpl0.c(stringBuilder0, propertyDescriptor0, null);
                    FieldDescriptor fieldDescriptor0 = propertyDescriptor0.getBackingField();
                    if(fieldDescriptor0 != null) {
                        descriptorRendererImpl0.c(stringBuilder0, fieldDescriptor0, AnnotationUseSiteTarget.FIELD);
                    }
                    FieldDescriptor fieldDescriptor1 = propertyDescriptor0.getDelegateField();
                    if(fieldDescriptor1 != null) {
                        descriptorRendererImpl0.c(stringBuilder0, fieldDescriptor1, AnnotationUseSiteTarget.PROPERTY_DELEGATE_FIELD);
                    }
                    if(descriptorRendererImpl0.getPropertyAccessorRenderingPolicy() == PropertyAccessorRenderingPolicy.NONE) {
                        PropertyGetterDescriptor propertyGetterDescriptor0 = propertyDescriptor0.getGetter();
                        if(propertyGetterDescriptor0 != null) {
                            descriptorRendererImpl0.c(stringBuilder0, propertyGetterDescriptor0, AnnotationUseSiteTarget.PROPERTY_GETTER);
                        }
                        PropertySetterDescriptor propertySetterDescriptor0 = propertyDescriptor0.getSetter();
                        if(propertySetterDescriptor0 != null) {
                            descriptorRendererImpl0.c(stringBuilder0, propertySetterDescriptor0, AnnotationUseSiteTarget.PROPERTY_SETTER);
                            List list0 = propertySetterDescriptor0.getValueParameters();
                            Intrinsics.checkNotNullExpressionValue(list0, "setter.valueParameters");
                            ValueParameterDescriptor valueParameterDescriptor0 = (ValueParameterDescriptor)CollectionsKt___CollectionsKt.single(list0);
                            Intrinsics.checkNotNullExpressionValue(valueParameterDescriptor0, "it");
                            descriptorRendererImpl0.c(stringBuilder0, valueParameterDescriptor0, AnnotationUseSiteTarget.SETTER_PARAMETER);
                        }
                    }
                }
                List list1 = propertyDescriptor0.getContextReceiverParameters();
                Intrinsics.checkNotNullExpressionValue(list1, "property.contextReceiverParameters");
                descriptorRendererImpl0.f(list1, stringBuilder0);
                DescriptorVisibility descriptorVisibility0 = propertyDescriptor0.getVisibility();
                Intrinsics.checkNotNullExpressionValue(descriptorVisibility0, "property.visibility");
                descriptorRendererImpl0.D(descriptorVisibility0, stringBuilder0);
                descriptorRendererImpl0.n(stringBuilder0, descriptorRendererImpl0.getModifiers().contains(DescriptorRendererModifier.CONST) && propertyDescriptor0.isConst(), "const");
                descriptorRendererImpl0.l(propertyDescriptor0, stringBuilder0);
                descriptorRendererImpl0.m(stringBuilder0, propertyDescriptor0);
                descriptorRendererImpl0.r(stringBuilder0, propertyDescriptor0);
                descriptorRendererImpl0.n(stringBuilder0, descriptorRendererImpl0.getModifiers().contains(DescriptorRendererModifier.LATEINIT) && propertyDescriptor0.isLateInit(), "lateinit");
                descriptorRendererImpl0.k(stringBuilder0, propertyDescriptor0);
            }
            descriptorRendererImpl0.A(propertyDescriptor0, stringBuilder0, false);
            List list2 = propertyDescriptor0.getTypeParameters();
            Intrinsics.checkNotNullExpressionValue(list2, "property.typeParameters");
            descriptorRendererImpl0.z(list2, stringBuilder0, true);
            descriptorRendererImpl0.u(stringBuilder0, propertyDescriptor0);
        }
        descriptorRendererImpl0.o(propertyDescriptor0, stringBuilder0, true);
        stringBuilder0.append(": ");
        KotlinType kotlinType0 = propertyDescriptor0.getType();
        Intrinsics.checkNotNullExpressionValue(kotlinType0, "property.type");
        stringBuilder0.append(descriptorRendererImpl0.renderType(kotlinType0));
        descriptorRendererImpl0.v(stringBuilder0, propertyDescriptor0);
        if(descriptorRendererImpl0.getIncludePropertyConstant()) {
            ConstantValue constantValue0 = propertyDescriptor0.getCompileTimeInitializer();
            if(constantValue0 != null) {
                stringBuilder0.append(" = ");
                stringBuilder0.append(descriptorRendererImpl0.a(descriptorRendererImpl0.e(constantValue0)));
            }
        }
        List list3 = propertyDescriptor0.getTypeParameters();
        Intrinsics.checkNotNullExpressionValue(list3, "property.typeParameters");
        descriptorRendererImpl0.E(list3, stringBuilder0);
    }

    public static final void access$renderTypeAlias(DescriptorRendererImpl descriptorRendererImpl0, TypeAliasDescriptor typeAliasDescriptor0, StringBuilder stringBuilder0) {
        descriptorRendererImpl0.getClass();
        descriptorRendererImpl0.c(stringBuilder0, typeAliasDescriptor0, null);
        DescriptorVisibility descriptorVisibility0 = typeAliasDescriptor0.getVisibility();
        Intrinsics.checkNotNullExpressionValue(descriptorVisibility0, "typeAlias.visibility");
        descriptorRendererImpl0.D(descriptorVisibility0, stringBuilder0);
        descriptorRendererImpl0.l(typeAliasDescriptor0, stringBuilder0);
        stringBuilder0.append(descriptorRendererImpl0.j("typealias"));
        stringBuilder0.append(" ");
        descriptorRendererImpl0.o(typeAliasDescriptor0, stringBuilder0, true);
        List list0 = typeAliasDescriptor0.getDeclaredTypeParameters();
        Intrinsics.checkNotNullExpressionValue(list0, "typeAlias.declaredTypeParameters");
        descriptorRendererImpl0.z(list0, stringBuilder0, false);
        descriptorRendererImpl0.d(typeAliasDescriptor0, stringBuilder0);
        stringBuilder0.append(" = ");
        stringBuilder0.append(descriptorRendererImpl0.renderType(typeAliasDescriptor0.getUnderlyingType()));
    }

    public static final void access$renderTypeParameter(DescriptorRendererImpl descriptorRendererImpl0, TypeParameterDescriptor typeParameterDescriptor0, StringBuilder stringBuilder0, boolean z) {
        descriptorRendererImpl0.x(typeParameterDescriptor0, stringBuilder0, z);
    }

    public static final void access$renderValueParameter(DescriptorRendererImpl descriptorRendererImpl0, ValueParameterDescriptor valueParameterDescriptor0, boolean z, StringBuilder stringBuilder0, boolean z1) {
        descriptorRendererImpl0.B(valueParameterDescriptor0, z, stringBuilder0, z1);
    }

    public static Modality b(MemberDescriptor memberDescriptor0) {
        if(memberDescriptor0 instanceof ClassDescriptor) {
            return ((ClassDescriptor)memberDescriptor0).getKind() == ClassKind.INTERFACE ? Modality.ABSTRACT : Modality.FINAL;
        }
        DeclarationDescriptor declarationDescriptor0 = memberDescriptor0.getContainingDeclaration();
        ClassDescriptor classDescriptor0 = declarationDescriptor0 instanceof ClassDescriptor ? ((ClassDescriptor)declarationDescriptor0) : null;
        if(classDescriptor0 == null) {
            return Modality.FINAL;
        }
        if(!(memberDescriptor0 instanceof CallableMemberDescriptor)) {
            return Modality.FINAL;
        }
        Collection collection0 = ((CallableMemberDescriptor)memberDescriptor0).getOverriddenDescriptors();
        Intrinsics.checkNotNullExpressionValue(collection0, "this.overriddenDescriptors");
        if(!collection0.isEmpty() && classDescriptor0.getModality() != Modality.FINAL) {
            return Modality.OPEN;
        }
        if(classDescriptor0.getKind() == ClassKind.INTERFACE && !Intrinsics.areEqual(((CallableMemberDescriptor)memberDescriptor0).getVisibility(), DescriptorVisibilities.PRIVATE)) {
            return ((CallableMemberDescriptor)memberDescriptor0).getModality() == Modality.ABSTRACT ? Modality.ABSTRACT : Modality.OPEN;
        }
        return Modality.FINAL;
    }

    public final void c(StringBuilder stringBuilder0, Annotated annotated0, AnnotationUseSiteTarget annotationUseSiteTarget0) {
        if(!this.getModifiers().contains(DescriptorRendererModifier.ANNOTATIONS)) {
            return;
        }
        Set set0 = annotated0 instanceof KotlinType ? this.getExcludedTypeAnnotationClasses() : this.getExcludedAnnotationClasses();
        Function1 function10 = this.getAnnotationFilter();
        for(Object object0: annotated0.getAnnotations()) {
            AnnotationDescriptor annotationDescriptor0 = (AnnotationDescriptor)object0;
            if(!CollectionsKt___CollectionsKt.contains(set0, annotationDescriptor0.getFqName()) && !Intrinsics.areEqual(annotationDescriptor0.getFqName(), FqNames.parameterName) && (function10 == null || ((Boolean)function10.invoke(annotationDescriptor0)).booleanValue())) {
                stringBuilder0.append(this.renderAnnotation(annotationDescriptor0, annotationUseSiteTarget0));
                if(this.getEachAnnotationOnNewLine()) {
                    stringBuilder0.append('\n');
                    Intrinsics.checkNotNullExpressionValue(stringBuilder0, "append(\'\\n\')");
                }
                else {
                    stringBuilder0.append(" ");
                }
            }
        }
    }

    public final void d(ClassifierDescriptorWithTypeParameters classifierDescriptorWithTypeParameters0, StringBuilder stringBuilder0) {
        List list0 = classifierDescriptorWithTypeParameters0.getDeclaredTypeParameters();
        Intrinsics.checkNotNullExpressionValue(list0, "classifier.declaredTypeParameters");
        List list1 = classifierDescriptorWithTypeParameters0.getTypeConstructor().getParameters();
        Intrinsics.checkNotNullExpressionValue(list1, "classifier.typeConstructor.parameters");
        if(this.getVerbose() && classifierDescriptorWithTypeParameters0.isInner() && list1.size() > list0.size()) {
            stringBuilder0.append(" /*captured type parameters: ");
            this.y(list1.subList(list0.size(), list1.size()), stringBuilder0);
            stringBuilder0.append("*/");
        }
    }

    public final String e(ConstantValue constantValue0) {
        if(constantValue0 instanceof ArrayValue) {
            return CollectionsKt___CollectionsKt.joinToString$default(((Iterable)((ArrayValue)constantValue0).getValue()), ", ", "{", "}", 0, null, new g(this, 1), 24, null);
        }
        if(constantValue0 instanceof AnnotationValue) {
            return StringsKt__StringsKt.removePrefix(DescriptorRenderer.renderAnnotation$default(this, ((AnnotationDescriptor)((AnnotationValue)constantValue0).getValue()), null, 2, null), "@");
        }
        if(constantValue0 instanceof KClassValue) {
            Value kClassValue$Value0 = (Value)((KClassValue)constantValue0).getValue();
            if(kClassValue$Value0 instanceof LocalClass) {
                return ((LocalClass)kClassValue$Value0).getType() + "::class";
            }
            if(!(kClassValue$Value0 instanceof NormalClass)) {
                throw new NoWhenBranchMatchedException();
            }
            String s = ((NormalClass)kClassValue$Value0).getClassId().asSingleFqName().asString();
            Intrinsics.checkNotNullExpressionValue(s, "classValue.classId.asSingleFqName().asString()");
            int v = ((NormalClass)kClassValue$Value0).getArrayDimensions();
            for(int v1 = 0; v1 < v; ++v1) {
                s = "kotlin.Array<" + s + '>';
            }
            return s + "::class";
        }
        return constantValue0.toString();
    }

    public final void f(List list0, StringBuilder stringBuilder0) {
        if(!list0.isEmpty()) {
            stringBuilder0.append("context(");
            int v = 0;
            for(Object object0: list0) {
                this.c(stringBuilder0, ((ReceiverParameterDescriptor)object0), AnnotationUseSiteTarget.RECEIVER);
                KotlinType kotlinType0 = ((ReceiverParameterDescriptor)object0).getType();
                Intrinsics.checkNotNullExpressionValue(kotlinType0, "contextReceiver.type");
                stringBuilder0.append(this.i(kotlinType0));
                if(v == CollectionsKt__CollectionsKt.getLastIndex(list0)) {
                    stringBuilder0.append(") ");
                }
                else {
                    stringBuilder0.append(", ");
                }
                ++v;
            }
        }
    }

    public final void g(StringBuilder stringBuilder0, SimpleType simpleType0) {
        SimpleType simpleType1 = null;
        this.c(stringBuilder0, simpleType0, null);
        DefinitelyNotNullType definitelyNotNullType0 = simpleType0 instanceof DefinitelyNotNullType ? ((DefinitelyNotNullType)simpleType0) : null;
        if(definitelyNotNullType0 != null) {
            simpleType1 = definitelyNotNullType0.getOriginal();
        }
        if(!KotlinTypeKt.isError(simpleType0)) {
            if(simpleType0 instanceof StubTypeForBuilderInference) {
                stringBuilder0.append(((StubTypeForBuilderInference)simpleType0).getOriginalTypeVariable().toString());
            }
            else if(simpleType1 instanceof StubTypeForBuilderInference) {
                stringBuilder0.append(((StubTypeForBuilderInference)simpleType1).getOriginalTypeVariable().toString());
            }
            else {
                TypeConstructor typeConstructor0 = simpleType0.getConstructor();
                PossiblyInnerType possiblyInnerType0 = TypeParameterUtilsKt.buildPossiblyInnerType(simpleType0);
                if(possiblyInnerType0 == null) {
                    stringBuilder0.append(this.renderTypeConstructor(typeConstructor0));
                    stringBuilder0.append(this.renderTypeArguments(simpleType0.getArguments()));
                }
                else {
                    this.t(stringBuilder0, possiblyInnerType0);
                }
            }
        }
        else if(TypeUtilsKt.isUnresolvedType(simpleType0) && this.getPresentableUnresolvedTypes()) {
            stringBuilder0.append(this.h(ErrorUtils.INSTANCE.unresolvedTypeAsItIs(simpleType0)));
        }
        else {
            if(!(simpleType0 instanceof ErrorType) || this.getInformativeErrorType()) {
                stringBuilder0.append(simpleType0.getConstructor().toString());
            }
            else {
                stringBuilder0.append(((ErrorType)simpleType0).getDebugMessage());
            }
            stringBuilder0.append(this.renderTypeArguments(simpleType0.getArguments()));
        }
        if(simpleType0.isMarkedNullable()) {
            stringBuilder0.append("?");
        }
        if(SpecialTypesKt.isDefinitelyNotNullType(simpleType0)) {
            stringBuilder0.append(" & Any");
        }
    }

    public boolean getActualPropertiesInPrimaryConstructor() {
        return this.a.getActualPropertiesInPrimaryConstructor();
    }

    public boolean getAlwaysRenderModifiers() {
        return this.a.getAlwaysRenderModifiers();
    }

    @Override  // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    @NotNull
    public AnnotationArgumentsRenderingPolicy getAnnotationArgumentsRenderingPolicy() {
        return this.a.getAnnotationArgumentsRenderingPolicy();
    }

    @Nullable
    public Function1 getAnnotationFilter() {
        return this.a.getAnnotationFilter();
    }

    public boolean getBoldOnlyForNamesInHtml() {
        return this.a.getBoldOnlyForNamesInHtml();
    }

    public boolean getClassWithPrimaryConstructor() {
        return this.a.getClassWithPrimaryConstructor();
    }

    @NotNull
    public ClassifierNamePolicy getClassifierNamePolicy() {
        return this.a.getClassifierNamePolicy();
    }

    @Override  // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public boolean getDebugMode() {
        return this.a.getDebugMode();
    }

    @Nullable
    public Function1 getDefaultParameterValueRenderer() {
        return this.a.getDefaultParameterValueRenderer();
    }

    public boolean getEachAnnotationOnNewLine() {
        return this.a.getEachAnnotationOnNewLine();
    }

    @Override  // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public boolean getEnhancedTypes() {
        return this.a.getEnhancedTypes();
    }

    @NotNull
    public Set getExcludedAnnotationClasses() {
        return this.a.getExcludedAnnotationClasses();
    }

    @Override  // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    @NotNull
    public Set getExcludedTypeAnnotationClasses() {
        return this.a.getExcludedTypeAnnotationClasses();
    }

    public boolean getIncludeAdditionalModifiers() {
        return this.a.getIncludeAdditionalModifiers();
    }

    public boolean getIncludeAnnotationArguments() {
        return this.a.getIncludeAnnotationArguments();
    }

    public boolean getIncludeEmptyAnnotationArguments() {
        return this.a.getIncludeEmptyAnnotationArguments();
    }

    public boolean getIncludePropertyConstant() {
        return this.a.getIncludePropertyConstant();
    }

    public boolean getInformativeErrorType() {
        return this.a.getInformativeErrorType();
    }

    @NotNull
    public Set getModifiers() {
        return this.a.getModifiers();
    }

    public boolean getNormalizedVisibilities() {
        return this.a.getNormalizedVisibilities();
    }

    @NotNull
    public final DescriptorRendererOptionsImpl getOptions() {
        return this.a;
    }

    @NotNull
    public OverrideRenderingPolicy getOverrideRenderingPolicy() {
        return this.a.getOverrideRenderingPolicy();
    }

    @NotNull
    public ParameterNameRenderingPolicy getParameterNameRenderingPolicy() {
        return this.a.getParameterNameRenderingPolicy();
    }

    public boolean getParameterNamesInFunctionalTypes() {
        return this.a.getParameterNamesInFunctionalTypes();
    }

    public boolean getPresentableUnresolvedTypes() {
        return this.a.getPresentableUnresolvedTypes();
    }

    @NotNull
    public PropertyAccessorRenderingPolicy getPropertyAccessorRenderingPolicy() {
        return this.a.getPropertyAccessorRenderingPolicy();
    }

    public boolean getReceiverAfterName() {
        return this.a.getReceiverAfterName();
    }

    public boolean getRenderCompanionObjectName() {
        return this.a.getRenderCompanionObjectName();
    }

    public boolean getRenderConstructorDelegation() {
        return this.a.getRenderConstructorDelegation();
    }

    public boolean getRenderConstructorKeyword() {
        return this.a.getRenderConstructorKeyword();
    }

    public boolean getRenderDefaultAnnotationArguments() {
        return this.a.getRenderDefaultAnnotationArguments();
    }

    public boolean getRenderDefaultModality() {
        return this.a.getRenderDefaultModality();
    }

    public boolean getRenderDefaultVisibility() {
        return this.a.getRenderDefaultVisibility();
    }

    public boolean getRenderPrimaryConstructorParametersAsProperties() {
        return this.a.getRenderPrimaryConstructorParametersAsProperties();
    }

    public boolean getRenderTypeExpansions() {
        return this.a.getRenderTypeExpansions();
    }

    public boolean getRenderUnabbreviatedType() {
        return this.a.getRenderUnabbreviatedType();
    }

    public boolean getSecondaryConstructorsAsPrimary() {
        return this.a.getSecondaryConstructorsAsPrimary();
    }

    public boolean getStartFromDeclarationKeyword() {
        return this.a.getStartFromDeclarationKeyword();
    }

    public boolean getStartFromName() {
        return this.a.getStartFromName();
    }

    @NotNull
    public RenderingFormat getTextFormat() {
        return this.a.getTextFormat();
    }

    @NotNull
    public Function1 getTypeNormalizer() {
        return this.a.getTypeNormalizer();
    }

    public boolean getUninferredTypeParameterAsName() {
        return this.a.getUninferredTypeParameterAsName();
    }

    public boolean getUnitReturnType() {
        return this.a.getUnitReturnType();
    }

    @NotNull
    public ValueParametersHandler getValueParametersHandler() {
        return this.a.getValueParametersHandler();
    }

    public boolean getVerbose() {
        return this.a.getVerbose();
    }

    public boolean getWithDefinedIn() {
        return this.a.getWithDefinedIn();
    }

    public boolean getWithSourceFileForTopLevel() {
        return this.a.getWithSourceFileForTopLevel();
    }

    public boolean getWithoutReturnType() {
        return this.a.getWithoutReturnType();
    }

    public boolean getWithoutSuperTypes() {
        return this.a.getWithoutSuperTypes();
    }

    public boolean getWithoutTypeParameters() {
        return this.a.getWithoutTypeParameters();
    }

    public final String h(String s) {
        switch(WhenMappings.$EnumSwitchMapping$0[this.getTextFormat().ordinal()]) {
            case 1: {
                return s;
            }
            case 2: {
                return "<font color=red><b>" + s + "</b></font>";
            }
            default: {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    public final String i(KotlinType kotlinType0) {
        String s = this.renderType(kotlinType0);
        return (!DescriptorRendererImpl.F(kotlinType0) || TypeUtils.isNullableType(kotlinType0)) && !(kotlinType0 instanceof DefinitelyNotNullType) ? s : "(" + s + ')';
    }

    public final String j(String s) {
        switch(WhenMappings.$EnumSwitchMapping$0[this.getTextFormat().ordinal()]) {
            case 1: {
                return s;
            }
            case 2: {
                return this.getBoldOnlyForNamesInHtml() ? s : "<b>" + s + "</b>";
            }
            default: {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    public final void k(StringBuilder stringBuilder0, CallableMemberDescriptor callableMemberDescriptor0) {
        if(!this.getModifiers().contains(DescriptorRendererModifier.MEMBER_KIND)) {
            return;
        }
        if(this.getVerbose() && callableMemberDescriptor0.getKind() != Kind.DECLARATION) {
            stringBuilder0.append("/*");
            stringBuilder0.append(CapitalizeDecapitalizeKt.toLowerCaseAsciiOnly(callableMemberDescriptor0.getKind().name()));
            stringBuilder0.append("*/ ");
        }
    }

    public final void l(MemberDescriptor memberDescriptor0, StringBuilder stringBuilder0) {
        this.n(stringBuilder0, memberDescriptor0.isExternal(), "external");
        boolean z = false;
        this.n(stringBuilder0, this.getModifiers().contains(DescriptorRendererModifier.EXPECT) && memberDescriptor0.isExpect(), "expect");
        if(this.getModifiers().contains(DescriptorRendererModifier.ACTUAL) && memberDescriptor0.isActual()) {
            z = true;
        }
        this.n(stringBuilder0, z, "actual");
    }

    public final void m(StringBuilder stringBuilder0, CallableMemberDescriptor callableMemberDescriptor0) {
        if(DescriptorUtils.isTopLevelDeclaration(callableMemberDescriptor0) && callableMemberDescriptor0.getModality() == Modality.FINAL || this.getOverrideRenderingPolicy() == OverrideRenderingPolicy.RENDER_OVERRIDE && callableMemberDescriptor0.getModality() == Modality.OPEN && !callableMemberDescriptor0.getOverriddenDescriptors().isEmpty()) {
            return;
        }
        Modality modality0 = callableMemberDescriptor0.getModality();
        Intrinsics.checkNotNullExpressionValue(modality0, "callable.modality");
        Modality modality1 = DescriptorRendererImpl.b(callableMemberDescriptor0);
        if(this.getRenderDefaultModality() || modality0 != modality1) {
            this.n(stringBuilder0, this.getModifiers().contains(DescriptorRendererModifier.MODALITY), CapitalizeDecapitalizeKt.toLowerCaseAsciiOnly(modality0.name()));
        }
    }

    public final void n(StringBuilder stringBuilder0, boolean z, String s) {
        if(z) {
            stringBuilder0.append(this.j(s));
            stringBuilder0.append(" ");
        }
    }

    public final void o(DeclarationDescriptor declarationDescriptor0, StringBuilder stringBuilder0, boolean z) {
        Name name0 = declarationDescriptor0.getName();
        Intrinsics.checkNotNullExpressionValue(name0, "descriptor.name");
        stringBuilder0.append(this.renderName(name0, z));
    }

    public final void p(StringBuilder stringBuilder0, KotlinType kotlinType0) {
        UnwrappedType unwrappedType0 = kotlinType0.unwrap();
        AbbreviatedType abbreviatedType0 = unwrappedType0 instanceof AbbreviatedType ? ((AbbreviatedType)unwrappedType0) : null;
        if(abbreviatedType0 != null) {
            if(this.getRenderTypeExpansions()) {
                this.q(stringBuilder0, abbreviatedType0.getExpandedType());
                return;
            }
            this.q(stringBuilder0, abbreviatedType0.getAbbreviation());
            if(this.getRenderUnabbreviatedType()) {
                RenderingFormat renderingFormat0 = this.getTextFormat();
                RenderingFormat renderingFormat1 = RenderingFormat.HTML;
                if(renderingFormat0 == renderingFormat1) {
                    stringBuilder0.append("<font color=\"808080\"><i>");
                }
                stringBuilder0.append(" /* = ");
                this.q(stringBuilder0, abbreviatedType0.getExpandedType());
                stringBuilder0.append(" */");
                if(this.getTextFormat() == renderingFormat1) {
                    stringBuilder0.append("</i></font>");
                }
            }
            return;
        }
        this.q(stringBuilder0, kotlinType0);
    }

    public final void q(StringBuilder stringBuilder0, KotlinType kotlinType0) {
        String s;
        Name name0;
        if(kotlinType0 instanceof WrappedType && this.getDebugMode() && !((WrappedType)kotlinType0).isComputed()) {
            stringBuilder0.append("<Not computed yet>");
            return;
        }
        UnwrappedType unwrappedType0 = kotlinType0.unwrap();
        if(unwrappedType0 instanceof FlexibleType) {
            stringBuilder0.append(((FlexibleType)unwrappedType0).render(this, this));
            return;
        }
        if(unwrappedType0 instanceof SimpleType) {
            if(Intrinsics.areEqual(((SimpleType)unwrappedType0), TypeUtils.CANNOT_INFER_FUNCTION_PARAM_TYPE) || TypeUtils.isDontCarePlaceholder(((SimpleType)unwrappedType0))) {
                stringBuilder0.append("???");
            }
            else {
                if(ErrorUtils.isUninferredTypeVariable(((SimpleType)unwrappedType0))) {
                    if(this.getUninferredTypeParameterAsName()) {
                        TypeConstructor typeConstructor0 = ((SimpleType)unwrappedType0).getConstructor();
                        Intrinsics.checkNotNull(typeConstructor0, "null cannot be cast to non-null type org.jetbrains.kotlin.types.error.ErrorTypeConstructor");
                        stringBuilder0.append(this.h(((ErrorTypeConstructor)typeConstructor0).getParam(0)));
                        return;
                    }
                    stringBuilder0.append("???");
                    return;
                }
                if(KotlinTypeKt.isError(((SimpleType)unwrappedType0))) {
                    this.g(stringBuilder0, ((SimpleType)unwrappedType0));
                    return;
                }
                if(!DescriptorRendererImpl.F(((SimpleType)unwrappedType0))) {
                    this.g(stringBuilder0, ((SimpleType)unwrappedType0));
                    return;
                }
                int v = stringBuilder0.length();
                ((DescriptorRendererImpl)this.b.getValue()).c(stringBuilder0, ((SimpleType)unwrappedType0), null);
                boolean z = stringBuilder0.length() != v;
                KotlinType kotlinType1 = FunctionTypesKt.getReceiverTypeFromFunctionType(((SimpleType)unwrappedType0));
                List list0 = FunctionTypesKt.getContextReceiverTypesFromFunctionType(((SimpleType)unwrappedType0));
                if(!list0.isEmpty()) {
                    stringBuilder0.append("context(");
                    for(Object object0: list0.subList(0, CollectionsKt__CollectionsKt.getLastIndex(list0))) {
                        this.p(stringBuilder0, ((KotlinType)object0));
                        stringBuilder0.append(", ");
                    }
                    this.p(stringBuilder0, ((KotlinType)CollectionsKt___CollectionsKt.last(list0)));
                    stringBuilder0.append(") ");
                }
                boolean z1 = FunctionTypesKt.isSuspendFunctionType(((SimpleType)unwrappedType0));
                boolean z2 = ((SimpleType)unwrappedType0).isMarkedNullable();
                boolean z3 = z2 || z && kotlinType1 != null;
                if(z3) {
                    if(z1) {
                        stringBuilder0.insert(v, '(');
                    }
                    else {
                        if(z) {
                            StringsKt___StringsKt.last(stringBuilder0);
                            if(stringBuilder0.charAt(StringsKt__StringsKt.getLastIndex(stringBuilder0) - 1) != 41) {
                                stringBuilder0.insert(StringsKt__StringsKt.getLastIndex(stringBuilder0), "()");
                            }
                        }
                        stringBuilder0.append("(");
                    }
                }
                this.n(stringBuilder0, z1, "suspend");
                if(kotlinType1 != null) {
                    boolean z4 = DescriptorRendererImpl.F(kotlinType1) && !kotlinType1.isMarkedNullable() || FunctionTypesKt.isSuspendFunctionType(kotlinType1) || !kotlinType1.getAnnotations().isEmpty() || kotlinType1 instanceof DefinitelyNotNullType;
                    if(z4) {
                        stringBuilder0.append("(");
                    }
                    this.p(stringBuilder0, kotlinType1);
                    if(z4) {
                        stringBuilder0.append(")");
                    }
                    stringBuilder0.append(".");
                }
                stringBuilder0.append("(");
                if(!FunctionTypesKt.isBuiltinExtensionFunctionalType(((SimpleType)unwrappedType0)) || ((SimpleType)unwrappedType0).getArguments().size() > 1) {
                    int v1 = 0;
                    for(Object object1: FunctionTypesKt.getValueParameterTypesFromFunctionType(((SimpleType)unwrappedType0))) {
                        TypeProjection typeProjection0 = (TypeProjection)object1;
                        if(v1 > 0) {
                            stringBuilder0.append(", ");
                        }
                        if(this.getParameterNamesInFunctionalTypes()) {
                            KotlinType kotlinType2 = typeProjection0.getType();
                            Intrinsics.checkNotNullExpressionValue(kotlinType2, "typeProjection.type");
                            name0 = FunctionTypesKt.extractParameterNameFromFunctionTypeArgument(kotlinType2);
                        }
                        else {
                            name0 = null;
                        }
                        if(name0 != null) {
                            stringBuilder0.append(this.renderName(name0, false));
                            stringBuilder0.append(": ");
                        }
                        stringBuilder0.append(this.renderTypeProjection(typeProjection0));
                        ++v1;
                    }
                }
                else {
                    stringBuilder0.append("???");
                }
                stringBuilder0.append(") ");
                switch(WhenMappings.$EnumSwitchMapping$0[this.getTextFormat().ordinal()]) {
                    case 1: {
                        s = this.a("->");
                        break;
                    }
                    case 2: {
                        s = "&rarr;";
                        break;
                    }
                    default: {
                        throw new NoWhenBranchMatchedException();
                    }
                }
                stringBuilder0.append(s);
                stringBuilder0.append(" ");
                this.p(stringBuilder0, FunctionTypesKt.getReturnTypeFromFunctionType(((SimpleType)unwrappedType0)));
                if(z3) {
                    stringBuilder0.append(")");
                }
                if(z2) {
                    stringBuilder0.append("?");
                }
            }
        }
    }

    public final void r(StringBuilder stringBuilder0, CallableMemberDescriptor callableMemberDescriptor0) {
        if(!this.getModifiers().contains(DescriptorRendererModifier.OVERRIDE)) {
            return;
        }
        if(!callableMemberDescriptor0.getOverriddenDescriptors().isEmpty() && this.getOverrideRenderingPolicy() != OverrideRenderingPolicy.RENDER_OPEN) {
            this.n(stringBuilder0, true, "override");
            if(this.getVerbose()) {
                stringBuilder0.append("/*");
                stringBuilder0.append(callableMemberDescriptor0.getOverriddenDescriptors().size());
                stringBuilder0.append("*/ ");
            }
        }
    }

    @Override  // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer
    @NotNull
    public String render(@NotNull DeclarationDescriptor declarationDescriptor0) {
        Intrinsics.checkNotNullParameter(declarationDescriptor0, "declarationDescriptor");
        StringBuilder stringBuilder0 = new StringBuilder();
        declarationDescriptor0.accept(new h(this), stringBuilder0);
        if(this.getWithDefinedIn() && !(declarationDescriptor0 instanceof PackageFragmentDescriptor) && !(declarationDescriptor0 instanceof PackageViewDescriptor)) {
            DeclarationDescriptor declarationDescriptor1 = declarationDescriptor0.getContainingDeclaration();
            if(declarationDescriptor1 != null && !(declarationDescriptor1 instanceof ModuleDescriptor)) {
                stringBuilder0.append(" ");
                stringBuilder0.append(this.renderMessage("defined in"));
                stringBuilder0.append(" ");
                FqNameUnsafe fqNameUnsafe0 = DescriptorUtils.getFqName(declarationDescriptor1);
                Intrinsics.checkNotNullExpressionValue(fqNameUnsafe0, "getFqName(containingDeclaration)");
                stringBuilder0.append((fqNameUnsafe0.isRoot() ? "root package" : this.renderFqName(fqNameUnsafe0)));
                if(this.getWithSourceFileForTopLevel() && declarationDescriptor1 instanceof PackageFragmentDescriptor && declarationDescriptor0 instanceof DeclarationDescriptorWithSource) {
                    String s = ((DeclarationDescriptorWithSource)declarationDescriptor0).getSource().getContainingFile().getName();
                    if(s != null) {
                        stringBuilder0.append(" ");
                        stringBuilder0.append(this.renderMessage("in file"));
                        stringBuilder0.append(" ");
                        stringBuilder0.append(s);
                    }
                }
            }
        }
        String s1 = stringBuilder0.toString();
        Intrinsics.checkNotNullExpressionValue(s1, "StringBuilder().apply(builderAction).toString()");
        return s1;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer
    @NotNull
    public String renderAnnotation(@NotNull AnnotationDescriptor annotationDescriptor0, @Nullable AnnotationUseSiteTarget annotationUseSiteTarget0) {
        Intrinsics.checkNotNullParameter(annotationDescriptor0, "annotation");
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append('@');
        if(annotationUseSiteTarget0 != null) {
            stringBuilder0.append(annotationUseSiteTarget0.getRenderName() + ':');
        }
        KotlinType kotlinType0 = annotationDescriptor0.getType();
        stringBuilder0.append(this.renderType(kotlinType0));
        if(this.getIncludeAnnotationArguments()) {
            Map map0 = annotationDescriptor0.getAllValueArguments();
            List list0 = null;
            ClassDescriptor classDescriptor0 = this.getRenderDefaultAnnotationArguments() ? DescriptorUtilsKt.getAnnotationClass(annotationDescriptor0) : null;
            if(classDescriptor0 != null) {
                ClassConstructorDescriptor classConstructorDescriptor0 = classDescriptor0.getUnsubstitutedPrimaryConstructor();
                if(classConstructorDescriptor0 != null) {
                    List list1 = classConstructorDescriptor0.getValueParameters();
                    if(list1 != null) {
                        ArrayList arrayList0 = new ArrayList();
                        for(Object object0: list1) {
                            if(((ValueParameterDescriptor)object0).declaresDefaultValue()) {
                                arrayList0.add(object0);
                            }
                        }
                        ArrayList arrayList1 = new ArrayList(l.collectionSizeOrDefault(arrayList0, 10));
                        for(Object object1: arrayList0) {
                            arrayList1.add(((ValueParameterDescriptor)object1).getName());
                        }
                        list0 = arrayList1;
                    }
                }
            }
            if(list0 == null) {
                list0 = CollectionsKt__CollectionsKt.emptyList();
            }
            ArrayList arrayList2 = new ArrayList();
            for(Object object2: list0) {
                Intrinsics.checkNotNullExpressionValue(((Name)object2), "it");
                if(!map0.containsKey(((Name)object2))) {
                    arrayList2.add(object2);
                }
            }
            ArrayList arrayList3 = new ArrayList(l.collectionSizeOrDefault(arrayList2, 10));
            for(Object object3: arrayList2) {
                arrayList3.add(((Name)object3).asString() + " = ...");
            }
            Iterable iterable0 = map0.entrySet();
            ArrayList arrayList4 = new ArrayList(l.collectionSizeOrDefault(iterable0, 10));
            for(Object object4: iterable0) {
                Name name0 = (Name)((Map.Entry)object4).getKey();
                ConstantValue constantValue0 = (ConstantValue)((Map.Entry)object4).getValue();
                arrayList4.add(name0.asString() + " = " + (list0.contains(name0) ? "..." : this.e(constantValue0)));
            }
            List list2 = CollectionsKt___CollectionsKt.sorted(CollectionsKt___CollectionsKt.plus(arrayList3, arrayList4));
            if(this.getIncludeEmptyAnnotationArguments() || !list2.isEmpty()) {
                CollectionsKt___CollectionsKt.joinTo$default(list2, stringBuilder0, ", ", "(", ")", 0, null, null, 0x70, null);
            }
        }
        if(this.getVerbose() && (KotlinTypeKt.isError(kotlinType0) || kotlinType0.getConstructor().getDeclarationDescriptor() instanceof MockClassDescriptor)) {
            stringBuilder0.append(" /* annotation class not found */");
        }
        String s = stringBuilder0.toString();
        Intrinsics.checkNotNullExpressionValue(s, "StringBuilder().apply(builderAction).toString()");
        return s;
    }

    @NotNull
    public String renderClassifierName(@NotNull ClassifierDescriptor classifierDescriptor0) {
        Intrinsics.checkNotNullParameter(classifierDescriptor0, "klass");
        return ErrorUtils.isError(classifierDescriptor0) ? classifierDescriptor0.getTypeConstructor().toString() : this.getClassifierNamePolicy().renderClassifier(classifierDescriptor0, this);
    }

    @Override  // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer
    @NotNull
    public String renderFlexibleType(@NotNull String s, @NotNull String s1, @NotNull KotlinBuiltIns kotlinBuiltIns0) {
        Intrinsics.checkNotNullParameter(s, "lowerRendered");
        Intrinsics.checkNotNullParameter(s1, "upperRendered");
        Intrinsics.checkNotNullParameter(kotlinBuiltIns0, "builtIns");
        if(RenderingUtilsKt.typeStringsDifferOnlyInNullability(s, s1)) {
            return p.startsWith$default(s1, "(", false, 2, null) ? "(" + s + ")!" : s + '!';
        }
        ClassifierNamePolicy classifierNamePolicy0 = this.getClassifierNamePolicy();
        ClassDescriptor classDescriptor0 = kotlinBuiltIns0.getCollection();
        Intrinsics.checkNotNullExpressionValue(classDescriptor0, "builtIns.collection");
        String s2 = StringsKt__StringsKt.substringBefore$default(classifierNamePolicy0.renderClassifier(classDescriptor0, this), "Collection", null, 2, null);
        String s3 = RenderingUtilsKt.replacePrefixesInTypeRepresentations(s, s2 + "Mutable", s1, s2, s2 + "(Mutable)");
        if(s3 != null) {
            return s3;
        }
        String s4 = RenderingUtilsKt.replacePrefixesInTypeRepresentations(s, s2 + "MutableMap.MutableEntry", s1, s2 + "Map.Entry", s2 + "(Mutable)Map.(Mutable)Entry");
        if(s4 != null) {
            return s4;
        }
        ClassifierNamePolicy classifierNamePolicy1 = this.getClassifierNamePolicy();
        ClassDescriptor classDescriptor1 = kotlinBuiltIns0.getArray();
        Intrinsics.checkNotNullExpressionValue(classDescriptor1, "builtIns.array");
        String s5 = StringsKt__StringsKt.substringBefore$default(classifierNamePolicy1.renderClassifier(classDescriptor1, this), "Array", null, 2, null);
        StringBuilder stringBuilder0 = b.t(s5);
        stringBuilder0.append(this.a("Array<"));
        StringBuilder stringBuilder1 = b.t(s5);
        stringBuilder1.append(this.a("Array<out "));
        StringBuilder stringBuilder2 = b.t(s5);
        stringBuilder2.append(this.a("Array<(out) "));
        String s6 = RenderingUtilsKt.replacePrefixesInTypeRepresentations(s, stringBuilder0.toString(), s1, stringBuilder1.toString(), stringBuilder2.toString());
        return s6 == null ? "(" + s + ".." + s1 + ')' : s6;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer
    @NotNull
    public String renderFqName(@NotNull FqNameUnsafe fqNameUnsafe0) {
        Intrinsics.checkNotNullParameter(fqNameUnsafe0, "fqName");
        List list0 = fqNameUnsafe0.pathSegments();
        Intrinsics.checkNotNullExpressionValue(list0, "fqName.pathSegments()");
        return this.a(RenderingUtilsKt.renderFqName(list0));
    }

    @NotNull
    public String renderMessage(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "message");
        switch(WhenMappings.$EnumSwitchMapping$0[this.getTextFormat().ordinal()]) {
            case 1: {
                return s;
            }
            case 2: {
                return "<i>" + s + "</i>";
            }
            default: {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    @Override  // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer
    @NotNull
    public String renderName(@NotNull Name name0, boolean z) {
        Intrinsics.checkNotNullParameter(name0, "name");
        String s = this.a(RenderingUtilsKt.render(name0));
        return !this.getBoldOnlyForNamesInHtml() || this.getTextFormat() != RenderingFormat.HTML || !z ? s : "<b>" + s + "</b>";
    }

    @Override  // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer
    @NotNull
    public String renderType(@NotNull KotlinType kotlinType0) {
        Intrinsics.checkNotNullParameter(kotlinType0, "type");
        StringBuilder stringBuilder0 = new StringBuilder();
        this.p(stringBuilder0, ((KotlinType)this.getTypeNormalizer().invoke(kotlinType0)));
        String s = stringBuilder0.toString();
        Intrinsics.checkNotNullExpressionValue(s, "StringBuilder().apply(builderAction).toString()");
        return s;
    }

    @NotNull
    public String renderTypeArguments(@NotNull List list0) {
        Intrinsics.checkNotNullParameter(list0, "typeArguments");
        if(list0.isEmpty()) {
            return "";
        }
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append(this.a("<"));
        CollectionsKt___CollectionsKt.joinTo$default(list0, stringBuilder0, ", ", null, null, 0, null, new g(this, 0), 60, null);
        stringBuilder0.append(this.a(">"));
        String s = stringBuilder0.toString();
        Intrinsics.checkNotNullExpressionValue(s, "StringBuilder().apply(builderAction).toString()");
        return s;
    }

    @NotNull
    public String renderTypeConstructor(@NotNull TypeConstructor typeConstructor0) {
        Intrinsics.checkNotNullParameter(typeConstructor0, "typeConstructor");
        ClassifierDescriptor classifierDescriptor0 = typeConstructor0.getDeclarationDescriptor();
        if(((classifierDescriptor0 instanceof TypeParameterDescriptor ? true : classifierDescriptor0 instanceof ClassDescriptor) ? true : classifierDescriptor0 instanceof TypeAliasDescriptor)) {
            return this.renderClassifierName(classifierDescriptor0);
        }
        if(classifierDescriptor0 != null) {
            throw new IllegalStateException(("Unexpected classifier: " + classifierDescriptor0.getClass()).toString());
        }
        return typeConstructor0 instanceof IntersectionTypeConstructor ? ((IntersectionTypeConstructor)typeConstructor0).makeDebugNameForIntersectionType(j.w) : typeConstructor0.toString();
    }

    @Override  // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer
    @NotNull
    public String renderTypeProjection(@NotNull TypeProjection typeProjection0) {
        Intrinsics.checkNotNullParameter(typeProjection0, "typeProjection");
        StringBuilder stringBuilder0 = new StringBuilder();
        CollectionsKt___CollectionsKt.joinTo$default(k.listOf(typeProjection0), stringBuilder0, ", ", null, null, 0, null, new g(this, 0), 60, null);
        String s = stringBuilder0.toString();
        Intrinsics.checkNotNullExpressionValue(s, "StringBuilder().apply(builderAction).toString()");
        return s;
    }

    public final void s(FqName fqName0, String s, StringBuilder stringBuilder0) {
        stringBuilder0.append(this.j(s));
        FqNameUnsafe fqNameUnsafe0 = fqName0.toUnsafe();
        Intrinsics.checkNotNullExpressionValue(fqNameUnsafe0, "fqName.toUnsafe()");
        String s1 = this.renderFqName(fqNameUnsafe0);
        if(s1.length() > 0) {
            stringBuilder0.append(" ");
            stringBuilder0.append(s1);
        }
    }

    @Override  // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public void setAnnotationArgumentsRenderingPolicy(@NotNull AnnotationArgumentsRenderingPolicy annotationArgumentsRenderingPolicy0) {
        Intrinsics.checkNotNullParameter(annotationArgumentsRenderingPolicy0, "<set-?>");
        this.a.setAnnotationArgumentsRenderingPolicy(annotationArgumentsRenderingPolicy0);
    }

    @Override  // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public void setClassifierNamePolicy(@NotNull ClassifierNamePolicy classifierNamePolicy0) {
        Intrinsics.checkNotNullParameter(classifierNamePolicy0, "<set-?>");
        this.a.setClassifierNamePolicy(classifierNamePolicy0);
    }

    @Override  // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public void setDebugMode(boolean z) {
        this.a.setDebugMode(z);
    }

    @Override  // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public void setExcludedTypeAnnotationClasses(@NotNull Set set0) {
        Intrinsics.checkNotNullParameter(set0, "<set-?>");
        this.a.setExcludedTypeAnnotationClasses(set0);
    }

    @Override  // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public void setModifiers(@NotNull Set set0) {
        Intrinsics.checkNotNullParameter(set0, "<set-?>");
        this.a.setModifiers(set0);
    }

    @Override  // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public void setParameterNameRenderingPolicy(@NotNull ParameterNameRenderingPolicy parameterNameRenderingPolicy0) {
        Intrinsics.checkNotNullParameter(parameterNameRenderingPolicy0, "<set-?>");
        this.a.setParameterNameRenderingPolicy(parameterNameRenderingPolicy0);
    }

    @Override  // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public void setReceiverAfterName(boolean z) {
        this.a.setReceiverAfterName(z);
    }

    @Override  // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public void setRenderCompanionObjectName(boolean z) {
        this.a.setRenderCompanionObjectName(z);
    }

    @Override  // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public void setStartFromName(boolean z) {
        this.a.setStartFromName(z);
    }

    @Override  // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public void setTextFormat(@NotNull RenderingFormat renderingFormat0) {
        Intrinsics.checkNotNullParameter(renderingFormat0, "<set-?>");
        this.a.setTextFormat(renderingFormat0);
    }

    @Override  // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public void setVerbose(boolean z) {
        this.a.setVerbose(z);
    }

    @Override  // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public void setWithDefinedIn(boolean z) {
        this.a.setWithDefinedIn(z);
    }

    @Override  // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public void setWithoutSuperTypes(boolean z) {
        this.a.setWithoutSuperTypes(z);
    }

    @Override  // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public void setWithoutTypeParameters(boolean z) {
        this.a.setWithoutTypeParameters(z);
    }

    public final void t(StringBuilder stringBuilder0, PossiblyInnerType possiblyInnerType0) {
        PossiblyInnerType possiblyInnerType1 = possiblyInnerType0.getOuterType();
        if(possiblyInnerType1 == null) {
            TypeConstructor typeConstructor0 = possiblyInnerType0.getClassifierDescriptor().getTypeConstructor();
            Intrinsics.checkNotNullExpressionValue(typeConstructor0, "possiblyInnerType.classi…escriptor.typeConstructor");
            stringBuilder0.append(this.renderTypeConstructor(typeConstructor0));
        }
        else {
            this.t(stringBuilder0, possiblyInnerType1);
            stringBuilder0.append('.');
            Name name0 = possiblyInnerType0.getClassifierDescriptor().getName();
            Intrinsics.checkNotNullExpressionValue(name0, "possiblyInnerType.classifierDescriptor.name");
            stringBuilder0.append(this.renderName(name0, false));
        }
        stringBuilder0.append(this.renderTypeArguments(possiblyInnerType0.getArguments()));
    }

    public final void u(StringBuilder stringBuilder0, CallableMemberDescriptor callableMemberDescriptor0) {
        ReceiverParameterDescriptor receiverParameterDescriptor0 = callableMemberDescriptor0.getExtensionReceiverParameter();
        if(receiverParameterDescriptor0 != null) {
            this.c(stringBuilder0, receiverParameterDescriptor0, AnnotationUseSiteTarget.RECEIVER);
            KotlinType kotlinType0 = receiverParameterDescriptor0.getType();
            Intrinsics.checkNotNullExpressionValue(kotlinType0, "receiver.type");
            stringBuilder0.append(this.i(kotlinType0));
            stringBuilder0.append(".");
        }
    }

    public final void v(StringBuilder stringBuilder0, CallableMemberDescriptor callableMemberDescriptor0) {
        if(!this.getReceiverAfterName()) {
            return;
        }
        ReceiverParameterDescriptor receiverParameterDescriptor0 = callableMemberDescriptor0.getExtensionReceiverParameter();
        if(receiverParameterDescriptor0 != null) {
            stringBuilder0.append(" on ");
            KotlinType kotlinType0 = receiverParameterDescriptor0.getType();
            Intrinsics.checkNotNullExpressionValue(kotlinType0, "receiver.type");
            stringBuilder0.append(this.renderType(kotlinType0));
        }
    }

    public static void w(StringBuilder stringBuilder0) {
        int v = stringBuilder0.length();
        if(v == 0 || stringBuilder0.charAt(v - 1) != 0x20) {
            stringBuilder0.append(' ');
        }
    }

    public final void x(TypeParameterDescriptor typeParameterDescriptor0, StringBuilder stringBuilder0, boolean z) {
        if(z) {
            stringBuilder0.append(this.a("<"));
        }
        if(this.getVerbose()) {
            stringBuilder0.append("/*");
            stringBuilder0.append(typeParameterDescriptor0.getIndex());
            stringBuilder0.append("*/ ");
        }
        this.n(stringBuilder0, typeParameterDescriptor0.isReified(), "reified");
        String s = typeParameterDescriptor0.getVariance().getLabel();
        boolean z1 = true;
        this.n(stringBuilder0, s.length() > 0, s);
        this.c(stringBuilder0, typeParameterDescriptor0, null);
        this.o(typeParameterDescriptor0, stringBuilder0, z);
        int v = typeParameterDescriptor0.getUpperBounds().size();
        if(v > 1 && !z || v == 1) {
            Object object0 = typeParameterDescriptor0.getUpperBounds().iterator().next();
            if(!KotlinBuiltIns.isDefaultBound(((KotlinType)object0))) {
                stringBuilder0.append(" : ");
                Intrinsics.checkNotNullExpressionValue(((KotlinType)object0), "upperBound");
                stringBuilder0.append(this.renderType(((KotlinType)object0)));
            }
        }
        else if(z) {
            for(Object object1: typeParameterDescriptor0.getUpperBounds()) {
                KotlinType kotlinType0 = (KotlinType)object1;
                if(!KotlinBuiltIns.isDefaultBound(kotlinType0)) {
                    if(z1) {
                        stringBuilder0.append(" : ");
                    }
                    else {
                        stringBuilder0.append(" & ");
                    }
                    Intrinsics.checkNotNullExpressionValue(kotlinType0, "upperBound");
                    stringBuilder0.append(this.renderType(kotlinType0));
                    z1 = false;
                }
            }
        }
        if(z) {
            stringBuilder0.append(this.a(">"));
        }
    }

    public final void y(List list0, StringBuilder stringBuilder0) {
        Iterator iterator0 = list0.iterator();
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            this.x(((TypeParameterDescriptor)object0), stringBuilder0, false);
            if(iterator0.hasNext()) {
                stringBuilder0.append(", ");
            }
        }
    }

    public final void z(List list0, StringBuilder stringBuilder0, boolean z) {
        if(this.getWithoutTypeParameters()) {
            return;
        }
        if(!list0.isEmpty()) {
            stringBuilder0.append(this.a("<"));
            this.y(list0, stringBuilder0);
            stringBuilder0.append(this.a(">"));
            if(z) {
                stringBuilder0.append(" ");
            }
        }
    }
}

