package com.kakao.common.view;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.compose.ui.platform.b;
import com.kakao.common.util.UnitConversionKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function8;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000B\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\u0018\u0000 /2\u00020\u0001:\u0001/R\"\u0010\u0005\u001A\u00020\u00028\u0006@\u0006X\u0086\u000E¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001A\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\u0010\u001A\u00020\t8\u0006@\u0006X\u0086\u000E¢\u0006\u0012\n\u0004\b\n\u0010\u000B\u001A\u0004\b\f\u0010\r\"\u0004\b\u000E\u0010\u000FRÙ\u0001\u0010$\u001A¸\u0001\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0014\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0015\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0016\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0017\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0018\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0019\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u001A\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u001B\u0012\u0004\u0012\u00020\u001C\u0018\u00010\u0011j\u0004\u0018\u0001`\u001D8\u0006@\u0006X\u0086\u000E¢\u0006\u0012\n\u0004\b\u001E\u0010\u001F\u001A\u0004\b \u0010!\"\u0004\b\"\u0010#R\u0011\u0010&\u001A\u00020\t8F¢\u0006\u0006\u001A\u0004\b%\u0010\rR\u0011\u0010(\u001A\u00020\t8F¢\u0006\u0006\u001A\u0004\b\'\u0010\rR\u0011\u0010*\u001A\u00020\t8F¢\u0006\u0006\u001A\u0004\b)\u0010\rR\u0011\u0010,\u001A\u00020\t8F¢\u0006\u0006\u001A\u0004\b+\u0010\rR\u0011\u0010.\u001A\u00020\u00028F¢\u0006\u0006\u001A\u0004\b-\u0010\u0006¨\u00060"}, d2 = {"Lcom/kakao/common/view/SoftInputWindowFrameDetector;", "", "", "b", "Z", "isKeyboardOpen", "()Z", "setKeyboardOpen", "(Z)V", "", "d", "I", "getKeyboardHeight", "()I", "setKeyboardHeight", "(I)V", "keyboardHeight", "Lkotlin/Function8;", "Lkotlin/ParameterName;", "name", "oldLeft", "oldTop", "oldRight", "oldBottom", "newLeft", "newTop", "newRight", "newBottom", "", "Lcom/kakao/keditor/delegate/FrameChangedListener;", "e", "Lkotlin/jvm/functions/Function8;", "getFrameChangeListener", "()Lkotlin/jvm/functions/Function8;", "setFrameChangeListener", "(Lkotlin/jvm/functions/Function8;)V", "frameChangeListener", "getLeft", "left", "getTop", "top", "getRight", "right", "getBottom", "bottom", "getHasValidFrame", "hasValidFrame", "Companion", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class SoftInputWindowFrameDetector {
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0015\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/kakao/common/view/SoftInputWindowFrameDetector$Companion;", "", "Landroid/view/View;", "view", "Lcom/kakao/common/view/SoftInputWindowFrameDetector;", "withRootViewOf", "(Landroid/view/View;)Lcom/kakao/common/view/SoftInputWindowFrameDetector;", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        @NotNull
        public final SoftInputWindowFrameDetector withRootViewOf(@NotNull View view0) {
            Intrinsics.checkNotNullParameter(view0, "view");
            View view1 = view0.getRootView();
            Intrinsics.checkNotNullExpressionValue(view1, "getRootView(...)");
            return new SoftInputWindowFrameDetector(view1, null);
        }
    }

    @NotNull
    public static final Companion Companion;
    public final View a;
    public boolean b;
    public final int c;
    public int d;
    public Function8 e;
    public final Rect f;
    public final Rect g;
    public final b h;
    public ViewTreeObserver i;

    static {
        SoftInputWindowFrameDetector.Companion = new Companion(null);
    }

    public SoftInputWindowFrameDetector(View view0, DefaultConstructorMarker defaultConstructorMarker0) {
        this.a = view0;
        int v = UnitConversionKt.dp2pxRoundDown(230.0f);
        this.c = v;
        this.d = v;
        Rect rect0 = new Rect();
        this.f = rect0;
        this.g = new Rect();
        this.h = new b(this, 1);
        view0.addOnAttachStateChangeListener(new SoftInputWindowFrameDetector.1(this));
        if(view0.isAttachedToWindow()) {
            this.a(view0.getViewTreeObserver());
        }
        SoftInputWindowFrameDetectorKt.getSoftInputWindowFrame(view0, rect0);
    }

    public final void a(ViewTreeObserver viewTreeObserver0) {
        ViewTreeObserver viewTreeObserver1 = this.i;
        b b0 = this.h;
        if(viewTreeObserver1 != null && viewTreeObserver1.isAlive()) {
            viewTreeObserver1.removeOnGlobalLayoutListener(b0);
        }
        this.i = viewTreeObserver0;
        if(viewTreeObserver0 != null && viewTreeObserver0.isAlive()) {
            viewTreeObserver0.addOnGlobalLayoutListener(b0);
        }
    }

    public static final void access$setVto(SoftInputWindowFrameDetector softInputWindowFrameDetector0, ViewTreeObserver viewTreeObserver0) {
        softInputWindowFrameDetector0.a(viewTreeObserver0);
    }

    public final int getBottom() {
        return this.f.bottom;
    }

    @Nullable
    public final Function8 getFrameChangeListener() {
        return this.e;
    }

    public final boolean getHasValidFrame() {
        return this.getRight() > this.getLeft() && this.b;
    }

    public final int getKeyboardHeight() {
        return this.d;
    }

    public final int getLeft() {
        return this.f.left;
    }

    public final int getRight() {
        return this.f.right;
    }

    public final int getTop() {
        return this.f.top;
    }

    public final boolean isKeyboardOpen() {
        return this.b;
    }

    public final void setFrameChangeListener(@Nullable Function8 function80) {
        this.e = function80;
    }

    public final void setKeyboardHeight(int v) {
        this.d = v;
    }

    public final void setKeyboardOpen(boolean z) {
        this.b = z;
    }
}

