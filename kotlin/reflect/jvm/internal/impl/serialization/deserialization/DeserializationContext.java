package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.BinaryVersion;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.VersionRequirementTable;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.VersionSpecificBehaviorKt;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedContainerSource;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class DeserializationContext {
    public final DeserializationComponents a;
    public final NameResolver b;
    public final DeclarationDescriptor c;
    public final TypeTable d;
    public final VersionRequirementTable e;
    public final BinaryVersion f;
    public final DeserializedContainerSource g;
    public final TypeDeserializer h;
    public final MemberDeserializer i;

    public DeserializationContext(@NotNull DeserializationComponents deserializationComponents0, @NotNull NameResolver nameResolver0, @NotNull DeclarationDescriptor declarationDescriptor0, @NotNull TypeTable typeTable0, @NotNull VersionRequirementTable versionRequirementTable0, @NotNull BinaryVersion binaryVersion0, @Nullable DeserializedContainerSource deserializedContainerSource0, @Nullable TypeDeserializer typeDeserializer0, @NotNull List list0) {
        Intrinsics.checkNotNullParameter(deserializationComponents0, "components");
        String s1;
        Intrinsics.checkNotNullParameter(nameResolver0, "nameResolver");
        Intrinsics.checkNotNullParameter(declarationDescriptor0, "containingDeclaration");
        Intrinsics.checkNotNullParameter(typeTable0, "typeTable");
        Intrinsics.checkNotNullParameter(versionRequirementTable0, "versionRequirementTable");
        Intrinsics.checkNotNullParameter(binaryVersion0, "metadataVersion");
        Intrinsics.checkNotNullParameter(list0, "typeParameters");
        super();
        this.a = deserializationComponents0;
        this.b = nameResolver0;
        this.c = declarationDescriptor0;
        this.d = typeTable0;
        this.e = versionRequirementTable0;
        this.f = binaryVersion0;
        this.g = deserializedContainerSource0;
        String s = "Deserializer for \"" + declarationDescriptor0.getName() + '\"';
        if(deserializedContainerSource0 == null) {
            s1 = "[container not found]";
        }
        else {
            s1 = deserializedContainerSource0.getPresentableString();
            if(s1 == null) {
                s1 = "[container not found]";
            }
        }
        this.h = new TypeDeserializer(this, typeDeserializer0, list0, s, s1);
        this.i = new MemberDeserializer(this);
    }

    @NotNull
    public final DeserializationContext childContext(@NotNull DeclarationDescriptor declarationDescriptor0, @NotNull List list0, @NotNull NameResolver nameResolver0, @NotNull TypeTable typeTable0, @NotNull VersionRequirementTable versionRequirementTable0, @NotNull BinaryVersion binaryVersion0) {
        Intrinsics.checkNotNullParameter(declarationDescriptor0, "descriptor");
        Intrinsics.checkNotNullParameter(list0, "typeParameterProtos");
        Intrinsics.checkNotNullParameter(nameResolver0, "nameResolver");
        Intrinsics.checkNotNullParameter(typeTable0, "typeTable");
        Intrinsics.checkNotNullParameter(versionRequirementTable0, "versionRequirementTable");
        Intrinsics.checkNotNullParameter(binaryVersion0, "metadataVersion");
        return VersionSpecificBehaviorKt.isVersionRequirementTableWrittenCorrectly(binaryVersion0) ? new DeserializationContext(this.a, nameResolver0, declarationDescriptor0, typeTable0, versionRequirementTable0, binaryVersion0, this.g, this.h, list0) : new DeserializationContext(this.a, nameResolver0, declarationDescriptor0, typeTable0, this.e, binaryVersion0, this.g, this.h, list0);
    }

    public static DeserializationContext childContext$default(DeserializationContext deserializationContext0, DeclarationDescriptor declarationDescriptor0, List list0, NameResolver nameResolver0, TypeTable typeTable0, VersionRequirementTable versionRequirementTable0, BinaryVersion binaryVersion0, int v, Object object0) {
        if((v & 4) != 0) {
            nameResolver0 = deserializationContext0.b;
        }
        if((v & 8) != 0) {
            typeTable0 = deserializationContext0.d;
        }
        if((v & 16) != 0) {
            versionRequirementTable0 = deserializationContext0.e;
        }
        if((v & 0x20) != 0) {
            binaryVersion0 = deserializationContext0.f;
        }
        return deserializationContext0.childContext(declarationDescriptor0, list0, nameResolver0, typeTable0, versionRequirementTable0, binaryVersion0);
    }

    @NotNull
    public final DeserializationComponents getComponents() {
        return this.a;
    }

    @Nullable
    public final DeserializedContainerSource getContainerSource() {
        return this.g;
    }

    @NotNull
    public final DeclarationDescriptor getContainingDeclaration() {
        return this.c;
    }

    @NotNull
    public final MemberDeserializer getMemberDeserializer() {
        return this.i;
    }

    @NotNull
    public final NameResolver getNameResolver() {
        return this.b;
    }

    @NotNull
    public final StorageManager getStorageManager() {
        return this.a.getStorageManager();
    }

    @NotNull
    public final TypeDeserializer getTypeDeserializer() {
        return this.h;
    }

    @NotNull
    public final TypeTable getTypeTable() {
        return this.d;
    }

    @NotNull
    public final VersionRequirementTable getVersionRequirementTable() {
        return this.e;
    }
}

