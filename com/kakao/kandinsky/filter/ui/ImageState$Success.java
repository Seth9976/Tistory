package com.kakao.kandinsky.filter.ui;

import android.graphics.Bitmap;
import androidx.compose.runtime.internal.StabilityInferred;
import ga.g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001A\u0010\t\u001A\u00020\b2\b\b\u0002\u0010\u0003\u001A\u00020\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001A\u00020\u000BHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000F\u001A\u00020\u000EHÖ\u0001¢\u0006\u0004\b\u000F\u0010\u0010J\u001A\u0010\u0014\u001A\u00020\u00132\b\u0010\u0012\u001A\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001A\u0004\b\u0018\u0010\u0007¨\u0006\u0019"}, d2 = {"com/kakao/kandinsky/filter/ui/ImageState$Success", "Lga/g;", "Landroid/graphics/Bitmap;", "bitmap", "<init>", "(Landroid/graphics/Bitmap;)V", "component1", "()Landroid/graphics/Bitmap;", "Lcom/kakao/kandinsky/filter/ui/ImageState$Success;", "copy", "(Landroid/graphics/Bitmap;)Lcom/kakao/kandinsky/filter/ui/ImageState$Success;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Landroid/graphics/Bitmap;", "getBitmap", "filter_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class ImageState.Success extends g {
    public static final int $stable = 8;
    public final Bitmap a;

    public ImageState.Success(@NotNull Bitmap bitmap0) {
        Intrinsics.checkNotNullParameter(bitmap0, "bitmap");
        super();
        this.a = bitmap0;
    }

    @NotNull
    public final Bitmap component1() {
        return this.a;
    }

    @NotNull
    public final ImageState.Success copy(@NotNull Bitmap bitmap0) {
        Intrinsics.checkNotNullParameter(bitmap0, "bitmap");
        return new ImageState.Success(bitmap0);
    }

    public static ImageState.Success copy$default(ImageState.Success imageState$Success0, Bitmap bitmap0, int v, Object object0) {
        if((v & 1) != 0) {
            bitmap0 = imageState$Success0.a;
        }
        return imageState$Success0.copy(bitmap0);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof ImageState.Success ? Intrinsics.areEqual(this.a, ((ImageState.Success)object0).a) : false;
    }

    @NotNull
    public final Bitmap getBitmap() {
        return this.a;
    }

    @Override
    public int hashCode() {
        return this.a.hashCode();
    }

    @Override
    @NotNull
    public String toString() {
        return "Success(bitmap=" + this.a + ")";
    }
}

