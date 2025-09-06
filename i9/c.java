package i9;

import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager.OnBackStackChangedListener;
import androidx.fragment.app.FragmentManager;
import com.kakao.android.base.utils.Logger;
import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.internal.Intrinsics;

public final class c implements OnBackStackChangedListener {
    public final FragmentManager a;

    public c(FragmentManager fragmentManager0) {
        this.a = fragmentManager0;
    }

    @Override  // androidx.fragment.app.FragmentManager$OnBackStackChangedListener
    public final void onBackStackChanged() {
        Object object0 = null;
        FragmentManager fragmentManager0 = this.a;
        Intrinsics.checkNotNullParameter(fragmentManager0, "$this_with");
        List list0 = fragmentManager0.getFragments();
        Intrinsics.checkNotNullExpressionValue(list0, "getFragments(...)");
        ListIterator listIterator0 = list0.listIterator(list0.size());
        while(listIterator0.hasPrevious()) {
            Object object1 = listIterator0.previous();
            if(((Fragment)object1).getView() != null) {
                object0 = object1;
                break;
            }
        }
        Logger.INSTANCE.log("addOnBackStackChangedListener() lastFragment=" + ((Fragment)object0));
        List list1 = fragmentManager0.getFragments();
        Intrinsics.checkNotNullExpressionValue(list1, "getFragments(...)");
        for(Object object2: list1) {
            Fragment fragment0 = (Fragment)object2;
            View view0 = fragment0.getView();
            if(view0 != null) {
                view0.setImportantForAccessibility((Intrinsics.areEqual(fragment0, ((Fragment)object0)) ? 1 : 4));
            }
        }
    }
}

