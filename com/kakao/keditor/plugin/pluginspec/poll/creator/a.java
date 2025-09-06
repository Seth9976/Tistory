package com.kakao.keditor.plugin.pluginspec.poll.creator;

import android.view.View.OnClickListener;
import android.view.View;

public final class a implements View.OnClickListener {
    public final int a;
    public final PollItemListener b;
    public final PollAddItemViewHolder c;

    public a(PollItemListener pollItemListener0, PollAddItemViewHolder pollAddItemViewHolder0, int v) {
        this.a = v;
        this.b = pollItemListener0;
        this.c = pollAddItemViewHolder0;
        super();
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        if(this.a != 0) {
            PollAddItemViewHolder._init_$lambda$1(this.b, this.c, view0);
            return;
        }
        PollAddItemViewHolder._init_$lambda$0(this.b, this.c, view0);
    }
}

