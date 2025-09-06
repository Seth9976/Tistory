package dagger.hilt.android.internal.modules;

import android.app.Activity;
import androidx.fragment.app.FragmentActivity;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@DaggerGenerated
@QualifierMetadata
@ScopeMetadata("dagger.Reusable")
public final class ActivityModule_ProvideFragmentActivityFactory implements Factory {
    public final Provider a;

    public ActivityModule_ProvideFragmentActivityFactory(Provider provider0) {
        this.a = provider0;
    }

    public static ActivityModule_ProvideFragmentActivityFactory create(Provider provider0) {
        return new ActivityModule_ProvideFragmentActivityFactory(provider0);
    }

    public FragmentActivity get() {
        return ActivityModule_ProvideFragmentActivityFactory.provideFragmentActivity(((Activity)this.a.get()));
    }

    @Override  // javax.inject.Provider
    public Object get() {
        return this.get();
    }

    public static FragmentActivity provideFragmentActivity(Activity activity0) {
        try {
            return (FragmentActivity)Preconditions.checkNotNullFromProvides(((FragmentActivity)activity0));
        }
        catch(ClassCastException classCastException0) {
            throw new IllegalStateException("Expected activity to be a FragmentActivity: " + activity0, classCastException0);
        }
    }
}

