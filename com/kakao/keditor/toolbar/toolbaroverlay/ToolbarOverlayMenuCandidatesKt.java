package com.kakao.keditor.toolbar.toolbaroverlay;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001A\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000E\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\"\u001D\u0010\u0000\u001A\u000E\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\b\n\u0000\u001A\u0004\b\u0004\u0010\u0005\"\u001D\u0010\u0006\u001A\u000E\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\u0001¢\u0006\b\n\u0000\u001A\u0004\b\b\u0010\u0005¨\u0006\t"}, d2 = {"candidates", "", "", "Lcom/kakao/keditor/toolbar/toolbaroverlay/ToolbarOverlayMenuItem;", "getCandidates", "()Ljava/util/Map;", "extraCandidates", "Lcom/kakao/keditor/toolbar/toolbaroverlay/ExtraCandidateItem;", "getExtraCandidates", "keditor_release"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
public final class ToolbarOverlayMenuCandidatesKt {
    @NotNull
    private static final Map candidates;
    @NotNull
    private static final Map extraCandidates;

    static {
        ToolbarOverlayMenuCandidatesKt.candidates = new LinkedHashMap();
        ToolbarOverlayMenuCandidatesKt.extraCandidates = new LinkedHashMap();
    }

    @NotNull
    public static final Map getCandidates() {
        return ToolbarOverlayMenuCandidatesKt.candidates;
    }

    @NotNull
    public static final Map getExtraCandidates() {
        return ToolbarOverlayMenuCandidatesKt.extraCandidates;
    }
}

