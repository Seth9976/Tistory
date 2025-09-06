package com.kakao.keditor.plugin.attrs.item;

import com.kakao.keditor.plugin.itemspec.EnumList;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.f0;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sd.a;

@Metadata(d1 = {"\u0000\u001A\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0004\n\u0002\u0010\u000B\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\fB\u000F\b\u0002\u0012\u0006\u0010\u0002\u001A\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u0007\u001A\u00020\bR\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u0005\u0010\u0006j\u0002\b\tj\u0002\b\nj\u0002\b\u000B¨\u0006\r"}, d2 = {"Lcom/kakao/keditor/plugin/attrs/item/MobileStyle;", "", "str", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getStr", "()Ljava/lang/String;", "isOriginStyle", "", "Origin", "Content", "Full", "Companion", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public enum MobileStyle {
    @Metadata(d1 = {"\u0000\u001E\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\"\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001A\u00020\u00042\b\u0010\u0005\u001A\u0004\u0018\u00010\u0006J\u000E\u0010\u0007\u001A\b\u0012\u0004\u0012\u00020\u00060\bH\u0016¨\u0006\t"}, d2 = {"Lcom/kakao/keditor/plugin/attrs/item/MobileStyle$Companion;", "Lcom/kakao/keditor/plugin/itemspec/EnumList;", "()V", "byName", "Lcom/kakao/keditor/plugin/attrs/item/MobileStyle;", "string", "", "typeSet", "", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Companion implements EnumList {
        private Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        @NotNull
        public final MobileStyle byName(@Nullable String s) {
            String s1;
            if(s == null) {
                s1 = null;
            }
            else {
                s1 = s.toLowerCase();
                Intrinsics.checkNotNullExpressionValue(s1, "toLowerCase(...)");
            }
            MobileStyle mobileStyle0 = MobileStyle.Origin;
            Intrinsics.checkNotNullExpressionValue("widthorigin", "toLowerCase(...)");
            if(!Intrinsics.areEqual(s1, "widthorigin")) {
                MobileStyle mobileStyle1 = MobileStyle.Content;
                Intrinsics.checkNotNullExpressionValue("widthcontent", "toLowerCase(...)");
                if(Intrinsics.areEqual(s1, "widthcontent")) {
                    return mobileStyle1;
                }
                Intrinsics.checkNotNullExpressionValue("widthfull", "toLowerCase(...)");
                return Intrinsics.areEqual(s1, "widthfull") ? MobileStyle.Full : mobileStyle0;
            }
            return mobileStyle0;
        }

        // 去混淆评级： 中等(60)
        @Override  // com.kakao.keditor.plugin.itemspec.EnumList
        @NotNull
        public Set typeSet() {
            return f0.setOf(new String[]{"widthOrigin", "widthContent", "widthFull"});
        }
    }

    Origin("widthOrigin"),
    Content("widthContent"),
    Full("widthFull");

    private static final EnumEntries $ENTRIES;
    private static final MobileStyle[] $VALUES;
    @NotNull
    public static final Companion Companion;
    @NotNull
    private final String str;

    private static final MobileStyle[] $values() [...] // Inlined contents

    static {
        MobileStyle.$VALUES = arr_mobileStyle;
        Intrinsics.checkNotNullParameter(arr_mobileStyle, "entries");
        MobileStyle.$ENTRIES = new a(arr_mobileStyle);
        MobileStyle.Companion = new Companion(null);
    }

    private MobileStyle(String s1) {
        this.str = s1;
    }

    @NotNull
    public static EnumEntries getEntries() {
        return MobileStyle.$ENTRIES;
    }

    @NotNull
    public final String getStr() {
        return this.str;
    }

    public final boolean isOriginStyle() [...] // 潜在的解密器
}

