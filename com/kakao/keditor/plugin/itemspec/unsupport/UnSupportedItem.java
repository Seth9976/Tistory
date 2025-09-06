package com.kakao.keditor.plugin.itemspec.unsupport;

import com.kakao.keditor.KeditorItem;
import com.kakao.keditor.cdm.CDM.Item;
import com.kakao.keditor.plugin.KeditorItemType;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@KeditorItemType(type = "unsupported")
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000E\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0002\u001A\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u000B\u001A\u00020\fH\u0016R\u0013\u0010\u0002\u001A\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001A\u00020\b8F¢\u0006\u0006\u001A\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lcom/kakao/keditor/plugin/itemspec/unsupport/UnSupportedItem;", "Lcom/kakao/keditor/KeditorItem;", "item", "Lcom/kakao/keditor/cdm/CDM$Item;", "(Lcom/kakao/keditor/cdm/CDM$Item;)V", "getItem", "()Lcom/kakao/keditor/cdm/CDM$Item;", "unSupportedType", "Lcom/kakao/keditor/plugin/itemspec/unsupport/UnSupportedType;", "getUnSupportedType", "()Lcom/kakao/keditor/plugin/itemspec/unsupport/UnSupportedType;", "toString", "", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class UnSupportedItem extends KeditorItem {
    @Nullable
    private final Item item;

    public UnSupportedItem() {
        this(null, 1, null);
    }

    public UnSupportedItem(@Nullable Item cDM$Item0) {
        this.item = cDM$Item0;
    }

    public UnSupportedItem(Item cDM$Item0, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v & 1) != 0) {
            cDM$Item0 = null;
        }
        this(cDM$Item0);
    }

    @Nullable
    public final Item getItem() {
        return this.item;
    }

    @NotNull
    public final UnSupportedType getUnSupportedType() {
        return this.item == null ? UnSupportedType.Companion.byType(null) : UnSupportedType.Companion.byType(this.item.getType());
    }

    @Override
    @NotNull
    public String toString() {
        return "UnSupportedItem(item=" + this.item + ")";
    }
}

