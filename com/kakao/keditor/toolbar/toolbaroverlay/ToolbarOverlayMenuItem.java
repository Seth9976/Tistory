package com.kakao.keditor.toolbar.toolbaroverlay;

import androidx.annotation.DrawableRes;
import androidx.annotation.IdRes;
import androidx.annotation.StringRes;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.q;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r0.a;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000E\n\u0002\b\u0011\n\u0002\u0010\u000B\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B9\u0012\b\b\u0001\u0010\u0002\u001A\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001A\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001A\u00020\u0003\u0012\b\b\u0003\u0010\u0006\u001A\u00020\u0003\u0012\n\b\u0002\u0010\u0007\u001A\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tJ\t\u0010\u0013\u001A\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001A\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001A\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001A\u00020\u0003HÆ\u0003J\u000B\u0010\u0017\u001A\u0004\u0018\u00010\bHÆ\u0003J=\u0010\u0018\u001A\u00020\u00002\b\b\u0003\u0010\u0002\u001A\u00020\u00032\b\b\u0003\u0010\u0004\u001A\u00020\u00032\b\b\u0003\u0010\u0005\u001A\u00020\u00032\b\b\u0003\u0010\u0006\u001A\u00020\u00032\n\b\u0002\u0010\u0007\u001A\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0019\u001A\u00020\u001A2\b\u0010\u001B\u001A\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001C\u001A\u00020\u0003HÖ\u0001J\t\u0010\u001D\u001A\u00020\bHÖ\u0001R\u0011\u0010\u0005\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\n\u0010\u000BR\u001C\u0010\u0007\u001A\u0004\u0018\u00010\bX\u0086\u000E¢\u0006\u000E\n\u0000\u001A\u0004\b\f\u0010\r\"\u0004\b\u000E\u0010\u000FR\u0011\u0010\u0004\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u0010\u0010\u000BR\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u0011\u0010\u000BR\u0011\u0010\u0006\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u0012\u0010\u000B¨\u0006\u001E"}, d2 = {"Lcom/kakao/keditor/toolbar/toolbaroverlay/ToolbarOverlayMenuItem;", "", "id", "", "iconResId", "accessibilityDescResId", "textResId", "currentValue", "", "(IIIILjava/lang/String;)V", "getAccessibilityDescResId", "()I", "getCurrentValue", "()Ljava/lang/String;", "setCurrentValue", "(Ljava/lang/String;)V", "getIconResId", "getId", "getTextResId", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class ToolbarOverlayMenuItem {
    private final int accessibilityDescResId;
    @Nullable
    private String currentValue;
    private final int iconResId;
    private final int id;
    private final int textResId;

    public ToolbarOverlayMenuItem(@IdRes int v, @DrawableRes int v1, @StringRes int v2, @StringRes int v3, @Nullable String s) {
        this.id = v;
        this.iconResId = v1;
        this.accessibilityDescResId = v2;
        this.textResId = v3;
        this.currentValue = s;
    }

    public ToolbarOverlayMenuItem(int v, int v1, int v2, int v3, String s, int v4, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v4 & 8) != 0) {
            v3 = 0;
        }
        if((v4 & 16) != 0) {
            s = null;
        }
        this(v, v1, v2, v3, s);
    }

    public final int component1() {
        return this.id;
    }

    public final int component2() {
        return this.iconResId;
    }

    public final int component3() {
        return this.accessibilityDescResId;
    }

    public final int component4() {
        return this.textResId;
    }

    @Nullable
    public final String component5() {
        return this.currentValue;
    }

    @NotNull
    public final ToolbarOverlayMenuItem copy(@IdRes int v, @DrawableRes int v1, @StringRes int v2, @StringRes int v3, @Nullable String s) {
        return new ToolbarOverlayMenuItem(v, v1, v2, v3, s);
    }

    public static ToolbarOverlayMenuItem copy$default(ToolbarOverlayMenuItem toolbarOverlayMenuItem0, int v, int v1, int v2, int v3, String s, int v4, Object object0) {
        if((v4 & 1) != 0) {
            v = toolbarOverlayMenuItem0.id;
        }
        if((v4 & 2) != 0) {
            v1 = toolbarOverlayMenuItem0.iconResId;
        }
        if((v4 & 4) != 0) {
            v2 = toolbarOverlayMenuItem0.accessibilityDescResId;
        }
        if((v4 & 8) != 0) {
            v3 = toolbarOverlayMenuItem0.textResId;
        }
        if((v4 & 16) != 0) {
            s = toolbarOverlayMenuItem0.currentValue;
        }
        return toolbarOverlayMenuItem0.copy(v, v1, v2, v3, s);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof ToolbarOverlayMenuItem)) {
            return false;
        }
        if(this.id != ((ToolbarOverlayMenuItem)object0).id) {
            return false;
        }
        if(this.iconResId != ((ToolbarOverlayMenuItem)object0).iconResId) {
            return false;
        }
        if(this.accessibilityDescResId != ((ToolbarOverlayMenuItem)object0).accessibilityDescResId) {
            return false;
        }
        return this.textResId == ((ToolbarOverlayMenuItem)object0).textResId ? Intrinsics.areEqual(this.currentValue, ((ToolbarOverlayMenuItem)object0).currentValue) : false;
    }

    public final int getAccessibilityDescResId() {
        return this.accessibilityDescResId;
    }

    @Nullable
    public final String getCurrentValue() {
        return this.currentValue;
    }

    public final int getIconResId() {
        return this.iconResId;
    }

    public final int getId() {
        return this.id;
    }

    public final int getTextResId() {
        return this.textResId;
    }

    @Override
    public int hashCode() {
        int v = a.c(this.textResId, a.c(this.accessibilityDescResId, a.c(this.iconResId, this.id * 0x1F, 0x1F), 0x1F), 0x1F);
        return this.currentValue == null ? v : v + this.currentValue.hashCode();
    }

    public final void setCurrentValue(@Nullable String s) {
        this.currentValue = s;
    }

    @Override
    @NotNull
    public String toString() {
        String s = this.currentValue;
        StringBuilder stringBuilder0 = q.u("ToolbarOverlayMenuItem(id=", this.id, ", iconResId=", this.iconResId, ", accessibilityDescResId=");
        a.A(stringBuilder0, this.accessibilityDescResId, ", textResId=", this.textResId, ", currentValue=");
        return a.o(stringBuilder0, s, ")");
    }
}

