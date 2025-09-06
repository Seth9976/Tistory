package com.kakao.tistory.presentation.view.common;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.kakao.tistory.presentation.common.extension.AnimationExtensionKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0002\b\u0004\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\t\b\u0016¢\u0006\u0004\b\u0004\u0010\u0005B\u001D\b\u0016\u0012\b\u0010\u0007\u001A\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001A\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ?\u0010\u0014\u001A\u00020\u00132\u0006\u0010\f\u001A\u00020\u000B2\u0006\u0010\r\u001A\u00028\u00002\u0006\u0010\u000E\u001A\u00020\u00012\u0006\u0010\u000F\u001A\u00020\u00012\u0006\u0010\u0011\u001A\u00020\u00102\u0006\u0010\u0012\u001A\u00020\u0010H\u0016¢\u0006\u0004\b\u0014\u0010\u0015JG\u0010\u001B\u001A\u00020\u001A2\u0006\u0010\f\u001A\u00020\u000B2\u0006\u0010\r\u001A\u00028\u00002\u0006\u0010\u000F\u001A\u00020\u00012\u0006\u0010\u0016\u001A\u00020\u00102\u0006\u0010\u0017\u001A\u00020\u00102\u0006\u0010\u0019\u001A\u00020\u00182\u0006\u0010\u0012\u001A\u00020\u0010H\u0016¢\u0006\u0004\b\u001B\u0010\u001C¨\u0006\u001D"}, d2 = {"Lcom/kakao/tistory/presentation/view/common/VerticalVisibleViewBehavior;", "Landroid/view/View;", "V", "Landroidx/coordinatorlayout/widget/CoordinatorLayout$Behavior;", "<init>", "()V", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Landroidx/coordinatorlayout/widget/CoordinatorLayout;", "coordinatorLayout", "child", "directTargetChild", "target", "", "axes", "type", "", "onStartNestedScroll", "(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;Landroid/view/View;Landroid/view/View;II)Z", "dx", "dy", "", "consumed", "", "onNestedPreScroll", "(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;Landroid/view/View;II[II)V", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class VerticalVisibleViewBehavior extends Behavior {
    public static final int $stable = 8;
    public final int a;
    public final int b;
    public int c;
    public int d;

    public VerticalVisibleViewBehavior() {
        this.a = 1;
        this.b = 2;
        this.c = 0;
    }

    public VerticalVisibleViewBehavior(@Nullable Context context0, @Nullable AttributeSet attributeSet0) {
        super(context0, attributeSet0);
        this.a = 1;
        this.b = 2;
        this.c = 0;
    }

    public static final int access$getANIM_STATE_NONE$p(VerticalVisibleViewBehavior verticalVisibleViewBehavior0) {
        verticalVisibleViewBehavior0.getClass();
        return 0;
    }

    @Override  // androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior
    public void onNestedPreScroll(@NotNull CoordinatorLayout coordinatorLayout0, @NotNull View view0, @NotNull View view1, int v, int v1, @NotNull int[] arr_v, int v2) {
        Intrinsics.checkNotNullParameter(coordinatorLayout0, "coordinatorLayout");
        Intrinsics.checkNotNullParameter(view0, "child");
        Intrinsics.checkNotNullParameter(view1, "target");
        Intrinsics.checkNotNullParameter(arr_v, "consumed");
        if(v1 > 0 && this.d < 0 || v1 < 0 && this.d > 0) {
            this.d = 0;
        }
        int v3 = this.d + v1;
        this.d = v3;
        if(v3 > view0.getHeight() && !(view0.getVisibility() == 0 ? this.c == this.a : this.c != this.b)) {
            AnimationExtensionKt.animHide(view0, new a0(this), new b0(this), 4);
            return;
        }
        if(this.d < 0) {
            if(view0.getVisibility() != 0) {
                if(this.c == this.b) {
                    return;
                }
                AnimationExtensionKt.animShow(view0, new c0(this), new d0(this));
                return;
            }
            if(this.c == this.a) {
                AnimationExtensionKt.animShow(view0, new c0(this), new d0(this));
            }
        }
    }

    @Override  // androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior
    public boolean onStartNestedScroll(@NotNull CoordinatorLayout coordinatorLayout0, @NotNull View view0, @NotNull View view1, @NotNull View view2, int v, int v1) {
        Intrinsics.checkNotNullParameter(coordinatorLayout0, "coordinatorLayout");
        Intrinsics.checkNotNullParameter(view0, "child");
        Intrinsics.checkNotNullParameter(view1, "directTargetChild");
        Intrinsics.checkNotNullParameter(view2, "target");
        return (v & 2) != 0;
    }
}

