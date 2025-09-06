package com.kakao.keditor.plugin.itemspec.table;

import android.text.SpannableStringBuilder;
import com.kakao.keditor.KeditorItem;
import com.kakao.keditor.plugin.KeditorItemType;
import com.kakao.keditor.plugin.attrs.Alignment.Left;
import com.kakao.keditor.plugin.attrs.Alignment;
import com.kakao.keditor.plugin.attrs.item.Aligned;
import com.kakao.keditor.plugin.attrs.text.spans.KeImageSpan;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@KeditorItemType(type = "tableCell")
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\u0010\u000E\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u000E\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000B\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0005\u00A2\u0006\u0002\u0010\u0004J\u0006\u0010H\u001A\u00020IJ\u000E\u0010J\u001A\u00020\'2\u0006\u0010K\u001A\u00020\u0014J\b\u0010L\u001A\u00020\rH\u0016R\u001A\u0010\u0005\u001A\u00020\u0006X\u0096\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR&\u0010\u000B\u001A\u000E\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000E0\fX\u0094\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b\u000F\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001E\u0010\u0013\u001A\u0004\u0018\u00010\u0014X\u0086\u000E\u00A2\u0006\u0010\n\u0002\u0010\u0019\u001A\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001C\u0010\u001A\u001A\u0004\u0018\u00010\u001BX\u0086\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b\u001C\u0010\u001D\"\u0004\b\u001E\u0010\u001FR\u001A\u0010 \u001A\u00020\rX\u0086\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b!\u0010\"\"\u0004\b#\u0010$R \u0010%\u001A\b\u0012\u0004\u0012\u00020\'0&X\u0086\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b(\u0010)\"\u0004\b*\u0010+R\u001E\u0010,\u001A\u0004\u0018\u00010\u0014X\u0086\u000E\u00A2\u0006\u0010\n\u0002\u0010\u0019\u001A\u0004\b-\u0010\u0016\"\u0004\b.\u0010\u0018R\u001E\u0010/\u001A\u0004\u0018\u00010\u0014X\u0086\u000E\u00A2\u0006\u0010\n\u0002\u0010\u0019\u001A\u0004\b0\u0010\u0016\"\u0004\b1\u0010\u0018R\u001E\u00102\u001A\u0004\u0018\u00010\u0014X\u0086\u000E\u00A2\u0006\u0010\n\u0002\u0010\u0019\u001A\u0004\b3\u0010\u0016\"\u0004\b4\u0010\u0018R\u001A\u00105\u001A\u000206X\u0086\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b7\u00108\"\u0004\b9\u0010:R\u001A\u0010;\u001A\u00020<X\u0086\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b=\u0010>\"\u0004\b?\u0010@R\u001E\u0010A\u001A\u0004\u0018\u00010BX\u0086\u000E\u00A2\u0006\u0010\n\u0002\u0010G\u001A\u0004\bC\u0010D\"\u0004\bE\u0010F\u00A8\u0006M"}, d2 = {"Lcom/kakao/keditor/plugin/itemspec/table/TableCellItem;", "Lcom/kakao/keditor/KeditorItem;", "Lcom/kakao/keditor/plugin/attrs/item/Aligned;", "Ljava/io/Serializable;", "()V", "alignment", "Lcom/kakao/keditor/plugin/attrs/Alignment;", "getAlignment", "()Lcom/kakao/keditor/plugin/attrs/Alignment;", "setAlignment", "(Lcom/kakao/keditor/plugin/attrs/Alignment;)V", "bypassStored", "", "", "", "getBypassStored", "()Ljava/util/Map;", "setBypassStored", "(Ljava/util/Map;)V", "colSpan", "", "getColSpan", "()Ljava/lang/Integer;", "setColSpan", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "editingImageSpan", "Lcom/kakao/keditor/plugin/attrs/text/spans/KeImageSpan;", "getEditingImageSpan", "()Lcom/kakao/keditor/plugin/attrs/text/spans/KeImageSpan;", "setEditingImageSpan", "(Lcom/kakao/keditor/plugin/attrs/text/spans/KeImageSpan;)V", "height", "getHeight", "()Ljava/lang/String;", "setHeight", "(Ljava/lang/String;)V", "images", "", "Lcom/kakao/keditor/plugin/itemspec/table/TableImage;", "getImages", "()Ljava/util/List;", "setImages", "(Ljava/util/List;)V", "rowSpan", "getRowSpan", "setRowSpan", "selectionEnd", "getSelectionEnd", "setSelectionEnd", "selectionStart", "getSelectionStart", "setSelectionStart", "text", "Landroid/text/SpannableStringBuilder;", "getText", "()Landroid/text/SpannableStringBuilder;", "setText", "(Landroid/text/SpannableStringBuilder;)V", "textDeletedFlag", "", "getTextDeletedFlag", "()Z", "setTextDeletedFlag", "(Z)V", "widthPercent", "", "getWidthPercent", "()Ljava/lang/Double;", "setWidthPercent", "(Ljava/lang/Double;)V", "Ljava/lang/Double;", "clearSelection", "", "removeTableImageAt", "index", "toString", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class TableCellItem extends KeditorItem implements Aligned, Serializable {
    @NotNull
    private Alignment alignment;
    @NotNull
    private Map bypassStored;
    @Nullable
    private Integer colSpan;
    @Nullable
    private KeImageSpan editingImageSpan;
    @NotNull
    private String height;
    @NotNull
    private List images;
    @Nullable
    private Integer rowSpan;
    @Nullable
    private Integer selectionEnd;
    @Nullable
    private Integer selectionStart;
    @NotNull
    private SpannableStringBuilder text;
    private boolean textDeletedFlag;
    @Nullable
    private Double widthPercent;

    public TableCellItem() {
        this.bypassStored = new LinkedHashMap();
        this.text = new SpannableStringBuilder("");
        this.height = "";
        this.images = new ArrayList();
        this.alignment = Left.INSTANCE;
    }

    public final void clearSelection() {
        this.selectionStart = null;
        this.selectionEnd = null;
    }

    @Override  // com.kakao.keditor.plugin.attrs.item.Aligned
    @NotNull
    public Alignment getAlignment() {
        return this.alignment;
    }

    @Override  // com.kakao.keditor.KeditorItem
    @NotNull
    public Map getBypassStored() {
        return this.bypassStored;
    }

    @Nullable
    public final Integer getColSpan() {
        return this.colSpan;
    }

    @Nullable
    public final KeImageSpan getEditingImageSpan() {
        return this.editingImageSpan;
    }

    @NotNull
    public final String getHeight() {
        return this.height;
    }

    @NotNull
    public final List getImages() {
        return this.images;
    }

    @Nullable
    public final Integer getRowSpan() {
        return this.rowSpan;
    }

    @Nullable
    public final Integer getSelectionEnd() {
        return this.selectionEnd;
    }

    @Nullable
    public final Integer getSelectionStart() {
        return this.selectionStart;
    }

    @NotNull
    public final SpannableStringBuilder getText() {
        return this.text;
    }

    public final boolean getTextDeletedFlag() {
        return this.textDeletedFlag;
    }

    @Nullable
    public final Double getWidthPercent() {
        return this.widthPercent;
    }

    @NotNull
    public final TableImage removeTableImageAt(int v) {
        return (TableImage)this.images.remove(v);
    }

    @Override  // com.kakao.keditor.plugin.attrs.item.Aligned
    public void setAlignment(@NotNull Alignment alignment0) {
        Intrinsics.checkNotNullParameter(alignment0, "<set-?>");
        this.alignment = alignment0;
    }

    @Override  // com.kakao.keditor.KeditorItem
    public void setBypassStored(@NotNull Map map0) {
        Intrinsics.checkNotNullParameter(map0, "<set-?>");
        this.bypassStored = map0;
    }

    public final void setColSpan(@Nullable Integer integer0) {
        this.colSpan = integer0;
    }

    public final void setEditingImageSpan(@Nullable KeImageSpan keImageSpan0) {
        this.editingImageSpan = keImageSpan0;
    }

    public final void setHeight(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "<set-?>");
        this.height = s;
    }

    public final void setImages(@NotNull List list0) {
        Intrinsics.checkNotNullParameter(list0, "<set-?>");
        this.images = list0;
    }

    public final void setRowSpan(@Nullable Integer integer0) {
        this.rowSpan = integer0;
    }

    public final void setSelectionEnd(@Nullable Integer integer0) {
        this.selectionEnd = integer0;
    }

    public final void setSelectionStart(@Nullable Integer integer0) {
        this.selectionStart = integer0;
    }

    public final void setText(@NotNull SpannableStringBuilder spannableStringBuilder0) {
        Intrinsics.checkNotNullParameter(spannableStringBuilder0, "<set-?>");
        this.text = spannableStringBuilder0;
    }

    public final void setTextDeletedFlag(boolean z) {
        this.textDeletedFlag = z;
    }

    public final void setWidthPercent(@Nullable Double double0) {
        this.widthPercent = double0;
    }

    // 去混淆评级： 低(20)
    @Override
    @NotNull
    public String toString() {
        return "TableCellItem(text=" + this.text + ", selectionStart=" + this.selectionStart + ", selectionEnd=" + this.selectionEnd + ", height=" + this.height + ", width=" + this.widthPercent + ", colSpan=" + this.colSpan + ", rowSpan-" + this.rowSpan + ", alignment=" + "alignment" + ")";
    }
}

