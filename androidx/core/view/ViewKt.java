package androidx.core.view;

import android.graphics.Bitmap.Config;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.view.View.OnAttachStateChangeListener;
import android.view.View.OnLayoutChangeListener;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import androidx.annotation.Px;
import androidx.compose.ui.platform.m;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt__SequenceBuilderKt;
import kotlin.sequences.SequencesKt__SequencesKt;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000j\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u001A2\u0010 \u001A\u00020!*\u00020\u00022#\b\u0004\u0010\"\u001A\u001D\u0012\u0013\u0012\u00110\u0002\u00A2\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b(&\u0012\u0004\u0012\u00020!0#H\u0086\b\u001A2\u0010\'\u001A\u00020!*\u00020\u00022#\b\u0004\u0010\"\u001A\u001D\u0012\u0013\u0012\u00110\u0002\u00A2\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b(&\u0012\u0004\u0012\u00020!0#H\u0086\b\u001A2\u0010(\u001A\u00020!*\u00020\u00022#\b\u0004\u0010\"\u001A\u001D\u0012\u0013\u0012\u00110\u0002\u00A2\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b(&\u0012\u0004\u0012\u00020!0#H\u0086\b\u001A2\u0010)\u001A\u00020!*\u00020\u00022#\b\u0004\u0010\"\u001A\u001D\u0012\u0013\u0012\u00110\u0002\u00A2\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b(&\u0012\u0004\u0012\u00020!0#H\u0086\b\u001A2\u0010*\u001A\u00020+*\u00020\u00022#\b\u0004\u0010\"\u001A\u001D\u0012\u0013\u0012\u00110\u0002\u00A2\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b(&\u0012\u0004\u0012\u00020!0#H\u0086\b\u001A\u0014\u0010,\u001A\u00020-*\u00020\u00022\b\b\u0002\u0010.\u001A\u00020/\u001A%\u00100\u001A\u000201*\u00020\u00022\u0006\u00102\u001A\u0002032\u000E\b\u0004\u0010\"\u001A\b\u0012\u0004\u0012\u00020!04H\u0086\b\u001A \u00105\u001A\u000201*\u00020\u00022\u0006\u00102\u001A\u0002032\f\u0010\"\u001A\b\u0012\u0004\u0012\u00020!04\u001A\u0017\u00106\u001A\u00020!*\u00020\u00022\b\b\u0001\u00107\u001A\u00020\u0013H\u0086\b\u001A7\u00108\u001A\u00020!\"\n\b\u0000\u00109\u0018\u0001*\u00020:*\u00020\u00022\u0017\u0010;\u001A\u0013\u0012\u0004\u0012\u0002H9\u0012\u0004\u0012\u00020!0#\u00A2\u0006\u0002\b<H\u0087\b\u00A2\u0006\u0002\b=\u001A&\u00108\u001A\u00020!*\u00020\u00022\u0017\u0010;\u001A\u0013\u0012\u0004\u0012\u00020:\u0012\u0004\u0012\u00020!0#\u00A2\u0006\u0002\b<H\u0086\b\u001A5\u0010>\u001A\u00020!*\u00020\u00022\b\b\u0003\u0010?\u001A\u00020\u00132\b\b\u0003\u0010@\u001A\u00020\u00132\b\b\u0003\u0010A\u001A\u00020\u00132\b\b\u0003\u0010B\u001A\u00020\u0013H\u0086\b\u001A5\u0010C\u001A\u00020!*\u00020\u00022\b\b\u0003\u0010D\u001A\u00020\u00132\b\b\u0003\u0010@\u001A\u00020\u00132\b\b\u0003\u0010E\u001A\u00020\u00132\b\b\u0003\u0010B\u001A\u00020\u0013H\u0086\b\"\u001B\u0010\u0000\u001A\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u00028F\u00A2\u0006\u0006\u001A\u0004\b\u0003\u0010\u0004\"\u001B\u0010\u0005\u001A\b\u0012\u0004\u0012\u00020\u00060\u0001*\u00020\u00028F\u00A2\u0006\u0006\u001A\u0004\b\u0007\u0010\u0004\"*\u0010\n\u001A\u00020\t*\u00020\u00022\u0006\u0010\b\u001A\u00020\t8\u00C6\u0002@\u00C6\u0002X\u0086\u000E\u00A2\u0006\f\u001A\u0004\b\n\u0010\u000B\"\u0004\b\f\u0010\r\"*\u0010\u000E\u001A\u00020\t*\u00020\u00022\u0006\u0010\b\u001A\u00020\t8\u00C6\u0002@\u00C6\u0002X\u0086\u000E\u00A2\u0006\f\u001A\u0004\b\u000E\u0010\u000B\"\u0004\b\u000F\u0010\r\"*\u0010\u0010\u001A\u00020\t*\u00020\u00022\u0006\u0010\b\u001A\u00020\t8\u00C6\u0002@\u00C6\u0002X\u0086\u000E\u00A2\u0006\f\u001A\u0004\b\u0010\u0010\u000B\"\u0004\b\u0011\u0010\r\"\u0016\u0010\u0012\u001A\u00020\u0013*\u00020\u00028\u00C6\u0002\u00A2\u0006\u0006\u001A\u0004\b\u0014\u0010\u0015\"\u0016\u0010\u0016\u001A\u00020\u0013*\u00020\u00028\u00C6\u0002\u00A2\u0006\u0006\u001A\u0004\b\u0017\u0010\u0015\"\u0016\u0010\u0018\u001A\u00020\u0013*\u00020\u00028\u00C6\u0002\u00A2\u0006\u0006\u001A\u0004\b\u0019\u0010\u0015\"\u0016\u0010\u001A\u001A\u00020\u0013*\u00020\u00028\u00C6\u0002\u00A2\u0006\u0006\u001A\u0004\b\u001B\u0010\u0015\"\u0016\u0010\u001C\u001A\u00020\u0013*\u00020\u00028\u00C6\u0002\u00A2\u0006\u0006\u001A\u0004\b\u001D\u0010\u0015\"\u0016\u0010\u001E\u001A\u00020\u0013*\u00020\u00028\u00C6\u0002\u00A2\u0006\u0006\u001A\u0004\b\u001F\u0010\u0015\u00A8\u0006F"}, d2 = {"allViews", "Lkotlin/sequences/Sequence;", "Landroid/view/View;", "getAllViews", "(Landroid/view/View;)Lkotlin/sequences/Sequence;", "ancestors", "Landroid/view/ViewParent;", "getAncestors", "value", "", "isGone", "(Landroid/view/View;)Z", "setGone", "(Landroid/view/View;Z)V", "isInvisible", "setInvisible", "isVisible", "setVisible", "marginBottom", "", "getMarginBottom", "(Landroid/view/View;)I", "marginEnd", "getMarginEnd", "marginLeft", "getMarginLeft", "marginRight", "getMarginRight", "marginStart", "getMarginStart", "marginTop", "getMarginTop", "doOnAttach", "", "action", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "view", "doOnDetach", "doOnLayout", "doOnNextLayout", "doOnPreDraw", "Landroidx/core/view/OneShotPreDrawListener;", "drawToBitmap", "Landroid/graphics/Bitmap;", "config", "Landroid/graphics/Bitmap$Config;", "postDelayed", "Ljava/lang/Runnable;", "delayInMillis", "", "Lkotlin/Function0;", "postOnAnimationDelayed", "setPadding", "size", "updateLayoutParams", "T", "Landroid/view/ViewGroup$LayoutParams;", "block", "Lkotlin/ExtensionFunctionType;", "updateLayoutParamsTyped", "updatePadding", "left", "top", "right", "bottom", "updatePaddingRelative", "start", "end", "core-ktx_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 View.kt\nandroidx/core/view/ViewKt\n+ 2 Bitmap.kt\nandroidx/core/graphics/BitmapKt\n*L\n1#1,414:1\n37#1:415\n53#1:416\n326#1,4:420\n43#2,3:417\n*S KotlinDebug\n*F\n+ 1 View.kt\nandroidx/core/view/ViewKt\n*L\n68#1:415\n68#1:416\n310#1:420,4\n232#1:417,3\n*E\n"})
public final class ViewKt {
    public static final void doOnAttach(@NotNull View view0, @NotNull Function1 function10) {
        if(view0.isAttachedToWindow()) {
            function10.invoke(view0);
            return;
        }
        view0.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() {
            @Override  // android.view.View$OnAttachStateChangeListener
            public void onViewAttachedToWindow(@NotNull View view0) {
                view0.removeOnAttachStateChangeListener(this);
                function10.invoke(view0);
            }

            @Override  // android.view.View$OnAttachStateChangeListener
            public void onViewDetachedFromWindow(@NotNull View view0) {
            }
        });
    }

    public static final void doOnDetach(@NotNull View view0, @NotNull Function1 function10) {
        if(!view0.isAttachedToWindow()) {
            function10.invoke(view0);
            return;
        }
        view0.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() {
            @Override  // android.view.View$OnAttachStateChangeListener
            public void onViewAttachedToWindow(@NotNull View view0) {
            }

            @Override  // android.view.View$OnAttachStateChangeListener
            public void onViewDetachedFromWindow(@NotNull View view0) {
                view0.removeOnAttachStateChangeListener(this);
                function10.invoke(view0);
            }
        });
    }

    public static final void doOnLayout(@NotNull View view0, @NotNull Function1 function10) {
        if(view0.isLaidOut() && !view0.isLayoutRequested()) {
            function10.invoke(view0);
            return;
        }
        view0.addOnLayoutChangeListener(new View.OnLayoutChangeListener() {
            @Override  // android.view.View$OnLayoutChangeListener
            public void onLayoutChange(@NotNull View view0, int v, int v1, int v2, int v3, int v4, int v5, int v6, int v7) {
                view0.removeOnLayoutChangeListener(this);
                function10.invoke(view0);
            }
        });
    }

    public static final void doOnNextLayout(@NotNull View view0, @NotNull Function1 function10) {
        view0.addOnLayoutChangeListener(new View.OnLayoutChangeListener() {
            @Override  // android.view.View$OnLayoutChangeListener
            public void onLayoutChange(@NotNull View view0, int v, int v1, int v2, int v3, int v4, int v5, int v6, int v7) {
                view0.removeOnLayoutChangeListener(this);
                function10.invoke(view0);
            }
        });
    }

    @NotNull
    public static final OneShotPreDrawListener doOnPreDraw(@NotNull View view0, @NotNull Function1 function10) {
        return OneShotPreDrawListener.add(view0, new Runnable() {
            @Override
            public final void run() {
                function10.invoke(view0);
            }
        });
    }

    @NotNull
    public static final Bitmap drawToBitmap(@NotNull View view0, @NotNull Bitmap.Config bitmap$Config0) {
        if(!view0.isLaidOut()) {
            throw new IllegalStateException("View needs to be laid out before calling drawToBitmap()");
        }
        Bitmap bitmap0 = Bitmap.createBitmap(view0.getWidth(), view0.getHeight(), bitmap$Config0);
        Canvas canvas0 = new Canvas(bitmap0);
        canvas0.translate(-((float)view0.getScrollX()), -((float)view0.getScrollY()));
        view0.draw(canvas0);
        return bitmap0;
    }

    public static Bitmap drawToBitmap$default(View view0, Bitmap.Config bitmap$Config0, int v, Object object0) {
        if((v & 1) != 0) {
            bitmap$Config0 = Bitmap.Config.ARGB_8888;
        }
        return ViewKt.drawToBitmap(view0, bitmap$Config0);
    }

    @NotNull
    public static final Sequence getAllViews(@NotNull View view0) {
        return SequencesKt__SequenceBuilderKt.sequence(new w0(view0, null));
    }

    @NotNull
    public static final Sequence getAncestors(@NotNull View view0) {
        return SequencesKt__SequencesKt.generateSequence(view0.getParent(), x0.a);
    }

    public static final int getMarginBottom(@NotNull View view0) {
        ViewGroup.LayoutParams viewGroup$LayoutParams0 = view0.getLayoutParams();
        ViewGroup.MarginLayoutParams viewGroup$MarginLayoutParams0 = viewGroup$LayoutParams0 instanceof ViewGroup.MarginLayoutParams ? ((ViewGroup.MarginLayoutParams)viewGroup$LayoutParams0) : null;
        return viewGroup$MarginLayoutParams0 == null ? 0 : viewGroup$MarginLayoutParams0.bottomMargin;
    }

    public static final int getMarginEnd(@NotNull View view0) {
        ViewGroup.LayoutParams viewGroup$LayoutParams0 = view0.getLayoutParams();
        return viewGroup$LayoutParams0 instanceof ViewGroup.MarginLayoutParams ? ((ViewGroup.MarginLayoutParams)viewGroup$LayoutParams0).getMarginEnd() : 0;
    }

    public static final int getMarginLeft(@NotNull View view0) {
        ViewGroup.LayoutParams viewGroup$LayoutParams0 = view0.getLayoutParams();
        ViewGroup.MarginLayoutParams viewGroup$MarginLayoutParams0 = viewGroup$LayoutParams0 instanceof ViewGroup.MarginLayoutParams ? ((ViewGroup.MarginLayoutParams)viewGroup$LayoutParams0) : null;
        return viewGroup$MarginLayoutParams0 == null ? 0 : viewGroup$MarginLayoutParams0.leftMargin;
    }

    public static final int getMarginRight(@NotNull View view0) {
        ViewGroup.LayoutParams viewGroup$LayoutParams0 = view0.getLayoutParams();
        ViewGroup.MarginLayoutParams viewGroup$MarginLayoutParams0 = viewGroup$LayoutParams0 instanceof ViewGroup.MarginLayoutParams ? ((ViewGroup.MarginLayoutParams)viewGroup$LayoutParams0) : null;
        return viewGroup$MarginLayoutParams0 == null ? 0 : viewGroup$MarginLayoutParams0.rightMargin;
    }

    public static final int getMarginStart(@NotNull View view0) {
        ViewGroup.LayoutParams viewGroup$LayoutParams0 = view0.getLayoutParams();
        return viewGroup$LayoutParams0 instanceof ViewGroup.MarginLayoutParams ? ((ViewGroup.MarginLayoutParams)viewGroup$LayoutParams0).getMarginStart() : 0;
    }

    public static final int getMarginTop(@NotNull View view0) {
        ViewGroup.LayoutParams viewGroup$LayoutParams0 = view0.getLayoutParams();
        ViewGroup.MarginLayoutParams viewGroup$MarginLayoutParams0 = viewGroup$LayoutParams0 instanceof ViewGroup.MarginLayoutParams ? ((ViewGroup.MarginLayoutParams)viewGroup$LayoutParams0) : null;
        return viewGroup$MarginLayoutParams0 == null ? 0 : viewGroup$MarginLayoutParams0.topMargin;
    }

    public static final boolean isGone(@NotNull View view0) {
        return view0.getVisibility() == 8;
    }

    public static final boolean isInvisible(@NotNull View view0) {
        return view0.getVisibility() == 4;
    }

    public static final boolean isVisible(@NotNull View view0) {
        return view0.getVisibility() == 0;
    }

    @NotNull
    public static final Runnable postDelayed(@NotNull View view0, long v, @NotNull Function0 function00) {
        Runnable runnable0 = new Runnable() {
            @Override
            public final void run() {
                function00.invoke();
            }
        };
        view0.postDelayed(runnable0, v);
        return runnable0;
    }

    @NotNull
    public static final Runnable postOnAnimationDelayed(@NotNull View view0, long v, @NotNull Function0 function00) {
        Runnable runnable0 = new m(function00, 2);
        view0.postOnAnimationDelayed(runnable0, v);
        return runnable0;
    }

    public static final void setGone(@NotNull View view0, boolean z) {
        view0.setVisibility((z ? 8 : 0));
    }

    public static final void setInvisible(@NotNull View view0, boolean z) {
        view0.setVisibility((z ? 4 : 0));
    }

    public static final void setPadding(@NotNull View view0, @Px int v) {
        view0.setPadding(v, v, v, v);
    }

    public static final void setVisible(@NotNull View view0, boolean z) {
        view0.setVisibility((z ? 0 : 8));
    }

    public static final void updateLayoutParams(@NotNull View view0, @NotNull Function1 function10) {
        ViewGroup.LayoutParams viewGroup$LayoutParams0 = view0.getLayoutParams();
        if(viewGroup$LayoutParams0 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        function10.invoke(viewGroup$LayoutParams0);
        view0.setLayoutParams(viewGroup$LayoutParams0);
    }

    @JvmName(name = "updateLayoutParamsTyped")
    public static final void updateLayoutParamsTyped(View view0, Function1 function10) {
        ViewGroup.LayoutParams viewGroup$LayoutParams0 = view0.getLayoutParams();
        Intrinsics.reifiedOperationMarker(1, "T");
        function10.invoke(viewGroup$LayoutParams0);
        view0.setLayoutParams(viewGroup$LayoutParams0);
    }

    public static final void updatePadding(@NotNull View view0, @Px int v, @Px int v1, @Px int v2, @Px int v3) {
        view0.setPadding(v, v1, v2, v3);
    }

    public static void updatePadding$default(View view0, int v, int v1, int v2, int v3, int v4, Object object0) {
        if((v4 & 1) != 0) {
            v = view0.getPaddingLeft();
        }
        if((v4 & 2) != 0) {
            v1 = view0.getPaddingTop();
        }
        if((v4 & 4) != 0) {
            v2 = view0.getPaddingRight();
        }
        if((v4 & 8) != 0) {
            v3 = view0.getPaddingBottom();
        }
        view0.setPadding(v, v1, v2, v3);
    }

    public static final void updatePaddingRelative(@NotNull View view0, @Px int v, @Px int v1, @Px int v2, @Px int v3) {
        view0.setPaddingRelative(v, v1, v2, v3);
    }

    public static void updatePaddingRelative$default(View view0, int v, int v1, int v2, int v3, int v4, Object object0) {
        if((v4 & 1) != 0) {
            v = view0.getPaddingStart();
        }
        if((v4 & 2) != 0) {
            v1 = view0.getPaddingTop();
        }
        if((v4 & 4) != 0) {
            v2 = view0.getPaddingEnd();
        }
        if((v4 & 8) != 0) {
            v3 = view0.getPaddingBottom();
        }
        view0.setPaddingRelative(v, v1, v2, v3);
    }
}

