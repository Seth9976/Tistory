package com.kakao.kandinsky.filter.contract;

import androidx.compose.runtime.internal.StabilityInferred;
import com.kakao.kdtracker.KDTracker;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\bÇ\u0002\u0018\u00002\u00020\u0001J\u001F\u0010\u0007\u001A\u00020\u00062\u0006\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001F\u0010\u000B\u001A\u00020\u00062\u0006\u0010\n\u001A\u00020\t2\b\b\u0002\u0010\u0005\u001A\u00020\u0004¢\u0006\u0004\b\u000B\u0010\fJ\u0015\u0010\u000F\u001A\u00020\u00062\u0006\u0010\u000E\u001A\u00020\r¢\u0006\u0004\b\u000F\u0010\u0010J\r\u0010\u0011\u001A\u00020\u0006¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0013\u001A\u00020\u00062\u0006\u0010\u000E\u001A\u00020\r¢\u0006\u0004\b\u0013\u0010\u0010J\u0015\u0010\u0014\u001A\u00020\u00062\u0006\u0010\u000E\u001A\u00020\r¢\u0006\u0004\b\u0014\u0010\u0010J\u0015\u0010\u0015\u001A\u00020\u00062\u0006\u0010\u000E\u001A\u00020\r¢\u0006\u0004\b\u0015\u0010\u0010¨\u0006\u0016"}, d2 = {"Lcom/kakao/kandinsky/filter/contract/FilterTracker;", "", "", "filterId", "", "isSlider", "", "filterTrackerClickEvent", "(Ljava/lang/String;Z)V", "Lcom/kakao/kandinsky/filter/contract/EffectMenu;", "effect", "effectTrackerClickEvent", "(Lcom/kakao/kandinsky/filter/contract/EffectMenu;Z)V", "Lcom/kakao/kandinsky/filter/contract/FeatureMenu;", "featureMenu", "featureMenuClickEvent", "(Lcom/kakao/kandinsky/filter/contract/FeatureMenu;)V", "resetClickEvent", "()V", "cancelClickEvent", "confirmClickEvent", "multiConfirmClickEvent", "filter_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class FilterTracker {
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 0x30)
    public final class WhenMappings {
        public static final int[] $EnumSwitchMapping$0;
        public static final int[] $EnumSwitchMapping$1;

        static {
            int[] arr_v = new int[EffectMenu.values().length];
            try {
                arr_v[EffectMenu.Brightness.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[EffectMenu.Contrast.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[EffectMenu.Saturation.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[EffectMenu.Temperature.ordinal()] = 4;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[EffectMenu.Vignette.ordinal()] = 5;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            WhenMappings.$EnumSwitchMapping$0 = arr_v;
            int[] arr_v1 = new int[FeatureMenu.values().length];
            try {
                arr_v1[FeatureMenu.Filter.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v1[FeatureMenu.Effect.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            WhenMappings.$EnumSwitchMapping$1 = arr_v1;
        }
    }

    public static final int $stable;
    @NotNull
    public static final FilterTracker INSTANCE;

    static {
        FilterTracker.INSTANCE = new FilterTracker();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    public final void cancelClickEvent(@NotNull FeatureMenu featureMenu0) {
        Intrinsics.checkNotNullParameter(featureMenu0, "featureMenu");
        KDTracker.clickEvent$default(KDTracker.INSTANCE, "footer", (featureMenu0 == FeatureMenu.Filter ? "cancel-filter" : "cancel-retouch"), null, null, 12, null);
    }

    public final void confirmClickEvent(@NotNull FeatureMenu featureMenu0) {
        Intrinsics.checkNotNullParameter(featureMenu0, "featureMenu");
        KDTracker.clickEvent$default(KDTracker.INSTANCE, "footer", (featureMenu0 == FeatureMenu.Filter ? "complete-filter" : "complete-retouch"), null, null, 12, null);
    }

    public final void effectTrackerClickEvent(@NotNull EffectMenu effectMenu0, boolean z) {
        String s;
        Intrinsics.checkNotNullParameter(effectMenu0, "effect");
        switch(WhenMappings.$EnumSwitchMapping$0[effectMenu0.ordinal()]) {
            case 1: {
                s = "brightness";
                break;
            }
            case 2: {
                s = "contrast";
                break;
            }
            case 3: {
                s = "saturation";
                break;
            }
            case 4: {
                s = "warmth";
                break;
            }
            case 5: {
                s = "vignette";
                break;
            }
            default: {
                throw new NoWhenBranchMatchedException();
            }
        }
        KDTracker kDTracker0 = KDTracker.INSTANCE;
        if(z) {
            s = s + "-degree";
        }
        kDTracker0.clickEvent("effect-tab", "retouch-tab", s, "setretouch");
    }

    public static void effectTrackerClickEvent$default(FilterTracker filterTracker0, EffectMenu effectMenu0, boolean z, int v, Object object0) {
        if((v & 2) != 0) {
            z = false;
        }
        filterTracker0.effectTrackerClickEvent(effectMenu0, z);
    }

    public final void featureMenuClickEvent(@NotNull FeatureMenu featureMenu0) {
        Intrinsics.checkNotNullParameter(featureMenu0, "featureMenu");
        KDTracker.clickEvent$default(KDTracker.INSTANCE, "effect-tab", (featureMenu0 == FeatureMenu.Filter ? "filter-tab" : "retouch-tab"), null, null, 12, null);
    }

    public final void filterTrackerClickEvent(@NotNull String s, boolean z) {
        Intrinsics.checkNotNullParameter(s, "filterId");
        KDTracker kDTracker0 = KDTracker.INSTANCE;
        if(z) {
            s = s + "-degree";
        }
        kDTracker0.clickEvent("effect-tab", "filter-tab", s, "setfilter");
    }

    public static void filterTrackerClickEvent$default(FilterTracker filterTracker0, String s, boolean z, int v, Object object0) {
        if((v & 2) != 0) {
            z = false;
        }
        filterTracker0.filterTrackerClickEvent(s, z);
    }

    public final void multiConfirmClickEvent(@NotNull FeatureMenu featureMenu0) {
        String s;
        Intrinsics.checkNotNullParameter(featureMenu0, "featureMenu");
        switch(WhenMappings.$EnumSwitchMapping$1[featureMenu0.ordinal()]) {
            case 1: {
                s = "filter-tab";
                break;
            }
            case 2: {
                s = "retouch-tab";
                break;
            }
            default: {
                throw new NoWhenBranchMatchedException();
            }
        }
        KDTracker.clickEvent$default(KDTracker.INSTANCE, "effect-tab", s, null, "applymultiple", 4, null);
    }

    public final void resetClickEvent() {
        KDTracker.INSTANCE.clickEvent("effect-tab", "retouch-tab", "reset", "setretouch");
    }
}

