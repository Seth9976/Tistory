package kotlin.reflect.jvm.internal.impl.builtins.functions;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Pair;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.IndexedValue;
import kotlin.collections.l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.builtins.FunctionTypesKt;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl.CopyConfiguration;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.SimpleFunctionDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ValueParameterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.util.OperatorNameConventions;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@SourceDebugExtension({"SMAP\nFunctionInvokeDescriptor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FunctionInvokeDescriptor.kt\norg/jetbrains/kotlin/builtins/functions/FunctionInvokeDescriptor\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,161:1\n2624#2,3:162\n1549#2:165\n1620#2,3:166\n1726#2,3:169\n1549#2:172\n1620#2,3:173\n1747#2,3:176\n*S KotlinDebug\n*F\n+ 1 FunctionInvokeDescriptor.kt\norg/jetbrains/kotlin/builtins/functions/FunctionInvokeDescriptor\n*L\n63#1:162,3\n64#1:165\n64#1:166,3\n88#1:169,3\n92#1:172\n92#1:173,3\n106#1:176,3\n*E\n"})
public final class FunctionInvokeDescriptor extends SimpleFunctionDescriptorImpl {
    @SourceDebugExtension({"SMAP\nFunctionInvokeDescriptor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FunctionInvokeDescriptor.kt\norg/jetbrains/kotlin/builtins/functions/FunctionInvokeDescriptor$Factory\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,161:1\n959#2,7:162\n1549#2:169\n1620#2,3:170\n*S KotlinDebug\n*F\n+ 1 FunctionInvokeDescriptor.kt\norg/jetbrains/kotlin/builtins/functions/FunctionInvokeDescriptor$Factory\n*L\n122#1:162,7\n124#1:169\n124#1:170,3\n*E\n"})
    public static final class Factory {
        public Factory(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        @NotNull
        public final FunctionInvokeDescriptor create(@NotNull FunctionClassDescriptor functionClassDescriptor0, boolean z) {
            String s1;
            Intrinsics.checkNotNullParameter(functionClassDescriptor0, "functionClass");
            List list0 = functionClassDescriptor0.getDeclaredTypeParameters();
            FunctionInvokeDescriptor functionInvokeDescriptor0 = new FunctionInvokeDescriptor(functionClassDescriptor0, null, Kind.DECLARATION, z, null);
            ReceiverParameterDescriptor receiverParameterDescriptor0 = functionClassDescriptor0.getThisAsReceiverParameter();
            List list1 = CollectionsKt__CollectionsKt.emptyList();
            List list2 = CollectionsKt__CollectionsKt.emptyList();
            ArrayList arrayList0 = new ArrayList();
            for(Object object0: list0) {
                if(((TypeParameterDescriptor)object0).getVariance() != Variance.IN_VARIANCE) {
                    break;
                }
                arrayList0.add(object0);
            }
            Iterable iterable0 = CollectionsKt___CollectionsKt.withIndex(arrayList0);
            ArrayList arrayList1 = new ArrayList(l.collectionSizeOrDefault(iterable0, 10));
            for(Object object1: iterable0) {
                int v = ((IndexedValue)object1).getIndex();
                TypeParameterDescriptor typeParameterDescriptor0 = (TypeParameterDescriptor)((IndexedValue)object1).getValue();
                FunctionInvokeDescriptor.Factory.getClass();
                String s = typeParameterDescriptor0.getName().asString();
                Intrinsics.checkNotNullExpressionValue(s, "typeParameter.name.asString()");
                if(Intrinsics.areEqual(s, "T")) {
                    s1 = "instance";
                }
                else if(Intrinsics.areEqual(s, "E")) {
                    s1 = "receiver";
                }
                else {
                    s1 = s.toLowerCase(Locale.ROOT);
                    Intrinsics.checkNotNullExpressionValue(s1, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                }
                Name name0 = Name.identifier(s1);
                Intrinsics.checkNotNullExpressionValue(name0, "identifier(name)");
                SimpleType simpleType0 = typeParameterDescriptor0.getDefaultType();
                Intrinsics.checkNotNullExpressionValue(simpleType0, "typeParameter.defaultType");
                Intrinsics.checkNotNullExpressionValue(SourceElement.NO_SOURCE, "NO_SOURCE");
                arrayList1.add(new ValueParameterDescriptorImpl(functionInvokeDescriptor0, null, v, Annotations.Companion.getEMPTY(), name0, simpleType0, false, false, false, null, SourceElement.NO_SOURCE));
            }
            functionInvokeDescriptor0.initialize(null, receiverParameterDescriptor0, list1, list2, arrayList1, ((TypeParameterDescriptor)CollectionsKt___CollectionsKt.last(list0)).getDefaultType(), Modality.ABSTRACT, DescriptorVisibilities.PUBLIC);
            functionInvokeDescriptor0.setHasSynthesizedParameterNames(true);
            return functionInvokeDescriptor0;
        }
    }

    @NotNull
    public static final Factory Factory;

    static {
        FunctionInvokeDescriptor.Factory = new Factory(null);
    }

    public FunctionInvokeDescriptor(DeclarationDescriptor declarationDescriptor0, FunctionInvokeDescriptor functionInvokeDescriptor0, Kind callableMemberDescriptor$Kind0, boolean z) {
        super(declarationDescriptor0, functionInvokeDescriptor0, Annotations.Companion.getEMPTY(), OperatorNameConventions.INVOKE, callableMemberDescriptor$Kind0, SourceElement.NO_SOURCE);
        this.setOperator(true);
        this.setSuspend(z);
        this.setHasStableParameterNames(false);
    }

    public FunctionInvokeDescriptor(DeclarationDescriptor declarationDescriptor0, FunctionInvokeDescriptor functionInvokeDescriptor0, Kind callableMemberDescriptor$Kind0, boolean z, DefaultConstructorMarker defaultConstructorMarker0) {
        this(declarationDescriptor0, functionInvokeDescriptor0, callableMemberDescriptor$Kind0, z);
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.impl.SimpleFunctionDescriptorImpl
    @NotNull
    public FunctionDescriptorImpl createSubstitutedCopy(@NotNull DeclarationDescriptor declarationDescriptor0, @Nullable FunctionDescriptor functionDescriptor0, @NotNull Kind callableMemberDescriptor$Kind0, @Nullable Name name0, @NotNull Annotations annotations0, @NotNull SourceElement sourceElement0) {
        Intrinsics.checkNotNullParameter(declarationDescriptor0, "newOwner");
        Intrinsics.checkNotNullParameter(callableMemberDescriptor$Kind0, "kind");
        Intrinsics.checkNotNullParameter(annotations0, "annotations");
        Intrinsics.checkNotNullParameter(sourceElement0, "source");
        return new FunctionInvokeDescriptor(declarationDescriptor0, ((FunctionInvokeDescriptor)functionDescriptor0), callableMemberDescriptor$Kind0, this.isSuspend());
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl
    @Nullable
    public FunctionDescriptor doSubstitute(@NotNull CopyConfiguration functionDescriptorImpl$CopyConfiguration0) {
        Intrinsics.checkNotNullParameter(functionDescriptorImpl$CopyConfiguration0, "configuration");
        FunctionDescriptor functionDescriptor0 = (FunctionInvokeDescriptor)super.doSubstitute(functionDescriptorImpl$CopyConfiguration0);
        if(functionDescriptor0 == null) {
            return null;
        }
        List list0 = ((FunctionDescriptorImpl)functionDescriptor0).getValueParameters();
        Intrinsics.checkNotNullExpressionValue(list0, "substituted.valueParameters");
        if(!(list0 instanceof Collection) || !list0.isEmpty()) {
        alab1:
            for(Object object0: list0) {
                KotlinType kotlinType0 = ((ValueParameterDescriptor)object0).getType();
                Intrinsics.checkNotNullExpressionValue(kotlinType0, "it.type");
                if(FunctionTypesKt.extractParameterNameFromFunctionTypeArgument(kotlinType0) != null) {
                    List list1 = ((FunctionDescriptorImpl)functionDescriptor0).getValueParameters();
                    Intrinsics.checkNotNullExpressionValue(list1, "substituted.valueParameters");
                    ArrayList arrayList0 = new ArrayList(l.collectionSizeOrDefault(list1, 10));
                    for(Object object1: list1) {
                        KotlinType kotlinType1 = ((ValueParameterDescriptor)object1).getType();
                        Intrinsics.checkNotNullExpressionValue(kotlinType1, "it.type");
                        arrayList0.add(FunctionTypesKt.extractParameterNameFromFunctionTypeArgument(kotlinType1));
                    }
                    int v = ((FunctionDescriptorImpl)functionDescriptor0).getValueParameters().size() - arrayList0.size();
                    boolean z = true;
                    if(v == 0) {
                        List list2 = ((FunctionDescriptorImpl)functionDescriptor0).getValueParameters();
                        Intrinsics.checkNotNullExpressionValue(list2, "valueParameters");
                        Iterable iterable0 = CollectionsKt___CollectionsKt.zip(arrayList0, list2);
                        if(iterable0 instanceof Collection && ((Collection)iterable0).isEmpty()) {
                            break;
                        }
                        Iterator iterator2 = iterable0.iterator();
                        while(true) {
                            if(!iterator2.hasNext()) {
                                break alab1;
                            }
                            Object object2 = iterator2.next();
                            if(!Intrinsics.areEqual(((Name)((Pair)object2).component1()), ((ValueParameterDescriptor)((Pair)object2).component2()).getName())) {
                                break;
                            }
                        }
                    }
                    List list3 = ((FunctionDescriptorImpl)functionDescriptor0).getValueParameters();
                    Intrinsics.checkNotNullExpressionValue(list3, "valueParameters");
                    ArrayList arrayList1 = new ArrayList(l.collectionSizeOrDefault(list3, 10));
                    for(Object object3: list3) {
                        Name name0 = ((ValueParameterDescriptor)object3).getName();
                        Intrinsics.checkNotNullExpressionValue(name0, "it.name");
                        int v1 = ((ValueParameterDescriptor)object3).getIndex();
                        int v2 = v1 - v;
                        if(v2 >= 0) {
                            Name name1 = (Name)arrayList0.get(v2);
                            if(name1 != null) {
                                name0 = name1;
                            }
                        }
                        arrayList1.add(((ValueParameterDescriptor)object3).copy(functionDescriptor0, name0, v1));
                    }
                    CopyConfiguration functionDescriptorImpl$CopyConfiguration1 = ((FunctionDescriptorImpl)functionDescriptor0).newCopyBuilder(TypeSubstitutor.EMPTY);
                    if(!arrayList0.isEmpty()) {
                        for(Object object4: arrayList0) {
                            if(((Name)object4) != null) {
                                continue;
                            }
                            goto label_58;
                        }
                    }
                    z = false;
                label_58:
                    CopyConfiguration functionDescriptorImpl$CopyConfiguration2 = functionDescriptorImpl$CopyConfiguration1.setHasSynthesizedParameterNames(z).setValueParameters(arrayList1).setOriginal(((SimpleFunctionDescriptorImpl)functionDescriptor0).getOriginal());
                    Intrinsics.checkNotNullExpressionValue(functionDescriptorImpl$CopyConfiguration2, "newCopyBuilder(TypeSubst…   .setOriginal(original)");
                    functionDescriptor0 = ((FunctionDescriptorImpl)functionDescriptor0).super.doSubstitute(functionDescriptorImpl$CopyConfiguration2);
                    Intrinsics.checkNotNull(functionDescriptor0);
                    return functionDescriptor0;
                }
                if(false) {
                    break;
                }
            }
        }
        return functionDescriptor0;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public boolean isExternal() {
        return false;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor
    public boolean isInline() {
        return false;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor
    public boolean isTailrec() {
        return false;
    }
}

