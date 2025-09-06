package kotlin.reflect.jvm.internal.impl.load.java.descriptors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ValueParameterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaStaticClassScope;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@SourceDebugExtension({"SMAP\nutil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 util.kt\norg/jetbrains/kotlin/load/java/descriptors/UtilKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,68:1\n1549#2:69\n1620#2,3:70\n*S KotlinDebug\n*F\n+ 1 util.kt\norg/jetbrains/kotlin/load/java/descriptors/UtilKt\n*L\n40#1:69\n40#1:70,3\n*E\n"})
public final class UtilKt {
    @NotNull
    public static final List copyValueParameters(@NotNull Collection collection0, @NotNull Collection collection1, @NotNull CallableDescriptor callableDescriptor0) {
        Intrinsics.checkNotNullParameter(collection0, "newValueParameterTypes");
        Intrinsics.checkNotNullParameter(collection1, "oldValueParameters");
        Intrinsics.checkNotNullParameter(callableDescriptor0, "newOwner");
        collection0.size();
        collection1.size();
        Iterable iterable0 = CollectionsKt___CollectionsKt.zip(collection0, collection1);
        List list0 = new ArrayList(l.collectionSizeOrDefault(iterable0, 10));
        for(Object object0: iterable0) {
            KotlinType kotlinType0 = (KotlinType)((Pair)object0).component1();
            ValueParameterDescriptor valueParameterDescriptor0 = (ValueParameterDescriptor)((Pair)object0).component2();
            int v = valueParameterDescriptor0.getIndex();
            Annotations annotations0 = valueParameterDescriptor0.getAnnotations();
            Name name0 = valueParameterDescriptor0.getName();
            Intrinsics.checkNotNullExpressionValue(name0, "oldParameter.name");
            boolean z = valueParameterDescriptor0.declaresDefaultValue();
            boolean z1 = valueParameterDescriptor0.isCrossinline();
            boolean z2 = valueParameterDescriptor0.isNoinline();
            KotlinType kotlinType1 = valueParameterDescriptor0.getVarargElementType() == null ? null : DescriptorUtilsKt.getModule(callableDescriptor0).getBuiltIns().getArrayElementType(kotlinType0);
            SourceElement sourceElement0 = valueParameterDescriptor0.getSource();
            Intrinsics.checkNotNullExpressionValue(sourceElement0, "oldParameter.source");
            list0.add(new ValueParameterDescriptorImpl(callableDescriptor0, null, v, annotations0, name0, kotlinType0, z, z1, z2, kotlinType1, sourceElement0));
        }
        return list0;
    }

    @Nullable
    public static final LazyJavaStaticClassScope getParentJavaStaticClassScope(@NotNull ClassDescriptor classDescriptor0) {
        Intrinsics.checkNotNullParameter(classDescriptor0, "<this>");
        ClassDescriptor classDescriptor1 = DescriptorUtilsKt.getSuperClassNotAny(classDescriptor0);
        LazyJavaStaticClassScope lazyJavaStaticClassScope0 = null;
        if(classDescriptor1 == null) {
            return null;
        }
        MemberScope memberScope0 = classDescriptor1.getStaticScope();
        if(memberScope0 instanceof LazyJavaStaticClassScope) {
            lazyJavaStaticClassScope0 = (LazyJavaStaticClassScope)memberScope0;
        }
        return lazyJavaStaticClassScope0 == null ? UtilKt.getParentJavaStaticClassScope(classDescriptor1) : lazyJavaStaticClassScope0;
    }
}

