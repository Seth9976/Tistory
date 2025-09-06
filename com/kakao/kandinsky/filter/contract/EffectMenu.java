package com.kakao.kandinsky.filter.contract;

import androidx.compose.runtime.Immutable;
import ce.b;
import ce.e;
import com.kakao.kandinsky.filter.R.drawable;
import com.kakao.kandinsky.filter.R.string;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.ClosedFloatingPointRange;
import org.jetbrains.annotations.NotNull;
import sd.a;

// 部分失败：枚举糖化
// 枚举按原样呈现，而不是糖化为Java 5枚举。
@Immutable
@Metadata(d1 = {"\u0000\u001C\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u000B\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0007\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001A\u0004\b\u0005\u0010\u0006R\u0017\u0010\n\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0004\u001A\u0004\b\t\u0010\u0006R\u001D\u0010\u0011\u001A\b\u0012\u0004\u0012\u00020\f0\u000B8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000E\u001A\u0004\b\u000F\u0010\u0010j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016¨\u0006\u0017"}, d2 = {"Lcom/kakao/kandinsky/filter/contract/EffectMenu;", "", "", "a", "I", "getTitle", "()I", "title", "b", "getIcon", "icon", "Lkotlin/ranges/ClosedFloatingPointRange;", "", "c", "Lkotlin/ranges/ClosedFloatingPointRange;", "getRange", "()Lkotlin/ranges/ClosedFloatingPointRange;", "range", "Brightness", "Contrast", "Saturation", "Temperature", "Vignette", "filter_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class EffectMenu extends Enum {
    public static final enum EffectMenu Brightness;
    public static final enum EffectMenu Contrast;
    public static final enum EffectMenu Saturation;
    public static final enum EffectMenu Temperature;
    public static final enum EffectMenu Vignette;
    public final int a;
    public final int b;
    public final ClosedFloatingPointRange c;
    public static final EffectMenu[] d;
    public static final EnumEntries e;

    static {
        ClosedFloatingPointRange closedFloatingPointRange0 = new b(-150.0f, 150.0f);
        EffectMenu.Brightness = new EffectMenu("Brightness", 0, string.brightness, drawable.icon_retouch_brightness, closedFloatingPointRange0);
        EffectMenu.Contrast = new EffectMenu("Contrast", 1, string.contrast, drawable.icon_retouch_contrast);
        EffectMenu.Saturation = new EffectMenu("Saturation", 2, string.saturation, drawable.icon_retouch_saturation);
        EffectMenu.Temperature = new EffectMenu("Temperature", 3, string.temperature, drawable.icon_retouch_color_temperature);
        EffectMenu.Vignette = new EffectMenu("Vignette", 4, string.vignette, drawable.icon_retouch_vignettes);
        EffectMenu[] arr_effectMenu = {EffectMenu.Brightness, EffectMenu.Contrast, EffectMenu.Saturation, EffectMenu.Temperature, EffectMenu.Vignette};
        EffectMenu.d = arr_effectMenu;
        Intrinsics.checkNotNullParameter(arr_effectMenu, "entries");
        EffectMenu.e = new a(arr_effectMenu);
    }

    public EffectMenu(String s, int v, int v1, int v2) {
        this(s, v, v1, v2, e.rangeTo(-100.0f, 100.0f));
    }

    public EffectMenu(String s, int v, int v1, int v2, ClosedFloatingPointRange closedFloatingPointRange0) {
        super(s, v);
        this.a = v1;
        this.b = v2;
        this.c = closedFloatingPointRange0;
    }

    @NotNull
    public static EnumEntries getEntries() {
        return EffectMenu.e;
    }

    public final int getIcon() {
        return this.b;
    }

    @NotNull
    public final ClosedFloatingPointRange getRange() {
        return this.c;
    }

    public final int getTitle() {
        return this.a;
    }

    public static EffectMenu valueOf(String s) {
        return (EffectMenu)Enum.valueOf(EffectMenu.class, s);
    }

    public static EffectMenu[] values() {
        return (EffectMenu[])EffectMenu.d.clone();
    }
}

