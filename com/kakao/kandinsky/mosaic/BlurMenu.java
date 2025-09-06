package com.kakao.kandinsky.mosaic;

import com.kakao.feature.mosaic.R.drawable;
import com.kakao.feature.mosaic.R.string;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import sd.a;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u000B\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0007\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001A\u0004\b\u0005\u0010\u0006R\u0017\u0010\n\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0004\u001A\u0004\b\t\u0010\u0006j\u0002\b\u000Bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/kakao/kandinsky/mosaic/BlurMenu;", "", "", "a", "I", "getTitleResId", "()I", "titleResId", "b", "getIconResId", "iconResId", "Circle", "Rectangle", "mosaic_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public enum BlurMenu {
    Circle(string.menu_circle, drawable.icon_circle),
    Rectangle(string.menu_rectangle, drawable.icon_rectangle);

    public final int a;
    public final int b;
    public static final BlurMenu[] c;
    public static final EnumEntries d;

    static {
        BlurMenu.c = arr_blurMenu;
        Intrinsics.checkNotNullParameter(arr_blurMenu, "entries");
        BlurMenu.d = new a(arr_blurMenu);
    }

    public BlurMenu(int v1, int v2) {
        this.a = v1;
        this.b = v2;
    }

    @NotNull
    public static EnumEntries getEntries() {
        return BlurMenu.d;
    }

    public final int getIconResId() {
        return this.b;
    }

    public final int getTitleResId() {
        return this.a;
    }
}

