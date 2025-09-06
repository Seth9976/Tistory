package com.kakao.keditor.plugin.itemspec.table;

import android.content.Context;
import android.text.SpannableStringBuilder;
import com.kakao.keditor.KeditorItem;
import com.kakao.keditor.cdm.CDM.Item;
import com.kakao.keditor.plugin.KeditorItemType;
import com.kakao.keditor.plugin.attrs.Alignment;
import com.kakao.keditor.plugin.attrs.AlignmentType.Text;
import com.kakao.keditor.plugin.attrs.text.spans.KeImageSpan;
import com.kakao.keditor.plugin.itemspec.ChildItemSpec;
import com.kakao.keditor.plugin.itemspec.ItemValidatorKt;
import com.kakao.keditor.plugin.itemspec.paragraph.span.SpannableParser;
import com.kakao.keditor.plugin.itemspec.paragraph.span.SpannableToCDM;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.x;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.n;
import kotlin.text.p;
import org.jetbrains.annotations.NotNull;

@KeditorItemType(type = "tableCell")
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000E\n\u0002\u0010\u0000\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0010\u0010\t\u001A\u00020\n2\u0006\u0010\u000B\u001A\u00020\u0002H\u0014J,\u0010\f\u001A\u00020\u00022\u0006\u0010\r\u001A\u00020\u000E2\u0006\u0010\u000B\u001A\u00020\n2\u0012\u0010\u000F\u001A\u000E\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u0010H\u0014R\u001A\u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001A\u0004\b\u0007\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/kakao/keditor/plugin/itemspec/table/TableCellItemSpec;", "Lcom/kakao/keditor/plugin/itemspec/ChildItemSpec;", "Lcom/kakao/keditor/plugin/itemspec/table/TableCellItem;", "()V", "childValidators", "", "Lcom/kakao/keditor/plugin/itemspec/ItemValidator;", "getChildValidators", "()Ljava/util/Set;", "toCdmItem", "Lcom/kakao/keditor/cdm/CDM$Item;", "item", "toKeditorItem", "context", "Landroid/content/Context;", "attr", "", "", "", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class TableCellItemSpec extends ChildItemSpec {
    @NotNull
    public static final TableCellItemSpec INSTANCE;
    @NotNull
    private static final Set childValidators;

    static {
        TableCellItemSpec.INSTANCE = new TableCellItemSpec();
        TableCellItemSpec.childValidators = ItemValidatorKt.getTEXT_ITEMS_VALIDATOR();
    }

    @Override  // com.kakao.keditor.plugin.itemspec.ItemSpec
    @NotNull
    public Set getChildValidators() {
        return TableCellItemSpec.childValidators;
    }

    @Override  // com.kakao.keditor.plugin.itemspec.ModelConverter
    public Item toCdmItem(KeditorItem keditorItem0) {
        return this.toCdmItem(((TableCellItem)keditorItem0));
    }

    @NotNull
    public Item toCdmItem(@NotNull TableCellItem tableCellItem0) {
        Intrinsics.checkNotNullParameter(tableCellItem0, "item");
        Map map0 = x.mutableMapOf(new Pair[]{TuplesKt.to("width", (tableCellItem0.getWidthPercent() == null ? "" : tableCellItem0.getWidthPercent() + "%")), TuplesKt.to("height", tableCellItem0.getHeight())});
        Integer integer0 = tableCellItem0.getColSpan();
        if(integer0 != null) {
            map0.put("colspan", integer0.intValue());
        }
        Integer integer1 = tableCellItem0.getRowSpan();
        if(integer1 != null) {
            map0.put("rowspan", integer1.intValue());
        }
        map0.put("textAlign", "alignment");
        Item cDM$Item0 = new Item("tableCell", map0, null, 4, null);
        SpannableToCDM.INSTANCE.generate(cDM$Item0, tableCellItem0.getText());
        return cDM$Item0;
    }

    @Override  // com.kakao.keditor.plugin.itemspec.ModelConverter
    public KeditorItem toKeditorItem(Context context0, Item cDM$Item0, Map map0) {
        return this.toKeditorItem(context0, cDM$Item0, map0);
    }

    @NotNull
    public TableCellItem toKeditorItem(@NotNull Context context0, @NotNull Item cDM$Item0, @NotNull Map map0) {
        String s2;
        Double double0;
        Intrinsics.checkNotNullParameter(context0, "context");
        Intrinsics.checkNotNullParameter(cDM$Item0, "item");
        Intrinsics.checkNotNullParameter(map0, "attr");
        TableCellItem tableCellItem0 = new TableCellItem();
        SpannableStringBuilder spannableStringBuilder0 = SpannableParser.INSTANCE.parseTextModel(context0, cDM$Item0);
        tableCellItem0.setText(spannableStringBuilder0);
        Object[] arr_object = spannableStringBuilder0.getSpans(0, spannableStringBuilder0.length(), KeImageSpan.class);
        Intrinsics.checkNotNullExpressionValue(arr_object, "getSpans(...)");
        for(int v = 0; v < ((KeImageSpan[])arr_object).length; ++v) {
            tableCellItem0.getImages().add(new TableImage(((KeImageSpan[])arr_object)[v].getImageAttr()));
        }
        Object object0 = ItemValidatorKt.pop$default(map0, "width", false, 2, null);
        if(object0 == null) {
            double0 = null;
        }
        else {
            String s = object0.toString();
            if(s == null) {
                double0 = null;
            }
            else {
                String s1 = p.replace$default(s, "%", "", false, 4, null);
                double0 = s1 == null ? null : n.toDoubleOrNull(s1);
            }
        }
        tableCellItem0.setWidthPercent(double0);
        Object object1 = ItemValidatorKt.pop$default(map0, "height", false, 2, null);
        if(object1 == null) {
            s2 = "";
        }
        else {
            s2 = object1.toString();
            if(s2 == null) {
                s2 = "";
            }
        }
        tableCellItem0.setHeight(s2);
        Object object2 = ItemValidatorKt.pop$default(map0, "colspan", false, 2, null);
        Number number0 = object2 instanceof Number ? ((Number)object2) : null;
        tableCellItem0.setColSpan((number0 == null ? null : number0.intValue()));
        Object object3 = ItemValidatorKt.pop$default(map0, "rowspan", false, 2, null);
        Number number1 = object3 instanceof Number ? ((Number)object3) : null;
        tableCellItem0.setRowSpan((number1 == null ? null : number1.intValue()));
        String s3 = String.valueOf(ItemValidatorKt.pop$default(map0, "textAlign", false, 2, null));
        tableCellItem0.setAlignment(Alignment.Companion.byNameText(s3, Text.INSTANCE));
        return tableCellItem0;
    }
}

