package com.kakao.android.base.ui.recyclerview;

import android.view.View;
import androidx.annotation.CallSuper;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import com.google.android.material.datepicker.t;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.subjects.BehaviorSubject;
import io.reactivex.subjects.Subject;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Deprecated(message = "don\'t use")
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\u000B\n\u0002\u0010!\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\b\'\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001*B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u000F\u0010\u0007\u001A\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ1\u0010\u000B\u001A&\u0012\f\u0012\n \n*\u0004\u0018\u00018\u00008\u0000 \n*\u0012\u0012\f\u0012\n \n*\u0004\u0018\u00018\u00008\u0000\u0018\u00010\t0\t¢\u0006\u0004\b\u000B\u0010\fR\"\u0010\u0014\u001A\u00020\r8\u0004@\u0004X\u0084\u000E¢\u0006\u0012\n\u0004\b\u000E\u0010\u000F\u001A\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\"\u0010\u0018\u001A\u00020\r8\u0004@\u0004X\u0084\u000E¢\u0006\u0012\n\u0004\b\u0015\u0010\u000F\u001A\u0004\b\u0016\u0010\u0011\"\u0004\b\u0017\u0010\u0013R6\u0010!\u001A\b\u0012\u0004\u0012\u00028\u00000\u00192\f\u0010\u001A\u001A\b\u0012\u0004\u0012\u00028\u00000\u00198\u0006@FX\u0086\u000E¢\u0006\u0012\n\u0004\b\u001B\u0010\u001C\u001A\u0004\b\u001D\u0010\u001E\"\u0004\b\u001F\u0010 R(\u0010)\u001A\b\u0012\u0004\u0012\u00028\u00000\"8\u0004@\u0004X\u0084\u000E¢\u0006\u0012\n\u0004\b#\u0010$\u001A\u0004\b%\u0010&\"\u0004\b\'\u0010(¨\u0006+"}, d2 = {"Lcom/kakao/android/base/ui/recyclerview/BaseRecyclerAdapter;", "T", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "<init>", "()V", "", "getItemCount", "()I", "Lio/reactivex/Observable;", "kotlin.jvm.PlatformType", "onItemClick", "()Lio/reactivex/Observable;", "", "h", "Z", "getHasHeader", "()Z", "setHasHeader", "(Z)V", "hasHeader", "i", "getHasFooter", "setHasFooter", "hasFooter", "", "value", "j", "Ljava/util/List;", "getItems", "()Ljava/util/List;", "setItems", "(Ljava/util/List;)V", "items", "Lio/reactivex/subjects/Subject;", "k", "Lio/reactivex/subjects/Subject;", "getOnItemClickSubject", "()Lio/reactivex/subjects/Subject;", "setOnItemClickSubject", "(Lio/reactivex/subjects/Subject;)V", "onItemClickSubject", "BaseRecyclerViewHolder", "base_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public abstract class BaseRecyclerAdapter extends Adapter {
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0096\u0004\u0018\u0000*\b\b\u0001\u0010\u0002*\u00020\u00012\u00020\u0003B\u000F\u0012\u0006\u0010\u0004\u001A\u00028\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001A\u00020\t2\u0006\u0010\b\u001A\u00020\u0007H\u0014¢\u0006\u0004\b\n\u0010\u000BJ\u001F\u0010\u000F\u001A\u00020\t2\u0006\u0010\r\u001A\u00020\f2\u0006\u0010\u000E\u001A\u00028\u0000H\u0017¢\u0006\u0004\b\u000F\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/kakao/android/base/ui/recyclerview/BaseRecyclerAdapter$BaseRecyclerViewHolder;", "Landroidx/databinding/ViewDataBinding;", "VB", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "dataBinding", "<init>", "(Lcom/kakao/android/base/ui/recyclerview/BaseRecyclerAdapter;Landroidx/databinding/ViewDataBinding;)V", "Landroid/view/View;", "it", "", "onItemClick", "(Landroid/view/View;)V", "", "itemBindingVariableId", "item", "bind", "(ILjava/lang/Object;)V", "base_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public class BaseRecyclerViewHolder extends ViewHolder {
        public final ViewDataBinding c;
        public final BaseRecyclerAdapter d;
        public static final int e;

        public BaseRecyclerViewHolder(@NotNull ViewDataBinding viewDataBinding0) {
            Intrinsics.checkNotNullParameter(viewDataBinding0, "dataBinding");
            this.d = baseRecyclerAdapter0;
            super(viewDataBinding0.getRoot());
            this.c = viewDataBinding0;
            t t0 = new t(this, 11);
            this.itemView.setOnClickListener(t0);
        }

        @CallSuper
        public void bind(int v, Object object0) {
            this.c.setVariable(v, object0);
            this.c.executePendingBindings();
        }

        public void onItemClick(@NotNull View view0) {
            Intrinsics.checkNotNullParameter(view0, "it");
            if(this.getAdapterPosition() == -1) {
                return;
            }
            int v = this.getAdapterPosition();
            BaseRecyclerAdapter baseRecyclerAdapter0 = this.d;
            if(baseRecyclerAdapter0.getHasHeader()) {
                if(this.getAdapterPosition() == 0) {
                    return;
                }
                --v;
            }
            if(baseRecyclerAdapter0.getHasFooter() && this.getAdapterPosition() == baseRecyclerAdapter0.getItems().size() + 1) {
                return;
            }
            Object object0 = CollectionsKt___CollectionsKt.getOrNull(baseRecyclerAdapter0.getItems(), v);
            if(object0 != null) {
                baseRecyclerAdapter0.getOnItemClickSubject().onNext(object0);
            }
        }
    }

    public final long g;
    public boolean h;
    public boolean i;
    public List j;
    public Subject k;

    public BaseRecyclerAdapter() {
        this.g = 100L;
        this.j = new ArrayList();
        BehaviorSubject behaviorSubject0 = BehaviorSubject.create();
        Intrinsics.checkNotNullExpressionValue(behaviorSubject0, "create(...)");
        this.k = behaviorSubject0;
    }

    public final boolean getHasFooter() {
        return this.i;
    }

    public final boolean getHasHeader() {
        return this.h;
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public int getItemCount() {
        return this.j.size();
    }

    @NotNull
    public final List getItems() {
        return this.j;
    }

    @NotNull
    public final Subject getOnItemClickSubject() {
        return this.k;
    }

    public final Observable onItemClick() {
        return this.k.throttleFirst(this.g, TimeUnit.MILLISECONDS).observeOn(AndroidSchedulers.mainThread());
    }

    public final void setHasFooter(boolean z) {
        this.i = z;
    }

    public final void setHasHeader(boolean z) {
        this.h = z;
    }

    public final void setItems(@NotNull List list0) {
        Intrinsics.checkNotNullParameter(list0, "value");
        this.j = list0;
        this.notifyDataSetChanged();
    }

    public final void setOnItemClickSubject(@NotNull Subject subject0) {
        Intrinsics.checkNotNullParameter(subject0, "<set-?>");
        this.k = subject0;
    }
}

