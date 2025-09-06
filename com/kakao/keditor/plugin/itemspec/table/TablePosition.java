package com.kakao.keditor.plugin.itemspec.table;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000E\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0003¢\u0006\u0002\u0010\u0005J\b\u0010\t\u001A\u00020\nH\u0016R\u0011\u0010\u0004\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\b\u0010\u0007¨\u0006\u000B"}, d2 = {"Lcom/kakao/keditor/plugin/itemspec/table/TablePosition;", "", "row", "", "col", "(II)V", "getCol", "()I", "getRow", "toString", "", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class TablePosition {
    private final int col;
    private final int row;

    public TablePosition(int v, int v1) {
        this.row = v;
        this.col = v1;
    }

    public final int getCol() {
        return this.col;
    }

    public final int getRow() {
        return this.row;
    }

    @Override
    @NotNull
    public String toString() {
        return "TablePosition(row=" + this.row + ", col=" + this.col + ")";
    }
}

