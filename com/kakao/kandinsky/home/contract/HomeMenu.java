package com.kakao.kandinsky.home.contract;

import com.kakao.feature.home.R.drawable;
import com.kakao.feature.home.R.string;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import sd.a;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0012\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0007\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001A\u0004\b\u0005\u0010\u0006R\u0017\u0010\n\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0004\u001A\u0004\b\t\u0010\u0006j\u0002\b\u000Bj\u0002\b\fj\u0002\b\rj\u0002\b\u000Ej\u0002\b\u000Fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013¨\u0006\u0014"}, d2 = {"Lcom/kakao/kandinsky/home/contract/HomeMenu;", "", "", "a", "I", "getTitle", "()I", "title", "b", "getIcon", "icon", "Resize", "Crop", "Effect", "Signature", "Sticker", "Mosaic", "Text", "Border", "Reset", "home_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public enum HomeMenu {
    Resize(string.menu_resize, drawable.icon_tools_size),
    Crop(string.menu_crop, drawable.icon_tools_crop),
    Effect(string.menu_effect, drawable.icon_tools_filter),
    Signature(string.menu_signature, drawable.icon_tools_signature),
    Sticker(string.menu_sticker, drawable.icon_tools_sticker),
    Mosaic(string.menu_mosaic, drawable.icon_tools_mosaic),
    Text(string.menu_text, drawable.icon_tools_text),
    Border(string.menu_border, drawable.icon_tools_frame),
    Reset(string.menu_reset, drawable.icon_tools_initialize);

    public final int a;
    public final int b;
    public static final HomeMenu[] c;
    public static final EnumEntries d;

    static {
        HomeMenu.c = arr_homeMenu;
        Intrinsics.checkNotNullParameter(arr_homeMenu, "entries");
        HomeMenu.d = new a(arr_homeMenu);
    }

    public HomeMenu(int v1, int v2) {
        this.a = v1;
        this.b = v2;
    }

    @NotNull
    public static EnumEntries getEntries() {
        return HomeMenu.d;
    }

    public final int getIcon() {
        return this.b;
    }

    public final int getTitle() {
        return this.a;
    }
}

