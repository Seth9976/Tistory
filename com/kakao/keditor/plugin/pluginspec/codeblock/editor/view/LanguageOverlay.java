package com.kakao.keditor.plugin.pluginspec.codeblock.editor.view;

import android.graphics.Point;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import com.kakao.common.view.SoftInputWindowFrameDetector;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import md.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000B\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0005\u0012\u0006\u0010\u0006\u001A\u00020\u0007\u0012\u0006\u0010\b\u001A\u00020\u0005¢\u0006\u0002\u0010\tJ\u0018\u0010\u0016\u001A\u00020\u00172\u0010\b\u0002\u0010\u0018\u001A\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0019J\u0006\u0010\u001A\u001A\u00020\u0017R\u000E\u0010\b\u001A\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001A\u0004\u0018\u00010\u0007X\u0082\u000E¢\u0006\u0002\n\u0000R\u000E\u0010\u0002\u001A\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001A\u0010\u000B\u001A\u00020\fX\u0086\u000E¢\u0006\u000E\n\u0000\u001A\u0004\b\u000B\u0010\r\"\u0004\b\u000E\u0010\u000FR\u000E\u0010\u0006\u001A\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000E\u0010\u0004\u001A\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001B\u0010\u0010\u001A\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001A\u0004\b\u0012\u0010\u0013¨\u0006\u001B"}, d2 = {"Lcom/kakao/keditor/plugin/pluginspec/codeblock/editor/view/LanguageOverlay;", "", "frameDetector", "Lcom/kakao/common/view/SoftInputWindowFrameDetector;", "rootView", "Landroid/view/View;", "overlayFrameView", "Landroid/view/ViewGroup;", "content", "(Lcom/kakao/common/view/SoftInputWindowFrameDetector;Landroid/view/View;Landroid/view/ViewGroup;Landroid/view/View;)V", "contentHolder", "isShowing", "", "()Z", "setShowing", "(Z)V", "window", "Landroid/widget/PopupWindow;", "getWindow", "()Landroid/widget/PopupWindow;", "window$delegate", "Lkotlin/Lazy;", "dismiss", "", "block", "Lkotlin/Function0;", "show", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class LanguageOverlay {
    @NotNull
    private final View content;
    @Nullable
    private ViewGroup contentHolder;
    @NotNull
    private final SoftInputWindowFrameDetector frameDetector;
    private boolean isShowing;
    @NotNull
    private final ViewGroup overlayFrameView;
    @NotNull
    private final View rootView;
    @NotNull
    private final Lazy window$delegate;

    public LanguageOverlay(@NotNull SoftInputWindowFrameDetector softInputWindowFrameDetector0, @NotNull View view0, @NotNull ViewGroup viewGroup0, @NotNull View view1) {
        Intrinsics.checkNotNullParameter(softInputWindowFrameDetector0, "frameDetector");
        Intrinsics.checkNotNullParameter(view0, "rootView");
        Intrinsics.checkNotNullParameter(viewGroup0, "overlayFrameView");
        Intrinsics.checkNotNullParameter(view1, "content");
        super();
        this.frameDetector = softInputWindowFrameDetector0;
        this.rootView = view0;
        this.overlayFrameView = viewGroup0;
        this.content = view1;
        this.window$delegate = c.lazy(com.kakao.keditor.plugin.pluginspec.codeblock.editor.view.LanguageOverlay.window.2.INSTANCE);

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001A\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/widget/PopupWindow;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 0x30)
        final class com.kakao.keditor.plugin.pluginspec.codeblock.editor.view.LanguageOverlay.window.2 extends Lambda implements Function0 {
            public static final com.kakao.keditor.plugin.pluginspec.codeblock.editor.view.LanguageOverlay.window.2 INSTANCE;

            static {
                com.kakao.keditor.plugin.pluginspec.codeblock.editor.view.LanguageOverlay.window.2.INSTANCE = new com.kakao.keditor.plugin.pluginspec.codeblock.editor.view.LanguageOverlay.window.2();
            }

            public com.kakao.keditor.plugin.pluginspec.codeblock.editor.view.LanguageOverlay.window.2() {
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

    public static void dismiss$default(LanguageOverlay languageOverlay0, Function0 function00, int v, Object object0) {
        if((v & 1) != 0) {
            function00 = null;
        }
        languageOverlay0.dismiss(function00);
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

    public final void show() {
        ViewGroup viewGroup0 = this.contentHolder;
        if(viewGroup0 == null) {
            this.contentHolder = new FrameLayout(this.content.getContext());
        }
        else if(viewGroup0 != null) {
            viewGroup0.removeAllViews();
        }
        ViewGroup viewGroup1 = this.contentHolder;
        if(viewGroup1 != null) {
            viewGroup1.addView(this.content);
        }
        if(this.isShowing) {
            this.overlayFrameView.removeAllViews();
            this.overlayFrameView.addView(this.contentHolder);
        }
        else {
            Object object0 = this.rootView.getContext().getSystemService("window");
            Intrinsics.checkNotNull(object0, "null cannot be cast to non-null type android.view.WindowManager");
            Rect rect0 = ((WindowManager)object0).getCurrentWindowMetrics().getBounds();
            Intrinsics.checkNotNullExpressionValue(rect0, "getBounds(...)");
            Point point0 = new Point();
            point0.x = rect0.width();
            point0.y = rect0.height();
            this.overlayFrameView.addView(this.contentHolder);
            ViewGroup.LayoutParams viewGroup$LayoutParams0 = this.overlayFrameView.getLayoutParams();
            viewGroup$LayoutParams0.width = point0.x;
            viewGroup$LayoutParams0.height = this.frameDetector.getKeyboardHeight();
        }
        this.isShowing = true;
    }
}

