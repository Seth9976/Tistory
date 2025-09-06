package kotlinx.serialization.internal;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.InternalSerializationApi;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010(\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0004\b\u0002\u0010\u00032\b\u0012\u0004\u0012\u00028\u00010\u0004J\u0013\u0010\u0006\u001A\u00020\u0005*\u00028\u0001H$¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\t\u001A\b\u0012\u0004\u0012\u00028\u00000\b*\u00028\u0001H$¢\u0006\u0004\b\t\u0010\nJ\u000F\u0010\u000B\u001A\u00028\u0002H$¢\u0006\u0004\b\u000B\u0010\fJ\u0013\u0010\r\u001A\u00020\u0005*\u00028\u0002H$¢\u0006\u0004\b\r\u0010\u0007J\u0013\u0010\u000E\u001A\u00028\u0001*\u00028\u0002H$¢\u0006\u0004\b\u000E\u0010\u000FJ\u0013\u0010\u0010\u001A\u00028\u0002*\u00028\u0001H$¢\u0006\u0004\b\u0010\u0010\u000FJ\u001B\u0010\u0013\u001A\u00020\u0012*\u00028\u00022\u0006\u0010\u0011\u001A\u00020\u0005H$¢\u0006\u0004\b\u0013\u0010\u0014J\u001F\u0010\u0018\u001A\u00020\u00122\u0006\u0010\u0016\u001A\u00020\u00152\u0006\u0010\u0017\u001A\u00028\u0001H&¢\u0006\u0004\b\u0018\u0010\u0019J!\u0010\u001D\u001A\u00028\u00012\u0006\u0010\u001B\u001A\u00020\u001A2\b\u0010\u001C\u001A\u0004\u0018\u00018\u0001H\u0007¢\u0006\u0004\b\u001D\u0010\u001EJ\u0017\u0010\u001F\u001A\u00028\u00012\u0006\u0010\u001B\u001A\u00020\u001AH\u0016¢\u0006\u0004\b\u001F\u0010 J1\u0010%\u001A\u00020\u00122\u0006\u0010\u001B\u001A\u00020!2\u0006\u0010\"\u001A\u00020\u00052\u0006\u0010\u000B\u001A\u00028\u00022\b\b\u0002\u0010$\u001A\u00020#H$¢\u0006\u0004\b%\u0010&J/\u0010(\u001A\u00020\u00122\u0006\u0010\u001B\u001A\u00020!2\u0006\u0010\u000B\u001A\u00028\u00022\u0006\u0010\'\u001A\u00020\u00052\u0006\u0010\u0011\u001A\u00020\u0005H$¢\u0006\u0004\b(\u0010)\u0082\u0001\u0002*+¨\u0006,"}, d2 = {"Lkotlinx/serialization/internal/AbstractCollectionSerializer;", "Element", "Collection", "Builder", "Lkotlinx/serialization/KSerializer;", "", "collectionSize", "(Ljava/lang/Object;)I", "", "collectionIterator", "(Ljava/lang/Object;)Ljava/util/Iterator;", "builder", "()Ljava/lang/Object;", "builderSize", "toResult", "(Ljava/lang/Object;)Ljava/lang/Object;", "toBuilder", "size", "", "checkCapacity", "(Ljava/lang/Object;I)V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "previous", "merge", "(Lkotlinx/serialization/encoding/Decoder;Ljava/lang/Object;)Ljava/lang/Object;", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object;", "Lkotlinx/serialization/encoding/CompositeDecoder;", "index", "", "checkIndex", "readElement", "(Lkotlinx/serialization/encoding/CompositeDecoder;ILjava/lang/Object;Z)V", "startIndex", "readAll", "(Lkotlinx/serialization/encoding/CompositeDecoder;Ljava/lang/Object;II)V", "Lkotlinx/serialization/internal/CollectionLikeSerializer;", "Lkotlinx/serialization/internal/MapLikeSerializer;", "kotlinx-serialization-core"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@InternalSerializationApi
public abstract class AbstractCollectionSerializer implements KSerializer {
    public AbstractCollectionSerializer(DefaultConstructorMarker defaultConstructorMarker0) {
    }

    public abstract Object builder();

    public abstract int builderSize(Object arg1);

    public abstract void checkCapacity(Object arg1, int arg2);

    @NotNull
    public abstract Iterator collectionIterator(Object arg1);

    public abstract int collectionSize(Object arg1);

    @Override  // kotlinx.serialization.DeserializationStrategy
    public Object deserialize(@NotNull Decoder decoder0) {
        Intrinsics.checkNotNullParameter(decoder0, "decoder");
        return this.merge(decoder0, null);
    }

    @InternalSerializationApi
    public final Object merge(@NotNull Decoder decoder0, @Nullable Object object0) {
        Object object1;
        Intrinsics.checkNotNullParameter(decoder0, "decoder");
        if(object0 == null) {
            object1 = this.builder();
        }
        else {
            object1 = this.toBuilder(object0);
            if(object1 == null) {
                object1 = this.builder();
            }
        }
        int v = this.builderSize(object1);
        CompositeDecoder compositeDecoder0 = decoder0.beginStructure(this.getDescriptor());
        if(compositeDecoder0.decodeSequentially()) {
            int v1 = compositeDecoder0.decodeCollectionSize(this.getDescriptor());
            this.checkCapacity(object1, v1);
            this.readAll(compositeDecoder0, object1, v, v1);
        }
        else {
            int v2;
            while((v2 = compositeDecoder0.decodeElementIndex(this.getDescriptor())) != -1) {
                AbstractCollectionSerializer.readElement$default(this, compositeDecoder0, v + v2, object1, false, 8, null);
            }
        }
        compositeDecoder0.endStructure(this.getDescriptor());
        return this.toResult(object1);
    }

    public abstract void readAll(@NotNull CompositeDecoder arg1, Object arg2, int arg3, int arg4);

    public abstract void readElement(@NotNull CompositeDecoder arg1, int arg2, Object arg3, boolean arg4);

    public static void readElement$default(AbstractCollectionSerializer abstractCollectionSerializer0, CompositeDecoder compositeDecoder0, int v, Object object0, boolean z, int v1, Object object1) {
        if(object1 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: readElement");
        }
        if((v1 & 8) != 0) {
            z = true;
        }
        abstractCollectionSerializer0.readElement(compositeDecoder0, v, object0, z);
    }

    @Override  // kotlinx.serialization.SerializationStrategy
    public abstract void serialize(@NotNull Encoder arg1, Object arg2);

    public abstract Object toBuilder(Object arg1);

    public abstract Object toResult(Object arg1);
}

