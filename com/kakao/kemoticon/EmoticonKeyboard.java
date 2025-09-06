package com.kakao.kemoticon;

import aa.o;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import ib.f;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\u0018\u00002\u00020\u0001:\u0003-./B\u00E6\u0001\b\u0007\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012u\u0010\u000F\u001Aq\u0012\u0013\u0012\u00110\u0005\u00A2\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0013\u0012\u00110\u0005\u00A2\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00110\n\u00A2\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\u000B\u0012\u0013\u0012\u00110\u0005\u00A2\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\f\u0012\u0013\u0012\u00110\r\u00A2\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\u000E\u0012\u0004\u0012\u00020\u00050\u0004\u00126\u0010\u0012\u001A2\u0012\u0013\u0012\u00110\u0005\u00A2\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0013\u0012\u00110\r\u00A2\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\u00050\u0010\u0012\u000E\u0010\u0014\u001A\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0016\u001A\u0004\u0018\u00010\u0015\u0012\b\b\u0002\u0010\u0017\u001A\u00020\n\u00A2\u0006\u0004\b\u0018\u0010\u0019J\u000F\u0010\u001B\u001A\u00020\u001AH\u0014\u00A2\u0006\u0004\b\u001B\u0010\u001CJ\u0015\u0010\u001F\u001A\u00020\u001A2\u0006\u0010\u001E\u001A\u00020\u001D\u00A2\u0006\u0004\b\u001F\u0010 R\u0088\u0001\u0010\'\u001A4\u0012\u0013\u0012\u00110\u0000\u00A2\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(!\u0012\u0013\u0012\u00110\u001D\u00A2\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\u001E\u0012\u0004\u0012\u00020\u001A\u0018\u00010\u001028\u0010\"\u001A4\u0012\u0013\u0012\u00110\u0000\u00A2\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(!\u0012\u0013\u0012\u00110\u001D\u00A2\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\u001E\u0012\u0004\u0012\u00020\u001A\u0018\u00010\u00108G@FX\u0086\u000E\u00A2\u0006\f\u001A\u0004\b#\u0010$\"\u0004\b%\u0010&R\u0088\u0001\u0010,\u001A4\u0012\u0013\u0012\u00110\n\u00A2\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b((\u0012\u0013\u0012\u00110\u0005\u00A2\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b()\u0012\u0004\u0012\u00020\u001A\u0018\u00010\u001028\u0010\"\u001A4\u0012\u0013\u0012\u00110\n\u00A2\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b((\u0012\u0013\u0012\u00110\u0005\u00A2\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b()\u0012\u0004\u0012\u00020\u001A\u0018\u00010\u00108G@FX\u0086\u000E\u00A2\u0006\f\u001A\u0004\b*\u0010$\"\u0004\b+\u0010&\u00A8\u00060"}, d2 = {"Lcom/kakao/kemoticon/EmoticonKeyboard;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Lkotlin/Function5;", "", "Lkotlin/ParameterName;", "name", "packId", "id", "", "size", "ext", "", "isThumbnail", "resourceUrlLookup", "Lkotlin/Function2;", "isActive", "iconResourceUrlLookup", "", "emoticonPackIds", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Lkotlin/jvm/functions/Function5;Lkotlin/jvm/functions/Function2;Ljava/util/List;Landroid/util/AttributeSet;I)V", "", "onAttachedToWindow", "()V", "Lcom/kakao/kemoticon/Emoticon;", "emoticon", "pushToHistory", "(Lcom/kakao/kemoticon/Emoticon;)V", "keyboard", "value", "getEmoticonClickListener", "()Lkotlin/jvm/functions/Function2;", "setEmoticonClickListener", "(Lkotlin/jvm/functions/Function2;)V", "emoticonClickListener", "index", "setId", "getToolbarClickListener", "setToolbarClickListener", "toolbarClickListener", "com/kakao/kemoticon/a", "com/kakao/kemoticon/c", "ib/f", "kemoticon_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class EmoticonKeyboard extends FrameLayout {
    public Function2 a;
    public Function2 b;
    public final a c;
    public final AtomicBoolean d;

    @JvmOverloads
    public EmoticonKeyboard(@NotNull Context context0, @NotNull Function5 function50, @NotNull Function2 function20, @Nullable List list0) {
        Intrinsics.checkNotNullParameter(context0, "context");
        Intrinsics.checkNotNullParameter(function50, "resourceUrlLookup");
        Intrinsics.checkNotNullParameter(function20, "iconResourceUrlLookup");
        this(context0, function50, function20, list0, null, 0, 0x30, null);
    }

    @JvmOverloads
    public EmoticonKeyboard(@NotNull Context context0, @NotNull Function5 function50, @NotNull Function2 function20, @Nullable List list0, @Nullable AttributeSet attributeSet0) {
        Intrinsics.checkNotNullParameter(context0, "context");
        Intrinsics.checkNotNullParameter(function50, "resourceUrlLookup");
        Intrinsics.checkNotNullParameter(function20, "iconResourceUrlLookup");
        this(context0, function50, function20, list0, attributeSet0, 0, 0x20, null);
    }

    @JvmOverloads
    public EmoticonKeyboard(@NotNull Context context0, @NotNull Function5 function50, @NotNull Function2 function20, @Nullable List list0, @Nullable AttributeSet attributeSet0, int v) {
        Intrinsics.checkNotNullParameter(context0, "context");
        Intrinsics.checkNotNullParameter(function50, "resourceUrlLookup");
        Intrinsics.checkNotNullParameter(function20, "iconResourceUrlLookup");
        super(context0, attributeSet0, v);
        this.c = new a(this, function50, function20, list0);
        this.d = new AtomicBoolean(false);
        EmoticonKeyboardKt.access$inflate(this, layout.kemoticon_keyboard, true);
    }

    public EmoticonKeyboard(Context context0, Function5 function50, Function2 function20, List list0, AttributeSet attributeSet0, int v, int v1, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v1 & 16) != 0) {
            attributeSet0 = null;
        }
        if((v1 & 0x20) != 0) {
            v = 0;
        }
        this(context0, function50, function20, list0, attributeSet0, v);
    }

    public static final a access$getKc$p(EmoticonKeyboard emoticonKeyboard0) {
        return emoticonKeyboard0.c;
    }

    public static final AtomicBoolean access$getSendEventAfterInit$p(EmoticonKeyboard emoticonKeyboard0) {
        return emoticonKeyboard0.d;
    }

    public static final Function2 access$get_emoticonClickListener$p(EmoticonKeyboard emoticonKeyboard0) {
        return emoticonKeyboard0.a;
    }

    public static final Function2 access$get_toolbarClickListener$p(EmoticonKeyboard emoticonKeyboard0) {
        return emoticonKeyboard0.b;
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "")
    public final Function2 getEmoticonClickListener() {
        throw new UnsupportedOperationException();
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "")
    public final Function2 getToolbarClickListener() {
        throw new UnsupportedOperationException();
    }

    @Override  // android.view.ViewGroup
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        RecyclerView recyclerView0 = (RecyclerView)this.findViewById(id.kemoticon_keyboard_tabs);
        f f0 = null;
        recyclerView0.setItemAnimator(null);
        recyclerView0.setAdapter(new f(this.c));
        ViewPager viewPager0 = (ViewPager)this.findViewById(id.kemoticon_keyboard_pages);
        viewPager0.setAdapter(new c(this.c));
        Adapter recyclerView$Adapter0 = recyclerView0.getAdapter();
        if(recyclerView$Adapter0 instanceof f) {
            f0 = (f)recyclerView$Adapter0;
        }
        if(f0 != null) {
            o o0 = new o(27, viewPager0, this);
            Intrinsics.checkNotNullParameter(o0, "<set-?>");
            f0.j = o0;
            viewPager0.clearOnPageChangeListeners();
            viewPager0.addOnPageChangeListener(new EmoticonKeyboard.initAdapters.1.2(f0));
            f0.a(1);
        }
    }

    public final void pushToHistory(@NotNull Emoticon emoticon0) {
        Intrinsics.checkNotNullParameter(emoticon0, "emoticon");
        a a0 = this.c;
        if(a0.a(emoticon0.getPackId())) {
            a0.getClass();
            Intrinsics.checkNotNullParameter(emoticon0, "emoticon");
            a0.d.push(emoticon0);
        }
    }

    public final void setEmoticonClickListener(@Nullable Function2 function20) {
        this.a = function20;
    }

    public final void setToolbarClickListener(@Nullable Function2 function20) {
        this.b = function20;
    }
}

