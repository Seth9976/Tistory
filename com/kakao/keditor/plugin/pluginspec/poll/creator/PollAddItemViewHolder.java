package com.kakao.keditor.plugin.pluginspec.poll.creator;

import android.graphics.Typeface;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import com.kakao.keditor.R.id;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u001F\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\b\u0010\u0004\u001A\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001A\u00020\u0007¢\u0006\u0002\u0010\bR\u000E\u0010\t\u001A\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000E\u0010\n\u001A\u00020\u000BX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/kakao/keditor/plugin/pluginspec/poll/creator/PollAddItemViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "typeface", "Landroid/graphics/Typeface;", "itemListener", "Lcom/kakao/keditor/plugin/pluginspec/poll/creator/PollItemListener;", "(Landroid/view/View;Landroid/graphics/Typeface;Lcom/kakao/keditor/plugin/pluginspec/poll/creator/PollItemListener;)V", "addBtn", "addText", "Landroid/widget/TextView;", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nPollCreatorAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PollCreatorAdapter.kt\ncom/kakao/keditor/plugin/pluginspec/poll/creator/PollAddItemViewHolder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,533:1\n1#2:534\n*E\n"})
public final class PollAddItemViewHolder extends ViewHolder {
    @NotNull
    private final View addBtn;
    @NotNull
    private final TextView addText;

    public PollAddItemViewHolder(@NotNull View view0, @Nullable Typeface typeface0, @NotNull PollItemListener pollItemListener0) {
        Intrinsics.checkNotNullParameter(view0, "view");
        Intrinsics.checkNotNullParameter(pollItemListener0, "itemListener");
        super(view0);
        View view1 = view0.findViewById(id.poll_item_add);
        Intrinsics.checkNotNullExpressionValue(view1, "findViewById(...)");
        this.addBtn = view1;
        View view2 = view0.findViewById(id.poll_item_add_text);
        Intrinsics.checkNotNullExpressionValue(view2, "findViewById(...)");
        this.addText = (TextView)view2;
        view1.setOnClickListener(new a(pollItemListener0, this, 0));
        ((TextView)view2).setOnClickListener(new a(pollItemListener0, this, 1));
        if(typeface0 != null) {
            ((TextView)view2).setTypeface(typeface0);
        }
    }

    private static final void _init_$lambda$0(PollItemListener pollItemListener0, PollAddItemViewHolder pollAddItemViewHolder0, View view0) {
        Intrinsics.checkNotNullParameter(pollItemListener0, "$itemListener");
        Intrinsics.checkNotNullParameter(pollAddItemViewHolder0, "this$0");
        pollItemListener0.add(pollAddItemViewHolder0.itemView.getHeight());
    }

    private static final void _init_$lambda$1(PollItemListener pollItemListener0, PollAddItemViewHolder pollAddItemViewHolder0, View view0) {
        Intrinsics.checkNotNullParameter(pollItemListener0, "$itemListener");
        Intrinsics.checkNotNullParameter(pollAddItemViewHolder0, "this$0");
        pollItemListener0.add(pollAddItemViewHolder0.itemView.getHeight());
    }
}

