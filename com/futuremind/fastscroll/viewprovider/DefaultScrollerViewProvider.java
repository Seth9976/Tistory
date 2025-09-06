package com.futuremind.fastscroll.viewprovider;

import android.graphics.drawable.InsetDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.futuremind.fastscroll.Utils;
import com.kakao.kphotopicker.R.dimen;
import com.kakao.kphotopicker.R.drawable;
import com.kakao.kphotopicker.R.layout;

public class DefaultScrollerViewProvider extends ScrollerViewProvider {
    protected View bubble;
    protected View handle;

    // 去混淆评级： 低(20)
    @Override  // com.futuremind.fastscroll.viewprovider.ScrollerViewProvider
    public int getBubbleOffset() {
        return this.getScroller().isVertical() ? ((int)(((float)this.handle.getHeight()) / 2.0f - ((float)this.bubble.getHeight()))) : ((int)(((float)this.handle.getWidth()) / 2.0f - ((float)this.bubble.getWidth())));
    }

    @Override  // com.futuremind.fastscroll.viewprovider.ScrollerViewProvider
    public ViewBehavior provideBubbleBehavior() {
        return new DefaultBubbleBehavior(new Builder(this.bubble).withPivotX(1.0f).withPivotY(1.0f).build());
    }

    @Override  // com.futuremind.fastscroll.viewprovider.ScrollerViewProvider
    public TextView provideBubbleTextView() {
        return (TextView)this.bubble;
    }

    @Override  // com.futuremind.fastscroll.viewprovider.ScrollerViewProvider
    public View provideBubbleView(ViewGroup viewGroup0) {
        View view0 = LayoutInflater.from(this.getContext()).inflate(layout.fastscroll__default_bubble, viewGroup0, false);
        this.bubble = view0;
        return view0;
    }

    @Override  // com.futuremind.fastscroll.viewprovider.ScrollerViewProvider
    public ViewBehavior provideHandleBehavior() {
        return null;
    }

    @Override  // com.futuremind.fastscroll.viewprovider.ScrollerViewProvider
    public View provideHandleView(ViewGroup viewGroup0) {
        this.handle = new View(this.getContext());
        int v = 0;
        int v1 = this.getScroller().isVertical() ? 0 : this.getContext().getResources().getDimensionPixelSize(dimen.fastscroll__handle_inset);
        if(this.getScroller().isVertical()) {
            v = this.getContext().getResources().getDimensionPixelSize(dimen.fastscroll__handle_inset);
        }
        InsetDrawable insetDrawable0 = new InsetDrawable(ContextCompat.getDrawable(this.getContext(), drawable.fastscroll__default_handle), v, v1, v, v1);
        Utils.setBackground(this.handle, insetDrawable0);
        ViewGroup.LayoutParams viewGroup$LayoutParams0 = new ViewGroup.LayoutParams(this.getContext().getResources().getDimensionPixelSize((this.getScroller().isVertical() ? dimen.fastscroll__handle_clickable_width : dimen.fastscroll__handle_height)), this.getContext().getResources().getDimensionPixelSize((this.getScroller().isVertical() ? dimen.fastscroll__handle_height : dimen.fastscroll__handle_clickable_width)));
        this.handle.setLayoutParams(viewGroup$LayoutParams0);
        return this.handle;
    }
}

