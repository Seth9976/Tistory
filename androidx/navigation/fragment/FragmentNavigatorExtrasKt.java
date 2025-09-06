package androidx.navigation.fragment;

import android.view.View;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001C\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0002\b\u0002\u001A7\u0010\u0000\u001A\u00020\u00012*\u0010\u0002\u001A\u0016\u0012\u0012\b\u0001\u0012\u000E\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00040\u0003\"\u000E\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\u0010\u0007¨\u0006\b"}, d2 = {"FragmentNavigatorExtras", "Landroidx/navigation/fragment/FragmentNavigator$Extras;", "sharedElements", "", "Lkotlin/Pair;", "Landroid/view/View;", "", "([Lkotlin/Pair;)Landroidx/navigation/fragment/FragmentNavigator$Extras;", "navigation-fragment_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nFragmentNavigatorExtras.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FragmentNavigatorExtras.kt\nandroidx/navigation/fragment/FragmentNavigatorExtrasKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,34:1\n1#2:35\n13309#3,2:36\n*S KotlinDebug\n*F\n+ 1 FragmentNavigatorExtras.kt\nandroidx/navigation/fragment/FragmentNavigatorExtrasKt\n*L\n32#1:36,2\n*E\n"})
public final class FragmentNavigatorExtrasKt {
    @NotNull
    public static final Extras FragmentNavigatorExtras(@NotNull Pair[] arr_pair) {
        Intrinsics.checkNotNullParameter(arr_pair, "sharedElements");
        Builder fragmentNavigator$Extras$Builder0 = new Builder();
        for(int v = 0; v < arr_pair.length; ++v) {
            Pair pair0 = arr_pair[v];
            fragmentNavigator$Extras$Builder0.addSharedElement(((View)pair0.component1()), ((String)pair0.component2()));
        }
        return fragmentNavigator$Extras$Builder0.build();
    }
}

