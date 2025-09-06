package androidx.compose.material3;

import android.view.View.OnAttachStateChangeListener;
import android.view.View;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u0017\u0010\u0006\u001A\u00020\u00052\u0006\u0010\u0004\u001A\u00020\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\b\u001A\u00020\u00052\u0006\u0010\u0004\u001A\u00020\u0003H\u0016¢\u0006\u0004\b\b\u0010\u0007J\u000F\u0010\t\u001A\u00020\u0005H\u0016¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000B\u001A\u00020\u0005¢\u0006\u0004\b\u000B\u0010\n¨\u0006\f"}, d2 = {"androidx/compose/material3/ExposedDropdownMenu_androidKt$SoftKeyboardListener$1$1$listener$1", "Landroid/view/View$OnAttachStateChangeListener;", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "Landroid/view/View;", "p0", "", "onViewAttachedToWindow", "(Landroid/view/View;)V", "onViewDetachedFromWindow", "onGlobalLayout", "()V", "dispose", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class ExposedDropdownMenu_androidKt.SoftKeyboardListener.1.1.listener.1 implements View.OnAttachStateChangeListener, ViewTreeObserver.OnGlobalLayoutListener {
    public boolean a;
    public final View b;
    public final Function0 c;

    public ExposedDropdownMenu_androidKt.SoftKeyboardListener.1.1.listener.1(Function0 function00, View view0) {
        this.b = view0;
        this.c = function00;
        view0.addOnAttachStateChangeListener(this);
        if(!this.a && view0.isAttachedToWindow()) {
            view0.getViewTreeObserver().addOnGlobalLayoutListener(this);
            this.a = true;
        }
    }

    public final void dispose() {
        View view0 = this.b;
        if(this.a) {
            view0.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            this.a = false;
        }
        view0.removeOnAttachStateChangeListener(this);
    }

    @Override  // android.view.ViewTreeObserver$OnGlobalLayoutListener
    public void onGlobalLayout() {
        this.c.invoke();
    }

    @Override  // android.view.View$OnAttachStateChangeListener
    public void onViewAttachedToWindow(@NotNull View view0) {
        if(!this.a) {
            View view1 = this.b;
            if(view1.isAttachedToWindow()) {
                view1.getViewTreeObserver().addOnGlobalLayoutListener(this);
                this.a = true;
            }
        }
    }

    @Override  // android.view.View$OnAttachStateChangeListener
    public void onViewDetachedFromWindow(@NotNull View view0) {
        if(this.a) {
            this.b.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            this.a = false;
        }
    }
}

