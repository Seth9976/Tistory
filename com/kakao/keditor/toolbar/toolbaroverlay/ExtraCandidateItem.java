package com.kakao.keditor.toolbar.toolbaroverlay;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000E\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001B\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\f\u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\f\u001A\u00020\u0003HÆ\u0003J\u000F\u0010\r\u001A\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000E\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\u000E\b\u0002\u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u000F\u001A\u00020\u00102\b\u0010\u0011\u001A\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001A\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001A\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\b\u0010\tR\u0017\u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001A\u0004\b\n\u0010\u000B¨\u0006\u0016"}, d2 = {"Lcom/kakao/keditor/toolbar/toolbaroverlay/ExtraCandidateItem;", "", "menu", "Lcom/kakao/keditor/toolbar/toolbaroverlay/ToolbarOverlayMenuItem;", "onClickAction", "Lkotlin/Function0;", "", "(Lcom/kakao/keditor/toolbar/toolbaroverlay/ToolbarOverlayMenuItem;Lkotlin/jvm/functions/Function0;)V", "getMenu", "()Lcom/kakao/keditor/toolbar/toolbaroverlay/ToolbarOverlayMenuItem;", "getOnClickAction", "()Lkotlin/jvm/functions/Function0;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class ExtraCandidateItem {
    @NotNull
    private final ToolbarOverlayMenuItem menu;
    @NotNull
    private final Function0 onClickAction;

    public ExtraCandidateItem(@NotNull ToolbarOverlayMenuItem toolbarOverlayMenuItem0, @NotNull Function0 function00) {
        Intrinsics.checkNotNullParameter(toolbarOverlayMenuItem0, "menu");
        Intrinsics.checkNotNullParameter(function00, "onClickAction");
        super();
        this.menu = toolbarOverlayMenuItem0;
        this.onClickAction = function00;
    }

    @NotNull
    public final ToolbarOverlayMenuItem component1() {
        return this.menu;
    }

    @NotNull
    public final Function0 component2() {
        return this.onClickAction;
    }

    @NotNull
    public final ExtraCandidateItem copy(@NotNull ToolbarOverlayMenuItem toolbarOverlayMenuItem0, @NotNull Function0 function00) {
        Intrinsics.checkNotNullParameter(toolbarOverlayMenuItem0, "menu");
        Intrinsics.checkNotNullParameter(function00, "onClickAction");
        return new ExtraCandidateItem(toolbarOverlayMenuItem0, function00);
    }

    public static ExtraCandidateItem copy$default(ExtraCandidateItem extraCandidateItem0, ToolbarOverlayMenuItem toolbarOverlayMenuItem0, Function0 function00, int v, Object object0) {
        if((v & 1) != 0) {
            toolbarOverlayMenuItem0 = extraCandidateItem0.menu;
        }
        if((v & 2) != 0) {
            function00 = extraCandidateItem0.onClickAction;
        }
        return extraCandidateItem0.copy(toolbarOverlayMenuItem0, function00);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof ExtraCandidateItem)) {
            return false;
        }
        return Intrinsics.areEqual(this.menu, ((ExtraCandidateItem)object0).menu) ? Intrinsics.areEqual(this.onClickAction, ((ExtraCandidateItem)object0).onClickAction) : false;
    }

    @NotNull
    public final ToolbarOverlayMenuItem getMenu() {
        return this.menu;
    }

    @NotNull
    public final Function0 getOnClickAction() {
        return this.onClickAction;
    }

    @Override
    public int hashCode() {
        return this.onClickAction.hashCode() + this.menu.hashCode() * 0x1F;
    }

    @Override
    @NotNull
    public String toString() {
        return "ExtraCandidateItem(menu=" + this.menu + ", onClickAction=" + this.onClickAction + ")";
    }
}

