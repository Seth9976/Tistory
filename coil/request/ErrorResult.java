package coil.request;

import android.graphics.drawable.Drawable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000F\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0003\u001A\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u0012\u0006\u0010\u0007\u001A\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ-\u0010\n\u001A\u00020\u00002\n\b\u0002\u0010\u0003\u001A\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00042\b\b\u0002\u0010\u0007\u001A\u00020\u0006¢\u0006\u0004\b\n\u0010\u000BJ\u001A\u0010\u000F\u001A\u00020\u000E2\b\u0010\r\u001A\u0004\u0018\u00010\fH\u0096\u0002¢\u0006\u0004\b\u000F\u0010\u0010J\u000F\u0010\u0012\u001A\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u001C\u0010\u0003\u001A\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001A\u0004\b\u0016\u0010\u0017R\u001A\u0010\u0005\u001A\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001A\u0004\b\u001A\u0010\u001BR\u0017\u0010\u0007\u001A\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001C\u0010\u001D\u001A\u0004\b\u001E\u0010\u001F¨\u0006 "}, d2 = {"Lcoil/request/ErrorResult;", "Lcoil/request/ImageResult;", "Landroid/graphics/drawable/Drawable;", "drawable", "Lcoil/request/ImageRequest;", "request", "", "throwable", "<init>", "(Landroid/graphics/drawable/Drawable;Lcoil/request/ImageRequest;Ljava/lang/Throwable;)V", "copy", "(Landroid/graphics/drawable/Drawable;Lcoil/request/ImageRequest;Ljava/lang/Throwable;)Lcoil/request/ErrorResult;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "a", "Landroid/graphics/drawable/Drawable;", "getDrawable", "()Landroid/graphics/drawable/Drawable;", "b", "Lcoil/request/ImageRequest;", "getRequest", "()Lcoil/request/ImageRequest;", "c", "Ljava/lang/Throwable;", "getThrowable", "()Ljava/lang/Throwable;", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class ErrorResult extends ImageResult {
    public final Drawable a;
    public final ImageRequest b;
    public final Throwable c;

    public ErrorResult(@Nullable Drawable drawable0, @NotNull ImageRequest imageRequest0, @NotNull Throwable throwable0) {
        super(null);
        this.a = drawable0;
        this.b = imageRequest0;
        this.c = throwable0;
    }

    @NotNull
    public final ErrorResult copy(@Nullable Drawable drawable0, @NotNull ImageRequest imageRequest0, @NotNull Throwable throwable0) {
        return new ErrorResult(drawable0, imageRequest0, throwable0);
    }

    public static ErrorResult copy$default(ErrorResult errorResult0, Drawable drawable0, ImageRequest imageRequest0, Throwable throwable0, int v, Object object0) {
        if((v & 1) != 0) {
            drawable0 = errorResult0.getDrawable();
        }
        if((v & 2) != 0) {
            imageRequest0 = errorResult0.getRequest();
        }
        if((v & 4) != 0) {
            throwable0 = errorResult0.c;
        }
        return errorResult0.copy(drawable0, imageRequest0, throwable0);
    }

    // 去混淆评级： 中等(50)
    @Override
    public boolean equals(@Nullable Object object0) {
        return this == object0 ? true : object0 instanceof ErrorResult && Intrinsics.areEqual(this.getDrawable(), ((ErrorResult)object0).getDrawable()) && Intrinsics.areEqual(this.getRequest(), ((ErrorResult)object0).getRequest()) && Intrinsics.areEqual(this.c, ((ErrorResult)object0).c);
    }

    @Override  // coil.request.ImageResult
    @Nullable
    public Drawable getDrawable() {
        return this.a;
    }

    @Override  // coil.request.ImageResult
    @NotNull
    public ImageRequest getRequest() {
        return this.b;
    }

    @NotNull
    public final Throwable getThrowable() {
        return this.c;
    }

    @Override
    public int hashCode() {
        Drawable drawable0 = this.getDrawable();
        return drawable0 == null ? this.c.hashCode() + this.getRequest().hashCode() * 0x1F : this.c.hashCode() + (this.getRequest().hashCode() + drawable0.hashCode() * 0x1F) * 0x1F;
    }
}

