package coil.fetch;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.graphics.Point;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import androidx.annotation.VisibleForTesting;
import coil.ImageLoader;
import coil.decode.ContentMetadata;
import coil.decode.DataSource;
import coil.decode.ImageSources;
import coil.request.Options;
import coil.size.Dimension.Pixels;
import coil.size.Dimension;
import java.io.InputStream;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import okio.Okio;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import s1.c;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0011B\u0017\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001A\u00020\bH\u0096@¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000E\u001A\u00020\u000B2\u0006\u0010\u0003\u001A\u00020\u0002H\u0001¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001A\u00020\u000B2\u0006\u0010\u0003\u001A\u00020\u0002H\u0001¢\u0006\u0004\b\u000F\u0010\r¨\u0006\u0012"}, d2 = {"Lcoil/fetch/ContentUriFetcher;", "Lcoil/fetch/Fetcher;", "Landroid/net/Uri;", "data", "Lcoil/request/Options;", "options", "<init>", "(Landroid/net/Uri;Lcoil/request/Options;)V", "Lcoil/fetch/FetchResult;", "fetch", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "isContactPhotoUri$coil_base_release", "(Landroid/net/Uri;)Z", "isContactPhotoUri", "isMusicThumbnailUri$coil_base_release", "isMusicThumbnailUri", "Factory", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nContentUriFetcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContentUriFetcher.kt\ncoil/fetch/ContentUriFetcher\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,100:1\n1#2:101\n*E\n"})
public final class ContentUriFetcher implements Fetcher {
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J)\u0010\u000B\u001A\u0004\u0018\u00010\n2\u0006\u0010\u0005\u001A\u00020\u00022\u0006\u0010\u0007\u001A\u00020\u00062\u0006\u0010\t\u001A\u00020\bH\u0016¢\u0006\u0004\b\u000B\u0010\f¨\u0006\r"}, d2 = {"Lcoil/fetch/ContentUriFetcher$Factory;", "Lcoil/fetch/Fetcher$Factory;", "Landroid/net/Uri;", "<init>", "()V", "data", "Lcoil/request/Options;", "options", "Lcoil/ImageLoader;", "imageLoader", "Lcoil/fetch/Fetcher;", "create", "(Landroid/net/Uri;Lcoil/request/Options;Lcoil/ImageLoader;)Lcoil/fetch/Fetcher;", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Factory implements coil.fetch.Fetcher.Factory {
        @Nullable
        public Fetcher create(@NotNull Uri uri0, @NotNull Options options0, @NotNull ImageLoader imageLoader0) {
            return !Intrinsics.areEqual(uri0.getScheme(), "content") ? null : new ContentUriFetcher(uri0, options0);
        }

        @Override  // coil.fetch.Fetcher$Factory
        public Fetcher create(Object object0, Options options0, ImageLoader imageLoader0) {
            return this.create(((Uri)object0), options0, imageLoader0);
        }
    }

    public final Uri a;
    public final Options b;

    public ContentUriFetcher(@NotNull Uri uri0, @NotNull Options options0) {
        this.a = uri0;
        this.b = options0;
    }

    @Override  // coil.fetch.Fetcher
    @Nullable
    public Object fetch(@NotNull Continuation continuation0) {
        Bundle bundle0;
        Options options0 = this.b;
        ContentResolver contentResolver0 = options0.getContext().getContentResolver();
        Uri uri0 = this.a;
        InputStream inputStream0 = null;
        if(this.isContactPhotoUri$coil_base_release(uri0)) {
            AssetFileDescriptor assetFileDescriptor0 = contentResolver0.openAssetFileDescriptor(uri0, "r");
            if(assetFileDescriptor0 != null) {
                inputStream0 = assetFileDescriptor0.createInputStream();
            }
            if(inputStream0 == null) {
                throw new IllegalStateException(("Unable to find a contact photo associated with \'" + uri0 + "\'.").toString());
            }
        }
        else {
            if(Build.VERSION.SDK_INT >= 29 && this.isMusicThumbnailUri$coil_base_release(uri0)) {
                Dimension dimension0 = options0.getSize().getWidth();
                Pixels dimension$Pixels0 = dimension0 instanceof Pixels ? ((Pixels)dimension0) : null;
                if(dimension$Pixels0 == null) {
                    bundle0 = null;
                }
                else {
                    int v = dimension$Pixels0.px;
                    Dimension dimension1 = options0.getSize().getHeight();
                    Pixels dimension$Pixels1 = dimension1 instanceof Pixels ? ((Pixels)dimension1) : null;
                    if(dimension$Pixels1 == null) {
                        bundle0 = null;
                    }
                    else {
                        bundle0 = new Bundle(1);
                        bundle0.putParcelable("android.content.extra.SIZE", new Point(v, dimension$Pixels1.px));
                    }
                }
                AssetFileDescriptor assetFileDescriptor1 = c.b(contentResolver0, uri0, bundle0);
                if(assetFileDescriptor1 != null) {
                    inputStream0 = assetFileDescriptor1.createInputStream();
                }
                if(inputStream0 == null) {
                    throw new IllegalStateException(("Unable to find a music thumbnail associated with \'" + uri0 + "\'.").toString());
                }
                return new SourceResult(ImageSources.create(Okio.buffer(Okio.source(inputStream0)), options0.getContext(), new ContentMetadata(uri0)), contentResolver0.getType(uri0), DataSource.DISK);
            }
            inputStream0 = contentResolver0.openInputStream(uri0);
            if(inputStream0 == null) {
                throw new IllegalStateException(("Unable to open \'" + uri0 + "\'.").toString());
            }
        }
        return new SourceResult(ImageSources.create(Okio.buffer(Okio.source(inputStream0)), options0.getContext(), new ContentMetadata(uri0)), contentResolver0.getType(uri0), DataSource.DISK);
    }

    // 去混淆评级： 低(20)
    @VisibleForTesting
    public final boolean isContactPhotoUri$coil_base_release(@NotNull Uri uri0) {
        return Intrinsics.areEqual(uri0.getAuthority(), "com.android.contacts") && Intrinsics.areEqual(uri0.getLastPathSegment(), "display_photo");
    }

    @VisibleForTesting
    public final boolean isMusicThumbnailUri$coil_base_release(@NotNull Uri uri0) {
        if(!Intrinsics.areEqual(uri0.getAuthority(), "media")) {
            return false;
        }
        List list0 = uri0.getPathSegments();
        int v = list0.size();
        return v >= 3 && Intrinsics.areEqual(list0.get(v - 3), "audio") && Intrinsics.areEqual(list0.get(v - 2), "albums");
    }
}

