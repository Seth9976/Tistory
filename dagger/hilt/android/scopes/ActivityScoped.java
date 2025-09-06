package dagger.hilt.android.scopes;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import javax.inject.Scope;

@Retention(RetentionPolicy.CLASS)
@Scope
public @interface ActivityScoped {
}

