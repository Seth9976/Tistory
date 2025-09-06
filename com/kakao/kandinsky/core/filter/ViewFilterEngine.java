package com.kakao.kandinsky.core.filter;

import android.content.res.AssetManager;
import android.graphics.SurfaceTexture;
import com.kakao.kandinsky.core.filter.io.SurfaceOutput;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import qd.a;
import v9.o;
import v9.p;
import v9.q;
import v9.r;
import v9.s;
import v9.t;
import v9.u;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000B\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005JK\u0010\u000F\u001A\u00020\r2)\b\u0002\u0010\u000B\u001A#\b\u0001\u0012\u0004\u0012\u00020\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0006¢\u0006\u0002\b\n2\u000E\b\u0002\u0010\u000E\u001A\b\u0012\u0004\u0012\u00020\r0\fH\u0086@¢\u0006\u0004\b\u000F\u0010\u0010J\u0010\u0010\u0011\u001A\u00020\rH\u0086@¢\u0006\u0004\b\u0011\u0010\u0012J\u001A\u0010\u0015\u001A\u00020\r2\b\u0010\u0014\u001A\u0004\u0018\u00010\u0013H\u0086@¢\u0006\u0004\b\u0015\u0010\u0016J \u0010\u001A\u001A\u00020\r2\u0006\u0010\u0018\u001A\u00020\u00172\u0006\u0010\u0019\u001A\u00020\u0017H\u0086@¢\u0006\u0004\b\u001A\u0010\u001BJ\u0010\u0010\u001C\u001A\u00020\rH\u0096@¢\u0006\u0004\b\u001C\u0010\u0012¨\u0006\u001D"}, d2 = {"Lcom/kakao/kandinsky/core/filter/ViewFilterEngine;", "Lcom/kakao/kandinsky/core/filter/FilterEngine;", "Landroid/content/res/AssetManager;", "assetManager", "<init>", "(Landroid/content/res/AssetManager;)V", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "", "Lkotlin/ExtensionFunctionType;", "update", "Lkotlin/Function0;", "", "onComplete", "updateAndExecute", "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "clear", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroid/graphics/SurfaceTexture;", "surface", "updateOutput", "(Landroid/graphics/SurfaceTexture;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "width", "height", "updateOutputSize", "(IILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "releaseResource", "filter_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class ViewFilterEngine extends FilterEngine {
    public SurfaceOutput l;

    public ViewFilterEngine(@NotNull AssetManager assetManager0) {
        Intrinsics.checkNotNullParameter(assetManager0, "assetManager");
        super(assetManager0);
    }

    @Nullable
    public final Object clear(@NotNull Continuation continuation0) {
        Object object0 = this.withGLContext(new o(this, null), continuation0);
        return object0 == a.getCOROUTINE_SUSPENDED() ? object0 : Unit.INSTANCE;
    }

    @Override  // com.kakao.kandinsky.core.filter.FilterEngine
    @Nullable
    public Object releaseResource(@NotNull Continuation continuation0) {
        Object object0 = this.withGLContext(new p(this, null), continuation0);
        return object0 == a.getCOROUTINE_SUSPENDED() ? object0 : Unit.INSTANCE;
    }

    @Nullable
    public final Object updateAndExecute(@NotNull Function2 function20, @NotNull Function0 function00, @NotNull Continuation continuation0) {
        Object object0 = this.withGLContext(new s(function20, this, function00, null), continuation0);
        return object0 == a.getCOROUTINE_SUSPENDED() ? object0 : Unit.INSTANCE;
    }

    public static Object updateAndExecute$default(ViewFilterEngine viewFilterEngine0, Function2 function20, Function0 function00, Continuation continuation0, int v, Object object0) {
        if((v & 1) != 0) {
            function20 = new q(2, null);  // 初始化器: Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V
        }
        if((v & 2) != 0) {
            function00 = r.w;
        }
        return viewFilterEngine0.updateAndExecute(function20, function00, continuation0);
    }

    @Nullable
    public final Object updateOutput(@Nullable SurfaceTexture surfaceTexture0, @NotNull Continuation continuation0) {
        Object object0 = this.withGLContext(new t(this, surfaceTexture0, null), continuation0);
        return object0 == a.getCOROUTINE_SUSPENDED() ? object0 : Unit.INSTANCE;
    }

    @Nullable
    public final Object updateOutputSize(int v, int v1, @NotNull Continuation continuation0) {
        Object object0 = this.withGLContext(new u(this, v, v1, null), continuation0);
        return object0 == a.getCOROUTINE_SUSPENDED() ? object0 : Unit.INSTANCE;
    }
}

