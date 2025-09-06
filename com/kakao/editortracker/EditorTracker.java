package com.kakao.editortracker;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J!\u0010\u0002\u001A\u00020\u00032\u0017\u0010\u0004\u001A\u0013\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0002\b\u0007H&J+\u0010\u0002\u001A\u00020\u00032\b\u0010\b\u001A\u0004\u0018\u00010\t2\u0017\u0010\u0004\u001A\u0013\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0002\b\u0007H&J!\u0010\n\u001A\u00020\u00032\u0017\u0010\u000B\u001A\u0013\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0002\b\u0007H&J\u0010\u0010\n\u001A\u00020\u00032\u0006\u0010\b\u001A\u00020\tH&¨\u0006\r"}, d2 = {"Lcom/kakao/editortracker/EditorTracker;", "", "click", "", "clickBuilder", "Lkotlin/Function1;", "Lcom/kakao/editortracker/data/Action;", "Lkotlin/ExtensionFunctionType;", "editorVersion", "", "load", "editorBuilder", "Lcom/kakao/editortracker/data/EditorInfo;", "editortracker_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public interface EditorTracker {
    void click(@Nullable String arg1, @NotNull Function1 arg2);

    void click(@NotNull Function1 arg1);

    void load(@NotNull String arg1);

    void load(@NotNull Function1 arg1);
}

