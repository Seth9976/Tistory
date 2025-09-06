package kotlin.reflect.jvm.internal.impl.load.kotlin;

import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.SpecialJvmAnnotations;
import kotlin.reflect.jvm.internal.impl.builtins.UnsignedTypes;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmProtoBufUtil;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.constants.KClassValue.Value.NormalClass;
import kotlin.reflect.jvm.internal.impl.resolve.constants.KClassValue;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotatedCallableKind;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationAndConstantLoader;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoContainer;
import kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNotNull;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public abstract class AbstractBinaryClassAnnotationAndConstantLoader extends AbstractBinaryClassAnnotationLoader implements AnnotationAndConstantLoader {
    public static final class AnnotationsContainerWithConstants extends AnnotationsContainer {
        public final Map a;
        public final Map b;
        public final Map c;

        public AnnotationsContainerWithConstants(@NotNull Map map0, @NotNull Map map1, @NotNull Map map2) {
            Intrinsics.checkNotNullParameter(map0, "memberAnnotations");
            Intrinsics.checkNotNullParameter(map1, "propertyConstants");
            Intrinsics.checkNotNullParameter(map2, "annotationParametersDefaultValues");
            super();
            this.a = map0;
            this.b = map1;
            this.c = map2;
        }

        @NotNull
        public final Map getAnnotationParametersDefaultValues() {
            return this.c;
        }

        @Override  // kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationLoader$AnnotationsContainer
        @NotNull
        public Map getMemberAnnotations() {
            return this.a;
        }

        @NotNull
        public final Map getPropertyConstants() {
            return this.b;
        }
    }

    public final MemoizedFunctionToNotNull b;

    public AbstractBinaryClassAnnotationAndConstantLoader(@NotNull StorageManager storageManager0, @NotNull KotlinClassFinder kotlinClassFinder0) {
        Intrinsics.checkNotNullParameter(storageManager0, "storageManager");
        Intrinsics.checkNotNullParameter(kotlinClassFinder0, "kotlinClassFinder");
        super(kotlinClassFinder0);
        this.b = storageManager0.createMemoizedFunction(new c(this));
    }

    public static final AnnotationsContainerWithConstants access$loadAnnotationsAndInitializers(AbstractBinaryClassAnnotationAndConstantLoader abstractBinaryClassAnnotationAndConstantLoader0, KotlinJvmBinaryClass kotlinJvmBinaryClass0) {
        abstractBinaryClassAnnotationAndConstantLoader0.getClass();
        HashMap hashMap0 = new HashMap();
        HashMap hashMap1 = new HashMap();
        HashMap hashMap2 = new HashMap();
        kotlinJvmBinaryClass0.visitMembers(new AbstractBinaryClassAnnotationAndConstantLoader.loadAnnotationsAndInitializers.1(abstractBinaryClassAnnotationAndConstantLoader0, hashMap0, kotlinJvmBinaryClass0, hashMap1), abstractBinaryClassAnnotationAndConstantLoader0.getCachedFileContent(kotlinJvmBinaryClass0));
        return new AnnotationsContainerWithConstants(hashMap0, hashMap1, hashMap2);
    }

    public final Object e(ProtoContainer protoContainer0, Property protoBuf$Property0, AnnotatedCallableKind annotatedCallableKind0, KotlinType kotlinType0, Function2 function20) {
        KotlinJvmBinaryClass kotlinJvmBinaryClass0 = this.findClassWithAnnotationsAndInitializers(protoContainer0, this.getSpecialCaseContainerClass(protoContainer0, true, true, Flags.IS_CONST.get(protoBuf$Property0.getFlags()), JvmProtoBufUtil.isMovedFromInterfaceCompanion(protoBuf$Property0)));
        if(kotlinJvmBinaryClass0 == null) {
            return null;
        }
        MemberSignature memberSignature0 = this.getCallableSignature(protoBuf$Property0, protoContainer0.getNameResolver(), protoContainer0.getTypeTable(), annotatedCallableKind0, kotlinJvmBinaryClass0.getClassHeader().getMetadataVersion().isAtLeast(DeserializedDescriptorResolver.Companion.getKOTLIN_1_3_RC_METADATA_VERSION$descriptors_jvm()));
        if(memberSignature0 == null) {
            return null;
        }
        Object object0 = function20.invoke(this.b.invoke(kotlinJvmBinaryClass0), memberSignature0);
        if(object0 == null) {
            return null;
        }
        return UnsignedTypes.isUnsignedType(kotlinType0) ? this.transformToUnsignedConstant(object0) : object0;
    }

    @NotNull
    public AnnotationsContainerWithConstants getAnnotationsContainer(@NotNull KotlinJvmBinaryClass kotlinJvmBinaryClass0) {
        Intrinsics.checkNotNullParameter(kotlinJvmBinaryClass0, "binaryClass");
        return (AnnotationsContainerWithConstants)this.b.invoke(kotlinJvmBinaryClass0);
    }

    @Override  // kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationLoader
    public AnnotationsContainer getAnnotationsContainer(KotlinJvmBinaryClass kotlinJvmBinaryClass0) {
        return this.getAnnotationsContainer(kotlinJvmBinaryClass0);
    }

    public final boolean isRepeatableWithImplicitContainer(@NotNull ClassId classId0, @NotNull Map map0) {
        Intrinsics.checkNotNullParameter(classId0, "annotationClassId");
        Intrinsics.checkNotNullParameter(map0, "arguments");
        if(!Intrinsics.areEqual(classId0, SpecialJvmAnnotations.INSTANCE.getJAVA_LANG_ANNOTATION_REPEATABLE())) {
            return false;
        }
        Object object0 = map0.get(Name.identifier("value"));
        NormalClass kClassValue$Value$NormalClass0 = null;
        KClassValue kClassValue0 = object0 instanceof KClassValue ? ((KClassValue)object0) : null;
        if(kClassValue0 == null) {
            return false;
        }
        Object object1 = kClassValue0.getValue();
        if(object1 instanceof NormalClass) {
            kClassValue$Value$NormalClass0 = (NormalClass)object1;
        }
        return kClassValue$Value$NormalClass0 == null ? false : this.isImplicitRepeatableContainer(kClassValue$Value$NormalClass0.getClassId());
    }

    @Override  // kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationAndConstantLoader
    @Nullable
    public Object loadAnnotationDefaultValue(@NotNull ProtoContainer protoContainer0, @NotNull Property protoBuf$Property0, @NotNull KotlinType kotlinType0) {
        Intrinsics.checkNotNullParameter(protoContainer0, "container");
        Intrinsics.checkNotNullParameter(protoBuf$Property0, "proto");
        Intrinsics.checkNotNullParameter(kotlinType0, "expectedType");
        return this.e(protoContainer0, protoBuf$Property0, AnnotatedCallableKind.PROPERTY_GETTER, kotlinType0, a.w);
    }

    @Nullable
    public abstract Object loadConstant(@NotNull String arg1, @NotNull Object arg2);

    @Override  // kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationAndConstantLoader
    @Nullable
    public Object loadPropertyConstant(@NotNull ProtoContainer protoContainer0, @NotNull Property protoBuf$Property0, @NotNull KotlinType kotlinType0) {
        Intrinsics.checkNotNullParameter(protoContainer0, "container");
        Intrinsics.checkNotNullParameter(protoBuf$Property0, "proto");
        Intrinsics.checkNotNullParameter(kotlinType0, "expectedType");
        return this.e(protoContainer0, protoBuf$Property0, AnnotatedCallableKind.PROPERTY, kotlinType0, b.w);
    }

    @Nullable
    public abstract Object transformToUnsignedConstant(@NotNull Object arg1);
}

