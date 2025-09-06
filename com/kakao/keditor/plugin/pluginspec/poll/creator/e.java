package com.kakao.keditor.plugin.pluginspec.poll.creator;

import android.view.View.OnClickListener;
import android.view.View;

public final class e implements View.OnClickListener {
    public final int a;
    public final PollItemListener b;
    public final PollItemViewHolder c;

    public e(PollItemListener pollItemListener0, PollItemViewHolder pollItemViewHolder0, int v) {
        this.a = v;
        this.b = pollItemListener0;
        this.c = pollItemViewHolder0;
        super();
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        if(this.a != 0) {
            PollItemViewHolder._init_$lambda$3(this.b, this.c, view0);
            return;
        }
        PollItemViewHolder._init_$lambda$0(this.b, this.c, view0);
    }
}

