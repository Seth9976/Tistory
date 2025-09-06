package com.kakao.keditor.plugin.itemspec.textlist;

import android.content.Context;
import android.text.SpannableStringBuilder;
import com.kakao.keditor.KeditorItem;
import com.kakao.keditor.cdm.CDM.Item;
import com.kakao.keditor.plugin.KeditorItemType;
import com.kakao.keditor.plugin.itemspec.ChildItemSpec;
import com.kakao.keditor.plugin.itemspec.ItemValidatorKt;
import com.kakao.keditor.plugin.itemspec.paragraph.span.SpannableParser;
import com.kakao.keditor.plugin.itemspec.paragraph.span.SpannableToCDM;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@KeditorItemType(type = "listItem")
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000E\n\u0002\u0010\u0000\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0010\u0010\t\u001A\u00020\n2\u0006\u0010\u000B\u001A\u00020\u0002H\u0014J,\u0010\f\u001A\u00020\u00022\u0006\u0010\r\u001A\u00020\u000E2\u0006\u0010\u000B\u001A\u00020\n2\u0012\u0010\u000F\u001A\u000E\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u0010H\u0014R\u001A\u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001A\u0004\b\u0007\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/kakao/keditor/plugin/itemspec/textlist/TextListItemContentSpec;", "Lcom/kakao/keditor/plugin/itemspec/ChildItemSpec;", "Lcom/kakao/keditor/plugin/itemspec/textlist/TextListItemContent;", "()V", "childValidators", "", "Lcom/kakao/keditor/plugin/itemspec/ItemValidator;", "getChildValidators", "()Ljava/util/Set;", "toCdmItem", "Lcom/kakao/keditor/cdm/CDM$Item;", "item", "toKeditorItem", "context", "Landroid/content/Context;", "attr", "", "", "", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class TextListItemContentSpec extends ChildItemSpec {
    @NotNull
    public static final TextListItemContentSpec INSTANCE;
    @NotNull
    private static final Set childValidators;

    static {
        TextListItemContentSpec.INSTANCE = new TextListItemContentSpec();
        TextListItemContentSpec.childValidators = ItemValidatorKt.getTEXT_ITEMS_VALIDATOR();
    }

    @Override  // com.kakao.keditor.plugin.itemspec.ItemSpec
    @NotNull
    public Set getChildValidators() {
        return TextListItemContentSpec.childValidators;
    }

    @Override  // com.kakao.keditor.plugin.itemspec.ModelConverter
    public Item toCdmItem(KeditorItem keditorItem0) {
        return this.toCdmItem(((TextListItemContent)keditorItem0));
    }

    @NotNull
    public Item toCdmItem(@NotNull TextListItemContent textListItemContent0) {
        Intrinsics.checkNotNullParameter(textListItemContent0, "item");
        Item cDM$Item0 = new Item("listItem", null, null, 6, null);
        SpannableStringBuilder spannableStringBuilder0 = textListItemContent0.getText();
        SpannableToCDM.INSTANCE.generate(cDM$Item0, spannableStringBuilder0);
        return cDM$Item0;
    }

    @Override  // com.kakao.keditor.plugin.itemspec.ModelConverter
    public KeditorItem toKeditorItem(Context context0, Item cDM$Item0, Map map0) {
        return this.toKeditorItem(context0, cDM$Item0, map0);
    }

    @NotNull
    public TextListItemContent toKeditorItem(@NotNull Context context0, @NotNull Item cDM$Item0, @NotNull Map map0) {
        Intrinsics.checkNotNullParameter(context0, "context");
        Intrinsics.checkNotNullParameter(cDM$Item0, "item");
        Intrinsics.checkNotNullParameter(map0, "attr");
        return new TextListItemContent(SpannableParser.INSTANCE.parseTextModel(context0, cDM$Item0), null, null, 6, null);
    }
}

