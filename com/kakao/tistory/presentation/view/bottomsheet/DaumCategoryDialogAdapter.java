package com.kakao.tistory.presentation.view.bottomsheet;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import com.google.android.material.datepicker.t;
import com.kakao.tistory.domain.entity.entry.DaumLikeItem;
import com.kakao.tistory.domain.entity.entry.DaumLikeViewItemModel.DaumLikeCategoryTitle;
import com.kakao.tistory.domain.entity.entry.DaumLikeViewItemModel.PairChild;
import com.kakao.tistory.domain.entity.entry.DaumLikeViewItemModel.SelectNothingItem;
import com.kakao.tistory.domain.entity.entry.DaumLikeViewItemModel;
import com.kakao.tistory.presentation.BR;
import com.kakao.tistory.presentation.databinding.ItemDaumCategoryDialogChildBinding;
import com.kakao.tistory.presentation.databinding.ItemDaumCategoryDialogSelectNothingBinding;
import com.kakao.tistory.presentation.databinding.ItemDaumCategoryDialogSubjectBinding;
import hc.b;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.subjects.BehaviorSubject;
import io.reactivex.subjects.Subject;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u0000 12\b\u0012\u0004\u0012\u00020\u00020\u0001:\u00041234B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J%\u0010\b\u001A\u001A\u0012\u0006\u0012\u0004\u0018\u00010\u0006 \u0007*\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u00050\u0005¢\u0006\u0004\b\b\u0010\tJ\u000F\u0010\u000B\u001A\u00020\nH\u0016¢\u0006\u0004\b\u000B\u0010\fJ\u001F\u0010\u0010\u001A\u00020\u00022\u0006\u0010\u000E\u001A\u00020\r2\u0006\u0010\u000F\u001A\u00020\nH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001A\u00020\n2\u0006\u0010\u0012\u001A\u00020\nH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001F\u0010\u0017\u001A\u00020\u00162\u0006\u0010\u0015\u001A\u00020\u00022\u0006\u0010\u0012\u001A\u00020\nH\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\"\u0010\u001E\u001A\u00020\n8\u0006@\u0006X\u0086\u000E¢\u0006\u0012\n\u0004\b\u0019\u0010\u001A\u001A\u0004\b\u001B\u0010\f\"\u0004\b\u001C\u0010\u001DR6\u0010(\u001A\b\u0012\u0004\u0012\u00020 0\u001F2\f\u0010!\u001A\b\u0012\u0004\u0012\u00020 0\u001F8\u0006@FX\u0086\u000E¢\u0006\u0012\n\u0004\b\"\u0010#\u001A\u0004\b$\u0010%\"\u0004\b&\u0010\'R*\u00100\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060)8\u0004@\u0004X\u0084\u000E¢\u0006\u0012\n\u0004\b*\u0010+\u001A\u0004\b,\u0010-\"\u0004\b.\u0010/¨\u00065"}, d2 = {"Lcom/kakao/tistory/presentation/view/bottomsheet/DaumCategoryDialogAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "<init>", "()V", "Lio/reactivex/Observable;", "Lcom/kakao/tistory/domain/entity/entry/DaumLikeItem;", "kotlin.jvm.PlatformType", "onItemClick", "()Lio/reactivex/Observable;", "", "getItemCount", "()I", "Landroid/view/ViewGroup;", "parent", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "position", "getItemViewType", "(I)I", "holder", "", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "a", "I", "getSelectedCategoryId", "setSelectedCategoryId", "(I)V", "selectedCategoryId", "", "Lcom/kakao/tistory/domain/entity/entry/DaumLikeViewItemModel;", "value", "b", "Ljava/util/List;", "getItems", "()Ljava/util/List;", "setItems", "(Ljava/util/List;)V", "items", "Lio/reactivex/subjects/Subject;", "c", "Lio/reactivex/subjects/Subject;", "getOnItemClickSubject", "()Lio/reactivex/subjects/Subject;", "setOnItemClickSubject", "(Lio/reactivex/subjects/Subject;)V", "onItemClickSubject", "Companion", "DaumCategoryChildItemViewHolder", "DaumCategorySelectNothingItemViewHolder", "DaumCategorySubjectItemViewHolder", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class DaumCategoryDialogAdapter extends Adapter {
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001R\u001A\u0010\u0003\u001A\u00020\u00028\u0006X\u0086D¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001A\u0004\b\u0005\u0010\u0006R\u001A\u0010\u0007\u001A\u00020\u00028\u0006X\u0086D¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001A\u0004\b\b\u0010\u0006R\u001A\u0010\t\u001A\u00020\u00028\u0006X\u0086D¢\u0006\f\n\u0004\b\t\u0010\u0004\u001A\u0004\b\n\u0010\u0006¨\u0006\u000B"}, d2 = {"Lcom/kakao/tistory/presentation/view/bottomsheet/DaumCategoryDialogAdapter$Companion;", "", "", "VIEW_TYPE_SELECT_NOTHING", "I", "getVIEW_TYPE_SELECT_NOTHING", "()I", "VIEW_TYPE_SUBJECT", "getVIEW_TYPE_SUBJECT", "VIEW_TYPE_CHILD", "getVIEW_TYPE_CHILD", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        // 去混淆评级： 低(20)
        public final int getVIEW_TYPE_CHILD() {
            return 2;
        }

        public final int getVIEW_TYPE_SELECT_NOTHING() {
            return 0;
        }

        // 去混淆评级： 低(20)
        public final int getVIEW_TYPE_SUBJECT() {
            return 1;
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001D\u0010\u000B\u001A\u00020\n2\u0006\u0010\u0007\u001A\u00020\u00062\u0006\u0010\t\u001A\u00020\b¢\u0006\u0004\b\u000B\u0010\f¨\u0006\r"}, d2 = {"Lcom/kakao/tistory/presentation/view/bottomsheet/DaumCategoryDialogAdapter$DaumCategoryChildItemViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Lcom/kakao/tistory/presentation/databinding/ItemDaumCategoryDialogChildBinding;", "dataBinding", "<init>", "(Lcom/kakao/tistory/presentation/view/bottomsheet/DaumCategoryDialogAdapter;Lcom/kakao/tistory/presentation/databinding/ItemDaumCategoryDialogChildBinding;)V", "", "itemBindingVariableId", "Lcom/kakao/tistory/domain/entity/entry/DaumLikeViewItemModel;", "item", "", "bind", "(ILcom/kakao/tistory/domain/entity/entry/DaumLikeViewItemModel;)V", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    @SourceDebugExtension({"SMAP\nDaumCategoryDialogAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DaumCategoryDialogAdapter.kt\ncom/kakao/tistory/presentation/view/bottomsheet/DaumCategoryDialogAdapter$DaumCategoryChildItemViewHolder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,154:1\n1#2:155\n*E\n"})
    public final class DaumCategoryChildItemViewHolder extends ViewHolder {
        public final ItemDaumCategoryDialogChildBinding a;
        public final DaumCategoryDialogAdapter b;

        public DaumCategoryChildItemViewHolder(@NotNull ItemDaumCategoryDialogChildBinding itemDaumCategoryDialogChildBinding0) {
            Intrinsics.checkNotNullParameter(itemDaumCategoryDialogChildBinding0, "dataBinding");
            this.b = daumCategoryDialogAdapter0;
            super(itemDaumCategoryDialogChildBinding0.getRoot());
            this.a = itemDaumCategoryDialogChildBinding0;
        }

        public static final void a(PairChild daumLikeViewItemModel$PairChild0, DaumCategoryDialogAdapter daumCategoryDialogAdapter0, View view0) {
            Intrinsics.checkNotNullParameter(daumLikeViewItemModel$PairChild0, "$pairItem");
            Intrinsics.checkNotNullParameter(daumCategoryDialogAdapter0, "this$0");
            DaumLikeItem daumLikeItem0 = daumLikeViewItemModel$PairChild0.getDaumLikeItemRight();
            if(daumLikeItem0 != null) {
                daumCategoryDialogAdapter0.getOnItemClickSubject().onNext(daumLikeItem0);
            }
        }

        public static final void a(DaumCategoryDialogAdapter daumCategoryDialogAdapter0, PairChild daumLikeViewItemModel$PairChild0, View view0) {
            Intrinsics.checkNotNullParameter(daumCategoryDialogAdapter0, "this$0");
            Intrinsics.checkNotNullParameter(daumLikeViewItemModel$PairChild0, "$pairItem");
            daumCategoryDialogAdapter0.getOnItemClickSubject().onNext(daumLikeViewItemModel$PairChild0.getDaumLikeItemLeft());
        }

        public final void bind(int v, @NotNull DaumLikeViewItemModel daumLikeViewItemModel0) {
            Intrinsics.checkNotNullParameter(daumLikeViewItemModel0, "item");
            this.a.setSelectId(this.b.getSelectedCategoryId());
            PairChild daumLikeViewItemModel$PairChild0 = daumLikeViewItemModel0 instanceof PairChild ? ((PairChild)daumLikeViewItemModel0) : null;
            if(daumLikeViewItemModel$PairChild0 == null) {
                return;
            }
            this.a.setSubjectItem(daumLikeViewItemModel$PairChild0);
            b b0 = new b(this.b, daumLikeViewItemModel$PairChild0);
            this.a.daumChildLeftContainer.setOnClickListener(b0);
            b b1 = new b(daumLikeViewItemModel$PairChild0, this.b);
            this.a.daumChildRightContainer.setOnClickListener(b1);
            this.a.setVariable(v, daumLikeViewItemModel0);
            this.a.executePendingBindings();
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001D\u0010\u000B\u001A\u00020\n2\u0006\u0010\u0007\u001A\u00020\u00062\u0006\u0010\t\u001A\u00020\b¢\u0006\u0004\b\u000B\u0010\f¨\u0006\r"}, d2 = {"Lcom/kakao/tistory/presentation/view/bottomsheet/DaumCategoryDialogAdapter$DaumCategorySelectNothingItemViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Lcom/kakao/tistory/presentation/databinding/ItemDaumCategoryDialogSelectNothingBinding;", "dataBinding", "<init>", "(Lcom/kakao/tistory/presentation/view/bottomsheet/DaumCategoryDialogAdapter;Lcom/kakao/tistory/presentation/databinding/ItemDaumCategoryDialogSelectNothingBinding;)V", "", "itemBindingVariableId", "Lcom/kakao/tistory/domain/entity/entry/DaumLikeViewItemModel;", "item", "", "bind", "(ILcom/kakao/tistory/domain/entity/entry/DaumLikeViewItemModel;)V", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public final class DaumCategorySelectNothingItemViewHolder extends ViewHolder {
        public final ItemDaumCategoryDialogSelectNothingBinding a;
        public final DaumCategoryDialogAdapter b;

        public DaumCategorySelectNothingItemViewHolder(@NotNull ItemDaumCategoryDialogSelectNothingBinding itemDaumCategoryDialogSelectNothingBinding0) {
            Intrinsics.checkNotNullParameter(itemDaumCategoryDialogSelectNothingBinding0, "dataBinding");
            this.b = daumCategoryDialogAdapter0;
            super(itemDaumCategoryDialogSelectNothingBinding0.getRoot());
            this.a = itemDaumCategoryDialogSelectNothingBinding0;
            t t0 = new t(daumCategoryDialogAdapter0, 12);
            this.itemView.setOnClickListener(t0);
        }

        public static final void a(DaumCategoryDialogAdapter daumCategoryDialogAdapter0, View view0) {
            Intrinsics.checkNotNullParameter(daumCategoryDialogAdapter0, "this$0");
            daumCategoryDialogAdapter0.getOnItemClickSubject().onNext(new DaumLikeItem(-3, null, false, null));
        }

        public final void bind(int v, @NotNull DaumLikeViewItemModel daumLikeViewItemModel0) {
            Intrinsics.checkNotNullParameter(daumLikeViewItemModel0, "item");
            if(daumLikeViewItemModel0 instanceof SelectNothingItem) {
                this.a.setIsSelected(Boolean.valueOf(-3 == this.b.getSelectedCategoryId()));
            }
            this.a.setVariable(v, daumLikeViewItemModel0);
            this.a.executePendingBindings();
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001D\u0010\u000B\u001A\u00020\n2\u0006\u0010\u0007\u001A\u00020\u00062\u0006\u0010\t\u001A\u00020\b¢\u0006\u0004\b\u000B\u0010\f¨\u0006\r"}, d2 = {"Lcom/kakao/tistory/presentation/view/bottomsheet/DaumCategoryDialogAdapter$DaumCategorySubjectItemViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Lcom/kakao/tistory/presentation/databinding/ItemDaumCategoryDialogSubjectBinding;", "dataBinding", "<init>", "(Lcom/kakao/tistory/presentation/view/bottomsheet/DaumCategoryDialogAdapter;Lcom/kakao/tistory/presentation/databinding/ItemDaumCategoryDialogSubjectBinding;)V", "", "itemBindingVariableId", "Lcom/kakao/tistory/domain/entity/entry/DaumLikeViewItemModel;", "item", "", "bind", "(ILcom/kakao/tistory/domain/entity/entry/DaumLikeViewItemModel;)V", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public final class DaumCategorySubjectItemViewHolder extends ViewHolder {
        public final ItemDaumCategoryDialogSubjectBinding a;

        public DaumCategorySubjectItemViewHolder(@NotNull ItemDaumCategoryDialogSubjectBinding itemDaumCategoryDialogSubjectBinding0) {
            Intrinsics.checkNotNullParameter(itemDaumCategoryDialogSubjectBinding0, "dataBinding");
            super(itemDaumCategoryDialogSubjectBinding0.getRoot());
            this.a = itemDaumCategoryDialogSubjectBinding0;
        }

        public final void bind(int v, @NotNull DaumLikeViewItemModel daumLikeViewItemModel0) {
            Intrinsics.checkNotNullParameter(daumLikeViewItemModel0, "item");
            this.a.setVariable(v, daumLikeViewItemModel0);
            this.a.executePendingBindings();
        }
    }

    public static final int $stable;
    @NotNull
    public static final Companion Companion;
    public int a;
    public List b;
    public Subject c;
    public final long d;
    public static final int e;
    public static final int f;

    static {
        DaumCategoryDialogAdapter.Companion = new Companion(null);
        DaumCategoryDialogAdapter.$stable = 8;
        DaumCategoryDialogAdapter.e = 1;
        DaumCategoryDialogAdapter.f = 2;
    }

    public DaumCategoryDialogAdapter() {
        this.a = -3;
        this.b = new ArrayList();
        BehaviorSubject behaviorSubject0 = BehaviorSubject.create();
        Intrinsics.checkNotNullExpressionValue(behaviorSubject0, "create(...)");
        this.c = behaviorSubject0;
        this.d = 100L;
    }

    public static final int access$getVIEW_TYPE_CHILD$cp() [...] // 潜在的解密器

    public static final int access$getVIEW_TYPE_SELECT_NOTHING$cp() [...] // Inlined contents

    public static final int access$getVIEW_TYPE_SUBJECT$cp() [...] // 潜在的解密器

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public int getItemCount() {
        return this.b.size();
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public int getItemViewType(int v) {
        if(this.b.get(v) instanceof SelectNothingItem) {
            return 0;
        }
        if(this.b.get(v) instanceof DaumLikeCategoryTitle) {
            return DaumCategoryDialogAdapter.e;
        }
        return this.b.get(v) instanceof PairChild ? DaumCategoryDialogAdapter.f : DaumCategoryDialogAdapter.f;
    }

    @NotNull
    public final List getItems() {
        return this.b;
    }

    @NotNull
    public final Subject getOnItemClickSubject() {
        return this.c;
    }

    public final int getSelectedCategoryId() {
        return this.a;
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public void onBindViewHolder(@NotNull ViewHolder recyclerView$ViewHolder0, int v) {
        Intrinsics.checkNotNullParameter(recyclerView$ViewHolder0, "holder");
        if(recyclerView$ViewHolder0 instanceof DaumCategorySelectNothingItemViewHolder) {
            DaumLikeViewItemModel daumLikeViewItemModel0 = (DaumLikeViewItemModel)this.b.get(v);
            ((DaumCategorySelectNothingItemViewHolder)recyclerView$ViewHolder0).bind(BR.categoryItem, daumLikeViewItemModel0);
            return;
        }
        if(recyclerView$ViewHolder0 instanceof DaumCategorySubjectItemViewHolder) {
            DaumLikeViewItemModel daumLikeViewItemModel1 = (DaumLikeViewItemModel)this.b.get(v);
            ((DaumCategorySubjectItemViewHolder)recyclerView$ViewHolder0).bind(BR.categoryItem, daumLikeViewItemModel1);
            return;
        }
        if(recyclerView$ViewHolder0 instanceof DaumCategoryChildItemViewHolder) {
            DaumLikeViewItemModel daumLikeViewItemModel2 = (DaumLikeViewItemModel)this.b.get(v);
            ((DaumCategoryChildItemViewHolder)recyclerView$ViewHolder0).bind(BR.categoryItem, daumLikeViewItemModel2);
        }
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    @NotNull
    public ViewHolder onCreateViewHolder(@NotNull ViewGroup viewGroup0, int v) {
        Intrinsics.checkNotNullParameter(viewGroup0, "parent");
        LayoutInflater layoutInflater0 = LayoutInflater.from(viewGroup0.getContext());
        if(v == 0) {
            ItemDaumCategoryDialogSelectNothingBinding itemDaumCategoryDialogSelectNothingBinding0 = ItemDaumCategoryDialogSelectNothingBinding.inflate(layoutInflater0, viewGroup0, false);
            Intrinsics.checkNotNullExpressionValue(itemDaumCategoryDialogSelectNothingBinding0, "inflate(...)");
            return new DaumCategorySelectNothingItemViewHolder(this, itemDaumCategoryDialogSelectNothingBinding0);
        }
        if(v == DaumCategoryDialogAdapter.e) {
            ItemDaumCategoryDialogSubjectBinding itemDaumCategoryDialogSubjectBinding0 = ItemDaumCategoryDialogSubjectBinding.inflate(layoutInflater0, viewGroup0, false);
            Intrinsics.checkNotNullExpressionValue(itemDaumCategoryDialogSubjectBinding0, "inflate(...)");
            return new DaumCategorySubjectItemViewHolder(this, itemDaumCategoryDialogSubjectBinding0);
        }
        if(v != DaumCategoryDialogAdapter.f) {
            throw new NoWhenBranchMatchedException("DaumCategoryDialogAdapter onCreateViewHolder()");
        }
        ItemDaumCategoryDialogChildBinding itemDaumCategoryDialogChildBinding0 = ItemDaumCategoryDialogChildBinding.inflate(layoutInflater0, viewGroup0, false);
        Intrinsics.checkNotNullExpressionValue(itemDaumCategoryDialogChildBinding0, "inflate(...)");
        return new DaumCategoryChildItemViewHolder(this, itemDaumCategoryDialogChildBinding0);
    }

    public final Observable onItemClick() {
        return this.c.throttleFirst(this.d, TimeUnit.MILLISECONDS).observeOn(AndroidSchedulers.mainThread());
    }

    public final void setItems(@NotNull List list0) {
        Intrinsics.checkNotNullParameter(list0, "value");
        this.b = list0;
        this.notifyDataSetChanged();
    }

    public final void setOnItemClickSubject(@NotNull Subject subject0) {
        Intrinsics.checkNotNullParameter(subject0, "<set-?>");
        this.c = subject0;
    }

    public final void setSelectedCategoryId(int v) {
        this.a = v;
    }
}

