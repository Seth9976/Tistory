package androidx.webkit.internal;

import android.content.Context;
import android.content.res.Resources.NotFoundException;
import android.util.TypedValue;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.URLConnection;
import java.util.zip.GZIPInputStream;

public class AssetHelper {
    public static final String DEFAULT_MIME_TYPE = "text/plain";
    public final Context a;

    public AssetHelper(@NonNull Context context0) {
        this.a = context0;
    }

    @NonNull
    public static String getCanonicalDirPath(@NonNull File file0) throws IOException {
        String s = file0.getCanonicalPath();
        return s.endsWith("/") ? s : s + "/";
    }

    @Nullable
    public static File getCanonicalFileIfChild(@NonNull File file0, @NonNull String s) throws IOException {
        String s1 = AssetHelper.getCanonicalDirPath(file0);
        String s2 = new File(file0, s).getCanonicalPath();
        return s2.startsWith(s1) ? new File(s2) : null;
    }

    @NonNull
    public static File getDataDir(@NonNull Context context0) {
        return ApiHelperForN.getDataDir(context0);
    }

    @NonNull
    public static String guessMimeType(@NonNull String s) {
        String s1 = null;
        if(s != null) {
            String s2 = URLConnection.guessContentTypeFromName(s);
            if(s2 != null) {
                return s2 == null ? "text/plain" : s2;
            }
            int v = s.lastIndexOf(46);
            if(v != -1) {
                String s3 = s.substring(v + 1).toLowerCase();
                s3.getClass();
                switch(s3) {
                    case "apng": {
                        return "image/apng";
                    }
                    case "bmp": {
                        return "image/bmp";
                    }
                    case "css": {
                        return "text/css";
                    }
                    case "ehtml": {
                        return "text/html";
                    }
                    case "flac": {
                        return "audio/flac";
                    }
                    case "gif": {
                        return "image/gif";
                    }
                    case "gz": 
                    case "tgz": {
                        s1 = "application/gzip";
                        break;
                    }
                    case "htm": {
                        return "text/html";
                    }
                    case "html": {
                        return "text/html";
                    }
                    case "ico": {
                        return "image/x-icon";
                    }
                    case "jfif": {
                        return "image/jpeg";
                    }
                    case "jpeg": {
                        return "image/jpeg";
                    }
                    case "jpg": {
                        return "image/jpeg";
                    }
                    case "js": {
                        return "application/javascript";
                    }
                    case "json": {
                        return "application/json";
                    }
                    case "m4a": {
                        return "audio/x-m4a";
                    }
                    case "m4v": {
                        return "video/mp4";
                    }
                    case "mht": {
                        return "multipart/related";
                    }
                    case "mhtml": {
                        return "multipart/related";
                    }
                    case "mjs": {
                        return "application/javascript";
                    }
                    case "mp3": {
                        return "audio/mpeg";
                    }
                    case "mp4": {
                        return "video/mp4";
                    }
                    case "mpeg": {
                        return "video/mpeg";
                    }
                    case "mpg": {
                        return "video/mpeg";
                    }
                    case "oga": {
                        return "audio/ogg";
                    }
                    case "ogg": {
                        return "audio/ogg";
                    }
                    case "ogm": {
                        return "video/ogg";
                    }
                    case "ogv": {
                        return "video/ogg";
                    }
                    case "opus": {
                        return "audio/ogg";
                    }
                    case "pdf": {
                        return "application/pdf";
                    }
                    case "pjp": {
                        return "image/jpeg";
                    }
                    case "pjpeg": {
                        return "image/jpeg";
                    }
                    case "png": {
                        return "image/png";
                    }
                    case "shtm": {
                        return "text/html";
                    }
                    case "shtml": {
                        return "text/html";
                    }
                    case "svg": {
                        return "image/svg+xml";
                    }
                    case "svgz": {
                        return "image/svg+xml";
                    }
                    case "tif": {
                        return "image/tiff";
                    }
                    case "tiff": {
                        return "image/tiff";
                    }
                    case "wasm": {
                        return "application/wasm";
                    }
                    case "wav": {
                        return "audio/wav";
                    }
                    case "webm": {
                        return "video/webm";
                    }
                    case "webp": {
                        return "image/webp";
                    }
                    case "woff": {
                        return "application/font-woff";
                    }
                    case "xht": {
                        return "application/xhtml+xml";
                    }
                    case "xhtm": {
                        return "application/xhtml+xml";
                    }
                    case "xhtml": {
                        return "application/xhtml+xml";
                    }
                    case "xml": {
                        return "text/xml";
                    }
                    case "zip": {
                        return "application/zip";
                    }
                    default: {
                        return "text/plain";
                    }
                }
            }
        }
        return s1 == null ? "text/plain" : s1;
    }

    @NonNull
    public InputStream openAsset(@NonNull String s) throws IOException {
        if(s.length() > 1 && s.charAt(0) == 0x2F) {
            s = s.substring(1);
        }
        InputStream inputStream0 = this.a.getAssets().open(s, 2);
        return s.endsWith(".svgz") ? new GZIPInputStream(inputStream0) : inputStream0;
    }

    @NonNull
    public static InputStream openFile(@NonNull File file0) throws FileNotFoundException, IOException {
        InputStream inputStream0 = new FileInputStream(file0);
        return file0.getPath().endsWith(".svgz") ? new GZIPInputStream(inputStream0) : inputStream0;
    }

    @NonNull
    public InputStream openResource(@NonNull String s) throws Resources.NotFoundException, IOException {
        if(s.length() > 1 && s.charAt(0) == 0x2F) {
            s = s.substring(1);
        }
        String[] arr_s = s.split("/", -1);
        if(arr_s.length != 2) {
            throw new IllegalArgumentException("Incorrect resource path: " + s);
        }
        String s1 = arr_s[0];
        String s2 = arr_s[1];
        int v = s2.lastIndexOf(46);
        if(v != -1) {
            s2 = s2.substring(0, v);
        }
        Context context0 = this.a;
        int v1 = context0.getResources().getIdentifier(s2, s1, "net.daum.android.tistoryapp");
        TypedValue typedValue0 = new TypedValue();
        context0.getResources().getValue(v1, typedValue0, true);
        int v2 = typedValue0.type;
        if(v2 != 3) {
            throw new IOException(String.format("Expected %s resource to be of TYPE_STRING but was %d", s, v2));
        }
        InputStream inputStream0 = context0.getResources().openRawResource(v1);
        return s.endsWith(".svgz") ? new GZIPInputStream(inputStream0) : inputStream0;
    }
}

