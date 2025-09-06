package com.kakao.kphotopicker.fastscroller;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.futuremind.fastscroll.viewprovider.ScrollerViewProvider;
import com.futuremind.fastscroll.viewprovider.ViewBehavior;
import com.futuremind.fastscroll.viewprovider.VisibilityAnimationManager.Builder;
import com.futuremind.fastscroll.viewprovider.VisibilityAnimationManager;
import com.kakao.kphotopicker.R.layout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001A\u00020\u00062\u0006\u0010\u0005\u001A\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0011\u0010\n\u001A\u0004\u0018\u00010\tH\u0014¢\u0006\u0004\b\n\u0010\u000BJ\u0017\u0010\f\u001A\u00020\u00062\u0006\u0010\u0005\u001A\u00020\u0004H\u0016¢\u0006\u0004\b\f\u0010\bJ\u0011\u0010\r\u001A\u0004\u0018\u00010\tH\u0014¢\u0006\u0004\b\r\u0010\u000BJ\u0011\u0010\u000F\u001A\u0004\u0018\u00010\u000EH\u0016¢\u0006\u0004\b\u000F\u0010\u0010J\u000F\u0010\u0012\u001A\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/kakao/kphotopicker/fastscroller/MediaScrollerViewProvider;", "Lcom/futuremind/fastscroll/viewprovider/ScrollerViewProvider;", "<init>", "()V", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "provideHandleView", "(Landroid/view/ViewGroup;)Landroid/view/View;", "Lcom/futuremind/fastscroll/viewprovider/ViewBehavior;", "provideHandleBehavior", "()Lcom/futuremind/fastscroll/viewprovider/ViewBehavior;", "provideBubbleView", "provideBubbleBehavior", "Landroid/widget/TextView;", "provideBubbleTextView", "()Landroid/widget/TextView;", "", "getBubbleOffset", "()I", "kphotopicker_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class MediaScrollerViewProvider extends ScrollerViewProvider {
    public View d;

    @Override  // com.futuremind.fastscroll.viewprovider.ScrollerViewProvider
    public int getBubbleOffset() {
        return 0;
    }

    @Override  // com.futuremind.fastscroll.viewprovider.ScrollerViewProvider
    @Nullable
    public ViewBehavior provideBubbleBehavior() {
        return null;
    }

    @Override  // com.futuremind.fastscroll.viewprovider.ScrollerViewProvider
    @Nullable
    public TextView provideBubbleTextView() {
        return null;
    }

    @Override  // com.futuremind.fastscroll.viewprovider.ScrollerViewProvider
    @NotNull
    public View provideBubbleView(@NotNull ViewGroup viewGroup0) {
        Intrinsics.checkNotNullParameter(viewGroup0, "container");
        View view0 = LayoutInflater.from(this.getContext()).inflate(layout.kphotopicker_media_fastscroller_title_indicator_layout, null, false);
        Intrinsics.checkNotNullExpressionValue(view0, "inflate(...)");
        return view0;
    }

    @Override  // com.futuremind.fastscroll.viewprovider.ScrollerViewProvider
    @Nullable
    public ViewBehavior provideHandleBehavior() {
        View view0 = this.d;
        if(view0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("handle");
            view0 = null;
        }
        VisibilityAnimationManager visibilityAnimationManager0 = new Builder(view0).withHideDelay(2000).build();
        Intrinsics.checkNotNullExpressionValue(visibilityAnimationManager0, "build(...)");
        View view1 = this.d;
        if(view1 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("handle");
            return new MediaHandleBehavior(visibilityAnimationManager0, new com.kakao.kphotopicker.fastscroller.MediaHandleBehavior.HandleAnimationManager.Builder(null).withGrabAnimator(-1).withReleaseAnimator(-1).build());
        }
        return new MediaHandleBehavior(visibilityAnimationManager0, new com.kakao.kphotopicker.fastscroller.MediaHandleBehavior.HandleAnimationManager.Builder(view1).withGrabAnimator(-1).withReleaseAnimator(-1).build());
    }

    @Override  // com.futuremind.fastscroll.viewprovider.ScrollerViewProvider
    @NotNull
    public View provideHandleView(@NotNull ViewGroup viewGroup0) {
        Intrinsics.checkNotNullParameter(viewGroup0, "container");
        View view0 = LayoutInflater.from(this.getContext()).inflate(layout.kphotopicker_media_fastscroller_handle_layout, null, false);
        view0.setVisibility(4);
        Intrinsics.checkNotNullExpressionValue(view0, "apply(...)");
        this.d = view0;
        return view0;
    }
}

