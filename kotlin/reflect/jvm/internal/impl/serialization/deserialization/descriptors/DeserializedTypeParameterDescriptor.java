package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.k;
import kotlin.collections.l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.SupertypeLoopChecker.EMPTY;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractLazyTypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter.Variance;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoTypeTableUtilKt;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationContext;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.NameResolverUtilKt;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoEnumFlags;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.TypeDeserializer;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import org.jetbrains.annotations.NotNull;

@SourceDebugExtension({"SMAP\nDeserializedTypeParameterDescriptor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeserializedTypeParameterDescriptor.kt\norg/jetbrains/kotlin/serialization/deserialization/descriptors/DeserializedTypeParameterDescriptor\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,58:1\n1549#2:59\n1620#2,3:60\n*S KotlinDebug\n*F\n+ 1 DeserializedTypeParameterDescriptor.kt\norg/jetbrains/kotlin/serialization/deserialization/descriptors/DeserializedTypeParameterDescriptor\n*L\n51#1:59\n51#1:60,3\n*E\n"})
public final class DeserializedTypeParameterDescriptor extends AbstractLazyTypeParameterDescriptor {
    public final DeserializationContext k;
    public final TypeParameter l;
    public final DeserializedAnnotations m;

    public DeserializedTypeParameterDescriptor(@NotNull DeserializationContext deserializationContext0, @NotNull TypeParameter protoBuf$TypeParameter0, int v) {
        Intrinsics.checkNotNullParameter(deserializationContext0, "c");
        Intrinsics.checkNotNullParameter(protoBuf$TypeParameter0, "proto");
        StorageManager storageManager0 = deserializationContext0.getStorageManager();
        Name name0 = NameResolverUtilKt.getName(deserializationContext0.getNameResolver(), protoBuf$TypeParameter0.getName());
        Variance protoBuf$TypeParameter$Variance0 = protoBuf$TypeParameter0.getVariance();
        Intrinsics.checkNotNullExpressionValue(protoBuf$TypeParameter$Variance0, "proto.variance");
        kotlin.reflect.jvm.internal.impl.types.Variance variance0 = ProtoEnumFlags.INSTANCE.variance(protoBuf$TypeParameter$Variance0);
        super(storageManager0, deserializationContext0.getContainingDeclaration(), Annotations.Companion.getEMPTY(), name0, variance0, protoBuf$TypeParameter0.getReified(), v, SourceElement.NO_SOURCE, EMPTY.INSTANCE);
        this.k = deserializationContext0;
        this.l = protoBuf$TypeParameter0;
        this.m = new DeserializedAnnotations(deserializationContext0.getStorageManager(), new w(this));
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotatedImpl, kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotated
    public Annotations getAnnotations() {
        return this.getAnnotations();
    }

    @NotNull
    public DeserializedAnnotations getAnnotations() {
        return this.m;
    }

    @NotNull
    public final TypeParameter getProto() {
        return this.l;
    }

    @NotNull
    public Void reportSupertypeLoopError(@NotNull KotlinType kotlinType0) {
        Intrinsics.checkNotNullParameter(kotlinType0, "type");
        throw new IllegalStateException("There should be no cycles for deserialized type parameters, but found for: " + this);
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractTypeParameterDescriptor
    public void reportSupertypeLoopError(KotlinType kotlinType0) {
        this.reportSupertypeLoopError(kotlinType0);
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractTypeParameterDescriptor
    @NotNull
    public List resolveUpperBounds() {
        DeserializationContext deserializationContext0 = this.k;
        List list0 = ProtoTypeTableUtilKt.upperBounds(this.l, deserializationContext0.getTypeTable());
        if(list0.isEmpty()) {
            return k.listOf(DescriptorUtilsKt.getBuiltIns(this).getDefaultBound());
        }
        TypeDeserializer typeDeserializer0 = deserializationContext0.getTypeDeserializer();
        List list1 = new ArrayList(l.collectionSizeOrDefault(list0, 10));
        for(Object object0: list0) {
            list1.add(typeDeserializer0.type(((Type)object0)));
        }
        return list1;
    }
}

