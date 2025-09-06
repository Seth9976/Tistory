package com.kakao.tistory.presentation.view.common.bottomsheet;

import a5.b;
import android.content.Context;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.res.ResourcesCompat;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import com.kakao.android.base.ui.recyclerview.BaseRecyclerAdapter.BaseRecyclerViewHolder;
import com.kakao.android.base.ui.recyclerview.BaseRecyclerAdapter;
import com.kakao.tistory.domain.entity.SortItem;
import com.kakao.tistory.presentation.BR;
import com.kakao.tistory.presentation.R.font;
import com.kakao.tistory.presentation.R.layout;
import com.kakao.tistory.presentation.R.string;
import com.kakao.tistory.presentation.common.bindingadapter.CommonBindingAdapter;
import com.kakao.tistory.presentation.databinding.ItemCommonBottomDialogBinding;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.p;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0016B\u000F\u0012\u0006\u0010\u0004\u001A\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001F\u0010\f\u001A\u00020\u000B2\u0006\u0010\b\u001A\u00020\u00072\u0006\u0010\n\u001A\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001F\u0010\u0011\u001A\u00020\u00102\u0006\u0010\u000E\u001A\u00020\u000B2\u0006\u0010\u000F\u001A\u00020\tH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0014\u001A\u00020\u00132\u0006\u0010\u000F\u001A\u00020\t¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Lcom/kakao/tistory/presentation/view/common/bottomsheet/CommonBottomDialogAdapter;", "Lcom/kakao/android/base/ui/recyclerview/BaseRecyclerAdapter;", "Lcom/kakao/tistory/domain/entity/SortItem;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "holder", "position", "", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "", "checkNeedDivider", "(I)Z", "BottomCommonItemViewHolder", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class CommonBottomDialogAdapter extends BaseRecyclerAdapter {
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0086\u0004\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001R\b\u0012\u0004\u0012\u00020\u00040\u0003B\u000F\u0012\u0006\u0010\u0005\u001A\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001F\u0010\f\u001A\u00020\u000B2\u0006\u0010\t\u001A\u00020\b2\u0006\u0010\n\u001A\u00020\u0004H\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000E"}, d2 = {"Lcom/kakao/tistory/presentation/view/common/bottomsheet/CommonBottomDialogAdapter$BottomCommonItemViewHolder;", "Lcom/kakao/android/base/ui/recyclerview/BaseRecyclerAdapter$BaseRecyclerViewHolder;", "Lcom/kakao/tistory/presentation/databinding/ItemCommonBottomDialogBinding;", "Lcom/kakao/android/base/ui/recyclerview/BaseRecyclerAdapter;", "Lcom/kakao/tistory/domain/entity/SortItem;", "dataBinding", "<init>", "(Lcom/kakao/tistory/presentation/view/common/bottomsheet/CommonBottomDialogAdapter;Lcom/kakao/tistory/presentation/databinding/ItemCommonBottomDialogBinding;)V", "", "itemBindingVariableId", "item", "", "bind", "(ILcom/kakao/tistory/domain/entity/SortItem;)V", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    @SourceDebugExtension({"SMAP\nCommonBottomDialogAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CommonBottomDialogAdapter.kt\ncom/kakao/tistory/presentation/view/common/bottomsheet/CommonBottomDialogAdapter$BottomCommonItemViewHolder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,75:1\n1#2:76\n*E\n"})
    public final class BottomCommonItemViewHolder extends BaseRecyclerViewHolder {
        public final ItemCommonBottomDialogBinding a;
        public final CommonBottomDialogAdapter b;

        public BottomCommonItemViewHolder(@NotNull ItemCommonBottomDialogBinding itemCommonBottomDialogBinding0) {
            Intrinsics.checkNotNullParameter(itemCommonBottomDialogBinding0, "dataBinding");
            this.b = commonBottomDialogAdapter0;
            super(itemCommonBottomDialogBinding0);
            this.a = itemCommonBottomDialogBinding0;
        }

        public void bind(int v, @NotNull SortItem sortItem0) {
            String s2;
            Intrinsics.checkNotNullParameter(sortItem0, "item");
            super.bind(v, sortItem0);
            String s = this.b.a.getString(string.content_desc_button);
            Intrinsics.checkNotNullExpressionValue(s, "getString(...)");
            String s1 = sortItem0.getDescription();
            if(s1 == null) {
                s2 = sortItem0.getTitle();
            }
            else {
                if(p.isBlank(s1)) {
                    s1 = null;
                }
                if(s1 == null) {
                    s2 = sortItem0.getTitle();
                }
                else {
                    s2 = sortItem0.getTitle() + " " + s1;
                    if(s2 == null) {
                        s2 = sortItem0.getTitle();
                    }
                }
            }
            String s3 = b.f(1, s, "format(...)", new Object[]{s2});
            View view0 = this.a.getRoot();
            Intrinsics.checkNotNullExpressionValue(view0, "getRoot(...)");
            CommonBindingAdapter.bindContentDescription(view0, s3, sortItem0.isSelected());
            Typeface typeface0 = sortItem0.isSelected() ? ResourcesCompat.getFont(this.b.a, font.font_pretendard_medium) : ResourcesCompat.getFont(this.b.a, font.font_pretendard_light);
            this.a.commonBottomDialogTitleText.setTypeface(typeface0);
            Typeface typeface1 = this.a.commonBottomDialogDescText.getTypeface();
            this.a.commonBottomDialogDescText.setTypeface(typeface1, ((int)sortItem0.isSelected()));
        }

        @Override  // com.kakao.android.base.ui.recyclerview.BaseRecyclerAdapter$BaseRecyclerViewHolder
        public void bind(int v, Object object0) {
            this.bind(v, ((SortItem)object0));
        }
    }

    public static final int $stable = 8;
    public final Context a;

    public CommonBottomDialogAdapter(@NotNull Context context0) {
        Intrinsics.checkNotNullParameter(context0, "context");
        super();
        this.a = context0;
    }

    public final boolean checkNeedDivider(int v) {
        return v != this.getItemCount() - 1;
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public void onBindViewHolder(@NotNull ViewHolder recyclerView$ViewHolder0, int v) {
        Intrinsics.checkNotNullParameter(recyclerView$ViewHolder0, "holder");
        SortItem sortItem0 = (SortItem)this.getItems().get(v);
        ((BottomCommonItemViewHolder)recyclerView$ViewHolder0).bind(BR.sortItem, sortItem0);
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    @NotNull
    public ViewHolder onCreateViewHolder(@NotNull ViewGroup viewGroup0, int v) {
        Intrinsics.checkNotNullParameter(viewGroup0, "parent");
        ViewDataBinding viewDataBinding0 = DataBindingUtil.inflate(LayoutInflater.from(viewGroup0.getContext()), layout.item_common_bottom_dialog, viewGroup0, false);
        Intrinsics.checkNotNullExpressionValue(viewDataBinding0, "inflate(...)");
        return new BottomCommonItemViewHolder(this, ((ItemCommonBottomDialogBinding)viewDataBinding0));
    }
}

