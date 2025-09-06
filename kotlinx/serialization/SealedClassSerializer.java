package kotlinx.serialization;

import fg.e;
import java.lang.annotation.Annotation;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.Grouping;
import kotlin.collections.w;
import kotlin.collections.x;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.AbstractPolymorphicSerializer;
import md.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u001B\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003BI\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u0012\f\u0010\u0007\u001A\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\u0014\u0010\t\u001A\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00060\b\u0012\u0014\u0010\u000B\u001A\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00028\u00000\n0\b¢\u0006\u0004\b\f\u0010\rBY\b\u0011\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u0012\f\u0010\u0007\u001A\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\u0014\u0010\t\u001A\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00060\b\u0012\u0014\u0010\u000B\u001A\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00028\u00000\n0\b\u0012\f\u0010\u000F\u001A\b\u0012\u0004\u0012\u00020\u000E0\b¢\u0006\u0004\b\f\u0010\u0010J)\u0010\u0015\u001A\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00142\u0006\u0010\u0012\u001A\u00020\u00112\b\u0010\u0013\u001A\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\'\u0010\u0015\u001A\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u001A2\u0006\u0010\u0018\u001A\u00020\u00172\u0006\u0010\u0019\u001A\u00028\u0000H\u0016¢\u0006\u0004\b\u0015\u0010\u001BR \u0010\u0007\u001A\b\u0012\u0004\u0012\u00028\u00000\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001C\u0010\u001D\u001A\u0004\b\u001E\u0010\u001FR\u001B\u0010%\u001A\u00020 8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\"\u001A\u0004\b#\u0010$¨\u0006&"}, d2 = {"Lkotlinx/serialization/SealedClassSerializer;", "", "T", "Lkotlinx/serialization/internal/AbstractPolymorphicSerializer;", "", "serialName", "Lkotlin/reflect/KClass;", "baseClass", "", "subclasses", "Lkotlinx/serialization/KSerializer;", "subclassSerializers", "<init>", "(Ljava/lang/String;Lkotlin/reflect/KClass;[Lkotlin/reflect/KClass;[Lkotlinx/serialization/KSerializer;)V", "", "classAnnotations", "(Ljava/lang/String;Lkotlin/reflect/KClass;[Lkotlin/reflect/KClass;[Lkotlinx/serialization/KSerializer;[Ljava/lang/annotation/Annotation;)V", "Lkotlinx/serialization/encoding/CompositeDecoder;", "decoder", "klassName", "Lkotlinx/serialization/DeserializationStrategy;", "findPolymorphicSerializerOrNull", "(Lkotlinx/serialization/encoding/CompositeDecoder;Ljava/lang/String;)Lkotlinx/serialization/DeserializationStrategy;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lkotlinx/serialization/SerializationStrategy;", "(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)Lkotlinx/serialization/SerializationStrategy;", "a", "Lkotlin/reflect/KClass;", "getBaseClass", "()Lkotlin/reflect/KClass;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "c", "Lkotlin/Lazy;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "kotlinx-serialization-core"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nSealedSerializer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SealedSerializer.kt\nkotlinx/serialization/SealedClassSerializer\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Grouping.kt\nkotlin/collections/GroupingKt__GroupingKt\n+ 4 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 5 Platform.common.kt\nkotlinx/serialization/internal/Platform_commonKt\n*L\n1#1,154:1\n1536#2:155\n1238#2,4:165\n53#3:156\n80#3,6:157\n453#4:163\n403#4:164\n83#5:169\n*S KotlinDebug\n*F\n+ 1 SealedSerializer.kt\nkotlinx/serialization/SealedClassSerializer\n*L\n130#1:155\n140#1:165,4\n131#1:156\n131#1:157,6\n140#1:163\n140#1:164\n151#1:169\n*E\n"})
@InternalSerializationApi
public final class SealedClassSerializer extends AbstractPolymorphicSerializer {
    public final KClass a;
    public final List b;
    public final Lazy c;
    public final Map d;
    public final LinkedHashMap e;

    public SealedClassSerializer(@NotNull String s, @NotNull KClass kClass0, @NotNull KClass[] arr_kClass, @NotNull KSerializer[] arr_kSerializer) {
        Intrinsics.checkNotNullParameter(s, "serialName");
        Intrinsics.checkNotNullParameter(kClass0, "baseClass");
        Intrinsics.checkNotNullParameter(arr_kClass, "subclasses");
        Intrinsics.checkNotNullParameter(arr_kSerializer, "subclassSerializers");
        super();
        this.a = kClass0;
        this.b = CollectionsKt__CollectionsKt.emptyList();
        e e0 = new e(s, this);
        this.c = c.lazy(LazyThreadSafetyMode.PUBLICATION, e0);
        if(arr_kClass.length != arr_kSerializer.length) {
            throw new IllegalArgumentException("All subclasses of sealed class " + this.getBaseClass().getSimpleName() + " should be marked @Serializable");
        }
        Map map0 = x.toMap(ArraysKt___ArraysKt.zip(arr_kClass, arr_kSerializer));
        this.d = map0;
        kotlinx.serialization.SealedClassSerializer.special..inlined.groupingBy.1 sealedClassSerializer$special$$inlined$groupingBy$10 = new Grouping() {
            @Override  // kotlin.collections.Grouping
            public Object keyOf(Object object0) {
                return ((KSerializer)((Map.Entry)object0).getValue()).getDescriptor().getSerialName();
            }

            @Override  // kotlin.collections.Grouping
            @NotNull
            public Iterator sourceIterator() {
                return this.a.iterator();
            }
        };
        LinkedHashMap linkedHashMap0 = new LinkedHashMap();
        Iterator iterator0 = sealedClassSerializer$special$$inlined$groupingBy$10.sourceIterator();
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            Object object1 = sealedClassSerializer$special$$inlined$groupingBy$10.keyOf(object0);
            Object object2 = linkedHashMap0.get(object1);
            if(object2 == null) {
                linkedHashMap0.containsKey(object1);
            }
            if(((Map.Entry)object2) != null) {
                throw new IllegalStateException(("Multiple sealed subclasses of \'" + this.getBaseClass() + "\' have the same serial name \'" + ((String)object1) + "\': \'" + ((Map.Entry)object2).getKey() + "\', \'" + ((Map.Entry)object0).getKey() + '\'').toString());
            }
            linkedHashMap0.put(object1, ((Map.Entry)object0));
        }
        LinkedHashMap linkedHashMap1 = new LinkedHashMap(w.mapCapacity(linkedHashMap0.size()));
        for(Object object3: linkedHashMap0.entrySet()) {
            linkedHashMap1.put(((Map.Entry)object3).getKey(), ((KSerializer)((Map.Entry)((Map.Entry)object3).getValue()).getValue()));
        }
        this.e = linkedHashMap1;
    }

    @PublishedApi
    public SealedClassSerializer(@NotNull String s, @NotNull KClass kClass0, @NotNull KClass[] arr_kClass, @NotNull KSerializer[] arr_kSerializer, @NotNull Annotation[] arr_annotation) {
        Intrinsics.checkNotNullParameter(s, "serialName");
        Intrinsics.checkNotNullParameter(kClass0, "baseClass");
        Intrinsics.checkNotNullParameter(arr_kClass, "subclasses");
        Intrinsics.checkNotNullParameter(arr_kSerializer, "subclassSerializers");
        Intrinsics.checkNotNullParameter(arr_annotation, "classAnnotations");
        this(s, kClass0, arr_kClass, arr_kSerializer);
        this.b = ArraysKt___ArraysJvmKt.asList(arr_annotation);
    }

    public static final Map access$getSerialName2Serializer$p(SealedClassSerializer sealedClassSerializer0) {
        return sealedClassSerializer0.e;
    }

    public static final List access$get_annotations$p(SealedClassSerializer sealedClassSerializer0) {
        return sealedClassSerializer0.b;
    }

    @Override  // kotlinx.serialization.internal.AbstractPolymorphicSerializer
    @Nullable
    public DeserializationStrategy findPolymorphicSerializerOrNull(@NotNull CompositeDecoder compositeDecoder0, @Nullable String s) {
        Intrinsics.checkNotNullParameter(compositeDecoder0, "decoder");
        DeserializationStrategy deserializationStrategy0 = (KSerializer)this.e.get(s);
        return deserializationStrategy0 == null ? super.findPolymorphicSerializerOrNull(compositeDecoder0, s) : deserializationStrategy0;
    }

    @Override  // kotlinx.serialization.internal.AbstractPolymorphicSerializer
    @Nullable
    public SerializationStrategy findPolymorphicSerializerOrNull(@NotNull Encoder encoder0, @NotNull Object object0) {
        Intrinsics.checkNotNullParameter(encoder0, "encoder");
        Intrinsics.checkNotNullParameter(object0, "value");
        KClass kClass0 = Reflection.getOrCreateKotlinClass(object0.getClass());
        SerializationStrategy serializationStrategy0 = (KSerializer)this.d.get(kClass0);
        if(serializationStrategy0 == null) {
            serializationStrategy0 = super.findPolymorphicSerializerOrNull(encoder0, object0);
        }
        return serializationStrategy0 == null ? null : serializationStrategy0;
    }

    @Override  // kotlinx.serialization.internal.AbstractPolymorphicSerializer
    @NotNull
    public KClass getBaseClass() {
        return this.a;
    }

    @Override  // kotlinx.serialization.KSerializer
    @NotNull
    public SerialDescriptor getDescriptor() {
        return (SerialDescriptor)this.c.getValue();
    }
}

