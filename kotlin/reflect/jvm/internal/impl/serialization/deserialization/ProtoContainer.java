package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class.Kind;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public abstract class ProtoContainer {
    public static final class Class extends ProtoContainer {
        public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class d;
        public final Class e;
        public final ClassId f;
        public final Kind g;
        public final boolean h;

        public Class(@NotNull kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class protoBuf$Class0, @NotNull NameResolver nameResolver0, @NotNull TypeTable typeTable0, @Nullable SourceElement sourceElement0, @Nullable Class protoContainer$Class0) {
            Intrinsics.checkNotNullParameter(protoBuf$Class0, "classProto");
            Intrinsics.checkNotNullParameter(nameResolver0, "nameResolver");
            Intrinsics.checkNotNullParameter(typeTable0, "typeTable");
            super(nameResolver0, typeTable0, sourceElement0, null);
            this.d = protoBuf$Class0;
            this.e = protoContainer$Class0;
            this.f = NameResolverUtilKt.getClassId(nameResolver0, protoBuf$Class0.getFqName());
            Kind protoBuf$Class$Kind0 = (Kind)Flags.CLASS_KIND.get(protoBuf$Class0.getFlags());
            if(protoBuf$Class$Kind0 == null) {
                protoBuf$Class$Kind0 = Kind.CLASS;
            }
            this.g = protoBuf$Class$Kind0;
            Boolean boolean0 = Flags.IS_INNER.get(protoBuf$Class0.getFlags());
            Intrinsics.checkNotNullExpressionValue(boolean0, "IS_INNER.get(classProto.flags)");
            this.h = boolean0.booleanValue();
        }

        @Override  // kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoContainer
        @NotNull
        public FqName debugFqName() {
            FqName fqName0 = this.f.asSingleFqName();
            Intrinsics.checkNotNullExpressionValue(fqName0, "classId.asSingleFqName()");
            return fqName0;
        }

        @NotNull
        public final ClassId getClassId() {
            return this.f;
        }

        @NotNull
        public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class getClassProto() {
            return this.d;
        }

        @NotNull
        public final Kind getKind() {
            return this.g;
        }

        @Nullable
        public final Class getOuterClass() {
            return this.e;
        }

        public final boolean isInner() {
            return this.h;
        }
    }

    public static final class Package extends ProtoContainer {
        public final FqName d;

        public Package(@NotNull FqName fqName0, @NotNull NameResolver nameResolver0, @NotNull TypeTable typeTable0, @Nullable SourceElement sourceElement0) {
            Intrinsics.checkNotNullParameter(fqName0, "fqName");
            Intrinsics.checkNotNullParameter(nameResolver0, "nameResolver");
            Intrinsics.checkNotNullParameter(typeTable0, "typeTable");
            super(nameResolver0, typeTable0, sourceElement0, null);
            this.d = fqName0;
        }

        @Override  // kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoContainer
        @NotNull
        public FqName debugFqName() {
            return this.d;
        }
    }

    public final NameResolver a;
    public final TypeTable b;
    public final SourceElement c;

    public ProtoContainer(NameResolver nameResolver0, TypeTable typeTable0, SourceElement sourceElement0, DefaultConstructorMarker defaultConstructorMarker0) {
        this.a = nameResolver0;
        this.b = typeTable0;
        this.c = sourceElement0;
    }

    @NotNull
    public abstract FqName debugFqName();

    @NotNull
    public final NameResolver getNameResolver() {
        return this.a;
    }

    @Nullable
    public final SourceElement getSource() {
        return this.c;
    }

    @NotNull
    public final TypeTable getTypeTable() {
        return this.b;
    }

    @Override
    @NotNull
    public String toString() {
        return this.getClass().getSimpleName() + ": " + this.debugFqName();
    }
}

