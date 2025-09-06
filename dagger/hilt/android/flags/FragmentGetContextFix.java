package dagger.hilt.android.flags;

import android.content.Context;
import dagger.hilt.EntryPoint;
import dagger.hilt.InstallIn;
import dagger.hilt.android.EntryPointAccessors;
import dagger.hilt.components.SingletonComponent;
import dagger.hilt.internal.Preconditions;
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;
import java.util.Set;
import javax.inject.Qualifier;

public final class FragmentGetContextFix {
    @Target({ElementType.METHOD, ElementType.PARAMETER, ElementType.FIELD})
    @Qualifier
    public @interface DisableFragmentGetContextFix {
    }

    @EntryPoint
    @InstallIn({SingletonComponent.class})
    public interface FragmentGetContextFixEntryPoint {
        @DisableFragmentGetContextFix
        Set getDisableFragmentGetContextFix();
    }

    public static boolean isFragmentGetContextFixDisabled(Context context0) {
        Set set0 = ((FragmentGetContextFixEntryPoint)EntryPointAccessors.fromApplication(context0, FragmentGetContextFixEntryPoint.class)).getDisableFragmentGetContextFix();
        Preconditions.checkState(set0.size() <= 1, "Cannot bind the flag @DisableFragmentGetContextFix more than once.", new Object[0]);
        if(set0.isEmpty()) {
            return true;
        }
        Object object0 = set0.iterator().next();
        return ((Boolean)object0).booleanValue();
    }
}

