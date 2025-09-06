package kotlinx.serialization.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref.ObjectRef;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.InternalSerializationApi;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.PolymorphicSerializerKt;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.SerializationStrategy;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder.DefaultImpls;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\'\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\t\b\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u001D\u0010\n\u001A\u00020\t2\u0006\u0010\u0007\u001A\u00020\u00062\u0006\u0010\b\u001A\u00028\u0000¢\u0006\u0004\b\n\u0010\u000BJ\u0015\u0010\u000E\u001A\u00028\u00002\u0006\u0010\r\u001A\u00020\f¢\u0006\u0004\b\u000E\u0010\u000FJ)\u0010\u0014\u001A\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00132\u0006\u0010\r\u001A\u00020\u00102\b\u0010\u0012\u001A\u0004\u0018\u00010\u0011H\u0017¢\u0006\u0004\b\u0014\u0010\u0015J\'\u0010\u0014\u001A\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00162\u0006\u0010\u0007\u001A\u00020\u00062\u0006\u0010\b\u001A\u00028\u0000H\u0017¢\u0006\u0004\b\u0014\u0010\u0017R\u001A\u0010\u001B\u001A\b\u0012\u0004\u0012\u00028\u00000\u00188&X¦\u0004¢\u0006\u0006\u001A\u0004\b\u0019\u0010\u001A¨\u0006\u001C"}, d2 = {"Lkotlinx/serialization/internal/AbstractPolymorphicSerializer;", "", "T", "Lkotlinx/serialization/KSerializer;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object;", "Lkotlinx/serialization/encoding/CompositeDecoder;", "", "klassName", "Lkotlinx/serialization/DeserializationStrategy;", "findPolymorphicSerializerOrNull", "(Lkotlinx/serialization/encoding/CompositeDecoder;Ljava/lang/String;)Lkotlinx/serialization/DeserializationStrategy;", "Lkotlinx/serialization/SerializationStrategy;", "(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)Lkotlinx/serialization/SerializationStrategy;", "Lkotlin/reflect/KClass;", "getBaseClass", "()Lkotlin/reflect/KClass;", "baseClass", "kotlinx-serialization-core"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nAbstractPolymorphicSerializer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbstractPolymorphicSerializer.kt\nkotlinx/serialization/internal/AbstractPolymorphicSerializer\n+ 2 Encoding.kt\nkotlinx/serialization/encoding/EncodingKt\n+ 3 Platform.common.kt\nkotlinx/serialization/internal/Platform_commonKt\n+ 4 Decoding.kt\nkotlinx/serialization/encoding/DecodingKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,115:1\n475#2,2:116\n477#2,2:119\n83#3:118\n570#4,2:121\n572#4,2:124\n1#5:123\n*S KotlinDebug\n*F\n+ 1 AbstractPolymorphicSerializer.kt\nkotlinx/serialization/internal/AbstractPolymorphicSerializer\n*L\n33#1:116,2\n33#1:119,2\n35#1:118\n39#1:121,2\n39#1:124,2\n*E\n"})
@InternalSerializationApi
public abstract class AbstractPolymorphicSerializer implements KSerializer {
    public static final Object access$decodeSequentially(AbstractPolymorphicSerializer abstractPolymorphicSerializer0, CompositeDecoder compositeDecoder0) {
        DeserializationStrategy deserializationStrategy0 = PolymorphicSerializerKt.findPolymorphicSerializer(abstractPolymorphicSerializer0, compositeDecoder0, compositeDecoder0.decodeStringElement(abstractPolymorphicSerializer0.getDescriptor(), 0));
        return DefaultImpls.decodeSerializableElement$default(compositeDecoder0, abstractPolymorphicSerializer0.getDescriptor(), 1, deserializationStrategy0, null, 8, null);
    }

    @Override  // kotlinx.serialization.DeserializationStrategy
    @NotNull
    public final Object deserialize(@NotNull Decoder decoder0) {
        Object object0;
        Intrinsics.checkNotNullParameter(decoder0, "decoder");
        SerialDescriptor serialDescriptor0 = this.getDescriptor();
        CompositeDecoder compositeDecoder0 = decoder0.beginStructure(serialDescriptor0);
        ObjectRef ref$ObjectRef0 = new ObjectRef();
        if(compositeDecoder0.decodeSequentially()) {
            object0 = AbstractPolymorphicSerializer.access$decodeSequentially(this, compositeDecoder0);
            compositeDecoder0.endStructure(serialDescriptor0);
            return object0;
        }
        object0 = null;
        while(true) {
            int v = compositeDecoder0.decodeElementIndex(this.getDescriptor());
            switch(v) {
                case -1: {
                    if(object0 == null) {
                        throw new IllegalArgumentException(("Polymorphic value has not been read for class " + ((String)ref$ObjectRef0.element)).toString());
                    }
                    Intrinsics.checkNotNull(object0, "null cannot be cast to non-null type T of kotlinx.serialization.internal.AbstractPolymorphicSerializer.deserialize$lambda$3");
                    compositeDecoder0.endStructure(serialDescriptor0);
                    return object0;
                }
                case 0: {
                    ref$ObjectRef0.element = compositeDecoder0.decodeStringElement(this.getDescriptor(), 0);
                    break;
                }
                default: {
                    if(v != 1) {
                        StringBuilder stringBuilder0 = new StringBuilder("Invalid index in polymorphic deserialization of ");
                        String s = (String)ref$ObjectRef0.element;
                        if(s == null) {
                            s = "unknown class";
                        }
                        stringBuilder0.append(s);
                        stringBuilder0.append("\n Expected 0, 1 or DECODE_DONE(-1), but found ");
                        stringBuilder0.append(v);
                        throw new SerializationException(stringBuilder0.toString());
                    }
                    Object object1 = ref$ObjectRef0.element;
                    if(object1 == null) {
                        throw new IllegalArgumentException("Cannot read polymorphic value before its type token");
                    }
                    ref$ObjectRef0.element = object1;
                    DeserializationStrategy deserializationStrategy0 = PolymorphicSerializerKt.findPolymorphicSerializer(this, compositeDecoder0, ((String)object1));
                    object0 = DefaultImpls.decodeSerializableElement$default(compositeDecoder0, this.getDescriptor(), 1, deserializationStrategy0, null, 8, null);
                    break;
                }
            }
        }
    }

    @InternalSerializationApi
    @Nullable
    public DeserializationStrategy findPolymorphicSerializerOrNull(@NotNull CompositeDecoder compositeDecoder0, @Nullable String s) {
        Intrinsics.checkNotNullParameter(compositeDecoder0, "decoder");
        return compositeDecoder0.getSerializersModule().getPolymorphic(this.getBaseClass(), s);
    }

    @InternalSerializationApi
    @Nullable
    public SerializationStrategy findPolymorphicSerializerOrNull(@NotNull Encoder encoder0, @NotNull Object object0) {
        Intrinsics.checkNotNullParameter(encoder0, "encoder");
        Intrinsics.checkNotNullParameter(object0, "value");
        return encoder0.getSerializersModule().getPolymorphic(this.getBaseClass(), object0);
    }

    @NotNull
    public abstract KClass getBaseClass();

    @Override  // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder0, @NotNull Object object0) {
        Intrinsics.checkNotNullParameter(encoder0, "encoder");
        Intrinsics.checkNotNullParameter(object0, "value");
        SerializationStrategy serializationStrategy0 = PolymorphicSerializerKt.findPolymorphicSerializer(this, encoder0, object0);
        SerialDescriptor serialDescriptor0 = this.getDescriptor();
        CompositeEncoder compositeEncoder0 = encoder0.beginStructure(serialDescriptor0);
        compositeEncoder0.encodeStringElement(this.getDescriptor(), 0, serializationStrategy0.getDescriptor().getSerialName());
        SerialDescriptor serialDescriptor1 = this.getDescriptor();
        Intrinsics.checkNotNull(serializationStrategy0, "null cannot be cast to non-null type kotlinx.serialization.SerializationStrategy<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
        compositeEncoder0.encodeSerializableElement(serialDescriptor1, 1, serializationStrategy0, object0);
        compositeEncoder0.endStructure(serialDescriptor0);
    }
}

