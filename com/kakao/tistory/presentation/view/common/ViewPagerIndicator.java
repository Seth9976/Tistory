package com.kakao.tistory.presentation.view.common;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout.LayoutParams;
import android.widget.LinearLayout;
import androidx.compose.runtime.internal.StabilityInferred;
import com.kakao.tistory.presentation.R.drawable;
import java.util.ArrayList;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import md.c;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0015\b\u0007\u0018\u00002\u00020\u0001B\u0013\b\u0016\u0012\b\u0010\u0003\u001A\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001D\b\u0016\u0012\b\u0010\u0003\u001A\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001A\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0004\u0010\bB%\b\u0016\u0012\b\u0010\u0003\u001A\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001A\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001A\u00020\t¢\u0006\u0004\b\u0004\u0010\u000BJ\u0015\u0010\u000E\u001A\u00020\r2\u0006\u0010\f\u001A\u00020\t¢\u0006\u0004\b\u000E\u0010\u000FR\"\u0010\u0015\u001A\u00020\t8\u0006@\u0006X\u0086\u000E¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001A\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u000FR*\u0010\u001A\u001A\u00020\t2\u0006\u0010\u0016\u001A\u00020\t8\u0006@FX\u0086\u000E¢\u0006\u0012\n\u0004\b\u0017\u0010\u0011\u001A\u0004\b\u0018\u0010\u0013\"\u0004\b\u0019\u0010\u000FR\u001B\u0010\u001E\u001A\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001B\u0010\u001C\u001A\u0004\b\u001D\u0010\u0013R\u001B\u0010!\u001A\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001F\u0010\u001C\u001A\u0004\b \u0010\u0013¨\u0006\""}, d2 = {"Lcom/kakao/tistory/presentation/view/common/ViewPagerIndicator;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "position", "", "updateIndicator", "(I)V", "b", "I", "getCurrentItem", "()I", "setCurrentItem", "currentItem", "value", "c", "getCount", "setCount", "count", "d", "Lkotlin/Lazy;", "getDotSize", "dotSize", "e", "getDotOffset", "dotOffset", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class ViewPagerIndicator extends LinearLayout {
    public static final int $stable = 8;
    public final ArrayList a;
    public int b;
    public int c;
    public final Lazy d;
    public final Lazy e;

    public ViewPagerIndicator(@Nullable Context context0) {
        super(context0);
        this.a = new ArrayList();
        this.d = c.lazy(new f0(this));
        this.e = c.lazy(new e0(this));
    }

    public ViewPagerIndicator(@Nullable Context context0, @Nullable AttributeSet attributeSet0) {
        super(context0, attributeSet0);
        this.a = new ArrayList();
        this.d = c.lazy(new f0(this));
        this.e = c.lazy(new e0(this));
    }

    public ViewPagerIndicator(@Nullable Context context0, @Nullable AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0, v);
        this.a = new ArrayList();
        this.d = c.lazy(new f0(this));
        this.e = c.lazy(new e0(this));
    }

    public final int getCount() {
        return this.c;
    }

    public final int getCurrentItem() {
        return this.b;
    }

    private final int getDotOffset() {
        return ((Number)this.e.getValue()).intValue();
    }

    private final int getDotSize() {
        return ((Number)this.d.getValue()).intValue();
    }

    public final void setCount(int v) {
        this.c = v;
        if(this.getChildCount() > 0) {
            this.removeAllViews();
        }
        if(v > 0) {
            int v1 = this.c;
            for(int v2 = 0; v2 < v1; ++v2) {
                ImageView imageView0 = new ImageView(this.getContext());
                LinearLayout.LayoutParams linearLayout$LayoutParams0 = new LinearLayout.LayoutParams(this.getDotSize(), this.getDotSize());
                linearLayout$LayoutParams0.leftMargin = this.getDotOffset();
                linearLayout$LayoutParams0.rightMargin = this.getDotOffset();
                imageView0.setLayoutParams(linearLayout$LayoutParams0);
                imageView0.setBackgroundResource(drawable.transition_view_pager_indicator);
                imageView0.setTag(imageView0.getId(), Boolean.FALSE);
                this.a.add(imageView0);
                this.addView(((View)this.a.get(v2)));
            }
        }
        this.updateIndicator(this.b);
    }

    public final void setCurrentItem(int v) {
        this.b = v;
    }

    public final void updateIndicator(int v) {
        if(this.a.isEmpty()) {
            return;
        }
        int v1 = 0;
        for(Object object0: this.a) {
            ImageView imageView0 = (ImageView)object0;
            if(v1 == v) {
                Drawable drawable0 = imageView0.getBackground();
                Intrinsics.checkNotNull(drawable0, "null cannot be cast to non-null type android.graphics.drawable.TransitionDrawable");
                ((TransitionDrawable)drawable0).startTransition(200);
                imageView0.setTag(imageView0.getId(), Boolean.TRUE);
            }
            else {
                Object object1 = imageView0.getTag(imageView0.getId());
                Intrinsics.checkNotNull(object1, "null cannot be cast to non-null type kotlin.Boolean");
                if(((Boolean)object1).booleanValue()) {
                    imageView0.setTag(imageView0.getId(), Boolean.FALSE);
                    Drawable drawable1 = imageView0.getBackground();
                    Intrinsics.checkNotNull(drawable1, "null cannot be cast to non-null type android.graphics.drawable.TransitionDrawable");
                    ((TransitionDrawable)drawable1).reverseTransition(50);
                }
            }
            ++v1;
        }
    }
}

