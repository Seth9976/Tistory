package com.kakao.keditor.plugin.itemspec.table;

import android.content.Context;
import com.kakao.keditor.KeditorItem;
import com.kakao.keditor.cdm.CDM.Item;
import com.kakao.keditor.exception.NotMatchedModelException;
import com.kakao.keditor.plugin.KeditorItemType;
import com.kakao.keditor.plugin.itemspec.ChildItemSpec;
import com.kakao.keditor.plugin.itemspec.ItemValidatorKt;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.e0;
import kotlin.collections.l;
import kotlin.collections.x;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@KeditorItemType(type = "tableRow")
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000E\n\u0002\u0010\u0000\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0010\u0010\t\u001A\u00020\n2\u0006\u0010\u000B\u001A\u00020\u0002H\u0014J,\u0010\f\u001A\u00020\u00022\u0006\u0010\r\u001A\u00020\u000E2\u0006\u0010\u000B\u001A\u00020\n2\u0012\u0010\u000F\u001A\u000E\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u0010H\u0014R\u001A\u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001A\u0004\b\u0007\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/kakao/keditor/plugin/itemspec/table/TableRowItemSpec;", "Lcom/kakao/keditor/plugin/itemspec/ChildItemSpec;", "Lcom/kakao/keditor/plugin/itemspec/table/TableRowItem;", "()V", "childValidators", "", "Lcom/kakao/keditor/plugin/itemspec/ItemValidator;", "getChildValidators", "()Ljava/util/Set;", "toCdmItem", "Lcom/kakao/keditor/cdm/CDM$Item;", "item", "toKeditorItem", "context", "Landroid/content/Context;", "attr", "", "", "", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nTableRowItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TableRowItem.kt\ncom/kakao/keditor/plugin/itemspec/table/TableRowItemSpec\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,51:1\n1#2:52\n1855#3,2:53\n1549#3:55\n1620#3,3:56\n*S KotlinDebug\n*F\n+ 1 TableRowItem.kt\ncom/kakao/keditor/plugin/itemspec/table/TableRowItemSpec\n*L\n24#1:53,2\n37#1:55\n37#1:56,3\n*E\n"})
public final class TableRowItemSpec extends ChildItemSpec {
    @NotNull
    public static final TableRowItemSpec INSTANCE;
    @NotNull
    private static final Set childValidators;

    static {
        TableRowItemSpec.INSTANCE = new TableRowItemSpec();
        TableRowItemSpec.childValidators = e0.setOf(TableCellItemSpec.INSTANCE);
    }

    @Override  // com.kakao.keditor.plugin.itemspec.ItemSpec
    @NotNull
    public Set getChildValidators() {
        return TableRowItemSpec.childValidators;
    }

    @Override  // com.kakao.keditor.plugin.itemspec.ModelConverter
    public Item toCdmItem(KeditorItem keditorItem0) {
        return this.toCdmItem(((TableRowItem)keditorItem0));
    }

    @NotNull
    public Item toCdmItem(@NotNull TableRowItem tableRowItem0) {
        Intrinsics.checkNotNullParameter(tableRowItem0, "item");
        Item cDM$Item0 = new Item("tableRow", x.mutableMapOf(new Pair[]{TuplesKt.to("height", tableRowItem0.getHeight())}), null, 4, null);
        Iterable iterable0 = tableRowItem0.getCells();
        ArrayList arrayList0 = new ArrayList(l.collectionSizeOrDefault(iterable0, 10));
        for(Object object0: iterable0) {
            arrayList0.add(TableCellItemSpec.INSTANCE.convertToCdmItem(((TableCellItem)object0)));
        }
        cDM$Item0.setChildren(CollectionsKt___CollectionsKt.toMutableList(arrayList0));
        return cDM$Item0;
    }

    @Override  // com.kakao.keditor.plugin.itemspec.ModelConverter
    public KeditorItem toKeditorItem(Context context0, Item cDM$Item0, Map map0) {
        return this.toKeditorItem(context0, cDM$Item0, map0);
    }

    @NotNull
    public TableRowItem toKeditorItem(@NotNull Context context0, @NotNull Item cDM$Item0, @NotNull Map map0) {
        Intrinsics.checkNotNullParameter(context0, "context");
        Intrinsics.checkNotNullParameter(cDM$Item0, "item");
        Intrinsics.checkNotNullParameter(map0, "attr");
        TableRowItem tableRowItem0 = new TableRowItem();
        Object object0 = ItemValidatorKt.pop$default(map0, "height", false, 2, null);
        if(object0 != null) {
            tableRowItem0.setHeight(object0.toString());
        }
        List list0 = cDM$Item0.getChildren();
        if(list0 != null) {
            for(Object object1: list0) {
                KeditorItem keditorItem0 = TableCellItemSpec.INSTANCE.convertToKeditorItem(context0, ((Item)object1));
                TableCellItem tableCellItem0 = keditorItem0 instanceof TableCellItem ? ((TableCellItem)keditorItem0) : null;
                if(tableCellItem0 == null) {
                    throw new NotMatchedModelException();
                }
                tableRowItem0.getCells().add(tableCellItem0);
            }
        }
        return tableRowItem0;
    }
}

