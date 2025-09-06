package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.BinaryVersion;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class ClassData {
    public final NameResolver a;
    public final Class b;
    public final BinaryVersion c;
    public final SourceElement d;

    public ClassData(@NotNull NameResolver nameResolver0, @NotNull Class protoBuf$Class0, @NotNull BinaryVersion binaryVersion0, @NotNull SourceElement sourceElement0) {
        Intrinsics.checkNotNullParameter(nameResolver0, "nameResolver");
        Intrinsics.checkNotNullParameter(protoBuf$Class0, "classProto");
        Intrinsics.checkNotNullParameter(binaryVersion0, "metadataVersion");
        Intrinsics.checkNotNullParameter(sourceElement0, "sourceElement");
        super();
        this.a = nameResolver0;
        this.b = protoBuf$Class0;
        this.c = binaryVersion0;
        this.d = sourceElement0;
    }

    @NotNull
    public final NameResolver component1() {
        return this.a;
    }

    @NotNull
    public final Class component2() {
        return this.b;
    }

    @NotNull
    public final BinaryVersion component3() {
        return this.c;
    }

    @NotNull
    public final SourceElement component4() {
        return this.d;
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof ClassData)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.a, ((ClassData)object0).a)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.b, ((ClassData)object0).b)) {
            return false;
        }
        return Intrinsics.areEqual(this.c, ((ClassData)object0).c) ? Intrinsics.areEqual(this.d, ((ClassData)object0).d) : false;
    }

    @Override
    public int hashCode() {
        return this.d.hashCode() + (this.c.hashCode() + (this.b.hashCode() + this.a.hashCode() * 0x1F) * 0x1F) * 0x1F;
    }

    @Override
    @NotNull
    public String toString() {
        return "ClassData(nameResolver=" + this.a + ", classProto=" + this.b + ", metadataVersion=" + this.c + ", sourceElement=" + this.d + ')';
    }
}

