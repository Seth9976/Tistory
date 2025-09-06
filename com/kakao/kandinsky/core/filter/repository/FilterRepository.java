package com.kakao.kandinsky.core.filter.repository;

import android.content.res.AssetManager;
import android.graphics.Bitmap;
import com.kakao.kandinsky.core.filter.BitmapFilterEngine;
import com.kakao.kandinsky.core.filter.ViewFilterEngine;
import com.kakao.kandinsky.core.filter.info.FilterInfo;
import com.kakao.kandinsky.core.kdphoto.Blur;
import com.kakao.kandinsky.core.kdphoto.Effect;
import com.kakao.kandinsky.core.kdphoto.Filter;
import java.util.List;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import qd.a;

@Singleton
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\b\u0007\u0018\u0000  2\u00020\u0001:\u0001 B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005JP\u0010\u0013\u001A\u00020\u00062\u0006\u0010\u0007\u001A\u00020\u00062\u0006\u0010\t\u001A\u00020\b2\u0006\u0010\u000B\u001A\u00020\n2\n\b\u0002\u0010\r\u001A\u0004\u0018\u00010\f2\u0010\b\u0002\u0010\u0010\u001A\n\u0012\u0004\u0012\u00020\u000F\u0018\u00010\u000E2\b\u0010\u0012\u001A\u0004\u0018\u00010\u0011H\u0086@¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0016\u001A\u00020\u0015¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001A\u00020\u0018H\u0086@¢\u0006\u0004\b\u0019\u0010\u001AR\u001D\u0010\u001F\u001A\b\u0012\u0004\u0012\u00020\b0\u000E8\u0006¢\u0006\f\n\u0004\b\u001B\u0010\u001C\u001A\u0004\b\u001D\u0010\u001E¨\u0006!"}, d2 = {"Lcom/kakao/kandinsky/core/filter/repository/FilterRepository;", "", "Landroid/content/res/AssetManager;", "assetManager", "<init>", "(Landroid/content/res/AssetManager;)V", "Landroid/graphics/Bitmap;", "original", "Lcom/kakao/kandinsky/core/kdphoto/Filter;", "filter", "", "filterIntensity", "Lcom/kakao/kandinsky/core/kdphoto/Effect;", "effect", "", "Lcom/kakao/kandinsky/core/kdphoto/Mosaic;", "mosaic", "Lcom/kakao/kandinsky/core/kdphoto/Blur;", "blur", "getFilteredBitmap", "(Landroid/graphics/Bitmap;Lcom/kakao/kandinsky/core/kdphoto/Filter;FLcom/kakao/kandinsky/core/kdphoto/Effect;Ljava/util/List;Lcom/kakao/kandinsky/core/kdphoto/Blur;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/kakao/kandinsky/core/filter/ViewFilterEngine;", "getFilterEngine", "()Lcom/kakao/kandinsky/core/filter/ViewFilterEngine;", "", "deleteBitmapFilterEngine", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "c", "Ljava/util/List;", "getFilterList", "()Ljava/util/List;", "filterList", "Companion", "filter_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class FilterRepository {
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000E\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001A\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/kakao/kandinsky/core/filter/repository/FilterRepository$Companion;", "", "", "FILTER_SPEC_FILE_NAME", "Ljava/lang/String;", "filter_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }
    }

    @NotNull
    public static final Companion Companion;
    public final AssetManager a;
    public final BitmapFilterEngine b;
    public final List c;

    static {
        FilterRepository.Companion = new Companion(null);
    }

    @Inject
    public FilterRepository(@NotNull AssetManager assetManager0) {
        Intrinsics.checkNotNullParameter(assetManager0, "assetManager");
        super();
        this.a = assetManager0;
        this.b = new BitmapFilterEngine(assetManager0);
        this.c = FilterInfo.INSTANCE.getList();
    }

    @Nullable
    public final Object deleteBitmapFilterEngine(@NotNull Continuation continuation0) {
        Object object0 = this.b.delete(continuation0);
        return object0 == a.getCOROUTINE_SUSPENDED() ? object0 : Unit.INSTANCE;
    }

    @NotNull
    public final ViewFilterEngine getFilterEngine() {
        return new ViewFilterEngine(this.a);
    }

    @NotNull
    public final List getFilterList() {
        return this.c;
    }

    @Nullable
    public final Object getFilteredBitmap(@NotNull Bitmap bitmap0, @NotNull Filter filter0, float f, @Nullable Effect effect0, @Nullable List list0, @Nullable Blur blur0, @NotNull Continuation continuation0) {
        return this.b.filterWithBitmapResult(bitmap0, filter0, f, effect0, list0, blur0, continuation0);
    }

    public static Object getFilteredBitmap$default(FilterRepository filterRepository0, Bitmap bitmap0, Filter filter0, float f, Effect effect0, List list0, Blur blur0, Continuation continuation0, int v, Object object0) {
        Effect effect1 = (v & 8) == 0 ? effect0 : null;
        return (v & 16) == 0 ? filterRepository0.getFilteredBitmap(bitmap0, filter0, f, effect1, list0, blur0, continuation0) : filterRepository0.getFilteredBitmap(bitmap0, filter0, f, effect1, null, blur0, continuation0);
    }
}

