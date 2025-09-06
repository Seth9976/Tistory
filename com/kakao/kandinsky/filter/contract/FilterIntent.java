package com.kakao.kandinsky.filter.contract;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Rect;
import androidx.room.a;
import com.kakao.kandinsky.core.kdphoto.Filter;
import com.kakao.kandinsky.core.kdphoto.KDPhoto;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u000B\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000B\f\u0082\u0001\u000B\r\u000E\u000F\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017¨\u0006\u0018"}, d2 = {"Lcom/kakao/kandinsky/filter/contract/FilterIntent;", "", "Cancel", "ChangeCurrentFeatureMenu", "ChangeEffectValue", "ChangeFilter", "ChangeFilterIntensity", "ClickEffectMenu", "Init", "OnActivityDestroy", "Reset", "UpdateContentBounds", "UpdatePhoto", "Lcom/kakao/kandinsky/filter/contract/FilterIntent$Cancel;", "Lcom/kakao/kandinsky/filter/contract/FilterIntent$ChangeCurrentFeatureMenu;", "Lcom/kakao/kandinsky/filter/contract/FilterIntent$ChangeEffectValue;", "Lcom/kakao/kandinsky/filter/contract/FilterIntent$ChangeFilter;", "Lcom/kakao/kandinsky/filter/contract/FilterIntent$ChangeFilterIntensity;", "Lcom/kakao/kandinsky/filter/contract/FilterIntent$ClickEffectMenu;", "Lcom/kakao/kandinsky/filter/contract/FilterIntent$Init;", "Lcom/kakao/kandinsky/filter/contract/FilterIntent$OnActivityDestroy;", "Lcom/kakao/kandinsky/filter/contract/FilterIntent$Reset;", "Lcom/kakao/kandinsky/filter/contract/FilterIntent$UpdateContentBounds;", "Lcom/kakao/kandinsky/filter/contract/FilterIntent$UpdatePhoto;", "filter_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public interface FilterIntent {
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001A\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001A\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001A\u0010\u000B\u001A\u00020\n2\b\u0010\t\u001A\u0004\u0018\u00010\bHÖ\u0003¢\u0006\u0004\b\u000B\u0010\f¨\u0006\r"}, d2 = {"Lcom/kakao/kandinsky/filter/contract/FilterIntent$Cancel;", "Lcom/kakao/kandinsky/filter/contract/FilterIntent;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "filter_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Cancel implements FilterIntent {
        public static final int $stable;
        @NotNull
        public static final Cancel INSTANCE;

        static {
            Cancel.INSTANCE = new Cancel();  // 初始化器: Ljava/lang/Object;-><init>()V
        }

        // 去混淆评级： 低(20)
        @Override
        public boolean equals(@Nullable Object object0) {
            return this == object0 ? true : object0 instanceof Cancel;
        }

        @Override
        public int hashCode() {
            return 0xD1ED4458;
        }

        @Override
        @NotNull
        public String toString() {
            return "Cancel";
        }
    }

    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001A\u0010\b\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000B\u001A\u00020\nHÖ\u0001¢\u0006\u0004\b\u000B\u0010\fJ\u0010\u0010\u000E\u001A\u00020\rHÖ\u0001¢\u0006\u0004\b\u000E\u0010\u000FJ\u001A\u0010\u0013\u001A\u00020\u00122\b\u0010\u0011\u001A\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001A\u0004\b\u0017\u0010\u0007¨\u0006\u0018"}, d2 = {"Lcom/kakao/kandinsky/filter/contract/FilterIntent$ChangeCurrentFeatureMenu;", "Lcom/kakao/kandinsky/filter/contract/FilterIntent;", "Lcom/kakao/kandinsky/filter/contract/FeatureMenu;", "featureMenu", "<init>", "(Lcom/kakao/kandinsky/filter/contract/FeatureMenu;)V", "component1", "()Lcom/kakao/kandinsky/filter/contract/FeatureMenu;", "copy", "(Lcom/kakao/kandinsky/filter/contract/FeatureMenu;)Lcom/kakao/kandinsky/filter/contract/FilterIntent$ChangeCurrentFeatureMenu;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/kakao/kandinsky/filter/contract/FeatureMenu;", "getFeatureMenu", "filter_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class ChangeCurrentFeatureMenu implements FilterIntent {
        public static final int $stable;
        public final FeatureMenu a;

        public ChangeCurrentFeatureMenu(@NotNull FeatureMenu featureMenu0) {
            Intrinsics.checkNotNullParameter(featureMenu0, "featureMenu");
            super();
            this.a = featureMenu0;
        }

        @NotNull
        public final FeatureMenu component1() {
            return this.a;
        }

        @NotNull
        public final ChangeCurrentFeatureMenu copy(@NotNull FeatureMenu featureMenu0) {
            Intrinsics.checkNotNullParameter(featureMenu0, "featureMenu");
            return new ChangeCurrentFeatureMenu(featureMenu0);
        }

        public static ChangeCurrentFeatureMenu copy$default(ChangeCurrentFeatureMenu filterIntent$ChangeCurrentFeatureMenu0, FeatureMenu featureMenu0, int v, Object object0) {
            if((v & 1) != 0) {
                featureMenu0 = filterIntent$ChangeCurrentFeatureMenu0.a;
            }
            return filterIntent$ChangeCurrentFeatureMenu0.copy(featureMenu0);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            return object0 instanceof ChangeCurrentFeatureMenu ? this.a == ((ChangeCurrentFeatureMenu)object0).a : false;
        }

        @NotNull
        public final FeatureMenu getFeatureMenu() {
            return this.a;
        }

        @Override
        public int hashCode() {
            return this.a.hashCode();
        }

        @Override
        @NotNull
        public String toString() {
            return "ChangeCurrentFeatureMenu(featureMenu=" + this.a + ")";
        }
    }

    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001A\u0010\b\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000B\u001A\u00020\nHÖ\u0001¢\u0006\u0004\b\u000B\u0010\fJ\u0010\u0010\u000E\u001A\u00020\rHÖ\u0001¢\u0006\u0004\b\u000E\u0010\u000FJ\u001A\u0010\u0013\u001A\u00020\u00122\b\u0010\u0011\u001A\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001A\u0004\b\u0017\u0010\u0007¨\u0006\u0018"}, d2 = {"Lcom/kakao/kandinsky/filter/contract/FilterIntent$ChangeEffectValue;", "Lcom/kakao/kandinsky/filter/contract/FilterIntent;", "", "value", "<init>", "(F)V", "component1", "()F", "copy", "(F)Lcom/kakao/kandinsky/filter/contract/FilterIntent$ChangeEffectValue;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "F", "getValue", "filter_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class ChangeEffectValue implements FilterIntent {
        public static final int $stable;
        public final float a;

        public ChangeEffectValue(float f) {
            this.a = f;
        }

        public final float component1() {
            return this.a;
        }

        @NotNull
        public final ChangeEffectValue copy(float f) {
            return new ChangeEffectValue(f);
        }

        public static ChangeEffectValue copy$default(ChangeEffectValue filterIntent$ChangeEffectValue0, float f, int v, Object object0) {
            if((v & 1) != 0) {
                f = filterIntent$ChangeEffectValue0.a;
            }
            return filterIntent$ChangeEffectValue0.copy(f);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            return object0 instanceof ChangeEffectValue ? Float.compare(this.a, ((ChangeEffectValue)object0).a) == 0 : false;
        }

        public final float getValue() {
            return this.a;
        }

        @Override
        public int hashCode() {
            return Float.hashCode(this.a);
        }

        @Override
        @NotNull
        public String toString() {
            StringBuilder stringBuilder0 = new StringBuilder("ChangeEffectValue(value=");
            return a.h(this.a, ")", stringBuilder0);
        }
    }

    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001A\u0010\b\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000B\u001A\u00020\nHÖ\u0001¢\u0006\u0004\b\u000B\u0010\fJ\u0010\u0010\u000E\u001A\u00020\rHÖ\u0001¢\u0006\u0004\b\u000E\u0010\u000FJ\u001A\u0010\u0013\u001A\u00020\u00122\b\u0010\u0011\u001A\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001A\u0004\b\u0017\u0010\u0007¨\u0006\u0018"}, d2 = {"Lcom/kakao/kandinsky/filter/contract/FilterIntent$ChangeFilter;", "Lcom/kakao/kandinsky/filter/contract/FilterIntent;", "Lcom/kakao/kandinsky/core/kdphoto/Filter;", "filter", "<init>", "(Lcom/kakao/kandinsky/core/kdphoto/Filter;)V", "component1", "()Lcom/kakao/kandinsky/core/kdphoto/Filter;", "copy", "(Lcom/kakao/kandinsky/core/kdphoto/Filter;)Lcom/kakao/kandinsky/filter/contract/FilterIntent$ChangeFilter;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/kakao/kandinsky/core/kdphoto/Filter;", "getFilter", "filter_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class ChangeFilter implements FilterIntent {
        public static final int $stable;
        public final Filter a;

        public ChangeFilter(@NotNull Filter filter0) {
            Intrinsics.checkNotNullParameter(filter0, "filter");
            super();
            this.a = filter0;
        }

        @NotNull
        public final Filter component1() {
            return this.a;
        }

        @NotNull
        public final ChangeFilter copy(@NotNull Filter filter0) {
            Intrinsics.checkNotNullParameter(filter0, "filter");
            return new ChangeFilter(filter0);
        }

        public static ChangeFilter copy$default(ChangeFilter filterIntent$ChangeFilter0, Filter filter0, int v, Object object0) {
            if((v & 1) != 0) {
                filter0 = filterIntent$ChangeFilter0.a;
            }
            return filterIntent$ChangeFilter0.copy(filter0);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            return object0 instanceof ChangeFilter ? Intrinsics.areEqual(this.a, ((ChangeFilter)object0).a) : false;
        }

        @NotNull
        public final Filter getFilter() {
            return this.a;
        }

        @Override
        public int hashCode() {
            return this.a.hashCode();
        }

        @Override
        @NotNull
        public String toString() {
            return "ChangeFilter(filter=" + this.a + ")";
        }
    }

    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001A\u0010\b\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000B\u001A\u00020\nHÖ\u0001¢\u0006\u0004\b\u000B\u0010\fJ\u0010\u0010\u000E\u001A\u00020\rHÖ\u0001¢\u0006\u0004\b\u000E\u0010\u000FJ\u001A\u0010\u0013\u001A\u00020\u00122\b\u0010\u0011\u001A\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001A\u0004\b\u0017\u0010\u0007¨\u0006\u0018"}, d2 = {"Lcom/kakao/kandinsky/filter/contract/FilterIntent$ChangeFilterIntensity;", "Lcom/kakao/kandinsky/filter/contract/FilterIntent;", "", "value", "<init>", "(F)V", "component1", "()F", "copy", "(F)Lcom/kakao/kandinsky/filter/contract/FilterIntent$ChangeFilterIntensity;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "F", "getValue", "filter_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class ChangeFilterIntensity implements FilterIntent {
        public static final int $stable;
        public final float a;

        public ChangeFilterIntensity(float f) {
            this.a = f;
        }

        public final float component1() {
            return this.a;
        }

        @NotNull
        public final ChangeFilterIntensity copy(float f) {
            return new ChangeFilterIntensity(f);
        }

        public static ChangeFilterIntensity copy$default(ChangeFilterIntensity filterIntent$ChangeFilterIntensity0, float f, int v, Object object0) {
            if((v & 1) != 0) {
                f = filterIntent$ChangeFilterIntensity0.a;
            }
            return filterIntent$ChangeFilterIntensity0.copy(f);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            return object0 instanceof ChangeFilterIntensity ? Float.compare(this.a, ((ChangeFilterIntensity)object0).a) == 0 : false;
        }

        public final float getValue() {
            return this.a;
        }

        @Override
        public int hashCode() {
            return Float.hashCode(this.a);
        }

        @Override
        @NotNull
        public String toString() {
            StringBuilder stringBuilder0 = new StringBuilder("ChangeFilterIntensity(value=");
            return a.h(this.a, ")", stringBuilder0);
        }
    }

    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001A\u0010\b\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000B\u001A\u00020\nHÖ\u0001¢\u0006\u0004\b\u000B\u0010\fJ\u0010\u0010\u000E\u001A\u00020\rHÖ\u0001¢\u0006\u0004\b\u000E\u0010\u000FJ\u001A\u0010\u0013\u001A\u00020\u00122\b\u0010\u0011\u001A\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001A\u0004\b\u0017\u0010\u0007¨\u0006\u0018"}, d2 = {"Lcom/kakao/kandinsky/filter/contract/FilterIntent$ClickEffectMenu;", "Lcom/kakao/kandinsky/filter/contract/FilterIntent;", "Lcom/kakao/kandinsky/filter/contract/EffectMenu;", "menu", "<init>", "(Lcom/kakao/kandinsky/filter/contract/EffectMenu;)V", "component1", "()Lcom/kakao/kandinsky/filter/contract/EffectMenu;", "copy", "(Lcom/kakao/kandinsky/filter/contract/EffectMenu;)Lcom/kakao/kandinsky/filter/contract/FilterIntent$ClickEffectMenu;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/kakao/kandinsky/filter/contract/EffectMenu;", "getMenu", "filter_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class ClickEffectMenu implements FilterIntent {
        public static final int $stable;
        public final EffectMenu a;

        public ClickEffectMenu(@NotNull EffectMenu effectMenu0) {
            Intrinsics.checkNotNullParameter(effectMenu0, "menu");
            super();
            this.a = effectMenu0;
        }

        @NotNull
        public final EffectMenu component1() {
            return this.a;
        }

        @NotNull
        public final ClickEffectMenu copy(@NotNull EffectMenu effectMenu0) {
            Intrinsics.checkNotNullParameter(effectMenu0, "menu");
            return new ClickEffectMenu(effectMenu0);
        }

        public static ClickEffectMenu copy$default(ClickEffectMenu filterIntent$ClickEffectMenu0, EffectMenu effectMenu0, int v, Object object0) {
            if((v & 1) != 0) {
                effectMenu0 = filterIntent$ClickEffectMenu0.a;
            }
            return filterIntent$ClickEffectMenu0.copy(effectMenu0);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            return object0 instanceof ClickEffectMenu ? this.a == ((ClickEffectMenu)object0).a : false;
        }

        @NotNull
        public final EffectMenu getMenu() {
            return this.a;
        }

        @Override
        public int hashCode() {
            return this.a.hashCode();
        }

        @Override
        @NotNull
        public String toString() {
            return "ClickEffectMenu(menu=" + this.a + ")";
        }
    }

    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000B\n\u0002\b\u0007\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001A\u0010\b\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000B\u001A\u00020\nHÖ\u0001¢\u0006\u0004\b\u000B\u0010\fJ\u0010\u0010\u000E\u001A\u00020\rHÖ\u0001¢\u0006\u0004\b\u000E\u0010\u000FJ\u001A\u0010\u0012\u001A\u00020\u00022\b\u0010\u0011\u001A\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001A\u0004\b\u0003\u0010\u0007¨\u0006\u0016"}, d2 = {"Lcom/kakao/kandinsky/filter/contract/FilterIntent$Init;", "Lcom/kakao/kandinsky/filter/contract/FilterIntent;", "", "isSingleImage", "<init>", "(Z)V", "component1", "()Z", "copy", "(Z)Lcom/kakao/kandinsky/filter/contract/FilterIntent$Init;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "filter_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Init implements FilterIntent {
        public static final int $stable;
        public final boolean a;

        public Init(boolean z) {
            this.a = z;
        }

        public final boolean component1() {
            return this.a;
        }

        @NotNull
        public final Init copy(boolean z) {
            return new Init(z);
        }

        public static Init copy$default(Init filterIntent$Init0, boolean z, int v, Object object0) {
            if((v & 1) != 0) {
                z = filterIntent$Init0.a;
            }
            return filterIntent$Init0.copy(z);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            return object0 instanceof Init ? this.a == ((Init)object0).a : false;
        }

        @Override
        public int hashCode() {
            return Boolean.hashCode(this.a);
        }

        public final boolean isSingleImage() {
            return this.a;
        }

        @Override
        @NotNull
        public String toString() {
            return "Init(isSingleImage=" + this.a + ")";
        }
    }

    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001A\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001A\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001A\u0010\u000B\u001A\u00020\n2\b\u0010\t\u001A\u0004\u0018\u00010\bHÖ\u0003¢\u0006\u0004\b\u000B\u0010\f¨\u0006\r"}, d2 = {"Lcom/kakao/kandinsky/filter/contract/FilterIntent$OnActivityDestroy;", "Lcom/kakao/kandinsky/filter/contract/FilterIntent;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "filter_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class OnActivityDestroy implements FilterIntent {
        public static final int $stable;
        @NotNull
        public static final OnActivityDestroy INSTANCE;

        static {
            OnActivityDestroy.INSTANCE = new OnActivityDestroy();  // 初始化器: Ljava/lang/Object;-><init>()V
        }

        // 去混淆评级： 低(20)
        @Override
        public boolean equals(@Nullable Object object0) {
            return this == object0 ? true : object0 instanceof OnActivityDestroy;
        }

        @Override
        public int hashCode() {
            return 0xAC5D096E;
        }

        @Override
        @NotNull
        public String toString() {
            return "OnActivityDestroy";
        }
    }

    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001A\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001A\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001A\u0010\u000B\u001A\u00020\n2\b\u0010\t\u001A\u0004\u0018\u00010\bHÖ\u0003¢\u0006\u0004\b\u000B\u0010\f¨\u0006\r"}, d2 = {"Lcom/kakao/kandinsky/filter/contract/FilterIntent$Reset;", "Lcom/kakao/kandinsky/filter/contract/FilterIntent;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "filter_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Reset implements FilterIntent {
        public static final int $stable;
        @NotNull
        public static final Reset INSTANCE;

        static {
            Reset.INSTANCE = new Reset();  // 初始化器: Ljava/lang/Object;-><init>()V
        }

        // 去混淆评级： 低(20)
        @Override
        public boolean equals(@Nullable Object object0) {
            return this == object0 ? true : object0 instanceof Reset;
        }

        @Override
        public int hashCode() {
            return 0x8379D3B1;
        }

        @Override
        @NotNull
        public String toString() {
            return "Reset";
        }
    }

    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001A\u0010\b\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000B\u001A\u00020\nHÖ\u0001¢\u0006\u0004\b\u000B\u0010\fJ\u0010\u0010\u000E\u001A\u00020\rHÖ\u0001¢\u0006\u0004\b\u000E\u0010\u000FJ\u001A\u0010\u0013\u001A\u00020\u00122\b\u0010\u0011\u001A\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001A\u0004\b\u0017\u0010\u0007¨\u0006\u0018"}, d2 = {"Lcom/kakao/kandinsky/filter/contract/FilterIntent$UpdateContentBounds;", "Lcom/kakao/kandinsky/filter/contract/FilterIntent;", "Landroidx/compose/ui/geometry/Rect;", "rect", "<init>", "(Landroidx/compose/ui/geometry/Rect;)V", "component1", "()Landroidx/compose/ui/geometry/Rect;", "copy", "(Landroidx/compose/ui/geometry/Rect;)Lcom/kakao/kandinsky/filter/contract/FilterIntent$UpdateContentBounds;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Landroidx/compose/ui/geometry/Rect;", "getRect", "filter_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class UpdateContentBounds implements FilterIntent {
        public static final int $stable;
        public final Rect a;

        public UpdateContentBounds(@NotNull Rect rect0) {
            Intrinsics.checkNotNullParameter(rect0, "rect");
            super();
            this.a = rect0;
        }

        @NotNull
        public final Rect component1() {
            return this.a;
        }

        @NotNull
        public final UpdateContentBounds copy(@NotNull Rect rect0) {
            Intrinsics.checkNotNullParameter(rect0, "rect");
            return new UpdateContentBounds(rect0);
        }

        public static UpdateContentBounds copy$default(UpdateContentBounds filterIntent$UpdateContentBounds0, Rect rect0, int v, Object object0) {
            if((v & 1) != 0) {
                rect0 = filterIntent$UpdateContentBounds0.a;
            }
            return filterIntent$UpdateContentBounds0.copy(rect0);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            return object0 instanceof UpdateContentBounds ? Intrinsics.areEqual(this.a, ((UpdateContentBounds)object0).a) : false;
        }

        @NotNull
        public final Rect getRect() {
            return this.a;
        }

        @Override
        public int hashCode() {
            return this.a.hashCode();
        }

        @Override
        @NotNull
        public String toString() {
            return "UpdateContentBounds(rect=" + this.a + ")";
        }
    }

    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001A\u0010\b\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000B\u001A\u00020\nHÖ\u0001¢\u0006\u0004\b\u000B\u0010\fJ\u0010\u0010\u000E\u001A\u00020\rHÖ\u0001¢\u0006\u0004\b\u000E\u0010\u000FJ\u001A\u0010\u0013\u001A\u00020\u00122\b\u0010\u0011\u001A\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001A\u0004\b\u0017\u0010\u0007¨\u0006\u0018"}, d2 = {"Lcom/kakao/kandinsky/filter/contract/FilterIntent$UpdatePhoto;", "Lcom/kakao/kandinsky/filter/contract/FilterIntent;", "Lcom/kakao/kandinsky/core/kdphoto/KDPhoto;", "photo", "<init>", "(Lcom/kakao/kandinsky/core/kdphoto/KDPhoto;)V", "component1", "()Lcom/kakao/kandinsky/core/kdphoto/KDPhoto;", "copy", "(Lcom/kakao/kandinsky/core/kdphoto/KDPhoto;)Lcom/kakao/kandinsky/filter/contract/FilterIntent$UpdatePhoto;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/kakao/kandinsky/core/kdphoto/KDPhoto;", "getPhoto", "filter_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class UpdatePhoto implements FilterIntent {
        public static final int $stable;
        public final KDPhoto a;

        public UpdatePhoto(@NotNull KDPhoto kDPhoto0) {
            Intrinsics.checkNotNullParameter(kDPhoto0, "photo");
            super();
            this.a = kDPhoto0;
        }

        @NotNull
        public final KDPhoto component1() {
            return this.a;
        }

        @NotNull
        public final UpdatePhoto copy(@NotNull KDPhoto kDPhoto0) {
            Intrinsics.checkNotNullParameter(kDPhoto0, "photo");
            return new UpdatePhoto(kDPhoto0);
        }

        public static UpdatePhoto copy$default(UpdatePhoto filterIntent$UpdatePhoto0, KDPhoto kDPhoto0, int v, Object object0) {
            if((v & 1) != 0) {
                kDPhoto0 = filterIntent$UpdatePhoto0.a;
            }
            return filterIntent$UpdatePhoto0.copy(kDPhoto0);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            return object0 instanceof UpdatePhoto ? Intrinsics.areEqual(this.a, ((UpdatePhoto)object0).a) : false;
        }

        @NotNull
        public final KDPhoto getPhoto() {
            return this.a;
        }

        @Override
        public int hashCode() {
            return this.a.hashCode();
        }

        @Override
        @NotNull
        public String toString() {
            return "UpdatePhoto(photo=" + this.a + ")";
        }
    }

}

