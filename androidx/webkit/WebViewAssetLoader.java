package androidx.webkit;

import android.content.Context;
import android.content.res.Resources.NotFoundException;
import android.net.Uri;
import android.util.Log;
import android.webkit.WebResourceResponse;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import androidx.core.util.Pair;
import androidx.webkit.internal.AssetHelper;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;

public final class WebViewAssetLoader {
    public static final class AssetsPathHandler implements PathHandler {
        public final AssetHelper a;

        public AssetsPathHandler(@NonNull Context context0) {
            this.a = new AssetHelper(context0);
        }

        @Override  // androidx.webkit.WebViewAssetLoader$PathHandler
        @Nullable
        @WorkerThread
        public WebResourceResponse handle(@NonNull String s) {
            try {
                InputStream inputStream0 = this.a.openAsset(s);
                return new WebResourceResponse(AssetHelper.guessMimeType(s), null, inputStream0);
            }
            catch(IOException iOException0) {
                Log.e("WebViewAssetLoader", "Error opening asset path: " + s, iOException0);
                return new WebResourceResponse(null, null, null);
            }
        }
    }

    public static final class Builder {
        public boolean a;
        public String b;
        public final ArrayList c;

        public Builder() {
            this.b = "appassets.androidplatform.net";
            this.c = new ArrayList();
        }

        @NonNull
        public Builder addPathHandler(@NonNull String s, @NonNull PathHandler webViewAssetLoader$PathHandler0) {
            Pair pair0 = Pair.create(s, webViewAssetLoader$PathHandler0);
            this.c.add(pair0);
            return this;
        }

        @NonNull
        public WebViewAssetLoader build() {
            ArrayList arrayList0 = new ArrayList();
            for(Object object0: this.c) {
                arrayList0.add(new a(this.b, ((String)((Pair)object0).first), this.a, ((PathHandler)((Pair)object0).second)));
            }
            return new WebViewAssetLoader(arrayList0);
        }

        @NonNull
        public Builder setDomain(@NonNull String s) {
            this.b = s;
            return this;
        }

        @NonNull
        public Builder setHttpAllowed(boolean z) {
            this.a = z;
            return this;
        }
    }

    public static final class InternalStoragePathHandler implements PathHandler {
        public final File a;
        public static final String[] b;

        static {
            InternalStoragePathHandler.b = new String[]{"app_webview/", "databases/", "lib/", "shared_prefs/", "code_cache/"};
        }

        public InternalStoragePathHandler(@NonNull Context context0, @NonNull File file0) {
            try {
                this.a = new File(AssetHelper.getCanonicalDirPath(file0));
                if(!this.a(context0)) {
                    throw new IllegalArgumentException("The given directory \"" + file0 + "\" doesn\'t exist under an allowed app internal storage directory");
                }
            }
            catch(IOException iOException0) {
                throw new IllegalArgumentException("Failed to resolve the canonical path for the given directory: " + file0.getPath(), iOException0);
            }
        }

        public final boolean a(Context context0) {
            String s = AssetHelper.getCanonicalDirPath(this.a);
            String s1 = AssetHelper.getCanonicalDirPath(context0.getCacheDir());
            String s2 = AssetHelper.getCanonicalDirPath(AssetHelper.getDataDir(context0));
            if(!s.startsWith(s1) && !s.startsWith(s2)) {
                return false;
            }
            if(!s.equals(s1) && !s.equals(s2)) {
                String[] arr_s = InternalStoragePathHandler.b;
                for(int v = 0; v < 5; ++v) {
                    if(s.startsWith(s2 + arr_s[v])) {
                        return false;
                    }
                }
                return true;
            }
            return false;
        }

        @Override  // androidx.webkit.WebViewAssetLoader$PathHandler
        @NonNull
        @WorkerThread
        public WebResourceResponse handle(@NonNull String s) {
            try {
                File file0 = this.a;
                File file1 = AssetHelper.getCanonicalFileIfChild(file0, s);
                if(file1 != null) {
                    InputStream inputStream0 = AssetHelper.openFile(file1);
                    return new WebResourceResponse(AssetHelper.guessMimeType(s), null, inputStream0);
                }
                Log.e("WebViewAssetLoader", String.format("The requested file: %s is outside the mounted directory: %s", s, file0));
                return new WebResourceResponse(null, null, null);
            }
            catch(IOException iOException0) {
            }
            Log.e("WebViewAssetLoader", "Error opening the requested path: " + s, iOException0);
            return new WebResourceResponse(null, null, null);
        }
    }

    public interface PathHandler {
        @Nullable
        @WorkerThread
        WebResourceResponse handle(@NonNull String arg1);
    }

    public static final class ResourcesPathHandler implements PathHandler {
        public final AssetHelper a;

        public ResourcesPathHandler(@NonNull Context context0) {
            this.a = new AssetHelper(context0);
        }

        @Override  // androidx.webkit.WebViewAssetLoader$PathHandler
        @Nullable
        @WorkerThread
        public WebResourceResponse handle(@NonNull String s) {
            try {
                InputStream inputStream0 = this.a.openResource(s);
                return new WebResourceResponse(AssetHelper.guessMimeType(s), null, inputStream0);
            }
            catch(Resources.NotFoundException resources$NotFoundException0) {
                Log.e("WebViewAssetLoader", "Resource not found from the path: " + s, resources$NotFoundException0);
                return new WebResourceResponse(null, null, null);
            }
            catch(IOException iOException0) {
                Log.e("WebViewAssetLoader", "Error opening resource from the path: " + s, iOException0);
                return new WebResourceResponse(null, null, null);
            }
        }
    }

    public static final String DEFAULT_DOMAIN = "appassets.androidplatform.net";
    public final ArrayList a;

    public WebViewAssetLoader(ArrayList arrayList0) {
        this.a = arrayList0;
    }

    @Nullable
    @WorkerThread
    public WebResourceResponse shouldInterceptRequest(@NonNull Uri uri0) {
        WebResourceResponse webResourceResponse0;
        Iterator iterator0 = this.a.iterator();
    alab1:
        while(true) {
            do {
                PathHandler webViewAssetLoader$PathHandler0 = null;
                if(!iterator0.hasNext()) {
                    break alab1;
                }
                Object object0 = iterator0.next();
                a a0 = (a)object0;
                a0.getClass();
                boolean z = uri0.getScheme().equals("http");
                String s = a0.c;
                if((!z || a0.a) && (uri0.getScheme().equals("http") || uri0.getScheme().equals("https")) && uri0.getAuthority().equals(a0.b) && uri0.getPath().startsWith(s)) {
                    webViewAssetLoader$PathHandler0 = a0.d;
                }
                if(webViewAssetLoader$PathHandler0 == null) {
                    continue alab1;
                }
                webResourceResponse0 = webViewAssetLoader$PathHandler0.handle(uri0.getPath().replaceFirst(s, ""));
            }
            while(webResourceResponse0 == null);
            return webResourceResponse0;
        }
        return null;
    }
}

