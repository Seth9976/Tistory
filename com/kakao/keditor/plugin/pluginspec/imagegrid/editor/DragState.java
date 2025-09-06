package com.kakao.keditor.plugin.pluginspec.imagegrid.editor;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import sd.a;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/kakao/keditor/plugin/pluginspec/imagegrid/editor/DragState;", "", "(Ljava/lang/String;I)V", "OnDrag", "Idle", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public enum DragState {
    OnDrag,
    Idle;

    private static final EnumEntries $ENTRIES;
    private static final DragState[] $VALUES;

    private static final DragState[] $values() [...] // Inlined contents

    static {
        DragState.$VALUES = arr_dragState;
        Intrinsics.checkNotNullParameter(arr_dragState, "entries");
        DragState.$ENTRIES = new a(arr_dragState);
    }

    @NotNull
    public static EnumEntries getEntries() {
        return DragState.$ENTRIES;
    }
}

