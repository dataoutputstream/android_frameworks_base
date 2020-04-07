 package com.android.internal.os;
 
 import android.view.KeyEvent;
public interface DeviceKeyHandler2 {

    /**
     * Invoked when an unknown key was detected by the system, letting the device handle
     * this special keys prior to pass the key to the active app.
     *
     * @param event The key event to be handled
     * @return null if event is consumed, KeyEvent to be handled otherwise
     */
    public KeyEvent handleKeyEvent(KeyEvent event);
    
    }
