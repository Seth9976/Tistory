package com.kakao.keditor.plugin.itemspec.contentsearch;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import sd.a;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000E\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u0000 \u000F2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000FB\u000F\b\u0002\u0012\u0006\u0010\u0002\u001A\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000Bj\u0002\b\fj\u0002\b\rj\u0002\b\u000E¨\u0006\u0010"}, d2 = {"Lcom/kakao/keditor/plugin/itemspec/contentsearch/ContentSearchType;", "", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "MUSIC", "VIDEO", "MOVIE", "BOOK", "TV", "PLAY", "EXHIBITION", "PERSON", "Companion", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public enum ContentSearchType {
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\f\u0010\u0003\u001A\b\u0012\u0004\u0012\u00020\u00050\u0004¨\u0006\u0006"}, d2 = {"Lcom/kakao/keditor/plugin/itemspec/contentsearch/ContentSearchType$Companion;", "", "()V", "all", "", "Lcom/kakao/keditor/plugin/itemspec/contentsearch/ContentSearchType;", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Companion {
        private Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        @NotNull
        public final List all() {
            return ArraysKt___ArraysKt.toList(ContentSearchType.values());
        }
    }

    MUSIC("music"),
    VIDEO("video"),
    MOVIE("movie"),
    BOOK("book"),
    TV("tv"),
    PLAY("play"),
    EXHIBITION("exhibition"),
    PERSON("person");

    private static final EnumEntries $ENTRIES;
    private static final ContentSearchType[] $VALUES;
    @NotNull
    public static final Companion Companion;
    @NotNull
    private final String value;

    private static final ContentSearchType[] $values() [...] // Inlined contents

    static {
        ContentSearchType.$VALUES = arr_contentSearchType;
        Intrinsics.checkNotNullParameter(arr_contentSearchType, "entries");
        ContentSearchType.$ENTRIES = new a(arr_contentSearchType);
        ContentSearchType.Companion = new Companion(null);
    }

    private ContentSearchType(String s1) {
        this.value = s1;
    }

    @NotNull
    public static EnumEntries getEntries() {
        return ContentSearchType.$ENTRIES;
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }
}

