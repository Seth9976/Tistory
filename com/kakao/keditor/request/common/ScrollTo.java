package com.kakao.keditor.request.common;

import com.kakao.keditor.KeditorItem;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.q;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r0.a;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001A\u00020\u0005\u0012\u0010\b\u0002\u0010\u0006\u001A\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\u0002\u0010\tJ\t\u0010\u001A\u001A\u00020\u0003HÆ\u0003J\t\u0010\u001B\u001A\u00020\u0005HÆ\u0003J\u0011\u0010\u001C\u001A\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003J/\u0010\u001D\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u00052\u0010\b\u0002\u0010\u0006\u001A\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u001E\u001A\u00020\u00052\b\u0010\u001F\u001A\u0004\u0018\u00010 HÖ\u0003J\t\u0010!\u001A\u00020\u0003HÖ\u0001J\t\u0010\"\u001A\u00020#HÖ\u0001R\u0019\u0010\u0006\u001A\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\b\n\u0000\u001A\u0004\b\n\u0010\u000BR\u001C\u0010\f\u001A\u0004\u0018\u00010\rX\u0096\u000E¢\u0006\u000E\n\u0000\u001A\u0004\b\u000E\u0010\u000F\"\u0004\b\u0010\u0010\u0011R\u001A\u0010\u0012\u001A\u00020\u0003X\u0096\u000E¢\u0006\u000E\n\u0000\u001A\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0004\u001A\u00020\u0005¢\u0006\b\n\u0000\u001A\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u0019\u0010\u0014¨\u0006$"}, d2 = {"Lcom/kakao/keditor/request/common/ScrollTo;", "Lcom/kakao/keditor/request/common/CommonRequest;", "position", "", "notScrollIfVisible", "", "doAfterScroll", "Lkotlin/Function0;", "", "(IZLkotlin/jvm/functions/Function0;)V", "getDoAfterScroll", "()Lkotlin/jvm/functions/Function0;", "focusedItem", "Lcom/kakao/keditor/KeditorItem;", "getFocusedItem", "()Lcom/kakao/keditor/KeditorItem;", "setFocusedItem", "(Lcom/kakao/keditor/KeditorItem;)V", "focusedPosition", "getFocusedPosition", "()I", "setFocusedPosition", "(I)V", "getNotScrollIfVisible", "()Z", "getPosition", "component1", "component2", "component3", "copy", "equals", "other", "", "hashCode", "toString", "", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class ScrollTo implements CommonRequest {
    @Nullable
    private final Function0 doAfterScroll;
    @Nullable
    private KeditorItem focusedItem;
    private int focusedPosition;
    private final boolean notScrollIfVisible;
    private final int position;

    public ScrollTo(int v, boolean z, @Nullable Function0 function00) {
        this.position = v;
        this.notScrollIfVisible = z;
        this.doAfterScroll = function00;
    }

    public ScrollTo(int v, boolean z, Function0 function00, int v1, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v1 & 2) != 0) {
            z = false;
        }
        if((v1 & 4) != 0) {
            function00 = null;
        }
        this(v, z, function00);
    }

    public final int component1() {
        return this.position;
    }

    public final boolean component2() {
        return this.notScrollIfVisible;
    }

    @Nullable
    public final Function0 component3() {
        return this.doAfterScroll;
    }

    @NotNull
    public final ScrollTo copy(int v, boolean z, @Nullable Function0 function00) {
        return new ScrollTo(v, z, function00);
    }

    public static ScrollTo copy$default(ScrollTo scrollTo0, int v, boolean z, Function0 function00, int v1, Object object0) {
        if((v1 & 1) != 0) {
            v = scrollTo0.position;
        }
        if((v1 & 2) != 0) {
            z = scrollTo0.notScrollIfVisible;
        }
        if((v1 & 4) != 0) {
            function00 = scrollTo0.doAfterScroll;
        }
        return scrollTo0.copy(v, z, function00);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof ScrollTo)) {
            return false;
        }
        if(this.position != ((ScrollTo)object0).position) {
            return false;
        }
        return this.notScrollIfVisible == ((ScrollTo)object0).notScrollIfVisible ? Intrinsics.areEqual(this.doAfterScroll, ((ScrollTo)object0).doAfterScroll) : false;
    }

    @Nullable
    public final Function0 getDoAfterScroll() {
        return this.doAfterScroll;
    }

    @Override  // com.kakao.keditor.request.FocusedRequest
    @Nullable
    public KeditorItem getFocusedItem() {
        return this.focusedItem;
    }

    @Override  // com.kakao.keditor.request.FocusedRequest
    public int getFocusedPosition() {
        return this.focusedPosition;
    }

    public final boolean getNotScrollIfVisible() {
        return this.notScrollIfVisible;
    }

    public final int getPosition() {
        return this.position;
    }

    @Override
    public int hashCode() {
        int v = a.e(this.position * 0x1F, 0x1F, this.notScrollIfVisible);
        return this.doAfterScroll == null ? v : v + this.doAfterScroll.hashCode();
    }

    @Override  // com.kakao.keditor.request.FocusedRequest
    public void setFocusedItem(@Nullable KeditorItem keditorItem0) {
        this.focusedItem = keditorItem0;
    }

    @Override  // com.kakao.keditor.request.FocusedRequest
    public void setFocusedPosition(int v) {
        this.focusedPosition = v;
    }

    @Override
    @NotNull
    public String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("ScrollTo(position=");
        stringBuilder0.append(this.position);
        stringBuilder0.append(", notScrollIfVisible=");
        stringBuilder0.append(this.notScrollIfVisible);
        stringBuilder0.append(", doAfterScroll=");
        return q.q(stringBuilder0, this.doAfterScroll, ")");
    }
}

