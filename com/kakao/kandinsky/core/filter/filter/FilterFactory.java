package com.kakao.kandinsky.core.filter.filter;

import android.content.res.AssetManager;
import com.kakao.kandinsky.core.filter.gl.GLResourcesProvider;
import com.kakao.kandinsky.core.kdphoto.Filter;
import com.kakao.kandinsky.core.kdphoto.FilterAdjustment;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import pd.c;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001B\u0010\f\u001A\b\u0012\u0004\u0012\u00020\u000B0\n2\u0006\u0010\t\u001A\u00020\b¢\u0006\u0004\b\f\u0010\r¨\u0006\u000E"}, d2 = {"Lcom/kakao/kandinsky/core/filter/filter/FilterFactory;", "", "Lcom/kakao/kandinsky/core/filter/gl/GLResourcesProvider;", "glResourcesProvider", "Landroid/content/res/AssetManager;", "assetManager", "<init>", "(Lcom/kakao/kandinsky/core/filter/gl/GLResourcesProvider;Landroid/content/res/AssetManager;)V", "Lcom/kakao/kandinsky/core/kdphoto/Filter;", "filter", "", "Lcom/kakao/kandinsky/core/filter/filter/BaseFilter;", "createFilterList", "(Lcom/kakao/kandinsky/core/kdphoto/Filter;)Ljava/util/List;", "filter_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nFilterFactory.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FilterFactory.kt\ncom/kakao/kandinsky/core/filter/filter/FilterFactory\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,26:1\n1045#2:27\n1549#2:28\n1620#2,3:29\n*S KotlinDebug\n*F\n+ 1 FilterFactory.kt\ncom/kakao/kandinsky/core/filter/filter/FilterFactory\n*L\n14#1:27\n14#1:28\n14#1:29,3\n*E\n"})
public final class FilterFactory {
    public final GLResourcesProvider a;
    public final AssetManager b;

    public FilterFactory(@NotNull GLResourcesProvider gLResourcesProvider0, @NotNull AssetManager assetManager0) {
        Intrinsics.checkNotNullParameter(gLResourcesProvider0, "glResourcesProvider");
        Intrinsics.checkNotNullParameter(assetManager0, "assetManager");
        super();
        this.a = gLResourcesProvider0;
        this.b = assetManager0;
    }

    @NotNull
    public final List createFilterList(@NotNull Filter filter0) {
        Intrinsics.checkNotNullParameter(filter0, "filter");
        Iterable iterable0 = CollectionsKt___CollectionsKt.sortedWith(filter0.getAdjustments(), new com.kakao.kandinsky.core.filter.filter.FilterFactory.createFilterList..inlined.sortedBy.1());
        List list0 = new ArrayList(l.collectionSizeOrDefault(iterable0, 10));
        for(Object object0: iterable0) {
            FilterAdjustment filterAdjustment0 = (FilterAdjustment)object0;
            boolean z = Intrinsics.areEqual(filterAdjustment0.getModule(), "lookup512");
            GLResourcesProvider gLResourcesProvider0 = this.a;
            Lookup512Filter lookup512Filter0 = z ? new Lookup512Filter(gLResourcesProvider0, this.b, filterAdjustment0.getParams()) : new PassFilter(gLResourcesProvider0);
            list0.add(lookup512Filter0);
        }
        return list0;

        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0010\u0000\u001A\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000E\u0010\u0003\u001A\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000E\u0010\u0005\u001A\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"<anonymous>", "", "T", "a", "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2"}, k = 3, mv = {1, 9, 0}, xi = 0x30)
        @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 FilterFactory.kt\ncom/kakao/kandinsky/core/filter/filter/FilterFactory\n*L\n1#1,328:1\n14#2:329\n*E\n"})
        public final class com.kakao.kandinsky.core.filter.filter.FilterFactory.createFilterList..inlined.sortedBy.1 implements Comparator {
            @Override
            public final int compare(Object object0, Object object1) {
                return c.compareValues(((FilterAdjustment)object0).getAdjustmentId(), ((FilterAdjustment)object1).getAdjustmentId());
            }
        }

    }
}

