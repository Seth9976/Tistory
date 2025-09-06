package com.kakao.keditor.toolbar.toolbaroverlay;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.kakao.keditor.R.drawable;
import com.kakao.keditor.R.layout;
import com.kakao.keditor.databinding.KeToolbarOverlayBinding;
import com.kakao.keditor.plugin.itemspec.paragraph.overlay.HorizontalDividerItemDecoration;
import java.util.List;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sd.a;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0002\b\u0016\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001\u001BBk\b\u0007\u0012\u0006\u0010\u0003\u001A\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001A\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001A\u00020\b\u0012\b\b\u0002\u0010\t\u001A\u00020\b\u0012\b\b\u0002\u0010\n\u001A\u00020\u000B\u0012\f\u0010\f\u001A\b\u0012\u0004\u0012\u00028\u00000\r\u0012\n\b\u0002\u0010\u000E\u001A\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000F\u001A\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0010\u001A\u0004\u0018\u00010\b¢\u0006\u0002\u0010\u0011J\u0013\u0010\u0014\u001A\u00020\u00152\u0006\u0010\u0016\u001A\u00028\u0000¢\u0006\u0002\u0010\u0017J\u0014\u0010\u0018\u001A\u00020\u00152\f\u0010\u0019\u001A\b\u0012\u0004\u0012\u00028\u00000\u001AR\u0014\u0010\f\u001A\b\u0012\u0004\u0012\u00028\u00000\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000E\u0010\u0012\u001A\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001C"}, d2 = {"Lcom/kakao/keditor/toolbar/toolbaroverlay/OverlayMenu;", "T", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "spanCount", "backgroundType", "Lcom/kakao/keditor/toolbar/toolbaroverlay/OverlayMenu$BackgroundStyle;", "adapter", "Lcom/kakao/keditor/toolbar/toolbaroverlay/ToolbarOverlayMenuAdapter;", "paddingHorizontal", "paddingTop", "paddingBottom", "(Landroid/content/Context;Landroid/util/AttributeSet;IILcom/kakao/keditor/toolbar/toolbaroverlay/OverlayMenu$BackgroundStyle;Lcom/kakao/keditor/toolbar/toolbaroverlay/ToolbarOverlayMenuAdapter;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "binding", "Lcom/kakao/keditor/databinding/KeToolbarOverlayBinding;", "add", "", "item", "(Ljava/lang/Object;)V", "setItems", "items", "", "BackgroundStyle", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public class OverlayMenu extends FrameLayout {
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/kakao/keditor/toolbar/toolbaroverlay/OverlayMenu$BackgroundStyle;", "", "(Ljava/lang/String;I)V", "ShadowTop", "SecondaryColorLineTop", "PrimaryColorLineTop", "LineMiddle", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static enum BackgroundStyle {
        ShadowTop,
        SecondaryColorLineTop,
        PrimaryColorLineTop,
        LineMiddle;

        private static final EnumEntries $ENTRIES;
        private static final BackgroundStyle[] $VALUES;

        private static final BackgroundStyle[] $values() [...] // Inlined contents

        static {
            BackgroundStyle.$VALUES = arr_overlayMenu$BackgroundStyle;
            Intrinsics.checkNotNullParameter(arr_overlayMenu$BackgroundStyle, "entries");
            BackgroundStyle.$ENTRIES = new a(arr_overlayMenu$BackgroundStyle);
        }

        @NotNull
        public static EnumEntries getEntries() {
            return BackgroundStyle.$ENTRIES;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 0x30)
    public final class WhenMappings {
        public static final int[] $EnumSwitchMapping$0;

        static {
            int[] arr_v = new int[BackgroundStyle.values().length];
            try {
                arr_v[BackgroundStyle.ShadowTop.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[BackgroundStyle.SecondaryColorLineTop.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[BackgroundStyle.PrimaryColorLineTop.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[BackgroundStyle.LineMiddle.ordinal()] = 4;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            WhenMappings.$EnumSwitchMapping$0 = arr_v;
        }
    }

    @NotNull
    private final ToolbarOverlayMenuAdapter adapter;
    @NotNull
    private final KeToolbarOverlayBinding binding;

    @JvmOverloads
    public OverlayMenu(@NotNull Context context0, @Nullable AttributeSet attributeSet0, int v, int v1, @NotNull BackgroundStyle overlayMenu$BackgroundStyle0, @NotNull ToolbarOverlayMenuAdapter toolbarOverlayMenuAdapter0) {
        Intrinsics.checkNotNullParameter(context0, "context");
        Intrinsics.checkNotNullParameter(overlayMenu$BackgroundStyle0, "backgroundType");
        Intrinsics.checkNotNullParameter(toolbarOverlayMenuAdapter0, "adapter");
        this(context0, attributeSet0, v, v1, overlayMenu$BackgroundStyle0, toolbarOverlayMenuAdapter0, null, null, null, 0x1C0, null);
    }

    @JvmOverloads
    public OverlayMenu(@NotNull Context context0, @Nullable AttributeSet attributeSet0, int v, int v1, @NotNull BackgroundStyle overlayMenu$BackgroundStyle0, @NotNull ToolbarOverlayMenuAdapter toolbarOverlayMenuAdapter0, @Nullable Integer integer0) {
        Intrinsics.checkNotNullParameter(context0, "context");
        Intrinsics.checkNotNullParameter(overlayMenu$BackgroundStyle0, "backgroundType");
        Intrinsics.checkNotNullParameter(toolbarOverlayMenuAdapter0, "adapter");
        this(context0, attributeSet0, v, v1, overlayMenu$BackgroundStyle0, toolbarOverlayMenuAdapter0, integer0, null, null, 0x180, null);
    }

    @JvmOverloads
    public OverlayMenu(@NotNull Context context0, @Nullable AttributeSet attributeSet0, int v, int v1, @NotNull BackgroundStyle overlayMenu$BackgroundStyle0, @NotNull ToolbarOverlayMenuAdapter toolbarOverlayMenuAdapter0, @Nullable Integer integer0, @Nullable Integer integer1) {
        Intrinsics.checkNotNullParameter(context0, "context");
        Intrinsics.checkNotNullParameter(overlayMenu$BackgroundStyle0, "backgroundType");
        Intrinsics.checkNotNullParameter(toolbarOverlayMenuAdapter0, "adapter");
        this(context0, attributeSet0, v, v1, overlayMenu$BackgroundStyle0, toolbarOverlayMenuAdapter0, integer0, integer1, null, 0x100, null);
    }

    @JvmOverloads
    public OverlayMenu(@NotNull Context context0, @Nullable AttributeSet attributeSet0, int v, int v1, @NotNull BackgroundStyle overlayMenu$BackgroundStyle0, @NotNull ToolbarOverlayMenuAdapter toolbarOverlayMenuAdapter0, @Nullable Integer integer0, @Nullable Integer integer1, @Nullable Integer integer2) {
        Intrinsics.checkNotNullParameter(context0, "context");
        Intrinsics.checkNotNullParameter(overlayMenu$BackgroundStyle0, "backgroundType");
        Intrinsics.checkNotNullParameter(toolbarOverlayMenuAdapter0, "adapter");
        super(context0, attributeSet0, v);
        this.adapter = toolbarOverlayMenuAdapter0;
        ViewDataBinding viewDataBinding0 = DataBindingUtil.inflate(LayoutInflater.from(context0), layout.ke_toolbar_overlay, this, true);
        Intrinsics.checkNotNullExpressionValue(viewDataBinding0, "inflate(...)");
        this.binding = (KeToolbarOverlayBinding)viewDataBinding0;
        RecyclerView recyclerView0 = ((KeToolbarOverlayBinding)viewDataBinding0).list;
        recyclerView0.setPadding((integer0 == null ? recyclerView0.getPaddingLeft() : ((int)integer0)), (integer1 == null ? recyclerView0.getPaddingTop() : ((int)integer1)), (integer0 == null ? recyclerView0.getPaddingRight() : ((int)integer0)), (integer2 == null ? recyclerView0.getPaddingBottom() : ((int)integer2)));
        recyclerView0.setLayoutManager(new GridLayoutManager(context0, v1));
        recyclerView0.setAdapter(toolbarOverlayMenuAdapter0);
        switch(WhenMappings.$EnumSwitchMapping$0[overlayMenu$BackgroundStyle0.ordinal()]) {
            case 1: {
                Drawable drawable0 = context0.getDrawable(drawable.ke_bg_secondary_top_shadow);
                ((KeToolbarOverlayBinding)viewDataBinding0).flRoot.setBackground(drawable0);
                return;
            }
            case 2: {
                Drawable drawable1 = context0.getDrawable(drawable.ke_bg_secondary_top_line_divider);
                ((KeToolbarOverlayBinding)viewDataBinding0).flRoot.setBackground(drawable1);
                return;
            }
            case 3: {
                Drawable drawable2 = context0.getDrawable(drawable.ke_bg_primary_top_line_divider);
                ((KeToolbarOverlayBinding)viewDataBinding0).flRoot.setBackground(drawable2);
                return;
            }
            case 4: {
                ((KeToolbarOverlayBinding)viewDataBinding0).list.getLayoutParams().height = -1;
                Drawable drawable3 = context0.getDrawable(drawable.ke_bg_secondary_top_line_divider);
                ((KeToolbarOverlayBinding)viewDataBinding0).flRoot.setBackground(drawable3);
                HorizontalDividerItemDecoration horizontalDividerItemDecoration0 = new HorizontalDividerItemDecoration(context0, v1);
                ((KeToolbarOverlayBinding)viewDataBinding0).list.addItemDecoration(horizontalDividerItemDecoration0);
            }
        }
    }

    public OverlayMenu(Context context0, AttributeSet attributeSet0, int v, int v1, BackgroundStyle overlayMenu$BackgroundStyle0, ToolbarOverlayMenuAdapter toolbarOverlayMenuAdapter0, Integer integer0, Integer integer1, Integer integer2, int v2, DefaultConstructorMarker defaultConstructorMarker0) {
        this(context0, ((v2 & 2) == 0 ? attributeSet0 : null), ((v2 & 4) == 0 ? v : 0), ((v2 & 8) == 0 ? v1 : 4), ((v2 & 16) == 0 ? overlayMenu$BackgroundStyle0 : BackgroundStyle.ShadowTop), toolbarOverlayMenuAdapter0, ((v2 & 0x40) == 0 ? integer0 : null), ((v2 & 0x80) == 0 ? integer1 : null), ((v2 & 0x100) == 0 ? integer2 : null));
    }

    @JvmOverloads
    public OverlayMenu(@NotNull Context context0, @Nullable AttributeSet attributeSet0, int v, int v1, @NotNull ToolbarOverlayMenuAdapter toolbarOverlayMenuAdapter0) {
        Intrinsics.checkNotNullParameter(context0, "context");
        Intrinsics.checkNotNullParameter(toolbarOverlayMenuAdapter0, "adapter");
        this(context0, attributeSet0, v, v1, null, toolbarOverlayMenuAdapter0, null, null, null, 0x1D0, null);
    }

    @JvmOverloads
    public OverlayMenu(@NotNull Context context0, @Nullable AttributeSet attributeSet0, int v, @NotNull ToolbarOverlayMenuAdapter toolbarOverlayMenuAdapter0) {
        Intrinsics.checkNotNullParameter(context0, "context");
        Intrinsics.checkNotNullParameter(toolbarOverlayMenuAdapter0, "adapter");
        this(context0, attributeSet0, v, 0, null, toolbarOverlayMenuAdapter0, null, null, null, 472, null);
    }

    @JvmOverloads
    public OverlayMenu(@NotNull Context context0, @Nullable AttributeSet attributeSet0, @NotNull ToolbarOverlayMenuAdapter toolbarOverlayMenuAdapter0) {
        Intrinsics.checkNotNullParameter(context0, "context");
        Intrinsics.checkNotNullParameter(toolbarOverlayMenuAdapter0, "adapter");
        this(context0, attributeSet0, 0, 0, null, toolbarOverlayMenuAdapter0, null, null, null, 476, null);
    }

    @JvmOverloads
    public OverlayMenu(@NotNull Context context0, @NotNull ToolbarOverlayMenuAdapter toolbarOverlayMenuAdapter0) {
        Intrinsics.checkNotNullParameter(context0, "context");
        Intrinsics.checkNotNullParameter(toolbarOverlayMenuAdapter0, "adapter");
        this(context0, null, 0, 0, null, toolbarOverlayMenuAdapter0, null, null, null, 478, null);
    }

    public final void add(Object object0) {
        this.adapter.add(0, new Object[]{object0});
    }

    public final void setItems(@NotNull List list0) {
        Intrinsics.checkNotNullParameter(list0, "items");
        this.adapter.setItems(list0);
    }
}

