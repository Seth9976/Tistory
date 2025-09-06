package com.kakao.keditor.plugin.itemspec.paragraph.request;

import android.graphics.Typeface;
import com.kakao.keditor.request.RenderingRequest;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001A\u00020\u0005¢\u0006\b\n\u0000\u001A\u0004\b\t\u0010\n¨\u0006\u000B"}, d2 = {"Lcom/kakao/keditor/plugin/itemspec/paragraph/request/SetFont;", "Lcom/kakao/keditor/request/RenderingRequest;", "familyName", "", "typeFace", "Landroid/graphics/Typeface;", "(Ljava/lang/String;Landroid/graphics/Typeface;)V", "getFamilyName", "()Ljava/lang/String;", "getTypeFace", "()Landroid/graphics/Typeface;", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class SetFont extends RenderingRequest {
    @NotNull
    private final String familyName;
    @NotNull
    private final Typeface typeFace;

    public SetFont(@NotNull String s, @NotNull Typeface typeface0) {
        Intrinsics.checkNotNullParameter(s, "familyName");
        Intrinsics.checkNotNullParameter(typeface0, "typeFace");
        super();
        this.familyName = s;
        this.typeFace = typeface0;
    }

    @NotNull
    public final String getFamilyName() {
        return this.familyName;
    }

    @NotNull
    public final Typeface getTypeFace() {
        return this.typeFace;
    }
}

