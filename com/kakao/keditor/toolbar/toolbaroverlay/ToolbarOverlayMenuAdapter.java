package com.kakao.keditor.toolbar.toolbaroverlay;

import android.view.View;
import androidx.core.view.w;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import com.kakao.keditor.BR;
import com.kakao.keditor.internal.BaseAdapter;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import md.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\u0014\u0012\u0004\u0012\u0002H\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00010\u00030\u0002:\u0001\u0015B\u0015\u0012\u000E\u0010\u0004\u001A\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u001E\u0010\u000F\u001A\u00020\u00102\f\u0010\u0011\u001A\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u0012\u001A\u00020\u0013H\u0016J\u0016\u0010\u0014\u001A\u00020\u00102\f\u0010\u0011\u001A\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0016R\u0019\u0010\u0004\u001A\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0005¢\u0006\b\n\u0000\u001A\u0004\b\u0007\u0010\bR\u001E\u0010\t\u001A\u0004\u0018\u00018\u0000X\u0086\u000E¢\u0006\u0010\n\u0002\u0010\u000E\u001A\u0004\b\n\u0010\u000B\"\u0004\b\f\u0010\r¨\u0006\u0016"}, d2 = {"Lcom/kakao/keditor/toolbar/toolbaroverlay/ToolbarOverlayMenuAdapter;", "T", "Lcom/kakao/keditor/internal/BaseAdapter;", "Lcom/kakao/keditor/toolbar/toolbaroverlay/ToolbarOverlayMenuAdapter$OverlayItemViewHolder;", "listener", "Lcom/kakao/keditor/toolbar/toolbaroverlay/ToolbarOverlayMenuClickedListener;", "(Lcom/kakao/keditor/toolbar/toolbaroverlay/ToolbarOverlayMenuClickedListener;)V", "getListener", "()Lcom/kakao/keditor/toolbar/toolbaroverlay/ToolbarOverlayMenuClickedListener;", "selectedItem", "getSelectedItem", "()Ljava/lang/Object;", "setSelectedItem", "(Ljava/lang/Object;)V", "Ljava/lang/Object;", "onBindViewHolder", "", "holder", "position", "", "onViewAttachedToWindow", "OverlayItemViewHolder", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public abstract class ToolbarOverlayMenuAdapter extends BaseAdapter {
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001A\u00020\u0004¢\u0006\u0002\u0010\u0005J-\u0010\u000E\u001A\u00020\u000F2\u0006\u0010\u0010\u001A\u00028\u00012\b\u0010\u0011\u001A\u0004\u0018\u00018\u00012\u000E\u0010\u0012\u001A\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0013¢\u0006\u0002\u0010\u0014R\u001D\u0010\u0006\u001A\u0004\u0018\u00010\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000B\u001A\u0004\b\b\u0010\tR\u0011\u0010\u0003\u001A\u00020\u0004¢\u0006\b\n\u0000\u001A\u0004\b\f\u0010\r¨\u0006\u0015"}, d2 = {"Lcom/kakao/keditor/toolbar/toolbaroverlay/ToolbarOverlayMenuAdapter$OverlayItemViewHolder;", "T", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "(Landroid/view/View;)V", "binding", "Landroidx/databinding/ViewDataBinding;", "getBinding", "()Landroidx/databinding/ViewDataBinding;", "binding$delegate", "Lkotlin/Lazy;", "getView", "()Landroid/view/View;", "bind", "", "item", "selectedItem", "listener", "Lcom/kakao/keditor/toolbar/toolbaroverlay/ToolbarOverlayMenuClickedListener;", "(Ljava/lang/Object;Ljava/lang/Object;Lcom/kakao/keditor/toolbar/toolbaroverlay/ToolbarOverlayMenuClickedListener;)V", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class OverlayItemViewHolder extends ViewHolder {
        @NotNull
        private final Lazy binding$delegate;
        @NotNull
        private final View view;

        public OverlayItemViewHolder(@NotNull View view0) {
            Intrinsics.checkNotNullParameter(view0, "view");
            super(view0);
            this.view = view0;
            this.binding$delegate = c.lazy(new Function0() {
                {
                    OverlayItemViewHolder.this = toolbarOverlayMenuAdapter$OverlayItemViewHolder0;
                    super(0);
                }

                @Nullable
                public final ViewDataBinding invoke() {
                    return DataBindingUtil.bind(OverlayItemViewHolder.this.itemView);
                }

                @Override  // kotlin.jvm.functions.Function0
                public Object invoke() {
                    return this.invoke();
                }
            });
        }

        public final void bind(Object object0, @Nullable Object object1, @Nullable ToolbarOverlayMenuClickedListener toolbarOverlayMenuClickedListener0) {
            ViewDataBinding viewDataBinding0 = this.getBinding();
            if(viewDataBinding0 != null) {
                viewDataBinding0.setVariable(BR.item, object0);
            }
            ViewDataBinding viewDataBinding1 = this.getBinding();
            if(viewDataBinding1 != null) {
                Boolean boolean0 = Boolean.valueOf(Intrinsics.areEqual(object0, object1));
                viewDataBinding1.setVariable(BR.isSelected, boolean0);
            }
            if(toolbarOverlayMenuClickedListener0 != null) {
                ViewDataBinding viewDataBinding2 = this.getBinding();
                if(viewDataBinding2 != null) {
                    viewDataBinding2.setVariable(BR.listener, toolbarOverlayMenuClickedListener0);
                }
            }
        }

        private final ViewDataBinding getBinding() {
            return (ViewDataBinding)this.binding$delegate.getValue();
        }

        @NotNull
        public final View getView() {
            return this.view;
        }
    }

    @Nullable
    private final ToolbarOverlayMenuClickedListener listener;
    @Nullable
    private Object selectedItem;

    public ToolbarOverlayMenuAdapter(@Nullable ToolbarOverlayMenuClickedListener toolbarOverlayMenuClickedListener0) {
        this.listener = toolbarOverlayMenuClickedListener0;
    }

    @Nullable
    public final ToolbarOverlayMenuClickedListener getListener() {
        return this.listener;
    }

    @Nullable
    public final Object getSelectedItem() {
        return this.selectedItem;
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public void onBindViewHolder(ViewHolder recyclerView$ViewHolder0, int v) {
        this.onBindViewHolder(((OverlayItemViewHolder)recyclerView$ViewHolder0), v);
    }

    public void onBindViewHolder(@NotNull OverlayItemViewHolder toolbarOverlayMenuAdapter$OverlayItemViewHolder0, int v) {
        Intrinsics.checkNotNullParameter(toolbarOverlayMenuAdapter$OverlayItemViewHolder0, "holder");
        toolbarOverlayMenuAdapter$OverlayItemViewHolder0.bind(this.get(v), this.selectedItem, this.listener);
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public void onViewAttachedToWindow(ViewHolder recyclerView$ViewHolder0) {
        this.onViewAttachedToWindow(((OverlayItemViewHolder)recyclerView$ViewHolder0));
    }

    public void onViewAttachedToWindow(@NotNull OverlayItemViewHolder toolbarOverlayMenuAdapter$OverlayItemViewHolder0) {
        Intrinsics.checkNotNullParameter(toolbarOverlayMenuAdapter$OverlayItemViewHolder0, "holder");
        if(toolbarOverlayMenuAdapter$OverlayItemViewHolder0.getAdapterPosition() == 0) {
            w w0 = new w(3, toolbarOverlayMenuAdapter$OverlayItemViewHolder0.itemView);
            toolbarOverlayMenuAdapter$OverlayItemViewHolder0.itemView.post(w0);
        }
    }

    private static final void onViewAttachedToWindow$lambda$1$lambda$0(View view0) {
        Intrinsics.checkNotNullParameter(view0, "$this_run");
        view0.performAccessibilityAction(0x40, null);
        view0.sendAccessibilityEvent(8);
    }

    public final void setSelectedItem(@Nullable Object object0) {
        this.selectedItem = object0;
    }
}

