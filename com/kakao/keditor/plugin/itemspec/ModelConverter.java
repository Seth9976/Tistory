package com.kakao.keditor.plugin.itemspec;

import android.content.Context;
import com.kakao.keditor.KeditorItem;
import com.kakao.keditor.cdm.CDM.Item;
import com.kakao.keditor.exception.NotMatchedModelException;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.x;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010%\n\u0002\u0010\u000E\n\u0002\b\u0002\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003B\u0005¢\u0006\u0002\u0010\u0004J\u000E\u0010\u0005\u001A\u00020\u00062\u0006\u0010\u0007\u001A\u00020\u0002J\u001B\u0010\b\u001A\u00028\u00002\u0006\u0010\t\u001A\u00020\n2\u0006\u0010\u0007\u001A\u00020\u0006¢\u0006\u0002\u0010\u000BJ\n\u0010\f\u001A\u0004\u0018\u00010\u0002H\u0016J\u0015\u0010\r\u001A\u00020\u00062\u0006\u0010\u0007\u001A\u00028\u0000H$¢\u0006\u0002\u0010\u000EJ1\u0010\u000F\u001A\u00028\u00002\u0006\u0010\t\u001A\u00020\n2\u0006\u0010\u0007\u001A\u00020\u00062\u0012\u0010\u0010\u001A\u000E\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00030\u0011H$¢\u0006\u0002\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/kakao/keditor/plugin/itemspec/ModelConverter;", "T", "Lcom/kakao/keditor/KeditorItem;", "", "()V", "convertToCdmItem", "Lcom/kakao/keditor/cdm/CDM$Item;", "item", "convertToKeditorItem", "context", "Landroid/content/Context;", "(Landroid/content/Context;Lcom/kakao/keditor/cdm/CDM$Item;)Lcom/kakao/keditor/KeditorItem;", "createKeditorItem", "toCdmItem", "(Lcom/kakao/keditor/KeditorItem;)Lcom/kakao/keditor/cdm/CDM$Item;", "toKeditorItem", "attr", "", "", "(Landroid/content/Context;Lcom/kakao/keditor/cdm/CDM$Item;Ljava/util/Map;)Lcom/kakao/keditor/KeditorItem;", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public abstract class ModelConverter {
    @NotNull
    public final Item convertToCdmItem(@NotNull KeditorItem keditorItem0) throws NotMatchedModelException, ClassCastException {
        Intrinsics.checkNotNullParameter(keditorItem0, "item");
        if(keditorItem0 == null) {
            throw new NotMatchedModelException();
        }
        Item cDM$Item0 = this.toCdmItem(keditorItem0);
        Map map0 = cDM$Item0.getAttribute();
        if(map0 == null) {
            map0 = x.emptyMap();
        }
        Map map1 = x.toMutableMap(map0);
        map1.putAll(keditorItem0.getBypassMap());
        cDM$Item0.setAttribute(map1);
        return cDM$Item0;
    }

    @NotNull
    public final KeditorItem convertToKeditorItem(@NotNull Context context0, @NotNull Item cDM$Item0) throws NotMatchedModelException {
        Map map1;
        Intrinsics.checkNotNullParameter(context0, "context");
        Intrinsics.checkNotNullParameter(cDM$Item0, "item");
        Map map0 = cDM$Item0.getAttribute();
        if(map0 == null) {
            map1 = new LinkedHashMap();
        }
        else {
            map1 = x.toMutableMap(map0);
            if(map1 == null) {
                map1 = new LinkedHashMap();
            }
        }
        KeditorItem keditorItem0 = this.toKeditorItem(context0, cDM$Item0, map1);
        keditorItem0.setBypassMap(map1);
        return keditorItem0;
    }

    @Nullable
    public KeditorItem createKeditorItem() {
        return null;
    }

    @NotNull
    public abstract Item toCdmItem(@NotNull KeditorItem arg1);

    @NotNull
    public abstract KeditorItem toKeditorItem(@NotNull Context arg1, @NotNull Item arg2, @NotNull Map arg3) throws NotMatchedModelException;
}

