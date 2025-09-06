package coil.fetch;

import coil.ImageLoader;
import coil.decode.DataSource;
import coil.decode.ImageSources;
import coil.request.Options;
import java.nio.ByteBuffer;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.SourceDebugExtension;
import okio.Buffer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u001E\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001\u000BB\u0017\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001A\u00020\bH\u0096@¢\u0006\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lcoil/fetch/ByteBufferFetcher;", "Lcoil/fetch/Fetcher;", "Ljava/nio/ByteBuffer;", "data", "Lcoil/request/Options;", "options", "<init>", "(Ljava/nio/ByteBuffer;Lcoil/request/Options;)V", "Lcoil/fetch/FetchResult;", "fetch", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Factory", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nByteBufferFetcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ByteBufferFetcher.kt\ncoil/fetch/ByteBufferFetcher\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,36:1\n1#2:37\n*E\n"})
public final class ByteBufferFetcher implements Fetcher {
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J \u0010\u0004\u001A\u00020\u00052\u0006\u0010\u0006\u001A\u00020\u00022\u0006\u0010\u0007\u001A\u00020\b2\u0006\u0010\t\u001A\u00020\nH\u0016¨\u0006\u000B"}, d2 = {"Lcoil/fetch/ByteBufferFetcher$Factory;", "Lcoil/fetch/Fetcher$Factory;", "Ljava/nio/ByteBuffer;", "()V", "create", "Lcoil/fetch/Fetcher;", "data", "options", "Lcoil/request/Options;", "imageLoader", "Lcoil/ImageLoader;", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Factory implements coil.fetch.Fetcher.Factory {
        @Override  // coil.fetch.Fetcher$Factory
        public Fetcher create(Object object0, Options options0, ImageLoader imageLoader0) {
            return this.create(((ByteBuffer)object0), options0, imageLoader0);
        }

        @NotNull
        public Fetcher create(@NotNull ByteBuffer byteBuffer0, @NotNull Options options0, @NotNull ImageLoader imageLoader0) {
            return new ByteBufferFetcher(byteBuffer0, options0);
        }
    }

    public final ByteBuffer a;
    public final Options b;

    public ByteBufferFetcher(@NotNull ByteBuffer byteBuffer0, @NotNull Options options0) {
        this.a = byteBuffer0;
        this.b = options0;
    }

    @Override  // coil.fetch.Fetcher
    @Nullable
    public Object fetch(@NotNull Continuation continuation0) {
        Buffer buffer0;
        try {
            buffer0 = new Buffer();
            buffer0.write(this.a);
        }
        finally {
            this.a.position(0);
        }
        return new SourceResult(ImageSources.create(buffer0, this.b.getContext()), null, DataSource.MEMORY);
    }
}

