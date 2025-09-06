package retrofit2.converter.kotlinx.serialization;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.DeserializationStrategy;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;
import retrofit2.Converter;

@Metadata(d1 = {"\u0000\u001C\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000E\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00028\u00000\u0002B\u001D\u0012\f\u0010\u0005\u001A\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0010\u0007\u001A\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000B\u001A\u00028\u00002\u0006\u0010\n\u001A\u00020\u0003H\u0016¢\u0006\u0004\b\u000B\u0010\f¨\u0006\r"}, d2 = {"Lretrofit2/converter/kotlinx/serialization/DeserializationStrategyConverter;", "T", "Lretrofit2/Converter;", "Lokhttp3/ResponseBody;", "Lkotlinx/serialization/DeserializationStrategy;", "loader", "Lretrofit2/converter/kotlinx/serialization/Serializer;", "serializer", "<init>", "(Lkotlinx/serialization/DeserializationStrategy;Lretrofit2/converter/kotlinx/serialization/Serializer;)V", "value", "convert", "(Lokhttp3/ResponseBody;)Ljava/lang/Object;", "kotlinx-serialization"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class DeserializationStrategyConverter implements Converter {
    public final DeserializationStrategy a;
    public final Serializer b;

    public DeserializationStrategyConverter(@NotNull DeserializationStrategy deserializationStrategy0, @NotNull Serializer serializer0) {
        Intrinsics.checkNotNullParameter(deserializationStrategy0, "loader");
        Intrinsics.checkNotNullParameter(serializer0, "serializer");
        super();
        this.a = deserializationStrategy0;
        this.b = serializer0;
    }

    @Override  // retrofit2.Converter
    public Object convert(Object object0) {
        return this.convert(((ResponseBody)object0));
    }

    public Object convert(@NotNull ResponseBody responseBody0) {
        Intrinsics.checkNotNullParameter(responseBody0, "value");
        return this.b.fromResponseBody(this.a, responseBody0);
    }
}

