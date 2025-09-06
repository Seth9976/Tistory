package retrofit2.converter.kotlinx.serialization;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import okhttp3.MediaType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import retrofit2.Converter;
import retrofit2.Retrofit;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u001B\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J;\u0010\u0011\u001A\u000E\u0012\u0004\u0012\u00020\u0010\u0012\u0002\b\u0003\u0018\u00010\u000F2\u0006\u0010\t\u001A\u00020\b2\u000E\u0010\f\u001A\n\u0012\u0006\b\u0001\u0012\u00020\u000B0\n2\u0006\u0010\u000E\u001A\u00020\rH\u0016¢\u0006\u0004\b\u0011\u0010\u0012JK\u0010\u0016\u001A\u000E\u0012\u0002\b\u0003\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u000F2\u0006\u0010\t\u001A\u00020\b2\u000E\u0010\u0013\u001A\n\u0012\u0006\b\u0001\u0012\u00020\u000B0\n2\u000E\u0010\u0014\u001A\n\u0012\u0006\b\u0001\u0012\u00020\u000B0\n2\u0006\u0010\u000E\u001A\u00020\rH\u0016¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lretrofit2/converter/kotlinx/serialization/Factory;", "Lretrofit2/Converter$Factory;", "Lokhttp3/MediaType;", "contentType", "Lretrofit2/converter/kotlinx/serialization/Serializer;", "serializer", "<init>", "(Lokhttp3/MediaType;Lretrofit2/converter/kotlinx/serialization/Serializer;)V", "Ljava/lang/reflect/Type;", "type", "", "", "annotations", "Lretrofit2/Retrofit;", "retrofit", "Lretrofit2/Converter;", "Lokhttp3/ResponseBody;", "responseBodyConverter", "(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;Lretrofit2/Retrofit;)Lretrofit2/Converter;", "parameterAnnotations", "methodAnnotations", "Lokhttp3/RequestBody;", "requestBodyConverter", "(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;[Ljava/lang/annotation/Annotation;Lretrofit2/Retrofit;)Lretrofit2/Converter;", "kotlinx-serialization"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class Factory extends retrofit2.Converter.Factory {
    public final MediaType a;
    public final Serializer b;

    public Factory(@NotNull MediaType mediaType0, @NotNull Serializer serializer0) {
        Intrinsics.checkNotNullParameter(mediaType0, "contentType");
        Intrinsics.checkNotNullParameter(serializer0, "serializer");
        super();
        this.a = mediaType0;
        this.b = serializer0;
    }

    @Override  // retrofit2.Converter$Factory
    @Nullable
    public Converter requestBodyConverter(@NotNull Type type0, @NotNull Annotation[] arr_annotation, @NotNull Annotation[] arr_annotation1, @NotNull Retrofit retrofit0) {
        Intrinsics.checkNotNullParameter(type0, "type");
        Intrinsics.checkNotNullParameter(arr_annotation, "parameterAnnotations");
        Intrinsics.checkNotNullParameter(arr_annotation1, "methodAnnotations");
        Intrinsics.checkNotNullParameter(retrofit0, "retrofit");
        KSerializer kSerializer0 = this.b.serializer(type0);
        return new SerializationStrategyConverter(this.a, kSerializer0, this.b);
    }

    @Override  // retrofit2.Converter$Factory
    @Nullable
    public Converter responseBodyConverter(@NotNull Type type0, @NotNull Annotation[] arr_annotation, @NotNull Retrofit retrofit0) {
        Intrinsics.checkNotNullParameter(type0, "type");
        Intrinsics.checkNotNullParameter(arr_annotation, "annotations");
        Intrinsics.checkNotNullParameter(retrofit0, "retrofit");
        return new DeserializationStrategyConverter(this.b.serializer(type0), this.b);
    }
}

