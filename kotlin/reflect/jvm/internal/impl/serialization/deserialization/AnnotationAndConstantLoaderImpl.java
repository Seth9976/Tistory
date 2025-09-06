package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Constructor;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.EnumEntry;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameter;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoBufUtilKt;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.GeneratedExtension;
import kotlin.reflect.jvm.internal.impl.protobuf.MessageLite;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;
import kotlin.reflect.jvm.internal.impl.serialization.SerializerExtensionProtocol;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@SourceDebugExtension({"SMAP\nAnnotationAndConstantLoaderImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnnotationAndConstantLoaderImpl.kt\norg/jetbrains/kotlin/serialization/deserialization/AnnotationAndConstantLoaderImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,139:1\n1549#2:140\n1620#2,3:141\n1549#2:144\n1620#2,3:145\n1549#2:149\n1620#2,3:150\n1549#2:153\n1620#2,3:154\n1549#2:157\n1620#2,3:158\n1549#2:161\n1620#2,3:162\n1549#2:165\n1620#2,3:166\n1549#2:169\n1620#2,3:170\n1549#2:173\n1620#2,3:174\n1#3:148\n*S KotlinDebug\n*F\n+ 1 AnnotationAndConstantLoaderImpl.kt\norg/jetbrains/kotlin/serialization/deserialization/AnnotationAndConstantLoaderImpl\n*L\n39#1:140\n39#1:141,3\n58#1:144\n58#1:145,3\n65#1:149\n65#1:150,3\n72#1:153\n72#1:154,3\n79#1:157\n79#1:158,3\n92#1:161\n92#1:162,3\n112#1:165\n112#1:166,3\n118#1:169\n118#1:170,3\n122#1:173\n122#1:174,3\n*E\n"})
public final class AnnotationAndConstantLoaderImpl implements AnnotationAndConstantLoader {
    public final class WhenMappings {
        public static final int[] $EnumSwitchMapping$0;

        static {
            int[] arr_v = new int[AnnotatedCallableKind.values().length];
            try {
                arr_v[AnnotatedCallableKind.PROPERTY.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[AnnotatedCallableKind.PROPERTY_GETTER.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[AnnotatedCallableKind.PROPERTY_SETTER.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            WhenMappings.$EnumSwitchMapping$0 = arr_v;
        }
    }

    public final SerializerExtensionProtocol a;
    public final AnnotationDeserializer b;

    public AnnotationAndConstantLoaderImpl(@NotNull ModuleDescriptor moduleDescriptor0, @NotNull NotFoundClasses notFoundClasses0, @NotNull SerializerExtensionProtocol serializerExtensionProtocol0) {
        Intrinsics.checkNotNullParameter(moduleDescriptor0, "module");
        Intrinsics.checkNotNullParameter(notFoundClasses0, "notFoundClasses");
        Intrinsics.checkNotNullParameter(serializerExtensionProtocol0, "protocol");
        super();
        this.a = serializerExtensionProtocol0;
        this.b = new AnnotationDeserializer(moduleDescriptor0, notFoundClasses0);
    }

    @Override  // kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationAndConstantLoader
    public Object loadAnnotationDefaultValue(ProtoContainer protoContainer0, Property protoBuf$Property0, KotlinType kotlinType0) {
        return this.loadAnnotationDefaultValue(protoContainer0, protoBuf$Property0, kotlinType0);
    }

    @Nullable
    public ConstantValue loadAnnotationDefaultValue(@NotNull ProtoContainer protoContainer0, @NotNull Property protoBuf$Property0, @NotNull KotlinType kotlinType0) {
        Intrinsics.checkNotNullParameter(protoContainer0, "container");
        Intrinsics.checkNotNullParameter(protoBuf$Property0, "proto");
        Intrinsics.checkNotNullParameter(kotlinType0, "expectedType");
        return null;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationLoader
    @NotNull
    public List loadCallableAnnotations(@NotNull ProtoContainer protoContainer0, @NotNull MessageLite messageLite0, @NotNull AnnotatedCallableKind annotatedCallableKind0) {
        List list0;
        Intrinsics.checkNotNullParameter(protoContainer0, "container");
        Intrinsics.checkNotNullParameter(messageLite0, "proto");
        Intrinsics.checkNotNullParameter(annotatedCallableKind0, "kind");
        SerializerExtensionProtocol serializerExtensionProtocol0 = this.a;
        if(messageLite0 instanceof Constructor) {
            list0 = (List)((Constructor)messageLite0).getExtension(serializerExtensionProtocol0.getConstructorAnnotation());
        }
        else if(messageLite0 instanceof Function) {
            list0 = (List)((Function)messageLite0).getExtension(serializerExtensionProtocol0.getFunctionAnnotation());
        }
        else if(messageLite0 instanceof Property) {
            switch(WhenMappings.$EnumSwitchMapping$0[annotatedCallableKind0.ordinal()]) {
                case 1: {
                    list0 = (List)((Property)messageLite0).getExtension(serializerExtensionProtocol0.getPropertyAnnotation());
                    break;
                }
                case 2: {
                    list0 = (List)((Property)messageLite0).getExtension(serializerExtensionProtocol0.getPropertyGetterAnnotation());
                    break;
                }
                case 3: {
                    list0 = (List)((Property)messageLite0).getExtension(serializerExtensionProtocol0.getPropertySetterAnnotation());
                    break;
                }
                default: {
                    throw new IllegalStateException("Unsupported callable kind with property proto");
                }
            }
        }
        else {
            throw new IllegalStateException(("Unknown message: " + messageLite0).toString());
        }
        if(list0 == null) {
            list0 = CollectionsKt__CollectionsKt.emptyList();
        }
        List list1 = new ArrayList(l.collectionSizeOrDefault(list0, 10));
        for(Object object0: list0) {
            list1.add(this.b.deserializeAnnotation(((Annotation)object0), protoContainer0.getNameResolver()));
        }
        return list1;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationLoader
    @NotNull
    public List loadClassAnnotations(@NotNull Class protoContainer$Class0) {
        Intrinsics.checkNotNullParameter(protoContainer$Class0, "container");
        List list0 = (List)protoContainer$Class0.getClassProto().getExtension(this.a.getClassAnnotation());
        if(list0 == null) {
            list0 = CollectionsKt__CollectionsKt.emptyList();
        }
        List list1 = new ArrayList(l.collectionSizeOrDefault(list0, 10));
        for(Object object0: list0) {
            list1.add(this.b.deserializeAnnotation(((Annotation)object0), protoContainer$Class0.getNameResolver()));
        }
        return list1;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationLoader
    @NotNull
    public List loadEnumEntryAnnotations(@NotNull ProtoContainer protoContainer0, @NotNull EnumEntry protoBuf$EnumEntry0) {
        Intrinsics.checkNotNullParameter(protoContainer0, "container");
        Intrinsics.checkNotNullParameter(protoBuf$EnumEntry0, "proto");
        List list0 = (List)protoBuf$EnumEntry0.getExtension(this.a.getEnumEntryAnnotation());
        if(list0 == null) {
            list0 = CollectionsKt__CollectionsKt.emptyList();
        }
        List list1 = new ArrayList(l.collectionSizeOrDefault(list0, 10));
        for(Object object0: list0) {
            list1.add(this.b.deserializeAnnotation(((Annotation)object0), protoContainer0.getNameResolver()));
        }
        return list1;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationLoader
    @NotNull
    public List loadExtensionReceiverParameterAnnotations(@NotNull ProtoContainer protoContainer0, @NotNull MessageLite messageLite0, @NotNull AnnotatedCallableKind annotatedCallableKind0) {
        Intrinsics.checkNotNullParameter(protoContainer0, "container");
        Intrinsics.checkNotNullParameter(messageLite0, "proto");
        Intrinsics.checkNotNullParameter(annotatedCallableKind0, "kind");
        List list0 = null;
        SerializerExtensionProtocol serializerExtensionProtocol0 = this.a;
        if(messageLite0 instanceof Function) {
            GeneratedExtension generatedMessageLite$GeneratedExtension0 = serializerExtensionProtocol0.getFunctionExtensionReceiverAnnotation();
            if(generatedMessageLite$GeneratedExtension0 == null) {
                goto label_16;
            }
            list0 = (List)((Function)messageLite0).getExtension(generatedMessageLite$GeneratedExtension0);
        }
        else if(messageLite0 instanceof Property) {
            switch(WhenMappings.$EnumSwitchMapping$0[annotatedCallableKind0.ordinal()]) {
                case 1: 
                case 2: 
                case 3: {
                    GeneratedExtension generatedMessageLite$GeneratedExtension1 = serializerExtensionProtocol0.getPropertyExtensionReceiverAnnotation();
                    if(generatedMessageLite$GeneratedExtension1 != null) {
                        list0 = (List)((Property)messageLite0).getExtension(generatedMessageLite$GeneratedExtension1);
                    }
                    break;
                }
                default: {
                    throw new IllegalStateException(("Unsupported callable kind with property proto for receiver annotations: " + annotatedCallableKind0).toString());
                }
            }
        }
        else {
            throw new IllegalStateException(("Unknown message: " + messageLite0).toString());
        }
    label_16:
        if(list0 == null) {
            list0 = CollectionsKt__CollectionsKt.emptyList();
        }
        List list1 = new ArrayList(l.collectionSizeOrDefault(list0, 10));
        for(Object object0: list0) {
            list1.add(this.b.deserializeAnnotation(((Annotation)object0), protoContainer0.getNameResolver()));
        }
        return list1;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationLoader
    @NotNull
    public List loadPropertyBackingFieldAnnotations(@NotNull ProtoContainer protoContainer0, @NotNull Property protoBuf$Property0) {
        Intrinsics.checkNotNullParameter(protoContainer0, "container");
        Intrinsics.checkNotNullParameter(protoBuf$Property0, "proto");
        GeneratedExtension generatedMessageLite$GeneratedExtension0 = this.a.getPropertyBackingFieldAnnotation();
        List list0 = generatedMessageLite$GeneratedExtension0 == null ? null : ((List)protoBuf$Property0.getExtension(generatedMessageLite$GeneratedExtension0));
        if(list0 == null) {
            list0 = CollectionsKt__CollectionsKt.emptyList();
        }
        List list1 = new ArrayList(l.collectionSizeOrDefault(list0, 10));
        for(Object object0: list0) {
            list1.add(this.b.deserializeAnnotation(((Annotation)object0), protoContainer0.getNameResolver()));
        }
        return list1;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationAndConstantLoader
    public Object loadPropertyConstant(ProtoContainer protoContainer0, Property protoBuf$Property0, KotlinType kotlinType0) {
        return this.loadPropertyConstant(protoContainer0, protoBuf$Property0, kotlinType0);
    }

    @Nullable
    public ConstantValue loadPropertyConstant(@NotNull ProtoContainer protoContainer0, @NotNull Property protoBuf$Property0, @NotNull KotlinType kotlinType0) {
        Intrinsics.checkNotNullParameter(protoContainer0, "container");
        Intrinsics.checkNotNullParameter(protoBuf$Property0, "proto");
        Intrinsics.checkNotNullParameter(kotlinType0, "expectedType");
        Value protoBuf$Annotation$Argument$Value0 = (Value)ProtoBufUtilKt.getExtensionOrNull(protoBuf$Property0, this.a.getCompileTimeValue());
        return protoBuf$Annotation$Argument$Value0 == null ? null : this.b.resolveValue(kotlinType0, protoBuf$Annotation$Argument$Value0, protoContainer0.getNameResolver());
    }

    @Override  // kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationLoader
    @NotNull
    public List loadPropertyDelegateFieldAnnotations(@NotNull ProtoContainer protoContainer0, @NotNull Property protoBuf$Property0) {
        Intrinsics.checkNotNullParameter(protoContainer0, "container");
        Intrinsics.checkNotNullParameter(protoBuf$Property0, "proto");
        GeneratedExtension generatedMessageLite$GeneratedExtension0 = this.a.getPropertyDelegatedFieldAnnotation();
        List list0 = generatedMessageLite$GeneratedExtension0 == null ? null : ((List)protoBuf$Property0.getExtension(generatedMessageLite$GeneratedExtension0));
        if(list0 == null) {
            list0 = CollectionsKt__CollectionsKt.emptyList();
        }
        List list1 = new ArrayList(l.collectionSizeOrDefault(list0, 10));
        for(Object object0: list0) {
            list1.add(this.b.deserializeAnnotation(((Annotation)object0), protoContainer0.getNameResolver()));
        }
        return list1;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationLoader
    @NotNull
    public List loadTypeAnnotations(@NotNull Type protoBuf$Type0, @NotNull NameResolver nameResolver0) {
        Intrinsics.checkNotNullParameter(protoBuf$Type0, "proto");
        Intrinsics.checkNotNullParameter(nameResolver0, "nameResolver");
        List list0 = (List)protoBuf$Type0.getExtension(this.a.getTypeAnnotation());
        if(list0 == null) {
            list0 = CollectionsKt__CollectionsKt.emptyList();
        }
        List list1 = new ArrayList(l.collectionSizeOrDefault(list0, 10));
        for(Object object0: list0) {
            list1.add(this.b.deserializeAnnotation(((Annotation)object0), nameResolver0));
        }
        return list1;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationLoader
    @NotNull
    public List loadTypeParameterAnnotations(@NotNull TypeParameter protoBuf$TypeParameter0, @NotNull NameResolver nameResolver0) {
        Intrinsics.checkNotNullParameter(protoBuf$TypeParameter0, "proto");
        Intrinsics.checkNotNullParameter(nameResolver0, "nameResolver");
        List list0 = (List)protoBuf$TypeParameter0.getExtension(this.a.getTypeParameterAnnotation());
        if(list0 == null) {
            list0 = CollectionsKt__CollectionsKt.emptyList();
        }
        List list1 = new ArrayList(l.collectionSizeOrDefault(list0, 10));
        for(Object object0: list0) {
            list1.add(this.b.deserializeAnnotation(((Annotation)object0), nameResolver0));
        }
        return list1;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationLoader
    @NotNull
    public List loadValueParameterAnnotations(@NotNull ProtoContainer protoContainer0, @NotNull MessageLite messageLite0, @NotNull AnnotatedCallableKind annotatedCallableKind0, int v, @NotNull ValueParameter protoBuf$ValueParameter0) {
        Intrinsics.checkNotNullParameter(protoContainer0, "container");
        Intrinsics.checkNotNullParameter(messageLite0, "callableProto");
        Intrinsics.checkNotNullParameter(annotatedCallableKind0, "kind");
        Intrinsics.checkNotNullParameter(protoBuf$ValueParameter0, "proto");
        List list0 = (List)protoBuf$ValueParameter0.getExtension(this.a.getParameterAnnotation());
        if(list0 == null) {
            list0 = CollectionsKt__CollectionsKt.emptyList();
        }
        List list1 = new ArrayList(l.collectionSizeOrDefault(list0, 10));
        for(Object object0: list0) {
            list1.add(this.b.deserializeAnnotation(((Annotation)object0), protoContainer0.getNameResolver()));
        }
        return list1;
    }
}

