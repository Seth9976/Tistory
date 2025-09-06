package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.l;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.descriptors.InlineClassRepresentation;
import kotlin.reflect.jvm.internal.impl.descriptors.MultiFieldValueClassRepresentation;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueClassRepresentation;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoTypeTableUtilKt;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@SourceDebugExtension({"SMAP\nValueClassUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ValueClassUtil.kt\norg/jetbrains/kotlin/serialization/deserialization/ValueClassUtilKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,46:1\n1549#2:47\n1620#2,3:48\n1549#2:51\n1620#2,3:52\n1549#2:55\n1620#2,3:56\n*S KotlinDebug\n*F\n+ 1 ValueClassUtil.kt\norg/jetbrains/kotlin/serialization/deserialization/ValueClassUtilKt\n*L\n25#1:47\n25#1:48,3\n29#1:51\n29#1:52,3\n32#1:55\n32#1:56,3\n*E\n"})
public final class ValueClassUtilKt {
    @Nullable
    public static final ValueClassRepresentation loadValueClassRepresentation(@NotNull Class protoBuf$Class0, @NotNull NameResolver nameResolver0, @NotNull TypeTable typeTable0, @NotNull Function1 function10, @NotNull Function1 function11) {
        SimpleTypeMarker simpleTypeMarker0;
        List list2;
        Intrinsics.checkNotNullParameter(protoBuf$Class0, "<this>");
        Intrinsics.checkNotNullParameter(nameResolver0, "nameResolver");
        Intrinsics.checkNotNullParameter(typeTable0, "typeTable");
        Intrinsics.checkNotNullParameter(function10, "typeDeserializer");
        Intrinsics.checkNotNullParameter(function11, "typeOfPublicProperty");
        if(protoBuf$Class0.getMultiFieldValueClassUnderlyingNameCount() > 0) {
            List list0 = protoBuf$Class0.getMultiFieldValueClassUnderlyingNameList();
            Intrinsics.checkNotNullExpressionValue(list0, "multiFieldValueClassUnderlyingNameList");
            ArrayList arrayList0 = new ArrayList(l.collectionSizeOrDefault(list0, 10));
            for(Object object0: list0) {
                Intrinsics.checkNotNullExpressionValue(((Integer)object0), "it");
                arrayList0.add(NameResolverUtilKt.getName(nameResolver0, ((int)(((Integer)object0)))));
            }
            Pair pair0 = TuplesKt.to(protoBuf$Class0.getMultiFieldValueClassUnderlyingTypeIdCount(), protoBuf$Class0.getMultiFieldValueClassUnderlyingTypeCount());
            if(Intrinsics.areEqual(pair0, TuplesKt.to(arrayList0.size(), 0))) {
                List list1 = protoBuf$Class0.getMultiFieldValueClassUnderlyingTypeIdList();
                Intrinsics.checkNotNullExpressionValue(list1, "multiFieldValueClassUnderlyingTypeIdList");
                list2 = new ArrayList(l.collectionSizeOrDefault(list1, 10));
                for(Object object1: list1) {
                    Intrinsics.checkNotNullExpressionValue(((Integer)object1), "it");
                    list2.add(typeTable0.get(((int)(((Integer)object1)))));
                }
            }
            else if(Intrinsics.areEqual(pair0, TuplesKt.to(0, arrayList0.size()))) {
                list2 = protoBuf$Class0.getMultiFieldValueClassUnderlyingTypeList();
            }
            else {
                throw new IllegalStateException(("class " + NameResolverUtilKt.getName(nameResolver0, protoBuf$Class0.getFqName()) + " has illegal multi-field value class representation").toString());
            }
            Intrinsics.checkNotNullExpressionValue(list2, "when (typeIdCount to typ…epresentation\")\n        }");
            ArrayList arrayList1 = new ArrayList(l.collectionSizeOrDefault(list2, 10));
            for(Object object2: list2) {
                arrayList1.add(function10.invoke(object2));
            }
            return new MultiFieldValueClassRepresentation(CollectionsKt___CollectionsKt.zip(arrayList0, arrayList1));
        }
        if(protoBuf$Class0.hasInlineClassUnderlyingPropertyName()) {
            Name name0 = NameResolverUtilKt.getName(nameResolver0, protoBuf$Class0.getInlineClassUnderlyingPropertyName());
            Type protoBuf$Type0 = ProtoTypeTableUtilKt.inlineClassUnderlyingType(protoBuf$Class0, typeTable0);
            if(protoBuf$Type0 == null) {
            label_44:
                simpleTypeMarker0 = (SimpleTypeMarker)function11.invoke(name0);
                if(simpleTypeMarker0 == null) {
                    throw new IllegalStateException(("cannot determine underlying type for value class " + NameResolverUtilKt.getName(nameResolver0, protoBuf$Class0.getFqName()) + " with property " + name0).toString());
                }
            }
            else {
                simpleTypeMarker0 = (SimpleTypeMarker)function10.invoke(protoBuf$Type0);
                if(simpleTypeMarker0 == null) {
                    goto label_44;
                }
            }
            return new InlineClassRepresentation(name0, simpleTypeMarker0);
        }
        return null;
    }
}

