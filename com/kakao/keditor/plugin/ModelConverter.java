package com.kakao.keditor.plugin;

import android.content.Context;
import com.kakao.keditor.KeditorItem;
import com.kakao.keditor.cdm.CDM.Item;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003J\u0010\u0010\u0004\u001A\u00020\u00052\u0006\u0010\u0006\u001A\u00020\u0007H&J\u0010\u0010\b\u001A\u00020\u00072\u0006\u0010\u0006\u001A\u00020\u0002H&J\u001D\u0010\t\u001A\u00028\u00002\u0006\u0010\n\u001A\u00020\u000B2\u0006\u0010\u0006\u001A\u00020\u0007H&¢\u0006\u0002\u0010\f¨\u0006\r"}, d2 = {"Lcom/kakao/keditor/plugin/ModelConverter;", "T", "Lcom/kakao/keditor/KeditorItem;", "", "isSupport", "", "item", "Lcom/kakao/keditor/cdm/CDM$Item;", "toCdmItem", "toKeditorItem", "context", "Landroid/content/Context;", "(Landroid/content/Context;Lcom/kakao/keditor/cdm/CDM$Item;)Lcom/kakao/keditor/KeditorItem;", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public interface ModelConverter {
    boolean isSupport(@NotNull Item arg1);

    @NotNull
    Item toCdmItem(@NotNull KeditorItem arg1);

    @NotNull
    KeditorItem toKeditorItem(@NotNull Context arg1, @NotNull Item arg2);
}

