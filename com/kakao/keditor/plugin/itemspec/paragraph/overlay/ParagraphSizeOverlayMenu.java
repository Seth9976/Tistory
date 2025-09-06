package com.kakao.keditor.plugin.itemspec.paragraph.overlay;

import android.content.Context;
import android.util.AttributeSet;
import com.kakao.keditor.plugin.attrs.text.ParagraphStyle;
import com.kakao.keditor.toolbar.toolbaroverlay.OverlayMenu.BackgroundStyle;
import com.kakao.keditor.toolbar.toolbaroverlay.OverlayMenu;
import com.kakao.keditor.toolbar.toolbaroverlay.ToolbarOverlayMenuClickedListener;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BK\b\u0007\u0012\u0006\u0010\u0003\u001A\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001A\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001A\u00020\b\u0012\b\b\u0002\u0010\t\u001A\u00020\b\u0012\n\b\u0002\u0010\n\u001A\u0004\u0018\u00010\u0002\u0012\u000E\u0010\u000B\u001A\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\f¢\u0006\u0002\u0010\r¨\u0006\u000E"}, d2 = {"Lcom/kakao/keditor/plugin/itemspec/paragraph/overlay/ParagraphSizeOverlayMenu;", "Lcom/kakao/keditor/toolbar/toolbaroverlay/OverlayMenu;", "Lcom/kakao/keditor/plugin/attrs/text/ParagraphStyle;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "spanCount", "selectedItem", "listener", "Lcom/kakao/keditor/toolbar/toolbaroverlay/ToolbarOverlayMenuClickedListener;", "(Landroid/content/Context;Landroid/util/AttributeSet;IILcom/kakao/keditor/plugin/attrs/text/ParagraphStyle;Lcom/kakao/keditor/toolbar/toolbaroverlay/ToolbarOverlayMenuClickedListener;)V", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class ParagraphSizeOverlayMenu extends OverlayMenu {
    @JvmOverloads
    public ParagraphSizeOverlayMenu(@NotNull Context context0, @Nullable AttributeSet attributeSet0, int v, int v1, @Nullable ParagraphStyle paragraphStyle0, @Nullable ToolbarOverlayMenuClickedListener toolbarOverlayMenuClickedListener0) {
        Intrinsics.checkNotNullParameter(context0, "context");
        ParagraphSizeOverlayAdapter paragraphSizeOverlayAdapter0 = new ParagraphSizeOverlayAdapter(toolbarOverlayMenuClickedListener0);
        paragraphSizeOverlayAdapter0.setSelectedItem(paragraphStyle0);
        super(context0, attributeSet0, v, v1, BackgroundStyle.LineMiddle, paragraphSizeOverlayAdapter0, null, null, null, 0x1C0, null);
    }

    public ParagraphSizeOverlayMenu(Context context0, AttributeSet attributeSet0, int v, int v1, ParagraphStyle paragraphStyle0, ToolbarOverlayMenuClickedListener toolbarOverlayMenuClickedListener0, int v2, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v2 & 2) != 0) {
            attributeSet0 = null;
        }
        if((v2 & 4) != 0) {
            v = 0;
        }
        if((v2 & 8) != 0) {
            v1 = 3;
        }
        if((v2 & 16) != 0) {
            paragraphStyle0 = ParagraphStyle.ParagraphStyle5;
        }
        this(context0, attributeSet0, v, v1, paragraphStyle0, toolbarOverlayMenuClickedListener0);
    }

    @JvmOverloads
    public ParagraphSizeOverlayMenu(@NotNull Context context0, @Nullable AttributeSet attributeSet0, int v, int v1, @Nullable ToolbarOverlayMenuClickedListener toolbarOverlayMenuClickedListener0) {
        Intrinsics.checkNotNullParameter(context0, "context");
        this(context0, attributeSet0, v, v1, null, toolbarOverlayMenuClickedListener0, 16, null);
    }

    @JvmOverloads
    public ParagraphSizeOverlayMenu(@NotNull Context context0, @Nullable AttributeSet attributeSet0, int v, @Nullable ToolbarOverlayMenuClickedListener toolbarOverlayMenuClickedListener0) {
        Intrinsics.checkNotNullParameter(context0, "context");
        this(context0, attributeSet0, v, 0, null, toolbarOverlayMenuClickedListener0, 24, null);
    }

    @JvmOverloads
    public ParagraphSizeOverlayMenu(@NotNull Context context0, @Nullable AttributeSet attributeSet0, @Nullable ToolbarOverlayMenuClickedListener toolbarOverlayMenuClickedListener0) {
        Intrinsics.checkNotNullParameter(context0, "context");
        this(context0, attributeSet0, 0, 0, null, toolbarOverlayMenuClickedListener0, 28, null);
    }

    @JvmOverloads
    public ParagraphSizeOverlayMenu(@NotNull Context context0, @Nullable ToolbarOverlayMenuClickedListener toolbarOverlayMenuClickedListener0) {
        Intrinsics.checkNotNullParameter(context0, "context");
        this(context0, null, 0, 0, null, toolbarOverlayMenuClickedListener0, 30, null);
    }
}

