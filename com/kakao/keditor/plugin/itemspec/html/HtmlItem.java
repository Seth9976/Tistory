package com.kakao.keditor.plugin.itemspec.html;

import com.kakao.keditor.KeditorItem;
import com.kakao.keditor.plugin.KeditorItemType;
import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@KeditorItemType(type = "html")
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000E\n\u0002\u0010\u0000\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003R&\u0010\u0004\u001A\u000E\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0094\u000E¢\u0006\u000E\n\u0000\u001A\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000BR\u001A\u0010\f\u001A\u00020\u0006X\u0086\u000E¢\u0006\u000E\n\u0000\u001A\u0004\b\r\u0010\u000E\"\u0004\b\u000F\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/kakao/keditor/plugin/itemspec/html/HtmlItem;", "Lcom/kakao/keditor/KeditorItem;", "Ljava/io/Serializable;", "()V", "bypassStored", "", "", "", "getBypassStored", "()Ljava/util/Map;", "setBypassStored", "(Ljava/util/Map;)V", "source", "getSource", "()Ljava/lang/String;", "setSource", "(Ljava/lang/String;)V", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class HtmlItem extends KeditorItem implements Serializable {
    @NotNull
    private Map bypassStored;
    @NotNull
    private String source;

    public HtmlItem() {
        this.bypassStored = new LinkedHashMap();
        this.source = "";
    }

    @Override  // com.kakao.keditor.KeditorItem
    @NotNull
    public Map getBypassStored() {
        return this.bypassStored;
    }

    @NotNull
    public final String getSource() {
        return this.source;
    }

    @Override  // com.kakao.keditor.KeditorItem
    public void setBypassStored(@NotNull Map map0) {
        Intrinsics.checkNotNullParameter(map0, "<set-?>");
        this.bypassStored = map0;
    }

    public final void setSource(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "<set-?>");
        this.source = s;
    }
}

