package coil.fetch;

import android.net.Uri;
import android.webkit.MimeTypeMap;
import coil.ImageLoader;
import coil.decode.AssetMetadata;
import coil.decode.DataSource;
import coil.decode.ImageSources;
import coil.request.Options;
import coil.util.-Utils;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import okio.BufferedSource;
import okio.Okio;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u001E\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001\u000BB\u0017\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001A\u00020\bH\u0096@¢\u0006\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lcoil/fetch/AssetUriFetcher;", "Lcoil/fetch/Fetcher;", "Landroid/net/Uri;", "data", "Lcoil/request/Options;", "options", "<init>", "(Landroid/net/Uri;Lcoil/request/Options;)V", "Lcoil/fetch/FetchResult;", "fetch", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Factory", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class AssetUriFetcher implements Fetcher {
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\"\u0010\u0004\u001A\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001A\u00020\u00022\u0006\u0010\u0007\u001A\u00020\b2\u0006\u0010\t\u001A\u00020\nH\u0016¨\u0006\u000B"}, d2 = {"Lcoil/fetch/AssetUriFetcher$Factory;", "Lcoil/fetch/Fetcher$Factory;", "Landroid/net/Uri;", "()V", "create", "Lcoil/fetch/Fetcher;", "data", "options", "Lcoil/request/Options;", "imageLoader", "Lcoil/ImageLoader;", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Factory implements coil.fetch.Fetcher.Factory {
        @Nullable
        public Fetcher create(@NotNull Uri uri0, @NotNull Options options0, @NotNull ImageLoader imageLoader0) {
            return !-Utils.isAssetUri(uri0) ? null : new AssetUriFetcher(uri0, options0);
        }

        @Override  // coil.fetch.Fetcher$Factory
        public Fetcher create(Object object0, Options options0, ImageLoader imageLoader0) {
            return this.create(((Uri)object0), options0, imageLoader0);
        }
    }

    public final Uri a;
    public final Options b;

    public AssetUriFetcher(@NotNull Uri uri0, @NotNull Options options0) {
        this.a = uri0;
        this.b = options0;
    }

    @Override  // coil.fetch.Fetcher
    @Nullable
    public Object fetch(@NotNull Continuation continuation0) {
        String s = CollectionsKt___CollectionsKt.joinToString$default(CollectionsKt___CollectionsKt.drop(this.a.getPathSegments(), 1), "/", null, null, 0, null, null, 62, null);
        BufferedSource bufferedSource0 = Okio.buffer(Okio.source(this.b.getContext().getAssets().open(s)));
        AssetMetadata assetMetadata0 = new AssetMetadata(s);
        return new SourceResult(ImageSources.create(bufferedSource0, this.b.getContext(), assetMetadata0), -Utils.getMimeTypeFromUrl(MimeTypeMap.getSingleton(), s), DataSource.DISK);
    }
}

