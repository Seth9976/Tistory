package kotlin.reflect.jvm.internal.impl.metadata.deserialization;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Argument;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeAlias;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameter;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@SourceDebugExtension({"SMAP\nprotoTypeTableUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 protoTypeTableUtil.kt\norg/jetbrains/kotlin/metadata/deserialization/ProtoTypeTableUtilKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,125:1\n1#2:126\n1549#3:127\n1620#3,3:128\n1549#3:131\n1620#3,3:132\n1549#3:135\n1620#3,3:136\n1549#3:139\n1620#3,3:140\n1549#3:143\n1620#3,3:144\n*S KotlinDebug\n*F\n+ 1 protoTypeTableUtil.kt\norg/jetbrains/kotlin/metadata/deserialization/ProtoTypeTableUtilKt\n*L\n24#1:127\n24#1:128,3\n45#1:131\n45#1:132,3\n118#1:135\n118#1:136,3\n121#1:139\n121#1:140,3\n124#1:143\n124#1:144,3\n*E\n"})
public final class ProtoTypeTableUtilKt {
    @Nullable
    public static final Type abbreviatedType(@NotNull Type protoBuf$Type0, @NotNull TypeTable typeTable0) {
        Intrinsics.checkNotNullParameter(protoBuf$Type0, "<this>");
        Intrinsics.checkNotNullParameter(typeTable0, "typeTable");
        if(protoBuf$Type0.hasAbbreviatedType()) {
            return protoBuf$Type0.getAbbreviatedType();
        }
        return protoBuf$Type0.hasAbbreviatedTypeId() ? typeTable0.get(protoBuf$Type0.getAbbreviatedTypeId()) : null;
    }

    @NotNull
    public static final List contextReceiverTypes(@NotNull Class protoBuf$Class0, @NotNull TypeTable typeTable0) {
        Intrinsics.checkNotNullParameter(protoBuf$Class0, "<this>");
        Intrinsics.checkNotNullParameter(typeTable0, "typeTable");
        List list0 = protoBuf$Class0.getContextReceiverTypeList();
        if(list0.isEmpty()) {
            list0 = null;
        }
        if(list0 == null) {
            List list1 = protoBuf$Class0.getContextReceiverTypeIdList();
            Intrinsics.checkNotNullExpressionValue(list1, "contextReceiverTypeIdList");
            list0 = new ArrayList(l.collectionSizeOrDefault(list1, 10));
            for(Object object0: list1) {
                Intrinsics.checkNotNullExpressionValue(((Integer)object0), "it");
                list0.add(typeTable0.get(((int)(((Integer)object0)))));
            }
        }
        return list0;
    }

    @NotNull
    public static final List contextReceiverTypes(@NotNull Function protoBuf$Function0, @NotNull TypeTable typeTable0) {
        Intrinsics.checkNotNullParameter(protoBuf$Function0, "<this>");
        Intrinsics.checkNotNullParameter(typeTable0, "typeTable");
        List list0 = protoBuf$Function0.getContextReceiverTypeList();
        if(list0.isEmpty()) {
            list0 = null;
        }
        if(list0 == null) {
            List list1 = protoBuf$Function0.getContextReceiverTypeIdList();
            Intrinsics.checkNotNullExpressionValue(list1, "contextReceiverTypeIdList");
            list0 = new ArrayList(l.collectionSizeOrDefault(list1, 10));
            for(Object object0: list1) {
                Intrinsics.checkNotNullExpressionValue(((Integer)object0), "it");
                list0.add(typeTable0.get(((int)(((Integer)object0)))));
            }
        }
        return list0;
    }

    @NotNull
    public static final List contextReceiverTypes(@NotNull Property protoBuf$Property0, @NotNull TypeTable typeTable0) {
        Intrinsics.checkNotNullParameter(protoBuf$Property0, "<this>");
        Intrinsics.checkNotNullParameter(typeTable0, "typeTable");
        List list0 = protoBuf$Property0.getContextReceiverTypeList();
        if(list0.isEmpty()) {
            list0 = null;
        }
        if(list0 == null) {
            List list1 = protoBuf$Property0.getContextReceiverTypeIdList();
            Intrinsics.checkNotNullExpressionValue(list1, "contextReceiverTypeIdList");
            list0 = new ArrayList(l.collectionSizeOrDefault(list1, 10));
            for(Object object0: list1) {
                Intrinsics.checkNotNullExpressionValue(((Integer)object0), "it");
                list0.add(typeTable0.get(((int)(((Integer)object0)))));
            }
        }
        return list0;
    }

    @NotNull
    public static final Type expandedType(@NotNull TypeAlias protoBuf$TypeAlias0, @NotNull TypeTable typeTable0) {
        Intrinsics.checkNotNullParameter(protoBuf$TypeAlias0, "<this>");
        Intrinsics.checkNotNullParameter(typeTable0, "typeTable");
        if(protoBuf$TypeAlias0.hasExpandedType()) {
            Type protoBuf$Type0 = protoBuf$TypeAlias0.getExpandedType();
            Intrinsics.checkNotNullExpressionValue(protoBuf$Type0, "expandedType");
            return protoBuf$Type0;
        }
        if(!protoBuf$TypeAlias0.hasExpandedTypeId()) {
            throw new IllegalStateException("No expandedType in ProtoBuf.TypeAlias");
        }
        return typeTable0.get(protoBuf$TypeAlias0.getExpandedTypeId());
    }

    @Nullable
    public static final Type flexibleUpperBound(@NotNull Type protoBuf$Type0, @NotNull TypeTable typeTable0) {
        Intrinsics.checkNotNullParameter(protoBuf$Type0, "<this>");
        Intrinsics.checkNotNullParameter(typeTable0, "typeTable");
        if(protoBuf$Type0.hasFlexibleUpperBound()) {
            return protoBuf$Type0.getFlexibleUpperBound();
        }
        return protoBuf$Type0.hasFlexibleUpperBoundId() ? typeTable0.get(protoBuf$Type0.getFlexibleUpperBoundId()) : null;
    }

    public static final boolean hasReceiver(@NotNull Function protoBuf$Function0) {
        Intrinsics.checkNotNullParameter(protoBuf$Function0, "<this>");
        return protoBuf$Function0.hasReceiverType() || protoBuf$Function0.hasReceiverTypeId();
    }

    public static final boolean hasReceiver(@NotNull Property protoBuf$Property0) {
        Intrinsics.checkNotNullParameter(protoBuf$Property0, "<this>");
        return protoBuf$Property0.hasReceiverType() || protoBuf$Property0.hasReceiverTypeId();
    }

    @Nullable
    public static final Type inlineClassUnderlyingType(@NotNull Class protoBuf$Class0, @NotNull TypeTable typeTable0) {
        Intrinsics.checkNotNullParameter(protoBuf$Class0, "<this>");
        Intrinsics.checkNotNullParameter(typeTable0, "typeTable");
        if(protoBuf$Class0.hasInlineClassUnderlyingType()) {
            return protoBuf$Class0.getInlineClassUnderlyingType();
        }
        return protoBuf$Class0.hasInlineClassUnderlyingTypeId() ? typeTable0.get(protoBuf$Class0.getInlineClassUnderlyingTypeId()) : null;
    }

    @Nullable
    public static final Type outerType(@NotNull Type protoBuf$Type0, @NotNull TypeTable typeTable0) {
        Intrinsics.checkNotNullParameter(protoBuf$Type0, "<this>");
        Intrinsics.checkNotNullParameter(typeTable0, "typeTable");
        if(protoBuf$Type0.hasOuterType()) {
            return protoBuf$Type0.getOuterType();
        }
        return protoBuf$Type0.hasOuterTypeId() ? typeTable0.get(protoBuf$Type0.getOuterTypeId()) : null;
    }

    @Nullable
    public static final Type receiverType(@NotNull Function protoBuf$Function0, @NotNull TypeTable typeTable0) {
        Intrinsics.checkNotNullParameter(protoBuf$Function0, "<this>");
        Intrinsics.checkNotNullParameter(typeTable0, "typeTable");
        if(protoBuf$Function0.hasReceiverType()) {
            return protoBuf$Function0.getReceiverType();
        }
        return protoBuf$Function0.hasReceiverTypeId() ? typeTable0.get(protoBuf$Function0.getReceiverTypeId()) : null;
    }

    @Nullable
    public static final Type receiverType(@NotNull Property protoBuf$Property0, @NotNull TypeTable typeTable0) {
        Intrinsics.checkNotNullParameter(protoBuf$Property0, "<this>");
        Intrinsics.checkNotNullParameter(typeTable0, "typeTable");
        if(protoBuf$Property0.hasReceiverType()) {
            return protoBuf$Property0.getReceiverType();
        }
        return protoBuf$Property0.hasReceiverTypeId() ? typeTable0.get(protoBuf$Property0.getReceiverTypeId()) : null;
    }

    @NotNull
    public static final Type returnType(@NotNull Function protoBuf$Function0, @NotNull TypeTable typeTable0) {
        Intrinsics.checkNotNullParameter(protoBuf$Function0, "<this>");
        Intrinsics.checkNotNullParameter(typeTable0, "typeTable");
        if(protoBuf$Function0.hasReturnType()) {
            Type protoBuf$Type0 = protoBuf$Function0.getReturnType();
            Intrinsics.checkNotNullExpressionValue(protoBuf$Type0, "returnType");
            return protoBuf$Type0;
        }
        if(!protoBuf$Function0.hasReturnTypeId()) {
            throw new IllegalStateException("No returnType in ProtoBuf.Function");
        }
        return typeTable0.get(protoBuf$Function0.getReturnTypeId());
    }

    @NotNull
    public static final Type returnType(@NotNull Property protoBuf$Property0, @NotNull TypeTable typeTable0) {
        Intrinsics.checkNotNullParameter(protoBuf$Property0, "<this>");
        Intrinsics.checkNotNullParameter(typeTable0, "typeTable");
        if(protoBuf$Property0.hasReturnType()) {
            Type protoBuf$Type0 = protoBuf$Property0.getReturnType();
            Intrinsics.checkNotNullExpressionValue(protoBuf$Type0, "returnType");
            return protoBuf$Type0;
        }
        if(!protoBuf$Property0.hasReturnTypeId()) {
            throw new IllegalStateException("No returnType in ProtoBuf.Property");
        }
        return typeTable0.get(protoBuf$Property0.getReturnTypeId());
    }

    @NotNull
    public static final List supertypes(@NotNull Class protoBuf$Class0, @NotNull TypeTable typeTable0) {
        Intrinsics.checkNotNullParameter(protoBuf$Class0, "<this>");
        Intrinsics.checkNotNullParameter(typeTable0, "typeTable");
        List list0 = protoBuf$Class0.getSupertypeList();
        if(list0.isEmpty()) {
            list0 = null;
        }
        if(list0 == null) {
            List list1 = protoBuf$Class0.getSupertypeIdList();
            Intrinsics.checkNotNullExpressionValue(list1, "supertypeIdList");
            list0 = new ArrayList(l.collectionSizeOrDefault(list1, 10));
            for(Object object0: list1) {
                Intrinsics.checkNotNullExpressionValue(((Integer)object0), "it");
                list0.add(typeTable0.get(((int)(((Integer)object0)))));
            }
        }
        return list0;
    }

    @Nullable
    public static final Type type(@NotNull Argument protoBuf$Type$Argument0, @NotNull TypeTable typeTable0) {
        Intrinsics.checkNotNullParameter(protoBuf$Type$Argument0, "<this>");
        Intrinsics.checkNotNullParameter(typeTable0, "typeTable");
        if(protoBuf$Type$Argument0.hasType()) {
            return protoBuf$Type$Argument0.getType();
        }
        return protoBuf$Type$Argument0.hasTypeId() ? typeTable0.get(protoBuf$Type$Argument0.getTypeId()) : null;
    }

    @NotNull
    public static final Type type(@NotNull ValueParameter protoBuf$ValueParameter0, @NotNull TypeTable typeTable0) {
        Intrinsics.checkNotNullParameter(protoBuf$ValueParameter0, "<this>");
        Intrinsics.checkNotNullParameter(typeTable0, "typeTable");
        if(protoBuf$ValueParameter0.hasType()) {
            Type protoBuf$Type0 = protoBuf$ValueParameter0.getType();
            Intrinsics.checkNotNullExpressionValue(protoBuf$Type0, "type");
            return protoBuf$Type0;
        }
        if(!protoBuf$ValueParameter0.hasTypeId()) {
            throw new IllegalStateException("No type in ProtoBuf.ValueParameter");
        }
        return typeTable0.get(protoBuf$ValueParameter0.getTypeId());
    }

    @NotNull
    public static final Type underlyingType(@NotNull TypeAlias protoBuf$TypeAlias0, @NotNull TypeTable typeTable0) {
        Intrinsics.checkNotNullParameter(protoBuf$TypeAlias0, "<this>");
        Intrinsics.checkNotNullParameter(typeTable0, "typeTable");
        if(protoBuf$TypeAlias0.hasUnderlyingType()) {
            Type protoBuf$Type0 = protoBuf$TypeAlias0.getUnderlyingType();
            Intrinsics.checkNotNullExpressionValue(protoBuf$Type0, "underlyingType");
            return protoBuf$Type0;
        }
        if(!protoBuf$TypeAlias0.hasUnderlyingTypeId()) {
            throw new IllegalStateException("No underlyingType in ProtoBuf.TypeAlias");
        }
        return typeTable0.get(protoBuf$TypeAlias0.getUnderlyingTypeId());
    }

    @NotNull
    public static final List upperBounds(@NotNull TypeParameter protoBuf$TypeParameter0, @NotNull TypeTable typeTable0) {
        Intrinsics.checkNotNullParameter(protoBuf$TypeParameter0, "<this>");
        Intrinsics.checkNotNullParameter(typeTable0, "typeTable");
        List list0 = protoBuf$TypeParameter0.getUpperBoundList();
        if(list0.isEmpty()) {
            list0 = null;
        }
        if(list0 == null) {
            List list1 = protoBuf$TypeParameter0.getUpperBoundIdList();
            Intrinsics.checkNotNullExpressionValue(list1, "upperBoundIdList");
            list0 = new ArrayList(l.collectionSizeOrDefault(list1, 10));
            for(Object object0: list1) {
                Intrinsics.checkNotNullExpressionValue(((Integer)object0), "it");
                list0.add(typeTable0.get(((int)(((Integer)object0)))));
            }
        }
        return list0;
    }

    @Nullable
    public static final Type varargElementType(@NotNull ValueParameter protoBuf$ValueParameter0, @NotNull TypeTable typeTable0) {
        Intrinsics.checkNotNullParameter(protoBuf$ValueParameter0, "<this>");
        Intrinsics.checkNotNullParameter(typeTable0, "typeTable");
        if(protoBuf$ValueParameter0.hasVarargElementType()) {
            return protoBuf$ValueParameter0.getVarargElementType();
        }
        return protoBuf$ValueParameter0.hasVarargElementTypeId() ? typeTable0.get(protoBuf$ValueParameter0.getVarargElementTypeId()) : null;
    }
}

