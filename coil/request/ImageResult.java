package coil.request;

import android.graphics.drawable.Drawable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001R\u0016\u0010\u0005\u001A\u0004\u0018\u00010\u00028&X¦\u0004¢\u0006\u0006\u001A\u0004\b\u0003\u0010\u0004R\u0014\u0010\t\u001A\u00020\u00068&X¦\u0004¢\u0006\u0006\u001A\u0004\b\u0007\u0010\b\u0082\u0001\u0002\n\u000B¨\u0006\f"}, d2 = {"Lcoil/request/ImageResult;", "", "Landroid/graphics/drawable/Drawable;", "getDrawable", "()Landroid/graphics/drawable/Drawable;", "drawable", "Lcoil/request/ImageRequest;", "getRequest", "()Lcoil/request/ImageRequest;", "request", "Lcoil/request/ErrorResult;", "Lcoil/request/SuccessResult;", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public abstract class ImageResult {
    public ImageResult(DefaultConstructorMarker defaultConstructorMarker0) {
    }

    @Nullable
    public abstract Drawable getDrawable();

    @NotNull
    public abstract ImageRequest getRequest();
}

