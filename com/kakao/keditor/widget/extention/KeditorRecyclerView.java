package com.kakao.keditor.widget.extention;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.kakao.common.view.SoftInputKt;
import com.kakao.keditor.standard.ViewStandardKt;
import com.kakao.keditor.widget.KeditorEditText;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000B\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\f\b\u0016\u0018\u00002\u00020\u0001B\u000F\b\u0016\u0012\u0006\u0010\u0002\u001A\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\b\u0010\u0005\u001A\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B!\b\u0016\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\b\u0010\u0005\u001A\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001A\u00020\t¢\u0006\u0002\u0010\nJ\u0006\u0010\u001A\u001A\u00020\u0019J\u0012\u0010\u001B\u001A\u00020\u00112\b\u0010\u001C\u001A\u0004\u0018\u00010\u0016H\u0016J\u0006\u0010\u001D\u001A\u00020\u0019J\u0018\u0010\u001E\u001A\u00020\u00192\u0006\u0010\u001F\u001A\u00020\t2\u0006\u0010 \u001A\u00020\tH\u0014J*\u0010!\u001A\u00020\u00192\u0010\b\u0002\u0010\"\u001A\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u00182\u0010\b\u0002\u0010#\u001A\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0018J\u0006\u0010$\u001A\u00020\u0019R\u0011\u0010\u000B\u001A\u00020\t8F¢\u0006\u0006\u001A\u0004\b\f\u0010\rR\u0012\u0010\u000E\u001A\u0004\u0018\u00010\tX\u0082\u000E¢\u0006\u0004\n\u0002\u0010\u000FR\u001A\u0010\u0010\u001A\u00020\u0011X\u0084\u000E¢\u0006\u000E\n\u0000\u001A\u0004\b\u0010\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u0010\u0010\u0015\u001A\u0004\u0018\u00010\u0016X\u0082\u000E¢\u0006\u0002\n\u0000R\u0016\u0010\u0017\u001A\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0018X\u0082\u000E¢\u0006\u0002\n\u0000¨\u0006%"}, d2 = {"Lcom/kakao/keditor/widget/extention/KeditorRecyclerView;", "Landroidx/recyclerview/widget/RecyclerView;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "initialHeight", "getInitialHeight", "()I", "initialHeight_", "Ljava/lang/Integer;", "isEnableTouch", "", "()Z", "setEnableTouch", "(Z)V", "lastMovingTouchEvent", "Landroid/view/MotionEvent;", "onUnblockedTouch", "Lkotlin/Function0;", "", "clearEditTextFocusIfNecessary", "dispatchTouchEvent", "ev", "lockTouch", "onMeasure", "widthSpec", "heightSpec", "recycleTouchEvent", "onResumedTouch", "onCanceledTouch", "unlockTouch", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public class KeditorRecyclerView extends RecyclerView {
    @Nullable
    private Integer initialHeight_;
    private boolean isEnableTouch;
    @Nullable
    private MotionEvent lastMovingTouchEvent;
    @Nullable
    private Function0 onUnblockedTouch;

    public KeditorRecyclerView(@NotNull Context context0) {
        Intrinsics.checkNotNullParameter(context0, "context");
        super(context0);
        this.isEnableTouch = true;
    }

    public KeditorRecyclerView(@NotNull Context context0, @Nullable AttributeSet attributeSet0) {
        Intrinsics.checkNotNullParameter(context0, "context");
        super(context0, attributeSet0);
        this.isEnableTouch = true;
    }

    public KeditorRecyclerView(@NotNull Context context0, @Nullable AttributeSet attributeSet0, int v) {
        Intrinsics.checkNotNullParameter(context0, "context");
        super(context0, attributeSet0, v);
        this.isEnableTouch = true;
    }

    public final void clearEditTextFocusIfNecessary() {
        View view0 = this.getFocusedChild();
        if(view0 != null) {
            ViewStandardKt.findAllKeditorEditText$default(view0, null, new Function1() {
                {
                    KeditorRecyclerView.this = keditorRecyclerView0;
                    super(1);
                }

                @Override  // kotlin.jvm.functions.Function1
                public Object invoke(Object object0) {
                    this.invoke(((KeditorEditText)object0));
                    return Unit.INSTANCE;
                }

                public final void invoke(@NotNull KeditorEditText keditorEditText0) {
                    Intrinsics.checkNotNullParameter(keditorEditText0, "editText");
                    if(keditorEditText0.hasFocus()) {
                        keditorEditText0.clearFocus();
                        Context context0 = KeditorRecyclerView.this.getContext();
                        Intrinsics.checkNotNullExpressionValue(context0, "getContext(...)");
                        SoftInputKt.hideSoftInput(context0);
                    }
                }
            }, 1, null);
        }
    }

    @Override  // android.view.ViewGroup
    public boolean dispatchTouchEvent(@Nullable MotionEvent motionEvent0) {
        if(!this.isEnableTouch) {
            this.lastMovingTouchEvent = motionEvent0;
            return true;
        }
        boolean z = super.dispatchTouchEvent(motionEvent0);
        Function0 function00 = this.onUnblockedTouch;
        if(function00 != null) {
            function00.invoke();
            this.onUnblockedTouch = null;
        }
        return z;
    }

    public final int getInitialHeight() {
        Integer integer0 = this.initialHeight_;
        return integer0 == null ? this.getHeight() : ((int)integer0);
    }

    public final boolean isEnableTouch() {
        return this.isEnableTouch;
    }

    public final void lockTouch() {
        this.isEnableTouch = false;
    }

    @Override  // androidx.recyclerview.widget.RecyclerView
    public void onMeasure(int v, int v1) {
        super.onMeasure(v, v1);
        if(this.initialHeight_ == null && this.getHeight() > 0 && this.getMeasuredHeight() > 0 && this.getHeight() == this.getMeasuredHeight()) {
            this.initialHeight_ = this.getHeight();
        }
    }

    public final void recycleTouchEvent(@Nullable Function0 function00, @Nullable Function0 function01) {
        MotionEvent motionEvent0 = this.lastMovingTouchEvent;
        if(motionEvent0 != null) {
            this.dispatchTouchEvent(motionEvent0);
            Integer integer0 = this.lastMovingTouchEvent == null ? null : this.lastMovingTouchEvent.getAction();
            if(integer0 == null || ((int)integer0) != 2) {
                if(function01 != null) {
                    function01.invoke();
                }
                function00 = null;
            }
            this.onUnblockedTouch = function00;
            this.lastMovingTouchEvent = null;
        }
    }

    public static void recycleTouchEvent$default(KeditorRecyclerView keditorRecyclerView0, Function0 function00, Function0 function01, int v, Object object0) {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: recycleTouchEvent");
        }
        if((v & 1) != 0) {
            function00 = null;
        }
        if((v & 2) != 0) {
            function01 = null;
        }
        keditorRecyclerView0.recycleTouchEvent(function00, function01);
    }

    public final void setEnableTouch(boolean z) {
        this.isEnableTouch = z;
    }

    public final void unlockTouch() {
        this.isEnableTouch = true;
    }
}

