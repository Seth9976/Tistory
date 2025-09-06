package n4;

import android.net.Uri;
import androidx.navigation.NavDeepLink;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class j extends Lambda implements Function0 {
    public final int w;
    public final NavDeepLink x;

    public j(NavDeepLink navDeepLink0, int v) {
        this.w = v;
        this.x = navDeepLink0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch(this.w) {
            case 0: {
                Pair pair0 = NavDeepLink.access$getFragArgsAndRegex(this.x);
                if(pair0 != null) {
                    List list0 = (List)pair0.getFirst();
                    if(list0 != null) {
                        return list0;
                    }
                }
                return new ArrayList();
            }
            case 1: {
                return NavDeepLink.access$parseFragment(this.x);
            }
            case 2: {
                String s = NavDeepLink.access$getFragRegex(this.x);
                return s != null ? Pattern.compile(s, 2) : null;
            }
            case 3: {
                Pair pair1 = NavDeepLink.access$getFragArgsAndRegex(this.x);
                return pair1 != null ? ((String)pair1.getSecond()) : null;
            }
            case 4: {
                return this.x.getUriPattern() == null || Uri.parse(this.x.getUriPattern()).getQuery() == null ? false : true;
            }
            case 5: {
                String s1 = this.x.n;
                return s1 != null ? Pattern.compile(s1) : null;
            }
            case 6: {
                String s2 = this.x.e;
                return s2 != null ? Pattern.compile(s2, 2) : null;
            }
            default: {
                return NavDeepLink.access$parseQuery(this.x);
            }
        }
    }
}

