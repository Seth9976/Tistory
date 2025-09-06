package com.kakao.kandinsky.base;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Rect;
import androidx.lifecycle.ViewModel;
import com.kakao.kandinsky.core.kdphoto.KDPhoto;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;
import p9.d;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000B\n\u0002\b\b\b\'\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\b\u001A\u00020\u00072\u0006\u0010\u0006\u001A\u00020\u0005H\u0096\u0001¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001A\u00020\u00072\u0006\u0010\u000B\u001A\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0010\u001A\u00020\u00072\u0012\u0010\u000F\u001A\u000E\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\u000E¢\u0006\u0004\b\u0010\u0010\u0011R\u001D\u0010\u000B\u001A\b\u0012\u0004\u0012\u00020\n0\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001A\u0004\b\u0015\u0010\u0016R\u001D\u0010\u001D\u001A\b\u0012\u0004\u0012\u00020\u00180\u00178\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001A\u001A\u0004\b\u001B\u0010\u001CR\u001A\u0010\u001F\u001A\b\u0012\u0004\u0012\u00020\u00050\u00128\u0016X\u0096\u0005¢\u0006\u0006\u001A\u0004\b\u001E\u0010\u0016¨\u0006 "}, d2 = {"Lcom/kakao/kandinsky/base/KDFeatureViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/kakao/kandinsky/base/ImageDisplayBounds;", "<init>", "()V", "Landroidx/compose/ui/geometry/Rect;", "rect", "", "updateImageDisplayBounds", "(Landroidx/compose/ui/geometry/Rect;)V", "Lcom/kakao/kandinsky/core/kdphoto/KDPhoto;", "photo", "setPhoto", "(Lcom/kakao/kandinsky/core/kdphoto/KDPhoto;)V", "Lkotlin/Function1;", "function", "updatePhoto", "(Lkotlin/jvm/functions/Function1;)V", "Lkotlinx/coroutines/flow/StateFlow;", "J0", "Lkotlinx/coroutines/flow/StateFlow;", "getPhoto", "()Lkotlinx/coroutines/flow/StateFlow;", "Lkotlinx/coroutines/flow/Flow;", "", "L0", "Lkotlinx/coroutines/flow/Flow;", "getChanged", "()Lkotlinx/coroutines/flow/Flow;", "changed", "getImageDisplayBounds", "imageDisplayBounds", "base_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nKDFeatureViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KDFeatureViewModel.kt\ncom/kakao/kandinsky/base/KDFeatureViewModel\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,33:1\n230#2,5:34\n230#2,5:39\n*S KotlinDebug\n*F\n+ 1 KDFeatureViewModel.kt\ncom/kakao/kandinsky/base/KDFeatureViewModel\n*L\n25#1:34,5\n31#1:39,5\n*E\n"})
public abstract class KDFeatureViewModel extends ViewModel implements ImageDisplayBounds {
    public static final int $stable = 8;
    public final ImageDisplayBoundsImpl H0;
    public final MutableStateFlow I0;
    public final StateFlow J0;
    public KDPhoto K0;
    public final Flow L0;

    public KDFeatureViewModel() {
        this.H0 = new ImageDisplayBoundsImpl();
        MutableStateFlow mutableStateFlow0 = StateFlowKt.MutableStateFlow(KDPhoto.Companion.getEmpty());
        this.I0 = mutableStateFlow0;
        this.J0 = FlowKt.asStateFlow(mutableStateFlow0);
        this.K0 = KDPhoto.Companion.getEmpty();
        this.L0 = FlowKt.mapLatest(mutableStateFlow0, new d(this, null));
    }

    @NotNull
    public final Flow getChanged() {
        return this.L0;
    }

    @Override  // com.kakao.kandinsky.base.ImageDisplayBounds
    @NotNull
    public StateFlow getImageDisplayBounds() {
        return this.H0.getImageDisplayBounds();
    }

    @NotNull
    public final StateFlow getPhoto() {
        return this.J0;
    }

    public void setPhoto(@NotNull KDPhoto kDPhoto0) {
        Intrinsics.checkNotNullParameter(kDPhoto0, "photo");
        this.K0 = kDPhoto0;
        do {
            Object object0 = this.I0.getValue();
            KDPhoto kDPhoto1 = (KDPhoto)object0;
        }
        while(!this.I0.compareAndSet(object0, kDPhoto0));
    }

    @Override  // com.kakao.kandinsky.base.ImageDisplayBounds
    public void updateImageDisplayBounds(@NotNull Rect rect0) {
        Intrinsics.checkNotNullParameter(rect0, "rect");
        this.H0.updateImageDisplayBounds(rect0);
    }

    public final void updatePhoto(@NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(function10, "function");
        do {
            Object object0 = this.I0.getValue();
            Object object1 = function10.invoke(object0);
        }
        while(!this.I0.compareAndSet(object0, object1));
    }
}

