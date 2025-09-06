package j5;

import android.app.Activity;
import android.content.Intent;
import android.util.Pair;
import androidx.window.embedding.EmbeddingAdapter;
import androidx.window.embedding.SplitPairFilter;
import java.util.Collection;
import java.util.Set;
import java.util.function.Predicate;
import kotlin.jvm.internal.Intrinsics;

public final class c implements Predicate {
    public final int a;
    public final EmbeddingAdapter b;
    public final Set c;

    public c(EmbeddingAdapter embeddingAdapter0, Set set0, int v) {
        this.a = v;
        this.b = embeddingAdapter0;
        this.c = set0;
        super();
    }

    @Override
    public final boolean test(Object object0) {
        if(this.a != 0) {
            Intrinsics.checkNotNullParameter(this.b, "this$0");
            Intrinsics.checkNotNullParameter(this.c, "$splitPairFilters");
            Intrinsics.checkNotNullExpressionValue(((Pair)object0), "(first, second)");
            this.b.getClass();
            Intrinsics.checkNotNullParameter(((Pair)object0), "<this>");
            Activity activity0 = (Activity)((Pair)object0).first;
            Intrinsics.checkNotNullParameter(((Pair)object0), "<this>");
            Intent intent0 = (Intent)((Pair)object0).second;
            Iterable iterable0 = this.c;
            if(!(iterable0 instanceof Collection) || !((Collection)iterable0).isEmpty()) {
                for(Object object1: iterable0) {
                    if(((SplitPairFilter)object1).matchesActivityIntentPair(activity0, intent0)) {
                        return true;
                    }
                    if(false) {
                        break;
                    }
                }
            }
            return false;
        }
        Intrinsics.checkNotNullParameter(this.b, "this$0");
        Intrinsics.checkNotNullParameter(this.c, "$splitPairFilters");
        Intrinsics.checkNotNullExpressionValue(((Pair)object0), "(first, second)");
        this.b.getClass();
        Intrinsics.checkNotNullParameter(((Pair)object0), "<this>");
        Activity activity1 = (Activity)((Pair)object0).first;
        Intrinsics.checkNotNullParameter(((Pair)object0), "<this>");
        Activity activity2 = (Activity)((Pair)object0).second;
        Iterable iterable1 = this.c;
        if(!(iterable1 instanceof Collection) || !((Collection)iterable1).isEmpty()) {
            for(Object object2: iterable1) {
                if(((SplitPairFilter)object2).matchesActivityPair(activity1, activity2)) {
                    return true;
                }
                if(false) {
                    break;
                }
            }
        }
        return false;
    }
}

