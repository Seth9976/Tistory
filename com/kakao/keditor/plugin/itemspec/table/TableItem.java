package com.kakao.keditor.plugin.itemspec.table;

import a5.b;
import android.text.SpannableStringBuilder;
import com.kakao.keditor.plugin.KeditorItemType;
import com.kakao.keditor.plugin.attrs.Alignment.Center;
import com.kakao.keditor.plugin.attrs.Alignment;
import com.kakao.keditor.plugin.attrs.item.Aligned;
import com.kakao.keditor.plugin.attrs.item.HasExtraUploadable;
import com.kakao.keditor.plugin.attrs.item.NoUpdateWhenAlignmentChanged;
import com.kakao.keditor.plugin.attrs.item.RepresentativeImageProvider;
import com.kakao.keditor.plugin.itemspec.paragraph.TextItem;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@KeditorItemType(type = "table")
@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010%\n\u0002\u0010\u000E\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u000B\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010 \n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u0006B\u0005\u00A2\u0006\u0002\u0010\u0007J\u0006\u0010G\u001A\u00020HJ\b\u0010I\u001A\u00020JH\u0016J\u000E\u0010K\u001A\b\u0012\u0004\u0012\u00020\u00110LH\u0016J\n\u0010M\u001A\u0004\u0018\u00010\u0011H\u0016J\u0010\u0010N\u001A\u00020J2\u0006\u0010O\u001A\u00020\u0011H\u0016J\u0010\u0010P\u001A\u00020H2\u0006\u0010Q\u001A\u00020\u0011H\u0016J\b\u0010R\u001A\u00020\u0011H\u0016R$\u0010\n\u001A\u00020\t2\u0006\u0010\b\u001A\u00020\t@VX\u0096\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b\u000B\u0010\f\"\u0004\b\r\u0010\u000ER&\u0010\u000F\u001A\u000E\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u0010X\u0094\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0017\u001A\u00020\u00188F\u00A2\u0006\u0006\u001A\u0004\b\u0019\u0010\u001AR\u001A\u0010\u001B\u001A\u00020\u001CX\u0086\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b\u001D\u0010\u001E\"\u0004\b\u001F\u0010 R\u0011\u0010!\u001A\u00020\u00188F\u00A2\u0006\u0006\u001A\u0004\b\"\u0010\u001AR \u0010#\u001A\b\u0012\u0004\u0012\u00020%0$X\u0086\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b&\u0010\'\"\u0004\b(\u0010)R\u001A\u0010*\u001A\u00020\u0018X\u0096\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b+\u0010\u001A\"\u0004\b,\u0010-R\u001A\u0010.\u001A\u00020\u0018X\u0096\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b/\u0010\u001A\"\u0004\b0\u0010-R$\u00102\u001A\u0002012\u0006\u0010\b\u001A\u000201@FX\u0086\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b3\u00104\"\u0004\b5\u00106R\u001A\u00107\u001A\b\u0012\u0004\u0012\u0002080$8BX\u0082\u0004\u00A2\u0006\u0006\u001A\u0004\b9\u0010\'R\u001A\u0010:\u001A\u00020;X\u0096\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b<\u0010=\"\u0004\b>\u0010?R\u001A\u0010@\u001A\b\u0012\u0004\u0012\u0002080$8VX\u0096\u0004\u00A2\u0006\u0006\u001A\u0004\bA\u0010\'R\u001C\u0010B\u001A\u0004\u0018\u00010\u0011X\u0086\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\bC\u0010D\"\u0004\bE\u0010F\u00A8\u0006S"}, d2 = {"Lcom/kakao/keditor/plugin/itemspec/table/TableItem;", "Lcom/kakao/keditor/plugin/itemspec/paragraph/TextItem;", "Ljava/io/Serializable;", "Lcom/kakao/keditor/plugin/attrs/item/Aligned;", "Lcom/kakao/keditor/plugin/attrs/item/HasExtraUploadable;", "Lcom/kakao/keditor/plugin/attrs/item/NoUpdateWhenAlignmentChanged;", "Lcom/kakao/keditor/plugin/attrs/item/RepresentativeImageProvider;", "()V", "value", "Lcom/kakao/keditor/plugin/attrs/Alignment;", "alignment", "getAlignment", "()Lcom/kakao/keditor/plugin/attrs/Alignment;", "setAlignment", "(Lcom/kakao/keditor/plugin/attrs/Alignment;)V", "bypassStored", "", "", "", "getBypassStored", "()Ljava/util/Map;", "setBypassStored", "(Ljava/util/Map;)V", "columnCount", "", "getColumnCount", "()I", "focusedCellPosition", "Lcom/kakao/keditor/plugin/itemspec/table/TablePosition;", "getFocusedCellPosition", "()Lcom/kakao/keditor/plugin/itemspec/table/TablePosition;", "setFocusedCellPosition", "(Lcom/kakao/keditor/plugin/itemspec/table/TablePosition;)V", "representativeImageIndex", "getRepresentativeImageIndex", "rows", "", "Lcom/kakao/keditor/plugin/itemspec/table/TableRowItem;", "getRows", "()Ljava/util/List;", "setRows", "(Ljava/util/List;)V", "selectionEnd", "getSelectionEnd", "setSelectionEnd", "(I)V", "selectionStart", "getSelectionStart", "setSelectionStart", "Lcom/kakao/keditor/plugin/itemspec/table/TableStyle;", "style", "getStyle", "()Lcom/kakao/keditor/plugin/itemspec/table/TableStyle;", "setStyle", "(Lcom/kakao/keditor/plugin/itemspec/table/TableStyle;)V", "tableImages", "Lcom/kakao/keditor/plugin/itemspec/table/TableImage;", "getTableImages", "text", "Landroid/text/SpannableStringBuilder;", "getText", "()Landroid/text/SpannableStringBuilder;", "setText", "(Landroid/text/SpannableStringBuilder;)V", "uploadables", "getUploadables", "widthPercent", "getWidthPercent", "()Ljava/lang/String;", "setWidthPercent", "(Ljava/lang/String;)V", "clearRepresentationImage", "", "containsRepresentativeImage", "", "getImageSrcList", "", "getRepresentativeImage", "hasImage", "representativeImageSrc", "setRepresentativeImage", "representativeImage", "toString", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nTableItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TableItem.kt\ncom/kakao/keditor/plugin/itemspec/table/TableItem\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,88:1\n1#2:89\n1855#3:90\n1855#3,2:91\n1856#3:93\n1747#3,3:94\n1549#3:97\n1620#3,3:98\n1747#3,3:101\n288#3,2:104\n1855#3,2:106\n*S KotlinDebug\n*F\n+ 1 TableItem.kt\ncom/kakao/keditor/plugin/itemspec/table/TableItem\n*L\n50#1:90\n51#1:91,2\n50#1:93\n64#1:94,3\n65#1:97\n65#1:98,3\n68#1:101,3\n71#1:104,2\n77#1:106,2\n*E\n"})
public final class TableItem extends TextItem implements Aligned, HasExtraUploadable, NoUpdateWhenAlignmentChanged, RepresentativeImageProvider, Serializable {
    @NotNull
    private Alignment alignment;
    @NotNull
    private Map bypassStored;
    @NotNull
    private TablePosition focusedCellPosition;
    @NotNull
    private List rows;
    private int selectionEnd;
    private int selectionStart;
    @NotNull
    private TableStyle style;
    @NotNull
    private SpannableStringBuilder text;
    @Nullable
    private String widthPercent;

    public TableItem() {
        super(false, 1, null);
        this.bypassStored = new LinkedHashMap();
        this.rows = new ArrayList();
        this.style = TableStyle.STYLE0;
        this.text = new SpannableStringBuilder("");
        this.alignment = Center.INSTANCE;
        this.focusedCellPosition = new TablePosition(-1, -1);
    }

    public final void clearRepresentationImage() {
        for(Object object0: this.getTableImages()) {
            ((TableImage)object0).setRepresent(false);
        }
    }

    @Override  // com.kakao.keditor.plugin.attrs.item.RepresentativeImageProvider
    public boolean containsRepresentativeImage() {
        Iterable iterable0 = this.getTableImages();
        if(!(iterable0 instanceof Collection) || !((Collection)iterable0).isEmpty()) {
            for(Object object0: iterable0) {
                if(((TableImage)object0).isRepresent()) {
                    return true;
                }
                if(false) {
                    break;
                }
            }
        }
        return false;
    }

    @Override  // com.kakao.keditor.plugin.itemspec.paragraph.TextItem, com.kakao.keditor.plugin.attrs.item.Aligned
    @NotNull
    public Alignment getAlignment() {
        return this.alignment;
    }

    @Override  // com.kakao.keditor.KeditorItem
    @NotNull
    public Map getBypassStored() {
        return this.bypassStored;
    }

    public final int getColumnCount() {
        int v = 0;
        if(this.rows != null && !this.rows.isEmpty()) {
            for(Object object0: ((TableRowItem)this.rows.get(0)).getCells()) {
                Integer integer0 = ((TableCellItem)object0).getColSpan();
                v += (integer0 == null ? 1 : ((int)integer0));
            }
        }
        return v;
    }

    @NotNull
    public final TablePosition getFocusedCellPosition() {
        return this.focusedCellPosition;
    }

    @Override  // com.kakao.keditor.plugin.attrs.item.RepresentativeImageProvider
    @NotNull
    public List getImageSrcList() {
        Iterable iterable0 = this.getTableImages();
        List list0 = new ArrayList(l.collectionSizeOrDefault(iterable0, 10));
        for(Object object0: iterable0) {
            list0.add(((TableImage)object0).getSrc());
        }
        return list0;
    }

    @Override  // com.kakao.keditor.plugin.attrs.item.RepresentativeImageProvider
    @Nullable
    public String getRepresentativeImage() {
        for(Object object0: this.getTableImages()) {
            if(((TableImage)object0).isRepresent()) {
                return ((TableImage)object0) == null ? null : ((TableImage)object0).getSrc();
            }
            if(false) {
                break;
            }
        }
        return null;
    }

    public final int getRepresentativeImageIndex() {
        List list0 = this.getTableImages();
        for(Object object0: list0) {
            if(((TableImage)object0).isRepresent()) {
                return CollectionsKt___CollectionsKt.indexOf(list0, object0);
            }
            if(false) {
                break;
            }
        }
        return CollectionsKt___CollectionsKt.indexOf(list0, null);
    }

    @NotNull
    public final List getRows() {
        return this.rows;
    }

    @Override  // com.kakao.keditor.plugin.itemspec.paragraph.TextItem
    public int getSelectionEnd() {
        return this.selectionEnd;
    }

    @Override  // com.kakao.keditor.plugin.itemspec.paragraph.TextItem
    public int getSelectionStart() {
        return this.selectionStart;
    }

    @NotNull
    public final TableStyle getStyle() {
        return this.style;
    }

    private final List getTableImages() {
        List list0 = new ArrayList();
        for(Object object0: this.rows) {
            for(Object object1: ((TableRowItem)object0).getCells()) {
                list0.addAll(((TableCellItem)object1).getImages());
            }
        }
        return list0;
    }

    @Override  // com.kakao.keditor.plugin.itemspec.paragraph.TextItem
    @NotNull
    public SpannableStringBuilder getText() {
        return this.text;
    }

    @Override  // com.kakao.keditor.plugin.attrs.item.HasExtraUploadable
    @NotNull
    public List getUploadables() {
        return this.getTableImages();
    }

    @Nullable
    public final String getWidthPercent() {
        return this.widthPercent;
    }

    @Override  // com.kakao.keditor.plugin.attrs.item.RepresentativeImageProvider
    public boolean hasImage(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "representativeImageSrc");
        Iterable iterable0 = this.getTableImages();
        if(!(iterable0 instanceof Collection) || !((Collection)iterable0).isEmpty()) {
            for(Object object0: iterable0) {
                if(Intrinsics.areEqual(((TableImage)object0).getSrc(), s)) {
                    return true;
                }
                if(false) {
                    break;
                }
            }
        }
        return false;
    }

    @Override  // com.kakao.keditor.plugin.itemspec.paragraph.TextItem, com.kakao.keditor.plugin.attrs.item.Aligned
    public void setAlignment(@NotNull Alignment alignment0) {
        Intrinsics.checkNotNullParameter(alignment0, "value");
        this.removeBypass("align");
        this.alignment = alignment0;
    }

    @Override  // com.kakao.keditor.KeditorItem
    public void setBypassStored(@NotNull Map map0) {
        Intrinsics.checkNotNullParameter(map0, "<set-?>");
        this.bypassStored = map0;
    }

    public final void setFocusedCellPosition(@NotNull TablePosition tablePosition0) {
        Intrinsics.checkNotNullParameter(tablePosition0, "<set-?>");
        this.focusedCellPosition = tablePosition0;
    }

    @Override  // com.kakao.keditor.plugin.attrs.item.RepresentativeImageProvider
    public void setRepresentativeImage(@NotNull String s) {
        Object object0 = null;
        Intrinsics.checkNotNullParameter(s, "representativeImage");
        for(Object object1: this.getTableImages()) {
            if(Intrinsics.areEqual(((TableImage)object1).getSrc(), s)) {
                object0 = object1;
                break;
            }
        }
        if(((TableImage)object0) != null) {
            ((TableImage)object0).setRepresent(true);
        }
    }

    public final void setRows(@NotNull List list0) {
        Intrinsics.checkNotNullParameter(list0, "<set-?>");
        this.rows = list0;
    }

    @Override  // com.kakao.keditor.plugin.itemspec.paragraph.TextItem
    public void setSelectionEnd(int v) {
        this.selectionEnd = v;
    }

    @Override  // com.kakao.keditor.plugin.itemspec.paragraph.TextItem
    public void setSelectionStart(int v) {
        this.selectionStart = v;
    }

    public final void setStyle(@NotNull TableStyle tableStyle0) {
        Intrinsics.checkNotNullParameter(tableStyle0, "value");
        this.removeBypass("style");
        this.style = tableStyle0;
    }

    @Override  // com.kakao.keditor.plugin.itemspec.paragraph.TextItem
    public void setText(@NotNull SpannableStringBuilder spannableStringBuilder0) {
        Intrinsics.checkNotNullParameter(spannableStringBuilder0, "<set-?>");
        this.text = spannableStringBuilder0;
    }

    public final void setWidthPercent(@Nullable String s) {
        this.widthPercent = s;
    }

    @Override
    @NotNull
    public String toString() {
        String s = this.widthPercent;
        List list0 = this.rows;
        StringBuilder stringBuilder0 = b.w("TableItem(alignment=", "alignAlignment", ", styleName=", this.style.getStyleName(), ", width=");
        stringBuilder0.append(s);
        stringBuilder0.append(", rows=");
        stringBuilder0.append(list0);
        stringBuilder0.append(")");
        return stringBuilder0.toString();
    }
}

