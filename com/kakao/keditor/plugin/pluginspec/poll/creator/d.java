package com.kakao.keditor.plugin.pluginspec.poll.creator;

import android.view.View.OnClickListener;
import android.view.View;

public final class d implements View.OnClickListener {
    public final int a;
    public final PollItemListener b;

    public d(PollItemListener pollItemListener0, int v) {
        this.a = v;
        this.b = pollItemListener0;
        super();
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        switch(this.a) {
            case 0: {
                PollFooterViewHolder._init_$lambda$2(this.b, view0);
                return;
            }
            case 1: {
                PollFooterViewHolder._init_$lambda$3(this.b, view0);
                return;
            }
            case 2: {
                PollFooterViewHolder._init_$lambda$4(this.b, view0);
                return;
            }
            default: {
                PollFooterViewHolder._init_$lambda$5(this.b, view0);
            }
        }
    }
}

