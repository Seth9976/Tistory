package com.kakao.keditor.widget.extention;

import androidx.activity.m;
import androidx.recyclerview.widget.ItemTouchHelper.Callback;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import androidx.recyclerview.widget.RecyclerView;
import com.kakao.keditor.KeditorView;
import com.kakao.keditor.standard.ViewStandardKt;
import com.kakao.keditor.widget.KeditorEditText;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000B\n\u0002\b\r\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001A\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0018\u0010\u0007\u001A\u00020\b2\u0006\u0010\t\u001A\u00020\n2\u0006\u0010\u000B\u001A\u00020\fH\u0016J\u0018\u0010\r\u001A\u00020\u000E2\u0006\u0010\t\u001A\u00020\n2\u0006\u0010\u000B\u001A\u00020\fH\u0016J\b\u0010\u000F\u001A\u00020\u0010H\u0016J\b\u0010\u0011\u001A\u00020\u0010H\u0016J\u0018\u0010\u0012\u001A\u00020\b2\u0006\u0010\t\u001A\u00020\n2\u0006\u0010\u000B\u001A\u00020\fH\u0002J \u0010\u0013\u001A\u00020\u00102\u0006\u0010\t\u001A\u00020\n2\u0006\u0010\u000B\u001A\u00020\f2\u0006\u0010\u0014\u001A\u00020\fH\u0016J@\u0010\u0015\u001A\u00020\b2\u0006\u0010\t\u001A\u00020\n2\u0006\u0010\u000B\u001A\u00020\f2\u0006\u0010\u0016\u001A\u00020\u000E2\u0006\u0010\u0014\u001A\u00020\f2\u0006\u0010\u0017\u001A\u00020\u000E2\u0006\u0010\u0018\u001A\u00020\u000E2\u0006\u0010\u0019\u001A\u00020\u000EH\u0016J\u0018\u0010\u001A\u001A\u00020\b2\u0006\u0010\t\u001A\u00020\n2\u0006\u0010\u000B\u001A\u00020\fH\u0002J\u0018\u0010\u001B\u001A\u00020\b2\u0006\u0010\u000B\u001A\u00020\f2\u0006\u0010\u001C\u001A\u00020\u000EH\u0016R\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u0005\u0010\u0006¨\u0006\u001D"}, d2 = {"Lcom/kakao/keditor/widget/extention/ItemTouchHelperCallback;", "Landroidx/recyclerview/widget/ItemTouchHelper$Callback;", "listener", "Lcom/kakao/keditor/widget/extention/ItemActionListener;", "(Lcom/kakao/keditor/widget/extention/ItemActionListener;)V", "getListener", "()Lcom/kakao/keditor/widget/extention/ItemActionListener;", "clearView", "", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "viewHolder", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "getMovementFlags", "", "isItemViewSwipeEnabled", "", "isLongPressDragEnabled", "onFinishDrag", "onMove", "target", "onMoved", "fromPos", "toPos", "x", "y", "onStartDrag", "onSwiped", "direction", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class ItemTouchHelperCallback extends Callback {
    @NotNull
    private final ItemActionListener listener;

    public ItemTouchHelperCallback(@NotNull ItemActionListener itemActionListener0) {
        Intrinsics.checkNotNullParameter(itemActionListener0, "listener");
        super();
        this.listener = itemActionListener0;
    }

    @Override  // androidx.recyclerview.widget.ItemTouchHelper$Callback
    public void clearView(@NotNull RecyclerView recyclerView0, @NotNull ViewHolder recyclerView$ViewHolder0) {
        Intrinsics.checkNotNullParameter(recyclerView0, "recyclerView");
        Intrinsics.checkNotNullParameter(recyclerView$ViewHolder0, "viewHolder");
        this.onFinishDrag(recyclerView0, recyclerView$ViewHolder0);
        super.clearView(recyclerView0, recyclerView$ViewHolder0);
    }

    @NotNull
    public final ItemActionListener getListener() {
        return this.listener;
    }

    @Override  // androidx.recyclerview.widget.ItemTouchHelper$Callback
    public int getMovementFlags(@NotNull RecyclerView recyclerView0, @NotNull ViewHolder recyclerView$ViewHolder0) {
        Intrinsics.checkNotNullParameter(recyclerView0, "recyclerView");
        Intrinsics.checkNotNullParameter(recyclerView$ViewHolder0, "viewHolder");
        if(recyclerView0 instanceof KeditorView) {
            if(!((KeditorView)recyclerView0).isEnableDragAndDrop$keditor_release(recyclerView$ViewHolder0)) {
                return 0;
            }
            if(((KeditorView)recyclerView0).getHeight() != ((KeditorView)recyclerView0).getInitialHeight() * 2) {
                this.onStartDrag(recyclerView0, recyclerView$ViewHolder0);
            }
            return 0x33033;
        }
        return 0x33033;
    }

    @Override  // androidx.recyclerview.widget.ItemTouchHelper$Callback
    public boolean isItemViewSwipeEnabled() {
        return false;
    }

    @Override  // androidx.recyclerview.widget.ItemTouchHelper$Callback
    public boolean isLongPressDragEnabled() {
        return true;
    }

    private final void onFinishDrag(RecyclerView recyclerView0, ViewHolder recyclerView$ViewHolder0) {
        if(!(recyclerView0 instanceof KeditorView)) {
            return;
        }
        ((KeditorView)recyclerView0).setFocusBlocked$keditor_release(false);
        Intrinsics.checkNotNullExpressionValue(recyclerView$ViewHolder0.itemView, "itemView");
        ViewStandardKt.findAllKeditorEditText$default(recyclerView$ViewHolder0.itemView, null, com.kakao.keditor.widget.extention.ItemTouchHelperCallback.onFinishDrag.1.1.INSTANCE, 1, null);
        ((KeditorView)recyclerView0).requestLayout();
        Intrinsics.checkNotNullExpressionValue(recyclerView$ViewHolder0.itemView, "itemView");
        ViewStandardKt.setScale(recyclerView$ViewHolder0.itemView, 1.0f);
        recyclerView$ViewHolder0.itemView.setAlpha(1.0f);
        recyclerView0.post(new m(19, this, recyclerView$ViewHolder0));

        @Metadata(d1 = {"\u0000\u000E\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001A\u00020\u00012\u0006\u0010\u0002\u001A\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/kakao/keditor/widget/KeditorEditText;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 0x30)
        final class com.kakao.keditor.widget.extention.ItemTouchHelperCallback.onFinishDrag.1.1 extends Lambda implements Function1 {
            public static final com.kakao.keditor.widget.extention.ItemTouchHelperCallback.onFinishDrag.1.1 INSTANCE;

            static {
                com.kakao.keditor.widget.extention.ItemTouchHelperCallback.onFinishDrag.1.1.INSTANCE = new com.kakao.keditor.widget.extention.ItemTouchHelperCallback.onFinishDrag.1.1();
            }

            public com.kakao.keditor.widget.extention.ItemTouchHelperCallback.onFinishDrag.1.1() {
                super(1);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.invoke(((KeditorEditText)object0));
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull KeditorEditText keditorEditText0) {
                Intrinsics.checkNotNullParameter(keditorEditText0, "it");
                if(ViewStandardKt.hasIsEnableState(keditorEditText0)) {
                    ViewStandardKt.restoreIsEnableState(keditorEditText0);
                }
            }
        }

    }

    private static final void onFinishDrag$lambda$2(ItemTouchHelperCallback itemTouchHelperCallback0, ViewHolder recyclerView$ViewHolder0) {
        Intrinsics.checkNotNullParameter(itemTouchHelperCallback0, "this$0");
        Intrinsics.checkNotNullParameter(recyclerView$ViewHolder0, "$viewHolder");
        int v = recyclerView$ViewHolder0.getAdapterPosition();
        itemTouchHelperCallback0.listener.onDragEnd(v);
    }

    @Override  // androidx.recyclerview.widget.ItemTouchHelper$Callback
    public boolean onMove(@NotNull RecyclerView recyclerView0, @NotNull ViewHolder recyclerView$ViewHolder0, @NotNull ViewHolder recyclerView$ViewHolder1) {
        Intrinsics.checkNotNullParameter(recyclerView0, "recyclerView");
        Intrinsics.checkNotNullParameter(recyclerView$ViewHolder0, "viewHolder");
        Intrinsics.checkNotNullParameter(recyclerView$ViewHolder1, "target");
        int v = recyclerView$ViewHolder0.getAdapterPosition();
        int v1 = recyclerView$ViewHolder1.getAdapterPosition();
        this.listener.onItemMoved(v, v1);
        return true;
    }

    @Override  // androidx.recyclerview.widget.ItemTouchHelper$Callback
    public void onMoved(@NotNull RecyclerView recyclerView0, @NotNull ViewHolder recyclerView$ViewHolder0, int v, @NotNull ViewHolder recyclerView$ViewHolder1, int v1, int v2, int v3) {
        Intrinsics.checkNotNullParameter(recyclerView0, "recyclerView");
        Intrinsics.checkNotNullParameter(recyclerView$ViewHolder0, "viewHolder");
        Intrinsics.checkNotNullParameter(recyclerView$ViewHolder1, "target");
        super.onMoved(recyclerView0, recyclerView$ViewHolder0, v, recyclerView$ViewHolder1, v1, v2, v3);
        recyclerView0.scrollBy(0, recyclerView0.getPaddingTop());
    }

    private final void onStartDrag(RecyclerView recyclerView0, ViewHolder recyclerView$ViewHolder0) {
        if(recyclerView0 instanceof KeditorView && !((KeditorView)recyclerView0).isReadOnly() && !((KeditorView)recyclerView0).isRequestOnly()) {
            this.listener.onDragStart();
            ((KeditorView)recyclerView0).setFocusBlocked$keditor_release(true);
            Intrinsics.checkNotNullExpressionValue(recyclerView$ViewHolder0.itemView, "itemView");
            ViewStandardKt.findAllKeditorEditText$default(recyclerView$ViewHolder0.itemView, null, com.kakao.keditor.widget.extention.ItemTouchHelperCallback.onStartDrag.1.1.INSTANCE, 1, null);
            ((KeditorView)recyclerView0).clearEditTextFocusIfNecessary();
            ((KeditorView)recyclerView0).requestLayout();
            recyclerView$ViewHolder0.itemView.setAlpha(0.7f);
            Intrinsics.checkNotNullExpressionValue(recyclerView$ViewHolder0.itemView, "itemView");
            ViewStandardKt.setScale(recyclerView$ViewHolder0.itemView, 0.9f);
        }

        @Metadata(d1 = {"\u0000\u000E\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001A\u00020\u00012\u0006\u0010\u0002\u001A\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/kakao/keditor/widget/KeditorEditText;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 0x30)
        final class com.kakao.keditor.widget.extention.ItemTouchHelperCallback.onStartDrag.1.1 extends Lambda implements Function1 {
            public static final com.kakao.keditor.widget.extention.ItemTouchHelperCallback.onStartDrag.1.1 INSTANCE;

            static {
                com.kakao.keditor.widget.extention.ItemTouchHelperCallback.onStartDrag.1.1.INSTANCE = new com.kakao.keditor.widget.extention.ItemTouchHelperCallback.onStartDrag.1.1();
            }

            public com.kakao.keditor.widget.extention.ItemTouchHelperCallback.onStartDrag.1.1() {
                super(1);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.invoke(((KeditorEditText)object0));
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull KeditorEditText keditorEditText0) {
                Intrinsics.checkNotNullParameter(keditorEditText0, "it");
                if(!ViewStandardKt.hasIsEnableState(keditorEditText0)) {
                    ViewStandardKt.saveIsEnableState(keditorEditText0);
                }
                keditorEditText0.setEnabled(false);
            }
        }

    }

    @Override  // androidx.recyclerview.widget.ItemTouchHelper$Callback
    public void onSwiped(@NotNull ViewHolder recyclerView$ViewHolder0, int v) {
        Intrinsics.checkNotNullParameter(recyclerView$ViewHolder0, "viewHolder");
    }
}

