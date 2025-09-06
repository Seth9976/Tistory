package com.kakao.kandinsky.bitmap.usecase;

import android.util.Size;
import com.kakao.kandinsky.bitmap.repository.BitmapRepository;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u001E\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J&\u0010\n\u001A\u0004\u0018\u00010\t2\u0006\u0010\u0006\u001A\u00020\u00012\n\b\u0002\u0010\b\u001A\u0004\u0018\u00010\u0007H\u0086B¢\u0006\u0004\b\n\u0010\u000B¨\u0006\f"}, d2 = {"Lcom/kakao/kandinsky/bitmap/usecase/GetBitmapUseCase;", "", "Lcom/kakao/kandinsky/bitmap/repository/BitmapRepository;", "bitmapRepository", "<init>", "(Lcom/kakao/kandinsky/bitmap/repository/BitmapRepository;)V", "imageData", "Landroid/util/Size;", "requireSize", "Landroid/graphics/Bitmap;", "invoke", "(Ljava/lang/Object;Landroid/util/Size;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "bitmap_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class GetBitmapUseCase {
    public final BitmapRepository a;

    @Inject
    public GetBitmapUseCase(@NotNull BitmapRepository bitmapRepository0) {
        Intrinsics.checkNotNullParameter(bitmapRepository0, "bitmapRepository");
        super();
        this.a = bitmapRepository0;
    }

    @Nullable
    public final Object invoke(@NotNull Object object0, @Nullable Size size0, @NotNull Continuation continuation0) {
        return this.a.getBitmap(object0, size0, continuation0);
    }

    public static Object invoke$default(GetBitmapUseCase getBitmapUseCase0, Object object0, Size size0, Continuation continuation0, int v, Object object1) {
        if((v & 2) != 0) {
            size0 = null;
        }
        return getBitmapUseCase0.invoke(object0, size0, continuation0);
    }
}

