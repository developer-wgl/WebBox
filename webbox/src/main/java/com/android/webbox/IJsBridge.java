package com.android.webbox;

import androidx.annotation.NonNull;

import static android.util.Log.getStackTraceString;

public interface IJsBridge {

    interface ISendJsBridge {

        default void sendError(String tag, Throwable e) {
            sendError(tag, getStackTraceString(e));
        }

        void sendError(String tag, String e);
    }

    interface IAcceptJsBridge {
        @NonNull
        String getJavascriptInterfaceName();
    }
}