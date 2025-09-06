package kotlinx.serialization.internal;

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.x;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntProgression;
import kotlin.ranges.c;
import kotlinx.serialization.InternalSerializationApi;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.PrimitiveKind;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder.DefaultImpls;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Encoder;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010&\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000B\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0004\b\u0002\u0010\u0003*\u0014\b\u0003\u0010\u0005*\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00042 \u0012\u0010\u0012\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0006J+\u0010\r\u001A\u00020\f*\u00028\u00032\u0006\u0010\t\u001A\u00020\b2\u0006\u0010\n\u001A\u00028\u00002\u0006\u0010\u000B\u001A\u00028\u0001H$¢\u0006\u0004\b\r\u0010\u000EJ/\u0010\u0014\u001A\u00020\f2\u0006\u0010\u0010\u001A\u00020\u000F2\u0006\u0010\u0011\u001A\u00028\u00032\u0006\u0010\u0012\u001A\u00020\b2\u0006\u0010\u0013\u001A\u00020\bH\u0004¢\u0006\u0004\b\u0014\u0010\u0015J/\u0010\u0018\u001A\u00020\f2\u0006\u0010\u0010\u001A\u00020\u000F2\u0006\u0010\t\u001A\u00020\b2\u0006\u0010\u0011\u001A\u00028\u00032\u0006\u0010\u0017\u001A\u00020\u0016H\u0004¢\u0006\u0004\b\u0018\u0010\u0019J\u001F\u0010\u001C\u001A\u00020\f2\u0006\u0010\u001B\u001A\u00020\u001A2\u0006\u0010\u000B\u001A\u00028\u0002H\u0016¢\u0006\u0004\b\u001C\u0010\u001DR\u001D\u0010#\u001A\b\u0012\u0004\u0012\u00028\u00000\u001E8\u0006¢\u0006\f\n\u0004\b\u001F\u0010 \u001A\u0004\b!\u0010\"R\u001D\u0010&\u001A\b\u0012\u0004\u0012\u00028\u00010\u001E8\u0006¢\u0006\f\n\u0004\b$\u0010 \u001A\u0004\b%\u0010\"R\u0014\u0010*\u001A\u00020\'8&X¦\u0004¢\u0006\u0006\u001A\u0004\b(\u0010)\u0082\u0001\u0002+,¨\u0006-"}, d2 = {"Lkotlinx/serialization/internal/MapLikeSerializer;", "Key", "Value", "Collection", "", "Builder", "Lkotlinx/serialization/internal/AbstractCollectionSerializer;", "", "", "index", "key", "value", "", "insertKeyValuePair", "(Ljava/util/Map;ILjava/lang/Object;Ljava/lang/Object;)V", "Lkotlinx/serialization/encoding/CompositeDecoder;", "decoder", "builder", "startIndex", "size", "readAll", "(Lkotlinx/serialization/encoding/CompositeDecoder;Ljava/util/Map;II)V", "", "checkIndex", "readElement", "(Lkotlinx/serialization/encoding/CompositeDecoder;ILjava/util/Map;Z)V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V", "Lkotlinx/serialization/KSerializer;", "a", "Lkotlinx/serialization/KSerializer;", "getKeySerializer", "()Lkotlinx/serialization/KSerializer;", "keySerializer", "b", "getValueSerializer", "valueSerializer", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/internal/HashMapSerializer;", "Lkotlinx/serialization/internal/LinkedHashMapSerializer;", "kotlinx-serialization-core"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nCollectionSerializers.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CollectionSerializers.kt\nkotlinx/serialization/internal/MapLikeSerializer\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Encoding.kt\nkotlinx/serialization/encoding/EncodingKt\n+ 4 Iterators.kt\nkotlin/collections/CollectionsKt__IteratorsKt\n*L\n1#1,283:1\n1#2:284\n488#3,2:285\n490#3,2:289\n32#4,2:287\n*S KotlinDebug\n*F\n+ 1 CollectionSerializers.kt\nkotlinx/serialization/internal/MapLikeSerializer\n*L\n118#1:285,2\n118#1:289,2\n121#1:287,2\n*E\n"})
@InternalSerializationApi
public abstract class MapLikeSerializer extends AbstractCollectionSerializer {
    public final KSerializer a;
    public final KSerializer b;

    public MapLikeSerializer(KSerializer kSerializer0, KSerializer kSerializer1, DefaultConstructorMarker defaultConstructorMarker0) {
        super(null);
        this.a = kSerializer0;
        this.b = kSerializer1;
    }

    @Override  // kotlinx.serialization.KSerializer
    @NotNull
    public abstract SerialDescriptor getDescriptor();

    @NotNull
    public final KSerializer getKeySerializer() {
        return this.a;
    }

    @NotNull
    public final KSerializer getValueSerializer() {
        return this.b;
    }

    public abstract void insertKeyValuePair(@NotNull Map arg1, int arg2, Object arg3, Object arg4);

    @Override  // kotlinx.serialization.internal.AbstractCollectionSerializer
    public void readAll(CompositeDecoder compositeDecoder0, Object object0, int v, int v1) {
        this.readAll(compositeDecoder0, ((Map)object0), v, v1);
    }

    public final void readAll(@NotNull CompositeDecoder compositeDecoder0, @NotNull Map map0, int v, int v1) {
        Intrinsics.checkNotNullParameter(compositeDecoder0, "decoder");
        Intrinsics.checkNotNullParameter(map0, "builder");
        if(v1 < 0) {
            throw new IllegalArgumentException("Size must be known in advance when using READ_ALL");
        }
        IntProgression intProgression0 = c.step(c.until(0, v1 * 2), 2);
        int v2 = intProgression0.getFirst();
        int v3 = intProgression0.getLast();
        int v4 = intProgression0.getStep();
        if(v4 > 0 && v2 <= v3 || v4 < 0 && v3 <= v2) {
            while(true) {
                this.readElement(compositeDecoder0, v + v2, map0, false);
                if(v2 == v3) {
                    break;
                }
                v2 += v4;
            }
        }
    }

    @Override  // kotlinx.serialization.internal.AbstractCollectionSerializer
    public void readElement(CompositeDecoder compositeDecoder0, int v, Object object0, boolean z) {
        this.readElement(compositeDecoder0, v, ((Map)object0), z);
    }

    public final void readElement(@NotNull CompositeDecoder compositeDecoder0, int v, @NotNull Map map0, boolean z) {
        Object object1;
        int v1;
        Intrinsics.checkNotNullParameter(compositeDecoder0, "decoder");
        Intrinsics.checkNotNullParameter(map0, "builder");
        Object object0 = DefaultImpls.decodeSerializableElement$default(compositeDecoder0, this.getDescriptor(), v, this.a, null, 8, null);
        if(z) {
            v1 = compositeDecoder0.decodeElementIndex(this.getDescriptor());
            if(v1 != v + 1) {
                throw new IllegalArgumentException(("Value must follow key in a map, index for key: " + v + ", returned index for value: " + v1).toString());
            }
        }
        else {
            v1 = v + 1;
        }
        if(map0.containsKey(object0)) {
            KSerializer kSerializer0 = this.b;
            object1 = kSerializer0.getDescriptor().getKind() instanceof PrimitiveKind ? DefaultImpls.decodeSerializableElement$default(compositeDecoder0, this.getDescriptor(), v1, this.b, null, 8, null) : compositeDecoder0.decodeSerializableElement(this.getDescriptor(), v1, kSerializer0, x.getValue(map0, object0));
        }
        else {
            object1 = DefaultImpls.decodeSerializableElement$default(compositeDecoder0, this.getDescriptor(), v1, this.b, null, 8, null);
        }
        map0.put(object0, object1);
    }

    @Override  // kotlinx.serialization.internal.AbstractCollectionSerializer
    public void serialize(@NotNull Encoder encoder0, Object object0) {
        Intrinsics.checkNotNullParameter(encoder0, "encoder");
        int v = this.collectionSize(object0);
        SerialDescriptor serialDescriptor0 = this.getDescriptor();
        CompositeEncoder compositeEncoder0 = encoder0.beginCollection(serialDescriptor0, v);
        int v1 = 0;
        Iterator iterator0 = this.collectionIterator(object0);
        while(iterator0.hasNext()) {
            Object object1 = iterator0.next();
            Object object2 = ((Map.Entry)object1).getKey();
            Object object3 = ((Map.Entry)object1).getValue();
            int v2 = v1 + 1;
            compositeEncoder0.encodeSerializableElement(this.getDescriptor(), v1, this.getKeySerializer(), object2);
            v1 += 2;
            compositeEncoder0.encodeSerializableElement(this.getDescriptor(), v2, this.getValueSerializer(), object3);
        }
        compositeEncoder0.endStructure(serialDescriptor0);
    }
}

