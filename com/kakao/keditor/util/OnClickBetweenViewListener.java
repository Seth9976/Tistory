package com.kakao.keditor.util;

import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import androidx.recyclerview.widget.RecyclerView.LayoutManager;
import androidx.recyclerview.widget.RecyclerView.SimpleOnItemTouchListener;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import androidx.recyclerview.widget.RecyclerView;
import com.kakao.keditor.internal.KeditorAdapter;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.c;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0010B\r\u0012\u0006\u0010\u0002\u001A\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0018\u0010\u000B\u001A\u00020\t2\u0006\u0010\f\u001A\u00020\r2\u0006\u0010\u000E\u001A\u00020\u000FH\u0016R\u000E\u0010\u0002\u001A\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000E\u0010\u0005\u001A\u00020\u0006X\u0082\u000E¢\u0006\u0002\n\u0000R\u000E\u0010\u0007\u001A\u00020\u0006X\u0082\u000E¢\u0006\u0002\n\u0000R\u000E\u0010\b\u001A\u00020\tX\u0082\u000E¢\u0006\u0002\n\u0000R\u000E\u0010\n\u001A\u00020\u0006X\u0082D¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/kakao/keditor/util/OnClickBetweenViewListener;", "Landroidx/recyclerview/widget/RecyclerView$SimpleOnItemTouchListener;", "listener", "Lcom/kakao/keditor/util/OnClickBetweenViewListener$OnClickListener;", "(Lcom/kakao/keditor/util/OnClickBetweenViewListener$OnClickListener;)V", "mDownX", "", "mDownY", "mIsClick", "", "threshold", "onInterceptTouchEvent", "rv", "Landroidx/recyclerview/widget/RecyclerView;", "motionEvent", "Landroid/view/MotionEvent;", "OnClickListener", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class OnClickBetweenViewListener extends SimpleOnItemTouchListener {
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J \u0010\u0002\u001A\u00020\u00032\u0006\u0010\u0004\u001A\u00020\u00052\u0006\u0010\u0006\u001A\u00020\u00072\u0006\u0010\b\u001A\u00020\u0007H&J\u0018\u0010\t\u001A\u00020\u00032\u0006\u0010\u0004\u001A\u00020\u00052\u0006\u0010\n\u001A\u00020\u0007H&J\u0010\u0010\u000B\u001A\u00020\u00032\u0006\u0010\f\u001A\u00020\rH&J\u0018\u0010\u000E\u001A\u00020\u00032\u0006\u0010\u0004\u001A\u00020\u00052\u0006\u0010\u000F\u001A\u00020\u0007H&¨\u0006\u0010"}, d2 = {"Lcom/kakao/keditor/util/OnClickBetweenViewListener$OnClickListener;", "", "onClickBetweenArea", "", "rv", "Landroidx/recyclerview/widget/RecyclerView;", "aboveVh", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "belowVh", "onClickBottomArea", "lastVh", "onClickItem", "findChildView", "Landroid/view/View;", "onClickTopArea", "firstVh", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public interface OnClickListener {
        void onClickBetweenArea(@NotNull RecyclerView arg1, @NotNull ViewHolder arg2, @NotNull ViewHolder arg3);

        void onClickBottomArea(@NotNull RecyclerView arg1, @NotNull ViewHolder arg2);

        void onClickItem(@NotNull View arg1);

        void onClickTopArea(@NotNull RecyclerView arg1, @NotNull ViewHolder arg2);
    }

    @NotNull
    private final OnClickListener listener;
    private float mDownX;
    private float mDownY;
    private boolean mIsClick;
    private final float threshold;

    public OnClickBetweenViewListener(@NotNull OnClickListener onClickBetweenViewListener$OnClickListener0) {
        Intrinsics.checkNotNullParameter(onClickBetweenViewListener$OnClickListener0, "listener");
        super();
        this.listener = onClickBetweenViewListener$OnClickListener0;
        this.threshold = 10.0f;
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$SimpleOnItemTouchListener
    public boolean onInterceptTouchEvent(@NotNull RecyclerView recyclerView0, @NotNull MotionEvent motionEvent0) {
        Integer integer3;
        Integer integer2;
        Integer integer1;
        int v4;
        Integer integer0;
        Intrinsics.checkNotNullParameter(recyclerView0, "rv");
        Intrinsics.checkNotNullParameter(motionEvent0, "motionEvent");
        int v = motionEvent0.getAction();
    alab1:
        switch(v & 0xFF) {
            case 0: {
                this.mDownX = motionEvent0.getX();
                this.mDownY = motionEvent0.getY();
                this.mIsClick = true;
                return false;
            label_9:
                switch(v & 0xFF) {
                    case 2: {
                        if(this.mIsClick && (Math.abs(this.mDownX - motionEvent0.getX()) > this.threshold || Math.abs(this.mDownY - motionEvent0.getY()) > this.threshold)) {
                            this.mIsClick = false;
                            return false;
                        }
                        break alab1;
                    }
                    case 3: {
                        goto label_14;
                    }
                    default: {
                        return false;
                    }
                }
            }
            case 1: {
            label_14:
                if(this.mIsClick) {
                    float f = motionEvent0.getY();
                    Adapter recyclerView$Adapter0 = recyclerView0.getAdapter();
                    LayoutManager recyclerView$LayoutManager0 = recyclerView0.getLayoutManager();
                    if(recyclerView$LayoutManager0 instanceof LinearLayoutManager && recyclerView$Adapter0 != null) {
                        View view0 = recyclerView0.findChildViewUnder(motionEvent0.getX(), f);
                        if(view0 == null) {
                            int v1 = ((LinearLayoutManager)recyclerView$LayoutManager0).findFirstVisibleItemPosition();
                            int v2 = ((LinearLayoutManager)recyclerView$LayoutManager0).findLastVisibleItemPosition();
                            KeditorAdapter keditorAdapter0 = recyclerView$Adapter0 instanceof KeditorAdapter ? ((KeditorAdapter)recyclerView$Adapter0) : null;
                            int v3 = keditorAdapter0 == null ? 0 : keditorAdapter0.getFirstItemViewPosition();
                            if(v1 <= v3) {
                                ViewHolder recyclerView$ViewHolder0 = recyclerView0.findViewHolderForAdapterPosition(v3);
                                if(recyclerView$ViewHolder0 == null) {
                                    integer0 = null;
                                }
                                else {
                                    View view1 = recyclerView$ViewHolder0.itemView;
                                    integer0 = view1 == null ? null : view1.getTop();
                                }
                                if(integer0 != null && 0.0f < f && f < ((float)(((int)integer0)))) {
                                    this.listener.onClickTopArea(recyclerView0, recyclerView$ViewHolder0);
                                    return false;
                                }
                            }
                            KeditorAdapter keditorAdapter1 = recyclerView$Adapter0 instanceof KeditorAdapter ? ((KeditorAdapter)recyclerView$Adapter0) : null;
                            if(keditorAdapter1 == null) {
                                v4 = 0;
                            }
                            else {
                                List list0 = keditorAdapter1.getItems();
                                v4 = list0 == null ? 0 : list0.size();
                            }
                            if(v4 != 0 && v2 >= recyclerView$Adapter0.getItemCount() - 1) {
                                ViewHolder recyclerView$ViewHolder1 = recyclerView0.findViewHolderForAdapterPosition(c.coerceAtMost(v2, recyclerView$Adapter0.getItemCount() - 1));
                                if(recyclerView$ViewHolder1 == null) {
                                    integer1 = null;
                                }
                                else {
                                    View view2 = recyclerView$ViewHolder1.itemView;
                                    integer1 = view2 == null ? null : view2.getBottom();
                                }
                                if(integer1 != null && ((float)(((int)integer1))) < f) {
                                    this.listener.onClickBottomArea(recyclerView0, recyclerView$ViewHolder1);
                                    return false;
                                }
                            }
                            while(true) {
                                if(v1 >= v2) {
                                    break alab1;
                                }
                                ViewHolder recyclerView$ViewHolder2 = recyclerView0.findViewHolderForAdapterPosition(v1);
                                ++v1;
                                ViewHolder recyclerView$ViewHolder3 = recyclerView0.findViewHolderForAdapterPosition(v1);
                                if(recyclerView$ViewHolder2 == null) {
                                    integer2 = null;
                                }
                                else {
                                    View view3 = recyclerView$ViewHolder2.itemView;
                                    if(view3 != null) {
                                        integer2 = view3.getBottom();
                                    }
                                }
                                if(recyclerView$ViewHolder3 == null) {
                                    integer3 = null;
                                }
                                else {
                                    View view4 = recyclerView$ViewHolder3.itemView;
                                    if(view4 != null) {
                                        integer3 = view4.getTop();
                                    }
                                }
                                if(integer2 == null || integer3 == null || ((float)(((int)integer2))) >= f || f >= ((float)(((int)integer3)))) {
                                    continue;
                                }
                                this.listener.onClickBetweenArea(recyclerView0, recyclerView$ViewHolder2, recyclerView$ViewHolder3);
                                return false;
                            }
                        }
                        this.listener.onClickItem(view0);
                        return false;
                    }
                    return false;
                }
                break;
            }
            default: {
                goto label_9;
            }
        }
        return false;
    }
}

