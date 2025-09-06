package com.kakao.kandinsky.filter;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModelKt;
import com.kakao.kandinsky.base.KDMviViewModel;
import com.kakao.kandinsky.bitmap.usecase.GetBitmapUseCase;
import com.kakao.kandinsky.core.filter.usecase.DeleteBitmapFilterEngineUseCase;
import com.kakao.kandinsky.core.filter.usecase.GetFilterListUseCase;
import com.kakao.kandinsky.core.filter.usecase.GetFilteredBitmapUseCase;
import com.kakao.kandinsky.core.kdphoto.Effect;
import com.kakao.kandinsky.core.kdphoto.Filter;
import com.kakao.kandinsky.core.kdphoto.KDPhoto;
import com.kakao.kandinsky.filter.contract.EffectMenu;
import com.kakao.kandinsky.filter.contract.FeatureMenu;
import com.kakao.kandinsky.filter.contract.FilterIntent.Cancel;
import com.kakao.kandinsky.filter.contract.FilterIntent.ChangeCurrentFeatureMenu;
import com.kakao.kandinsky.filter.contract.FilterIntent.ChangeEffectValue;
import com.kakao.kandinsky.filter.contract.FilterIntent.ChangeFilter;
import com.kakao.kandinsky.filter.contract.FilterIntent.ChangeFilterIntensity;
import com.kakao.kandinsky.filter.contract.FilterIntent.ClickEffectMenu;
import com.kakao.kandinsky.filter.contract.FilterIntent.Init;
import com.kakao.kandinsky.filter.contract.FilterIntent.OnActivityDestroy;
import com.kakao.kandinsky.filter.contract.FilterIntent.Reset;
import com.kakao.kandinsky.filter.contract.FilterIntent.UpdateContentBounds;
import com.kakao.kandinsky.filter.contract.FilterIntent.UpdatePhoto;
import com.kakao.kandinsky.filter.contract.FilterIntent;
import com.kakao.kandinsky.filter.contract.FilterTracker;
import com.kakao.kandinsky.filter.contract.FilterUiState;
import ea.g;
import ea.h;
import ea.i;
import ea.j;
import ea.k;
import ea.l;
import ea.m;
import ea.n;
import ea.o;
import ea.p;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.TuplesKt;
import kotlin.collections.x;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B)\b\u0007\u0012\u0006\u0010\u0006\u001A\u00020\u0005\u0012\u0006\u0010\b\u001A\u00020\u0007\u0012\u0006\u0010\n\u001A\u00020\t\u0012\u0006\u0010\f\u001A\u00020\u000B¢\u0006\u0004\b\r\u0010\u000EJ\u001F\u0010\u0011\u001A\u00020\u00022\u0006\u0010\u000F\u001A\u00020\u00022\u0006\u0010\u0010\u001A\u00020\u0003H\u0014¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/kakao/kandinsky/filter/FilterViewModel;", "Lcom/kakao/kandinsky/base/KDMviViewModel;", "Lcom/kakao/kandinsky/filter/contract/FilterUiState;", "Lcom/kakao/kandinsky/filter/contract/FilterIntent;", "Lcom/kakao/kandinsky/base/contract/KDEvent;", "Lcom/kakao/kandinsky/core/filter/usecase/GetFilterListUseCase;", "getFilterListUseCase", "Lcom/kakao/kandinsky/bitmap/usecase/GetBitmapUseCase;", "getBitmapUseCase", "Lcom/kakao/kandinsky/core/filter/usecase/GetFilteredBitmapUseCase;", "getFilteredBitmapUseCase", "Lcom/kakao/kandinsky/core/filter/usecase/DeleteBitmapFilterEngineUseCase;", "deleteFilterEngineUseCase", "<init>", "(Lcom/kakao/kandinsky/core/filter/usecase/GetFilterListUseCase;Lcom/kakao/kandinsky/bitmap/usecase/GetBitmapUseCase;Lcom/kakao/kandinsky/core/filter/usecase/GetFilteredBitmapUseCase;Lcom/kakao/kandinsky/core/filter/usecase/DeleteBitmapFilterEngineUseCase;)V", "current", "intent", "handleIntent", "(Lcom/kakao/kandinsky/filter/contract/FilterUiState;Lcom/kakao/kandinsky/filter/contract/FilterIntent;)Lcom/kakao/kandinsky/filter/contract/FilterUiState;", "filter_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class FilterViewModel extends KDMviViewModel {
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 0x30)
    public final class WhenMappings {
        public static final int[] $EnumSwitchMapping$0;

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
        }
    }

    public static final int $stable = 8;
    public final GetFilterListUseCase L0;
    public final GetBitmapUseCase M0;
    public final GetFilteredBitmapUseCase N0;
    public final DeleteBitmapFilterEngineUseCase O0;
    public final LinkedHashMap P0;

    @Inject
    public FilterViewModel(@NotNull GetFilterListUseCase getFilterListUseCase0, @NotNull GetBitmapUseCase getBitmapUseCase0, @NotNull GetFilteredBitmapUseCase getFilteredBitmapUseCase0, @NotNull DeleteBitmapFilterEngineUseCase deleteBitmapFilterEngineUseCase0) {
        Intrinsics.checkNotNullParameter(getFilterListUseCase0, "getFilterListUseCase");
        Intrinsics.checkNotNullParameter(getBitmapUseCase0, "getBitmapUseCase");
        Intrinsics.checkNotNullParameter(getFilteredBitmapUseCase0, "getFilteredBitmapUseCase");
        Intrinsics.checkNotNullParameter(deleteBitmapFilterEngineUseCase0, "deleteFilterEngineUseCase");
        super(new FilterUiState(null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, 0x1FFFF, null));
        this.L0 = getFilterListUseCase0;
        this.M0 = getBitmapUseCase0;
        this.N0 = getFilteredBitmapUseCase0;
        this.O0 = deleteBitmapFilterEngineUseCase0;
        this.P0 = new LinkedHashMap();
    }

    public static Effect a(Effect effect0, EffectMenu effectMenu0, float f) {
        switch(WhenMappings.$EnumSwitchMapping$0[effectMenu0.ordinal()]) {
            case 1: {
                return Effect.copy$default(effect0, f, 0.0f, 0.0f, 0.0f, 0.0f, 30, null);
            }
            case 2: {
                return Effect.copy$default(effect0, 0.0f, f, 0.0f, 0.0f, 0.0f, 29, null);
            }
            case 3: {
                return Effect.copy$default(effect0, 0.0f, 0.0f, f, 0.0f, 0.0f, 27, null);
            }
            case 4: {
                return Effect.copy$default(effect0, 0.0f, 0.0f, 0.0f, f, 0.0f, 23, null);
            }
            case 5: {
                return Effect.copy$default(effect0, 0.0f, 0.0f, 0.0f, 0.0f, f, 15, null);
            }
            default: {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    @NotNull
    public FilterUiState handleIntent(@NotNull FilterUiState filterUiState0, @NotNull FilterIntent filterIntent0) {
        Map map1;
        float f = 1.0f;
        Intrinsics.checkNotNullParameter(filterUiState0, "current");
        Intrinsics.checkNotNullParameter(filterIntent0, "intent");
        if(filterIntent0 instanceof Init) {
            return FilterUiState.copy$default(filterUiState0, null, null, null, ((Init)filterIntent0).isSingleImage(), this.L0.invoke(), null, null, null, new h(this, null), new i(this), new j(this), new k(this), new l(this), new m(this), new n(this), new o(this), new p(this), 0xE7, null);
        }
        if(filterIntent0 instanceof UpdatePhoto) {
            KDPhoto kDPhoto0 = ((UpdatePhoto)filterIntent0).getPhoto();
            boolean z = Intrinsics.areEqual(filterUiState0.getPhoto().getOriginalUri(), kDPhoto0.getOriginalUri());
            if(!z) {
                this.P0.clear();
            }
            return z ? FilterUiState.copy$default(filterUiState0, kDPhoto0, kDPhoto0, null, false, null, filterUiState0.getFilterIntensityMap(), null, null, null, null, null, null, null, null, null, null, null, 0x1FFDC, null) : FilterUiState.copy$default(filterUiState0, kDPhoto0, kDPhoto0, null, false, null, x.emptyMap(), null, null, null, null, null, null, null, null, null, null, null, 0x1FFDC, null);
        }
        if(filterIntent0 instanceof UpdateContentBounds) {
            return FilterUiState.copy$default(filterUiState0, null, null, ((UpdateContentBounds)filterIntent0).getRect(), false, null, null, null, null, null, null, null, null, null, null, null, null, null, 0x1FFFB, null);
        }
        if(filterIntent0 instanceof ChangeCurrentFeatureMenu) {
            FeatureMenu featureMenu0 = ((ChangeCurrentFeatureMenu)filterIntent0).getFeatureMenu();
            FilterTracker.INSTANCE.featureMenuClickEvent(featureMenu0);
            return FilterUiState.copy$default(filterUiState0, null, null, null, false, null, null, ((ChangeCurrentFeatureMenu)filterIntent0).getFeatureMenu(), null, null, null, null, null, null, null, null, null, null, 0x1FFBF, null);
        }
        if(filterIntent0 instanceof ChangeFilter) {
            Filter filter0 = ((ChangeFilter)filterIntent0).getFilter();
            FilterTracker.filterTrackerClickEvent$default(FilterTracker.INSTANCE, filter0.getFilterId(), false, 2, null);
            KDPhoto kDPhoto1 = filterUiState0.getPhoto();
            Float float0 = (Float)filterUiState0.getFilterIntensityMap().get(filter0.getFilterId());
            if(float0 != null) {
                f = (float)float0;
            }
            return FilterUiState.copy$default(filterUiState0, KDPhoto.copy-2Ycw6ww$default(kDPhoto1, null, 0, null, 0L, false, 0, null, 0L, filter0, f, null, null, null, null, 0x3CFF, null), null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, 0x1FFFE, null);
        }
        if(filterIntent0 instanceof ChangeFilterIntensity) {
            Filter filter1 = filterUiState0.getFilter();
            float f1 = ((ChangeFilterIntensity)filterIntent0).getValue();
            Map map0 = filterUiState0.getFilterIntensityMap();
            if(f1 == 1.0f) {
                map1 = x.minus(map0, filter1.getFilterId());
                return FilterUiState.copy$default(filterUiState0, KDPhoto.copy-2Ycw6ww$default(filterUiState0.getPhoto(), null, 0, null, 0L, false, 0, null, 0L, null, 1.0f, null, null, null, null, 0x3DFF, null), null, null, false, null, map1, null, null, null, null, null, null, null, null, null, null, null, 0x1FFDE, null);
            }
            map1 = x.plus(map0, TuplesKt.to(filter1.getFilterId(), f1));
            return FilterUiState.copy$default(filterUiState0, KDPhoto.copy-2Ycw6ww$default(filterUiState0.getPhoto(), null, 0, null, 0L, false, 0, null, 0L, null, f1, null, null, null, null, 0x3DFF, null), null, null, false, null, map1, null, null, null, null, null, null, null, null, null, null, null, 0x1FFDE, null);
        }
        if(filterIntent0 instanceof ClickEffectMenu) {
            EffectMenu effectMenu0 = ((ClickEffectMenu)filterIntent0).getMenu();
            FilterTracker.effectTrackerClickEvent$default(FilterTracker.INSTANCE, effectMenu0, false, 2, null);
            return effectMenu0 == filterUiState0.getEffectMenu() ? FilterUiState.copy$default(filterUiState0, KDPhoto.copy-2Ycw6ww$default(filterUiState0.getPhoto(), null, 0, null, 0L, false, 0, null, 0L, null, 0.0f, FilterViewModel.a(filterUiState0.getEffect(), effectMenu0, 0.0f), null, null, null, 0x3BFF, null), null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, 0x1FFFE, null) : FilterUiState.copy$default(filterUiState0, null, null, null, false, null, null, null, effectMenu0, null, null, null, null, null, null, null, null, null, 0x1FF7F, null);
        }
        if(filterIntent0 instanceof ChangeEffectValue) {
            return FilterUiState.copy$default(filterUiState0, KDPhoto.copy-2Ycw6ww$default(filterUiState0.getPhoto(), null, 0, null, 0L, false, 0, null, 0L, null, 0.0f, FilterViewModel.a(filterUiState0.getEffect(), filterUiState0.getEffectMenu(), ((ChangeEffectValue)filterIntent0).getValue() / ((Number)filterUiState0.getEffectMenu().getRange().getEndInclusive()).floatValue()), null, null, null, 0x3BFF, null), null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, 0x1FFFE, null);
        }
        if(Intrinsics.areEqual(filterIntent0, Reset.INSTANCE)) {
            FilterTracker.INSTANCE.resetClickEvent();
            return FilterUiState.copy$default(filterUiState0, KDPhoto.copy-2Ycw6ww$default(filterUiState0.getPhoto(), null, 0, null, 0L, false, 0, null, 0L, null, 0.0f, new Effect(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0x1F, null), null, null, null, 0x3BFF, null), null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, 0x1FFFE, null);
        }
        if(Intrinsics.areEqual(filterIntent0, Cancel.INSTANCE)) {
            this.cancel(this, filterUiState0.getChanged());
            return filterUiState0;
        }
        if(!Intrinsics.areEqual(filterIntent0, OnActivityDestroy.INSTANCE)) {
            throw new NoWhenBranchMatchedException();
        }
        BuildersKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new g(this, null), 3, null);
        return filterUiState0;
    }

    @Override  // com.kakao.kandinsky.base.KDMviViewModel
    public Object handleIntent(Object object0, Object object1) {
        return this.handleIntent(((FilterUiState)object0), ((FilterIntent)object1));
    }
}

