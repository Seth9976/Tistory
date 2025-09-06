package com.kakao.kandinsky.filter.contract;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\"\u001D\u0010\u0006\u001A\b\u0012\u0004\u0012\u00020\u00010\u00008\u0006¢\u0006\f\n\u0004\b\u0002\u0010\u0003\u001A\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lkotlin/enums/EnumEntries;", "Lcom/kakao/kandinsky/filter/contract/EffectMenu;", "a", "Lkotlin/enums/EnumEntries;", "getEffectMenuList", "()Lkotlin/enums/EnumEntries;", "effectMenuList", "filter_release"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
public final class MenuKt {
    public static final EnumEntries a;

    static {
        MenuKt.a = EffectMenu.getEntries();
    }

    @NotNull
    public static final EnumEntries getEffectMenuList() {
        return MenuKt.a;
    }
}

