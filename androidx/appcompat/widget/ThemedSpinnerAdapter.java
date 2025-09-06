package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources.Theme;
import android.view.LayoutInflater;
import android.widget.SpinnerAdapter;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.view.ContextThemeWrapper;

public interface ThemedSpinnerAdapter extends SpinnerAdapter {
    public static final class Helper {
        public final Context a;
        public final LayoutInflater b;
        public LayoutInflater c;

        public Helper(@NonNull Context context0) {
            this.a = context0;
            this.b = LayoutInflater.from(context0);
        }

        @NonNull
        public LayoutInflater getDropDownViewInflater() {
            return this.c == null ? this.b : this.c;
        }

        @Nullable
        public Resources.Theme getDropDownViewTheme() {
            return this.c == null ? null : this.c.getContext().getTheme();
        }

        public void setDropDownViewTheme(@Nullable Resources.Theme resources$Theme0) {
            if(resources$Theme0 == null) {
                this.c = null;
                return;
            }
            Context context0 = this.a;
            if(resources$Theme0.equals(context0.getTheme())) {
                this.c = this.b;
                return;
            }
            this.c = LayoutInflater.from(new ContextThemeWrapper(context0, resources$Theme0));
        }
    }

    @Nullable
    Resources.Theme getDropDownViewTheme();

    void setDropDownViewTheme(@Nullable Resources.Theme arg1);
}

