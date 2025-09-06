package kotlin.reflect.jvm.internal.impl.load.kotlin;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.SpecialJvmAnnotations;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class.Kind;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Constructor;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.EnumEntry;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameter;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoBufUtilKt;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoTypeTableUtilKt;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.JvmMethodSignature;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.JvmPropertySignature;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.ClassMapperLite;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMemberSignature.Method;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMetadataVersion;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmProtoBufUtil;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage;
import kotlin.reflect.jvm.internal.impl.protobuf.MessageLite;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmClassName;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotatedCallableKind;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationLoader;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoContainer.Class;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoContainer.Package;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoContainer;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.p;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@SourceDebugExtension({"SMAP\nAbstractBinaryClassAnnotationLoader.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbstractBinaryClassAnnotationLoader.kt\norg/jetbrains/kotlin/load/kotlin/AbstractBinaryClassAnnotationLoader\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,329:1\n1549#2:330\n1620#2,3:331\n1549#2:334\n1620#2,3:335\n1#3:338\n*S KotlinDebug\n*F\n+ 1 AbstractBinaryClassAnnotationLoader.kt\norg/jetbrains/kotlin/load/kotlin/AbstractBinaryClassAnnotationLoader\n*L\n196#1:330\n196#1:331,3\n200#1:334\n200#1:335,3\n*E\n"})
public abstract class AbstractBinaryClassAnnotationLoader implements AnnotationLoader {
    public static abstract class AnnotationsContainer {
        @NotNull
        public abstract Map getMemberAnnotations();
    }

    public final class WhenMappings {
        public static final int[] $EnumSwitchMapping$0;

        static {
            int[] arr_v = new int[AnnotatedCallableKind.values().length];
            try {
                arr_v[AnnotatedCallableKind.PROPERTY_GETTER.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[AnnotatedCallableKind.PROPERTY_SETTER.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[AnnotatedCallableKind.PROPERTY.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            WhenMappings.$EnumSwitchMapping$0 = arr_v;
        }
    }

    public final KotlinClassFinder a;

    public AbstractBinaryClassAnnotationLoader(@NotNull KotlinClassFinder kotlinClassFinder0) {
        Intrinsics.checkNotNullParameter(kotlinClassFinder0, "kotlinClassFinder");
        super();
        this.a = kotlinClassFinder0;
    }

    public final List a(ProtoContainer protoContainer0, MemberSignature memberSignature0, boolean z, boolean z1, Boolean boolean0, boolean z2) {
        KotlinJvmBinaryClass kotlinJvmBinaryClass0 = this.findClassWithAnnotationsAndInitializers(protoContainer0, this.getSpecialCaseContainerClass(protoContainer0, z, z1, boolean0, z2));
        if(kotlinJvmBinaryClass0 == null) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        List list0 = (List)this.getAnnotationsContainer(kotlinJvmBinaryClass0).getMemberAnnotations().get(memberSignature0);
        return list0 == null ? CollectionsKt__CollectionsKt.emptyList() : list0;
    }

    public static List b(AbstractBinaryClassAnnotationLoader abstractBinaryClassAnnotationLoader0, ProtoContainer protoContainer0, MemberSignature memberSignature0, boolean z, Boolean boolean0, boolean z1, int v) {
        boolean z2 = (v & 4) == 0 ? z : false;
        if((v & 16) != 0) {
            boolean0 = null;
        }
        return (v & 0x20) == 0 ? abstractBinaryClassAnnotationLoader0.a(protoContainer0, memberSignature0, z2, false, boolean0, z1) : abstractBinaryClassAnnotationLoader0.a(protoContainer0, memberSignature0, z2, false, boolean0, false);
    }

    public final List c(ProtoContainer protoContainer0, Property protoBuf$Property0, int v) {
        Boolean boolean0 = Flags.IS_CONST.get(protoBuf$Property0.getFlags());
        Intrinsics.checkNotNullExpressionValue(boolean0, "IS_CONST.get(proto.flags)");
        boolean0.getClass();
        boolean z = JvmProtoBufUtil.isMovedFromInterfaceCompanion(protoBuf$Property0);
        boolean z1 = true;
        if(v == 1) {
            MemberSignature memberSignature0 = AbstractBinaryClassAnnotationLoaderKt.getPropertySignature$default(protoBuf$Property0, protoContainer0.getNameResolver(), protoContainer0.getTypeTable(), false, true, false, 40, null);
            return memberSignature0 == null ? CollectionsKt__CollectionsKt.emptyList() : AbstractBinaryClassAnnotationLoader.b(this, protoContainer0, memberSignature0, true, boolean0, z, 8);
        }
        MemberSignature memberSignature1 = AbstractBinaryClassAnnotationLoaderKt.getPropertySignature$default(protoBuf$Property0, protoContainer0.getNameResolver(), protoContainer0.getTypeTable(), true, false, false, 0x30, null);
        if(memberSignature1 == null) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        boolean z2 = StringsKt__StringsKt.contains$default(memberSignature1.getSignature(), "$delegate", false, 2, null);
        if(v != 3) {
            z1 = false;
        }
        return z2 == z1 ? this.a(protoContainer0, memberSignature1, true, true, boolean0, z) : CollectionsKt__CollectionsKt.emptyList();
    }

    public static KotlinJvmBinaryClass d(Class protoContainer$Class0) {
        SourceElement sourceElement0 = protoContainer$Class0.getSource();
        KotlinJvmBinarySourceElement kotlinJvmBinarySourceElement0 = sourceElement0 instanceof KotlinJvmBinarySourceElement ? ((KotlinJvmBinarySourceElement)sourceElement0) : null;
        return kotlinJvmBinarySourceElement0 == null ? null : kotlinJvmBinarySourceElement0.getBinaryClass();
    }

    @Nullable
    public final KotlinJvmBinaryClass findClassWithAnnotationsAndInitializers(@NotNull ProtoContainer protoContainer0, @Nullable KotlinJvmBinaryClass kotlinJvmBinaryClass0) {
        Intrinsics.checkNotNullParameter(protoContainer0, "container");
        if(kotlinJvmBinaryClass0 == null) {
            return protoContainer0 instanceof Class ? AbstractBinaryClassAnnotationLoader.d(((Class)protoContainer0)) : null;
        }
        return kotlinJvmBinaryClass0;
    }

    @NotNull
    public abstract AnnotationsContainer getAnnotationsContainer(@NotNull KotlinJvmBinaryClass arg1);

    @Nullable
    public byte[] getCachedFileContent(@NotNull KotlinJvmBinaryClass kotlinJvmBinaryClass0) {
        Intrinsics.checkNotNullParameter(kotlinJvmBinaryClass0, "kotlinClass");
        return null;
    }

    @Nullable
    public final MemberSignature getCallableSignature(@NotNull MessageLite messageLite0, @NotNull NameResolver nameResolver0, @NotNull TypeTable typeTable0, @NotNull AnnotatedCallableKind annotatedCallableKind0, boolean z) {
        Intrinsics.checkNotNullParameter(messageLite0, "proto");
        Intrinsics.checkNotNullParameter(nameResolver0, "nameResolver");
        Intrinsics.checkNotNullParameter(typeTable0, "typeTable");
        Intrinsics.checkNotNullParameter(annotatedCallableKind0, "kind");
        if(messageLite0 instanceof Constructor) {
            Method jvmMemberSignature$Method0 = JvmProtoBufUtil.INSTANCE.getJvmConstructorSignature(((Constructor)messageLite0), nameResolver0, typeTable0);
            return jvmMemberSignature$Method0 == null ? null : MemberSignature.Companion.fromJvmMemberSignature(jvmMemberSignature$Method0);
        }
        if(messageLite0 instanceof Function) {
            Method jvmMemberSignature$Method1 = JvmProtoBufUtil.INSTANCE.getJvmMethodSignature(((Function)messageLite0), nameResolver0, typeTable0);
            return jvmMemberSignature$Method1 == null ? null : MemberSignature.Companion.fromJvmMemberSignature(jvmMemberSignature$Method1);
        }
        if(messageLite0 instanceof Property) {
            Intrinsics.checkNotNullExpressionValue(JvmProtoBuf.propertySignature, "propertySignature");
            JvmPropertySignature jvmProtoBuf$JvmPropertySignature0 = (JvmPropertySignature)ProtoBufUtilKt.getExtensionOrNull(((ExtendableMessage)messageLite0), JvmProtoBuf.propertySignature);
            if(jvmProtoBuf$JvmPropertySignature0 == null) {
                return null;
            }
            switch(WhenMappings.$EnumSwitchMapping$0[annotatedCallableKind0.ordinal()]) {
                case 1: {
                    if(jvmProtoBuf$JvmPropertySignature0.hasGetter()) {
                        JvmMethodSignature jvmProtoBuf$JvmMethodSignature0 = jvmProtoBuf$JvmPropertySignature0.getGetter();
                        Intrinsics.checkNotNullExpressionValue(jvmProtoBuf$JvmMethodSignature0, "signature.getter");
                        return MemberSignature.Companion.fromMethod(nameResolver0, jvmProtoBuf$JvmMethodSignature0);
                    }
                    break;
                }
                case 2: {
                    if(jvmProtoBuf$JvmPropertySignature0.hasSetter()) {
                        JvmMethodSignature jvmProtoBuf$JvmMethodSignature1 = jvmProtoBuf$JvmPropertySignature0.getSetter();
                        Intrinsics.checkNotNullExpressionValue(jvmProtoBuf$JvmMethodSignature1, "signature.setter");
                        return MemberSignature.Companion.fromMethod(nameResolver0, jvmProtoBuf$JvmMethodSignature1);
                    }
                    break;
                }
                case 3: {
                    return AbstractBinaryClassAnnotationLoaderKt.getPropertySignature(((Property)messageLite0), nameResolver0, typeTable0, true, true, z);
                }
                default: {
                    return null;
                }
            }
        }
        return null;
    }

    public static MemberSignature getCallableSignature$default(AbstractBinaryClassAnnotationLoader abstractBinaryClassAnnotationLoader0, MessageLite messageLite0, NameResolver nameResolver0, TypeTable typeTable0, AnnotatedCallableKind annotatedCallableKind0, boolean z, int v, Object object0) {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getCallableSignature");
        }
        if((v & 16) != 0) {
            z = false;
        }
        return abstractBinaryClassAnnotationLoader0.getCallableSignature(messageLite0, nameResolver0, typeTable0, annotatedCallableKind0, z);
    }

    @NotNull
    public abstract JvmMetadataVersion getJvmMetadataVersion();

    @Nullable
    public final KotlinJvmBinaryClass getSpecialCaseContainerClass(@NotNull ProtoContainer protoContainer0, boolean z, boolean z1, @Nullable Boolean boolean0, boolean z2) {
        Intrinsics.checkNotNullParameter(protoContainer0, "container");
        KotlinClassFinder kotlinClassFinder0 = this.a;
        if(z) {
            if(boolean0 == null) {
                throw new IllegalStateException(("isConst should not be null for property (container=" + protoContainer0 + ')').toString());
            }
            if(protoContainer0 instanceof Class && ((Class)protoContainer0).getKind() == Kind.INTERFACE) {
                ClassId classId0 = ((Class)protoContainer0).getClassId().createNestedClassId(Name.identifier("DefaultImpls"));
                Intrinsics.checkNotNullExpressionValue(classId0, "container.classId.create…EFAULT_IMPLS_CLASS_NAME))");
                return KotlinClassFinderKt.findKotlinClass(kotlinClassFinder0, classId0, this.getJvmMetadataVersion());
            }
            if(boolean0.booleanValue() && protoContainer0 instanceof Package) {
                SourceElement sourceElement0 = protoContainer0.getSource();
                JvmPackagePartSource jvmPackagePartSource0 = sourceElement0 instanceof JvmPackagePartSource ? ((JvmPackagePartSource)sourceElement0) : null;
                JvmClassName jvmClassName0 = jvmPackagePartSource0 == null ? null : jvmPackagePartSource0.getFacadeClassName();
                if(jvmClassName0 != null) {
                    String s = jvmClassName0.getInternalName();
                    Intrinsics.checkNotNullExpressionValue(s, "facadeClassName.internalName");
                    ClassId classId1 = ClassId.topLevel(new FqName(p.replace$default(s, '/', '.', false, 4, null)));
                    Intrinsics.checkNotNullExpressionValue(classId1, "topLevel(FqName(facadeCl…lName.replace(\'/\', \'.\')))");
                    return KotlinClassFinderKt.findKotlinClass(kotlinClassFinder0, classId1, this.getJvmMetadataVersion());
                }
            }
        }
        if(z1 && protoContainer0 instanceof Class && ((Class)protoContainer0).getKind() == Kind.COMPANION_OBJECT) {
            Class protoContainer$Class0 = ((Class)protoContainer0).getOuterClass();
            if(protoContainer$Class0 != null && (protoContainer$Class0.getKind() == Kind.CLASS || protoContainer$Class0.getKind() == Kind.ENUM_CLASS || z2 && (protoContainer$Class0.getKind() == Kind.INTERFACE || protoContainer$Class0.getKind() == Kind.ANNOTATION_CLASS))) {
                return AbstractBinaryClassAnnotationLoader.d(protoContainer$Class0);
            }
        }
        if(protoContainer0 instanceof Package && protoContainer0.getSource() instanceof JvmPackagePartSource) {
            SourceElement sourceElement1 = protoContainer0.getSource();
            Intrinsics.checkNotNull(sourceElement1, "null cannot be cast to non-null type org.jetbrains.kotlin.load.kotlin.JvmPackagePartSource");
            KotlinJvmBinaryClass kotlinJvmBinaryClass0 = ((JvmPackagePartSource)sourceElement1).getKnownJvmBinaryClass();
            return kotlinJvmBinaryClass0 == null ? KotlinClassFinderKt.findKotlinClass(kotlinClassFinder0, ((JvmPackagePartSource)sourceElement1).getClassId(), this.getJvmMetadataVersion()) : kotlinJvmBinaryClass0;
        }
        return null;
    }

    public final boolean isImplicitRepeatableContainer(@NotNull ClassId classId0) {
        Intrinsics.checkNotNullParameter(classId0, "classId");
        if(classId0.getOuterClassId() != null && Intrinsics.areEqual(classId0.getShortClassName().asString(), "Container")) {
            JvmMetadataVersion jvmMetadataVersion0 = this.getJvmMetadataVersion();
            KotlinJvmBinaryClass kotlinJvmBinaryClass0 = KotlinClassFinderKt.findKotlinClass(this.a, classId0, jvmMetadataVersion0);
            return kotlinJvmBinaryClass0 != null && SpecialJvmAnnotations.INSTANCE.isAnnotatedWithContainerMetaAnnotation(kotlinJvmBinaryClass0);
        }
        return false;
    }

    @Nullable
    public abstract AnnotationArgumentVisitor loadAnnotation(@NotNull ClassId arg1, @NotNull SourceElement arg2, @NotNull List arg3);

    @Nullable
    public final AnnotationArgumentVisitor loadAnnotationIfNotSpecial(@NotNull ClassId classId0, @NotNull SourceElement sourceElement0, @NotNull List list0) {
        Intrinsics.checkNotNullParameter(classId0, "annotationClassId");
        Intrinsics.checkNotNullParameter(sourceElement0, "source");
        Intrinsics.checkNotNullParameter(list0, "result");
        return SpecialJvmAnnotations.INSTANCE.getSPECIAL_ANNOTATIONS().contains(classId0) ? null : this.loadAnnotation(classId0, sourceElement0, list0);
    }

    @Override  // kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationLoader
    @NotNull
    public List loadCallableAnnotations(@NotNull ProtoContainer protoContainer0, @NotNull MessageLite messageLite0, @NotNull AnnotatedCallableKind annotatedCallableKind0) {
        Intrinsics.checkNotNullParameter(protoContainer0, "container");
        Intrinsics.checkNotNullParameter(messageLite0, "proto");
        Intrinsics.checkNotNullParameter(annotatedCallableKind0, "kind");
        if(annotatedCallableKind0 == AnnotatedCallableKind.PROPERTY) {
            return this.c(protoContainer0, ((Property)messageLite0), 1);
        }
        MemberSignature memberSignature0 = AbstractBinaryClassAnnotationLoader.getCallableSignature$default(this, messageLite0, protoContainer0.getNameResolver(), protoContainer0.getTypeTable(), annotatedCallableKind0, false, 16, null);
        return memberSignature0 == null ? CollectionsKt__CollectionsKt.emptyList() : AbstractBinaryClassAnnotationLoader.b(this, protoContainer0, memberSignature0, false, null, false, 60);
    }

    @Override  // kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationLoader
    @NotNull
    public List loadClassAnnotations(@NotNull Class protoContainer$Class0) {
        Intrinsics.checkNotNullParameter(protoContainer$Class0, "container");
        KotlinJvmBinaryClass kotlinJvmBinaryClass0 = AbstractBinaryClassAnnotationLoader.d(protoContainer$Class0);
        if(kotlinJvmBinaryClass0 == null) {
            throw new IllegalStateException(("Class for loading annotations is not found: " + protoContainer$Class0.debugFqName()).toString());
        }
        List list0 = new ArrayList(1);
        kotlinJvmBinaryClass0.loadClassAnnotations(new AnnotationVisitor() {
            public final AbstractBinaryClassAnnotationLoader a;
            public final ArrayList b;

            {
                AbstractBinaryClassAnnotationLoader abstractBinaryClassAnnotationLoader0 = (ArrayList)list0;  // 捕获的参数 （可能与外部方法变量命名冲突；考虑手动重命名）
                this.a = abstractBinaryClassAnnotationLoader0;
                this.b = arrayList0;
            }

            @Override  // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass$AnnotationVisitor
            @Nullable
            public AnnotationArgumentVisitor visitAnnotation(@NotNull ClassId classId0, @NotNull SourceElement sourceElement0) {
                Intrinsics.checkNotNullParameter(classId0, "classId");
                Intrinsics.checkNotNullParameter(sourceElement0, "source");
                return this.a.loadAnnotationIfNotSpecial(classId0, sourceElement0, this.b);
            }

            @Override  // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass$AnnotationVisitor
            public void visitEnd() {
            }
        }, this.getCachedFileContent(kotlinJvmBinaryClass0));
        return list0;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationLoader
    @NotNull
    public List loadEnumEntryAnnotations(@NotNull ProtoContainer protoContainer0, @NotNull EnumEntry protoBuf$EnumEntry0) {
        Intrinsics.checkNotNullParameter(protoContainer0, "container");
        Intrinsics.checkNotNullParameter(protoBuf$EnumEntry0, "proto");
        String s = protoContainer0.getNameResolver().getString(protoBuf$EnumEntry0.getName());
        String s1 = ((Class)protoContainer0).getClassId().asString();
        Intrinsics.checkNotNullExpressionValue(s1, "container as ProtoContai…Class).classId.asString()");
        String s2 = ClassMapperLite.mapClass(s1);
        return AbstractBinaryClassAnnotationLoader.b(this, protoContainer0, MemberSignature.Companion.fromFieldNameAndDesc(s, s2), false, null, false, 60);
    }

    @Override  // kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationLoader
    @NotNull
    public List loadExtensionReceiverParameterAnnotations(@NotNull ProtoContainer protoContainer0, @NotNull MessageLite messageLite0, @NotNull AnnotatedCallableKind annotatedCallableKind0) {
        Intrinsics.checkNotNullParameter(protoContainer0, "container");
        Intrinsics.checkNotNullParameter(messageLite0, "proto");
        Intrinsics.checkNotNullParameter(annotatedCallableKind0, "kind");
        MemberSignature memberSignature0 = AbstractBinaryClassAnnotationLoader.getCallableSignature$default(this, messageLite0, protoContainer0.getNameResolver(), protoContainer0.getTypeTable(), annotatedCallableKind0, false, 16, null);
        return memberSignature0 == null ? CollectionsKt__CollectionsKt.emptyList() : AbstractBinaryClassAnnotationLoader.b(this, protoContainer0, MemberSignature.Companion.fromMethodSignatureAndParameterIndex(memberSignature0, 0), false, null, false, 60);
    }

    @Override  // kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationLoader
    @NotNull
    public List loadPropertyBackingFieldAnnotations(@NotNull ProtoContainer protoContainer0, @NotNull Property protoBuf$Property0) {
        Intrinsics.checkNotNullParameter(protoContainer0, "container");
        Intrinsics.checkNotNullParameter(protoBuf$Property0, "proto");
        return this.c(protoContainer0, protoBuf$Property0, 2);
    }

    @Override  // kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationLoader
    @NotNull
    public List loadPropertyDelegateFieldAnnotations(@NotNull ProtoContainer protoContainer0, @NotNull Property protoBuf$Property0) {
        Intrinsics.checkNotNullParameter(protoContainer0, "container");
        Intrinsics.checkNotNullParameter(protoBuf$Property0, "proto");
        return this.c(protoContainer0, protoBuf$Property0, 3);
    }

    @NotNull
    public abstract Object loadTypeAnnotation(@NotNull Annotation arg1, @NotNull NameResolver arg2);

    @Override  // kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationLoader
    @NotNull
    public List loadTypeAnnotations(@NotNull Type protoBuf$Type0, @NotNull NameResolver nameResolver0) {
        Intrinsics.checkNotNullParameter(protoBuf$Type0, "proto");
        Intrinsics.checkNotNullParameter(nameResolver0, "nameResolver");
        Object object0 = protoBuf$Type0.getExtension(JvmProtoBuf.typeAnnotation);
        Intrinsics.checkNotNullExpressionValue(object0, "proto.getExtension(JvmProtoBuf.typeAnnotation)");
        List list0 = new ArrayList(l.collectionSizeOrDefault(((Iterable)object0), 10));
        for(Object object1: ((Iterable)object0)) {
            Intrinsics.checkNotNullExpressionValue(((Annotation)object1), "it");
            list0.add(this.loadTypeAnnotation(((Annotation)object1), nameResolver0));
        }
        return list0;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationLoader
    @NotNull
    public List loadTypeParameterAnnotations(@NotNull TypeParameter protoBuf$TypeParameter0, @NotNull NameResolver nameResolver0) {
        Intrinsics.checkNotNullParameter(protoBuf$TypeParameter0, "proto");
        Intrinsics.checkNotNullParameter(nameResolver0, "nameResolver");
        Object object0 = protoBuf$TypeParameter0.getExtension(JvmProtoBuf.typeParameterAnnotation);
        Intrinsics.checkNotNullExpressionValue(object0, "proto.getExtension(JvmPr….typeParameterAnnotation)");
        List list0 = new ArrayList(l.collectionSizeOrDefault(((Iterable)object0), 10));
        for(Object object1: ((Iterable)object0)) {
            Intrinsics.checkNotNullExpressionValue(((Annotation)object1), "it");
            list0.add(this.loadTypeAnnotation(((Annotation)object1), nameResolver0));
        }
        return list0;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationLoader
    @NotNull
    public List loadValueParameterAnnotations(@NotNull ProtoContainer protoContainer0, @NotNull MessageLite messageLite0, @NotNull AnnotatedCallableKind annotatedCallableKind0, int v, @NotNull ValueParameter protoBuf$ValueParameter0) {
        Intrinsics.checkNotNullParameter(protoContainer0, "container");
        Intrinsics.checkNotNullParameter(messageLite0, "callableProto");
        Intrinsics.checkNotNullParameter(annotatedCallableKind0, "kind");
        Intrinsics.checkNotNullParameter(protoBuf$ValueParameter0, "proto");
        MemberSignature memberSignature0 = AbstractBinaryClassAnnotationLoader.getCallableSignature$default(this, messageLite0, protoContainer0.getNameResolver(), protoContainer0.getTypeTable(), annotatedCallableKind0, false, 16, null);
        if(memberSignature0 != null) {
            if(messageLite0 instanceof Function) {
                return ProtoTypeTableUtilKt.hasReceiver(((Function)messageLite0)) ? AbstractBinaryClassAnnotationLoader.b(this, protoContainer0, MemberSignature.Companion.fromMethodSignatureAndParameterIndex(memberSignature0, v + 1), false, null, false, 60) : AbstractBinaryClassAnnotationLoader.b(this, protoContainer0, MemberSignature.Companion.fromMethodSignatureAndParameterIndex(memberSignature0, v), false, null, false, 60);
            }
            if(messageLite0 instanceof Property) {
                return ProtoTypeTableUtilKt.hasReceiver(((Property)messageLite0)) ? AbstractBinaryClassAnnotationLoader.b(this, protoContainer0, MemberSignature.Companion.fromMethodSignatureAndParameterIndex(memberSignature0, v + 1), false, null, false, 60) : AbstractBinaryClassAnnotationLoader.b(this, protoContainer0, MemberSignature.Companion.fromMethodSignatureAndParameterIndex(memberSignature0, v), false, null, false, 60);
            }
            if(!(messageLite0 instanceof Constructor)) {
                throw new UnsupportedOperationException("Unsupported message: " + messageLite0.getClass());
            }
            Intrinsics.checkNotNull(protoContainer0, "null cannot be cast to non-null type org.jetbrains.kotlin.serialization.deserialization.ProtoContainer.Class");
            if(((Class)protoContainer0).getKind() == Kind.ENUM_CLASS) {
                return AbstractBinaryClassAnnotationLoader.b(this, protoContainer0, MemberSignature.Companion.fromMethodSignatureAndParameterIndex(memberSignature0, v + 2), false, null, false, 60);
            }
            return ((Class)protoContainer0).isInner() ? AbstractBinaryClassAnnotationLoader.b(this, protoContainer0, MemberSignature.Companion.fromMethodSignatureAndParameterIndex(memberSignature0, v + 1), false, null, false, 60) : AbstractBinaryClassAnnotationLoader.b(this, protoContainer0, MemberSignature.Companion.fromMethodSignatureAndParameterIndex(memberSignature0, v), false, null, false, 60);
        }
        return CollectionsKt__CollectionsKt.emptyList();
    }
}

