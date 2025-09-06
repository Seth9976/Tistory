package androidx.compose.ui.platform;

import android.content.Context;
import android.os.IBinder;
import android.util.AttributeSet;
import android.view.View.MeasureSpec;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup;
import androidx.compose.foundation.text.selection.b1;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composition;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.Recomposer.State;
import androidx.compose.runtime.Recomposer;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.InternalComposeUiApi;
import androidx.compose.ui.UiComposable;
import androidx.compose.ui.node.Owner;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000F\n\u0002\u0010\u000B\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u000F\b\'\u0018\u00002\u00020\u0001B\'\b\u0007\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001A\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001A\u00020\u0006\u00A2\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001A\u00020\f2\b\u0010\u000B\u001A\u0004\u0018\u00010\n\u00A2\u0006\u0004\b\r\u0010\u000EJ\u0015\u0010\u0011\u001A\u00020\f2\u0006\u0010\u0010\u001A\u00020\u000F\u00A2\u0006\u0004\b\u0011\u0010\u0012J\u000F\u0010\u0013\u001A\u00020\fH\'\u00A2\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001A\u00020\f\u00A2\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001A\u00020\f\u00A2\u0006\u0004\b\u0017\u0010\u0016J\u000F\u0010\u0018\u001A\u00020\fH\u0014\u00A2\u0006\u0004\b\u0018\u0010\u0016J\u001F\u0010\u001B\u001A\u00020\f2\u0006\u0010\u0019\u001A\u00020\u00062\u0006\u0010\u001A\u001A\u00020\u0006H\u0004\u00A2\u0006\u0004\b\u001B\u0010\u001CJ\u001F\u0010\u001E\u001A\u00020\f2\u0006\u0010\u0019\u001A\u00020\u00062\u0006\u0010\u001A\u001A\u00020\u0006H\u0010\u00A2\u0006\u0004\b\u001D\u0010\u001CJ7\u0010%\u001A\u00020\f2\u0006\u0010 \u001A\u00020\u001F2\u0006\u0010!\u001A\u00020\u00062\u0006\u0010\"\u001A\u00020\u00062\u0006\u0010#\u001A\u00020\u00062\u0006\u0010$\u001A\u00020\u0006H\u0004\u00A2\u0006\u0004\b%\u0010&J7\u0010(\u001A\u00020\f2\u0006\u0010 \u001A\u00020\u001F2\u0006\u0010!\u001A\u00020\u00062\u0006\u0010\"\u001A\u00020\u00062\u0006\u0010#\u001A\u00020\u00062\u0006\u0010$\u001A\u00020\u0006H\u0010\u00A2\u0006\u0004\b\'\u0010&J\u0017\u0010*\u001A\u00020\f2\u0006\u0010)\u001A\u00020\u0006H\u0016\u00A2\u0006\u0004\b*\u0010+J\u000F\u0010,\u001A\u00020\u001FH\u0016\u00A2\u0006\u0004\b,\u0010-J\u0017\u0010.\u001A\u00020\f2\u0006\u0010,\u001A\u00020\u001FH\u0016\u00A2\u0006\u0004\b.\u0010/J\u0019\u00102\u001A\u00020\f2\b\u00101\u001A\u0004\u0018\u000100H\u0016\u00A2\u0006\u0004\b2\u00103J!\u00102\u001A\u00020\f2\b\u00101\u001A\u0004\u0018\u0001002\u0006\u00104\u001A\u00020\u0006H\u0016\u00A2\u0006\u0004\b2\u00105J)\u00102\u001A\u00020\f2\b\u00101\u001A\u0004\u0018\u0001002\u0006\u00106\u001A\u00020\u00062\u0006\u00107\u001A\u00020\u0006H\u0016\u00A2\u0006\u0004\b2\u00108J#\u00102\u001A\u00020\f2\b\u00101\u001A\u0004\u0018\u0001002\b\u0010:\u001A\u0004\u0018\u000109H\u0016\u00A2\u0006\u0004\b2\u0010;J+\u00102\u001A\u00020\f2\b\u00101\u001A\u0004\u0018\u0001002\u0006\u00104\u001A\u00020\u00062\b\u0010:\u001A\u0004\u0018\u000109H\u0016\u00A2\u0006\u0004\b2\u0010<J+\u0010=\u001A\u00020\u001F2\b\u00101\u001A\u0004\u0018\u0001002\u0006\u00104\u001A\u00020\u00062\b\u0010:\u001A\u0004\u0018\u000109H\u0014\u00A2\u0006\u0004\b=\u0010>J3\u0010=\u001A\u00020\u001F2\b\u00101\u001A\u0004\u0018\u0001002\u0006\u00104\u001A\u00020\u00062\b\u0010:\u001A\u0004\u0018\u0001092\u0006\u0010?\u001A\u00020\u001FH\u0014\u00A2\u0006\u0004\b=\u0010@J\u000F\u0010A\u001A\u00020\u001FH\u0016\u00A2\u0006\u0004\bA\u0010-R(\u0010H\u001A\u0004\u0018\u00010B2\b\u0010C\u001A\u0004\u0018\u00010B8\u0002@BX\u0082\u000E\u00A2\u0006\f\n\u0004\bD\u0010E\"\u0004\bF\u0010GR(\u0010L\u001A\u0004\u0018\u00010\n2\b\u0010C\u001A\u0004\u0018\u00010\n8\u0002@BX\u0082\u000E\u00A2\u0006\f\n\u0004\bI\u0010J\"\u0004\bK\u0010\u000ER$\u0010Q\u001A\n\u0012\u0004\u0012\u00020\f\u0018\u00010M8\u0002@\u0002X\u0082\u000E\u00A2\u0006\f\n\u0004\bN\u0010O\u0012\u0004\bP\u0010\u0016R0\u0010W\u001A\u00020\u001F2\u0006\u0010C\u001A\u00020\u001F8F@FX\u0087\u000E\u00A2\u0006\u0018\n\u0004\bR\u0010S\u0012\u0004\bV\u0010\u0016\u001A\u0004\bT\u0010-\"\u0004\bU\u0010/R\u0014\u0010Y\u001A\u00020\u001F8TX\u0094\u0004\u00A2\u0006\u0006\u001A\u0004\bX\u0010-R\u0011\u0010[\u001A\u00020\u001F8F\u00A2\u0006\u0006\u001A\u0004\bZ\u0010-\u00A8\u0006\\"}, d2 = {"Landroidx/compose/ui/platform/AbstractComposeView;", "Landroid/view/ViewGroup;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroidx/compose/runtime/CompositionContext;", "parent", "", "setParentCompositionContext", "(Landroidx/compose/runtime/CompositionContext;)V", "Landroidx/compose/ui/platform/ViewCompositionStrategy;", "strategy", "setViewCompositionStrategy", "(Landroidx/compose/ui/platform/ViewCompositionStrategy;)V", "Content", "(Landroidx/compose/runtime/Composer;I)V", "createComposition", "()V", "disposeComposition", "onAttachedToWindow", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "(II)V", "internalOnMeasure$ui_release", "internalOnMeasure", "", "changed", "left", "top", "right", "bottom", "onLayout", "(ZIIII)V", "internalOnLayout$ui_release", "internalOnLayout", "layoutDirection", "onRtlPropertiesChanged", "(I)V", "isTransitionGroup", "()Z", "setTransitionGroup", "(Z)V", "Landroid/view/View;", "child", "addView", "(Landroid/view/View;)V", "index", "(Landroid/view/View;I)V", "width", "height", "(Landroid/view/View;II)V", "Landroid/view/ViewGroup$LayoutParams;", "params", "(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V", "(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V", "addViewInLayout", "(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)Z", "preventRequestLayout", "(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;Z)Z", "shouldDelayChildPressedState", "Landroid/os/IBinder;", "value", "x", "Landroid/os/IBinder;", "setPreviousAttachedWindowToken", "(Landroid/os/IBinder;)V", "previousAttachedWindowToken", "z", "Landroidx/compose/runtime/CompositionContext;", "setParentContext", "parentContext", "Lkotlin/Function0;", "A", "Lkotlin/jvm/functions/Function0;", "getDisposeViewCompositionStrategy$annotations", "disposeViewCompositionStrategy", "B", "Z", "getShowLayoutBounds", "setShowLayoutBounds", "getShowLayoutBounds$annotations", "showLayoutBounds", "getShouldCreateCompositionOnAttachedToWindow", "shouldCreateCompositionOnAttachedToWindow", "getHasComposition", "hasComposition", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nComposeView.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComposeView.android.kt\nandroidx/compose/ui/platform/AbstractComposeView\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,461:1\n1#2:462\n*E\n"})
public abstract class AbstractComposeView extends ViewGroup {
    public static final int $stable = 8;
    public Function0 A;
    public boolean B;
    public boolean C;
    public boolean D;
    public WeakReference w;
    public IBinder x;
    public Composition y;
    public CompositionContext z;

    @JvmOverloads
    public AbstractComposeView(@NotNull Context context0) {
        this(context0, null, 0, 6, null);
    }

    @JvmOverloads
    public AbstractComposeView(@NotNull Context context0, @Nullable AttributeSet attributeSet0) {
        this(context0, attributeSet0, 0, 4, null);
    }

    @JvmOverloads
    public AbstractComposeView(@NotNull Context context0, @Nullable AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0, v);
        this.setClipChildren(false);
        this.setClipToPadding(false);
        this.A = ViewCompositionStrategy.Companion.getDefault().installFor(this);
    }

    public AbstractComposeView(Context context0, AttributeSet attributeSet0, int v, int v1, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v1 & 2) != 0) {
            attributeSet0 = null;
        }
        if((v1 & 4) != 0) {
            v = 0;
        }
        this(context0, attributeSet0, v);
    }

    @Composable
    @UiComposable
    public abstract void Content(@Nullable Composer arg1, int arg2);

    public final void a() {
        if(!this.C) {
            throw new UnsupportedOperationException("Cannot add views to " + this.getClass().getSimpleName() + "; only Compose content is supported");
        }
    }

    @Override  // android.view.ViewGroup
    public void addView(@Nullable View view0) {
        this.a();
        super.addView(view0);
    }

    @Override  // android.view.ViewGroup
    public void addView(@Nullable View view0, int v) {
        this.a();
        super.addView(view0, v);
    }

    @Override  // android.view.ViewGroup
    public void addView(@Nullable View view0, int v, int v1) {
        this.a();
        super.addView(view0, v, v1);
    }

    @Override  // android.view.ViewGroup
    public void addView(@Nullable View view0, int v, @Nullable ViewGroup.LayoutParams viewGroup$LayoutParams0) {
        this.a();
        super.addView(view0, v, viewGroup$LayoutParams0);
    }

    @Override  // android.view.ViewGroup
    public void addView(@Nullable View view0, @Nullable ViewGroup.LayoutParams viewGroup$LayoutParams0) {
        this.a();
        super.addView(view0, viewGroup$LayoutParams0);
    }

    @Override  // android.view.ViewGroup
    public boolean addViewInLayout(@Nullable View view0, int v, @Nullable ViewGroup.LayoutParams viewGroup$LayoutParams0) {
        this.a();
        return super.addViewInLayout(view0, v, viewGroup$LayoutParams0);
    }

    @Override  // android.view.ViewGroup
    public boolean addViewInLayout(@Nullable View view0, int v, @Nullable ViewGroup.LayoutParams viewGroup$LayoutParams0, boolean z) {
        this.a();
        return super.addViewInLayout(view0, v, viewGroup$LayoutParams0, z);
    }

    public final void b() {
        if(this.y == null) {
            try {
                this.C = true;
                CompositionContext compositionContext0 = this.z;
                if(compositionContext0 == null) {
                    compositionContext0 = WindowRecomposer_androidKt.findViewTreeCompositionContext(this);
                    CompositionContext compositionContext1 = null;
                    if(compositionContext0 == null) {
                        compositionContext0 = null;
                    }
                    else {
                        CompositionContext compositionContext2 = !(compositionContext0 instanceof Recomposer) || ((State)((Recomposer)compositionContext0).getCurrentState().getValue()).compareTo(State.ShuttingDown) > 0 ? compositionContext0 : null;
                        if(compositionContext2 != null) {
                            this.w = new WeakReference(compositionContext2);
                        }
                    }
                    if(compositionContext0 == null) {
                        WeakReference weakReference0 = this.w;
                        if(weakReference0 == null) {
                            compositionContext0 = null;
                        }
                        else {
                            compositionContext0 = (CompositionContext)weakReference0.get();
                            if(compositionContext0 == null || compositionContext0 instanceof Recomposer && ((State)((Recomposer)compositionContext0).getCurrentState().getValue()).compareTo(State.ShuttingDown) <= 0) {
                                compositionContext0 = null;
                            }
                        }
                        if(compositionContext0 == null) {
                            compositionContext0 = WindowRecomposer_androidKt.getWindowRecomposer(this);
                            if(compositionContext0 == null || ((State)((Recomposer)compositionContext0).getCurrentState().getValue()).compareTo(State.ShuttingDown) > 0) {
                                compositionContext1 = compositionContext0;
                            }
                            if(compositionContext1 != null) {
                                this.w = new WeakReference(compositionContext1);
                            }
                        }
                    }
                }
                this.y = Wrapper_androidKt.setContent(this, compositionContext0, ComposableLambdaKt.composableLambdaInstance(0xD8E40040, true, new b1(this, 6)));
                this.C = false;
            }
            catch(Throwable throwable0) {
                this.C = false;
                throw throwable0;
            }
        }
    }

    public final void createComposition() {
        if(this.z == null && !this.isAttachedToWindow()) {
            throw new IllegalStateException("createComposition requires either a parent reference or the View to be attachedto a window. Attach the View or call setParentCompositionReference.");
        }
        this.b();
    }

    public final void disposeComposition() {
        Composition composition0 = this.y;
        if(composition0 != null) {
            composition0.dispose();
        }
        this.y = null;
        this.requestLayout();
    }

    private static void getDisposeViewCompositionStrategy$annotations() {
    }

    public final boolean getHasComposition() {
        return this.y != null;
    }

    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return true;
    }

    public final boolean getShowLayoutBounds() {
        return this.B;
    }

    @InternalComposeUiApi
    public static void getShowLayoutBounds$annotations() {
    }

    public void internalOnLayout$ui_release(boolean z, int v, int v1, int v2, int v3) {
        View view0 = this.getChildAt(0);
        if(view0 != null) {
            view0.layout(this.getPaddingLeft(), this.getPaddingTop(), v2 - v - this.getPaddingRight(), v3 - v1 - this.getPaddingBottom());
        }
    }

    public void internalOnMeasure$ui_release(int v, int v1) {
        View view0 = this.getChildAt(0);
        if(view0 == null) {
            super.onMeasure(v, v1);
            return;
        }
        int v2 = Math.max(0, View.MeasureSpec.getSize(v) - this.getPaddingLeft() - this.getPaddingRight());
        int v3 = Math.max(0, View.MeasureSpec.getSize(v1) - this.getPaddingTop() - this.getPaddingBottom());
        view0.measure(View.MeasureSpec.makeMeasureSpec(v2, View.MeasureSpec.getMode(v)), View.MeasureSpec.makeMeasureSpec(v3, View.MeasureSpec.getMode(v1)));
        int v4 = view0.getMeasuredWidth();
        int v5 = this.getPaddingLeft();
        int v6 = this.getPaddingRight();
        int v7 = view0.getMeasuredHeight();
        int v8 = this.getPaddingTop();
        this.setMeasuredDimension(v6 + (v5 + v4), this.getPaddingBottom() + (v8 + v7));
    }

    // 去混淆评级： 低(20)
    @Override  // android.view.ViewGroup
    public boolean isTransitionGroup() {
        return !this.D || super.isTransitionGroup();
    }

    @Override  // android.view.ViewGroup
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.setPreviousAttachedWindowToken(this.getWindowToken());
        if(this.getShouldCreateCompositionOnAttachedToWindow()) {
            this.b();
        }
    }

    @Override  // android.view.ViewGroup
    public final void onLayout(boolean z, int v, int v1, int v2, int v3) {
        this.internalOnLayout$ui_release(z, v, v1, v2, v3);
    }

    @Override  // android.view.View
    public final void onMeasure(int v, int v1) {
        this.b();
        this.internalOnMeasure$ui_release(v, v1);
    }

    @Override  // android.view.View
    public void onRtlPropertiesChanged(int v) {
        View view0 = this.getChildAt(0);
        if(view0 != null) {
            view0.setLayoutDirection(v);
        }
    }

    public final void setParentCompositionContext(@Nullable CompositionContext compositionContext0) {
        this.setParentContext(compositionContext0);
    }

    private final void setParentContext(CompositionContext compositionContext0) {
        if(this.z != compositionContext0) {
            this.z = compositionContext0;
            if(compositionContext0 != null) {
                this.w = null;
            }
            Composition composition0 = this.y;
            if(composition0 != null) {
                composition0.dispose();
                this.y = null;
                if(this.isAttachedToWindow()) {
                    this.b();
                }
            }
        }
    }

    private final void setPreviousAttachedWindowToken(IBinder iBinder0) {
        if(this.x != iBinder0) {
            this.x = iBinder0;
            this.w = null;
        }
    }

    public final void setShowLayoutBounds(boolean z) {
        this.B = z;
        View view0 = this.getChildAt(0);
        if(view0 != null) {
            ((Owner)view0).setShowLayoutBounds(z);
        }
    }

    @Override  // android.view.ViewGroup
    public void setTransitionGroup(boolean z) {
        super.setTransitionGroup(z);
        this.D = true;
    }

    public final void setViewCompositionStrategy(@NotNull ViewCompositionStrategy viewCompositionStrategy0) {
        Function0 function00 = this.A;
        if(function00 != null) {
            function00.invoke();
        }
        this.A = viewCompositionStrategy0.installFor(this);
    }

    @Override  // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }
}

