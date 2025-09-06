package com.kakao.kphotopicker.widget.dragselection;

import android.os.Handler;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000E\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\n\u0018\u00002\u00020\u0001J\u000F\u0010\u0003\u001A\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/kakao/kphotopicker/widget/dragselection/DragSelectTouchListener$autoScrollRunnable$1", "Ljava/lang/Runnable;", "", "run", "()V", "kphotopicker_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class DragSelectTouchListener.autoScrollRunnable.1 implements Runnable {
    public final DragSelectTouchListener a;

    public DragSelectTouchListener.autoScrollRunnable.1(DragSelectTouchListener dragSelectTouchListener0) {
        this.a = dragSelectTouchListener0;
    }

    @Override
    public void run() {
        DragSelectTouchListener dragSelectTouchListener0 = this.a;
        RecyclerView recyclerView0 = DragSelectTouchListener.access$getRecyclerView$p(dragSelectTouchListener0);
        if(recyclerView0 != null) {
            recyclerView0.scrollBy(0, DragSelectTouchListener.access$getAutoScrollVelocity$p(dragSelectTouchListener0));
        }
        Handler handler0 = DragSelectTouchListener.access$getAutoScrollHandler(dragSelectTouchListener0);
        if(handler0 != null) {
            handler0.postDelayed(this, 10L);
        }
    }
}

