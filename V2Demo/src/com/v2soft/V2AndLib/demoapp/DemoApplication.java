package com.v2soft.V2AndLib.demoapp;

import com.v2soft.AndLib.application.BaseApplication;

/**
 * Demo application class
 * @author vshcryabets@gmail.com
 *
 */
public class DemoApplication extends BaseApplication<DemoAppSettings> {
    @Override
    protected DemoAppSettings createApplicationSettings() {
        // TODO Auto-generated method stub
        return new DemoAppSettings(this);
    }

}