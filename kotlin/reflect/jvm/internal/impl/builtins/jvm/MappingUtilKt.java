package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.l;
import kotlin.collections.x;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructorSubstitution.Companion;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructorSubstitution;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import org.jetbrains.annotations.NotNull;

@SourceDebugExtension({"SMAP\nmappingUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 mappingUtil.kt\norg/jetbrains/kotlin/builtins/jvm/MappingUtilKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,24:1\n1549#2:25\n1620#2,3:26\n1549#2:29\n1620#2,3:30\n*S KotlinDebug\n*F\n+ 1 mappingUtil.kt\norg/jetbrains/kotlin/builtins/jvm/MappingUtilKt\n*L\n20#1:25\n20#1:26,3\n21#1:29\n21#1:30,3\n*E\n"})
public final class MappingUtilKt {
    @NotNull
    public static final TypeConstructorSubstitution createMappedTypeParametersSubstitution(@NotNull ClassDescriptor classDescriptor0, @NotNull ClassDescriptor classDescriptor1) {
        Intrinsics.checkNotNullParameter(classDescriptor0, "from");
        Intrinsics.checkNotNullParameter(classDescriptor1, "to");
        classDescriptor0.getDeclaredTypeParameters().size();
        classDescriptor1.getDeclaredTypeParameters().size();
        Companion typeConstructorSubstitution$Companion0 = TypeConstructorSubstitution.Companion;
        List list0 = classDescriptor0.getDeclaredTypeParameters();
        Intrinsics.checkNotNullExpressionValue(list0, "from.declaredTypeParameters");
        ArrayList arrayList0 = new ArrayList(l.collectionSizeOrDefault(list0, 10));
        for(Object object0: list0) {
            arrayList0.add(((TypeParameterDescriptor)object0).getTypeConstructor());
        }
        List list1 = classDescriptor1.getDeclaredTypeParameters();
        Intrinsics.checkNotNullExpressionValue(list1, "to.declaredTypeParameters");
        ArrayList arrayList1 = new ArrayList(l.collectionSizeOrDefault(list1, 10));
        for(Object object1: list1) {
            SimpleType simpleType0 = ((TypeParameterDescriptor)object1).getDefaultType();
            Intrinsics.checkNotNullExpressionValue(simpleType0, "it.defaultType");
            arrayList1.add(TypeUtilsKt.asTypeProjection(simpleType0));
        }
        return Companion.createByConstructorsMap$default(typeConstructorSubstitution$Companion0, x.toMap(CollectionsKt___CollectionsKt.zip(arrayList0, arrayList1)), false, 2, null);
    }
}

