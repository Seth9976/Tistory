package coil.fetch;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.TypedValue;
import android.webkit.MimeTypeMap;
import coil.ImageLoader;
import coil.decode.DataSource;
import coil.decode.ImageSources;
import coil.decode.ResourceMetadata;
import coil.request.Options;
import coil.util.-Contexts;
import coil.util.-Utils;
import coil.util.DrawableUtils;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.o;
import kotlin.text.p;
import okio.Okio;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u001E\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u000B2\u00020\u0001:\u0002\u000B\fB\u0017\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001A\u00020\bH\u0096@¢\u0006\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lcoil/fetch/ResourceUriFetcher;", "Lcoil/fetch/Fetcher;", "Landroid/net/Uri;", "data", "Lcoil/request/Options;", "options", "<init>", "(Landroid/net/Uri;Lcoil/request/Options;)V", "Lcoil/fetch/FetchResult;", "fetch", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "Factory", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nResourceUriFetcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ResourceUriFetcher.kt\ncoil/fetch/ResourceUriFetcher\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Bitmaps.kt\ncoil/util/-Bitmaps\n+ 4 BitmapDrawable.kt\nandroidx/core/graphics/drawable/BitmapDrawableKt\n*L\n1#1,100:1\n1#2:101\n50#3:102\n28#4:103\n*S KotlinDebug\n*F\n+ 1 ResourceUriFetcher.kt\ncoil/fetch/ResourceUriFetcher\n*L\n58#1:102\n58#1:103\n*E\n"})
public final class ResourceUriFetcher implements Fetcher {
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000E\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001A\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcoil/fetch/ResourceUriFetcher$Companion;", "", "", "MIME_TYPE_XML", "Ljava/lang/String;", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J)\u0010\u000B\u001A\u0004\u0018\u00010\n2\u0006\u0010\u0005\u001A\u00020\u00022\u0006\u0010\u0007\u001A\u00020\u00062\u0006\u0010\t\u001A\u00020\bH\u0016¢\u0006\u0004\b\u000B\u0010\f¨\u0006\r"}, d2 = {"Lcoil/fetch/ResourceUriFetcher$Factory;", "Lcoil/fetch/Fetcher$Factory;", "Landroid/net/Uri;", "<init>", "()V", "data", "Lcoil/request/Options;", "options", "Lcoil/ImageLoader;", "imageLoader", "Lcoil/fetch/Fetcher;", "create", "(Landroid/net/Uri;Lcoil/request/Options;Lcoil/ImageLoader;)Lcoil/fetch/Fetcher;", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Factory implements coil.fetch.Fetcher.Factory {
        @Nullable
        public Fetcher create(@NotNull Uri uri0, @NotNull Options options0, @NotNull ImageLoader imageLoader0) {
            return !Intrinsics.areEqual(uri0.getScheme(), "android.resource") ? null : new ResourceUriFetcher(uri0, options0);
        }

        @Override  // coil.fetch.Fetcher$Factory
        public Fetcher create(Object object0, Options options0, ImageLoader imageLoader0) {
            return this.create(((Uri)object0), options0, imageLoader0);
        }
    }

    @NotNull
    public static final Companion Companion;
    public final Uri a;
    public final Options b;

    static {
        ResourceUriFetcher.Companion = new Companion(null);
    }

    public ResourceUriFetcher(@NotNull Uri uri0, @NotNull Options options0) {
        this.a = uri0;
        this.b = options0;
    }

    @Override  // coil.fetch.Fetcher
    @Nullable
    public Object fetch(@NotNull Continuation continuation0) {
        Uri uri0 = this.a;
        String s = uri0.getAuthority();
        if(s != null) {
            if(p.isBlank(s)) {
                s = null;
            }
            if(s != null) {
                String s1 = (String)CollectionsKt___CollectionsKt.lastOrNull(uri0.getPathSegments());
                if(s1 != null) {
                    Integer integer0 = o.toIntOrNull(s1);
                    if(integer0 != null) {
                        int v = (int)integer0;
                        Options options0 = this.b;
                        Context context0 = options0.getContext();
                        Resources resources0 = Intrinsics.areEqual(s, "net.daum.android.tistoryapp") ? context0.getResources() : context0.getPackageManager().getResourcesForApplication(s);
                        TypedValue typedValue0 = new TypedValue();
                        resources0.getValue(v, typedValue0, true);
                        CharSequence charSequence0 = typedValue0.string;
                        String s2 = charSequence0.subSequence(StringsKt__StringsKt.lastIndexOf$default(charSequence0, '/', 0, false, 6, null), charSequence0.length()).toString();
                        String s3 = -Utils.getMimeTypeFromUrl(MimeTypeMap.getSingleton(), s2);
                        if(Intrinsics.areEqual(s3, "text/xml")) {
                            Drawable drawable0 = Intrinsics.areEqual(s, "net.daum.android.tistoryapp") ? -Contexts.getDrawableCompat(context0, v) : -Contexts.getXmlDrawableCompat(context0, resources0, v);
                            boolean z = -Utils.isVector(drawable0);
                            if(z) {
                                Bitmap bitmap0 = DrawableUtils.INSTANCE.convertToBitmap(drawable0, options0.getConfig(), options0.getSize(), options0.getScale(), options0.getAllowInexactSize());
                                drawable0 = new BitmapDrawable(context0.getResources(), bitmap0);
                            }
                            return new DrawableResult(drawable0, z, DataSource.DISK);
                        }
                        TypedValue typedValue1 = new TypedValue();
                        return new SourceResult(ImageSources.create(Okio.buffer(Okio.source(resources0.openRawResource(v, typedValue1))), context0, new ResourceMetadata(s, v, typedValue1.density)), s3, DataSource.DISK);
                    }
                }
                throw new IllegalStateException("Invalid android.resource URI: " + uri0);
            }
        }
        throw new IllegalStateException("Invalid android.resource URI: " + uri0);
    }
}

