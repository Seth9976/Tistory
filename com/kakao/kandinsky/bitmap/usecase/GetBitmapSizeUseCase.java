package com.kakao.kandinsky.bitmap.usecase;

import android.util.Size;
import com.kakao.kandinsky.bitmap.repository.BitmapRepository;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001E\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\t\u001A\u00020\b2\u0006\u0010\u0007\u001A\u00020\u0006H\u0086\u0002¢\u0006\u0004\b\t\u0010\n¨\u0006\u000B"}, d2 = {"Lcom/kakao/kandinsky/bitmap/usecase/GetBitmapSizeUseCase;", "", "Lcom/kakao/kandinsky/bitmap/repository/BitmapRepository;", "bitmapRepository", "<init>", "(Lcom/kakao/kandinsky/bitmap/repository/BitmapRepository;)V", "", "uri", "Landroid/util/Size;", "invoke", "(Ljava/lang/String;)Landroid/util/Size;", "bitmap_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class GetBitmapSizeUseCase {
    public final BitmapRepository a;

    @Inject
    public GetBitmapSizeUseCase(@NotNull BitmapRepository bitmapRepository0) {
        Intrinsics.checkNotNullParameter(bitmapRepository0, "bitmapRepository");
        super();
        this.a = bitmapRepository0;
    }

    @NotNull
    public final Size invoke(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "uri");
        return this.a.getBitmapSize(s);
    }
}

