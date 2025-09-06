package com.kakao.keditor.util.eventbus;

import android.view.View;
import com.kakao.keditor.request.KeditorRequest;
import com.kakao.keditor.toolbar.category.OverlayCategory;
import com.kakao.keditor.toolbar.category.ToolbarCategory;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0006\u0003\u0004\u0005\u0006\u0007\bB\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0006\t\n\u000B\f\r\u000E¨\u0006\u000F"}, d2 = {"Lcom/kakao/keditor/util/eventbus/ToolbarRequest;", "Lcom/kakao/keditor/request/KeditorRequest;", "()V", "FocusCategory", "FocusChanged", "HideSoftInputOverlay", "InitToolbar", "OnToolbarExtraClicked", "ShowSoftInputOverlay", "Lcom/kakao/keditor/util/eventbus/ToolbarRequest$FocusCategory;", "Lcom/kakao/keditor/util/eventbus/ToolbarRequest$FocusChanged;", "Lcom/kakao/keditor/util/eventbus/ToolbarRequest$HideSoftInputOverlay;", "Lcom/kakao/keditor/util/eventbus/ToolbarRequest$InitToolbar;", "Lcom/kakao/keditor/util/eventbus/ToolbarRequest$OnToolbarExtraClicked;", "Lcom/kakao/keditor/util/eventbus/ToolbarRequest$ShowSoftInputOverlay;", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public abstract class ToolbarRequest implements KeditorRequest {
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000E\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001A\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001A\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001A\u00020\n2\b\u0010\u000B\u001A\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001A\u00020\u000EHÖ\u0001J\t\u0010\u000F\u001A\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/kakao/keditor/util/eventbus/ToolbarRequest$FocusCategory;", "Lcom/kakao/keditor/util/eventbus/ToolbarRequest;", "category", "Lcom/kakao/keditor/toolbar/category/ToolbarCategory;", "(Lcom/kakao/keditor/toolbar/category/ToolbarCategory;)V", "getCategory", "()Lcom/kakao/keditor/toolbar/category/ToolbarCategory;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class FocusCategory extends ToolbarRequest {
        @NotNull
        private final ToolbarCategory category;

        public FocusCategory(@NotNull ToolbarCategory toolbarCategory0) {
            Intrinsics.checkNotNullParameter(toolbarCategory0, "category");
            super(null);
            this.category = toolbarCategory0;
        }

        @NotNull
        public final ToolbarCategory component1() {
            return this.category;
        }

        @NotNull
        public final FocusCategory copy(@NotNull ToolbarCategory toolbarCategory0) {
            Intrinsics.checkNotNullParameter(toolbarCategory0, "category");
            return new FocusCategory(toolbarCategory0);
        }

        public static FocusCategory copy$default(FocusCategory toolbarRequest$FocusCategory0, ToolbarCategory toolbarCategory0, int v, Object object0) {
            if((v & 1) != 0) {
                toolbarCategory0 = toolbarRequest$FocusCategory0.category;
            }
            return toolbarRequest$FocusCategory0.copy(toolbarCategory0);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            return object0 instanceof FocusCategory ? Intrinsics.areEqual(this.category, ((FocusCategory)object0).category) : false;
        }

        @NotNull
        public final ToolbarCategory getCategory() {
            return this.category;
        }

        @Override
        public int hashCode() {
            return this.category.hashCode();
        }

        @Override
        @NotNull
        public String toString() {
            return "FocusCategory(category=" + this.category + ")";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000E\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001A\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001A\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001A\u00020\u00032\b\u0010\n\u001A\u0004\u0018\u00010\u000BHÖ\u0003J\t\u0010\f\u001A\u00020\rHÖ\u0001J\t\u0010\u000E\u001A\u00020\u000FHÖ\u0001R\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/kakao/keditor/util/eventbus/ToolbarRequest$FocusChanged;", "Lcom/kakao/keditor/util/eventbus/ToolbarRequest;", "hideInput", "", "(Z)V", "getHideInput", "()Z", "component1", "copy", "equals", "other", "", "hashCode", "", "toString", "", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class FocusChanged extends ToolbarRequest {
        private final boolean hideInput;

        public FocusChanged(boolean z) {
            super(null);
            this.hideInput = z;
        }

        public final boolean component1() {
            return this.hideInput;
        }

        @NotNull
        public final FocusChanged copy(boolean z) {
            return new FocusChanged(z);
        }

        public static FocusChanged copy$default(FocusChanged toolbarRequest$FocusChanged0, boolean z, int v, Object object0) {
            if((v & 1) != 0) {
                z = toolbarRequest$FocusChanged0.hideInput;
            }
            return toolbarRequest$FocusChanged0.copy(z);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            return object0 instanceof FocusChanged ? this.hideInput == ((FocusChanged)object0).hideInput : false;
        }

        public final boolean getHideInput() {
            return this.hideInput;
        }

        @Override
        public int hashCode() {
            return Boolean.hashCode(this.hideInput);
        }

        @Override
        @NotNull
        public String toString() {
            return "FocusChanged(hideInput=" + this.hideInput + ")";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/kakao/keditor/util/eventbus/ToolbarRequest$HideSoftInputOverlay;", "Lcom/kakao/keditor/util/eventbus/ToolbarRequest;", "()V", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class HideSoftInputOverlay extends ToolbarRequest {
        @NotNull
        public static final HideSoftInputOverlay INSTANCE;

        static {
            HideSoftInputOverlay.INSTANCE = new HideSoftInputOverlay();
        }

        private HideSoftInputOverlay() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000E\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001A\u00020\u00042\b\u0010\u0005\u001A\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001A\u00020\bHÖ\u0001J\t\u0010\t\u001A\u00020\nHÖ\u0001¨\u0006\u000B"}, d2 = {"Lcom/kakao/keditor/util/eventbus/ToolbarRequest$InitToolbar;", "Lcom/kakao/keditor/util/eventbus/ToolbarRequest;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class InitToolbar extends ToolbarRequest {
        @NotNull
        public static final InitToolbar INSTANCE;

        static {
            InitToolbar.INSTANCE = new InitToolbar();
        }

        private InitToolbar() {
            super(null);
        }

        // 去混淆评级： 低(20)
        @Override
        public boolean equals(@Nullable Object object0) {
            return this == object0 ? true : object0 instanceof InitToolbar;
        }

        @Override
        public int hashCode() {
            return 0x1F7D8DBB;
        }

        @Override
        @NotNull
        public String toString() {
            return "InitToolbar";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/kakao/keditor/util/eventbus/ToolbarRequest$OnToolbarExtraClicked;", "Lcom/kakao/keditor/util/eventbus/ToolbarRequest;", "()V", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class OnToolbarExtraClicked extends ToolbarRequest {
        @NotNull
        public static final OnToolbarExtraClicked INSTANCE;

        static {
            OnToolbarExtraClicked.INSTANCE = new OnToolbarExtraClicked();
        }

        private OnToolbarExtraClicked() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000E\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001F\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001A\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000F\u001A\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001A\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001A\u00020\u0007HÆ\u0003J\'\u0010\u0012\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u00052\b\b\u0002\u0010\u0006\u001A\u00020\u0007HÆ\u0001J\u0013\u0010\u0013\u001A\u00020\u00072\b\u0010\u0014\u001A\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001A\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001A\u00020\u0019HÖ\u0001R\u0011\u0010\u0006\u001A\u00020\u0007¢\u0006\b\n\u0000\u001A\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u000B\u0010\fR\u0011\u0010\u0004\u001A\u00020\u0005¢\u0006\b\n\u0000\u001A\u0004\b\r\u0010\u000E¨\u0006\u001A"}, d2 = {"Lcom/kakao/keditor/util/eventbus/ToolbarRequest$ShowSoftInputOverlay;", "Lcom/kakao/keditor/util/eventbus/ToolbarRequest;", "overlay", "Landroid/view/View;", "overlayCategory", "Lcom/kakao/keditor/toolbar/category/OverlayCategory;", "needToggle", "", "(Landroid/view/View;Lcom/kakao/keditor/toolbar/category/OverlayCategory;Z)V", "getNeedToggle", "()Z", "getOverlay", "()Landroid/view/View;", "getOverlayCategory", "()Lcom/kakao/keditor/toolbar/category/OverlayCategory;", "component1", "component2", "component3", "copy", "equals", "other", "", "hashCode", "", "toString", "", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class ShowSoftInputOverlay extends ToolbarRequest {
        private final boolean needToggle;
        @NotNull
        private final View overlay;
        @NotNull
        private final OverlayCategory overlayCategory;

        public ShowSoftInputOverlay(@NotNull View view0, @NotNull OverlayCategory overlayCategory0, boolean z) {
            Intrinsics.checkNotNullParameter(view0, "overlay");
            Intrinsics.checkNotNullParameter(overlayCategory0, "overlayCategory");
            super(null);
            this.overlay = view0;
            this.overlayCategory = overlayCategory0;
            this.needToggle = z;
        }

        public ShowSoftInputOverlay(View view0, OverlayCategory overlayCategory0, boolean z, int v, DefaultConstructorMarker defaultConstructorMarker0) {
            if((v & 4) != 0) {
                z = false;
            }
            this(view0, overlayCategory0, z);
        }

        @NotNull
        public final View component1() {
            return this.overlay;
        }

        @NotNull
        public final OverlayCategory component2() {
            return this.overlayCategory;
        }

        public final boolean component3() {
            return this.needToggle;
        }

        @NotNull
        public final ShowSoftInputOverlay copy(@NotNull View view0, @NotNull OverlayCategory overlayCategory0, boolean z) {
            Intrinsics.checkNotNullParameter(view0, "overlay");
            Intrinsics.checkNotNullParameter(overlayCategory0, "overlayCategory");
            return new ShowSoftInputOverlay(view0, overlayCategory0, z);
        }

        public static ShowSoftInputOverlay copy$default(ShowSoftInputOverlay toolbarRequest$ShowSoftInputOverlay0, View view0, OverlayCategory overlayCategory0, boolean z, int v, Object object0) {
            if((v & 1) != 0) {
                view0 = toolbarRequest$ShowSoftInputOverlay0.overlay;
            }
            if((v & 2) != 0) {
                overlayCategory0 = toolbarRequest$ShowSoftInputOverlay0.overlayCategory;
            }
            if((v & 4) != 0) {
                z = toolbarRequest$ShowSoftInputOverlay0.needToggle;
            }
            return toolbarRequest$ShowSoftInputOverlay0.copy(view0, overlayCategory0, z);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof ShowSoftInputOverlay)) {
                return false;
            }
            if(!Intrinsics.areEqual(this.overlay, ((ShowSoftInputOverlay)object0).overlay)) {
                return false;
            }
            return Intrinsics.areEqual(this.overlayCategory, ((ShowSoftInputOverlay)object0).overlayCategory) ? this.needToggle == ((ShowSoftInputOverlay)object0).needToggle : false;
        }

        public final boolean getNeedToggle() {
            return this.needToggle;
        }

        @NotNull
        public final View getOverlay() {
            return this.overlay;
        }

        @NotNull
        public final OverlayCategory getOverlayCategory() {
            return this.overlayCategory;
        }

        @Override
        public int hashCode() {
            return Boolean.hashCode(this.needToggle) + (this.overlayCategory.hashCode() + this.overlay.hashCode() * 0x1F) * 0x1F;
        }

        @Override
        @NotNull
        public String toString() {
            return "ShowSoftInputOverlay(overlay=" + this.overlay + ", overlayCategory=" + this.overlayCategory + ", needToggle=" + this.needToggle + ")";
        }
    }

    private ToolbarRequest() {
    }

    public ToolbarRequest(DefaultConstructorMarker defaultConstructorMarker0) {
    }
}

