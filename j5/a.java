package j5;

import android.app.Activity;
import android.content.Intent;
import androidx.window.embedding.ActivityFilter;
import java.util.Collection;
import java.util.Set;
import java.util.function.Predicate;
import kotlin.jvm.internal.Intrinsics;
import w9.b;

public final class a implements Predicate {
    public final int a;
    public final Object b;

    public a(Object object0, int v) {
        this.a = v;
        this.b = object0;
        super();
    }

    @Override
    public final boolean test(Object object0) {
        Object object1 = this.b;
        switch(this.a) {
            case 0: {
                Intrinsics.checkNotNullParameter(((Set)object1), "$activityFilters");
                if(!(((Set)object1) instanceof Collection) || !((Set)object1).isEmpty()) {
                    for(Object object2: ((Set)object1)) {
                        Intrinsics.checkNotNullExpressionValue(((Intent)object0), "intent");
                        if(((ActivityFilter)object2).matchesIntent(((Intent)object0))) {
                            return true;
                        }
                        if(false) {
                            break;
                        }
                    }
                }
                return false;
            }
            case 1: {
                Intrinsics.checkNotNullParameter(((Set)object1), "$activityFilters");
                if(!(((Set)object1) instanceof Collection) || !((Set)object1).isEmpty()) {
                    for(Object object3: ((Set)object1)) {
                        Intrinsics.checkNotNullExpressionValue(((Activity)object0), "activity");
                        if(((ActivityFilter)object3).matchesActivity(((Activity)object0))) {
                            return true;
                        }
                        if(false) {
                            break;
                        }
                    }
                }
                return false;
            }
            default: {
                Intrinsics.checkNotNullParameter(((b)object1), "$tmp0");
                return ((Boolean)((b)object1).invoke(object0)).booleanValue();
            }
        }
    }
}

