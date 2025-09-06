package androidx.profileinstaller;

import android.util.Log;

public final class c implements DiagnosticsCallback {
    @Override  // androidx.profileinstaller.ProfileInstaller$DiagnosticsCallback
    public final void onDiagnosticReceived(int v, Object object0) {
        String s;
        switch(v) {
            case 1: {
                s = "DIAGNOSTIC_CURRENT_PROFILE_EXISTS";
                break;
            }
            case 2: {
                s = "DIAGNOSTIC_CURRENT_PROFILE_DOES_NOT_EXIST";
                break;
            }
            case 3: {
                s = "DIAGNOSTIC_REF_PROFILE_EXISTS";
                break;
            }
            case 4: {
                s = "DIAGNOSTIC_REF_PROFILE_DOES_NOT_EXIST";
                break;
            }
            case 5: {
                s = "DIAGNOSTIC_PROFILE_IS_COMPRESSED";
                break;
            }
            default: {
                s = "";
            }
        }
        Log.d("ProfileInstaller", s);
    }

    @Override  // androidx.profileinstaller.ProfileInstaller$DiagnosticsCallback
    public final void onResultReceived(int v, Object object0) {
        String s;
        switch(v) {
            case 1: {
                s = "RESULT_INSTALL_SUCCESS";
                break;
            }
            case 2: {
                s = "RESULT_ALREADY_INSTALLED";
                break;
            }
            case 3: {
                s = "RESULT_UNSUPPORTED_ART_VERSION";
                break;
            }
            case 4: {
                s = "RESULT_NOT_WRITABLE";
                break;
            }
            case 5: {
                s = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                break;
            }
            case 6: {
                s = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                break;
            }
            case 7: {
                s = "RESULT_IO_EXCEPTION";
                break;
            }
            case 8: {
                s = "RESULT_PARSE_EXCEPTION";
                break;
            }
            case 10: {
                s = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                break;
            }
            case 11: {
                s = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                break;
            }
            default: {
                s = "";
            }
        }
        if(v != 6 && v != 7 && v != 8) {
            Log.d("ProfileInstaller", s);
            return;
        }
        Log.e("ProfileInstaller", s, ((Throwable)object0));
    }
}

