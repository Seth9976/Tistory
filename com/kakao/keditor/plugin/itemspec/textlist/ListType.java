package com.kakao.keditor.plugin.itemspec.textlist;

import com.kakao.keditor.R.drawable;
import com.kakao.keditor.plugin.itemspec.EnumList;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.f0;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.p;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sd.a;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000E\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u0000 \u00102\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0010B\u0019\b\u0002\u0012\b\u0010\u0002\u001A\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0006\u0010\f\u001A\u00020\u0000R\u0011\u0010\u0004\u001A\u00020\u0005¢\u0006\b\n\u0000\u001A\u0004\b\u0007\u0010\bR\u0015\u0010\u0002\u001A\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000B\u001A\u0004\b\t\u0010\nj\u0002\b\rj\u0002\b\u000Ej\u0002\b\u000F¨\u0006\u0011"}, d2 = {"Lcom/kakao/keditor/plugin/itemspec/textlist/ListType;", "", "subToolbarSrc", "", "style", "", "(Ljava/lang/String;ILjava/lang/Integer;Ljava/lang/String;)V", "getStyle", "()Ljava/lang/String;", "getSubToolbarSrc", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getNext", "DISC", "CIRCLE", "DECIMAL", "Companion", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public enum ListType {
    @Metadata(d1 = {"\u0000\u001E\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\"\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000E\u0010\u0003\u001A\u00020\u00042\u0006\u0010\u0005\u001A\u00020\u0006J\u000E\u0010\u0007\u001A\b\u0012\u0004\u0012\u00020\u00060\bH\u0016¨\u0006\t"}, d2 = {"Lcom/kakao/keditor/plugin/itemspec/textlist/ListType$Companion;", "Lcom/kakao/keditor/plugin/itemspec/EnumList;", "()V", "getByName", "Lcom/kakao/keditor/plugin/itemspec/textlist/ListType;", "name", "", "typeSet", "", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Companion implements EnumList {
        private Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        @NotNull
        public final ListType getByName(@NotNull String s) {
            Intrinsics.checkNotNullParameter(s, "name");
            ListType[] arr_listType = ListType.values();
            for(int v = 0; v < arr_listType.length; ++v) {
                ListType listType0 = arr_listType[v];
                if(p.equals(listType0.getStyle(), s, true)) {
                    return listType0;
                }
            }
            return ListType.DECIMAL;
        }

        // 去混淆评级： 中等(60)
        @Override  // com.kakao.keditor.plugin.itemspec.EnumList
        @NotNull
        public Set typeSet() {
            return f0.setOf(new String[]{"disc", "circle", "decimal"});
        }
    }

    DISC(drawable.ke_ic_list_disc, "disc"),
    CIRCLE(drawable.ke_ic_list_circle, "circle"),
    DECIMAL(null, "decimal");

    private static final EnumEntries $ENTRIES;
    private static final ListType[] $VALUES;
    @NotNull
    public static final Companion Companion;
    @NotNull
    private final String style;
    @Nullable
    private final Integer subToolbarSrc;

    private static final ListType[] $values() [...] // Inlined contents

    static {
        ListType.$VALUES = arr_listType;
        Intrinsics.checkNotNullParameter(arr_listType, "entries");
        ListType.$ENTRIES = new a(arr_listType);
        ListType.Companion = new Companion(null);
    }

    private ListType(Integer integer0, String s1) {
        this.subToolbarSrc = integer0;
        this.style = s1;
    }

    @NotNull
    public static EnumEntries getEntries() {
        return ListType.$ENTRIES;
    }

    @NotNull
    public final ListType getNext() {
        ListType[] arr_listType = ListType.values();
        return arr_listType[(this.ordinal() + 1) % ListType.values().length];
    }

    @NotNull
    public final String getStyle() {
        return this.style;
    }

    @Nullable
    public final Integer getSubToolbarSrc() {
        return this.subToolbarSrc;
    }
}

