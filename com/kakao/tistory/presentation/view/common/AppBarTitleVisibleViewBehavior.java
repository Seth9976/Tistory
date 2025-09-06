package com.kakao.tistory.presentation.view.common;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.kakao.tistory.presentation.R.color;
import com.kakao.tistory.presentation.R.dimen;
import com.kakao.tistory.presentation.R.drawable;
import com.kakao.tistory.presentation.R.id;
import com.kakao.tistory.presentation.common.extension.AnimationExtensionKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0002\b\u0004\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u001E\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0011\b\u0016\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u00A2\u0006\u0004\b\u0006\u0010\u0007B\u001B\b\u0016\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u0012\b\u0010\t\u001A\u0004\u0018\u00010\b\u00A2\u0006\u0004\b\u0006\u0010\nJ?\u0010\u0014\u001A\u00020\u00132\u0006\u0010\f\u001A\u00020\u000B2\u0006\u0010\r\u001A\u00028\u00002\u0006\u0010\u000E\u001A\u00020\u00012\u0006\u0010\u000F\u001A\u00020\u00012\u0006\u0010\u0011\u001A\u00020\u00102\u0006\u0010\u0012\u001A\u00020\u0010H\u0016\u00A2\u0006\u0004\b\u0014\u0010\u0015JG\u0010\u001B\u001A\u00020\u001A2\u0006\u0010\f\u001A\u00020\u000B2\u0006\u0010\r\u001A\u00028\u00002\u0006\u0010\u000F\u001A\u00020\u00012\u0006\u0010\u0016\u001A\u00020\u00102\u0006\u0010\u0017\u001A\u00020\u00102\u0006\u0010\u0019\u001A\u00020\u00182\u0006\u0010\u0012\u001A\u00020\u0010H\u0016\u00A2\u0006\u0004\b\u001B\u0010\u001CJ\u0015\u0010\u001D\u001A\u00020\u001A2\u0006\u0010\f\u001A\u00020\u000B\u00A2\u0006\u0004\b\u001D\u0010\u001EJA\u0010%\u001A\u00020\u001A2\n\b\u0002\u0010 \u001A\u0004\u0018\u00010\u001F2\u0006\u0010!\u001A\u00020\u00012\b\b\u0002\u0010\"\u001A\u00020\u00102\b\b\u0002\u0010#\u001A\u00020\u00132\n\b\u0002\u0010$\u001A\u0004\u0018\u00010\u0013\u00A2\u0006\u0004\b%\u0010&J\u0015\u0010(\u001A\u00020\u001A2\u0006\u0010\'\u001A\u00020\u0001\u00A2\u0006\u0004\b(\u0010)J\u0015\u0010+\u001A\u00020\u001A2\u0006\u0010*\u001A\u00020\u0001\u00A2\u0006\u0004\b+\u0010)R\"\u00102\u001A\u00020\u00138\u0006@\u0006X\u0086\u000E\u00A2\u0006\u0012\n\u0004\b,\u0010-\u001A\u0004\b.\u0010/\"\u0004\b0\u00101R\"\u00104\u001A\u00020\u00138\u0006@\u0006X\u0086\u000E\u00A2\u0006\u0012\n\u0004\b3\u0010-\u001A\u0004\b4\u0010/\"\u0004\b5\u00101R$\u0010<\u001A\u0004\u0018\u00010\u001F8\u0006@\u0006X\u0086\u000E\u00A2\u0006\u0012\n\u0004\b6\u00107\u001A\u0004\b8\u00109\"\u0004\b:\u0010;\u00A8\u0006="}, d2 = {"Lcom/kakao/tistory/presentation/view/common/AppBarTitleVisibleViewBehavior;", "Landroid/view/View;", "V", "Landroidx/coordinatorlayout/widget/CoordinatorLayout$Behavior;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Landroidx/coordinatorlayout/widget/CoordinatorLayout;", "coordinatorLayout", "child", "directTargetChild", "target", "", "axes", "type", "", "onStartNestedScroll", "(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;Landroid/view/View;Landroid/view/View;II)Z", "dx", "dy", "", "consumed", "", "onNestedPreScroll", "(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;Landroid/view/View;II[II)V", "setupView", "(Landroidx/coordinatorlayout/widget/CoordinatorLayout;)V", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "showOrHideTarget", "direction", "needInitState", "showAppBarTitle", "showOrHide", "(Landroidx/recyclerview/widget/RecyclerView;Landroid/view/View;IZLjava/lang/Boolean;)V", "targetView", "updateNowTarget", "(Landroid/view/View;)V", "view", "hide", "h", "Z", "getAppBarLogoEnabled", "()Z", "setAppBarLogoEnabled", "(Z)V", "appBarLogoEnabled", "i", "isBlog", "setBlog", "k", "Landroidx/recyclerview/widget/RecyclerView;", "getBehaviorTargetView", "()Landroidx/recyclerview/widget/RecyclerView;", "setBehaviorTargetView", "(Landroidx/recyclerview/widget/RecyclerView;)V", "behaviorTargetView", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class AppBarTitleVisibleViewBehavior extends Behavior {
    public static final int $stable = 8;
    public final Context a;
    public Toolbar b;
    public ImageView c;
    public TextView d;
    public ImageButton e;
    public Drawable f;
    public ImageButton g;
    public boolean h;
    public boolean i;
    public final boolean j;
    public RecyclerView k;
    public final int l;
    public final int m;
    public int n;

    public AppBarTitleVisibleViewBehavior(@NotNull Context context0) {
        Intrinsics.checkNotNullParameter(context0, "context");
        this(context0, null);
    }

    public AppBarTitleVisibleViewBehavior(@NotNull Context context0, @Nullable AttributeSet attributeSet0) {
        Intrinsics.checkNotNullParameter(context0, "context");
        super(context0, attributeSet0);
        this.j = true;
        this.l = 1;
        this.m = 2;
        this.n = 0;
        this.a = context0;
    }

    public static RecyclerView a(ViewGroup viewGroup0) {
        int v = viewGroup0.getChildCount();
        for(int v1 = 0; v1 < v; ++v1) {
            View view0 = viewGroup0.getChildAt(v1);
            if(view0 instanceof RecyclerView) {
                return (RecyclerView)view0;
            }
            if(view0 instanceof SwipeRefreshLayout) {
                return AppBarTitleVisibleViewBehavior.a(((ViewGroup)view0));
            }
        }
        return null;
    }

    public final boolean getAppBarLogoEnabled() {
        return this.h;
    }

    @Nullable
    public final RecyclerView getBehaviorTargetView() {
        return this.k;
    }

    public final void hide(@NotNull View view0) {
        Intrinsics.checkNotNullParameter(view0, "view");
        int v = this.l;
        if(this.n != v) {
            this.n = v;
            AnimationExtensionKt.animHide(view0, a.a, b.a, 4);
            ImageView imageView0 = this.c;
            if(imageView0 != null) {
                if(this.h) {
                    AnimationExtensionKt.animHide(imageView0, c.a, d.a, 4);
                }
                else {
                    imageView0.setVisibility(8);
                }
            }
            TextView textView0 = this.d;
            if(textView0 != null) {
                AnimationExtensionKt.animShow(textView0, e.a, f.a);
            }
        }
        if(this.i) {
            ImageButton imageButton0 = this.e;
            if(imageButton0 != null) {
                imageButton0.setImageResource(drawable.ic_navi_back_w);
            }
            ImageButton imageButton1 = this.g;
            if(imageButton1 != null) {
                imageButton1.setImageResource(drawable.ic_bar_search_profile);
            }
        }
        else {
            ImageButton imageButton2 = this.e;
            if(imageButton2 != null) {
                imageButton2.setImageResource(drawable.ic_navi_back_b);
            }
            ImageButton imageButton3 = this.g;
            if(imageButton3 != null) {
                imageButton3.setImageResource(drawable.ic_bar_search);
            }
        }
        Toolbar toolbar0 = this.b;
        if(toolbar0 != null) {
            toolbar0.setBackgroundColor(ContextCompat.getColor(this.a, color.transparent));
        }
    }

    public final boolean isBlog() {
        return this.i;
    }

    @Override  // androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior
    public void onNestedPreScroll(@NotNull CoordinatorLayout coordinatorLayout0, @NotNull View view0, @NotNull View view1, int v, int v1, @NotNull int[] arr_v, int v2) {
        RecyclerView recyclerView0;
        Intrinsics.checkNotNullParameter(coordinatorLayout0, "coordinatorLayout");
        Intrinsics.checkNotNullParameter(view0, "child");
        Intrinsics.checkNotNullParameter(view1, "target");
        Intrinsics.checkNotNullParameter(arr_v, "consumed");
        this.setupView(coordinatorLayout0);
        if((view1 instanceof FrameLayout ? true : view1 instanceof SwipeRefreshLayout)) {
            recyclerView0 = AppBarTitleVisibleViewBehavior.a(((ViewGroup)view1));
        }
        else {
            recyclerView0 = view1 instanceof RecyclerView ? ((RecyclerView)view1) : null;
        }
        AppBarTitleVisibleViewBehavior.showOrHide$default(this, recyclerView0, view0, v1, false, null, 24, null);
    }

    @Override  // androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior
    public boolean onStartNestedScroll(@NotNull CoordinatorLayout coordinatorLayout0, @NotNull View view0, @NotNull View view1, @NotNull View view2, int v, int v1) {
        Intrinsics.checkNotNullParameter(coordinatorLayout0, "coordinatorLayout");
        Intrinsics.checkNotNullParameter(view0, "child");
        Intrinsics.checkNotNullParameter(view1, "directTargetChild");
        Intrinsics.checkNotNullParameter(view2, "target");
        return (v & 2) != 0;
    }

    public final void setAppBarLogoEnabled(boolean z) {
        this.h = z;
    }

    public final void setBehaviorTargetView(@Nullable RecyclerView recyclerView0) {
        this.k = recyclerView0;
    }

    public final void setBlog(boolean z) {
        this.i = z;
    }

    public final void setupView(@NotNull CoordinatorLayout coordinatorLayout0) {
        Intrinsics.checkNotNullParameter(coordinatorLayout0, "coordinatorLayout");
        if(this.b == null) {
            this.b = (Toolbar)coordinatorLayout0.findViewById(id.common_toolbar);
        }
        Drawable drawable0 = null;
        if(this.c == null) {
            this.c = this.b == null ? null : ((ImageView)this.b.findViewById(id.common_app_bar_logo_image));
        }
        if(this.d == null) {
            TextView textView0 = this.b == null ? null : ((TextView)this.b.findViewById(id.common_toolbar_menu_text));
            this.d = textView0;
            Intrinsics.checkNotNull(textView0);
            Intrinsics.checkNotNullExpressionValue(textView0.getText(), "getText(...)");
        }
        if(this.e == null) {
            this.e = this.b == null ? null : ((ImageButton)this.b.findViewById(id.common_app_bar_home_as_up_button));
        }
        if(this.g == null) {
            this.g = this.b == null ? null : ((ImageButton)this.b.findViewById(id.common_app_search_button));
        }
        if(!this.i) {
            ImageButton imageButton0 = this.e;
            if(imageButton0 != null) {
                drawable0 = imageButton0.getDrawable();
            }
        }
        this.f = drawable0;
    }

    public final void showOrHide(@Nullable RecyclerView recyclerView0, @NotNull View view0, int v, boolean z, @Nullable Boolean boolean0) {
        Unit unit0;
        boolean z1;
        Intrinsics.checkNotNullParameter(view0, "showOrHideTarget");
        if(boolean0 == null) {
            RecyclerView recyclerView1 = this.k;
            if(recyclerView1 == null || recyclerView0 == null) {
                z1 = recyclerView0 == null || recyclerView0.getLayoutManager() == null || ((float)recyclerView0.computeVerticalScrollOffset()) > this.a.getResources().getDimension(dimen.common_toolbar_height);
            }
            else {
                if(!Intrinsics.areEqual(recyclerView1, recyclerView0)) {
                    return;
                }
                z1 = recyclerView0.getLayoutManager() != null && ((float)recyclerView0.computeVerticalScrollOffset()) <= this.a.getResources().getDimension(dimen.common_toolbar_height) ? false : true;
            }
        }
        else {
            z1 = boolean0.booleanValue();
        }
        if(z) {
            this.n = 0;
        }
        if(z1 && v >= 0) {
            int v1 = this.m;
            if(this.n != v1) {
                this.n = v1;
                AnimationExtensionKt.animShow(view0, g.a, h.a);
                ImageView imageView0 = this.c;
                if(imageView0 != null) {
                    if(this.h) {
                        AnimationExtensionKt.animShow(imageView0, i.a, j.a);
                    }
                    else {
                        imageView0.setVisibility(8);
                    }
                }
                TextView textView0 = this.d;
                if(textView0 != null) {
                    AnimationExtensionKt.animHide(textView0, k.a, l.a, 4);
                }
            }
            if(!this.i || !this.j) {
                Toolbar toolbar1 = this.b;
                if(toolbar1 != null) {
                    toolbar1.setBackgroundResource(drawable.bg_fff_border_bottom_gray3_05dp);
                }
                Drawable drawable0 = this.f;
                if(drawable0 == null) {
                label_53:
                    ImageButton imageButton3 = this.e;
                    if(imageButton3 != null) {
                        imageButton3.setImageResource(drawable.ic_navi_back_b);
                    }
                }
                else {
                    ImageButton imageButton2 = this.e;
                    if(imageButton2 == null) {
                        unit0 = null;
                    }
                    else {
                        imageButton2.setImageDrawable(drawable0);
                        unit0 = Unit.INSTANCE;
                    }
                    if(unit0 == null) {
                        goto label_53;
                    }
                }
                ImageButton imageButton4 = this.g;
                if(imageButton4 != null) {
                    imageButton4.setImageResource(drawable.ic_bar_search);
                }
            }
            else {
                Toolbar toolbar0 = this.b;
                if(toolbar0 != null) {
                    toolbar0.setBackgroundColor(ContextCompat.getColor(this.a, color.white));
                }
                ImageButton imageButton0 = this.e;
                if(imageButton0 != null) {
                    imageButton0.setImageResource(drawable.ic_navi_back_b);
                }
                ImageButton imageButton1 = this.g;
                if(imageButton1 != null) {
                    imageButton1.setImageResource(drawable.ic_bar_search);
                }
            }
        }
        else if(!z1 && v <= 0) {
            this.hide(view0);
        }
    }

    public static void showOrHide$default(AppBarTitleVisibleViewBehavior appBarTitleVisibleViewBehavior0, RecyclerView recyclerView0, View view0, int v, boolean z, Boolean boolean0, int v1, Object object0) {
        appBarTitleVisibleViewBehavior0.showOrHide(((v1 & 1) == 0 ? recyclerView0 : null), view0, ((v1 & 4) == 0 ? v : 0), ((v1 & 8) == 0 ? z : false), ((v1 & 16) == 0 ? boolean0 : null));
    }

    public final void updateNowTarget(@NotNull View view0) {
        Intrinsics.checkNotNullParameter(view0, "targetView");
        if(view0 instanceof ViewGroup) {
            this.k = AppBarTitleVisibleViewBehavior.a(((ViewGroup)view0));
        }
    }
}

