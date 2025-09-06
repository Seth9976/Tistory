package ib;

import aa.m;
import android.content.res.Resources.NotFoundException;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestBuilder;
import com.bumptech.glide.RequestManager;
import com.google.android.material.snackbar.p;
import com.kakao.kemoticon.Emoticon;
import com.kakao.kemoticon.R.string;
import com.kakao.kemoticon.a;
import com.kakao.kemoticon.b;
import com.kakao.kemoticon.widget.ContentDescriptionKt;
import fg.c;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

public final class e extends Adapter {
    public final a g;
    public final c h;
    public List i;
    public final boolean j;

    public e(a a0, String s, c c0) {
        Intrinsics.checkNotNullParameter(a0, "kc");
        Intrinsics.checkNotNullParameter(s, "setId");
        Intrinsics.checkNotNullParameter(c0, "itemIsEmptyListener");
        super();
        this.g = a0;
        this.h = c0;
        this.i = CollectionsKt__CollectionsKt.emptyList();
        this.j = a0.a(s);
        m m0 = new m(28, this, s);
        Intrinsics.checkNotNullParameter(s, "setId");
        Intrinsics.checkNotNullParameter(m0, "listener");
        if(Intrinsics.areEqual(s, ".history")) {
            a0.d.setChangeListener(m0);
        }
        ArrayList arrayList0 = a0.b(s);
        c0.invoke(Boolean.valueOf(arrayList0.isEmpty()));
        this.i = arrayList0;
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public final int getItemCount() {
        return this.i.size();
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public final void onBindViewHolder(ViewHolder recyclerView$ViewHolder0, int v) {
        String s4;
        Intrinsics.checkNotNullParameter(((b)recyclerView$ViewHolder0), "holder");
        Emoticon emoticon0 = (Emoticon)this.i.get(v);
        ((b)recyclerView$ViewHolder0).getClass();
        Intrinsics.checkNotNullParameter(emoticon0, "emoticon");
        RequestManager requestManager0 = Glide.with(((b)recyclerView$ViewHolder0).d.getContext());
        String s = emoticon0.getPackId();
        String s1 = emoticon0.getId();
        ((b)recyclerView$ViewHolder0).c.getClass();
        Intrinsics.checkNotNullParameter(s, "packId");
        Intrinsics.checkNotNullParameter(s1, "id");
        ((RequestBuilder)requestManager0.load(((b)recyclerView$ViewHolder0).c.b.getEmoticonThumbnailUrl(s, s1)).placeholder(null)).into(((b)recyclerView$ViewHolder0).d);
        p p0 = new p(2, ((b)recyclerView$ViewHolder0), emoticon0);
        ((b)recyclerView$ViewHolder0).itemView.setOnClickListener(p0);
        View view0 = ((b)recyclerView$ViewHolder0).itemView;
        Intrinsics.checkNotNullExpressionValue(view0, "itemView");
        int v1 = string.cd_select_emoticon;
        String s2 = emoticon0.getPackId();
        String s3 = emoticon0.getId();
        Intrinsics.checkNotNullParameter(s2, "packId");
        Intrinsics.checkNotNullParameter(s3, "id");
        Resources resources0 = ((b)recyclerView$ViewHolder0).c.a.getContext().getResources();
        int v2 = resources0.getIdentifier("cd_" + s2 + "_" + s3, "string", "net.daum.android.tistoryapp");
        try {
            s4 = resources0.getString(v2);
            Intrinsics.checkNotNull(s4);
        }
        catch(Resources.NotFoundException unused_ex) {
            s4 = resources0.getString(string.cd_unknown);
            Intrinsics.checkNotNull(s4);
        }
        ContentDescriptionKt.setContentDescriptionWith(view0, v1, new Object[]{s4});
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public final ViewHolder onCreateViewHolder(ViewGroup viewGroup0, int v) {
        Intrinsics.checkNotNullParameter(viewGroup0, "parent");
        return new b(this.g, viewGroup0, this.j);
    }
}

