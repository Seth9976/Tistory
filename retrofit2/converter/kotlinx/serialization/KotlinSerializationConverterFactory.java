package retrofit2.converter.kotlinx.serialization;

import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.BinaryFormat;
import kotlinx.serialization.StringFormat;
import okhttp3.MediaType;
import org.jetbrains.annotations.NotNull;
import retrofit2.Converter.Factory;

@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001A\u0019\u0010\u0000\u001A\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001A\u00020\u0004H\u0007¢\u0006\u0002\b\u0005\u001A\u0019\u0010\u0000\u001A\u00020\u0001*\u00020\u00062\u0006\u0010\u0003\u001A\u00020\u0004H\u0007¢\u0006\u0002\b\u0005¨\u0006\u0007"}, d2 = {"asConverterFactory", "Lretrofit2/Converter$Factory;", "Lkotlinx/serialization/BinaryFormat;", "contentType", "Lokhttp3/MediaType;", "create", "Lkotlinx/serialization/StringFormat;", "kotlinx-serialization"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
@JvmName(name = "KotlinSerializationConverterFactory")
public final class KotlinSerializationConverterFactory {
    @JvmName(name = "create")
    @NotNull
    public static final Factory create(@NotNull BinaryFormat binaryFormat0, @NotNull MediaType mediaType0) {
        Intrinsics.checkNotNullParameter(binaryFormat0, "<this>");
        Intrinsics.checkNotNullParameter(mediaType0, "contentType");
        return new retrofit2.converter.kotlinx.serialization.Factory(mediaType0, new FromBytes(binaryFormat0));
    }

    @JvmName(name = "create")
    @NotNull
    public static final Factory create(@NotNull StringFormat stringFormat0, @NotNull MediaType mediaType0) {
        Intrinsics.checkNotNullParameter(stringFormat0, "<this>");
        Intrinsics.checkNotNullParameter(mediaType0, "contentType");
        return new retrofit2.converter.kotlinx.serialization.Factory(mediaType0, new FromString(stringFormat0));
    }
}

