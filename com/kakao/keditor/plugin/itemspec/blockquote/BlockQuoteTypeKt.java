package com.kakao.keditor.plugin.itemspec.blockquote;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0000\u001A\f\u0010\u0000\u001A\u00020\u0001*\u0004\u0018\u00010\u0002¨\u0006\u0003"}, d2 = {"toBlockQuoteType", "Lcom/kakao/keditor/plugin/itemspec/blockquote/BlockQuoteType;", "", "keditor_release"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
public final class BlockQuoteTypeKt {
    @NotNull
    public static final BlockQuoteType toBlockQuoteType(@Nullable String s) {
        if(Intrinsics.areEqual(s, "style2")) {
            return Style2.INSTANCE;
        }
        return Intrinsics.areEqual(s, "style3") ? Style3.INSTANCE : Style1.INSTANCE;
    }
}

