package androidx.core.content;

import android.content.SharedPreferences.Editor;
import androidx.annotation.NonNull;

@Deprecated
public final class SharedPreferencesCompat {
    @Deprecated
    public static final class EditorCompat {
        public final s a;
        public static EditorCompat b;

        public EditorCompat() {
            this.a = new s();  // 初始化器: Ljava/lang/Object;-><init>()V
        }

        @Deprecated
        public void apply(@NonNull SharedPreferences.Editor sharedPreferences$Editor0) {
            this.a.getClass();
            try {
                sharedPreferences$Editor0.apply();
            }
            catch(AbstractMethodError unused_ex) {
                sharedPreferences$Editor0.commit();
            }
        }

        @Deprecated
        public static EditorCompat getInstance() {
            if(EditorCompat.b == null) {
                EditorCompat.b = new EditorCompat();
            }
            return EditorCompat.b;
        }
    }

}

