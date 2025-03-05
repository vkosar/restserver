package ru.skornei.restserver;

import android.content.Context;

public final class Cache {

    private static Context context;

    private Cache() {
        throw new RuntimeException();
    }

    public static synchronized void initialize(Context context_) {
        context = context_;
    }

    public static Context getContext() {
        return context;
    }
}
