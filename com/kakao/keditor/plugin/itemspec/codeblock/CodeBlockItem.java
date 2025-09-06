package com.kakao.keditor.plugin.itemspec.codeblock;

import com.kakao.keditor.KeditorItem;
import com.kakao.keditor.plugin.KeditorItemType;
import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

@KeditorItemType(type = "codeblock")
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000E\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\f\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\u000E\u0010\u0019\u001A\u00020\u00062\u0006\u0010\u001A\u001A\u00020\u0012J\u001C\u0010\u001B\u001A\u00020\u0012*\u00020\u00062\u0006\u0010\u001C\u001A\u00020\u001D2\u0006\u0010\u001A\u001A\u00020\u0012H\u0002R&\u0010\u0004\u001A\u000E\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0094\u000E¢\u0006\u000E\n\u0000\u001A\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000BR\u001A\u0010\f\u001A\u00020\u0006X\u0086\u000E¢\u0006\u000E\n\u0000\u001A\u0004\b\r\u0010\u000E\"\u0004\b\u000F\u0010\u0010R\u0011\u0010\u0011\u001A\u00020\u00128F¢\u0006\u0006\u001A\u0004\b\u0013\u0010\u0014R$\u0010\u0016\u001A\u00020\u00062\u0006\u0010\u0015\u001A\u00020\u0006@FX\u0086\u000E¢\u0006\u000E\n\u0000\u001A\u0004\b\u0017\u0010\u000E\"\u0004\b\u0018\u0010\u0010¨\u0006\u001E"}, d2 = {"Lcom/kakao/keditor/plugin/itemspec/codeblock/CodeBlockItem;", "Lcom/kakao/keditor/KeditorItem;", "Ljava/io/Serializable;", "()V", "bypassStored", "", "", "", "getBypassStored", "()Ljava/util/Map;", "setBypassStored", "(Ljava/util/Map;)V", "code", "getCode", "()Ljava/lang/String;", "setCode", "(Ljava/lang/String;)V", "codeLineCount", "", "getCodeLineCount", "()I", "value", "languageName", "getLanguageName", "setLanguageName", "codeUntilLine", "n", "nthIndexOf", "char", "", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nCodeBlockItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CodeBlockItem.kt\ncom/kakao/keditor/plugin/itemspec/codeblock/CodeBlockItem\n+ 2 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n*L\n1#1,43:1\n1099#2,3:44\n*S KotlinDebug\n*F\n+ 1 CodeBlockItem.kt\ncom/kakao/keditor/plugin/itemspec/codeblock/CodeBlockItem\n*L\n23#1:44,3\n*E\n"})
public final class CodeBlockItem extends KeditorItem implements Serializable {
    @NotNull
    private Map bypassStored;
    @NotNull
    private String code;
    @NotNull
    private String languageName;

    public CodeBlockItem() {
        this.bypassStored = new LinkedHashMap();
        this.code = "";
        this.languageName = "";
    }

    @NotNull
    public final String codeUntilLine(int v) {
        int v1 = this.nthIndexOf(this.code, '\n', v);
        if(v1 >= 0 && v1 <= StringsKt__StringsKt.getLastIndex(this.code)) {
            String s = this.code.substring(0, v1);
            Intrinsics.checkNotNullExpressionValue(s, "substring(...)");
            return s;
        }
        return this.code;
    }

    @Override  // com.kakao.keditor.KeditorItem
    @NotNull
    public Map getBypassStored() {
        return this.bypassStored;
    }

    @NotNull
    public final String getCode() {
        return this.code;
    }

    public final int getCodeLineCount() {
        String s = this.code;
        int v1 = 0;
        for(int v = 0; v < s.length(); ++v) {
            if(s.charAt(v) == 10) {
                ++v1;
            }
        }
        return v1 + 1;
    }

    @NotNull
    public final String getLanguageName() {
        return this.languageName;
    }

    private final int nthIndexOf(String s, char c, int v) {
        int v2 = 0;
        for(int v1 = 0; v1 < v && v2 != -1; ++v1) {
            if(v2 < StringsKt__StringsKt.getLastIndex(s)) {
                v2 = StringsKt__StringsKt.indexOf$default(s, c, v2 + 1, false, 4, null);
            }
        }
        return v2;
    }

    @Override  // com.kakao.keditor.KeditorItem
    public void setBypassStored(@NotNull Map map0) {
        Intrinsics.checkNotNullParameter(map0, "<set-?>");
        this.bypassStored = map0;
    }

    public final void setCode(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "<set-?>");
        this.code = s;
    }

    public final void setLanguageName(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "value");
        this.removeBypass("language");
        this.languageName = s;
    }
}

