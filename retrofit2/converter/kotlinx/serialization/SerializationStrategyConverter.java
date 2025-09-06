package retrofit2.converter.kotlinx.serialization;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.SerializationStrategy;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import org.jetbrains.annotations.NotNull;
import retrofit2.Converter;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00030\u0002B%\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u0012\f\u0010\u0007\u001A\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\u0006\u0010\t\u001A\u00020\b¢\u0006\u0004\b\n\u0010\u000BJ\u0017\u0010\r\u001A\u00020\u00032\u0006\u0010\f\u001A\u00028\u0000H\u0016¢\u0006\u0004\b\r\u0010\u000E¨\u0006\u000F"}, d2 = {"Lretrofit2/converter/kotlinx/serialization/SerializationStrategyConverter;", "T", "Lretrofit2/Converter;", "Lokhttp3/RequestBody;", "Lokhttp3/MediaType;", "contentType", "Lkotlinx/serialization/SerializationStrategy;", "saver", "Lretrofit2/converter/kotlinx/serialization/Serializer;", "serializer", "<init>", "(Lokhttp3/MediaType;Lkotlinx/serialization/SerializationStrategy;Lretrofit2/converter/kotlinx/serialization/Serializer;)V", "value", "convert", "(Ljava/lang/Object;)Lokhttp3/RequestBody;", "kotlinx-serialization"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class SerializationStrategyConverter implements Converter {
    public final MediaType a;
    public final SerializationStrategy b;
    public final Serializer c;

    public SerializationStrategyConverter(@NotNull MediaType mediaType0, @NotNull SerializationStrategy serializationStrategy0, @NotNull Serializer serializer0) {
        Intrinsics.checkNotNullParameter(mediaType0, "contentType");
        Intrinsics.checkNotNullParameter(serializationStrategy0, "saver");
        Intrinsics.checkNotNullParameter(serializer0, "serializer");
        super();
        this.a = mediaType0;
        this.b = serializationStrategy0;
        this.c = serializer0;
    }

    @Override  // retrofit2.Converter
    public Object convert(Object object0) {
        return this.convert(object0);
    }

    @NotNull
    public RequestBody convert(Object object0) {
        return this.c.toRequestBody(this.a, this.b, object0);
    }
}

