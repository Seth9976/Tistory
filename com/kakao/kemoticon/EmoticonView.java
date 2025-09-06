package com.kakao.kemoticon;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout.LayoutParams;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestBuilder;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\'\b\u0007\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001A\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001A\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001A\u00020\u000B2\u0006\u0010\n\u001A\u00020\u0006¢\u0006\u0004\b\f\u0010\rR.\u0010\u0016\u001A\u0004\u0018\u00010\u000E2\b\u0010\u000F\u001A\u0004\u0018\u00010\u000E8\u0006@FX\u0086\u000E¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001A\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Lcom/kakao/kemoticon/EmoticonView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "sizePx", "", "setImageViewSize", "(I)V", "Lcom/kakao/kemoticon/Emoticon;", "value", "b", "Lcom/kakao/kemoticon/Emoticon;", "getEmoticon", "()Lcom/kakao/kemoticon/Emoticon;", "setEmoticon", "(Lcom/kakao/kemoticon/Emoticon;)V", "emoticon", "kemoticon_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class EmoticonView extends FrameLayout {
    public final ImageView a;
    public Emoticon b;

    @JvmOverloads
    public EmoticonView(@NotNull Context context0) {
        Intrinsics.checkNotNullParameter(context0, "context");
        this(context0, null, 0, 6, null);
    }

    @JvmOverloads
    public EmoticonView(@NotNull Context context0, @Nullable AttributeSet attributeSet0) {
        Intrinsics.checkNotNullParameter(context0, "context");
        this(context0, attributeSet0, 0, 4, null);
    }

    @JvmOverloads
    public EmoticonView(@NotNull Context context0, @Nullable AttributeSet attributeSet0, int v) {
        Intrinsics.checkNotNullParameter(context0, "context");
        super(context0, attributeSet0, v);
        ImageView imageView0 = new ImageView(context0);
        this.a = imageView0;
        this.addView(imageView0, -1, -1);
    }

    public EmoticonView(Context context0, AttributeSet attributeSet0, int v, int v1, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v1 & 2) != 0) {
            attributeSet0 = null;
        }
        if((v1 & 4) != 0) {
            v = 0;
        }
        this(context0, attributeSet0, v);
    }

    @Nullable
    public final Emoticon getEmoticon() {
        return this.b;
    }

    public final void setEmoticon(@Nullable Emoticon emoticon0) {
        this.b = emoticon0;
        ((RequestBuilder)((RequestBuilder)Glide.with(this).load((this.b == null ? null : this.b.getSrc())).override(0x80000000)).placeholder(null)).into(this.a);
    }

    public final void setImageViewSize(int v) {
        ViewGroup.LayoutParams viewGroup$LayoutParams0 = this.a.getLayoutParams();
        Intrinsics.checkNotNull(viewGroup$LayoutParams0, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        ((FrameLayout.LayoutParams)viewGroup$LayoutParams0).width = v;
        ((FrameLayout.LayoutParams)viewGroup$LayoutParams0).height = v;
    }
}

