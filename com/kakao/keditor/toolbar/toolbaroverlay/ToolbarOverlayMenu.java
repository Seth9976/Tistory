package com.kakao.keditor.toolbar.toolbaroverlay;

import android.content.Context;
import android.util.AttributeSet;
import com.kakao.common.util.UnitConversionKt;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B?\b\u0007\u0012\u0006\u0010\u0003\u001A\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001A\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001A\u00020\b\u0012\b\b\u0002\u0010\t\u001A\u00020\b\u0012\u000E\u0010\n\u001A\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000B¢\u0006\u0002\u0010\f¨\u0006\r"}, d2 = {"Lcom/kakao/keditor/toolbar/toolbaroverlay/ToolbarOverlayMenu;", "Lcom/kakao/keditor/toolbar/toolbaroverlay/OverlayMenuItem;", "Lcom/kakao/keditor/toolbar/toolbaroverlay/ToolbarOverlayMenuItem;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "spanCount", "listener", "Lcom/kakao/keditor/toolbar/toolbaroverlay/ToolbarOverlayMenuClickedListener;", "(Landroid/content/Context;Landroid/util/AttributeSet;IILcom/kakao/keditor/toolbar/toolbaroverlay/ToolbarOverlayMenuClickedListener;)V", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class ToolbarOverlayMenu extends OverlayMenuItem {
    @JvmOverloads
    public ToolbarOverlayMenu(@NotNull Context context0, @Nullable AttributeSet attributeSet0, int v, int v1, @Nullable ToolbarOverlayMenuClickedListener toolbarOverlayMenuClickedListener0) {
        Intrinsics.checkNotNullParameter(context0, "context");
        super(context0, attributeSet0, v, v1, null, new ToolbarOverlayAdapter(toolbarOverlayMenuClickedListener0), UnitConversionKt.dp2pxRoundDown(15.5f), null, null, 400, null);
    }

    public ToolbarOverlayMenu(Context context0, AttributeSet attributeSet0, int v, int v1, ToolbarOverlayMenuClickedListener toolbarOverlayMenuClickedListener0, int v2, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v2 & 2) != 0) {
            attributeSet0 = null;
        }
        if((v2 & 4) != 0) {
            v = 0;
        }
        if((v2 & 8) != 0) {
            v1 = 4;
        }
        this(context0, attributeSet0, v, v1, toolbarOverlayMenuClickedListener0);
    }

    @JvmOverloads
    public ToolbarOverlayMenu(@NotNull Context context0, @Nullable AttributeSet attributeSet0, int v, @Nullable ToolbarOverlayMenuClickedListener toolbarOverlayMenuClickedListener0) {
        Intrinsics.checkNotNullParameter(context0, "context");
        this(context0, attributeSet0, v, 0, toolbarOverlayMenuClickedListener0, 8, null);
    }

    @JvmOverloads
    public ToolbarOverlayMenu(@NotNull Context context0, @Nullable AttributeSet attributeSet0, @Nullable ToolbarOverlayMenuClickedListener toolbarOverlayMenuClickedListener0) {
        Intrinsics.checkNotNullParameter(context0, "context");
        this(context0, attributeSet0, 0, 0, toolbarOverlayMenuClickedListener0, 12, null);
    }

    @JvmOverloads
    public ToolbarOverlayMenu(@NotNull Context context0, @Nullable ToolbarOverlayMenuClickedListener toolbarOverlayMenuClickedListener0) {
        Intrinsics.checkNotNullParameter(context0, "context");
        this(context0, null, 0, 0, toolbarOverlayMenuClickedListener0, 14, null);
    }
}

