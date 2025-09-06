package com.kakao.keditor.toolbar.toolbaroverlay;

import android.content.Context;
import android.graphics.Point;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import com.kakao.common.view.ScreenKt;
import com.kakao.common.view.SoftInputWindowFrameDetector;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import md.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001A\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0018\u0010\u0012\u001A\u00020\u00132\u0010\b\u0002\u0010\u0014\u001A\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0015J\u001E\u0010\u0016\u001A\u00020\u00132\u0006\u0010\u0017\u001A\u00020\u00182\u0006\u0010\u0019\u001A\u00020\u00062\u0006\u0010\u001A\u001A\u00020\u0018R\u0010\u0010\u0005\u001A\u0004\u0018\u00010\u0006X\u0082\u000E¢\u0006\u0002\n\u0000R\u000E\u0010\u0002\u001A\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001A\u0010\u0007\u001A\u00020\bX\u0086\u000E¢\u0006\u000E\n\u0000\u001A\u0004\b\u0007\u0010\t\"\u0004\b\n\u0010\u000BR\u001B\u0010\f\u001A\u00020\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001A\u0004\b\u000E\u0010\u000F¨\u0006\u001B"}, d2 = {"Lcom/kakao/keditor/toolbar/toolbaroverlay/ToolbarOverlay;", "", "frameDetector", "Lcom/kakao/common/view/SoftInputWindowFrameDetector;", "(Lcom/kakao/common/view/SoftInputWindowFrameDetector;)V", "contentHolder", "Landroid/view/ViewGroup;", "isShowing", "", "()Z", "setShowing", "(Z)V", "window", "Landroid/widget/PopupWindow;", "getWindow", "()Landroid/widget/PopupWindow;", "window$delegate", "Lkotlin/Lazy;", "dismiss", "", "block", "Lkotlin/Function0;", "show", "onVisibleSoftInput", "Landroid/view/View;", "onInVisibleSoftInput", "content", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public class ToolbarOverlay {
    @Nullable
    private ViewGroup contentHolder;
    @NotNull
    private final SoftInputWindowFrameDetector frameDetector;
    private boolean isShowing;
    @NotNull
    private final Lazy window$delegate;

    public ToolbarOverlay(@NotNull SoftInputWindowFrameDetector softInputWindowFrameDetector0) {
        Intrinsics.checkNotNullParameter(softInputWindowFrameDetector0, "frameDetector");
        super();
        this.frameDetector = softInputWindowFrameDetector0;
        this.window$delegate = c.lazy(com.kakao.keditor.toolbar.toolbaroverlay.ToolbarOverlay.window.2.INSTANCE);

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001A\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/widget/PopupWindow;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 0x30)
        final class com.kakao.keditor.toolbar.toolbaroverlay.ToolbarOverlay.window.2 extends Lambda implements Function0 {
            public static final com.kakao.keditor.toolbar.toolbaroverlay.ToolbarOverlay.window.2 INSTANCE;

            static {
                com.kakao.keditor.toolbar.toolbaroverlay.ToolbarOverlay.window.2.INSTANCE = new com.kakao.keditor.toolbar.toolbaroverlay.ToolbarOverlay.window.2();
            }

            public com.kakao.keditor.toolbar.toolbaroverlay.ToolbarOverlay.window.2() {
                super(0);
            }

            @NotNull
            public final PopupWindow invoke() {
                return new PopupWindow(0, 0);
            }

            @Override  // kotlin.jvm.functions.Function0
            public Object invoke() {
                return this.invoke();
            }
        }

    }

    public final void dismiss(@Nullable Function0 function00) {
        this.getWindow().dismiss();
        ViewGroup viewGroup0 = this.contentHolder;
        if(viewGroup0 != null) {
            ViewParent viewParent0 = viewGroup0.getParent();
            if(viewParent0 != null) {
                Intrinsics.checkNotNull(viewParent0);
                if(viewParent0 instanceof ViewGroup) {
                    ((ViewGroup)viewParent0).removeView(this.contentHolder);
                    ViewGroup.LayoutParams viewGroup$LayoutParams0 = ((ViewGroup)viewParent0).getLayoutParams();
                    viewGroup$LayoutParams0.width = 0;
                    viewGroup$LayoutParams0.height = 0;
                }
            }
            viewGroup0.removeAllViews();
        }
        this.contentHolder = null;
        this.isShowing = false;
        if(function00 != null) {
            function00.invoke();
        }
    }

    public static void dismiss$default(ToolbarOverlay toolbarOverlay0, Function0 function00, int v, Object object0) {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: dismiss");
        }
        if((v & 1) != 0) {
            function00 = null;
        }
        toolbarOverlay0.dismiss(function00);
    }

    private final PopupWindow getWindow() {
        return (PopupWindow)this.window$delegate.getValue();
    }

    public final boolean isShowing() {
        return this.isShowing;
    }

    public final void setShowing(boolean z) {
        this.isShowing = z;
    }

    public final void show(@NotNull View view0, @NotNull ViewGroup viewGroup0, @NotNull View view1) {
        Intrinsics.checkNotNullParameter(view0, "onVisibleSoftInput");
        Intrinsics.checkNotNullParameter(viewGroup0, "onInVisibleSoftInput");
        Intrinsics.checkNotNullParameter(view1, "content");
        ViewGroup viewGroup1 = this.contentHolder;
        if(viewGroup1 == null) {
            this.contentHolder = new FrameLayout(view1.getContext());
        }
        else if(viewGroup1 != null) {
            viewGroup1.removeAllViews();
        }
        ViewGroup viewGroup2 = this.contentHolder;
        if(viewGroup2 != null) {
            viewGroup2.addView(view1);
        }
        if(this.isShowing) {
            viewGroup0.removeAllViews();
            viewGroup0.addView(this.contentHolder);
        }
        else {
            Point point0 = new Point();
            Context context0 = view0.getContext();
            Intrinsics.checkNotNullExpressionValue(context0, "getContext(...)");
            point0.x = ScreenKt.getScreenWidth(context0);
            Context context1 = view0.getContext();
            Intrinsics.checkNotNullExpressionValue(context1, "getContext(...)");
            point0.y = ScreenKt.getScreenHeight(context1);
            viewGroup0.addView(this.contentHolder);
            ViewGroup.LayoutParams viewGroup$LayoutParams0 = viewGroup0.getLayoutParams();
            viewGroup$LayoutParams0.width = point0.x;
            viewGroup$LayoutParams0.height = this.frameDetector.getKeyboardHeight();
        }
        this.isShowing = true;
    }
}

