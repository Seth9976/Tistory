package com.kakao.keditor.plugin.itemspec.table;

import com.kakao.keditor.KeditorItem;
import com.kakao.keditor.plugin.KeditorItemType;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@KeditorItemType(type = "tableRow")
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000E\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u000B\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u0018\u001A\u00020\u0006H\u0016R&\u0010\u0004\u001A\u000E\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0094\u000E¢\u0006\u000E\n\u0000\u001A\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000BR \u0010\f\u001A\b\u0012\u0004\u0012\u00020\u000E0\rX\u0086\u000E¢\u0006\u000E\n\u0000\u001A\u0004\b\u000F\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001A\u0010\u0013\u001A\u00020\u0006X\u0086\u000E¢\u0006\u000E\n\u0000\u001A\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Lcom/kakao/keditor/plugin/itemspec/table/TableRowItem;", "Lcom/kakao/keditor/KeditorItem;", "Ljava/io/Serializable;", "()V", "bypassStored", "", "", "", "getBypassStored", "()Ljava/util/Map;", "setBypassStored", "(Ljava/util/Map;)V", "cells", "", "Lcom/kakao/keditor/plugin/itemspec/table/TableCellItem;", "getCells", "()Ljava/util/List;", "setCells", "(Ljava/util/List;)V", "height", "getHeight", "()Ljava/lang/String;", "setHeight", "(Ljava/lang/String;)V", "toString", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class TableRowItem extends KeditorItem implements Serializable {
    @NotNull
    private Map bypassStored;
    @NotNull
    private List cells;
    @NotNull
    private String height;

    public TableRowItem() {
        this.bypassStored = new LinkedHashMap();
        this.cells = new ArrayList();
        this.height = "";
    }

    @Override  // com.kakao.keditor.KeditorItem
    @NotNull
    public Map getBypassStored() {
        return this.bypassStored;
    }

    @NotNull
    public final List getCells() {
        return this.cells;
    }

    @NotNull
    public final String getHeight() {
        return this.height;
    }

    @Override  // com.kakao.keditor.KeditorItem
    public void setBypassStored(@NotNull Map map0) {
        Intrinsics.checkNotNullParameter(map0, "<set-?>");
        this.bypassStored = map0;
    }

    public final void setCells(@NotNull List list0) {
        Intrinsics.checkNotNullParameter(list0, "<set-?>");
        this.cells = list0;
    }

    public final void setHeight(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "<set-?>");
        this.height = s;
    }

    @Override
    @NotNull
    public String toString() {
        return "TableRowItem(height=" + this.height + ", cells=" + this.cells + ")";
    }
}

