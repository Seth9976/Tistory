package com.kakao.kandinsky.core.filter.usecase;

import android.graphics.Bitmap;
import com.kakao.kandinsky.core.filter.repository.FilterRepository;
import com.kakao.kandinsky.core.kdphoto.Blur;
import com.kakao.kandinsky.core.kdphoto.Effect;
import com.kakao.kandinsky.core.kdphoto.Filter;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005JT\u0010\u0013\u001A\u00020\u00062\u0006\u0010\u0007\u001A\u00020\u00062\u0006\u0010\t\u001A\u00020\b2\b\b\u0002\u0010\u000B\u001A\u00020\n2\n\b\u0002\u0010\r\u001A\u0004\u0018\u00010\f2\u0010\b\u0002\u0010\u0010\u001A\n\u0012\u0004\u0012\u00020\u000F\u0018\u00010\u000E2\n\b\u0002\u0010\u0012\u001A\u0004\u0018\u00010\u0011H\u0086B¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/kakao/kandinsky/core/filter/usecase/GetFilteredBitmapUseCase;", "", "Lcom/kakao/kandinsky/core/filter/repository/FilterRepository;", "filterRepository", "<init>", "(Lcom/kakao/kandinsky/core/filter/repository/FilterRepository;)V", "Landroid/graphics/Bitmap;", "original", "Lcom/kakao/kandinsky/core/kdphoto/Filter;", "filter", "", "filterIntensity", "Lcom/kakao/kandinsky/core/kdphoto/Effect;", "effect", "", "Lcom/kakao/kandinsky/core/kdphoto/Mosaic;", "mosaic", "Lcom/kakao/kandinsky/core/kdphoto/Blur;", "blur", "invoke", "(Landroid/graphics/Bitmap;Lcom/kakao/kandinsky/core/kdphoto/Filter;FLcom/kakao/kandinsky/core/kdphoto/Effect;Ljava/util/List;Lcom/kakao/kandinsky/core/kdphoto/Blur;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "filter_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class GetFilteredBitmapUseCase {
    public final FilterRepository a;

    @Inject
    public GetFilteredBitmapUseCase(@NotNull FilterRepository filterRepository0) {
        Intrinsics.checkNotNullParameter(filterRepository0, "filterRepository");
        super();
        this.a = filterRepository0;
    }

    @Nullable
    public final Object invoke(@NotNull Bitmap bitmap0, @NotNull Filter filter0, float f, @Nullable Effect effect0, @Nullable List list0, @Nullable Blur blur0, @NotNull Continuation continuation0) {
        return this.a.getFilteredBitmap(bitmap0, filter0, f, effect0, list0, blur0, continuation0);
    }

    public static Object invoke$default(GetFilteredBitmapUseCase getFilteredBitmapUseCase0, Bitmap bitmap0, Filter filter0, float f, Effect effect0, List list0, Blur blur0, Continuation continuation0, int v, Object object0) {
        float f1 = (v & 4) == 0 ? f : 1.0f;
        Effect effect1 = (v & 8) == 0 ? effect0 : null;
        List list1 = (v & 16) == 0 ? list0 : null;
        return (v & 0x20) == 0 ? getFilteredBitmapUseCase0.invoke(bitmap0, filter0, f1, effect1, list1, blur0, continuation0) : getFilteredBitmapUseCase0.invoke(bitmap0, filter0, f1, effect1, list1, null, continuation0);
    }
}

