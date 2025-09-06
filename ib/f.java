package ib;

import android.content.Context;
import android.content.res.Resources.NotFoundException;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.StateSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.material3.nq;
import androidx.core.view.w;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import com.google.android.material.datepicker.t;
import com.kakao.kemoticon.EmoticonKeyboard;
import com.kakao.kemoticon.EmoticonRepositoryKt;
import com.kakao.kemoticon.R.drawable;
import com.kakao.kemoticon.R.string;
import com.kakao.kemoticon.a;
import com.kakao.kemoticon.widget.ContentDescriptionKt;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.k;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class f extends Adapter {
    public final a g;
    public final List h;
    public int i;
    public Lambda j;

    public f(a a0) {
        Intrinsics.checkNotNullParameter(a0, "kc");
        super();
        this.g = a0;
        a0.getClass();
        this.h = CollectionsKt___CollectionsKt.plus(k.listOf(".history"), a0.c);
        this.j = d.y;
    }

    public final void a(int v) {
        int v1 = this.i;
        if(v == v1) {
            return;
        }
        this.i = v;
        this.notifyItemChanged(v1);
        this.notifyItemChanged(v);
        ((Function1)this.j).invoke(v);
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public final int getItemCount() {
        return this.h.size();
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public final void onBindViewHolder(ViewHolder recyclerView$ViewHolder0, int v) {
        String s2;
        Drawable drawable0;
        Intrinsics.checkNotNullParameter(((com.kakao.kemoticon.d)recyclerView$ViewHolder0), "holder");
        String s = (String)this.h.get(v);
        boolean z = v == this.i;
        nq nq0 = new nq(this, v, 2);
        ((com.kakao.kemoticon.d)recyclerView$ViewHolder0).getClass();
        Intrinsics.checkNotNullParameter(s, "setId");
        Intrinsics.checkNotNullParameter(nq0, "clickListener");
        a a0 = ((com.kakao.kemoticon.d)recyclerView$ViewHolder0).c;
        a0.getClass();
        Intrinsics.checkNotNullParameter(s, "setId");
        EmoticonKeyboard emoticonKeyboard0 = a0.a;
        Context context0 = emoticonKeyboard0.getContext();
        if(Intrinsics.areEqual(s, ".history")) {
            drawable0 = context0.getDrawable(drawable.kemoticon_keyboard_history_icon);
        }
        else {
            StateListDrawable stateListDrawable0 = new StateListDrawable();
            String s1 = a0.b.getEmoticonIconUri(s, true);
            Intrinsics.checkNotNull(context0);
            Drawable drawable1 = EmoticonRepositoryKt.toDrawable(s1, context0);
            stateListDrawable0.addState(new int[]{0x10100A1}, drawable1);
            stateListDrawable0.addState(StateSet.WILD_CARD, EmoticonRepositoryKt.toDrawable(a0.b.getEmoticonIconUri(s, false), context0));
            drawable0 = stateListDrawable0;
        }
        ((com.kakao.kemoticon.d)recyclerView$ViewHolder0).d.setImageDrawable(drawable0);
        View view0 = ((com.kakao.kemoticon.d)recyclerView$ViewHolder0).itemView;
        view0.setSelected(z);
        view0.setOnClickListener(new t(nq0, 14));
        Intrinsics.checkNotNull(view0);
        int v1 = string.cd_select_emoticon_set;
        Intrinsics.checkNotNullParameter(s, "setId");
        if(Intrinsics.areEqual(s, ".history")) {
            s2 = emoticonKeyboard0.getContext().getString(string.cd_emoticon_set_history);
            Intrinsics.checkNotNull(s2);
        }
        else {
            Resources resources0 = emoticonKeyboard0.getContext().getResources();
            int v2 = resources0.getIdentifier("cd_" + s + "_pack", "string", "net.daum.android.tistoryapp");
            try {
                String s3 = resources0.getString(v2);
                Intrinsics.checkNotNull(s3);
                s2 = s3;
            }
            catch(Resources.NotFoundException unused_ex) {
                s2 = resources0.getString(string.cd_unknown);
                Intrinsics.checkNotNull(s2);
            }
        }
        ContentDescriptionKt.setContentDescriptionWith(view0, v1, new Object[]{s2});
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public final ViewHolder onCreateViewHolder(ViewGroup viewGroup0, int v) {
        Intrinsics.checkNotNullParameter(viewGroup0, "parent");
        return new com.kakao.kemoticon.d(this.g, viewGroup0);
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public final void onViewAttachedToWindow(ViewHolder recyclerView$ViewHolder0) {
        Intrinsics.checkNotNullParameter(((com.kakao.kemoticon.d)recyclerView$ViewHolder0), "holder");
        if(((com.kakao.kemoticon.d)recyclerView$ViewHolder0).getAdapterPosition() == 0) {
            w w0 = new w(4, ((com.kakao.kemoticon.d)recyclerView$ViewHolder0).itemView);
            ((com.kakao.kemoticon.d)recyclerView$ViewHolder0).itemView.post(w0);
        }
    }
}

