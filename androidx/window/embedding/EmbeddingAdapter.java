package androidx.window.embedding;

import android.annotation.SuppressLint;
import androidx.window.core.ExperimentalWindowApi;
import androidx.window.extensions.embedding.ActivityRule.Builder;
import androidx.window.extensions.embedding.ActivityStack;
import androidx.window.extensions.embedding.EmbeddingRule;
import androidx.window.extensions.embedding.SplitPairRule.Builder;
import androidx.window.extensions.embedding.SplitPlaceholderRule.Builder;
import j5.a;
import j5.b;
import j5.c;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.l;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@ExperimentalWindowApi
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\b\u001A\b\u0012\u0004\u0012\u00020\u00070\u00042\f\u0010\u0006\u001A\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\b\u0010\tJ/\u0010\u0010\u001A\u0014\u0012\u0010\u0012\u000E\u0012\u0004\u0012\u00020\u000F\u0012\u0004\u0012\u00020\u000F0\u000E0\r2\f\u0010\f\u001A\b\u0012\u0004\u0012\u00020\u000B0\nH\u0007¢\u0006\u0004\b\u0010\u0010\u0011J/\u0010\u0013\u001A\u0014\u0012\u0010\u0012\u000E\u0012\u0004\u0012\u00020\u000F\u0012\u0004\u0012\u00020\u00120\u000E0\r2\f\u0010\f\u001A\b\u0012\u0004\u0012\u00020\u000B0\nH\u0007¢\u0006\u0004\b\u0013\u0010\u0011J\u001D\u0010\u0017\u001A\b\u0012\u0004\u0012\u00020\u00160\r2\u0006\u0010\u0015\u001A\u00020\u0014H\u0007¢\u0006\u0004\b\u0017\u0010\u0018J#\u0010\u001B\u001A\b\u0012\u0004\u0012\u00020\u000F0\r2\f\u0010\u001A\u001A\b\u0012\u0004\u0012\u00020\u00190\nH\u0007¢\u0006\u0004\b\u001B\u0010\u0011J#\u0010\u001C\u001A\b\u0012\u0004\u0012\u00020\u00120\r2\f\u0010\u001A\u001A\b\u0012\u0004\u0012\u00020\u00190\nH\u0007¢\u0006\u0004\b\u001C\u0010\u0011J!\u0010\b\u001A\b\u0012\u0004\u0012\u00020\u001F0\n2\f\u0010\u001E\u001A\b\u0012\u0004\u0012\u00020\u001D0\n¢\u0006\u0004\b\b\u0010 ¨\u0006!"}, d2 = {"Landroidx/window/embedding/EmbeddingAdapter;", "", "<init>", "()V", "", "Landroidx/window/extensions/embedding/SplitInfo;", "splitInfoList", "Landroidx/window/embedding/SplitInfo;", "translate", "(Ljava/util/List;)Ljava/util/List;", "", "Landroidx/window/embedding/SplitPairFilter;", "splitPairFilters", "Ljava/util/function/Predicate;", "Landroid/util/Pair;", "Landroid/app/Activity;", "translateActivityPairPredicates", "(Ljava/util/Set;)Ljava/util/function/Predicate;", "Landroid/content/Intent;", "translateActivityIntentPredicates", "Landroidx/window/embedding/SplitRule;", "splitRule", "Landroid/view/WindowMetrics;", "translateParentMetricsPredicate", "(Landroidx/window/embedding/SplitRule;)Ljava/util/function/Predicate;", "Landroidx/window/embedding/ActivityFilter;", "activityFilters", "translateActivityPredicates", "translateIntentPredicates", "Landroidx/window/embedding/EmbeddingRule;", "rules", "Landroidx/window/extensions/embedding/EmbeddingRule;", "(Ljava/util/Set;)Ljava/util/Set;", "window_release"}, k = 1, mv = {1, 6, 0}, xi = 0x30)
public final class EmbeddingAdapter {
    public static SplitInfo a(androidx.window.extensions.embedding.SplitInfo splitInfo0) {
        boolean z1;
        ActivityStack activityStack0 = splitInfo0.getPrimaryActivityStack();
        Intrinsics.checkNotNullExpressionValue(activityStack0, "splitInfo.primaryActivityStack");
        boolean z = false;
        try {
            z1 = false;
            z1 = activityStack0.isEmpty();
        }
        catch(NoSuchMethodError unused_ex) {
        }
        List list0 = activityStack0.getActivities();
        Intrinsics.checkNotNullExpressionValue(list0, "primaryActivityStack.activities");
        androidx.window.embedding.ActivityStack activityStack1 = new androidx.window.embedding.ActivityStack(list0, z1);
        ActivityStack activityStack2 = splitInfo0.getSecondaryActivityStack();
        Intrinsics.checkNotNullExpressionValue(activityStack2, "splitInfo.secondaryActivityStack");
        try {
            z = activityStack2.isEmpty();
        }
        catch(NoSuchMethodError unused_ex) {
        }
        List list1 = activityStack2.getActivities();
        Intrinsics.checkNotNullExpressionValue(list1, "secondaryActivityStack.activities");
        return new SplitInfo(activityStack1, new androidx.window.embedding.ActivityStack(list1, z), splitInfo0.getSplitRatio());
    }

    @NotNull
    public final List translate(@NotNull List list0) {
        Intrinsics.checkNotNullParameter(list0, "splitInfoList");
        List list1 = new ArrayList(l.collectionSizeOrDefault(list0, 10));
        for(Object object0: list0) {
            ((ArrayList)list1).add(EmbeddingAdapter.a(((androidx.window.extensions.embedding.SplitInfo)object0)));
        }
        return list1;
    }

    @NotNull
    public final Set translate(@NotNull Set set0) {
        EmbeddingRule embeddingRule1;
        Intrinsics.checkNotNullParameter(set0, "rules");
        ArrayList arrayList0 = new ArrayList(l.collectionSizeOrDefault(set0, 10));
        for(Object object0: set0) {
            androidx.window.embedding.EmbeddingRule embeddingRule0 = (androidx.window.embedding.EmbeddingRule)object0;
            if(embeddingRule0 instanceof SplitPairRule) {
                androidx.window.extensions.embedding.SplitPairRule splitPairRule0 = new SplitPairRule.Builder(this.translateActivityPairPredicates(((SplitPairRule)embeddingRule0).getFilters()), this.translateActivityIntentPredicates(((SplitPairRule)embeddingRule0).getFilters()), this.translateParentMetricsPredicate(((SplitRule)embeddingRule0))).setSplitRatio(((SplitPairRule)embeddingRule0).getSplitRatio()).setLayoutDirection(((SplitPairRule)embeddingRule0).getLayoutDirection()).setShouldFinishPrimaryWithSecondary(((SplitPairRule)embeddingRule0).getFinishPrimaryWithSecondary()).setShouldFinishSecondaryWithPrimary(((SplitPairRule)embeddingRule0).getFinishSecondaryWithPrimary()).setShouldClearTop(((SplitPairRule)embeddingRule0).getClearTop()).build();
                Intrinsics.checkNotNullExpressionValue(splitPairRule0, "SplitPairRuleBuilder(\n  …                 .build()");
                embeddingRule1 = (EmbeddingRule)splitPairRule0;
            }
            else if(embeddingRule0 instanceof SplitPlaceholderRule) {
                androidx.window.extensions.embedding.SplitPlaceholderRule splitPlaceholderRule0 = new SplitPlaceholderRule.Builder(((SplitPlaceholderRule)embeddingRule0).getPlaceholderIntent(), this.translateActivityPredicates(((SplitPlaceholderRule)embeddingRule0).getFilters()), this.translateIntentPredicates(((SplitPlaceholderRule)embeddingRule0).getFilters()), this.translateParentMetricsPredicate(((SplitRule)embeddingRule0))).setSplitRatio(((SplitPlaceholderRule)embeddingRule0).getSplitRatio()).setLayoutDirection(((SplitPlaceholderRule)embeddingRule0).getLayoutDirection()).build();
                Intrinsics.checkNotNullExpressionValue(splitPlaceholderRule0, "SplitPlaceholderRuleBuil…                 .build()");
                embeddingRule1 = (EmbeddingRule)splitPlaceholderRule0;
            }
            else {
                if(!(embeddingRule0 instanceof ActivityRule)) {
                    throw new IllegalArgumentException("Unsupported rule type");
                }
                androidx.window.extensions.embedding.ActivityRule activityRule0 = new ActivityRule.Builder(this.translateActivityPredicates(((ActivityRule)embeddingRule0).getFilters()), this.translateIntentPredicates(((ActivityRule)embeddingRule0).getFilters())).setShouldAlwaysExpand(((ActivityRule)embeddingRule0).getAlwaysExpand()).build();
                Intrinsics.checkNotNullExpressionValue(activityRule0, "ActivityRuleBuilder(\n   …                 .build()");
                embeddingRule1 = (EmbeddingRule)activityRule0;
            }
            arrayList0.add(embeddingRule1);
        }
        return CollectionsKt___CollectionsKt.toSet(arrayList0);
    }

    @SuppressLint({"ClassVerificationFailure", "NewApi"})
    @NotNull
    public final Predicate translateActivityIntentPredicates(@NotNull Set set0) {
        Intrinsics.checkNotNullParameter(set0, "splitPairFilters");
        return new c(this, set0, 1);
    }

    @SuppressLint({"ClassVerificationFailure", "NewApi"})
    @NotNull
    public final Predicate translateActivityPairPredicates(@NotNull Set set0) {
        Intrinsics.checkNotNullParameter(set0, "splitPairFilters");
        return new c(this, set0, 0);
    }

    @SuppressLint({"ClassVerificationFailure", "NewApi"})
    @NotNull
    public final Predicate translateActivityPredicates(@NotNull Set set0) {
        Intrinsics.checkNotNullParameter(set0, "activityFilters");
        return new a(set0, 1);
    }

    @SuppressLint({"ClassVerificationFailure", "NewApi"})
    @NotNull
    public final Predicate translateIntentPredicates(@NotNull Set set0) {
        Intrinsics.checkNotNullParameter(set0, "activityFilters");
        return new a(set0, 0);
    }

    @SuppressLint({"ClassVerificationFailure", "NewApi"})
    @NotNull
    public final Predicate translateParentMetricsPredicate(@NotNull SplitRule splitRule0) {
        Intrinsics.checkNotNullParameter(splitRule0, "splitRule");
        return new b(splitRule0);
    }
}

