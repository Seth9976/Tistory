package com.kakao.kandinsky.core.filter;

import android.content.res.AssetManager;
import android.graphics.Bitmap;
import com.kakao.kandinsky.core.kdphoto.Blur;
import com.kakao.kandinsky.core.kdphoto.Effect;
import com.kakao.kandinsky.core.kdphoto.Filter;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v9.a;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001A\u00020\u0003¢\u0006\u0002\u0010\u0004JV\u0010\u0005\u001A\u00020\u00062\u0006\u0010\u0007\u001A\u00020\u00062\n\b\u0002\u0010\b\u001A\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001A\u00020\u000B2\n\b\u0002\u0010\f\u001A\u0004\u0018\u00010\r2\u0010\b\u0002\u0010\u000E\u001A\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000F2\n\b\u0002\u0010\u0011\u001A\u0004\u0018\u00010\u0012H\u0086@¢\u0006\u0002\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/kakao/kandinsky/core/filter/BitmapFilterEngine;", "Lcom/kakao/kandinsky/core/filter/FilterEngine;", "assetManager", "Landroid/content/res/AssetManager;", "(Landroid/content/res/AssetManager;)V", "filterWithBitmapResult", "Landroid/graphics/Bitmap;", "originalBitmap", "filter", "Lcom/kakao/kandinsky/core/kdphoto/Filter;", "filterIntensity", "", "effect", "Lcom/kakao/kandinsky/core/kdphoto/Effect;", "mosaic", "", "Lcom/kakao/kandinsky/core/kdphoto/Mosaic;", "blur", "Lcom/kakao/kandinsky/core/kdphoto/Blur;", "(Landroid/graphics/Bitmap;Lcom/kakao/kandinsky/core/kdphoto/Filter;FLcom/kakao/kandinsky/core/kdphoto/Effect;Ljava/util/List;Lcom/kakao/kandinsky/core/kdphoto/Blur;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "filter_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class BitmapFilterEngine extends FilterEngine {
    public BitmapFilterEngine(@NotNull AssetManager assetManager0) {
        Intrinsics.checkNotNullParameter(assetManager0, "assetManager");
        super(assetManager0);
    }

    @Nullable
    public final Object filterWithBitmapResult(@NotNull Bitmap bitmap0, @Nullable Filter filter0, float f, @Nullable Effect effect0, @Nullable List list0, @Nullable Blur blur0, @NotNull Continuation continuation0) {
        return this.withGLContext(new a(this, bitmap0, filter0, f, effect0, blur0, list0, null), continuation0);
    }

    public static Object filterWithBitmapResult$default(BitmapFilterEngine bitmapFilterEngine0, Bitmap bitmap0, Filter filter0, float f, Effect effect0, List list0, Blur blur0, Continuation continuation0, int v, Object object0) {
        Filter filter1 = (v & 2) == 0 ? filter0 : null;
        float f1 = (v & 4) == 0 ? f : 1.0f;
        Effect effect1 = (v & 8) == 0 ? effect0 : null;
        List list1 = (v & 16) == 0 ? list0 : null;
        return (v & 0x20) == 0 ? bitmapFilterEngine0.filterWithBitmapResult(bitmap0, filter1, f1, effect1, list1, blur0, continuation0) : bitmapFilterEngine0.filterWithBitmapResult(bitmap0, filter1, f1, effect1, list1, null, continuation0);
    }
}

