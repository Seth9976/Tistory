package com.kakao.keditor.plugin.pluginspec.contentsearch;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import sd.a;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000F\b\u0002\u0012\u0006\u0010\u0002\u001A\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/kakao/keditor/plugin/pluginspec/contentsearch/ContentSearchPhase;", "", "host", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getHost", "()Ljava/lang/String;", "SANDBOX", "CBT", "PRODUCTION", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public enum ContentSearchPhase {
    SANDBOX("ke-cs-sandbox.devel.kakao.com"),
    CBT("ke-cs-cbt.devel.kakao.com"),
    PRODUCTION("ke-content-search.kakao.com");

    private static final EnumEntries $ENTRIES;
    private static final ContentSearchPhase[] $VALUES;
    @NotNull
    private final String host;

    private static final ContentSearchPhase[] $values() [...] // Inlined contents

    static {
        ContentSearchPhase.$VALUES = arr_contentSearchPhase;
        Intrinsics.checkNotNullParameter(arr_contentSearchPhase, "entries");
        ContentSearchPhase.$ENTRIES = new a(arr_contentSearchPhase);
    }

    private ContentSearchPhase(String s1) {
        this.host = s1;
    }

    @NotNull
    public static EnumEntries getEntries() {
        return ContentSearchPhase.$ENTRIES;
    }

    @NotNull
    public final String getHost() {
        return this.host;
    }
}

