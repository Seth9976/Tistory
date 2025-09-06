package coil.request;

import android.graphics.drawable.Drawable;
import coil.decode.DataSource;
import coil.memory.MemoryCache.Key;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r0.a;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u001B\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u0012\u0006\u0010\u0007\u001A\u00020\u0006\u0012\n\b\u0002\u0010\t\u001A\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000B\u001A\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\r\u001A\u00020\f\u0012\b\b\u0002\u0010\u000E\u001A\u00020\f¢\u0006\u0004\b\u000F\u0010\u0010JW\u0010\u0011\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00042\b\b\u0002\u0010\u0007\u001A\u00020\u00062\n\b\u0002\u0010\t\u001A\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000B\u001A\u0004\u0018\u00010\n2\b\b\u0002\u0010\r\u001A\u00020\f2\b\b\u0002\u0010\u000E\u001A\u00020\f¢\u0006\u0004\b\u0011\u0010\u0012J\u001A\u0010\u0015\u001A\u00020\f2\b\u0010\u0014\u001A\u0004\u0018\u00010\u0013H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000F\u0010\u0018\u001A\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u001A\u0010\u0003\u001A\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001A\u0010\u001B\u001A\u0004\b\u001C\u0010\u001DR\u001A\u0010\u0005\u001A\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001E\u0010\u001F\u001A\u0004\b \u0010!R\u0017\u0010\u0007\u001A\u00020\u00068\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001A\u0004\b$\u0010%R\u0019\u0010\t\u001A\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b&\u0010\'\u001A\u0004\b(\u0010)R\u0019\u0010\u000B\u001A\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b*\u0010+\u001A\u0004\b,\u0010-R\u0017\u0010\r\u001A\u00020\f8\u0006¢\u0006\f\n\u0004\b.\u0010/\u001A\u0004\b\r\u00100R\u0017\u0010\u000E\u001A\u00020\f8\u0006¢\u0006\f\n\u0004\b1\u0010/\u001A\u0004\b\u000E\u00100¨\u00062"}, d2 = {"Lcoil/request/SuccessResult;", "Lcoil/request/ImageResult;", "Landroid/graphics/drawable/Drawable;", "drawable", "Lcoil/request/ImageRequest;", "request", "Lcoil/decode/DataSource;", "dataSource", "Lcoil/memory/MemoryCache$Key;", "memoryCacheKey", "", "diskCacheKey", "", "isSampled", "isPlaceholderCached", "<init>", "(Landroid/graphics/drawable/Drawable;Lcoil/request/ImageRequest;Lcoil/decode/DataSource;Lcoil/memory/MemoryCache$Key;Ljava/lang/String;ZZ)V", "copy", "(Landroid/graphics/drawable/Drawable;Lcoil/request/ImageRequest;Lcoil/decode/DataSource;Lcoil/memory/MemoryCache$Key;Ljava/lang/String;ZZ)Lcoil/request/SuccessResult;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "a", "Landroid/graphics/drawable/Drawable;", "getDrawable", "()Landroid/graphics/drawable/Drawable;", "b", "Lcoil/request/ImageRequest;", "getRequest", "()Lcoil/request/ImageRequest;", "c", "Lcoil/decode/DataSource;", "getDataSource", "()Lcoil/decode/DataSource;", "d", "Lcoil/memory/MemoryCache$Key;", "getMemoryCacheKey", "()Lcoil/memory/MemoryCache$Key;", "e", "Ljava/lang/String;", "getDiskCacheKey", "()Ljava/lang/String;", "f", "Z", "()Z", "g", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class SuccessResult extends ImageResult {
    public final Drawable a;
    public final ImageRequest b;
    public final DataSource c;
    public final Key d;
    public final String e;
    public final boolean f;
    public final boolean g;

    public SuccessResult(@NotNull Drawable drawable0, @NotNull ImageRequest imageRequest0, @NotNull DataSource dataSource0, @Nullable Key memoryCache$Key0, @Nullable String s, boolean z, boolean z1) {
        super(null);
        this.a = drawable0;
        this.b = imageRequest0;
        this.c = dataSource0;
        this.d = memoryCache$Key0;
        this.e = s;
        this.f = z;
        this.g = z1;
    }

    public SuccessResult(Drawable drawable0, ImageRequest imageRequest0, DataSource dataSource0, Key memoryCache$Key0, String s, boolean z, boolean z1, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        this(drawable0, imageRequest0, dataSource0, ((v & 8) == 0 ? memoryCache$Key0 : null), ((v & 16) == 0 ? s : null), ((v & 0x20) == 0 ? z : false), ((v & 0x40) == 0 ? z1 : false));
    }

    @NotNull
    public final SuccessResult copy(@NotNull Drawable drawable0, @NotNull ImageRequest imageRequest0, @NotNull DataSource dataSource0, @Nullable Key memoryCache$Key0, @Nullable String s, boolean z, boolean z1) {
        return new SuccessResult(drawable0, imageRequest0, dataSource0, memoryCache$Key0, s, z, z1);
    }

    public static SuccessResult copy$default(SuccessResult successResult0, Drawable drawable0, ImageRequest imageRequest0, DataSource dataSource0, Key memoryCache$Key0, String s, boolean z, boolean z1, int v, Object object0) {
        if((v & 1) != 0) {
            drawable0 = successResult0.getDrawable();
        }
        if((v & 2) != 0) {
            imageRequest0 = successResult0.getRequest();
        }
        if((v & 4) != 0) {
            dataSource0 = successResult0.c;
        }
        if((v & 8) != 0) {
            memoryCache$Key0 = successResult0.d;
        }
        if((v & 16) != 0) {
            s = successResult0.e;
        }
        if((v & 0x20) != 0) {
            z = successResult0.f;
        }
        if((v & 0x40) != 0) {
            z1 = successResult0.g;
        }
        return successResult0.copy(drawable0, imageRequest0, dataSource0, memoryCache$Key0, s, z, z1);
    }

    // 去混淆评级： 中等(60)
    @Override
    public boolean equals(@Nullable Object object0) {
        return this == object0 ? true : object0 instanceof SuccessResult && Intrinsics.areEqual(this.getDrawable(), ((SuccessResult)object0).getDrawable()) && Intrinsics.areEqual(this.getRequest(), ((SuccessResult)object0).getRequest()) && this.c == ((SuccessResult)object0).c && Intrinsics.areEqual(this.d, ((SuccessResult)object0).d) && Intrinsics.areEqual(this.e, ((SuccessResult)object0).e) && this.f == ((SuccessResult)object0).f && this.g == ((SuccessResult)object0).g;
    }

    @NotNull
    public final DataSource getDataSource() {
        return this.c;
    }

    @Nullable
    public final String getDiskCacheKey() {
        return this.e;
    }

    @Override  // coil.request.ImageResult
    @NotNull
    public Drawable getDrawable() {
        return this.a;
    }

    @Nullable
    public final Key getMemoryCacheKey() {
        return this.d;
    }

    @Override  // coil.request.ImageResult
    @NotNull
    public ImageRequest getRequest() {
        return this.b;
    }

    @Override
    public int hashCode() {
        int v = this.getDrawable().hashCode();
        int v1 = this.getRequest().hashCode();
        int v2 = this.c.hashCode();
        int v3 = 0;
        int v4 = this.d == null ? 0 : this.d.hashCode();
        String s = this.e;
        if(s != null) {
            v3 = s.hashCode();
        }
        return Boolean.hashCode(this.g) + a.e((((v2 + (v1 + v * 0x1F) * 0x1F) * 0x1F + v4) * 0x1F + v3) * 0x1F, 0x1F, this.f);
    }

    public final boolean isPlaceholderCached() {
        return this.g;
    }

    public final boolean isSampled() {
        return this.f;
    }
}

