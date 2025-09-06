package com.kakao.editortracker;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import sd.a;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000E\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bR\u0017\u0010\u0007\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001A\u0004\b\u0005\u0010\u0006j\u0002\b\tj\u0002\b\n¨\u0006\u000B"}, d2 = {"Lcom/kakao/editortracker/EditorTrackDomain;", "", "", "a", "Ljava/lang/String;", "getUrl", "()Ljava/lang/String;", "url", "Companion", "DEV", "PRODUCTION", "editortracker_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public enum EditorTrackDomain {
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0015\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/kakao/editortracker/EditorTrackDomain$Companion;", "", "", "debug", "Lcom/kakao/editortracker/EditorTrackDomain;", "from", "(Z)Lcom/kakao/editortracker/EditorTrackDomain;", "editortracker_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        // 去混淆评级： 低(20)
        @NotNull
        public final EditorTrackDomain from(boolean z) {
            return z ? EditorTrackDomain.DEV : EditorTrackDomain.PRODUCTION;
        }
    }

    DEV("https://kelog.devel.kakao.com/api/event"),
    PRODUCTION("https://kelog.kakao.com/api/event");

    @NotNull
    public static final Companion Companion;
    public final String a;
    public static final EditorTrackDomain[] b;
    public static final EnumEntries c;

    static {
        EditorTrackDomain.b = arr_editorTrackDomain;
        Intrinsics.checkNotNullParameter(arr_editorTrackDomain, "entries");
        EditorTrackDomain.c = new a(arr_editorTrackDomain);
        EditorTrackDomain.Companion = new Companion(null);
    }

    public EditorTrackDomain(String s1) {
        this.a = s1;
    }

    @NotNull
    public static EnumEntries getEntries() {
        return EditorTrackDomain.c;
    }

    @NotNull
    public final String getUrl() {
        return this.a;
    }
}

