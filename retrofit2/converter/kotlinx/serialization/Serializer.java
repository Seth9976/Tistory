package retrofit2.converter.kotlinx.serialization;

import java.lang.reflect.Type;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.BinaryFormat;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialFormat;
import kotlinx.serialization.SerializationStrategy;
import kotlinx.serialization.SerializersKt;
import kotlinx.serialization.StringFormat;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0002\u001A\u001BJ+\u0010\u0007\u001A\u00028\u0000\"\u0004\b\u0000\u0010\u00022\f\u0010\u0004\u001A\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u0006\u001A\u00020\u0005H&¢\u0006\u0004\b\u0007\u0010\bJ3\u0010\u000F\u001A\u00020\u000E\"\u0004\b\u0000\u0010\u00022\u0006\u0010\n\u001A\u00020\t2\f\u0010\f\u001A\b\u0012\u0004\u0012\u00028\u00000\u000B2\u0006\u0010\r\u001A\u00028\u0000H&¢\u0006\u0004\b\u000F\u0010\u0010J\u001B\u0010\u0014\u001A\b\u0012\u0004\u0012\u00020\u00010\u00132\u0006\u0010\u0012\u001A\u00020\u0011¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0019\u001A\u00020\u00168$X¤\u0004¢\u0006\u0006\u001A\u0004\b\u0017\u0010\u0018\u0082\u0001\u0002\u001C\u001D¨\u0006\u001E"}, d2 = {"Lretrofit2/converter/kotlinx/serialization/Serializer;", "", "T", "Lkotlinx/serialization/DeserializationStrategy;", "loader", "Lokhttp3/ResponseBody;", "body", "fromResponseBody", "(Lkotlinx/serialization/DeserializationStrategy;Lokhttp3/ResponseBody;)Ljava/lang/Object;", "Lokhttp3/MediaType;", "contentType", "Lkotlinx/serialization/SerializationStrategy;", "saver", "value", "Lokhttp3/RequestBody;", "toRequestBody", "(Lokhttp3/MediaType;Lkotlinx/serialization/SerializationStrategy;Ljava/lang/Object;)Lokhttp3/RequestBody;", "Ljava/lang/reflect/Type;", "type", "Lkotlinx/serialization/KSerializer;", "serializer", "(Ljava/lang/reflect/Type;)Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/SerialFormat;", "getFormat", "()Lkotlinx/serialization/SerialFormat;", "format", "FromBytes", "FromString", "Lretrofit2/converter/kotlinx/serialization/Serializer$FromBytes;", "Lretrofit2/converter/kotlinx/serialization/Serializer$FromString;", "kotlinx-serialization"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public abstract class Serializer {
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J+\u0010\u000B\u001A\u00028\u0000\"\u0004\b\u0000\u0010\u00062\f\u0010\b\u001A\b\u0012\u0004\u0012\u00028\u00000\u00072\u0006\u0010\n\u001A\u00020\tH\u0016¢\u0006\u0004\b\u000B\u0010\fJ3\u0010\u0013\u001A\u00020\u0012\"\u0004\b\u0000\u0010\u00062\u0006\u0010\u000E\u001A\u00020\r2\f\u0010\u0010\u001A\b\u0012\u0004\u0012\u00028\u00000\u000F2\u0006\u0010\u0011\u001A\u00028\u0000H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u001A\u0010\u0003\u001A\u00020\u00028\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001A\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lretrofit2/converter/kotlinx/serialization/Serializer$FromBytes;", "Lretrofit2/converter/kotlinx/serialization/Serializer;", "Lkotlinx/serialization/BinaryFormat;", "format", "<init>", "(Lkotlinx/serialization/BinaryFormat;)V", "T", "Lkotlinx/serialization/DeserializationStrategy;", "loader", "Lokhttp3/ResponseBody;", "body", "fromResponseBody", "(Lkotlinx/serialization/DeserializationStrategy;Lokhttp3/ResponseBody;)Ljava/lang/Object;", "Lokhttp3/MediaType;", "contentType", "Lkotlinx/serialization/SerializationStrategy;", "saver", "value", "Lokhttp3/RequestBody;", "toRequestBody", "(Lokhttp3/MediaType;Lkotlinx/serialization/SerializationStrategy;Ljava/lang/Object;)Lokhttp3/RequestBody;", "a", "Lkotlinx/serialization/BinaryFormat;", "getFormat", "()Lkotlinx/serialization/BinaryFormat;", "kotlinx-serialization"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class FromBytes extends Serializer {
        public final BinaryFormat a;

        public FromBytes(@NotNull BinaryFormat binaryFormat0) {
            Intrinsics.checkNotNullParameter(binaryFormat0, "format");
            super(null);
            this.a = binaryFormat0;
        }

        @Override  // retrofit2.converter.kotlinx.serialization.Serializer
        public Object fromResponseBody(@NotNull DeserializationStrategy deserializationStrategy0, @NotNull ResponseBody responseBody0) {
            Intrinsics.checkNotNullParameter(deserializationStrategy0, "loader");
            Intrinsics.checkNotNullParameter(responseBody0, "body");
            byte[] arr_b = responseBody0.bytes();
            Intrinsics.checkNotNull(arr_b);
            return this.getFormat().decodeFromByteArray(deserializationStrategy0, arr_b);
        }

        @NotNull
        public BinaryFormat getFormat() {
            return this.a;
        }

        @Override  // retrofit2.converter.kotlinx.serialization.Serializer
        public SerialFormat getFormat() {
            return this.getFormat();
        }

        @Override  // retrofit2.converter.kotlinx.serialization.Serializer
        @NotNull
        public RequestBody toRequestBody(@NotNull MediaType mediaType0, @NotNull SerializationStrategy serializationStrategy0, Object object0) {
            Intrinsics.checkNotNullParameter(mediaType0, "contentType");
            Intrinsics.checkNotNullParameter(serializationStrategy0, "saver");
            RequestBody requestBody0 = RequestBody.create(mediaType0, this.getFormat().encodeToByteArray(serializationStrategy0, object0));
            Intrinsics.checkNotNullExpressionValue(requestBody0, "create(...)");
            return requestBody0;
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J+\u0010\u000B\u001A\u00028\u0000\"\u0004\b\u0000\u0010\u00062\f\u0010\b\u001A\b\u0012\u0004\u0012\u00028\u00000\u00072\u0006\u0010\n\u001A\u00020\tH\u0016¢\u0006\u0004\b\u000B\u0010\fJ3\u0010\u0013\u001A\u00020\u0012\"\u0004\b\u0000\u0010\u00062\u0006\u0010\u000E\u001A\u00020\r2\f\u0010\u0010\u001A\b\u0012\u0004\u0012\u00028\u00000\u000F2\u0006\u0010\u0011\u001A\u00028\u0000H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u001A\u0010\u0003\u001A\u00020\u00028\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001A\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lretrofit2/converter/kotlinx/serialization/Serializer$FromString;", "Lretrofit2/converter/kotlinx/serialization/Serializer;", "Lkotlinx/serialization/StringFormat;", "format", "<init>", "(Lkotlinx/serialization/StringFormat;)V", "T", "Lkotlinx/serialization/DeserializationStrategy;", "loader", "Lokhttp3/ResponseBody;", "body", "fromResponseBody", "(Lkotlinx/serialization/DeserializationStrategy;Lokhttp3/ResponseBody;)Ljava/lang/Object;", "Lokhttp3/MediaType;", "contentType", "Lkotlinx/serialization/SerializationStrategy;", "saver", "value", "Lokhttp3/RequestBody;", "toRequestBody", "(Lokhttp3/MediaType;Lkotlinx/serialization/SerializationStrategy;Ljava/lang/Object;)Lokhttp3/RequestBody;", "a", "Lkotlinx/serialization/StringFormat;", "getFormat", "()Lkotlinx/serialization/StringFormat;", "kotlinx-serialization"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class FromString extends Serializer {
        public final StringFormat a;

        public FromString(@NotNull StringFormat stringFormat0) {
            Intrinsics.checkNotNullParameter(stringFormat0, "format");
            super(null);
            this.a = stringFormat0;
        }

        @Override  // retrofit2.converter.kotlinx.serialization.Serializer
        public Object fromResponseBody(@NotNull DeserializationStrategy deserializationStrategy0, @NotNull ResponseBody responseBody0) {
            Intrinsics.checkNotNullParameter(deserializationStrategy0, "loader");
            Intrinsics.checkNotNullParameter(responseBody0, "body");
            String s = responseBody0.string();
            Intrinsics.checkNotNull(s);
            return this.getFormat().decodeFromString(deserializationStrategy0, s);
        }

        @Override  // retrofit2.converter.kotlinx.serialization.Serializer
        public SerialFormat getFormat() {
            return this.getFormat();
        }

        @NotNull
        public StringFormat getFormat() {
            return this.a;
        }

        @Override  // retrofit2.converter.kotlinx.serialization.Serializer
        @NotNull
        public RequestBody toRequestBody(@NotNull MediaType mediaType0, @NotNull SerializationStrategy serializationStrategy0, Object object0) {
            Intrinsics.checkNotNullParameter(mediaType0, "contentType");
            Intrinsics.checkNotNullParameter(serializationStrategy0, "saver");
            RequestBody requestBody0 = RequestBody.create(mediaType0, this.getFormat().encodeToString(serializationStrategy0, object0));
            Intrinsics.checkNotNullExpressionValue(requestBody0, "create(...)");
            return requestBody0;
        }
    }

    public Serializer(DefaultConstructorMarker defaultConstructorMarker0) {
    }

    public abstract Object fromResponseBody(@NotNull DeserializationStrategy arg1, @NotNull ResponseBody arg2);

    @NotNull
    public abstract SerialFormat getFormat();

    @NotNull
    public final KSerializer serializer(@NotNull Type type0) {
        Intrinsics.checkNotNullParameter(type0, "type");
        return SerializersKt.serializer(this.getFormat().getSerializersModule(), type0);
    }

    @NotNull
    public abstract RequestBody toRequestBody(@NotNull MediaType arg1, @NotNull SerializationStrategy arg2, Object arg3);
}

