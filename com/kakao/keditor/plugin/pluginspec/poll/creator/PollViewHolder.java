package com.kakao.keditor.plugin.pluginspec.poll.creator;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001C\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001A\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0015\u0010\u0006\u001A\u00020\u00072\u0006\u0010\b\u001A\u00028\u0000H&¢\u0006\u0002\u0010\t¨\u0006\n"}, d2 = {"Lcom/kakao/keditor/plugin/pluginspec/poll/creator/PollViewHolder;", "T", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "(Landroid/view/View;)V", "bind", "", "item", "(Ljava/lang/Object;)V", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public abstract class PollViewHolder extends ViewHolder {
    public PollViewHolder(@NotNull View view0) {
        Intrinsics.checkNotNullParameter(view0, "view");
        super(view0);
    }

    public abstract void bind(Object arg1);
}

